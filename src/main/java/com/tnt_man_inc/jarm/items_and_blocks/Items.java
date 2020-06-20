package com.tnt_man_inc.jarm.items_and_blocks;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import com.tnt_man_inc.jarm.Main;

public class Items {

    public static final Item RUBY = register("ruby", new Item(new Item.Settings().group(Main.JARM_GROUP)));
    public static final Item STRONG_DIAMOND = register("strong_diamond",
            new Item(new Item.Settings().group(Main.JARM_GROUP)));
    public static final Item RUBY_INGOT = register("ruby_ingot", new Item(new Item.Settings().group(Main.JARM_GROUP)));
    public static final Item RUBY_NUGGET = register("ruby_nugget",
            new Item(new Item.Settings().group(Main.JARM_GROUP)));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, new Identifier("jarm", name), item);
    }

    public static void init() {
    }
}