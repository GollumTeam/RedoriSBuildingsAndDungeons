package com.gollum.rbd.client.render.blocks;

import org.lwjgl.opengl.GL11;

import com.gollum.core.tools.helper.IBlockMetadataHelper;
import com.gollum.rbd.client.model.blocks.ModelChandelier;
import com.gollum.rbd.common.tileentities.TileEntityLightReward;
import com.gollum.rbd.inits.ModBlocks;

import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.tileentity.TileEntity;

public class LightRewardBlockRenderer extends RBDTileEntitySpecialRenderer {
	
	private ModelChandelier modelChandelier = new ModelChandelier();
	
	@Override
	protected void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f, int metadata, float rotation) {
		
		TileEntityLightReward tileEntityLightReward = (TileEntityLightReward)tileEntity;
		int subBlock = ((IBlockMetadataHelper)ModBlocks.blockLightRewardOn).getEnabledMetadata(metadata);
		
		switch (subBlock) {
			default:
			case 0:
				this.scaleInventory = 1.65F;
				this.light = tileEntityLightReward.blockType == ModBlocks.blockLightRewardOn;
				if (this.isInventory) {
					rotation = (rotation+270)%360;
					this.light = true;
					y += 0.2;
				}
				this.rendedModelBase (x, y, z, rotation);
				this.renderModel(this.modelChandelier, "chandelier"  , x, y, z, rotation);
				this.scaleInventory = 1.0F;
				
				if (this.light) {
					this.rendedModelFire (x, y, z, rotation);
				}
				this.light = false;
				
				break;
		}
	}
	
	protected void rendedModelBase (double x, double y, double z, float rotation) {
		this.alpha = 0.50F;
		this.beforeRender("chandelier", x, y, z, rotation);
		this.modelChandelier.renderModelBase(0.0625F);
		this.endRender();
		this.alpha = 1.0F;
	}
	
	protected void rendedModelFire (double x, double y, double z, float rotation) {
		this.scale = 0.25;
		this.beforeRender("chandelier", x, y, z, rotation);
		this.modelChandelier.renderModelFire(0.0625F);
		this.endRender();
		this.scale = 1.0;
	}
}
