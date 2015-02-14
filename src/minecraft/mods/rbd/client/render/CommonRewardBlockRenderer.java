package mods.rbd.client.render;

import mods.gollum.core.tools.helper.IBlockMetadataHelper;
import mods.rbd.client.model.ModelChandelier;
import mods.rbd.common.tileentities.TileEntityCommonReward;
import mods.rbd.inits.ModBlocks;
import net.minecraft.tileentity.TileEntity;

public class CommonRewardBlockRenderer extends RBDTileEntitySpecialRenderer {
	
	private ModelChandelier modelChandelier = new ModelChandelier();
	
	protected void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f, int metadata, boolean invRender) {
		
		TileEntityCommonReward tileEntityCommonReward = (TileEntityCommonReward)tileEntity;
		float rotation = 0;
		int subBlock = ((IBlockMetadataHelper)ModBlocks.blockUncommonReward).getEnabledMetadata(metadata);
		
		switch (tileEntityCommonReward.orientation) {
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
			case 0:  this.renderModel(this.modelChandelier, "chandelier"  , x, y, z, rotation); break;
		}
	}
}
