package forcex.mods.wpcraft.blocks.forestryblocks;

import forcex.mods.wpcraft.blockstates.BlockStates;
import forcex.mods.wpcraft.blockstates.BlockTypes3;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import forcex.mods.wpcraft.blocks.IMetaBlock3;

public class BlocksWalnut extends IMetaBlock3<BlockTypes3> {

	public BlocksWalnut() {
		super(Material.WOOD, "blocks_walnut");
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