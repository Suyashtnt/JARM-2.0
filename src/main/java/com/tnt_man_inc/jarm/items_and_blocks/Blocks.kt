package com.tnt_man_inc.jarm.items_and_blocks;

import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_block_types.RubyBricks;
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_block_types.RubyOre;
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_block_types.SpecialRubyOre;
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_block_types.StrongDiamondBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

import static com.tnt_man_inc.jarm.Utils.registerBlock;

public class Blocks {

    public static final Block RUBY_ORE = registerBlock("ruby_ore", new RubyOre());
    public static final Block SPECIAL_RUBY_ORE = registerBlock("special_ruby_ore", new SpecialRubyOre());

    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f)));
    public static final Block RUBY_BRICK = registerBlock("ruby_bricks", new RubyBricks());
    public static final Block RUBY_BRICK_SLAB = registerBlock("ruby_bricks_slab", new RubyBricks());
    public static final Block STRONG_DIAMOND_BLOCK = registerBlock("strong_diamond_block", new StrongDiamondBlock());
    public static final Block RUBY_INGOT_BLOCK = registerBlock("block_of_ruby_ingot", new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f)));

    public static void init() {}
}