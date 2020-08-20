package com.tnt_man_inc.jarm.items_and_blocks.tools.subclasses

import net.minecraft.item.HoeItem
import net.minecraft.item.ToolMaterial
/**
 * Since HoeItem is protected this exists
 * @see HoeItem
 */
class HoeSubclass(material: ToolMaterial?, attackDamage: Int, attackSpeed: Float, settings: Settings?) : HoeItem(material, attackDamage, attackSpeed, settings)