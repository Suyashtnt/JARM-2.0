package com.tnt_man_inc.jarm.items_and_blocks.armor

import com.tnt_man_inc.jarm.Utils
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorItem
import net.minecraft.item.Item

object NetheriteInfusedStrongGuildedDiamondArmor {
    val NETHERITE_INFUSED_STRONG_GUILED_DIAMOND_HELMET: Item = Utils.registerItem("netherite_infused_strong_guilded_diamond_helmet", ArmorItem(JARMArmorMaterials.NETHERITE_INFUSED_STRONG_GUILED_DIAMOND, EquipmentSlot.HEAD, Utils.ITEM_SETTINGS()))
    val NETHERITE_INFUSED_STRONG_GUILED_DIAMOND_CHESTPLATE: Item = Utils.registerItem("netherite_infused_strong_guilded_diamond_chestplate", ArmorItem(JARMArmorMaterials.NETHERITE_INFUSED_STRONG_GUILED_DIAMOND, EquipmentSlot.CHEST, Utils.ITEM_SETTINGS()))
    val NETHERITE_INFUSED_STRONG_GUILED_DIAMOND_LEGGINGS: Item = Utils.registerItem("netherite_infused_strong_guilded_diamond_leggings", ArmorItem(JARMArmorMaterials.NETHERITE_INFUSED_STRONG_GUILED_DIAMOND, EquipmentSlot.LEGS, Utils.ITEM_SETTINGS()))
    val NETHERITE_INFUSED_STRONG_GUILED_DIAMOND_BOOTS: Item = Utils.registerItem("netherite_infused_strong_guilded_diamond_boots", ArmorItem(JARMArmorMaterials.NETHERITE_INFUSED_STRONG_GUILED_DIAMOND, EquipmentSlot.FEET, Utils.ITEM_SETTINGS()))
    fun init() {}
}