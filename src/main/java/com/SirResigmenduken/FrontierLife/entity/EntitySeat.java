package com.SirResigmenduken.FrontierLife.entity;

import com.SirResigmenduken.FrontierLife.objects.blocks.BlockRotatable;

import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntitySeat extends Entity
{
    public int blockPosX;
    public int blockPosY;
    public int blockPosZ;

    public EntitySeat(World world)
    {
        super(world);
        this.noClip = true;
        this.height = 0.01F;
        this.width = 0.01F;
    }

	public EntitySeat(World worldIn, int x, int y, int z) {
		this(worldIn);
		this.blockPosX = x;
		this.blockPosY = y;
		this.blockPosZ = z;
		IBlockState perch = this.world.getBlockState(new BlockPos(this.blockPosX, this.blockPosY, this.blockPosZ));
		switch(perch.getValue(BlockRotatable.FACING)) {
			case SOUTH:
			default:
				setPosition(x + 0.5D, y + 0.3F, z + 0.3D);
				break;
			case WEST: 
				setPosition(x + 0.7D, y + 0.3F, z + 0.5D);
				break;
			case EAST:
				setPosition(x + 0.3D, y + 0.3F, z + 0.5D);
				break;
			case NORTH:
				setPosition(x + 0.5D, y + 0.3F, z + 0.7D);
				break;
			}
		}
		

    @Override
    public double getMountedYOffset()
    {
        return this.height * 0.0D;
    }

    @Override
    protected boolean shouldSetPosAfterLoading()
    {
        return false;
    }

	@Override
	public void onEntityUpdate() {
		if(!this.world.isRemote) {
			if(this.world.isAirBlock(new BlockPos(this.blockPosX, this.blockPosY, this.blockPosZ)) || !this.isBeingRidden()) {
				this.setDead();
			}
		}
	}

    @Override
    protected void entityInit()
    {
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
    }

}