package com.tnt_man_inc.jarm.items_and_blocks.armor.strong_diamond_armor.custom_models;// Made with Blockbench 3.5.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports


import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import org.jetbrains.annotations.NotNull;

public class SuperDiamondHelmet extends EntityModel {
private final ModelPart armorHead;
public SuperDiamondHelmet() {
		textureWidth = 64;
		textureHeight = 64;
		armorHead = new ModelPart(this);
		armorHead.setPivot(0.0F, 24.0F, 0.0F);
		setRotationAngle(armorHead, 0.0F, -1.5708F, 0.0F);
		armorHead.setTextureOffset(24, 51).addCuboid(-4.0F, -11.0F, -6.0F, 8.0F, 1.0F, 12.0F, 0.0F, false);
		armorHead.setTextureOffset(46, 0).addCuboid(-4.0F, -12.0F, 5.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(46, 0).addCuboid(-4.0F, -12.0F, -6.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(44, 16).addCuboid(-5.0F, -10.0F, 4.0F, 9.0F, 10.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(44, 32).addCuboid(-5.0F, -10.0F, -5.0F, 9.0F, 10.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(0, 44).addCuboid(4.0F, -10.0F, -5.0F, 1.0F, 10.0F, 10.0F, 0.0F, false);
		armorHead.setTextureOffset(46, 0).addCuboid(-5.0F, -8.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		armorHead.setTextureOffset(46, 0).addCuboid(-5.0F, -10.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		armorHead.setTextureOffset(46, 0).addCuboid(-5.0F, -5.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		armorHead.setTextureOffset(17, 28).addCuboid(-4.0F, -10.0F, 5.0F, 8.0F, 5.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(17, 28).addCuboid(-6.0F, -5.0F, 5.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(17, 28).addCuboid(-6.0F, -5.0F, -6.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(34, 24).addCuboid(-4.0F, -10.0F, -6.0F, 8.0F, 5.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(21, 56).addCuboid(-4.0F, -12.0F, -7.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		armorHead.setTextureOffset(20, 46).addCuboid(-4.0F, -12.0F, 6.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
}

	@Override
	public void setAngles(Entity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

	}

	@Override
	public void render(MatrixStack matrixStack, VertexConsumer  buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

			armorHead.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(@NotNull ModelPart bone, float x, float y, float z) {
			bone.pitch = x;
			bone.yaw = y;
			bone.roll = z;
	}

}