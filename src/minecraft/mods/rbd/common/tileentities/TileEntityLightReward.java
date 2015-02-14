package mods.rbd.common.tileentities;

import static mods.rbd.ModRBD.log;
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
