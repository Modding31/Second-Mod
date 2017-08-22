package conner.powersetmod.init.blocks;

import java.util.List;

import conner.powersetmod.init.ItemInit;
import conner.powersetmod.tileentity.TileEntityPowerTable;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CustomBlock extends Block implements ITileEntityProvider {
	
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625, 0, 0.0625, 0.0625 * 12, 0.0625 * 8,  0.0625 * 12);
	

	public CustomBlock(String name, float hardness, float resistance, int harvestLevel) 
	{
		super(Material.IRON);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel("pickaxe", harvestLevel);
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) {
		
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		
		return false;
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
	
		return BOUNDING_BOX;
	}
	
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox,
			List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean p_185477_7_) {
		
		super.addCollisionBoxToList(pos, entityBox, collidingBoxes, BOUNDING_BOX);
	} 
	
	
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		if(!worldIn.isRemote) {
		TileEntity tileEntity = worldIn.getTileEntity(pos);
		if(tileEntity instanceof TileEntityPowerTable) {
			TileEntityPowerTable powertable = (TileEntityPowerTable) tileEntity;
			if(playerIn.getHeldItem(hand) !=null) {
			
			if(playerIn.getHeldItem(hand) == new ItemStack(ItemInit.power_gem)) {
				if(powertable.addGem()) {
					  playerIn.getHeldItem(hand).setCount(playerIn.getHeldItem(hand).getCount() - 1);
                    
					return true;
				}
			}
		}
			powertable.removeGem();
		}
		}
		return true;
		
	}
	       
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		
		return new TileEntityPowerTable();
	}

}
