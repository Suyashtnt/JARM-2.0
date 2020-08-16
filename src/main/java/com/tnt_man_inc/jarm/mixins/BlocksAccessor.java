package com.tnt_man_inc.jarm.mixins;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Blocks.class)
public interface BlocksAccessor {

	@Invoker
	static @NotNull Boolean callCanSpawnOnLeaves(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) { return type == EntityType.OCELOT || type == EntityType.PARROT; }

	@Invoker
	static boolean callNever(BlockState state, BlockView world, BlockPos pos) { return false; }
}
