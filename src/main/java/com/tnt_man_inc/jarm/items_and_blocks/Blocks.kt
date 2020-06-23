package com.tnt_man_inc.jarm.items_and_blocks

import com.tnt_man_inc.jarm.Utils.registerBlock
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_block_types.RubyBricks
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_block_types.RubyOre
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_block_types.SpecialRubyOre
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_block_types.StrongDiamondBlock
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.Block
import net.minecraft.block.Material

object Blocks {
    val RUBY_ORE: Block = registerBlock("ruby_ore", RubyOre())
    val SPECIAL_RUBY_ORE: Block = registerBlock("special_ruby_ore", SpecialRubyOre())
    val RUBY_BLOCK = registerBlock("ruby_block", Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f)))
    val RUBY_BRICK: Block = registerBlock("ruby_bricks", RubyBricks())
    val RUBY_BRICK_SLAB: Block = registerBlock("ruby_bricks_slab", RubyBricks())
    val STRONG_DIAMOND_BLOCK: Block = registerBlock("strong_diamond_block", StrongDiamondBlock())
    val RUBY_INGOT_BLOCK = registerBlock("block_of_ruby_ingot", Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f)))
    fun init() {}
}