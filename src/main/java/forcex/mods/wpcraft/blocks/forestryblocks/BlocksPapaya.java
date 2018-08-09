package forcex.mods.wpcraft.blocks.forestryblocks;

import forcex.mods.wpcraft.blockStates.BlockStates;
import forcex.mods.wpcraft.blockStates.BlockTypes3;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import forcex.mods.wpcraft.blockStates.BlockStates;
import forcex.mods.wpcraft.blockStates.BlockTypes3;
import forcex.mods.wpcraft.blocks.IMetaBlock3;

public class BlocksPapaya extends IMetaBlock3<BlockTypes3> {

	public BlocksPapaya() {
		super(Material.WOOD, "blocks_papaya");
		this.setSoundType(SoundType.WOOD);
	}

	@Override
	protected BlockTypes3 getDefaultStateVariant() {
		return BlockTypes3.Zero;
	}

	@Override
	protected BlockTypes3 fromMeta(int meta) {
		return BlockTypes3.fromMeta(meta);
	}

	@Override
	protected PropertyEnum<BlockTypes3> getVariantEnum() {
		return BlockStates.WPblocks3;
	}
}