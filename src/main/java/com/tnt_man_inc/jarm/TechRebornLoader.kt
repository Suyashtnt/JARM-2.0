package com.tnt_man_inc.jarm

import com.tnt_man_inc.jarm.items_and_blocks.other
import net.minecraft.fluid.Fluid
import techreborn.api.generator.EFluidGenerator
import techreborn.api.generator.GeneratorRecipeHelper


object TechRebornLoader {


    val LOAD_RUBY_LIQUID = register(EFluidGenerator.THERMAL, other.STILL_RUBY_LIQUID, 60)

    fun init() {}

    fun register(generator: EFluidGenerator?, fluid: Fluid?, euPerMB: Int) {
        GeneratorRecipeHelper.registerFluidRecipe(generator, fluid, euPerMB)
    }
}