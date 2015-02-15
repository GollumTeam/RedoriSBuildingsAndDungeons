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
	
	@Override
	protected void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f, int metadata, float rotation) {
		
		TileEntityLightReward tileEntityLightReward = (TileEntityLightReward)tileEntity;
		int subBlock = ((IBlockMetadataHelper)ModBlocks.blockLightRewardOn).getEnabledMetadata(metadata);
		
		this.light = false;
		switch (subBlock) {
			default:
			case 0:
				this.light = tileEntityLightReward.blockType == ModBlocks.blockLightRewardOn;
				this.renderModel(this.modelChandelier, "chandelier"  , x, y, z, rotation);
				
				if (this.light) {
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
