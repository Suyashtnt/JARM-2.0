package com.tnt_man_inc.jarm.items_and_blocks.tools.strong_diamond_tools;

import com.tnt_man_inc.jarm.Main;
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.PickaxeSubclass;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StrongDiamondTools {
	public static ToolItem STRONG_DIAMOND_SWORD = register("strong_diamond_sword", new SwordItem(StrongDiamondMaterial.STRONG_DIAMOND, 8, 7.0F, new Item.Settings().group(Main.JARM_GROUP)));
	public static ToolItem STRONG_DIAMOND_PICKAXE = register("strong_diamond_pickaxe", new PickaxeSubclass(StrongDiamondMaterial.STRONG_DIAMOND, 5, 5, new Item.Settings().group(Main.JARM_GROUP)));

	public static <T extends Item> T register(String name, T item) {
		return Registry.register(Registry.ITEM, new Identifier("jarm", name), item);
	}

	public static void init() {
	}
}