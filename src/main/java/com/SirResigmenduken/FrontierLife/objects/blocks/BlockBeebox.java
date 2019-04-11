package com.SirResigmenduken.FrontierLife.objects.blocks;

import com.SirResigmenduken.FrontierLife.FrontierLife;
import com.SirResigmenduken.FrontierLife.init.BlockInit;
import com.SirResigmenduken.FrontierLife.init.ItemInit;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class BlockBeebox extends BlockRotatable
{
	public BlockBeebox(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FrontierLife.frontier_resources);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}
}
