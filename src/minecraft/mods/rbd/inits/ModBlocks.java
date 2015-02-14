package mods.rbd.inits;

import mods.rbd.common.blocks.BlockCommonReward;
import mods.rbd.common.blocks.BlockUncommonReward;


public class ModBlocks {

	public static BlockCommonReward   blockCommonReward;
	public static BlockUncommonReward blockUncommonReward;
	
	public static void init() {
		ModBlocks.blockCommonReward   = new BlockCommonReward   ("commonReward");
		ModBlocks.blockUncommonReward = new BlockUncommonReward ("uncommonReward");
	}
}
