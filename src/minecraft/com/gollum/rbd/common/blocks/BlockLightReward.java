package com.gollum.rbd.common.blocks;

import java.util.Random;

import com.gollum.rbd.client.ClientProxyRBD;
import com.gollum.rbd.common.tileentities.TileEntityLightReward;
import com.gollum.rbd.inits.ModBlocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockLightReward extends BlockReward {
	
	public boolean isLight = false;
	
	public BlockLightReward(String registerName, boolean isLight) {
		super(registerName, 1);
		this.isLight = isLight;
		
		if (isLight) {
			this.setLightLevel(0.8F);
		} else {
			this.setCreativeTab(null);
		}
		
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityLightReward(metadata);
	}
	
	@Override
	public Item getItemDropped(int par1, Random random, int par3) {
		return Item.getItemFromBlock(ModBlocks.blockLightRewardOn);
	}
	
	///////////
	// Event //
	///////////
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX, float posY, float posZ) {

		int metadata = world.getBlockMetadata(x, y, z);
		
		if (metadata == 0) {
			TileEntity te = world.getTileEntity(x, y, z);
			NBTTagCompound nbt = new NBTTagCompound();
			te.writeToNBT(nbt);
			TileEntity teCopy = TileEntity.createAndLoadEntity(nbt);
			
			if (this == ModBlocks.blockLightRewardOn) {
				world.setBlock(x, y, z, ModBlocks.blockLightRewardOff, 0, 2);
				world.setTileEntity(x, y, z, teCopy);
			} else {
				world.setBlock(x, y, z, ModBlocks.blockLightRewardOn, 0, 2);
				world.setTileEntity(x, y, z, teCopy);
			}
			return true;
		}
		return false;
	}
	
}
