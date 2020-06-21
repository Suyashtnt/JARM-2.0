package com.tnt_man_inc.jarm.Mobs.Renderers;

import com.tnt_man_inc.jarm.Mobs.RubyGuardian;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.ZombieBaseEntityRenderer;
import net.minecraft.client.render.entity.model.ZombieEntityModel;
import net.minecraft.util.Identifier;

public class RubyGuardianRenderer extends ZombieBaseEntityRenderer<RubyGuardian, ZombieEntityModel<RubyGuardian>> {

    public RubyGuardianRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new ZombieEntityModel<>(0.0f, false), new ZombieEntityModel<>(0.5F, true), new ZombieEntityModel<>(1.0F, true));
    }

    @Override
    public Identifier getTexture(RubyGuardian entity) {
        return new Identifier("jarm", "textures/rubyguardian2.png");
    }
}