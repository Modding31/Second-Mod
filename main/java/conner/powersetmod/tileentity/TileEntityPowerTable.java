package conner.powersetmod.tileentity;

import conner.powersetmod.init.ItemInit;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPowerTable extends TileEntity {
    
	private int gemCount;
	
	public boolean addGem() {
	
		if(gemCount < 4) {
			gemCount++;
			markDirty();
		    return true;
		}  
	   
		return false;
	}
	
	public void removeGem() {

	
		if(gemCount > 0) {
			getWorld().spawnEntity(new EntityItem(getWorld(), pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.power_gem)));
			gemCount--;
			markDirty();
		}
		}	
	
	
	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound nbt) 
	{
		nbt.setInteger("GemCount", this.gemCount);
		return super.writeToNBT(nbt);
		
		
		
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt) 
	{
		this.gemCount = nbt.getInteger("GemCount");
		super.readFromNBT(nbt);
	}
}
	
	

