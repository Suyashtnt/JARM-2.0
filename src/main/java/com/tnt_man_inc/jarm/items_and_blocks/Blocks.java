package com.tnt_man_inc.jarm.items_and_blocks;

import com.tnt_man_inc.jarm.Main;
import com.tnt_man_inc.jarm.items_and_blocks.custom_block_types.RubyBricks;
import com.tnt_man_inc.jarm.items_and_blocks.custom_block_types.RubyOre;
import com.tnt_man_inc.jarm.items_and_blocks.custom_block_types.SpecialRubyOre;
import com.tnt_man_inc.jarm.items_and_blocks.custom_block_types.StrongDiamondBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {

    public static final Block RUBY_ORE = register("ruby_ore", new RubyOre());
    public static final Block SPECIAL_RUBY_ORE = register("special_ruby_ore", new SpecialRubyOre());

    public static final Block RUBY_BLOCK = register("block_of_ruby",
            new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f)));
    public static final Block RUBY_BRICK = register("ruby_bricks", new RubyBricks());
    public static final Block RUBY_BRICK_SLAB = register("ruby_bricks_slab", new RubyBricks());
    public static final Block STRONG_DIAMOND_BLOCK = register("strong_diamond_block", new StrongDiamondBlock());
    public static final Block RUBY_INGOT_BLOCK = register("block_of_ruby_ingot", new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f)));

    public static <T extends Block> T register(String name, T Block) {
        Registry.register(Registry.ITEM, new Identifier("jarm", name),
                new BlockItem(Block, new Item.Settings().group(Main.JARM_GROUP)));
        return Registry.register(Registry.BLOCK, new Identifier("jarm", name), Block);

    }

    public static void init() {
    }
}