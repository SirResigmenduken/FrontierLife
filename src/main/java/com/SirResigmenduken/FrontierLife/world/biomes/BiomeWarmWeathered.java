/*
package com.SirResigmenduken.FrontierLife.world.biomes;

import java.util.Random;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;

public class BiomeWarmWeathered extends BiomeGenBase
{
    private static final WorldGenSavannaTree field_150627_aC = new WorldGenSavannaTree(false);

    protected BiomeWarmWeathered(int p_i45383_1_)
    {
        super(p_i45383_1_);
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityHorse.class, 1, 2, 6));
        this.treesPerChunk = 1;
        this.flowersPerChunk = 4;
        this.grassPerChunk = 20;
    }

    public WorldGenAbstractTree genBigTreeChance(Random rand)
    {
        return (WorldGenAbstractTree)(rand.nextInt(5) > 0 ? field_150627_aC : this.worldGeneratorTrees);
    }

    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
        DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.GRASS);

        for (int i = 0; i < 7; ++i)
        {
            int j = rand.nextInt(16) + 8;
            int k = rand.nextInt(16) + 8;
            int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
            DOUBLE_PLANT_GENERATOR.generate(worldIn, rand, pos.add(j, l, k));
        }

        super.decorate(worldIn, rand, pos);
    }
}
*/