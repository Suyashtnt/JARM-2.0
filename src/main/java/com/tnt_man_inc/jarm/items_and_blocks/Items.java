package com.tnt_man_inc.jarm.items_and_blocks;

import com.tnt_man_inc.jarm.Main;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

    public static Item.Settings ITEM_SETTINGS = new Item.Settings().group(Main.JARM_GROUP);

    public static final Item RUBY = register("ruby", new Item(ITEM_SETTINGS));
    public static final Item STRONG_DIAMOND = register("strong_diamond", new Item(ITEM_SETTINGS));
    public static final Item RUBY_INGOT = register("ruby_ingot", new Item(ITEM_SETTINGS));
    public static final Item RUBY_NUGGET = register("ruby_nugget", new Item(ITEM_SETTINGS));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, new Identifier("jarm", name), item);
    }

    public static void init() {
    }
}