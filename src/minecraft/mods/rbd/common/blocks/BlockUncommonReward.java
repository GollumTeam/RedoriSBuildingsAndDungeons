package mods.rbd.common.blocks;

import mods.rbd.common.tileentities.TileEntityCommonReward;
import mods.rbd.common.tileentities.TileEntityUncommonReward;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockUncommonReward extends BlockCommonReward {

	public BlockUncommonReward(String registerName) {
		super(registerName, 8);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityUncommonReward();
	}

}
