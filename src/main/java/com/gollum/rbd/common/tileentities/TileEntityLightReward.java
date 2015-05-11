package com.gollum.rbd.common.tileentities;

import static com.gollum.rbd.ModRBD.log;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;

public class TileEntityLightReward extends TileEntityReward {
	
	public TileEntityLightReward() {
	}
	
	public TileEntityLightReward(int metadata) {
		super(metadata);
	}
	
}
