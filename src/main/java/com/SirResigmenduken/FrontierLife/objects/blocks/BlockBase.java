package com.SirResigmenduken.FrontierLife.objects.blocks;

import com.SirResigmenduken.FrontierLife.FrontierLife;
import com.SirResigmenduken.FrontierLife.init.BlockInit;
import com.SirResigmenduken.FrontierLife.init.ItemInit;
import com.SirResigmenduken.FrontierLife.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FrontierLife.frontier_resources);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public void registerModels() 
	{
		FrontierLife.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
}
