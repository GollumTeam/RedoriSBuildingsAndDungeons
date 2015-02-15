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
		this.scale = 0.25;
		beforeRender("chandelier", x, y, z, rotation);
		this.modelChandelier.renderModelFire(0.0625F);
		endRender();
		this.scale = 1.0;
	}
}
