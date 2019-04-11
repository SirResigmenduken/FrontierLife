package com.SirResigmenduken.FrontierLife.tabs;

import com.SirResigmenduken.FrontierLife.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FrontierAnimals extends CreativeTabs
{
	public FrontierAnimals(String label) 
	{ 
		super("frontier_animals");
		this.setBackgroundImageName("frontierlife.png");	
	}
	
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.SALT);
	}
	
	
}
