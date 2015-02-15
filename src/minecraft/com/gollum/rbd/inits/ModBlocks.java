package com.gollum.rbd.inits;

import com.gollum.core.tools.registry.BuildingBlockRegistry;
import com.gollum.rbd.common.blocks.BlockCommonReward;
import com.gollum.rbd.common.blocks.BlockLightReward;
import com.gollum.rbd.common.blocks.BlockUncommonReward;
import com.gollum.rbd.common.building.handler.BlockRewardBuildingHandler;


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
