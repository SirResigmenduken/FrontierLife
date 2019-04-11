package com.SirResigmenduken.FrontierLife.objects.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.SirResigmenduken.FrontierLife.FrontierLife;
import com.SirResigmenduken.FrontierLife.entity.EntitySeat;
import com.SirResigmenduken.FrontierLife.init.BlockInit;
import com.SirResigmenduken.FrontierLife.init.ItemInit;
import com.SirResigmenduken.FrontierLife.util.SeatUtil;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockLogSeat extends BlockRotatable
{

	public BlockLogSeat(String name, Material material)
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
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(worldIn.isAirBlock(pos.add(0, 1, 0))) {
            double distance2 = 1.8D;
            Entity entityFound2 = null;

            double d4 = -1.0D;
            for (int i = 0; i < worldIn.loadedEntityList.size(); ++i)
            {
                Entity currE = (Entity) worldIn.loadedEntityList.get(i);

                if(currE instanceof EntitySeat) {
                    double d5 = currE.getDistanceSq(pos.getX(), pos.getY(), pos.getZ());
                    
                    if ((distance2 < 0.0D || d5 < distance2 * distance2) && (d4 == -1.0D || d5 < d4))
                    {
                        d4 = d5;
                        entityFound2 = currE;
                    }
                }
            }
            
            if(entityFound2 == null) {
                EntitySeat bench = new EntitySeat(worldIn, pos.getX(), pos.getY(), pos.getZ());
                if (!worldIn.isRemote) {
                    playerIn.startRiding(bench);
                    worldIn.spawnEntity(bench);
                }
            }
            else {
                if(entityFound2.posX != pos.getX() && entityFound2.posY != pos.getY() && entityFound2.posZ != pos.getZ()) {
                    EntitySeat bench = new EntitySeat(worldIn, pos.getX(), pos.getY(), pos.getZ());
                    if (!worldIn.isRemote) {
                        playerIn.startRiding(bench);
                        worldIn.spawnEntity(bench);
                    }
                }
            }
        }
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
    }
}
