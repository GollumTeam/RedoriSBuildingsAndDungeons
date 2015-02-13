package mods.rbd.common.inits;

import mods.rbd.common.blocks.BlockCommonReward;
import mods.rbd.common.blocks.BlockUncommonReward;


public class ModBlocks {

	public static BlockCommonReward blockRewardCommon;
	public static BlockUncommonReward blockRewardUncommon;
	
	public static void init() {
		ModBlocks.blockRewardCommon   = new BlockCommonReward   ("commonReward");
		ModBlocks.blockRewardUncommon = new BlockUncommonReward ("uncommonReward");
	}
}
