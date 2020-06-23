package com.tnt_man_inc.jarm.items_and_blocks;

import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_item_types.RubyShard;
import net.minecraft.item.Item;

import static com.tnt_man_inc.jarm.Utils.ITEM_SETTINGS;
import static com.tnt_man_inc.jarm.Utils.registerItem;

public class Items {

    public static final Item RUBY = registerItem("ruby", new Item(ITEM_SETTINGS));
    public static final Item STRONG_DIAMOND = registerItem("strong_diamond", new Item(ITEM_SETTINGS.maxCount(16)));
    public static final Item RUBY_INGOT = registerItem("ruby_ingot", new Item(ITEM_SETTINGS));
    public static final Item RUBY_NUGGET = registerItem("ruby_nugget", new Item(ITEM_SETTINGS));
    public static final Item RUBY_SHARD = registerItem("ruby_shard", new RubyShard(ITEM_SETTINGS));

    public static void init() {}
}