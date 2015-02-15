package com.gollum.rbd.client;

import com.gollum.core.tools.registry.RenderingRegistry;
import com.gollum.rbd.client.model.mobs.ModelFaery;
import com.gollum.rbd.client.render.RBDInventoryRenderer;
import com.gollum.rbd.client.render.blocks.CommonRewardBlockRenderer;
import com.gollum.rbd.client.render.blocks.LightRewardBlockRenderer;
import com.gollum.rbd.client.render.mobs.RenderFaery;
import com.gollum.rbd.common.CommonProxyRBD;
import com.gollum.rbd.common.entities.EntityFireFaery;
import com.gollum.rbd.common.entities.EntityIceFaery;
import com.gollum.rbd.common.tileentities.TileEntityCommonReward;
import com.gollum.rbd.common.tileentities.TileEntityLightReward;

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
