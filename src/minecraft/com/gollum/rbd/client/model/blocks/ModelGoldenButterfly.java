package com.gollum.rbd.client.model.blocks;

import com.gollum.rbd.client.model.IRBDModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGoldenButterfly extends ModelBase implements IRBDModel {
	// fields
	ModelRenderer base1;
	ModelRenderer base2;
	ModelRenderer base3;
	ModelRenderer base4;
	ModelRenderer leg4;
	ModelRenderer leg5;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg6;
	ModelRenderer body;
	ModelRenderer head;
	ModelRenderer back;
	ModelRenderer antenna2;
	ModelRenderer antenna1;
	ModelRenderer wing2;
	ModelRenderer wing1;
	ModelRenderer wing3;
	ModelRenderer wing4;

	public ModelGoldenButterfly() {
		textureWidth = 64;
		textureHeight = 64;

		base1 = new ModelRenderer(this, 0, 21);
		base1.addBox(-5F, 0F, -5F, 10, 2, 10);
		base1.setRotationPoint(0F, 46F, 0F);
		base1.setTextureSize(64, 64);
		base1.mirror = true;
		setRotation(base1, 0F, 0F, 0F);
		base2 = new ModelRenderer(this, 32, 15);
		base2.addBox(-3F, 0F, -3F, 6, 2, 6);
		base2.setRotationPoint(0F, 44F, 0F);
		base2.setTextureSize(64, 64);
		base2.mirror = true;
		setRotation(base2, 0F, 0F, 0F);
		base3 = new ModelRenderer(this, 0, 21);
		base3.addBox(-0.5F, 0F, -0.5F, 1, 7, 1);
		base3.setRotationPoint(0F, 37F, 0F);
		base3.setTextureSize(64, 64);
		base3.mirror = true;
		setRotation(base3, 0F, 0F, 0F);
		base4 = new ModelRenderer(this, 32, 23);
		base4.addBox(-1.5F, 0F, -1.5F, 3, 3, 3);
		base4.setRotationPoint(0F, 34F, 0F);
		base4.setTextureSize(64, 64);
		base4.mirror = true;
		setRotation(base4, 0F, 0F, 0F);
		leg4 = new ModelRenderer(this, 0, 4);
		leg4.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		leg4.setRotationPoint(-2F, 31F, -1F);
		leg4.setTextureSize(64, 64);
		leg4.mirror = true;
		setRotation(leg4, 0F, 0F, -0.2094395F);
		leg5 = new ModelRenderer(this, 0, 4);
		leg5.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		leg5.setRotationPoint(0F, 31F, -1F);
		leg5.setTextureSize(64, 64);
		leg5.mirror = true;
		setRotation(leg5, 0F, 0F, 0F);
		leg1 = new ModelRenderer(this, 0, 4);
		leg1.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		leg1.setRotationPoint(-2F, 31F, 1F);
		leg1.setTextureSize(64, 64);
		leg1.mirror = true;
		setRotation(leg1, 0F, 0F, -0.2094395F);
		leg2 = new ModelRenderer(this, 0, 4);
		leg2.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		leg2.setRotationPoint(0F, 31F, 1F);
		leg2.setTextureSize(64, 64);
		leg2.mirror = true;
		setRotation(leg2, 0F, 0F, 0F);
		leg3 = new ModelRenderer(this, 0, 4);
		leg3.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		leg3.setRotationPoint(2F, 31F, 1F);
		leg3.setTextureSize(64, 64);
		leg3.mirror = true;
		setRotation(leg3, 0F, 0F, 0.2094395F);
		leg6 = new ModelRenderer(this, 0, 4);
		leg6.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		leg6.setRotationPoint(2F, 31F, -1F);
		leg6.setTextureSize(64, 64);
		leg6.mirror = true;
		setRotation(leg6, 0F, 0F, 0.2094395F);
		body = new ModelRenderer(this, 39, 0);
		body.addBox(-3F, 0F, -1.5F, 6, 3, 3);
		body.setRotationPoint(0F, 28F, 0F);
		body.setTextureSize(64, 64);
		body.mirror = true;
		setRotation(body, 0F, 0F, -0.0698132F);
		head = new ModelRenderer(this, 0, 0);
		head.addBox(-1F, 0F, -1F, 2, 2, 2);
		head.setRotationPoint(3F, 27F, 0F);
		head.setTextureSize(64, 64);
		head.mirror = true;
		setRotation(head, 0F, 0F, -0.5759587F);
		back = new ModelRenderer(this, 39, 6);
		back.addBox(-3F, 0F, -1F, 6, 2, 2);
		back.setRotationPoint(-6F, 29F, 0F);
		back.setTextureSize(64, 64);
		back.mirror = true;
		setRotation(back, 0F, 0F, 0F);
		antenna2 = new ModelRenderer(this, 0, 8);
		antenna2.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
		antenna2.setRotationPoint(5F, 24F, -2F);
		antenna2.setTextureSize(64, 64);
		antenna2.mirror = true;
		setRotation(antenna2, 0.3839724F, 0F, 0.3665191F);
		antenna1 = new ModelRenderer(this, 0, 8);
		antenna1.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
		antenna1.setRotationPoint(5F, 24F, 2F);
		antenna1.setTextureSize(64, 64);
		antenna1.mirror = true;
		setRotation(antenna1, -0.3839724F, 0F, 0.3665191F);
		wing2 = new ModelRenderer(this, 0, 0);
		wing2.addBox(-7F, 0F, 0F, 14, 0, 11);
		wing2.setRotationPoint(1F, 28F, 0.5F);
		wing2.setTextureSize(64, 64);
		wing2.mirror = true;
		setRotation(wing2, 0.5235988F, 0F, -0.122173F);
		wing1 = new ModelRenderer(this, 0, 11);
		wing1.addBox(-11F, 0F, -1F, 14, 0, 10);
		wing1.setRotationPoint(-3F, 28.5F, 1F);
		wing1.setTextureSize(64, 64);
		wing1.mirror = true;
		setRotation(wing1, 0.3490659F, 0.1745329F, 0F);
		wing3 = new ModelRenderer(this, 18, 33);
		wing3.addBox(-11F, 0F, -1F, 14, 0, 10);
		wing3.setRotationPoint(-3F, 28.5F, -1F);
		wing3.setTextureSize(64, 64);
		wing3.mirror = true;
		setRotation(wing3, 2.792526F, 0.1745329F, 0F);
		wing4 = new ModelRenderer(this, -11, 33);
		wing4.addBox(-7F, 0F, 0F, 14, 0, 11);
		wing4.setRotationPoint(1F, 28F, -0.5F);
		wing4.setTextureSize(64, 64);
		wing4.mirror = true;
		setRotation(wing4, 2.617994F, 0F, -0.122173F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.renderModel(f5);
	}
	
	@Override
	public void renderModel(float f5) {
		base1.render(f5);
		base2.render(f5);
		base3.render(f5);
		base4.render(f5);
		leg4.render(f5);
		leg5.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg6.render(f5);
		body.render(f5);
		head.render(f5);
		back.render(f5);
		antenna2.render(f5);
		antenna1.render(f5);
		wing2.render(f5);
		wing1.render(f5);
		wing3.render(f5);
		wing4.render(f5);
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
