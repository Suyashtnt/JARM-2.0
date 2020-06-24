package com.tnt_man_inc.jarm.items_and_blocks.tools

import com.tnt_man_inc.jarm.items_and_blocks.Items
import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient
import net.minecraft.util.Lazy
import java.util.function.Supplier

enum class JARMToolMaterials(private val miningLevel: Int, private val itemDurability: Int, private val miningSpeed: Float, private val attackDamage: Float, private val enchantability: Int, repairIngredient: Supplier<Ingredient>) : ToolMaterial {
    RUBY(3, 1301, 7f, 2f, 20, Supplier<Ingredient> { Ingredient.ofItems(Items.RUBY) }), STRONG_DIAMOND(3, 1301, 7f, 2.5f, 20, Supplier<Ingredient> { Ingredient.ofItems(Items.RUBY) });

    private val repairIngredient: Lazy<Ingredient> = Lazy(repairIngredient)
    override fun getDurability(): Int {
        return itemDurability
    }

    override fun getMiningSpeedMultiplier(): Float {
        return miningSpeed
    }

    override fun getAttackDamage(): Float {
        return attackDamage
    }

    override fun getMiningLevel(): Int {
        return miningLevel
    }

    override fun getEnchantability(): Int {
        return enchantability
    }

    override fun getRepairIngredient(): Ingredient {
        return repairIngredient.get()
    }

}