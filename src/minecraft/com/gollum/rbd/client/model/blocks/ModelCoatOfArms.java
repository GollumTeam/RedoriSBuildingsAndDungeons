package com.gollum.rbd.client.model.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.gollum.rbd.client.model.IRBDModel;

public class ModelCoatOfArms extends ModelBase implements IRBDModel {
	// fields
	ModelRenderer right1;
	ModelRenderer left1;
	ModelRenderer vertical;
	ModelRenderer left2;
	ModelRenderer left3;
	ModelRenderer left4;
	ModelRenderer left5;
	ModelRenderer left6;
	ModelRenderer left7;
	ModelRenderer right2;
	ModelRenderer right3;
	ModelRenderer right4;
	ModelRenderer right5;
	ModelRenderer right6;
	ModelRenderer right7;
	ModelRenderer horizleft;
	ModelRenderer horizright;

	public ModelCoatOfArms() {
		textureWidth = 64;
		textureHeight = 64;

		right1 = new ModelRenderer(this, 24, 0);
		right1.addBox(-10F, 0F, 0F, 10, 20, 2);
		right1.setRotationPoint(0F, 19F, -14F);
		right1.setTextureSize(64, 64);
		right1.mirror = true;
		setRotation(right1, 0F, -0.2094395F, 0F);
		left1 = new ModelRenderer(this, 0, 0);
		left1.addBox(0F, 0F, 0F, 10, 20, 2);
		left1.setRotationPoint(0F, 19F, -14F);
		left1.setTextureSize(64, 64);
		left1.mirror = true;
		setRotation(left1, 0F, 0.2094395F, 0F);
		vertical = new ModelRenderer(this, 48, 0);
		vertical.addBox(-0.5F, 0F, 0F, 1, 28, 3);
		vertical.setRotationPoint(0F, 19F, -14F);
		vertical.setTextureSize(64, 64);
		vertical.mirror = true;
		setRotation(vertical, 0F, 0F, 0F);
		left2 = new ModelRenderer(this, 0, 22);
		left2.addBox(0F, 0F, 0F, 9, 2, 2);
		left2.setRotationPoint(0F, 39F, -14F);
		left2.setTextureSize(64, 64);
		left2.mirror = true;
		setRotation(left2, 0F, 0.2094395F, 0F);
		left3 = new ModelRenderer(this, 2, 26);
		left3.addBox(0F, 0F, 0F, 8, 1, 2);
		left3.setRotationPoint(0F, 41F, -14F);
		left3.setTextureSize(64, 64);
		left3.mirror = true;
		setRotation(left3, 0F, 0.2094395F, 0F);
		left4 = new ModelRenderer(this, 4, 29);
		left4.addBox(0F, 0F, 0F, 7, 1, 2);
		left4.setRotationPoint(0F, 42F, -14F);
		left4.setTextureSize(64, 64);
		left4.mirror = true;
		setRotation(left4, 0F, 0.2094395F, 0F);
		left5 = new ModelRenderer(this, 6, 32);
		left5.addBox(0F, 0F, 0F, 6, 1, 2);
		left5.setRotationPoint(0F, 43F, -14F);
		left5.setTextureSize(64, 64);
		left5.mirror = true;
		setRotation(left5, 0F, 0.2094395F, 0F);
		left6 = new ModelRenderer(this, 10, 35);
		left6.addBox(0F, 0F, 0F, 4, 1, 2);
		left6.setRotationPoint(0F, 44F, -14F);
		left6.setTextureSize(64, 64);
		left6.mirror = true;
		setRotation(left6, 0F, 0.2094395F, 0F);
		left7 = new ModelRenderer(this, 14, 38);
		left7.addBox(0F, 0F, 0F, 2, 1, 2);
		left7.setRotationPoint(0F, 45F, -14F);
		left7.setTextureSize(64, 64);
		left7.mirror = true;
		setRotation(left7, 0F, 0.2094395F, 0F);
		right2 = new ModelRenderer(this, 22, 22);
		right2.addBox(-9F, 0F, 0F, 9, 2, 2);
		right2.setRotationPoint(0F, 39F, -14F);
		right2.setTextureSize(64, 64);
		right2.mirror = true;
		setRotation(right2, 0F, -0.2094395F, 0F);
		right3 = new ModelRenderer(this, 22, 26);
		right3.addBox(-8F, 0F, 0F, 8, 1, 2);
		right3.setRotationPoint(0F, 41F, -14F);
		right3.setTextureSize(64, 64);
		right3.mirror = true;
		setRotation(right3, 0F, -0.2094395F, 0F);
		right4 = new ModelRenderer(this, 22, 29);
		right4.addBox(-7F, 0F, 0F, 7, 1, 2);
		right4.setRotationPoint(0F, 42F, -14F);
		right4.setTextureSize(64, 64);
		right4.mirror = true;
		setRotation(right4, 0F, -0.2094395F, 0F);
		right5 = new ModelRenderer(this, 22, 32);
		right5.addBox(-6F, 0F, 0F, 6, 1, 2);
		right5.setRotationPoint(0F, 43F, -14F);
		right5.setTextureSize(64, 64);
		right5.mirror = true;
		setRotation(right5, 0F, -0.2094395F, 0F);
		right6 = new ModelRenderer(this, 22, 35);
		right6.addBox(-4F, 0F, 0F, 4, 1, 2);
		right6.setRotationPoint(0F, 44F, -14F);
		right6.setTextureSize(64, 64);
		right6.mirror = true;
		setRotation(right6, 0F, -0.2094395F, 0F);
		right7 = new ModelRenderer(this, 22, 38);
		right7.addBox(-2F, 0F, 0F, 2, 1, 2);
		right7.setRotationPoint(0F, 45F, -14F);
		right7.setTextureSize(64, 64);
		right7.mirror = true;
		setRotation(right7, 0F, -0.2094395F, 0F);
		horizleft = new ModelRenderer(this, 0, 41);
		horizleft.addBox(0F, 0F, 0F, 10, 1, 3);
		horizleft.setRotationPoint(0F, 31F, -14F);
		horizleft.setTextureSize(64, 64);
		horizleft.mirror = true;
		setRotation(horizleft, 0F, 0.2094395F, 0F);
		horizright = new ModelRenderer(this, 26, 41);
		horizright.addBox(-10F, 0F, 0F, 10, 1, 3);
		horizright.setRotationPoint(0F, 31F, -14F);
		horizright.setTextureSize(64, 64);
		horizright.mirror = true;
		setRotation(horizright, 0F, -0.2094395F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.renderModel(f5);

	}

	@Override
	public void renderModel(float f5) {
		right1.render(f5);
		left1.render(f5);
		vertical.render(f5);
		left2.render(f5);
		left3.render(f5);
		left4.render(f5);
		left5.render(f5);
		left6.render(f5);
		left7.render(f5);
		right2.render(f5);
		right3.render(f5);
		right4.render(f5);
		right5.render(f5);
		right6.render(f5);
		right7.render(f5);
		horizleft.render(f5);
		horizright.render(f5);
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
