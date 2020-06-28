package com.tnt_man_inc.jarm.items_and_blocks

import com.tnt_man_inc.jarm.Utils
import com.tnt_man_inc.jarm.Utils.registerItem
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_item_types.RubyShard
import net.minecraft.item.BucketItem
import net.minecraft.item.Item
import net.minecraft.item.Items

object Items {
    @JvmField
    val RUBY = registerItem("ruby", Item(Utils.ITEM_SETTINGS()))

    @JvmField
    val STRONG_DIAMOND = registerItem("strong_diamond", Item(Item.Settings().maxCount(16)))
    val RUBY_INGOT = registerItem("ruby_ingot", Item(Utils.ITEM_SETTINGS()))
    val RUBY_NUGGET = registerItem("ruby_nugget", Item(Utils.ITEM_SETTINGS()))
    val RUBY_SHARD: Item = registerItem("ruby_shard", RubyShard(Utils.ITEM_SETTINGS()))
    val NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND = registerItem("netherite_infused_strong_guilded_diamond", Item(Utils.ITEM_SETTINGS()))

    @JvmField
    val RUBY_LIQUID_BUCKET = registerItem("ruby_liquid_bucket", BucketItem(other.STILL_RUBY_LIQUID, Utils.ITEM_SETTINGS()?.recipeRemainder(Items.BUCKET)))
    fun init() {}
}