package com.tnt_man_inc.jarm.items_and_blocks.fluids

import com.tnt_man_inc.jarm.items_and_blocks.Blocks
import com.tnt_man_inc.jarm.items_and_blocks.Items
import com.tnt_man_inc.jarm.items_and_blocks.other
import net.minecraft.block.BlockState
import net.minecraft.fluid.Fluid
import net.minecraft.fluid.FluidState
import net.minecraft.item.Item
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties


abstract class RubyLiquid : BaseFluid() {
    override fun toBlockState(state: FluidState?): BlockState {
        return Blocks.RUBY_LIQUID.defaultState.with(Properties.LEVEL_15, method_15741(state))
    }

    override fun getBucketItem(): Item {
        return Items.RUBY_LIQUID_BUCKET
    }

    override fun getStill(): Fluid {
        return other.STILL_RUBY_LIQUID
    }

    override fun getFlowing(): Fluid {
        return other.FLOWING_RUBY_LIQUID
    }


    class Still : RubyLiquid() {


        override fun getLevel(state: FluidState?): Int {
            return 8
        }

        override fun isStill(state: FluidState?): Boolean {
            return true
        }

    }

    class Flowing : RubyLiquid() {
        override fun appendProperties(builder: StateManager.Builder<Fluid, FluidState>?) {
            super.appendProperties(builder)

            builder!!.add(LEVEL)

        }

        override fun getLevel(state: FluidState?): Int {
            return state!!.get(LEVEL)
        }

        override fun isStill(state: FluidState?): Boolean {
            return false;
        }
    }
}