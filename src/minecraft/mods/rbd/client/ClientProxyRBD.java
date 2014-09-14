package mods.rbd.client;

import mods.rbd.client.model.ModelFaery;
import mods.rbd.client.render.RenderRBD;
import mods.rbd.common.CommonProxyRBD;
import mods.rbd.common.entities.EntityFireFaery;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxyRBD extends CommonProxyRBD {
	
	public void registerRenderers() {

		RenderingRegistry.registerEntityRenderingHandler(EntityFireFaery.class    , new RenderRBD(new ModelFaery(), 1.0F, "FireFaery"));
		
	}
	
}
