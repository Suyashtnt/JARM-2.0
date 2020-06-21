package com.tnt_man_inc.jarm.Mobs.Renderers;

import com.tnt_man_inc.jarm.Mobs.Models.RubyGuardianModel;
import com.tnt_man_inc.jarm.Mobs.RubyGuardian;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class RubyGuardianRenderer extends MobEntityRenderer<RubyGuardian, RubyGuardianModel> {

    public RubyGuardianRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new RubyGuardianModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(RubyGuardian entity) {
        return new Identifier("jarm", "textures/rubyguardian2.png");
    }
}