package com.tnt_man_inc.jarm

import com.tnt_man_inc.jarm.items_and_blocks.other
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback
import net.fabricmc.fabric.api.resource.ResourceManagerHelper
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener
import net.minecraft.client.MinecraftClient
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.entity.EntityRenderDispatcher
import net.minecraft.client.render.entity.ZombieEntityRenderer
import net.minecraft.client.texture.Sprite
import net.minecraft.client.texture.SpriteAtlasTexture
import net.minecraft.fluid.Fluid
import net.minecraft.fluid.FluidState
import net.minecraft.resource.ResourceManager
import net.minecraft.resource.ResourceType
import net.minecraft.util.Identifier
import net.minecraft.util.math.BlockPos
import net.minecraft.util.registry.Registry
import net.minecraft.world.BlockRenderView

@Environment(EnvType.CLIENT)
class ClientInit : ClientModInitializer {
    override fun onInitializeClient() {

        setupFluidRendering(other.STILL_RUBY_LIQUID, other.FLOWING_RUBY_LIQUID, Identifier("minecraft", "water"), 0xD71818)
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), other.STILL_RUBY_LIQUID, other.FLOWING_RUBY_LIQUID)


        /*
         * Registers our Cube Entity's renderer, which provides a model and texture for the entity.
         *
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */
        EntityRendererRegistry.INSTANCE.register(Main.RUBY_GUARDIAN) { dispatcher: EntityRenderDispatcher?, _: EntityRendererRegistry.Context? -> object : ZombieEntityRenderer(dispatcher) {} }
    }

    private fun setupFluidRendering(still: Fluid, flowing: Fluid, textureFluidId: Identifier, color: Int) {
        val stillSpriteId = Identifier(textureFluidId.namespace, "block/" + textureFluidId.path.toString() + "_still")
        val flowingSpriteId = Identifier(textureFluidId.namespace, "block/" + textureFluidId.path.toString() + "_flow")


        // If they're not already present, add the sprites to the block atlas

        // If they're not already present, add the sprites to the block atlas
        ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEX).register(ClientSpriteRegistryCallback { atlasTexture: SpriteAtlasTexture?, registry: ClientSpriteRegistryCallback.Registry ->
            registry.register(stillSpriteId)
            registry.register(flowingSpriteId)
        })

        val fluidId = Registry.FLUID.getId(still)
        val listenerId = Identifier(fluidId.namespace, fluidId.path + "_reload_listener")

        val fluidSprites = arrayOf<Sprite?>(null, null)

        ResourceManagerHelper.get(ResourceType.CLIENT_RESOURCES).registerReloadListener(object : SimpleSynchronousResourceReloadListener {
            override fun getFabricId(): Identifier {
                return listenerId
            }

            /**
             * Get the sprites from the block atlas when resources are reloaded
             */
            override fun apply(resourceManager: ResourceManager) {
                val atlas = MinecraftClient.getInstance().getSpriteAtlas(SpriteAtlasTexture.BLOCK_ATLAS_TEX)
                fluidSprites[0] = atlas.apply(stillSpriteId)
                fluidSprites[1] = atlas.apply(flowingSpriteId)
            }
        })


        // The FluidRenderer gets the sprites and color from a FluidRenderHandler during rendering

        // The FluidRenderer gets the sprites and color from a FluidRenderHandler during rendering

        // The FluidRenderer gets the sprites and color from a FluidRenderHandler during rendering
        val renderHandler: FluidRenderHandler = object : FluidRenderHandler {
            override fun getFluidSprites(view: BlockRenderView, pos: BlockPos, state: FluidState): Array<Sprite?> {
                return fluidSprites
            }

            override fun getFluidColor(view: BlockRenderView, pos: BlockPos, state: FluidState): Int {
                return color
            }
        }

        FluidRenderHandlerRegistry.INSTANCE.register(still, renderHandler);
        FluidRenderHandlerRegistry.INSTANCE.register(flowing, renderHandler);
    }
}