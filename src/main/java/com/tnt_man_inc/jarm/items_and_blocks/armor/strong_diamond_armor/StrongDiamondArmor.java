package com.tnt_man_inc.jarm.items_and_blocks.armor.strong_diamond_armor;

import com.tnt_man_inc.jarm.items_and_blocks.armor.JARMArmorMaterials;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.tnt_man_inc.jarm.items_and_blocks.Items.ITEM_SETTINGS;

public class StrongDiamondArmor {

	public static final Item STRONG_DIAMOND_HELMET = register("strong_diamond_helmet", new ArmorItem(JARMArmorMaterials.STRONG_DIAMOND, EquipmentSlot.HEAD, ITEM_SETTINGS));
	public static final Item STRONG_DIAMOND_CHESTPLATE = register("strong_diamond_chestplate", new ArmorItem(JARMArmorMaterials.STRONG_DIAMOND, EquipmentSlot.CHEST, ITEM_SETTINGS));
	public static final Item STRONG_DIAMOND_LEGGINGS = register("strong_diamond_leggings", new ArmorItem(JARMArmorMaterials.STRONG_DIAMOND, EquipmentSlot.LEGS, ITEM_SETTINGS));
	public static final Item STRONG_DIAMOND_BOOTS = register("strong_diamond_boots", new ArmorItem(JARMArmorMaterials.STRONG_DIAMOND, EquipmentSlot.FEET, ITEM_SETTINGS));


	public static <T extends Item> T register(String name, T item) {
		return Registry.register(Registry.ITEM, new Identifier("jarm", name), item);
	}

	public static void init() {
	}
}
