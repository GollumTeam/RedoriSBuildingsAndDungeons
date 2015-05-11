package com.gollum.rbd.client.model.blocks;

import com.gollum.rbd.client.model.IRBDModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStrangeGame extends ModelBase implements IRBDModel {
	// fields
	ModelRenderer board1;
	ModelRenderer board2;
	ModelRenderer board3;
	ModelRenderer support;
	ModelRenderer atkboard1;
	ModelRenderer atkboard2;
	ModelRenderer atkboard3;
	ModelRenderer atkboard4;
	ModelRenderer base;
	ModelRenderer whitepiece3b;
	ModelRenderer blackpiece1;
	ModelRenderer whitepiece2;
	ModelRenderer blackpiece2;
	ModelRenderer whitepiece1;
	ModelRenderer blackpiece3;
	ModelRenderer blackpiece4a;
	ModelRenderer whitepiece3a;
	ModelRenderer blackpiece4b;
	ModelRenderer blackpiece5;
	ModelRenderer whitepiece4;
	ModelRenderer whitepiece5;
	ModelRenderer blackpiece6;
	ModelRenderer whitepiece6;

	public ModelStrangeGame() {
		textureWidth = 64;
		textureHeight = 64;

		board1 = new ModelRenderer(this, 0, 24);
		board1.addBox(-6F, 0F, 0F, 12, 2, 12);
		board1.setRotationPoint(-2F, 40F, 2F);
		board1.setTextureSize(64, 64);
		board1.mirror = true;
		setRotation(board1, 0F, 0.7853982F, 0F);
		board2 = new ModelRenderer(this, 0, 24);
		board2.addBox(-6F, 0F, 0F, 12, 2, 12);
		board2.setRotationPoint(-6F, 32F, -2F);
		board2.setTextureSize(64, 64);
		board2.mirror = true;
		setRotation(board2, 0F, 0.7853982F, 0F);
		board3 = new ModelRenderer(this, 0, 24);
		board3.addBox(-6F, 0F, 0F, 12, 2, 12);
		board3.setRotationPoint(-10F, 24F, -6F);
		board3.setTextureSize(64, 64);
		board3.mirror = true;
		setRotation(board3, 0F, 0.7853982F, 0F);
		support = new ModelRenderer(this, -24, 0);
		support.addBox(-13F, 0F, 0F, 26, 0, 24);
		support.setRotationPoint(-5F, 48F, -1F);
		support.setTextureSize(64, 64);
		support.mirror = true;
		setRotation(support, 1.570796F, -0.7853982F, 0F);
		atkboard1 = new ModelRenderer(this, 0, 38);
		atkboard1.addBox(0F, 0F, 0F, 6, 2, 6);
		atkboard1.setRotationPoint(6F, 36F, 6F);
		atkboard1.setTextureSize(64, 64);
		atkboard1.mirror = true;
		setRotation(atkboard1, 0F, 0.7853982F, 0F);
		atkboard2 = new ModelRenderer(this, 0, 38);
		atkboard2.addBox(0F, 0F, 0F, 6, 2, 6);
		atkboard2.setRotationPoint(-5F, 28F, 11F);
		atkboard2.setTextureSize(64, 64);
		atkboard2.mirror = true;
		setRotation(atkboard2, 0F, 0.7853982F, 0F);
		atkboard3 = new ModelRenderer(this, 0, 38);
		atkboard3.addBox(0F, 0F, 0F, 6, 2, 6);
		atkboard3.setRotationPoint(-10F, 20F, -10F);
		atkboard3.setTextureSize(64, 64);
		atkboard3.mirror = true;
		setRotation(atkboard3, 0F, 0.7853982F, 0F);
		atkboard4 = new ModelRenderer(this, 0, 38);
		atkboard4.addBox(0F, 0F, 0F, 6, 2, 6);
		atkboard4.setRotationPoint(-10F, 20F, 7F);
		atkboard4.setTextureSize(64, 64);
		atkboard4.mirror = true;
		setRotation(atkboard4, 0F, 0.7853982F, 0F);
		base = new ModelRenderer(this, 24, 38);
		base.addBox(0F, 0F, 0F, 8, 2, 8);
		base.setRotationPoint(-9F, 46F, -5F);
		base.setTextureSize(64, 64);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		whitepiece3b = new ModelRenderer(this, 40, 27);
		whitepiece3b.addBox(-0.5F, 0F, -0.05F, 1, 1, 1);
		whitepiece3b.setRotationPoint(0F, 26F, 8F);
		whitepiece3b.setTextureSize(64, 64);
		whitepiece3b.mirror = true;
		setRotation(whitepiece3b, 0F, 0.7853982F, 0F);
		blackpiece1 = new ModelRenderer(this, 0, 26);
		blackpiece1.addBox(-0.5F, 0F, -0.05F, 1, 2, 1);
		blackpiece1.setRotationPoint(-6F, 18F, -8F);
		blackpiece1.setTextureSize(64, 64);
		blackpiece1.mirror = true;
		setRotation(blackpiece1, 0F, 0F, 0F);
		whitepiece2 = new ModelRenderer(this, 4, 29);
		whitepiece2.addBox(-0.5F, 0F, -0.05F, 1, 3, 1);
		whitepiece2.setRotationPoint(2F, 37F, 12F);
		whitepiece2.setTextureSize(64, 64);
		whitepiece2.mirror = true;
		setRotation(whitepiece2, 0F, 0.7853982F, 0F);
		blackpiece2 = new ModelRenderer(this, 0, 26);
		blackpiece2.addBox(-0.5F, 0F, -0.05F, 1, 2, 1);
		blackpiece2.setRotationPoint(-12F, 22F, -2F);
		blackpiece2.setTextureSize(64, 64);
		blackpiece2.mirror = true;
		setRotation(blackpiece2, 0F, 0F, 0F);
		whitepiece1 = new ModelRenderer(this, 4, 26);
		whitepiece1.addBox(-0.5F, 0F, -0.05F, 1, 2, 1);
		whitepiece1.setRotationPoint(2F, 38F, 4F);
		whitepiece1.setTextureSize(64, 64);
		whitepiece1.mirror = true;
		setRotation(whitepiece1, 0F, 0F, 0F);
		blackpiece3 = new ModelRenderer(this, 0, 29);
		blackpiece3.addBox(-0.5F, 0F, -0.05F, 1, 3, 1);
		blackpiece3.setRotationPoint(-10F, 21F, -4F);
		blackpiece3.setTextureSize(64, 64);
		blackpiece3.mirror = true;
		setRotation(blackpiece3, 0F, 0.7853982F, 0F);
		blackpiece4a = new ModelRenderer(this, 36, 24);
		blackpiece4a.addBox(-0.5F, 0F, -0.05F, 1, 2, 1);
		blackpiece4a.setRotationPoint(-2F, 22F, -4F);
		blackpiece4a.setTextureSize(64, 64);
		blackpiece4a.mirror = true;
		setRotation(blackpiece4a, 0F, 0.7853982F, 0F);
		whitepiece3a = new ModelRenderer(this, 40, 24);
		whitepiece3a.addBox(0F, 0F, 0F, 1, 2, 1);
		whitepiece3a.setRotationPoint(-1F, 26F, 9F);
		whitepiece3a.setTextureSize(64, 64);
		whitepiece3a.mirror = true;
		setRotation(whitepiece3a, 0F, 0.7853982F, 0F);
		blackpiece4b = new ModelRenderer(this, 36, 27);
		blackpiece4b.addBox(-0.5F, 0F, -0.05F, 1, 1, 1);
		blackpiece4b.setRotationPoint(-1.5F, 22F, -3.5F);
		blackpiece4b.setTextureSize(64, 64);
		blackpiece4b.mirror = true;
		setRotation(blackpiece4b, 0F, 0.7853982F, 0F);
		blackpiece5 = new ModelRenderer(this, 0, 24);
		blackpiece5.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
		blackpiece5.setRotationPoint(5F, 31F, 2F);
		blackpiece5.setTextureSize(64, 64);
		blackpiece5.mirror = true;
		setRotation(blackpiece5, 0F, 0F, 0F);
		whitepiece4 = new ModelRenderer(this, 4, 24);
		whitepiece4.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
		whitepiece4.setRotationPoint(0F, 31F, 2F);
		whitepiece4.setTextureSize(64, 64);
		whitepiece4.mirror = true;
		setRotation(whitepiece4, 0F, 0F, 0F);
		whitepiece5 = new ModelRenderer(this, 4, 24);
		whitepiece5.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
		whitepiece5.setRotationPoint(-6F, 23F, 0F);
		whitepiece5.setTextureSize(64, 64);
		whitepiece5.mirror = true;
		setRotation(whitepiece5, 0F, 0F, 0F);
		blackpiece6 = new ModelRenderer(this, 0, 24);
		blackpiece6.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
		blackpiece6.setRotationPoint(-2F, 31F, 0F);
		blackpiece6.setTextureSize(64, 64);
		blackpiece6.mirror = true;
		setRotation(blackpiece6, 0F, 0F, 0F);
		whitepiece6 = new ModelRenderer(this, 4, 24);
		whitepiece6.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
		whitepiece6.setRotationPoint(1F, 27F, 11F);
		whitepiece6.setTextureSize(64, 64);
		whitepiece6.mirror = true;
		setRotation(whitepiece6, 0F, 0F, 0F);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.renderModel(f5);
	}

	@Override
	public void renderModel(float f5) {
		base.render(f5);
		support.render(f5);
		whitepiece3b.render(f5);
		blackpiece1.render(f5);
		whitepiece2.render(f5);
		blackpiece2.render(f5);
		whitepiece1.render(f5);
		blackpiece3.render(f5);
		blackpiece4a.render(f5);
		whitepiece3a.render(f5);
		blackpiece4b.render(f5);
		blackpiece5.render(f5);
		whitepiece4.render(f5);
		whitepiece5.render(f5);
		blackpiece6.render(f5);
		whitepiece6.render(f5);
	}
	public void renderModelBoard(float f5) {
		board1.render(f5);
		board2.render(f5);
		board3.render(f5);
		atkboard1.render(f5);
		atkboard2.render(f5);
		atkboard3.render(f5);
		atkboard4.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

}
