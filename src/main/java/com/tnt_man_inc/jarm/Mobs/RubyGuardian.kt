package com.tnt_man_inc.jarm.Mobs

import net.minecraft.entity.EntityType
import net.minecraft.entity.attribute.DefaultAttributeContainer
import net.minecraft.entity.attribute.EntityAttributes
import net.minecraft.entity.mob.ZombieEntity
import net.minecraft.world.World

/**
 * Ruby Guardian AI
 */
class RubyGuardian(entityType: EntityType<out ZombieEntity?>?, world: World?) : ZombieEntity(entityType, world) {
    companion object {
        fun createAttributes(): DefaultAttributeContainer.Builder? {
            return createHostileAttributes()
                    .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 35.0)
                    .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, -0.2)
                    .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 3.0)
                    .add(EntityAttributes.GENERIC_ARMOR, 2.0)

        }
    }
}