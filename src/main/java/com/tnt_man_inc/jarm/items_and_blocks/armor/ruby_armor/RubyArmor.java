package com.tnt_man_inc.jarm.items_and_blocks.armor.ruby_armor;

import com.tnt_man_inc.jarm.items_and_blocks.armor.JARMArmorMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.tnt_man_inc.jarm.items_and_blocks.Items.ITEM_SETTINGS;

public class RubyArmor {

	public static final Item RUBY_HELMET = register("ruby_helmet", new ArmorItem(JARMArmorMaterials.RUBY, EquipmentSlot.HEAD, ITEM_SETTINGS));
	public static final Item RUBY_CHESTPLATE = register("ruby_chestplate", new ArmorItem(JARMArmorMaterials.RUBY, EquipmentSlot.CHEST, ITEM_SETTINGS));
	public static final Item RUBY_LEGGINGS = register("ruby_leggings", new ArmorItem(JARMArmorMaterials.RUBY, EquipmentSlot.LEGS, ITEM_SETTINGS));
	public static final Item RUBY_BOOTS = register("ruby_boots", new ArmorItem(JARMArmorMaterials.RUBY, EquipmentSlot.FEET, ITEM_SETTINGS));

	public static <T extends Item> T register(String name, T item) {
		return Registry.register(Registry.ITEM, new Identifier("jarm", name), item);
	}

	public static void init() {
	}
}
