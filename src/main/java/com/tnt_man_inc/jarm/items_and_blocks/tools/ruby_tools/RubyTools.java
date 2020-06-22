package com.tnt_man_inc.jarm.items_and_blocks.tools.ruby_tools;

import com.tnt_man_inc.jarm.Main;
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.AxeSubclass;
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.HoeSubclass;
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.PickaxeSubclass;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RubyTools {
    public static ToolItem RUBY_SWORD = register("ruby_sword", new SwordItem(RubyToolsMaterial.RUBY, 5, 7.0F, new Item.Settings().group(Main.JARM_GROUP)));
    public static ToolItem RUBY_PICKAXE = register("ruby_pickaxe", new PickaxeSubclass(RubyToolsMaterial.RUBY, 2, 5, new Item.Settings().group(Main.JARM_GROUP)));
    public static ToolItem RUBY_AXE = register("ruby_axe", new AxeSubclass(RubyToolsMaterial.RUBY, 9, 5, new Item.Settings().group(Main.JARM_GROUP)));
    public static ToolItem RUBY_SHOVEL = register("ruby_shovel", new ShovelItem(RubyToolsMaterial.RUBY, 1, 1, new Item.Settings().group(Main.JARM_GROUP)));
    public static ToolItem RUBY_HOE = register("ruby_hoe", new HoeSubclass(RubyToolsMaterial.RUBY, 1, 1, new Item.Settings().group(Main.JARM_GROUP)));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, new Identifier("jarm", name), item);
    }

    public static void init() {
    }
}

