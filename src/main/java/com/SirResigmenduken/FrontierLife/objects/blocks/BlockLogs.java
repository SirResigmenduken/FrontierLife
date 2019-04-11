package com.SirResigmenduken.FrontierLife.objects.blocks;

import java.util.Random;

import com.SirResigmenduken.FrontierLife.FrontierLife;
import com.SirResigmenduken.FrontierLife.init.BlockInit;
import com.SirResigmenduken.FrontierLife.init.ItemInit;
import com.SirResigmenduken.FrontierLife.util.IHasModel;
import com.SirResigmenduken.FrontierLife.util.IMetaName;

import net.minecraft.block.BlockLog;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockLogs extends BlockLog implements IHasModel
{
	public BlockLogs(String name, Material material)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.WOOD);
		setDefaultState(blockState.getBaseState().withProperty(LOG_AXIS, BlockLog.EnumAxis.Y));
		setCreativeTab(FrontierLife.frontier_resources);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		IBlockState iblockstate = getDefaultState();

		switch (meta & 12)
		{
		case 0:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
			break;
		case 4:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
			break;
		case 8:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
			break;
		default:
			iblockstate = iblockstate.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
		}

		return iblockstate;
	}

	@Override
	@SuppressWarnings("incomplete-switch")
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;

		switch (state.getValue(LOG_AXIS))
		{
		case X:
			i |= 4;
			break;
		case Z:
			i |= 8;
			break;
		case NONE:
			i |= 12;
		}

		return i;
	}

	@Override
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random par2Random, int par3)
	{
		return Item.getItemFromBlock(this);
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer.Builder(this).add(LOG_AXIS).build();
	}
	
	@Override
	public void registerModels() 
	{
		FrontierLife.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}