package conner.powersetmod.init;

import conner.powersetmod.Reference;
import conner.powersetmod.init.armour.CustomArmour;
import conner.powersetmod.init.items.CustomGem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ArmourInit 
{
	public static final ArmorMaterial power_armour = EnumHelper.addArmorMaterial("power_armour", Reference.MODID + ":power", 500, new int[]{9, 17, 18, 10}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 60.0F);
	
	
	public static Item power_helmet, power_chestplate, power_leggings, power_boots;
	
	
    public static void init()
    {
   	 power_helmet = new CustomArmour("power_helmet", power_armour, 1, EntityEquipmentSlot.HEAD);
   	 power_chestplate = new CustomArmour("power_chestplate", power_armour, 1, EntityEquipmentSlot.CHEST);
   	power_leggings = new CustomArmour("power_leggings", power_armour, 2, EntityEquipmentSlot.LEGS);
   	power_boots = new CustomArmour("power_boots", power_armour, 1, EntityEquipmentSlot.FEET);
    }
    
    public static void register()
    {
   	 registerItem(power_helmet);
   	 registerItem(power_chestplate);
   	 registerItem(power_leggings);
   	 registerItem(power_boots);
    }
    
    public static void registerItem(Item item)
    {
   	 ForgeRegistries.ITEMS.register(item);
   	 item.setCreativeTab(CreativeTabs.MATERIALS);
   	 ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}




