package com.tnt_man_inc.jarm.items_and_blocks

import com.tnt_man_inc.jarm.Main
import com.tnt_man_inc.jarm.Utils.registerBlock
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_block_types.RubyBricks
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_block_types.RubyOre
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_block_types.SpecialRubyOre
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_block_types.StrongDiamondBlock
import com.tnt_man_inc.jarm.mixins.BlocksAccessor
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricMaterialBuilder
import net.minecraft.block.*
import net.minecraft.block.Blocks
import net.minecraft.sound.BlockSoundGroup

/**
 * Blocks added by JARM
 */
object Blocks {
    val RUBY_ORE: Block = registerBlock("ruby_ore", Main.JARM_GROUP, RubyOre())
    val SPECIAL_RUBY_ORE: Block = registerBlock("special_ruby_ore", Main.JARM_GROUP, SpecialRubyOre())
    val RUBY_BLOCK: Block = registerBlock("ruby_block", Main.JARM_GROUP, Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f)))
    val RUBY_BRICKS: Block = registerBlock("ruby_bricks", Main.JARM_GROUP, RubyBricks())
    val RUBY_BRICKS_SLAB: Block = registerBlock("ruby_bricks_slab", Main.JARM_GROUP, RubyBricks())
    val STRONG_DIAMOND_BLOCK: Block = registerBlock("strong_diamond_block", Main.JARM_GROUP, StrongDiamondBlock())
    val RUBY_INGOT_BLOCK: Block = registerBlock("ruby_ingot_block", Main.JARM_GROUP, Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f)))
    val NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND_BLOCK = registerBlock("netherite_infused_strong_guilded_diamond_block", Main.JARM_GROUP, Block(FabricBlockSettings.of(Material.METAL).hardness(8.0f)))
    val RUBY_WOOD: Block = registerBlock("ruby_wood", Main.JARM_GROUP, Block(FabricBlockSettings.of(Material.NETHER_WOOD).hardness(2f)))
    val RUBY_LEAVES: LeavesBlock = registerBlock("ruby_leaves", Main.JARM_GROUP, LeavesBlock(AbstractBlock.Settings.of(CustomMaterial.RUBY_LEAVES).strength(0.2F).ticksRandomly().sounds(BlockSoundGroup.GRASS).nonOpaque().allowsSpawning(BlocksAccessor::callCanSpawnOnLeaves).suffocates(BlocksAccessor::callNever).blockVision(BlocksAccessor::callNever))
    )

    @kotlin.jvm.JvmField
    val RUBY_LIQUID = registerBlock("ruby_liquid", null, object : FluidBlock(other.STILL_RUBY_LIQUID, FabricBlockSettings.copy(Blocks.WATER)) {})
    fun init() {}

}

/**
 * where custom materials used live
 */
object CustomMaterial {
    val RUBY_LEAVES = (FabricMaterialBuilder(MaterialColor.FOLIAGE)).lightPassesThrough().build()
}
