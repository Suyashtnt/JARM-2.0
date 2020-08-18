package com.tnt_man_inc.jarm.WorldGenAndDimensions.Structures

import com.mojang.serialization.Codec
import net.minecraft.util.math.BlockPos
import net.minecraft.world.Heightmap
import net.minecraft.world.WorldAccess
import net.minecraft.world.gen.chunk.ChunkGenerator
import net.minecraft.world.gen.decorator.ChanceDecoratorConfig
import net.minecraft.world.gen.decorator.Decorator
import java.util.*
import java.util.stream.IntStream
import java.util.stream.Stream


// Big thanks to SuperCoder7979 for this
// Stol- Borrowed from techreborn
class RubyTreeDecorator(codec: Codec<ChanceDecoratorConfig?>?) : Decorator<ChanceDecoratorConfig>(codec) {
    override fun getPositions(world: WorldAccess, generator: ChunkGenerator, random: Random, config: ChanceDecoratorConfig, pos: BlockPos): Stream<BlockPos> {
        // Generate tree clusters randomly
        if (random.nextInt(config.chance) == 0) {
            // Generate 4 - 8 trees
            val treeCount = 4 + random.nextInt(5)
            return IntStream.range(0, treeCount).mapToObj { i: Int ->
                val x = random.nextInt(16) + pos.x
                val z = random.nextInt(16) + pos.z
                val y = world.getTopY(Heightmap.Type.MOTION_BLOCKING, x, z)
                BlockPos(x, y, z)
            }
        }
        return Stream.empty()
    }
}