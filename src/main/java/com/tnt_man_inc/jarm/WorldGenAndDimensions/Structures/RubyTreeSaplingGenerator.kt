package com.tnt_man_inc.jarm.WorldGenAndDimensions.Structures

import net.minecraft.block.sapling.SaplingGenerator
import net.minecraft.world.gen.feature.ConfiguredFeature
import net.minecraft.world.gen.feature.TreeFeatureConfig
import java.util.*

class RubyTreeSaplingGenerator : SaplingGenerator() {
    override fun createTreeFeature(random: Random, bl: Boolean): ConfiguredFeature<TreeFeatureConfig, *>? {
        return null
    }


}