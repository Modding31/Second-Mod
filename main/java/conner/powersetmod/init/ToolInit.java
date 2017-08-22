package conner.powersetmod.init;

import conner.powersetmod.init.items.CustomGem;
import conner.powersetmod.init.tools.CustomAxe;
import conner.powersetmod.init.tools.CustomHoe;
import conner.powersetmod.init.tools.CustomPickaxe;
import conner.powersetmod.init.tools.CustomShovel;
import conner.powersetmod.init.tools.CustomSword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolInit 
{
	public static final ToolMaterial power = EnumHelper.addToolMaterial("power", 4, 5000, 100F, 10, 10);
	
	
	public static Item power_pickaxe, power_axe, power_hoe, power_shovel, power_sword;
	
    public static void init()
    {
   	 power_pickaxe = new CustomPickaxe("power_pickaxe", power);
   	power_axe = new CustomAxe("power_axe", power);
   	power_hoe = new CustomHoe("power_hoe", power);
   	power_shovel = new CustomShovel("power_shovel", power);
   	power_sword = new CustomSword("power_sword", power);
    }
    
    public static void register()
    {
   	 registerItem(power_pickaxe);
   	registerItem(power_axe);
   	registerItem(power_hoe);
   	registerItem(power_shovel);
   	registerItem(power_sword);
    }
    
    public static void registerItem(Item item)
    {
   	 ForgeRegistries.ITEMS.register(item);
   	 item.setCreativeTab(CreativeTabs.MATERIALS);
   	 ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}




