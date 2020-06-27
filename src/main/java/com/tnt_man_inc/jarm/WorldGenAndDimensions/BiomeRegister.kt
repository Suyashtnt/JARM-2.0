package com.tnt_man_inc.jarm.WorldGenAndDimensions

import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import net.minecraft.world.biome.Biome

object BiomeRegister {
    val RUBY_BIOME: Biome = Registry.register(Registry.BIOME, Identifier("jarm", "ruby_biome"), RubyBiome())
}