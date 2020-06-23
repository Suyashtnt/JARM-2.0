package com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_block_types

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags
import net.minecraft.block.Block
import net.minecraft.block.Material
import net.minecraft.sound.BlockSoundGroup

class SpecialRubyOre : Block(FabricBlockSettings.of(Material.STONE).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 5)
        .strength(3f, 3.0f).sounds(BlockSoundGroup.STONE)) 