package mods.rbd.common.blocks;

import static net.minecraftforge.common.util.ForgeDirection.DOWN;
import static net.minecraftforge.common.util.ForgeDirection.UP;

import com.gollum.core.common.blocks.IBlockDisplayInfos;
import com.gollum.core.tools.helper.blocks.HBlockContainerMetadata;

import mods.rbd.ModRBD;
import mods.rbd.client.ClientProxyRBD;
import mods.rbd.common.tileentities.TileEntityReward;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public abstract class BlockReward extends HBlockContainerMetadata implements IBlockDisplayInfos {

	protected BlockReward(String registerName, int nbItem) {
		super(registerName, Material.rock, nbItem);
		
		this.setCreativeTab(ModRBD.tabRBD);
	}
	
	@Override
	public String displayDebugInfos(World world, int x, int y, int z) {
		String infos = "";
		TileEntity te = world.getTileEntity(x, y, z);
		if (te instanceof TileEntityReward) {
			infos += "orientation=" + ((TileEntityReward)te).orientation;
		}
		
		return infos;
	}
	
	//////////////////////////
	// Gestion des textures //
	//////////////////////////

	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public int getRenderType() {
		return ClientProxyRBD.idRewardBlockRenderer;
	}
	
	///////////
	// Event //
	///////////
	
	/**
	 * Called when the block is placed in the world.
	 */
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack item) {
		
		TileEntity te = world.getTileEntity(x, y, z);
		if (te instanceof TileEntityReward) {
			((TileEntityReward)te).orientation = this.getOrientation(entityLiving);
			world.notifyBlockOfNeighborChange(x, y, z, this);
		}
	}
	
	public boolean rotateBlock(World world, int x, int y, int z, ForgeDirection axis) {
		
		if (axis == UP || axis == DOWN) {
			
			TileEntity te = world.getTileEntity(x, y, z);
			if (te instanceof TileEntityReward) {
				
				TileEntityReward ter = (TileEntityReward) te;
				
				ter.orientation += axis == UP ? 1 : -1;
				if (ter.orientation >  3) {
					ter.orientation = 0;
				}
				if (ter.orientation <  0) {
					ter.orientation = 3;
				}
				world.notifyBlockOfNeighborChange(x, y, z, this);
				
				return true;	
			}
			
		}
		
		return false;
	}
	
	///////////////////
	// Data du block //
	///////////////////
	
	/**
	* Renvoi l'orientation du block par rapport � lentity
	* Pour le palcement
	* @param entity
	* @return
	*/
	public int getOrientation(Entity entity) {
		return (MathHelper.floor_double((double) (entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) % 4;
	}
	
	public ForgeDirection[] getValidRotations(World world, int x, int y, int z) {
		return new ForgeDirection[] { 
			ForgeDirection.NORTH, 
			ForgeDirection.SOUTH, 
			ForgeDirection.WEST, 
			ForgeDirection.EAST
		};
	}
}