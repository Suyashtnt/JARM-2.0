package com.tnt_man_inc.jarm.items_and_blocks.custom_block_types;

import com.tnt_man_inc.jarm.items_and_blocks.Blocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class RubyOre extends Block {

    public RubyOre() {
        super(FabricBlockSettings.of(Material.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 3)
                .strength(3, 3.0f).sounds(BlockSoundGroup.STONE));

    }



}