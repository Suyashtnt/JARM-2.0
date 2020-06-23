package com.tnt_man_inc.jarm.items_and_blocks.armor.strong_diamond_armor;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StrongDiamondArmor {

	public static <T extends Item> T register(String name, T item) {
		return Registry.register(Registry.ITEM, new Identifier("jarm", name), item);
	}

	public static void init() {
	}
}
