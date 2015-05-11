package com.gollum.rbd.common.blocks;

import com.gollum.rbd.common.tileentities.TileEntityCommonReward;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCommonReward extends BlockReward {

	public BlockCommonReward(String registerName) {
		super(registerName, 8);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityCommonReward(metadata);
	}

}
