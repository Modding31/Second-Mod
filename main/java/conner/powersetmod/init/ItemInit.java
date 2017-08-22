package conner.powersetmod.init;

import conner.powersetmod.init.items.CustomGem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit 
{
	public static Item power_gem;
	
     public static void init()
     {
    	 power_gem = new CustomGem("power_gem");
     }
     
     public static void register()
     {
    	 registerItem(power_gem);
     }
     
     public static void registerItem(Item item)
     {
    	 ForgeRegistries.ITEMS.register(item);
    	 item.setCreativeTab(CreativeTabs.MATERIALS);
    	 ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
     }
}


