package com.tnt_man_inc.jarm.items_and_blocks.tools.ruby_tools;

import com.tnt_man_inc.jarm.Main;
import com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses.PickaxeSubclass;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

public class RubyTools {
    public static ToolItem RUBY_SWORD = new SwordItem(RubyToolsMaterial.RUBY, 7, 7.0F, new Item.Settings().group(Main.JARM_GROUP));
    public static ToolItem RUBY_PICKAXE = new PickaxeSubclass(RubyToolsMaterial.RUBY, 5, 5, new Item.Settings().group(Main.JARM_GROUP));


}

