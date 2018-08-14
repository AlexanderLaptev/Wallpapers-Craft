package forcex.mods.wpcraft.blocks.bricks;

import forcex.mods.wpcraft.blockstates.BlockStates;
import forcex.mods.wpcraft.blockstates.BlockTypes;
import forcex.mods.wpcraft.blocks.IMetaBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;


public class BrickBlue extends IMetaBlock<BlockTypes>  {

	public BrickBlue() {
		super(Material.ROCK, "brick_blue");
		this.setSoundType(SoundType.STONE);
		this.setHardness(2.0F);
	}

	
	@Override
	protected BlockTypes getDefaultStateVariant() {
		return BlockTypes.Zero;
	}

	@Override
	protected BlockTypes fromMeta(int meta) {
		return BlockTypes.fromMeta(meta);
	}

	@Override
	protected PropertyEnum<BlockTypes> getVariantEnum() {
		return BlockStates.WPblocks;
	}

	

}