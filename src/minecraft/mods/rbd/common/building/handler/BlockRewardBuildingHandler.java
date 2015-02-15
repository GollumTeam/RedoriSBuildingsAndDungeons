package mods.rbd.common.building.handler;

import com.gollum.core.ModGollumCoreLib;
import com.gollum.core.common.building.Building.Unity;
import com.gollum.core.common.building.handler.BuildingBlockHandler;

import mods.rbd.common.blocks.BlockReward;
import mods.rbd.common.tileentities.TileEntityReward;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockRewardBuildingHandler extends BuildingBlockHandler {
	
	/**
	 * Affecte l'orientation
	 */
	@Override
	public void setOrientation(World world, int x, int y, int z, Block block, int metadata, int orientation, int rotate) {
		
		TileEntity te = world.getTileEntity(x, y, z);
		
		if (te instanceof TileEntityReward) {
			
			TileEntityReward ter = (TileEntityReward)te;
			
			if (orientation == Unity.ORIENTATION_NONE)  { ter.orientation = 2; } else 
			if (orientation == Unity.ORIENTATION_UP)    { ter.orientation = 2; } else 
			if (orientation == Unity.ORIENTATION_DOWN)  { ter.orientation = 0; } else 
			if (orientation == Unity.ORIENTATION_LEFT)  { ter.orientation = 3; } else 
			if (orientation == Unity.ORIENTATION_RIGTH) { ter.orientation = 1; } else 
			{
				ModGollumCoreLib.log.severe("Bad orientation : "+orientation+" name:"+block.getUnlocalizedName()+" pos:"+x+","+y+","+z);
			}
			world.notifyBlockChange(x, y, z, block);
			return;
		}
		
	}
	
}
