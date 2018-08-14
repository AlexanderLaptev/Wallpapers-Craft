package forcex.mods.wpcraft.blocks.dotted;

import forcex.mods.wpcraft.blockStates.BlockStates;
import forcex.mods.wpcraft.blockStates.BlockTypes;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import forcex.mods.wpcraft.blocks.IMetaBlock;


public class DiagonallyDottedPurple extends IMetaBlock<BlockTypes> {

	public DiagonallyDottedPurple() {
		super(Material.WOOD,"diagonally_dotted_purple");
		this.setSoundType(SoundType.WOOD);
	}

	protected BlockTypes getDefaultStateVariant() {
		return BlockTypes.Zero;
	}

	protected BlockTypes fromMeta(int meta) {
		return BlockTypes.fromMeta(meta);
	}

	protected PropertyEnum<BlockTypes> getVariantEnum() {
		return BlockStates.WPblocks;
	}
}