package forcex.mods.wpcraft.blocks.bricks;

import forcex.mods.wpcraft.blockstates.BlockStates;
import forcex.mods.wpcraft.blockstates.BlockTypes;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import forcex.mods.wpcraft.blocks.IMetaBlock;


public class ColouredBrickBrown extends IMetaBlock<BlockTypes> {

	public ColouredBrickBrown() {
		super(Material.ROCK, "coloured_brick_brown");
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