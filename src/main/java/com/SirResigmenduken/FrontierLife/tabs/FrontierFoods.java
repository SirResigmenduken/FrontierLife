package com.SirResigmenduken.FrontierLife.tabs;

import com.SirResigmenduken.FrontierLife.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FrontierFoods extends CreativeTabs
{
	public FrontierFoods(String label) 
	{ 
		super("frontier_foods");
		this.setBackgroundImageName("frontierlife.png");	
	}
	
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.KITCHEN_KNIFE);
	}
	
	
}
