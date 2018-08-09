package forcex.mods.wpcraft.blocks.bricks;

import forcex.mods.wpcraft.blockStates.BlockStates;
import forcex.mods.wpcraft.blockStates.BlockTypes;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import forcex.mods.wpcraft.blockStates.BlockStates;
import forcex.mods.wpcraft.blockStates.BlockTypes;
import forcex.mods.wpcraft.blocks.IMetaBlock;


public class StoneBrickGray extends IMetaBlock<BlockTypes> {

	public StoneBrickGray() {
		super(Material.ROCK, "stonebrick_gray");
		this.setSoundType(SoundType.STONE);
		this.setHardness(1.5F);
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