package mods.rbd.client;

import mods.rbd.client.model.mobs.ModelFaery;
import mods.rbd.client.render.RBDInventoryRenderer;
import mods.rbd.client.render.blocks.CommonRewardBlockRenderer;
import mods.rbd.client.render.blocks.LightRewardBlockRenderer;
import mods.rbd.client.render.mobs.RenderFaery;
import mods.rbd.common.CommonProxyRBD;
import mods.rbd.common.entities.EntityFireFaery;
import mods.rbd.common.entities.EntityIceFaery;
import mods.rbd.common.tileentities.TileEntityCommonReward;
import mods.rbd.common.tileentities.TileEntityLightReward;

import com.gollum.core.tools.registry.RenderingRegistry;

import cpw.mods.fml.client.registry.ClientRegistry;
//import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxyRBD extends CommonProxyRBD {

	public static int idRewardBlockRenderer;
	
	public void registerRenderers() {

		this.idRewardBlockRenderer = RenderingRegistry.registerBlockHandler(new RBDInventoryRenderer());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLightReward.class , new LightRewardBlockRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCommonReward.class, new CommonRewardBlockRenderer());

		RenderingRegistry.registerEntityRenderingHandler(EntityFireFaery.class, new RenderFaery(new ModelFaery(), 1.0F, "FireFaery"));
		RenderingRegistry.registerEntityRenderingHandler(EntityIceFaery .class, new RenderFaery(new ModelFaery(), 1.0F, "IceFaery"));
		
	}
	
}
