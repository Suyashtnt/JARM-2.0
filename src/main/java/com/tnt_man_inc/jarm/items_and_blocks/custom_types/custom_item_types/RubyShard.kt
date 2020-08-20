package com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_item_types

import net.minecraft.entity.Entity
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.world.World

/**
 * An item when in your inventory makes you weak
 */
class RubyShard(settings: Settings?) : Item(settings) {
    override fun inventoryTick(stack: ItemStack, world: World, entity: Entity, slot: Int, selected: Boolean) {
        if (entity is PlayerEntity) {
            entity.addStatusEffect(StatusEffectInstance(StatusEffects.WEAKNESS, 1, 0))
        }
    }
}