package mods.rbd.client.model.blocks;

import mods.rbd.client.model.IRBDModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelChandelier extends ModelBase implements IRBDModel {
	// fields
	ModelRenderer socle;
	ModelRenderer corps1;
	ModelRenderer corps3;
	ModelRenderer corps4;
	ModelRenderer corps2;
	ModelRenderer corps5;
	ModelRenderer bras1;
	ModelRenderer bras4;
	ModelRenderer bras2;
	ModelRenderer bras3;
	ModelRenderer base5;
	ModelRenderer base2;
	ModelRenderer base3;
	ModelRenderer base1;
	ModelRenderer base4;
	ModelRenderer bougie5;
	ModelRenderer bougie2;
	ModelRenderer bougie3;
	ModelRenderer bougie4;
	ModelRenderer bougie1;
	ModelRenderer flamme1a;
	ModelRenderer flamme2a;
	ModelRenderer flamme3a;
	ModelRenderer flamme3b;
	ModelRenderer flamme4a;
	ModelRenderer flamme4b;
	ModelRenderer flamme1b;
	ModelRenderer flamme2b;
	ModelRenderer flamme5a;
	ModelRenderer flamme5b;

	public ModelChandelier() {
		textureWidth = 32;
		textureHeight = 32;

		socle = new ModelRenderer(this, 4, 0);
		socle.addBox(-3.5F, 0F, -3.5F, 7, 1, 7);
		socle.setRotationPoint(0F, 23F, 0F);
		socle.setTextureSize(32, 32);
		socle.mirror = true;
		setRotation(socle, 0F, 0F, 0F);
		corps1 = new ModelRenderer(this, 0, 0);
		corps1.addBox(0.5F, 0F, 0.5F, 1, 3, 1);
		corps1.setRotationPoint(0F, 20F, 0F);
		corps1.setTextureSize(32, 32);
		corps1.mirror = true;
		setRotation(corps1, 0F, 0F, 0F);
		corps3 = new ModelRenderer(this, 4, 0);
		corps3.addBox(-1.5F, 0F, -1.5F, 1, 4, 1);
		corps3.setRotationPoint(0F, 19F, 0F);
		corps3.setTextureSize(32, 32);
		corps3.mirror = true;
		setRotation(corps3, 0F, 0F, 0F);
		corps4 = new ModelRenderer(this, 0, 0);
		corps4.addBox(-1.5F, 0F, 0.5F, 1, 3, 1);
		corps4.setRotationPoint(0F, 20F, 0F);
		corps4.setTextureSize(32, 32);
		corps4.mirror = true;
		setRotation(corps4, 0F, 0F, 0F);
		corps2 = new ModelRenderer(this, 4, 0);
		corps2.addBox(0.5F, 0F, -1.5F, 1, 4, 1);
		corps2.setRotationPoint(0F, 19F, 0F);
		corps2.setTextureSize(32, 32);
		corps2.mirror = true;
		setRotation(corps2, 0F, 0F, 0F);
		corps5 = new ModelRenderer(this, 0, 0);
		corps5.addBox(-0.5F, 0F, -0.5F, 1, 9, 1);
		corps5.setRotationPoint(0F, 14F, 0F);
		corps5.setTextureSize(32, 32);
		corps5.mirror = true;
		setRotation(corps5, 0F, 0F, 0F);
		bras1 = new ModelRenderer(this, 25, 0);
		bras1.addBox(-0.5F, -0.5F, -0.5F, 1, 4, 1);
		bras1.setRotationPoint(1F, 20F, 1F);
		bras1.setTextureSize(32, 32);
		bras1.mirror = true;
		setRotation(bras1, 0F, -0.3490659F, -1.832596F);
		bras4 = new ModelRenderer(this, 25, 0);
		bras4.addBox(-0.5F, -0.5F, -0.5F, 1, 4, 1);
		bras4.setRotationPoint(-1F, 20F, 1F);
		bras4.setTextureSize(32, 32);
		bras4.mirror = true;
		setRotation(bras4, 0F, 0.3490659F, 1.832596F);
		bras2 = new ModelRenderer(this, 25, 0);
		bras2.addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1);
		bras2.setRotationPoint(1F, 19F, -1F);
		bras2.setTextureSize(32, 32);
		bras2.mirror = true;
		setRotation(bras2, 0F, 0.5235988F, -2.6529F);
		bras3 = new ModelRenderer(this, 25, 0);
		bras3.addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1);
		bras3.setRotationPoint(-1F, 19F, -1F);
		bras3.setTextureSize(32, 32);
		bras3.mirror = true;
		setRotation(bras3, 0F, -0.5235988F, 2.6529F);
		base5 = new ModelRenderer(this, 4, 8);
		base5.addBox(-1F, 0F, -1F, 2, 1, 2);
		base5.setRotationPoint(0F, 13F, 0F);
		base5.setTextureSize(32, 32);
		base5.mirror = true;
		setRotation(base5, 0F, 0F, 0F);
		base2 = new ModelRenderer(this, 12, 8);
		base2.addBox(-1F, 0F, -1F, 2, 1, 2);
		base2.setRotationPoint(2.5F, 15F, -2F);
		base2.setTextureSize(32, 32);
		base2.mirror = true;
		setRotation(base2, 0F, 0F, 0F);
		base3 = new ModelRenderer(this, 12, 8);
		base3.addBox(-1F, 0F, -1F, 2, 1, 2);
		base3.setRotationPoint(-2.5F, 15F, -2F);
		base3.setTextureSize(32, 32);
		base3.mirror = true;
		setRotation(base3, 0F, 0F, 0F);
		base1 = new ModelRenderer(this, 4, 8);
		base1.addBox(-1F, 0F, -1F, 2, 1, 2);
		base1.setRotationPoint(4F, 18.5F, 2F);
		base1.setTextureSize(32, 32);
		base1.mirror = true;
		setRotation(base1, 0F, 0F, 0F);
		base4 = new ModelRenderer(this, 4, 8);
		base4.addBox(-1F, 0F, -1F, 2, 1, 2);
		base4.setRotationPoint(-4F, 18.5F, 2F);
		base4.setTextureSize(32, 32);
		base4.mirror = true;
		setRotation(base4, 0F, 0F, 0F);
		bougie5 = new ModelRenderer(this, 22, 8);
		bougie5.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
		bougie5.setRotationPoint(0F, 9F, 0F);
		bougie5.setTextureSize(32, 32);
		bougie5.mirror = true;
		setRotation(bougie5, 0F, 0F, 0F);
		bougie2 = new ModelRenderer(this, 22, 8);
		bougie2.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
		bougie2.setRotationPoint(2.5F, 11F, -2F);
		bougie2.setTextureSize(32, 32);
		bougie2.mirror = true;
		setRotation(bougie2, 0F, 0F, 0F);
		bougie3 = new ModelRenderer(this, 22, 8);
		bougie3.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
		bougie3.setRotationPoint(-2.5F, 11F, -2F);
		bougie3.setTextureSize(32, 32);
		bougie3.mirror = true;
		setRotation(bougie3, 0F, 0F, 0F);
		bougie4 = new ModelRenderer(this, 22, 8);
		bougie4.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
		bougie4.setRotationPoint(-4F, 14.5F, 2F);
		bougie4.setTextureSize(32, 32);
		bougie4.mirror = true;
		setRotation(bougie4, 0F, 0F, 0F);
		bougie1 = new ModelRenderer(this, 22, 8);
		bougie1.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
		bougie1.setRotationPoint(4F, 14.5F, 2F);
		bougie1.setTextureSize(32, 32);
		bougie1.mirror = true;
		setRotation(bougie1, 0F, 0F, 0F);
		
		flamme1a = new ModelRenderer(this, 0, 11);
		flamme1a.addBox(-8.0F, 40.5F, 12.0F, 4, 4, 0);
		flamme1a.setRotationPoint(4F, 13.5F, 2F);
		flamme1a.setTextureSize(32, 32);
		flamme1a.mirror = true;
		setRotation(flamme1a, 0F, 1.570796F, 0F);
		
		flamme1b = new ModelRenderer(this, 0, 11);
		flamme1b.addBox(19.5F, 40.5F, 6.0F, 4, 4, 0);
		flamme1b.setRotationPoint(-5.5F, 13.5F, 2F);
		flamme1b.setTextureSize(32, 32);
		flamme1b.mirror = true;
		
		flamme2a = new ModelRenderer(this, 0, 11);
		flamme2a.addBox(4.0F, 30.0F, 7.5F, 4, 4, 0);
		flamme2a.setRotationPoint(2.5F, 10F, -2F);
		flamme2a.setTextureSize(32, 32);
		flamme2a.mirror = true;
		setRotation(flamme2a, 0F, 1.570796F, 0F);
		
		flamme2b = new ModelRenderer(this, 0, 11);
		flamme2b.addBox(-8.0F, 30F, -6.0F, 4, 4, 0);
		flamme2b.setRotationPoint(-4F, 10F, -2F);
		flamme2b.setTextureSize(32, 32);
		flamme2b.mirror = true;
		setRotation(flamme2b, 0F, 0F, 0F);
		
		flamme3a = new ModelRenderer(this, 0, 11);
		flamme3a.addBox(4.0F, 30F, -7.5F, 4, 4, 0);
		flamme3a.setRotationPoint(-2.5F, 10F, -2F);
		flamme3a.setTextureSize(32, 32);
		flamme3a.mirror = true;
		setRotation(flamme3a, 0F, 1.570796F, 0F);
		
		flamme3b = new ModelRenderer(this, 0, 11);
		flamme3b.addBox(12.0F, 30F, -6.0F, 4, 4, 0);
		flamme3b.setRotationPoint(-4F, 10F, -2F);
		flamme3b.setTextureSize(32, 32);
		flamme3b.mirror = true;
		setRotation(flamme2b, 0F, 0F, 0F);
		
		flamme4a = new ModelRenderer(this, 0, 11);
		flamme4a.addBox(-8.0F, 40.5F, -12F, 4, 4, 0);
		flamme4a.setRotationPoint(-4F, 13.5F, 2F);
		flamme4a.setTextureSize(32, 32);
		flamme4a.mirror = true;
		setRotation(flamme4a, 0F, 1.570796F, 0F);
		
		flamme4b = new ModelRenderer(this, 0, 11);
		flamme4b.addBox(-12.5F, 40.5F, 6.0F, 4, 4, 0);
		flamme4b.setRotationPoint(-5.5F, 13.5F, 2F);
		flamme4b.setTextureSize(32, 32);
		flamme4b.mirror = true;
		
		setRotation(flamme4b, 0F, 0F, 0F);
		flamme5a = new ModelRenderer(this, 0, 11);
		flamme5a.addBox(-1.5F, 24.0F, 0F, 4, 4, 0);
		flamme5a.setRotationPoint(-0.5F, 8F, 0F);
		flamme5a.setTextureSize(32, 32);
		flamme5a.mirror = true;
		setRotation(flamme5a, 0F, 0F, 0F);
		
		flamme5b = new ModelRenderer(this, 0, 11);
		flamme5b.addBox(-2.0F, 24.0F, 0F, 4, 4, 0);
		flamme5b.setRotationPoint(0F, 8F, 0F);
		flamme5b.setTextureSize(32, 32);
		flamme5b.mirror = true;
		setRotation(flamme5b, 0F, 1.570796F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		this.renderModel(f5);
	}
	
	@Override
	public void renderModel(float f5) {
		socle.render(f5);
		corps1.render(f5);
		corps3.render(f5);
		corps4.render(f5);
		corps2.render(f5);
		corps5.render(f5);
		bras1.render(f5);
		bras4.render(f5);
		bras2.render(f5);
		bras3.render(f5);
		base5.render(f5);
		base2.render(f5);
		base3.render(f5);
		base1.render(f5);
		base4.render(f5);
		bougie5.render(f5);
		bougie2.render(f5);
		bougie3.render(f5);
		bougie4.render(f5);
		bougie1.render(f5);
	}
	
	public void renderModelFire(float f5) {
		flamme1a.render(f5);
		flamme1b.render(f5);
		flamme2a.render(f5);
		flamme2b.render(f5);
		flamme3a.render(f5);
		flamme3b.render(f5);
		flamme4a.render(f5);
		flamme4b.render(f5);
		flamme5a.render(f5);
		flamme5b.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}

}
