/*package com.SirResigmenduken.FrontierLife.world.biomes;

import java.util.Random;

import com.SirResigmenduken.FrontierLife.init.BlockInit;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockPlank;
import com.SirResigmenduken.FrontierLife.util.handlers.CustomTreeEnumHandler;
import com.SirResigmenduken.FrontierLife.world.gen.generators.WorldGenWeatheredTree;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeWeathered extends Biome 
{
	protected static final WorldGenAbstractTree TREE = new WorldGenWeatheredTree();
	protected boolean enableSnow;
    
	public BiomeWeathered() 
	{
		super(new BiomeProperties("Cold Weathered").setBaseHeight(1.5F).setHeightVariation(0.2F).setSnowEnabled());
	
		this.decorator.treesPerChunk = 1;
		this.decorator.flowersPerChunk= 1;
		this.decorator.grassPerChunk = 1;
	}
 
    public boolean getEnableSnow()
    {
        return this.isSnowyBiome();
    }
    
    public boolean isSnowyBiome()
    {
        return this.enableSnow;
    }
	
    protected BiomeWeathered setEnableSnow()
    {
        this.enableSnow = true;
        return this;
    }
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) 
	{
		return TREE;
	}
}
*/