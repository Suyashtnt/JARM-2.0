package com.tnt_man_inc.jarm.items_and_blocks.tools

import com.tnt_man_inc.jarm.Main
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.PickaxeSubclass
import net.minecraft.item.Item
import net.minecraft.item.SwordItem
import net.minecraft.item.ToolItem
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object StrongDiamondTools {
    var STRONG_DIAMOND_SWORD: ToolItem = register("strong_diamond_sword", SwordItem(JARMToolMaterials.STRONG_DIAMOND, 6, 7.0f, Item.Settings().group(Main.JARM_GROUP)))
    var STRONG_DIAMOND_PICKAXE: ToolItem = register("strong_diamond_pickaxe", PickaxeSubclass(JARMToolMaterials.STRONG_DIAMOND, 5, 5f, Item.Settings().group(Main.JARM_GROUP)))
    fun <T : Item?> register(name: String?, item: T): T {
        return Registry.register(Registry.ITEM, Identifier("jarm", name), item)
    }

    fun init() {}
}