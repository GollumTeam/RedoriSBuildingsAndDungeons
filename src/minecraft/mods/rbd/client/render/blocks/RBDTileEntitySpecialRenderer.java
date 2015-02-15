package mods.rbd.client.render.blocks;

import java.util.HashMap;

import mods.rbd.ModRBD;
import mods.rbd.client.model.IRBDModel;
import mods.rbd.common.tileentities.TileEntityReward;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public abstract class RBDTileEntitySpecialRenderer extends TileEntitySpecialRenderer {
	private HashMap<String, ResourceLocation> textures = new HashMap<String, ResourceLocation>();
	protected double scale = 1.0;
	protected boolean light;

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		try {
			int metadata;
			metadata = tileEntity.getBlockMetadata();
			float rotation = 0;
			switch (((TileEntityReward)tileEntity).orientation) {
				default:
				case 0:
					rotation = 180; break;
				case 1:
					rotation = 90; break;
				case 2:
					rotation = 0; break;
				case 3:
					rotation = 270; break;
			}
			
			this.renderTileEntityAt(tileEntity, x, y, z, f, metadata, rotation);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected ResourceLocation getTexture(String name) {
		if (this.textures.containsKey(name)) {
			return this.textures.get(name);
		}
		ResourceLocation texture = new ResourceLocation(ModRBD.MODID.toLowerCase() + ":textures/blocks/" + name + ".png");
		this.textures.put(name, texture);
		return texture;
	}
	
	protected void renderModel(IRBDModel model, String textureName, double x, double y, double z, float rotation) {
		beforeRender(textureName, x, y, z, rotation);
		model.renderModel(0.0625F);
		endRender();
	}
	
	protected void beforeRender(String textureName, double x, double y, double z, float rotation) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		GL11.glRotatef((float) rotation, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
		GL11.glScaled(this.scale , this.scale, this.scale);
		this.bindTexture(this.getTexture(textureName));
		GL11.glPushMatrix();
		if (this.light) {
			RenderHelper.disableStandardItemLighting();
		} else {
			RenderHelper.enableStandardItemLighting();
		}
	}
	
	protected void endRender() {
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
	
	
	protected abstract void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f, int metadata, float rotation);
}