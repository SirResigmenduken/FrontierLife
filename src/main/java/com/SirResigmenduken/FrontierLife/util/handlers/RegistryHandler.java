package com.SirResigmenduken.FrontierLife.util.handlers;

//import com.SirResigmenduken.FrontierLife.init.BiomeInit;
import com.SirResigmenduken.FrontierLife.init.BlockInit;
import com.SirResigmenduken.FrontierLife.init.ItemInit;
import com.SirResigmenduken.FrontierLife.util.IHasModel;
import com.SirResigmenduken.FrontierLife.world.gen.WorldGenCustomOres;
import com.SirResigmenduken.FrontierLife.world.gen.WorldGenCustomTrees;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{

	@SubscribeEvent
	public static void registerItem(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void registerBlock(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
			
	}
	
	public static void otherRegistries()
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 3);
		GameRegistry.registerWorldGenerator(new WorldGenCustomTrees(), 0);
		
		//BiomeInit.registerBiomes();
	}
}
