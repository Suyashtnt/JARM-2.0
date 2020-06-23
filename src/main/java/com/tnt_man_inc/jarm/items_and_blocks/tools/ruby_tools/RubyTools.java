package com.tnt_man_inc.jarm.items_and_blocks.tools.ruby_tools;

import com.tnt_man_inc.jarm.items_and_blocks.tools.JARMToolMaterials;
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.AxeSubclass;
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.HoeSubclass;
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.PickaxeSubclass;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.tnt_man_inc.jarm.items_and_blocks.Items.ITEM_SETTINGS;

public class RubyTools {
    public static ToolItem RUBY_SWORD = register("ruby_sword", new SwordItem(JARMToolMaterials.RUBY, 5 - 2, 7.0F, ITEM_SETTINGS));
    public static ToolItem RUBY_PICKAXE = register("ruby_pickaxe", new PickaxeSubclass(JARMToolMaterials.RUBY, 1, 5, ITEM_SETTINGS));
    public static ToolItem RUBY_AXE = register("ruby_axe", new AxeSubclass(JARMToolMaterials.RUBY, 9 - 2, 5, ITEM_SETTINGS));
    public static ToolItem RUBY_SHOVEL = register("ruby_shovel", new ShovelItem(JARMToolMaterials.RUBY, 1, 1, ITEM_SETTINGS));
    public static ToolItem RUBY_HOE = register("ruby_hoe", new HoeSubclass(JARMToolMaterials.RUBY, 1, 1, ITEM_SETTINGS));

    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registry.ITEM, new Identifier("jarm", name), item);
    }

    public static void init() {
    }
}

