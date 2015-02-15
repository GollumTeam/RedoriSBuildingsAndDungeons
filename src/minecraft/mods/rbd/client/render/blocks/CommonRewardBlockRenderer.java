package mods.rbd.client.render.blocks;

import mods.gollum.core.tools.helper.IBlockMetadataHelper;
import mods.rbd.client.model.blocks.ModelStrangeGame;
import mods.rbd.common.tileentities.TileEntityCommonReward;
import mods.rbd.inits.ModBlocks;
import net.minecraft.tileentity.TileEntity;

public class CommonRewardBlockRenderer extends RBDTileEntitySpecialRenderer {
	
	private ModelStrangeGame modelStrangeGame = new ModelStrangeGame();
	
	protected void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f, int metadata, boolean invRender) {
		
		TileEntityCommonReward tileEntityCommonReward = (TileEntityCommonReward)tileEntity;
		float rotation = 0;
		int subBlock = ((IBlockMetadataHelper)ModBlocks.blockLightRewardOn).getEnabledMetadata(metadata);
		
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
		
		this.scale = 1.0;
		
		switch (subBlock) {
			default:
			case 0:
				this.scale = 0.5;
				this.renderModel(this.modelStrangeGame, "strangegame"  , x, y, z, rotation);
				
				break;
		}
	}
}
