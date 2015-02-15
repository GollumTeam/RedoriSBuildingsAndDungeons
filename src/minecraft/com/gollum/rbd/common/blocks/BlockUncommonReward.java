package com.gollum.rbd.common.blocks;

import com.gollum.rbd.common.tileentities.TileEntityLightReward;
import com.gollum.rbd.common.tileentities.TileEntityUncommonReward;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockUncommonReward extends BlockReward {

	public BlockUncommonReward(String registerName) {
		super(registerName, 8);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityUncommonReward(metadata);
	}

}
