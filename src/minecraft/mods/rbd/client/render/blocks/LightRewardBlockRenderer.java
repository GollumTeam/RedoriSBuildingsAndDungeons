package mods.rbd.client.render.blocks;

import org.lwjgl.opengl.GL11;

import mods.gollum.core.tools.helper.IBlockMetadataHelper;
import mods.rbd.client.model.blocks.ModelChandelier;
import mods.rbd.common.tileentities.TileEntityLightReward;
import mods.rbd.inits.ModBlocks;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.tileentity.TileEntity;

public class LightRewardBlockRenderer extends RBDTileEntitySpecialRenderer {
	
	private ModelChandelier modelChandelier = new ModelChandelier();
	
	protected void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f, int metadata, boolean invRender) {
		
		TileEntityLightReward tileEntityLightReward = (TileEntityLightReward)tileEntity;
		float rotation = 0;
		int subBlock = ((IBlockMetadataHelper)ModBlocks.blockLightRewardOn).getEnabledMetadata(metadata);
		
		switch (tileEntityLightReward.orientation) {
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

		switch (subBlock) {
			default:
			case 0:
				boolean light = tileEntityLightReward.blockType == ModBlocks.blockLightRewardOn;
				this.renderModel(this.modelChandelier, "chandelier"  , x, y, z, rotation, light);
				
				if (light) {
					this.rendedModelFire (x, y, z, rotation);
				}
				
				break;
		}
	}
	
	protected void rendedModelFire (double x, double y, double z, float rotation) {
		GL11.glPushMatrix();
		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		GL11.glRotatef((float) rotation, 0.0F, 1.0F, 0.0F);
		GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
		GL11.glScaled(0.25, 0.25, 0.25);
		this.bindTexture(this.getTexture("chandelier"));
		GL11.glPushMatrix();
		RenderHelper.disableStandardItemLighting();
		
		this.modelChandelier.renderModelFire(0.0625F);
		
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
}
