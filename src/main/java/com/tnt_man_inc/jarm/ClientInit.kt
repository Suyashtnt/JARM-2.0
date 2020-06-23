package com.tnt_man_inc.jarm

import net.fabricmc.api.ClientModInitializer
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry
import net.minecraft.client.render.entity.EntityRenderDispatcher
import net.minecraft.client.render.entity.ZombieEntityRenderer

@Environment(EnvType.CLIENT)
class ClientInit : ClientModInitializer {
    override fun onInitializeClient() {
        /*
         * Registers our Cube Entity's renderer, which provides a model and texture for the entity.
         *
         * Entity Renderers can also manipulate the model before it renders based on entity context (EndermanEntityRenderer#render).
         */
        EntityRendererRegistry.INSTANCE.register(Main.RUBY_GUARDIAN) { dispatcher: EntityRenderDispatcher?, _: EntityRendererRegistry.Context? -> object : ZombieEntityRenderer(dispatcher) {} }
    }
}