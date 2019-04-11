package com.SirResigmenduken.FrontierLife;

import org.apache.logging.log4j.Logger;

import com.SirResigmenduken.FrontierLife.proxy.CommonProxy;
import com.SirResigmenduken.FrontierLife.tabs.FrontierAnimals;
import com.SirResigmenduken.FrontierLife.tabs.FrontierFoods;
import com.SirResigmenduken.FrontierLife.tabs.FrontierResources;
import com.SirResigmenduken.FrontierLife.util.Reference;
import com.SirResigmenduken.FrontierLife.util.handlers.RegistryHandler;
import com.SirResigmenduken.FrontierLife.world.gen.WorldGenCustomOres;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class FrontierLife 
{

	@Instance
	public static FrontierLife instance;
	
	public static final CreativeTabs frontier_resources = new FrontierResources("frontier_resources");
	public static final CreativeTabs frontier_foods = new FrontierFoods("frontier_foods");
	public static final CreativeTabs frontier_animals = new FrontierAnimals("frontier_animals");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.otherRegistries();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{

	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}

}
	

