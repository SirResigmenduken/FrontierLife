/*package com.SirResigmenduken.FrontierLife.world.gen.generators;

import java.util.Random;

import com.SirResigmenduken.FrontierLife.init.BlockInit;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockLeaf;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockLogs;
import com.SirResigmenduken.FrontierLife.objects.blocks.BlockSaplings;
import com.SirResigmenduken.FrontierLife.util.handlers.CustomTreeEnumHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class WorldGenCherryBlossomTree extends WorldGenAbstractTree 
{
	public static final IBlockState LOG = BlockInit.LOGS.getDefaultState().withProperty(BlockLogs.VARIANT, CustomTreeEnumHandler.EnumType.CHERRY_BLOSSOM);
	
	private final int minHeight;
	
	public WorldGenCherryBlossomTree() 
	{
		super(false);
		this.minHeight = 5;
	}

	@Override
	public boolean generate(World world, Random rand, BlockPos pos) 
	{
		int height = this.minHeight + rand.nextInt(3);
		boolean flag = true;
		
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		
		for(int yPos = y; yPos <= y + 1 + height; yPos++)
		{
			int b0 = 2;
			if(yPos == y) b0 = 1;
			if(yPos >= y + 1 + height - 2) b0 = 2;
			
			BlockPos.MutableBlockPos mutable = new BlockPos.MutableBlockPos();
			
			for(int xPos = x - b0; xPos <= x + b0 && flag; xPos++)
			{
				for(int zPos = z - b0; zPos <- z + b0 && flag; zPos++)
				{
					if(yPos >= 0 && yPos < world.getHeight())
					{
						if(!this.isReplaceable(world, new BlockPos(xPos, yPos, zPos)))
						{
							flag = false;
						}
					}
					else
					{
						flag = false;
					}
				}
			}
		}
		
		if(!flag)
		{
			return false;
		}
		else
		{
			BlockPos down = pos.down();
			IBlockState state = world.getBlockState(down);
			boolean isSoil = state.getBlock().canSustainPlant(state, world, down, EnumFacing.UP, (BlockSaplings)BlockInit.SAPLINGS);
			
			if(isSoil && y < world.getHeight() - height - 1)
			{
				state.getBlock().onPlantGrow(state, world, down, pos);
				
				
				
				for(int logHeight = 0; logHeight < height; logHeight++)
				{
					BlockPos up = pos.up(logHeight);
					IBlockState logState = world.getBlockState(up);
					
					if(logState.getBlock().isAir(logState, world, up) || logState.getBlock().isLeaves(logState, world, up))
					{
						this.setBlockAndNotifyAdequately(world, pos.up(logHeight), LOG);
					}
				}
				
				return true;
			}
		}
		
		return true;
	}	
	
	@Override
	protected boolean canGrowInto(Block blockType)
	{
		Material material = blockType.getDefaultState().getMaterial();
        return material == Material.AIR || material == Material.LEAVES || material == Material.GROUND || blockType == Blocks.GRASS || blockType == Blocks.DIRT || blockType == Blocks.LOG || blockType == Blocks.LOG2 || blockType == Blocks.SAPLING || blockType == Blocks.VINE;
  
	}
}
*/