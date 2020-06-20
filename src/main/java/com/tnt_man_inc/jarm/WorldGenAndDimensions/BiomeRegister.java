package com.tnt_man_inc.jarm.WorldGenAndDimensions;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class BiomeRegister {
    public static final Biome RUBY_BIOME = Registry.register(Registry.BIOME, new Identifier("jarm", "ruby_biome"), new RubyBiome());
}
