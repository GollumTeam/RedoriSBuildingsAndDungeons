package mods.rbd.common.entities;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityFireFaery extends EntityMob {
	
	protected float windMovement = -1.0F;
	
	public EntityFireFaery(World par1World) {
		super(par1World);
		
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
