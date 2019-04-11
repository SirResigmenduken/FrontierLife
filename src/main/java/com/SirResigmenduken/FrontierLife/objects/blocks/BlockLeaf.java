/*package com.SirResigmenduken.FrontierLife.objects.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.SirResigmenduken.FrontierLife.FrontierLife;
import com.SirResigmenduken.FrontierLife.init.BlockInit;
import com.SirResigmenduken.FrontierLife.init.ItemInit;
import com.SirResigmenduken.FrontierLife.util.IHasModel;
import com.SirResigmenduken.FrontierLife.util.IMetaName;
import com.SirResigmenduken.FrontierLife.util.handlers.CustomTreeEnumHandler;
import com.SirResigmenduken.FrontierLife.util.handlers.ItemBlockVariants;
import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLeaf extends BlockLeaves implements IMetaName, IHasModel
{
	public static final PropertyEnum<CustomTreeEnumHandler.EnumType> VARIANT = PropertyEnum.<CustomTreeEnumHandler.EnumType>create("variant", CustomTreeEnumHandler.EnumType.class, new Predicate<CustomTreeEnumHandler.EnumType>()
	{
		public boolean apply(@Nullable CustomTreeEnumHandler.EnumType apply)
		{
			return apply.getMeta() < 2;
		}
	});
	
	private String name;
	
	public BlockLeaf(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.PLANT);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, CustomTreeEnumHandler.EnumType.WEATHERED).withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
		setCreativeTab(FrontierLife.frontier_resources);
		
		this.name = name;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(VARIANT, CustomTreeEnumHandler.EnumType.byMetadata(meta % 2));
	}
	
	@Override
	public int getMetaFromState(IBlockState state) 
	{
		int i = ((CustomTreeEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
		
		if(!((Boolean)state.getValue(DECAYABLE)).booleanValue())
		{
			i |= 2;
		}
		
		if(!((Boolean)state.getValue(CHECK_DECAY)).booleanValue())
		{
			i |= 4;
		}
		
		return i;
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) 
	{
		for(CustomTreeEnumHandler.EnumType variant : CustomTreeEnumHandler.EnumType.values())
		{
			items.add(new ItemStack(this, 1, variant.getMeta()));
		}
	}
	
	@Override
	protected ItemStack getSilkTouchDrop(IBlockState state) 
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, ((CustomTreeEnumHandler.EnumType)state.getValue(VARIANT)).getMeta());
	}
	
	@Override
	public int damageDropped(IBlockState state) 
	{
		return ((CustomTreeEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public String getSpecialName(ItemStack stack) 
	{
		return CustomTreeEnumHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {return;}
	
	@Override
	protected int getSaplingDropChance(IBlockState state) {return 20;}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return Item.getItemFromBlock(BlockInit.SAPLINGS);
	}
	
	@Override
	public EnumType getWoodType(int meta) {return null;}
	
	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) 
	{
		return NonNullList.withSize(1, new ItemStack(this, 1, world.getBlockState(pos).getValue(VARIANT).getMeta()));
	}
	
	@Override
	protected BlockStateContainer createBlockState() 
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT,DECAYABLE,CHECK_DECAY});
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() 
	{
		return BlockRenderLayer.TRANSLUCENT;
	}	
	
	@Override
	public void registerModels() 
	{
		for(int i = 0; i < CustomTreeEnumHandler.EnumType.values().length; i++)
		{
			FrontierLife.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "leaves_" + CustomTreeEnumHandler.EnumType.values()[i].getName(), "inventory");
		}
	}
}
*/