package com.tnt_man_inc.jarm

import com.tnt_man_inc.jarm.Mobs.Renderers.RubyGuardianRenderer
import com.tnt_man_inc.jarm.Mobs.RubyGuardian
import com.tnt_man_inc.jarm.WorldGenAndDimensions.BiomeRegister
import com.tnt_man_inc.jarm.WorldGenAndDimensions.RubyBiome
import com.tnt_man_inc.jarm.items_and_blocks.Blocks
import com.tnt_man_inc.jarm.items_and_blocks.Items
import com.tnt_man_inc.jarm.items_and_blocks.armor.ruby_armor.RubyArmor
import com.tnt_man_inc.jarm.items_and_blocks.armor.strong_diamond_armor.StrongDiamondArmor
import com.tnt_man_inc.jarm.items_and_blocks.tools.ruby_tools.RubyTools
import com.tnt_man_inc.jarm.items_and_blocks.tools.strong_diamond_tools.StrongDiamondTools
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricDefaultAttributeRegistry
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricEntityTypeBuilder
import net.fabricmc.fabric.api.biomes.v1.FabricBiomes
import net.fabricmc.fabric.api.biomes.v1.OverworldBiomes
import net.fabricmc.fabric.api.biomes.v1.OverworldClimate
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
import net.minecraft.client.render.entity.EntityRenderDispatcher
import net.minecraft.entity.EntityType
import net.minecraft.entity.SpawnGroup
import net.minecraft.entity.mob.HostileEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.SpawnEggItem
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.World
import net.minecraft.world.biome.Biome
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.decorator.Decorator
import net.minecraft.world.gen.decorator.RangeDecoratorConfig
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeatureConfig
import java.util.function.Consumer

class Main : ModInitializer {
    fun handleBiomes(biome: Biome) {
        if (biome.category != Biome.Category.NETHER && biome.category != Biome.Category.THEEND) {
            biome.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, Blocks.RUBY_ORE.defaultState, 8 // Ore
                    // vein
                    // size
            )).createDecoratedFeature(Decorator.COUNT_RANGE.configure(RangeDecoratorConfig(1,  // Number of veins per
                    // chunk
                    0, 1, 18))))
            (biome as? RubyBiome)?.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, Feature.ORE.configure(OreFeatureConfig(OreFeatureConfig.Target.NATURAL_STONE, Blocks.SPECIAL_RUBY_ORE.defaultState, 8 // Ore
                    // vein
                    // size
            )).createDecoratedFeature(Decorator.COUNT_RANGE.configure(RangeDecoratorConfig(1,  // Number of veins per
                    // chunk
                    0,
                    1,
                    18
            ))))
        }
    }

    override fun onInitialize() {
        //register custom biomes and set them to be able to spawn in
        OverworldBiomes.addContinentalBiome(BiomeRegister.RUBY_BIOME, OverworldClimate.TEMPERATE, 2.0)
        FabricBiomes.addSpawnBiome(BiomeRegister.RUBY_BIOME)

        // Loop over existing biomes
        Registry.BIOME.forEach(Consumer { biome: Biome -> handleBiomes(biome) })

        // Listen for other biomes being registered
        RegistryEntryAddedCallback.event(Registry.BIOME).register(RegistryEntryAddedCallback { i: Int, identifier: Identifier?, biome: Biome -> handleBiomes(biome) })

        //inits items and blocks
        Registry.register(Registry.ITEM, Identifier("jarm", "menu"), RUBY_ICON)
        Items.init()
        Blocks.init()

        //init tools
        RubyTools.init()
        StrongDiamondTools.init()

        //init armor
        RubyArmor.init()
        StrongDiamondArmor.init()

        //registers Ruby Guardian and spawn egg
        FabricDefaultAttributeRegistry.register(RUBY_GUARDIAN, HostileEntity.createHostileAttributes())
        Registry.register(Registry.ITEM, Identifier("jarm", "ruby_guardian_spawn_egg"), SpawnEggItem(RUBY_GUARDIAN, 0xC41F1F, 0xC41F72, Utils.ITEM_SETTINGS))
        //registers it's renderer
        EntityRendererRegistry.INSTANCE.register(RUBY_GUARDIAN) { dispatcher: EntityRenderDispatcher?, context: EntityRendererRegistry.Context? -> RubyGuardianRenderer(dispatcher) }
    }

    companion object {
        val RUBY_ICON = Item(Item.Settings().group(null))

        @JvmField
        val JARM_GROUP = FabricItemGroupBuilder.build(Identifier("jarm", "general")
        ) { ItemStack(RUBY_ICON) }

        @JvmField
        val RUBY_GUARDIAN = Registry.register(
                Registry.ENTITY_TYPE,
                Identifier("jarm", "ruby_guardian"),
                FabricEntityTypeBuilder.create(SpawnGroup.MONSTER) { entityType: EntityType<RubyGuardian?>?, world: World? -> RubyGuardian(entityType, world) }.dimensions(EntityType.ZOMBIE.dimensions).build()
        )
    }
}