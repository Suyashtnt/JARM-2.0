package com.tnt_man_inc.jarm.Mobs.Models

import com.tnt_man_inc.jarm.Mobs.RubyGuardian
import net.minecraft.client.model.ModelPart
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.entity.model.EntityModel
import net.minecraft.client.util.math.MatrixStack

class RubyGuardianModel : EntityModel<RubyGuardian?>() {
    private val base: ModelPart
    override fun setAngles(entity: RubyGuardian?, limbAngle: Float, limbDistance: Float, animationProgress: Float, headYaw: Float, headPitch: Float) {}
    override fun render(matrices: MatrixStack, vertices: VertexConsumer, light: Int, overlay: Int, red: Float, green: Float, blue: Float, alpha: Float) {
        // translate model down
        matrices.translate(0.0, 1.125, 0.0)

        // render cube
        base.render(matrices, vertices, light, overlay)
    }

    init {
        textureHeight = 64
        textureWidth = 64
        base = ModelPart(this, 0, 0)
        base.addCuboid(-6f, -6f, -6f, 12f, 12f, 12f)
    }
}