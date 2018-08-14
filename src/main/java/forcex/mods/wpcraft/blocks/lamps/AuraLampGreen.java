package forcex.mods.wpcraft.blocks.lamps;

import forcex.mods.wpcraft.blockstates.BlockStates;
import forcex.mods.wpcraft.blockstates.BlockTypes;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import forcex.mods.wpcraft.blocks.IMetaBlock;


public class AuraLampGreen extends IMetaBlock<BlockTypes> {

	public AuraLampGreen() {
		super(Material.ROCK, "aura_lamp_green");
		this.setSoundType(SoundType.GLASS);
		this.setHardness(1.5F);
		this.setLightLevel(1.0F);
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