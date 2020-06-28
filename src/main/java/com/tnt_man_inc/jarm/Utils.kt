package com.tnt_man_inc.jarm

import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import org.jetbrains.annotations.Contract

object Utils {

    fun ITEM_SETTINGS(): Item.Settings? {
        return Item.Settings().group(Main.JARM_GROUP)
    }

    @Contract("_ -> new")
    fun id(name: String?): Identifier {
        return Identifier("jarm", name)
    }

    @JvmStatic
    fun <T : Item?> registerItem(name: String?, item: T): T {
        return Registry.register(Registry.ITEM, id(name), item)
    }

    @JvmStatic
    fun <T : Block?> registerBlock(name: String?, itemGroup: ItemGroup?, Block: T): T {
        Registry.register(Registry.ITEM, Identifier("jarm", name), BlockItem(Block, Item.Settings().group(itemGroup)))
        return Registry.register(Registry.BLOCK, Identifier("jarm", name), Block)
    }


}