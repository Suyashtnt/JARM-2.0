package com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_item_types

import net.minecraft.enchantment.EnchantmentHelper
import net.minecraft.enchantment.Enchantments
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.projectile.PersistentProjectileEntity.PickupPermission
import net.minecraft.item.*
import net.minecraft.sound.SoundCategory
import net.minecraft.sound.SoundEvents
import net.minecraft.stat.Stats
import net.minecraft.util.Hand
import net.minecraft.util.TypedActionResult
import net.minecraft.util.UseAction
import net.minecraft.world.World
import java.util.function.Predicate

class RubyBow(settings: Settings) : RangedWeaponItem(settings) {


    override fun onStoppedUsing(stack: ItemStack, world: World, user: LivingEntity?, remainingUseTicks: Int) {
        if (user is PlayerEntity) {
            val playerEntity = user
            val bl = playerEntity.abilities.creativeMode || EnchantmentHelper.getLevel(Enchantments.INFINITY, stack) > 0
            var itemStack = playerEntity.getArrowType(stack)
            if (!itemStack.isEmpty || bl) {
                if (itemStack.isEmpty) {
                    itemStack = ItemStack(Items.ARROW)
                }
                val i = getMaxUseTime(stack) - remainingUseTicks
                val f = getPullProgress(i)
                if (f.toDouble() >= 0.1) {
                    val bl2 = bl && itemStack.item === com.tnt_man_inc.jarm.items_and_blocks.Items.RUBY_SHARD
                    if (!world.isClient) {
                        val persistentProjectileEntity = ((if (itemStack.item is ArrowItem) itemStack.item else Items.ARROW) as ArrowItem).createArrow(world, itemStack, playerEntity)
                        persistentProjectileEntity.setProperties(playerEntity, playerEntity.pitch, playerEntity.yaw, 0.0f, f * 69.0f, 3.0f)
                        if (f == 1.0f) {
                            persistentProjectileEntity.isCritical = true
                        }
                        val j = EnchantmentHelper.getLevel(Enchantments.POWER, stack)
                        if (j > 0) {
                            persistentProjectileEntity.damage = persistentProjectileEntity.damage + j.toDouble() * 0.5 + 0.5
                        }
                        val k = EnchantmentHelper.getLevel(Enchantments.PUNCH, stack)
                        if (k > 0) {
                            persistentProjectileEntity.setPunch(k + 3)
                        } else {
                            persistentProjectileEntity.setPunch(3)
                        }
                        if (EnchantmentHelper.getLevel(Enchantments.FLAME, stack) > 0) {
                            persistentProjectileEntity.setOnFireFor(100)
                        }
                        stack.damage(1, playerEntity, { p: PlayerEntity -> p.sendToolBreakStatus(playerEntity.activeHand) })
                        if (bl2 || playerEntity.abilities.creativeMode && (itemStack.item === Items.SPECTRAL_ARROW || itemStack.item === Items.TIPPED_ARROW)) {
                            persistentProjectileEntity.pickupType = PickupPermission.CREATIVE_ONLY
                        }

                        persistentProjectileEntity.damage += 10


                        world.spawnEntity(persistentProjectileEntity)
                    }
                    world.playSound(null as PlayerEntity?, playerEntity.x, playerEntity.y, playerEntity.z, SoundEvents.ENTITY_ARROW_SHOOT, SoundCategory.PLAYERS, 1.0f, 1.0f / (Item.RANDOM.nextFloat() * 0.4f + 1.2f) + f * 0.5f)
                    if (!bl2 && !playerEntity.abilities.creativeMode) {
                        itemStack.decrement(1)
                        if (itemStack.isEmpty) {
                            playerEntity.inventory.removeOne(itemStack)
                        }
                    }
                    playerEntity.incrementStat(Stats.USED.getOrCreateStat(this))
                }
            }
        }
    }

    fun getPullProgress(useTicks: Int): Float {
        var f = useTicks.toFloat() / 20.0f
        f = (f * f + f * 2.0f) / 3.0f
        if (f > 1.0f) {
            f = 1.0f
        }
        return f
    }

    override fun getMaxUseTime(stack: ItemStack?): Int {
        return 72000
    }

    override fun getUseAction(stack: ItemStack?): UseAction? {
        return UseAction.BOW
    }

    override fun use(world: World?, user: PlayerEntity, hand: Hand?): TypedActionResult<ItemStack>? {
        val itemStack = user.getStackInHand(hand)
        val bl = !user.getArrowType(itemStack).isEmpty
        return if (!user.abilities.creativeMode && !bl) {
            TypedActionResult.fail(itemStack)
        } else {
            user.setCurrentHand(hand)
            TypedActionResult.consume(itemStack)
        }
    }

    override fun getProjectiles(): Predicate<ItemStack?>? {
        return BOW_PROJECTILES
    }

    override fun getRange(): Int {
        return 100
    }


}
