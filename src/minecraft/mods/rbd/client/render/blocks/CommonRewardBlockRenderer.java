package mods.rbd.client.render.blocks;

import mods.gollum.core.tools.helper.IBlockMetadataHelper;
import mods.rbd.client.model.blocks.ModelStrangeGame;
import mods.rbd.common.tileentities.TileEntityCommonReward;
import mods.rbd.inits.ModBlocks;
import net.minecraft.tileentity.TileEntity;

public class CommonRewardBlockRenderer extends RBDTileEntitySpecialRenderer {
	
	private ModelStrangeGame modelStrangeGame = new ModelStrangeGame();
	
	@Override
	protected void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f, int metadata, float rotation) {
		
		TileEntityCommonReward tileEntityCommonReward = (TileEntityCommonReward)tileEntity;
		int subBlock = ((IBlockMetadataHelper)ModBlocks.blockLightRewardOn).getEnabledMetadata(metadata);
		
		
		this.scale = 1.0;
		
		switch (subBlock) {
			default:
			case 0:
				this.scale = 0.5;
				this.renderModel(this.modelStrangeGame, "strangegame"  , x, y, z, (rotation+90)%360);
				
				break;
		}
	}
}
