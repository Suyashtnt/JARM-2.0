package com.tnt_man_inc.jarm.Mobs.Renderers

import com.tnt_man_inc.jarm.Mobs.RubyGuardian
import net.minecraft.client.render.entity.EntityRenderDispatcher
import net.minecraft.client.render.entity.ZombieBaseEntityRenderer
import net.minecraft.client.render.entity.model.ZombieEntityModel
import net.minecraft.entity.mob.ZombieEntity
import net.minecraft.util.Identifier

class RubyGuardianRenderer(entityRenderDispatcher: EntityRenderDispatcher?) : ZombieBaseEntityRenderer<RubyGuardian?, ZombieEntityModel<RubyGuardian?>?>(entityRenderDispatcher, ZombieEntityModel(0.0f, false), ZombieEntityModel(0.5f, true), ZombieEntityModel(1.0f, true)) {


    override fun getTexture(zombieEntity: ZombieEntity?): Identifier {
        return Identifier("jarm", "textures/rubyguardian.png");
    }
}