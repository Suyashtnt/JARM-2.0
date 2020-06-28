package com.tnt_man_inc.jarm.items_and_blocks.fluids

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.fluid.FlowableFluid
import net.minecraft.fluid.Fluid
import net.minecraft.fluid.FluidState
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Direction
import net.minecraft.world.BlockView
import net.minecraft.world.WorldAccess
import net.minecraft.world.WorldView

abstract class BaseFluid : FlowableFluid() {
    override fun matchesType(fluid: Fluid?): Boolean {
        return fluid == getStill() || fluid == getFlowing();
    }

    override fun isInfinite(): Boolean {
        return false
    }

    override fun beforeBreakingBlock(world: WorldAccess?, pos: BlockPos?, state: BlockState?) {
        val blockEntity = world!!.getBlockEntity(pos)
        Block.dropStacks(state, world.world, pos, blockEntity);
    }

    override fun canBeReplacedWith(state: FluidState?, world: BlockView?, pos: BlockPos?, fluid: Fluid?, direction: Direction?): Boolean {
        return false
    }

    override fun getFlowSpeed(world: WorldView?): Int {
        return 4
    }

    override fun getLevelDecreasePerBlock(world: WorldView?): Int {
        return 1
    }

    override fun getTickRate(world: WorldView?): Int {
        return 5
    }

    override fun getBlastResistance(): Float {
        return 100f
    }
}