package com.SirResigmenduken.FrontierLife.objects.items;

import com.SirResigmenduken.FrontierLife.FrontierLife;
import com.SirResigmenduken.FrontierLife.init.ItemInit;
import com.SirResigmenduken.FrontierLife.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemResourcesBase extends Item implements IHasModel {

	public ItemResourcesBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FrontierLife.frontier_resources);
		
		ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		FrontierLife.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
