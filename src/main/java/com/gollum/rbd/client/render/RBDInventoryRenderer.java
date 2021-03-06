package com.gollum.rbd.client.render;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class RBDInventoryRenderer implements ISimpleBlockRenderingHandler {
	
	private static int currentMetadata;

	public static int getCurrentMetadata() {
		return currentMetadata;
	}
	
	public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
		
		TileEntityRendererDispatcher.instance.renderTileEntityAt(((BlockContainer)block).createNewTileEntity(null, metadata), 0.0D, -0.1D, 0.0D, 0.0F);
		
	}
	
	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		return false;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return true;
	}
	
	@Override
	public int getRenderId() {
		return 0;
	}
}
