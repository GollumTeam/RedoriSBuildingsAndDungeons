package mods.rbd.inits;

import mods.rbd.common.blocks.BlockCommonReward;
import mods.rbd.common.blocks.BlockLightReward;
import mods.rbd.common.blocks.BlockUncommonReward;
import mods.rbd.common.building.handler.BlockRewardBuildingHandler;

import com.gollum.core.tools.registry.BuildingBlockRegistry;


public class ModBlocks {

	public static BlockLightReward    blockLightRewardOn;
	public static BlockLightReward    blockLightRewardOff;
	public static BlockCommonReward   blockCommonReward;
	public static BlockUncommonReward blockUncommonReward;
	
	public static void init() {
		ModBlocks.blockLightRewardOn  = new BlockLightReward    ("lightRewardOn" , true);
		ModBlocks.blockLightRewardOff = new BlockLightReward    ("lightRewardOff", false);
		ModBlocks.blockCommonReward   = new BlockCommonReward   ("commonReward");
		ModBlocks.blockUncommonReward = new BlockUncommonReward ("uncommonReward");
		
		BuildingBlockRegistry.register(new BlockRewardBuildingHandler());
	}
}
