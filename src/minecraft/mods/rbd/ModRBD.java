package mods.rbd;

import mods.gollum.core.common.creativetab.GollumCreativeTabs;
import mods.gollum.core.common.i18n.I18n;
import mods.gollum.core.common.log.Logger;
import mods.gollum.core.common.mod.GollumMod;
import mods.gollum.core.common.version.VersionChecker;
import mods.rbd.common.CommonProxyRBD;
import mods.rbd.common.config.ConfigRBD;
import mods.rbd.inits.ModAchievements;
import mods.rbd.inits.ModBlocks;
import mods.rbd.inits.ModMobs;
import mods.rbd.inits.ModTileEntities;
import net.minecraft.init.Blocks;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModRBD.MODID, name = ModRBD.MODNAME, version = ModRBD.VERSION, acceptedMinecraftVersions = ModRBD.MINECRAFT_VERSION, dependencies = ModRBD.DEPENDENCIES)
public class ModRBD extends GollumMod {

	public final static String MODID = "RBD";
	public final static String MODNAME = "Redori's Buildings and Dungeons";
	public final static String VERSION = "1.0.0";
	public final static String MINECRAFT_VERSION = "1.6.4";
	public final static String DEPENDENCIES = "required-after:GollumCoreLib";
	
	@Instance(ModRBD.MODID)
	public static ModRBD instance;
	
	@SidedProxy(clientSide = "mods.rbd.client.ClientProxyRBD", serverSide = "mods.rbd.common.CommonProxyRBD")
	public static CommonProxyRBD proxy;

	/**
	 * Gestion des logs
	 */
	public static Logger log;
	
	/**
	 * Gestion de l'i18n
	 */
	public static I18n i18n;
	
	/**
	 * La configuration
	 */
	public static ConfigRBD config;
	
	/**
	 * Tab du mode creative
	 */
	public static GollumCreativeTabs tabRBD = new GollumCreativeTabs("RBDTab");
	
	@EventHandler public void handler(FMLPreInitializationEvent event)  { super.handler (event); }
	@EventHandler public void handler(FMLInitializationEvent event)     { super.handler (event); }
	@EventHandler public void handler(FMLPostInitializationEvent event) { super.handler (event); }
	
	/** 1 **/
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		
		// Test la version du mod
		new VersionChecker();

		// Initialisation des blocks
		ModBlocks.init ();
	}
	
	/** 2 **/ 
	@Override
	public void init(FMLInitializationEvent event) {

		// Execution du renderer en fonction du serveur ou du client
		proxy.registerRenderers();
		
		// Initialisation des Mobs
		ModMobs.init ();

		// Initialisation des TileEntities
		ModTileEntities.init ();
		
		// Initialisation des Achievements
		ModAchievements.init();
		
		
		this.tabRBD.setIcon(ModBlocks.blockLightRewardOn);
		
	}
	
	/** 3 **/
	@Override
	public void postInit(FMLPostInitializationEvent event) {
	}
	
}
