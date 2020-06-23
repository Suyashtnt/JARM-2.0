package com.tnt_man_inc.jarm.items_and_blocks.armor.ruby_armor;

import com.tnt_man_inc.jarm.items_and_blocks.armor.JARMArmorMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

import static com.tnt_man_inc.jarm.Utils.ITEM_SETTINGS;
import static com.tnt_man_inc.jarm.Utils.registerItem;


public class RubyArmor {

	public static final Item RUBY_HELMET = registerItem("ruby_helmet", new ArmorItem(JARMArmorMaterials.RUBY, EquipmentSlot.HEAD, ITEM_SETTINGS));
	public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate", new ArmorItem(JARMArmorMaterials.RUBY, EquipmentSlot.CHEST, ITEM_SETTINGS));
	public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings", new ArmorItem(JARMArmorMaterials.RUBY, EquipmentSlot.LEGS, ITEM_SETTINGS));
	public static final Item RUBY_BOOTS = registerItem("ruby_boots", new ArmorItem(JARMArmorMaterials.RUBY, EquipmentSlot.FEET, ITEM_SETTINGS));


	public static void init() {
	}
}
