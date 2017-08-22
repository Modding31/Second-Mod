package conner.powersetmod.handlers;

import conner.powersetmod.init.BlockInit;
import conner.powersetmod.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler 
{
	public static void registerCrafting()
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("gp:power_block"), new ResourceLocation("gp:powerset_blocks"), new ItemStack(BlockInit.power_block), new Object[]{"PPP","PPP","PPP", 'P', ItemInit.power_gem});
	}
}
	
	
	


