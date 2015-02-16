package com.gollum.rbd.client.model.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.gollum.rbd.client.model.IRBDModel;

public class ModelGrannysCanvas extends ModelBase implements IRBDModel {
	// fields
	ModelRenderer canvas;
	ModelRenderer stick1;
	ModelRenderer stick5;
	ModelRenderer stick3;
	ModelRenderer stick7;
	ModelRenderer stick8;
	ModelRenderer stick4;
	ModelRenderer stick2;
	ModelRenderer stick6;

	public ModelGrannysCanvas() {
		textureWidth = 64;
		textureHeight = 64;

		canvas = new ModelRenderer(this, 0, 0);
		canvas.addBox(-12F, -8F, 0F, 24, 16, 1);
		canvas.setRotationPoint(0F, 31F, -16F);
		canvas.setTextureSize(64, 64);
		canvas.mirror = true;
		setRotation(canvas, -0.0174533F, 0F, 0F);
		stick1 = new ModelRenderer(this, 0, 17);
		stick1.addBox(-13F, 0F, 0F, 30, 1, 1);
		stick1.setRotationPoint(-2F, 20F, -14F);
		stick1.setTextureSize(64, 64);
		stick1.mirror = true;
		setRotation(stick1, 0F, 0F, 0F);
		stick5 = new ModelRenderer(this, 0, 23);
		stick5.addBox(-13F, 0F, 0F, 30, 1, 1);
		stick5.setRotationPoint(-2F, 41F, -14F);
		stick5.setTextureSize(64, 64);
		stick5.mirror = true;
		setRotation(stick5, 0F, 0F, 0F);
		stick3 = new ModelRenderer(this, 0, 29);
		stick3.addBox(0F, 0F, 0F, 1, 20, 1);
		stick3.setRotationPoint(-15F, 21F, -14F);
		stick3.setTextureSize(64, 64);
		stick3.mirror = true;
		setRotation(stick3, 0F, 0F, 0F);
		stick7 = new ModelRenderer(this, 12, 29);
		stick7.addBox(0F, 0F, 0F, 1, 20, 1);
		stick7.setRotationPoint(14F, 21F, -14F);
		stick7.setTextureSize(64, 64);
		stick7.mirror = true;
		setRotation(stick7, 0F, 0F, 0F);
		stick8 = new ModelRenderer(this, 16, 29);
		stick8.addBox(0F, 0F, 0F, 2, 16, 2);
		stick8.setRotationPoint(12F, 23F, -16F);
		stick8.setTextureSize(64, 64);
		stick8.mirror = true;
		setRotation(stick8, 0F, 0F, 0F);
		stick4 = new ModelRenderer(this, 4, 29);
		stick4.addBox(0F, 0F, 0F, 2, 16, 2);
		stick4.setRotationPoint(-14F, 23F, -16F);
		stick4.setTextureSize(64, 64);
		stick4.mirror = true;
		setRotation(stick4, 0F, 0F, 0F);
		stick2 = new ModelRenderer(this, 0, 19);
		stick2.addBox(-14F, 0F, 0F, 28, 2, 2);
		stick2.setRotationPoint(0F, 21F, -16F);
		stick2.setTextureSize(64, 64);
		stick2.mirror = true;
		setRotation(stick2, 0F, 0F, 0F);
		stick6 = new ModelRenderer(this, 0, 25);
		stick6.addBox(-14F, 0F, 0F, 28, 2, 2);
		stick6.setRotationPoint(0F, 39F, -16F);
		stick6.setTextureSize(64, 64);
		stick6.mirror = true;
		setRotation(stick6, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.renderModel(f5);
	}

	@Override
	public void renderModel(float f5) {
		canvas.render(f5);
		stick1.render(f5);
		stick5.render(f5);
		stick3.render(f5);
		stick7.render(f5);
		stick8.render(f5);
		stick4.render(f5);
		stick2.render(f5);
		stick6.render(f5);
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
