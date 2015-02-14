package mods.rbd.inits;

import mods.rbd.common.tileentities.TileEntityCommonReward;
import mods.rbd.common.tileentities.TileEntityLightReward;
import mods.rbd.common.tileentities.TileEntityUncommonReward;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {
	
	public static void init() {
		GameRegistry.registerTileEntity(TileEntityLightReward.class   , "RBD:LightReward");
		GameRegistry.registerTileEntity(TileEntityCommonReward.class  , "RBD:CommonReward");
		GameRegistry.registerTileEntity(TileEntityUncommonReward.class, "RBD:UncommonReward");
	}
}
