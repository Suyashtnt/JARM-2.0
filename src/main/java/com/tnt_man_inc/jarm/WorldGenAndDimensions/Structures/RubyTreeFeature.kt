package com.tnt_man_inc.jarm.WorldGenAndDimensions.Structures

import com.mojang.serialization.Codec
import com.tnt_man_inc.jarm.items_and_blocks.Blocks
import net.minecraft.block.BlockState
import net.minecraft.util.math.BlockBox
import net.minecraft.util.math.BlockPos
import net.minecraft.world.ModifiableTestableWorld
import net.minecraft.world.gen.feature.TreeFeature
import net.minecraft.world.gen.feature.TreeFeatureConfig
import net.minecraft.world.gen.foliage.BlobFoliagePlacer
import java.util.*


/**
 * Stol- Borrowed from techreborn
 * @author drcrazy
 */
class RubyTreeFeature(codec: Codec<TreeFeatureConfig?>?) : TreeFeature(codec) {
    class FoliagePlacer(radius: Int, randomRadius: Int, offset: Int, randomOffset: Int, height: Int) : BlobFoliagePlacer(radius, randomRadius, offset, randomOffset, height) {
        override fun generate(world: ModifiableTestableWorld, random: Random, config: TreeFeatureConfig, trunkHeight: Int, treeNode: TreeNode, foliageHeight: Int, radius: Int, leaves: Set<BlockPos>, i: Int, blockBox: BlockBox) {
            super.generate(world, random, config, trunkHeight, treeNode, foliageHeight, radius, leaves, i, blockBox)
            spawnSpike(world, treeNode.center)
        }

        private fun spawnSpike(world: ModifiableTestableWorld, pos: BlockPos) {

            val startScan = pos.y
            var topPos: BlockPos? = null

            //Limit the scan to 15 blocks
            while (topPos == null && pos.y - startScan < 15) {
                var pos = pos
                pos = pos.up()
                if (world.testBlockState(pos) { obj: BlockState -> obj.isAir }) {
                    topPos = pos
                }
            }
            if (topPos == null) return
            for (i in 0 until 1) {
                world.setBlockState(pos.up(i), Blocks.RUBY_LEAVES.defaultState, 19)
            }
        }
    }
}