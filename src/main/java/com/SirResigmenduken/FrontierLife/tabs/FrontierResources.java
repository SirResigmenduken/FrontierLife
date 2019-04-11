package com.SirResigmenduken.FrontierLife.tabs;

import com.SirResigmenduken.FrontierLife.init.BlockInit;
import com.SirResigmenduken.FrontierLife.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FrontierResources extends CreativeTabs
{
	public FrontierResources(String label) 
	{ 
		super("frontier_resources");
		this.setBackgroundImageName("frontierlife.png");	
	}
	
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Item.getItemFromBlock(BlockInit.RAW_SALT));
	}
	
	
}
