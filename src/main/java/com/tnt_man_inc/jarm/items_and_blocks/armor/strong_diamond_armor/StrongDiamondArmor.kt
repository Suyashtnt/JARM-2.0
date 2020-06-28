package com.tnt_man_inc.jarm.items_and_blocks.armor.strong_diamond_armor

import com.tnt_man_inc.jarm.Utils.ITEM_SETTINGS
import com.tnt_man_inc.jarm.Utils.registerItem
import com.tnt_man_inc.jarm.items_and_blocks.armor.JARMArmorMaterials
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorItem
import net.minecraft.item.Item

object StrongDiamondArmor {
    val STRONG_DIAMOND_HELMET: Item = registerItem("strong_diamond_helmet", ArmorItem(JARMArmorMaterials.STRONG_DIAMOND, EquipmentSlot.HEAD, ITEM_SETTINGS()))
    val STRONG_DIAMOND_CHESTPLATE: Item = registerItem("strong_diamond_chestplate", ArmorItem(JARMArmorMaterials.STRONG_DIAMOND, EquipmentSlot.CHEST, ITEM_SETTINGS()))
    val STRONG_DIAMOND_LEGGINGS: Item = registerItem("strong_diamond_leggings", ArmorItem(JARMArmorMaterials.STRONG_DIAMOND, EquipmentSlot.LEGS, ITEM_SETTINGS()))
    val STRONG_DIAMOND_BOOTS: Item = registerItem("strong_diamond_boots", ArmorItem(JARMArmorMaterials.STRONG_DIAMOND, EquipmentSlot.FEET, ITEM_SETTINGS()))
    fun init() {}
}