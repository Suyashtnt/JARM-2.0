package com.tnt_man_inc.jarm.mixins;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Blocks.class)
public interface BlocksAccessor {
	@Invoker
	static LeavesBlock callCreateLeavesBlock() { throw new UnsupportedOperationException(); }

	@Invoker
	static Boolean callCanSpawnOnLeaves(BlockState state, BlockView world, BlockPos pos, EntityType<?> type) { throw new UnsupportedOperationException(); }

	@Invoker
	static boolean callNever(BlockState state, BlockView world, BlockPos pos) { throw new UnsupportedOperationException(); }
}
