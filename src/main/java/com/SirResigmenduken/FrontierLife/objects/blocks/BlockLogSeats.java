package com.SirResigmenduken.FrontierLife.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.SirResigmenduken.FrontierLife.FrontierLife;
import com.SirResigmenduken.FrontierLife.init.BlockInit;
import com.SirResigmenduken.FrontierLife.init.ItemInit;
import com.SirResigmenduken.FrontierLife.util.SeatUtil;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockLogSeats extends BlockRotatable
{

	public BlockLogSeats(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setLightOpacity(0);
		this.setHardness(1.0F);
		setCreativeTab(FrontierLife.frontier_resources);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}
	
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
    	 return !playerIn.isSneaking() && SeatUtil.sitOnBlock(worldIn, pos.getX(), pos.getY(), pos.getZ(), playerIn, 9 * 0.0625);
    }
}
