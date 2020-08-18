package com.tnt_man_inc.jarm.WorldGenAndDimensions

import com.tnt_man_inc.jarm.Utils
import com.tnt_man_inc.jarm.WorldGenAndDimensions.Structures.RubyTreeDecorator
import com.tnt_man_inc.jarm.WorldGenAndDimensions.Structures.RubyTreeFeature
import com.tnt_man_inc.jarm.items_and_blocks.Blocks
import com.tnt_man_inc.jarm.items_and_blocks.other
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.entity.EntityType
import net.minecraft.entity.SpawnGroup
import net.minecraft.sound.BiomeMoodSound
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome
import net.minecraft.world.biome.BiomeEffects
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig
import net.minecraft.world.gen.decorator.Decorator
import net.minecraft.world.gen.feature.DefaultBiomeFeatures
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.SingleStateFeatureConfig
import net.minecraft.world.gen.feature.TreeFeatureConfig
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder
import net.minecraft.world.gen.trunk.StraightTrunkPlacer

class RubyBiome internal constructor() : Biome(Settings().configureSurfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_CONFIG)
        .precipitation(Precipitation.RAIN).category(Category.PLAINS).depth(0.24f).scale(0.2f)
        .temperature(0.6f).downfall(0.7f).effects(BiomeEffects.Builder().waterColor(14489110).waterFogColor(14489110).fogColor(14489110).moodSound(BiomeMoodSound.CAVE).build()).parent(null)) {

    var RUBY_TREE_FEATURE: Feature<TreeFeatureConfig>? = Registry.register(Registry.FEATURE, Utils.id("ruby_tree"), RubyTreeFeature(TreeFeatureConfig.CODEC))
    var RUBY_TREE_DECORATOR: RubyTreeDecorator? = Registry.register(Registry.DECORATOR, Utils.id("ruby_tree"), RubyTreeDecorator(ChanceDecoratorConfig.field_24980))
    val logProvider: WeightedBlockStateProvider = WeightedBlockStateProvider()
            .addState(Blocks.RUBY_WOOD.defaultState, 10)
    var RUBY_TREE_CONFIG: TreeFeatureConfig? = TreeFeatureConfig.Builder(
            logProvider,
            SimpleBlockStateProvider(Blocks.RUBY_LEAVES.defaultState),
            RubyTreeFeature.FoliagePlacer(2, 0, 0, 0, 3),
            StraightTrunkPlacer(6, 3, 0),
            TwoLayersFeatureSize(1, 0, 1)
    ).build()


    @Environment(EnvType.CLIENT)
    override fun getGrassColorAt(x: Double, z: Double): Int {
        return 0xC41F1F
    }

    @Environment(EnvType.CLIENT)
    override fun getFoliageColor(): Int {
        return 0xC41F1F
    }

    init {
        DefaultBiomeFeatures.addLandCarvers(this)
        addFeature(GenerationStep.Feature.VEGETAL_DECORATION,
                RUBY_TREE_FEATURE?.configure(RUBY_TREE_CONFIG)
                        ?.createDecoratedFeature(RUBY_TREE_DECORATOR
                                ?.configure(ChanceDecoratorConfig(75))
                        )
        )
        addFeature(GenerationStep.Feature.LOCAL_MODIFICATIONS, other.RUBY_LIQUID_LAKE.configure(SingleStateFeatureConfig(Blocks.RUBY_LIQUID.defaultState)).createDecoratedFeature(Decorator.WATER_LAKE.configure(ChanceDecoratorConfig(40))))
        DefaultBiomeFeatures.addDungeons(this)
        DefaultBiomeFeatures.addExtraMountainTrees(this)
        DefaultBiomeFeatures.addDefaultFlowers(this)
        DefaultBiomeFeatures.addDefaultGrass(this)
        DefaultBiomeFeatures.addMineables(this)
        DefaultBiomeFeatures.addDefaultOres(this)
        DefaultBiomeFeatures.addDefaultDisks(this)
        DefaultBiomeFeatures.addDefaultVegetation(this)
        DefaultBiomeFeatures.addSprings(this)
        DefaultBiomeFeatures.addFrozenTopLayer(this)
        addSpawn(SpawnGroup.CREATURE, SpawnEntry(EntityType.SHEEP, 12, 4, 4))
        addSpawn(SpawnGroup.CREATURE, SpawnEntry(EntityType.PIG, 10, 4, 4))
        addSpawn(SpawnGroup.CREATURE, SpawnEntry(EntityType.CHICKEN, 10, 4, 4))
        addSpawn(SpawnGroup.CREATURE, SpawnEntry(EntityType.COW, 8, 4, 4))
        addSpawn(SpawnGroup.AMBIENT, SpawnEntry(EntityType.BAT, 10, 8, 8))
        addSpawn(SpawnGroup.MONSTER, SpawnEntry(EntityType.SPIDER, 100, 4, 4))
        addSpawn(SpawnGroup.MONSTER, SpawnEntry(EntityType.ZOMBIE, 95, 4, 4))
        addSpawn(SpawnGroup.MONSTER, SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1))
        addSpawn(SpawnGroup.MONSTER, SpawnEntry(EntityType.SKELETON, 100, 4, 4))
        addSpawn(SpawnGroup.MONSTER, SpawnEntry(EntityType.CREEPER, 100, 4, 4))
        addSpawn(SpawnGroup.MONSTER, SpawnEntry(EntityType.SLIME, 100, 4, 4))
        addSpawn(SpawnGroup.MONSTER, SpawnEntry(EntityType.ENDERMAN, 10, 1, 4))
        addSpawn(SpawnGroup.MONSTER, SpawnEntry(EntityType.WITCH, 5, 1, 1))
    }
}