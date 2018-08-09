package forcex.mods.wpcraft.blocks.floral;

import forcex.mods.wpcraft.blockStates.BlockStates;
import forcex.mods.wpcraft.blockStates.BlockTypes;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import forcex.mods.wpcraft.blockStates.BlockStates;
import forcex.mods.wpcraft.blockStates.BlockTypes;
import forcex.mods.wpcraft.blocks.IMetaBlock;


public class FloralRed extends IMetaBlock<BlockTypes> {

	public FloralRed() {
		super(Material.WOOD, "floral_red");
		this.setSoundType(SoundType.WOOD);
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