package conner.powersetmod.handlers;

import conner.powersetmod.Reference;
import conner.powersetmod.init.ArmourInit;
import conner.powersetmod.init.BlockInit;
import conner.powersetmod.init.ItemInit;
import conner.powersetmod.init.ToolInit;
import conner.powersetmod.tileentity.TileEntityPowerTable;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler 
{
    public static void Client()
    {
    	RecipeHandler.registerCrafting();
    }
    
    public static void Common()
    {
    	ItemInit.init();
    	ItemInit.register();
    	
    	ToolInit.init();
    	ToolInit.register();
    	
    	ArmourInit.init();
    	ArmourInit.register();
    	
    	BlockInit.init();
    	BlockInit.register();
    	
    	GameRegistry.registerTileEntity(TileEntityPowerTable.class, Reference.MODID + "TileEntityPowerTable");
    }
}    

