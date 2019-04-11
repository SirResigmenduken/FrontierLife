package com.SirResigmenduken.FrontierLife.init;

import java.util.ArrayList;
import java.util.List;

import com.SirResigmenduken.FrontierLife.FrontierLife;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockBase;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockBeebox;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockLogSeat;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockRotatable;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockLogSeats;
//import com.SirResigmenduken.FrontierLife.objects.blocks.BlockLeaf;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockLogs;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockOreIron;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockOreStone;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockPlank;
//import com.SirResigmenduken.FrontierLife.objects.blocks.BlockSaplings;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockStone;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockLogs;
import com.SirResigmenduken.FrontierLife.objects.blocks.RawSalt;
import com.SirResigmenduken.FrontierLife.tabs.FrontierResources;
import com.SirResigmenduken.FrontierLife.util.Reference;
import com.SirResigmenduken.FrontierLife.util.handlers.ItemBlockVariants;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block COPPER_ORE = new BlockOreStone("copper_ore", Material.ROCK);
	public static final Block LEAD_ORE = new BlockOreStone("lead_ore", Material.ROCK);
	public static final Block TIN_ORE = new BlockOreStone("tin_ore", Material.ROCK);
	public static final Block SILVER_ORE = new BlockOreIron("silver_ore", Material.ROCK);
	
	public static final Block RAW_SLATE = new BlockStone("raw_slate", Material.ROCK);
	
	public static final Block RAW_SALT = new RawSalt("raw_salt", Material.ROCK);
	//public static final Block SALTLICK = new BlockStone("saltlick", Material.ROCK);

	public static final Block PLANKS = new BlockPlank("planks");
	//public static final Block LOGS = new BlockLogs("log");
	//public static final Block LEAVES = new BlockLeaf("leaves");
	//public static final Block SAPLINGS = new BlockSaplings("sapling");
	
	public static final Block CHERRY_BLOSSOM_LOG = new BlockLogs("cherry_blossom_log", Material.WOOD);
	
	public static final Block EVAPORATOR = new BlockStone("evaporator", Material.ROCK);
	public static final Block LOG_SEAT = new BlockLogSeat("log_seat", Material.WOOD);
	public static final Block BEEBOX = new BlockBeebox("beebox", Material.WOOD);
	

}
