package mods.rbd.inits;

import mods.gollum.core.common.facory.Mobactory;
import mods.rbd.common.entities.EntityFireFaery;
import mods.rbd.common.entities.EntityIceFaery;
import mods.rbd.common.tileentities.TileEntityLightReward;
import mods.rbd.common.tileentities.TileEntityUncommonReward;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModMobs {
	
	public static void init() {
		new Mobactory().register(EntityFireFaery.class, "FireFaery", 0x333333, 0xFF0000);;
		new Mobactory().register(EntityIceFaery .class, "IceFaery" , 0x333333, 0x00F2EC);;
	}
}
