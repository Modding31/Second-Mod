package conner.powersetmod.init;

import conner.powersetmod.init.blocks.CustomBlock;
import conner.powersetmod.init.blocks.GemBlock;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit 
{
	public static Block power_table;
	public static Block power_ore;
	public static Block power_block;
	
     public static void init()
     {
    	 power_table = new CustomBlock("power_table", 2.0F, 5.0F, 2);
    	 power_ore = new CustomBlock("power_ore", 2.0F, 5.0F, 3);
    	 power_block = new GemBlock("power_block", 7.0F, 6.5F, 3);
     }
     
     public static void register()
     {
    	 registerBlock(power_table);
    	 registerBlock(power_ore);
    	 registerBlock(power_block);
     }
     
     public static void registerBlock(Block block)
     {
    	 ForgeRegistries.BLOCKS.register(block);
    	 block.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    	 ItemBlock item = new ItemBlock(block);
    	 item.setRegistryName(block.getRegistryName());
    	 ForgeRegistries.ITEMS.register(item);
    	 
    	 ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
     }
}

