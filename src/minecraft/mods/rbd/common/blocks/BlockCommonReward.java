package mods.rbd.common.blocks;

import static net.minecraftforge.common.util.ForgeDirection.DOWN;
import static net.minecraftforge.common.util.ForgeDirection.UP;
import mods.gollum.core.common.blocks.IBlockDisplayInfos;
import mods.gollum.core.tools.helper.blocks.HBlockContainerMetadata;
import mods.rbd.ModRBD;
import mods.rbd.client.ClientProxyRBD;
import mods.rbd.common.tileentities.TileEntityCommonReward;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.common.util.RotationHelper;

public class BlockCommonReward extends HBlockContainerMetadata implements IBlockDisplayInfos {

	public BlockCommonReward(String registerName) {
		this(registerName, 16);
	}
	
	protected BlockCommonReward(String registerName, int nbItem) {
		super(registerName, Material.rock, nbItem);
		
		this.setCreativeTab(ModRBD.tabRBD);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityCommonReward(metadata);
	}
	
	@Override
	public String displayDebugInfos(World world, int x, int y, int z) {
		String infos = "";
		TileEntity te = world.getTileEntity(x, y, z);
		if (te instanceof TileEntityCommonReward) {
			infos += "orientation=" + ((TileEntityCommonReward)te).orientation;
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
		return ClientProxyRBD.idCommonRewardBlockRenderer;
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
		if (te instanceof TileEntityCommonReward) {
			((TileEntityCommonReward)te).orientation = this.getOrientation(entityLiving);
			world.notifyBlockOfNeighborChange(x, y, z, this);
		}
	}
	
	public boolean rotateBlock(World world, int x, int y, int z, ForgeDirection axis) {
		
		if (axis == UP || axis == DOWN) {
			
			TileEntity te = world.getTileEntity(x, y, z);
			if (te instanceof TileEntityCommonReward) {
				
				TileEntityCommonReward tecr = (TileEntityCommonReward) te;
				
				tecr.orientation += axis == UP ? 1 : -1;
				if (tecr.orientation >  3) {
					tecr.orientation = 0;
				}
				if (tecr.orientation <  0) {
					tecr.orientation = 3;
				}
				world.notifyBlockOfNeighborChange(x, y, z, this);
				
				return true;	
			}
			
		}
		
		return false;
	}
	
	public ForgeDirection[] getValidRotations(World world, int x, int y, int z) {
		return new ForgeDirection[] { 
			ForgeDirection.NORTH, 
			ForgeDirection.SOUTH, 
			ForgeDirection.WEST, 
			ForgeDirection.EAST
		};
	}


	///////////////////
	// Data du block //
	///////////////////
	
	/**
	* Renvoi l'orientation du block par rapport à lentity
	* Pour le palcement
	* @param entity
	* @return
	*/
	public int getOrientation(Entity entity) {
		return (MathHelper.floor_double((double) (entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) % 4;
	}
}
