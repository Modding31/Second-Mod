package conner.powersetmod.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GemBlock extends Block 
{

	public GemBlock(String name, float hardness, float resistance, int harvestLevel) 
	{
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel("pickaxe", harvestLevel);
		setSoundType(SoundType.METAL);
	}

}
