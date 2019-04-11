package com.SirResigmenduken.FrontierLife.objects.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FoodEffectBase extends FoodBase
{
	PotionEffect effect;
	PotionEffect effect_second;
	//public int ticks;
	
	public FoodEffectBase(String name, int amount, float saturation, boolean isWolfFood, PotionEffect effect, PotionEffect effect_second)
	{
		super(name, amount, saturation, isWolfFood);
		setAlwaysEdible();
		
		this.effect = effect;
		this.effect_second = effect_second;
		//this.ticks = 0;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
	{
		if(!worldIn.isRemote)
		{
			player.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier(), effect.getIsAmbient(), effect.doesShowParticles()));
			player.addPotionEffect(new PotionEffect(effect_second.getPotion(), effect_second.getDuration(), effect_second.getAmplifier(), effect_second.getIsAmbient(), effect_second.doesShowParticles()));
			//ticks = ++ticks;
		}
		
		
	}
	
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack stack)
	{
		return true;
	}
}
