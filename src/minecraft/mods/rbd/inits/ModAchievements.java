package mods.rbd.inits;

import mods.rbd.ModRBD;
import mods.rbd.common.tileentities.TileEntityCommonReward;
import mods.rbd.common.tileentities.TileEntityLightReward;
import mods.rbd.common.tileentities.TileEntityUncommonReward;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModAchievements {

	public static AchievementPage page;

	public static Achievement achievementTest1;
	public static Achievement achievementTest2;
	public static Achievement achievementTest3;
	public static Achievement achievementTest4;
	
	public static void init() {
		
		ModAchievements.achievementTest1 = new Achievement("achievement.rbd.test1", "test1", 1, -2, new ItemStack(ModBlocks.blockLightRewardOn, 1, 0), null                            ).registerStat().initIndependentStat();
		ModAchievements.achievementTest2 = new Achievement("achievement.rbd.test2", "test2", 3, -1, Items.apple                                      , ModAchievements.achievementTest1).registerStat();
		ModAchievements.achievementTest3 = new Achievement("achievement.rbd.test3", "test3", 5, -1, Items.golden_apple                               , ModAchievements.achievementTest2).registerStat();
		ModAchievements.achievementTest4 = new Achievement("achievement.rbd.test4", "test4", 3, -3, Items.arrow                                      , ModAchievements.achievementTest1).registerStat();
		
		ModAchievements.page = new AchievementPage("Redori's Buildings", 
			ModAchievements.achievementTest1,
			ModAchievements.achievementTest2,
			ModAchievements.achievementTest3,
			ModAchievements.achievementTest4
		);
		
		AchievementPage.registerAchievementPage(ModAchievements.page);
	}
}
