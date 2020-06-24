package com.tnt_man_inc.jarm.items_and_blocks

import com.tnt_man_inc.jarm.Utils.ITEM_SETTINGS
import com.tnt_man_inc.jarm.Utils.registerItem
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_item_types.RubyShard
import net.minecraft.item.Item

object Items {
    @JvmField
    val RUBY = registerItem("RUBY", Item(ITEM_SETTINGS))

    @JvmField
    val STRONG_DIAMOND = registerItem("strong_diamond", Item(ITEM_SETTINGS.maxCount(16)))
    val RUBY_INGOT = registerItem("ruby_ingot", Item(ITEM_SETTINGS))
    val RUBY_NUGGET = registerItem("ruby_nugget", Item(ITEM_SETTINGS))
    val RUBY_SHARD: Item = registerItem("ruby_shard", RubyShard(ITEM_SETTINGS))
    fun init() {}
}