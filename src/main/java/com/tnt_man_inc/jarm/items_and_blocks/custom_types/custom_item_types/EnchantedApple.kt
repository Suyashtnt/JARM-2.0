package com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_item_types

import net.minecraft.item.Item
import net.minecraft.item.ItemStack

/**
 * Is like net.minecraft.item.Item but will always glow
 * @see Item
 */
class EnchantedApple(settings: Settings) : Item(settings) {
    override fun hasGlint(stack: ItemStack?): Boolean {
        return true
    }
}
