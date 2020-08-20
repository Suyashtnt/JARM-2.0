package com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses

import net.minecraft.item.AxeItem
import net.minecraft.item.ToolMaterial

/**
 * Since AxeItem is protected This exists
 * @see AxeItem
 */
class AxeSubclass(material: ToolMaterial?, attackDamage: Float, attackSpeed: Float, settings: Settings?) : AxeItem(material, attackDamage, attackSpeed, settings)
