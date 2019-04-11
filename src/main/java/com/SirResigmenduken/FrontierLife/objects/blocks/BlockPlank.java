package com.SirResigmenduken.FrontierLife.objects.blocks;

import com.SirResigmenduken.FrontierLife.FrontierLife;
import com.SirResigmenduken.FrontierLife.init.BlockInit;
import com.SirResigmenduken.FrontierLife.init.ItemInit;
import com.SirResigmenduken.FrontierLife.util.IHasModel;
import com.SirResigmenduken.FrontierLife.util.IMetaName;
import com.SirResigmenduken.FrontierLife.util.handlers.CustomTreeEnumHandler;
import com.SirResigmenduken.FrontierLife.util.handlers.ItemBlockVariants;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockPlank extends Block implements IMetaName, IHasModel
{
	public static final PropertyEnum<CustomTreeEnumHandler.EnumType> VARIANT = PropertyEnum.<CustomTreeEnumHandler.EnumType>create("variant", CustomTreeEnumHandler.EnumType.class);
	
	private String name;
	
	public BlockPlank(String name) 
	{
		super(Material.WOOD);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.WOOD);
		setCreativeTab(FrontierLife.frontier_resources);
		setHardness(2.0F);
		setResistance(10.0F);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, CustomTreeEnumHandler.EnumType.WEATHERED));
	
		this.name = name;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public int damageDropped(IBlockState state)
	{
		return ((CustomTreeEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
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
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(VARIANT, CustomTreeEnumHandler.EnumType.byMetadata(meta));
	}
	
	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((CustomTreeEnumHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, (int)(getMetaFromState(world.getBlockState(pos))));
	}
	
	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	@Override
	public String getSpecialName(ItemStack stack)
	{
		return CustomTreeEnumHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
	
	@Override
	public void registerModels() 
	{
		for(int i = 0; i < CustomTreeEnumHandler.EnumType.values().length; i++)
		{
			FrontierLife.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "planks_" + CustomTreeEnumHandler.EnumType.values()[i].getName(), "inventory");
		}
	}
	
}
