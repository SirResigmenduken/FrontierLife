package com.SirResigmenduken.FrontierLife.util;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.List;

import com.SirResigmenduken.FrontierLife.entity.EntitySeat;

public class SeatUtil
{
    public static boolean sitOnBlock(World world, double x, double y, double z, EntityPlayer player, double yOffset)
    {
        if(!world.isRemote && !player.isSneaking() && !checkForExistingSeat(world, x, y, z, player))
        {
            EntitySeat seat = new EntitySeat(world, x, y, z, yOffset);
            world.spawnEntity(seat);
            player.startRiding(seat);
        }
        return true;
    }

    private static boolean checkForExistingSeat(World world, double x, double y, double z, EntityPlayer player)
    {
        if(!world.isRemote)
        {
            List<EntitySeat> seats = world.getEntitiesWithinAABB(EntitySeat.class, new AxisAlignedBB(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).grow(1D));
            for(EntitySeat seat : seats)
            {
                if(seat.blockPosX == x && seat.blockPosY == y && seat.blockPosZ == z)
                {
                    if(!seat.isBeingRidden())
                    {
                        player.startRiding(seat);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isSomeoneSitting(World world, double x, double y, double z)
    {
       
        {
            List<EntitySeat> seats = world.getEntitiesWithinAABB(EntitySeat.class, new AxisAlignedBB(x, y, z, x + 1.0D, y + 1.0D, z + 1.0D).grow(1D));
            for(EntitySeat seat : seats)
            {
                if(seat.blockPosX == x && seat.blockPosY == y && seat.blockPosZ == z)
                {
                    return seat.isBeingRidden();
                }
            }
        }
        return false;
    }
}