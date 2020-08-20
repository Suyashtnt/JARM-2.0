package com.tnt_man_inc.jarm.items_and_blocks

import com.tnt_man_inc.jarm.Utils.id
import com.tnt_man_inc.jarm.items_and_blocks.fluids.RubyLiquid
import net.minecraft.util.registry.Registry
import net.minecraft.world.gen.feature.LakeFeature
import net.minecraft.world.gen.feature.SingleStateFeatureConfig

/**
 * Random Stuff that needs to be registered
 */
object other {


    @kotlin.jvm.JvmField
    val STILL_RUBY_LIQUID: RubyLiquid.Still = Registry.register(Registry.FLUID, id("ruby_liquid"), RubyLiquid.Still())

    @kotlin.jvm.JvmField
    val FLOWING_RUBY_LIQUID: RubyLiquid.Flowing = Registry.register(Registry.FLUID, id("flowing_ruby_liquid"), RubyLiquid.Flowing())

    @kotlin.jvm.JvmField
    val RUBY_LIQUID_LAKE: LakeFeature = Registry.register(Registry.FEATURE, id("ruby_liquid_lake"), LakeFeature(SingleStateFeatureConfig.CODEC))


}
