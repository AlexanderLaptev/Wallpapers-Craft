package forcex.mods.wpcraft.blocks.carpets;

import forcex.mods.wpcraft.blockStates.BlockStates;
import forcex.mods.wpcraft.blockStates.BlockTypes2;
import forcex.mods.wpcraft.blocks.IMetaBlock2;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;


public class CheckeredCarpetCyan extends IMetaBlock2<BlockTypes2> {

	public CheckeredCarpetCyan() {
		super(Material.CARPET, "checkered_carpet_cyan");
		this.setSoundType(SoundType.CLOTH);
		this.setHardness(0.1F);
	}

	@Override
	protected BlockTypes2 getDefaultStateVariant() {
		return BlockTypes2.Zero;
	}

	@Override
	protected BlockTypes2 fromMeta(int meta) {
		return BlockTypes2.fromMeta(meta);
	}

	@Override
	protected PropertyEnum<BlockTypes2> getVariantEnum() {
		return BlockStates.WPblocks2;
	}
	

    public static final AxisAlignedBB CARPET_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D);
	
	@Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return CARPET_AABB;
    }
    

    private boolean canBlockStay(World worldIn, BlockPos pos)
    {
        return !worldIn.isAirBlock(pos.down());
    }

	public boolean isVisuallyOpaque() {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
	    return false;
	}
	
	@Override
	@Nonnull
	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT_MIPPED;
	}
    
    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        return side == EnumFacing.UP ? true : (blockAccess.getBlockState(pos.offset(side)).getBlock() == this ? true : super.shouldSideBeRendered(blockState, blockAccess, pos, side));
    }
}