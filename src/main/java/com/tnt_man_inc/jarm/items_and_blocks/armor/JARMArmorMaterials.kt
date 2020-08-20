package com.tnt_man_inc.jarm.items_and_blocks.armor

import com.tnt_man_inc.jarm.items_and_blocks.Items
import net.fabricmc.api.EnvType
import net.fabricmc.api.Environment
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.ArmorMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents
import net.minecraft.util.Lazy
import java.util.function.Supplier

/**
 * JARM Armor materials
 */
enum class JARMArmorMaterials(val id: String, private val durabilityMultiplier: Int, private val protectionAmounts: IntArray, private val enchantability: Int, private val equipSound: SoundEvent, private val toughness: Float, private val knockbackResistance: Float, supplier: Supplier<Ingredient>) : ArmorMaterial {
    RUBY("ruby", 33, intArrayOf(2, 5, 7, 2), 22, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.7f, 0.0f, Supplier<Ingredient> { Ingredient.ofItems(Items.RUBY) }),
    STRONG_DIAMOND("strong_diamond", 40, intArrayOf(5, 8, 10, 5), 28, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0f, 0.3f, Supplier<Ingredient> { Ingredient.ofItems(Items.STRONG_DIAMOND) }),
    NETHERITE_INFUSED_STRONG_GUILED_DIAMOND("netherite_infused_strong_guilded_diamond", 69, intArrayOf(8, 12, 14, 8), 45, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 9.0f, 1f, Supplier<Ingredient> { Ingredient.ofItems(Items.NETHERITE_INFUSED_STRONG_GUILDED_DIAMOND) });

    private val repairIngredientSupplier: Lazy<Ingredient> = Lazy(supplier)
    override fun getDurability(slot: EquipmentSlot): Int {
        return BASE_DURABILITY[slot.entitySlotId] * durabilityMultiplier
    }

    override fun getProtectionAmount(slot: EquipmentSlot): Int {
        return protectionAmounts[slot.entitySlotId]
    }

    override fun getEnchantability(): Int {
        return enchantability
    }

    override fun getEquipSound(): SoundEvent {
        return equipSound
    }

    override fun getRepairIngredient(): Ingredient {
        return repairIngredientSupplier.get()
    }

    @Environment(EnvType.CLIENT)
    override fun getName(): String {
        return id
    }

    override fun getToughness(): Float {
        return toughness
    }

    override fun getKnockbackResistance(): Float {
        return knockbackResistance
    }

    companion object {
        private val BASE_DURABILITY = intArrayOf(13, 15, 16, 11)
    }

}
