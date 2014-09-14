package mods.rbd.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFaery extends ModelBiped
{
  //fields
//    ModelRenderer bipedHead;
//    ModelRenderer bipedBody;
//    ModelRenderer bipedRightArm;
//    ModelRenderer bipedLeftArm;
//    ModelRenderer bipedRightLeg;
//    ModelRenderer bipedLeftLeg;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
  
  public ModelFaery()
  {
    textureWidth = 32;
    textureHeight = 32;
    
      bipedHead = new ModelRenderer(this, 0, 7);
      bipedHead.addBox(-1F, -2F, -1F, 2, 2, 2);
      bipedHead.setRotationPoint(0F, 12F, 0F);
      bipedHead.setTextureSize(32, 32);
      bipedHead.mirror = true;
      setRotation(bipedHead, 0F, 0F, 0F);
      bipedBody = new ModelRenderer(this, 0, 0);
      bipedBody.addBox(-1.5F, 0F, -0.5F, 3, 6, 1);
      bipedBody.setRotationPoint(0F, 12F, 0F);
      bipedBody.setTextureSize(32, 32);
      bipedBody.mirror = true;
      setRotation(bipedBody, 0F, 0F, 0F);
      bipedRightArm = new ModelRenderer(this, 16, 0);
      bipedRightArm.addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1);
      bipedRightArm.setRotationPoint(-2F, 12.5F, 0F);
      bipedRightArm.setTextureSize(32, 32);
      bipedRightArm.mirror = true;
      setRotation(bipedRightArm, 0F, 0F, 0F);
      bipedLeftArm = new ModelRenderer(this, 16, 6);
      bipedLeftArm.addBox(-0.5F, -0.5F, -0.5F, 1, 5, 1);
      bipedLeftArm.setRotationPoint(2F, 12.5F, 0F);
      bipedLeftArm.setTextureSize(32, 32);
      bipedLeftArm.mirror = true;
      setRotation(bipedLeftArm, 0F, 0F, 0F);
      bipedRightLeg = new ModelRenderer(this, 12, 0);
      bipedRightLeg.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
      bipedRightLeg.setRotationPoint(-1F, 18F, 0F);
      bipedRightLeg.setTextureSize(32, 32);
      bipedRightLeg.mirror = true;
      setRotation(bipedRightLeg, 0F, 0F, 0F);
      bipedLeftLeg = new ModelRenderer(this, 8, 0);
      bipedLeftLeg.addBox(-0.5F, 0F, -0.5F, 1, 6, 1);
      bipedLeftLeg.setRotationPoint(1F, 18F, 0F);
      bipedLeftLeg.setTextureSize(32, 32);
      bipedLeftLeg.mirror = true;
      setRotation(bipedLeftLeg, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 2);
      Shape1.addBox(0F, -8F, 0F, 0, 19, 10);
      Shape1.setRotationPoint(0.3F, 14F, 0.5F);
      Shape1.setTextureSize(32, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0.1919862F, 0F, 0.0349066F);
      Shape2 = new ModelRenderer(this, 0, 2);
      Shape2.addBox(0F, -8F, 0F, 0, 19, 10);
      Shape2.setRotationPoint(-0.3F, 14F, 0F);
      Shape2.setTextureSize(32, 32);
      setRotation(Shape2, 0.1919862F, 0F, -0.0349066F);
      Shape2.mirror = false;
      
      bipedEars.showModel = false;
      bipedCloak.showModel = false;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
//    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    bipedHead.render(f5);
    bipedBody.render(f5);
    bipedRightArm.render(f5);
    bipedLeftArm.render(f5);
    bipedRightLeg.render(f5);
    bipedLeftLeg.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity) {
//	  super.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
  }

}
