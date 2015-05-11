package com.gollum.rbd.client.model.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.gollum.rbd.client.model.IRBDModel;

public class ModelSilkFan extends ModelBase implements IRBDModel {
	// fields
		ModelRenderer left;
		ModelRenderer right;
		ModelRenderer fan;

		public ModelSilkFan() {
			textureWidth = 64;
			textureHeight = 64;

			left = new ModelRenderer(this, 1, 0);
			left.addBox(-0.5F, -17.5F, 0F, 1, 20, 1);
			left.setRotationPoint(0F, 39F, -15F);
			left.setTextureSize(64, 64);
			left.mirror = true;
			setRotation(left, 0.035F, 0F, -0.8726646F);
			right = new ModelRenderer(this, 0, 0);
			right.addBox(-0.5F, -17.5F, 0F, 1, 20, 1);
			right.setRotationPoint(0F, 39F, -16F);
			right.setTextureSize(64, 64);
			right.mirror = true;
			setRotation(right, -0.035F, -0F, 0.8726646F);
			fan = new ModelRenderer(this, 5, 0);
			fan.addBox(0F, 0F, 0F, 26, 17, 0);
			fan.setRotationPoint(-13F, 22F, -15F);
			fan.setTextureSize(64, 64);
			fan.mirror = true;
			setRotation(fan, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
	}

	@Override
	public void renderModel(float f5) {
		left.render(f5);
		right.render(f5);
		fan.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
