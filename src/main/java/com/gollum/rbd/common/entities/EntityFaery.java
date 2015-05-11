package com.gollum.rbd.common.entities;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public abstract class EntityFaery extends EntityMob {

	protected float windMovement = -1.0F;

	public EntityFaery(World world) {
		super(world);
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		
		if (this.worldObj.isRemote) {
			
			this.windMovement += 0.2F;
			
			if (this.windMovement > 1.0F) {
				this.windMovement = -1.0F;
			}
		}
		
	}

	public float getWindMovement() {
		return Math.abs(this.windMovement);
	}

}