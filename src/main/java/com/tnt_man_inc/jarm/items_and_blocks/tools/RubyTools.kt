package com.tnt_man_inc.jarm.items_and_blocks.tools

import com.tnt_man_inc.jarm.Utils.ITEM_SETTINGS
import com.tnt_man_inc.jarm.Utils.registerItem
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.AxeSubclass
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.HoeSubclass
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.PickaxeSubclass
import net.minecraft.item.ShovelItem
import net.minecraft.item.SwordItem
import net.minecraft.item.ToolItem

/**
 * Where the ruby tools stay
 * @see JARMToolMaterials
 */
object RubyTools {
    var RUBY_SWORD: ToolItem = registerItem("ruby_sword", SwordItem(JARMToolMaterials.RUBY, 5 - 2, 7.0f, ITEM_SETTINGS()))
    var RUBY_PICKAXE: ToolItem = registerItem("ruby_pickaxe", PickaxeSubclass(JARMToolMaterials.RUBY, 1, 5f, ITEM_SETTINGS()))
    var RUBY_AXE: ToolItem = registerItem("ruby_axe", AxeSubclass(JARMToolMaterials.RUBY, (9 - 2).toFloat(), 5f, ITEM_SETTINGS()))
    var RUBY_SHOVEL: ToolItem = registerItem("ruby_shovel", ShovelItem(JARMToolMaterials.RUBY, 1f, 1f, ITEM_SETTINGS()))
    var RUBY_HOE: ToolItem = registerItem("ruby_hoe", HoeSubclass(JARMToolMaterials.RUBY, 1, 1f, ITEM_SETTINGS()))
    fun init() {}
}
