package com.SirResigmenduken.FrontierLife.objects.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOreIron extends BlockBase 
{
	public BlockOreIron(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel();
		//setLightOpacity(1);
	}

}
