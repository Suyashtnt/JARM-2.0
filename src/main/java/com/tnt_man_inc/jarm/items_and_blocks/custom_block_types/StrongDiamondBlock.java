package com.tnt_man_inc.jarm.items_and_blocks.custom_block_types;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class StrongDiamondBlock extends Block {
    public StrongDiamondBlock() {
        super(FabricBlockSettings.of(Material.METAL).breakByHand(false).breakByTool(FabricToolTags.PICKAXES, 5)
                .strength(3, 3.0f).sounds(BlockSoundGroup.METAL));

    }
}
