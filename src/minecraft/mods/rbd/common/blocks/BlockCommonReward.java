package mods.rbd.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import mods.gollum.core.tools.helper.blocks.HBlockContainerMetadata;
import mods.gollum.core.tools.helper.blocks.HBlockMetadata;
import mods.rbd.ModRBD;
import mods.rbd.common.tileentities.TileEntityCommonReward;

public class BlockCommonReward extends HBlockContainerMetadata {

	public BlockCommonReward(String registerName) {
		this(registerName, 16);
	}
	
	protected BlockCommonReward(String registerName, int nbItem) {
		super(registerName, Material.rock, nbItem);
		
		this.setCreativeTab(ModRBD.tabRBD);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityCommonReward();
	}
	
}
