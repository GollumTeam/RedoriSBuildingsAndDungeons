package com.gollum.rbd.client.render.mobs;

import java.util.Hashtable;

import com.gollum.rbd.ModRBD;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RBDMobRender extends RenderBiped {
	
	/**
	 * Cache des location de texture
	 */
	private static Hashtable<String, ResourceLocation> cacheResource = new Hashtable<String, ResourceLocation>();
	
	protected String name;
	
	public RBDMobRender (ModelBiped model, float size, String name) {
		super(model, size);
		this.name = name;
	}
	
	protected ResourceLocation getResource(String name) {
		
		ResourceLocation texture;
		
		if (cacheResource.containsKey(name)) {
			texture = cacheResource.get(name);
		} else {
			texture = new ResourceLocation(ModRBD.MODID.toLowerCase()+":textures/models/"+name+".png");
			cacheResource.put(name, texture);
		}
		
		return texture;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return getResource(name);
	}

}
