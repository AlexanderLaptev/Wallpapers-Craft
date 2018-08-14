package forcex.mods.wpcraft.blocks.wool;

import forcex.mods.wpcraft.blockStates.BlockStates;
import forcex.mods.wpcraft.blockStates.BlockTypes;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import forcex.mods.wpcraft.blocks.IMetaBlock;


public class CheckeredWoolYellow extends IMetaBlock<BlockTypes> {

	public CheckeredWoolYellow() {
		super(Material.CLOTH, "checkered_wool_yellow");
		this.setSoundType(SoundType.CLOTH);
		this.setHardness(0.4F);
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