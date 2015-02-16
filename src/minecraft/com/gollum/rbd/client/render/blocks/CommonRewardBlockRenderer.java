package com.gollum.rbd.client.render.blocks;

import com.gollum.core.tools.helper.IBlockMetadataHelper;
import com.gollum.rbd.client.model.blocks.ModelGoldenButterfly;
import com.gollum.rbd.client.model.blocks.ModelGrannysCanvas;
import com.gollum.rbd.client.model.blocks.ModelStrangeGame;
import com.gollum.rbd.common.tileentities.TileEntityCommonReward;
import com.gollum.rbd.inits.ModBlocks;

import net.minecraft.tileentity.TileEntity;

public class CommonRewardBlockRenderer extends RBDTileEntitySpecialRenderer {

	private ModelStrangeGame     modelStrangeGame     = new ModelStrangeGame();
	private ModelGoldenButterfly modelGoldenButterfly = new ModelGoldenButterfly();
	private ModelGrannysCanvas   modelGrannysCanvas   = new ModelGrannysCanvas();
	
	@Override
	protected void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f, int metadata, float rotation) {
		
		TileEntityCommonReward tileEntityCommonReward = (TileEntityCommonReward)tileEntity;
		int subBlock = ((IBlockMetadataHelper)ModBlocks.blockLightRewardOn).getEnabledMetadata(metadata);
		
		
		this.light = true;
		
		switch (metadata) {
			default:
			case 0:
				this.scale = 0.5;
				this.scaleInventory = 1.6F;
				rotation = (rotation+90)%360;
				if (this.isInventory) {
					this.light = false;
					rotation = (rotation+310)%360;
				}
				this.renderModel(this.modelStrangeGame, "strangegame"  , x, y, z, rotation);
				this.rendedModelBoard (x, y, z, rotation);
				this.scaleInventory = 1.0F;
				this.scale = 1.0;
				
				break;
			case 1:
				this.scale = 0.5;
				this.scaleInventory = 1.6F;
				rotation = (rotation+90)%360;
				if (this.isInventory) {
					rotation = (rotation+270)%360;
					y += 0.1;
				}
				this.renderModel(this.modelGoldenButterfly, "goldenbutterfly"  , x, y, z, rotation);
				this.scaleInventory = 1.0F;
				this.scale = 1.0;
				
				break;
			case 2:
				this.scale = 0.5;
				this.scaleInventory = 1.5F;
				this.lightInventory = false;
				if (this.isInventory) {
					rotation = (rotation+225)%360;
					y -= 0.3;
					x -= 0.07;
				}
				this.renderModel(this.modelGrannysCanvas, "grannyscanvas"  , x, y, z, rotation);
				this.lightInventory = true;
				this.scaleInventory = 1.0F;
				this.scale = 1.0;
				
				break;
		}
	}
	
	protected void rendedModelBoard (double x, double y, double z, float rotation) {
		this.alpha = 0.65F;
		this.beforeRender("strangegame", x, y, z, rotation);
		this.modelStrangeGame.renderModelBoard(0.0625F);
		this.endRender();
		this.alpha = 1.0F;
	}
}
