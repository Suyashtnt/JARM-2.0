package com.tnt_man_inc.jarm.Mobs.Renderers

import com.tnt_man_inc.jarm.Mobs.RubyGuardian
import net.minecraft.client.render.entity.EntityRenderDispatcher
import net.minecraft.client.render.entity.ZombieBaseEntityRenderer
import net.minecraft.client.render.entity.model.ZombieEntityModel

class RubyGuardianRenderer(entityRenderDispatcher: EntityRenderDispatcher?) : ZombieBaseEntityRenderer<RubyGuardian?, ZombieEntityModel<RubyGuardian?>?>(entityRenderDispatcher, ZombieEntityModel(0.0f, false), ZombieEntityModel(0.5f, true), ZombieEntityModel(1.0f, true)) {

}