package conner.powersetmod;

import conner.powersetmod.proxy.CommonProxy;
import conner.powersetmod.tileentity.TileEntityPowerTable;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class PowerSetMod 
{
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    
    }
    
	@EventHandler
    public static void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    	
    	
    }
    
	@EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    }
}
