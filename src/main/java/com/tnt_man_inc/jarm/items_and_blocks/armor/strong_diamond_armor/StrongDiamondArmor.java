package com.tnt_man_inc.jarm.items_and_blocks.armor.strong_diamond_armor;

import com.tnt_man_inc.jarm.items_and_blocks.armor.JARMArmorMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

import static com.tnt_man_inc.jarm.Utils.ITEM_SETTINGS;
import static com.tnt_man_inc.jarm.Utils.registerItem;

public class StrongDiamondArmor {

	public static final Item STRONG_DIAMOND_HELMET = registerItem("strong_diamond_helmet", new ArmorItem(JARMArmorMaterials.STRONG_DIAMOND, EquipmentSlot.HEAD, ITEM_SETTINGS));
	public static final Item STRONG_DIAMOND_CHESTPLATE = registerItem("strong_diamond_chestplate", new ArmorItem(JARMArmorMaterials.STRONG_DIAMOND, EquipmentSlot.CHEST, ITEM_SETTINGS));
	public static final Item STRONG_DIAMOND_LEGGINGS = registerItem("strong_diamond_leggings", new ArmorItem(JARMArmorMaterials.STRONG_DIAMOND, EquipmentSlot.LEGS, ITEM_SETTINGS));
	public static final Item STRONG_DIAMOND_BOOTS = registerItem("strong_diamond_boots", new ArmorItem(JARMArmorMaterials.STRONG_DIAMOND, EquipmentSlot.FEET, ITEM_SETTINGS));


	public static void init() {
	}
}
