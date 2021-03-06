package com.gollum.rbd.client.render.mobs;

import com.gollum.rbd.client.model.mobs.ModelFaery;
import com.gollum.rbd.common.entities.EntityFaery;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class RenderFaery extends RBDMobRender {
	
	public RenderFaery(ModelFaery model, float size, String name) {
		super(model, size, name);
	}
	
	public void doRender(Entity entity, double x, double y, double z, float par8, float par9) {
		((ModelFaery) this.modelBipedMain).setWingRotation (((EntityFaery)entity).getWindMovement());
		super.doRender((EntityLiving) entity, x, y, z, par8, par9);
	}
}
