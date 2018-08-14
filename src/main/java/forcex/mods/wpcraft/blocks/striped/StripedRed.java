package forcex.mods.wpcraft.blocks.striped;

import forcex.mods.wpcraft.blockstates.BlockStates;
import forcex.mods.wpcraft.blockstates.BlockTypes;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import forcex.mods.wpcraft.blocks.IMetaBlock;


public class StripedRed extends IMetaBlock<BlockTypes> {

	public StripedRed() {
		super(Material.WOOD, "striped_red");
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