/*package com.SirResigmenduken.FrontierLife.init;

import org.lwjgl.Sys;

import com.SirResigmenduken.FrontierLife.world.biomes.BiomeWeathered;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit 
{
	public static final Biome WEATHERED = new BiomeWeathered();
	
	public static void registerBiomes()
	{
		initBiome(WEATHERED, "Weathered", BiomeType.COOL, Type.FOREST);
	}
	private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types)
	{
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("printed");
		return biome;
	}
}
*/