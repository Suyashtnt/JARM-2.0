package com.tnt_man_inc.jarm.items_and_blocks.armor.ruby_armor

import com.tnt_man_inc.jarm.Utils.ITEM_SETTINGS
import com.tnt_man_inc.jarm.Utils.registerItem
import com.tnt_man_inc.jarm.items_and_blocks.armor.JARMArmorMaterials
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorItem
import net.minecraft.item.Item

object RubyArmor {
    val RUBY_HELMET: Item = registerItem("ruby_helmet", ArmorItem(JARMArmorMaterials.RUBY, EquipmentSlot.HEAD, ITEM_SETTINGS.fireproof()))
    val RUBY_CHESTPLATE: Item = registerItem("ruby_chestplate", ArmorItem(JARMArmorMaterials.RUBY, EquipmentSlot.CHEST, ITEM_SETTINGS.fireproof()))
    val RUBY_LEGGINGS: Item = registerItem("ruby_leggings", ArmorItem(JARMArmorMaterials.RUBY, EquipmentSlot.LEGS, ITEM_SETTINGS.fireproof()))
    val RUBY_BOOTS: Item = registerItem("ruby_boots", ArmorItem(JARMArmorMaterials.RUBY, EquipmentSlot.FEET, ITEM_SETTINGS.fireproof()))
    fun init() {}
}