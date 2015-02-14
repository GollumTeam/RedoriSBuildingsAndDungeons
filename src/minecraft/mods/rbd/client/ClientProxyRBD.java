package mods.rbd.client;

import mods.gollum.core.tools.registry.RenderingRegistry;
import mods.rbd.client.model.ModelFaery;
import mods.rbd.client.render.CommonRewardBlockRenderer;
import mods.rbd.client.render.RBDInventoryRenderer;
import mods.rbd.client.render.RenderFaery;
import mods.rbd.common.CommonProxyRBD;
import mods.rbd.common.entities.EntityFireFaery;
import mods.rbd.common.tileentities.TileEntityCommonReward;
import cpw.mods.fml.client.registry.ClientRegistry;
//import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxyRBD extends CommonProxyRBD {

	public static int idCommonRewardBlockRenderer;
	
	public void registerRenderers() {
		
		this.idCommonRewardBlockRenderer = RenderingRegistry.registerBlockHandler(new RBDInventoryRenderer());
		
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCommonReward.class, new CommonRewardBlockRenderer());
		
		cpw.mods.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler(EntityFireFaery.class, new RenderFaery(new ModelFaery(), 1.0F, "FireFaery"));
		
	}
	
}
