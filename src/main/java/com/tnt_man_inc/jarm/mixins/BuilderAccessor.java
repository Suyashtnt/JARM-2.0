package com.tnt_man_inc.jarm.mixins;

import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.piston.PistonBehavior;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(Material.Builder.class)
public interface BuilderAccessor {
	@Accessor
	PistonBehavior getPistonBehavior();

	@Accessor
	boolean isBlocksMovement();

	@Accessor
	boolean isBurnable();

	@Accessor
	boolean isLiquid();

	@Accessor
	boolean isReplaceable();

	@Accessor
	boolean isSolid();

	@Accessor
	MaterialColor getColor();

	@Accessor
	boolean isBlocksLight();

	@Invoker
	Material.Builder callLightPassesThrough();

	@Invoker
	Material.Builder callBurnable();

	@Invoker
	Material.Builder callDestroyedByPiston();

	@Invoker
	Material.Builder callBlocksPistons();
}
