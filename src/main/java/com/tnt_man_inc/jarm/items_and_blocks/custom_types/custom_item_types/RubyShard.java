package com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_item_types;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RubyShard extends Item {
	public RubyShard(Settings settings) {
		super(settings);
	}

	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 1, 0));
		}
	}

}
