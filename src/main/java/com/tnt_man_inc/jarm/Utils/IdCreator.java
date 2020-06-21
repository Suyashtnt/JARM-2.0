package com.tnt_man_inc.jarm.Utils;

import net.minecraft.util.Identifier;

public class IdCreator {
    public static void CreateID(String string) {
        new Identifier("jarm", string);
    }
}
