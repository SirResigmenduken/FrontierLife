package com.SirResigmenduken.FrontierLife.objects.items.food;

import com.SirResigmenduken.FrontierLife.FrontierLife;
import com.SirResigmenduken.FrontierLife.init.ItemInit;
import com.SirResigmenduken.FrontierLife.util.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel 
{
	public FoodBase(String name, int amount, float saturation, boolean isWolfFood)
	{
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FrontierLife.frontier_foods);
		
		ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels()
	{
		FrontierLife.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
