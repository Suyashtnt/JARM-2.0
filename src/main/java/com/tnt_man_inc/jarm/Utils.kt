package com.tnt_man_inc.jarm;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Utils {
	public static Item.Settings ITEM_SETTINGS = new Item.Settings().group(Main.JARM_GROUP);


	@Contract("_ -> new")
	public static @NotNull Identifier id(String name) {
		return new Identifier("jarm", name);
	}

	public static <T extends Item> T registerItem(String name, T item) {
		return Registry.register(Registry.ITEM, new Identifier("jarm", name), item);
	}

	public static <T extends Block> T registerBlock(String name, T Block) {
		Registry.register(Registry.ITEM, new Identifier("jarm", name), new BlockItem(Block, ITEM_SETTINGS));
		return Registry.register(Registry.BLOCK, new Identifier("jarm", name), Block);
	}
}
