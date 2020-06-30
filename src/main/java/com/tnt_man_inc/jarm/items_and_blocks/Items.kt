package com.tnt_man_inc.jarm.items_and_blocks

import com.tnt_man_inc.jarm.Utils.ITEM_SETTINGS
import com.tnt_man_inc.jarm.Utils.registerItem
import com.tnt_man_inc.jarm.items_and_blocks.custom_types.custom_item_types.RubyShard
import com.tnt_man_inc.jarm.items_and_blocks.food.EnchantedApple
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.item.BucketItem
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.item.Items

object Items {
    @JvmField
    val RUBY = registerItem("ruby", Item(ITEM_SETTINGS()))

    @JvmField
    val STRONG_DIAMOND = registerItem("strong_diamond", Item(Item.Settings().maxCount(16)))
    val RUBY_INGOT = registerItem("ruby_ingot", Item(ITEM_SETTINGS()))
    val RUBY_NUGGET = registerItem("ruby_nugget", Item(ITEM_SETTINGS()))
    val RUBY_SHARD: Item = registerItem("ruby_shard", RubyShard(ITEM_SETTINGS()))
    val NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND = registerItem("netherite_infused_strong_guilded_diamond", Item(ITEM_SETTINGS()?.fireproof()))
    val RUBY_APPLE = registerItem("ruby_apple", Item(ITEM_SETTINGS()?.food(FoodComponent.Builder().hunger(8).saturationModifier(6f).statusEffect(StatusEffectInstance(StatusEffects.REGENERATION, 20 * 8, 1), 1f).statusEffect(StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 180, 0), 1f).statusEffect(StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 60, 0), 1f).build())))
    val ENCHANTED_RUBY_APPLE = registerItem("enchanted_ruby_apple", ITEM_SETTINGS()?.food(FoodComponent.Builder().hunger(8).saturationModifier(6f).statusEffect(StatusEffectInstance(StatusEffects.REGENERATION, 20 * 20, 1), 1f).statusEffect(StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 120, 3), 1f).statusEffect(StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 300, 0), 1f).statusEffect(StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 300, 0), 1f).build())?.let { EnchantedApple(it) })
    val NISGD_APPLE = registerItem("netherite_infused_strong_guilded_diamond_apple", Item(ITEM_SETTINGS()?.food(FoodComponent.Builder().hunger(8).saturationModifier(6f).statusEffect(StatusEffectInstance(StatusEffects.REGENERATION, 20 * 20, 1), 1f).statusEffect(StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 120, 3), 1f).statusEffect(StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 300, 0), 1f).statusEffect(StatusEffectInstance(StatusEffects.RESISTANCE, 20 * 300, 0), 1f).build())))
    val ENCHANTED_NISGD_APPLE = registerItem("enchanted_netherite_infused_strong_guilded_diamond_apple", ITEM_SETTINGS()?.food(FoodComponent.Builder().hunger(200).saturationModifier(2000f).statusEffect(StatusEffectInstance(StatusEffects.REGENERATION, 20 * 15, 5), 1f).statusEffect(StatusEffectInstance(StatusEffects.ABSORPTION, 20 * 500, 3), 1f).statusEffect(StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 20 * 50000, 0), 1f).build())?.let { EnchantedApple(it) })

    @JvmField
    val RUBY_LIQUID_BUCKET = registerItem("ruby_liquid_bucket", BucketItem(other.STILL_RUBY_LIQUID, ITEM_SETTINGS()?.recipeRemainder(Items.BUCKET)))
    fun init() {}
}
