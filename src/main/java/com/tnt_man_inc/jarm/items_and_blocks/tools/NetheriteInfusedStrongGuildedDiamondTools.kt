package com.tnt_man_inc.jarm.items_and_blocks.tools

import com.tnt_man_inc.jarm.Utils
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.AxeSubclass
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.HoeSubclass
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.PickaxeSubclass
import net.minecraft.item.ShovelItem
import net.minecraft.item.SwordItem
import net.minecraft.item.ToolItem

object NetheriteInfusedStrongGuildedDiamondTools {
    var NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND_SWORD: ToolItem = Utils.registerItem("netherite_infused_strong_guilded_diamond_sword", SwordItem(JARMToolMaterials.NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND, 9, 7.0f, Utils.ITEM_SETTINGS()?.fireproof()))
    var NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND_PICKAXE: ToolItem = Utils.registerItem("netherite_infused_strong_guilded_diamond_pickaxe", PickaxeSubclass(JARMToolMaterials.NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND, 1, 5f, Utils.ITEM_SETTINGS()?.fireproof()))
    var NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND_AXE: ToolItem = Utils.registerItem("netherite_infused_strong_guilded_diamond_axe", AxeSubclass(JARMToolMaterials.NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND, 12f, 5f, Utils.ITEM_SETTINGS()?.fireproof()))
    var NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND_SHOVEL: ToolItem = Utils.registerItem("netherite_infused_strong_guilded_diamond_shovel", ShovelItem(JARMToolMaterials.NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND, 1f, 1f, Utils.ITEM_SETTINGS()?.fireproof()))
    var NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND_HOE: ToolItem = Utils.registerItem("netherite_infused_strong_guilded_diamond_hoe", HoeSubclass(JARMToolMaterials.NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND, 1, 1f, Utils.ITEM_SETTINGS()?.fireproof()))
    fun init() {}
}
