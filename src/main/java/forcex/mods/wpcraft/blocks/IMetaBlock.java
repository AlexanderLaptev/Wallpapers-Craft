package forcex.mods.wpcraft.blocks;

import forcex.mods.wpcraft.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public abstract class IMetaBlock<T extends Enum<T> & IStringSerializable & IVariantDefinition> extends Block implements IMetaBlockName
{
	//private final Collection<T> variantValues;

	private ItemBlockMeta itemBlock;

	protected IMetaBlock(Material materialIn, String registryName)
	{
		super(materialIn);

		//variantValues = getVariantEnum().getAllowedValues();

		setCreativeTab(Reference.MODTAB);
		setHardness(2.0F);
		setResistance(6.0F);

		setDefaultState(this.blockState.getBaseState().withProperty(getVariantEnum(), getDefaultStateVariant()));
		setRegistryName(registryName);
		setUnlocalizedName("WallpaperCraft:" + registryName);

		itemBlock = new ItemBlockMeta(this);
		ForgeRegistries.ITEMS.register(itemBlock);
		//ForgeRegistries.ITEMS.register(new ItemBlockMeta(this));
	}

	protected abstract T getDefaultStateVariant();

	protected abstract PropertyEnum<T> getVariantEnum();

	protected abstract T fromMeta(int meta);

	public void initModel()
	{
		//Register ItemBlockMeta models
		if(Reference.DEBUG)	System.out.println("Registering itemblock models");
		for (int i = 0; i < 15; i++)
		{
			ModelResourceLocation model = new ModelResourceLocation(getRegistryName(), "type=" + i);
			ModelLoader.setCustomModelResourceLocation(itemBlock, i, model);
		}
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[]{getVariantEnum()});
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return getDefaultState().withProperty(getVariantEnum(), fromMeta(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		T type = state.getValue(getVariantEnum());
		return type.getMeta();
	}

	@Override
	public int damageDropped(IBlockState state)
	{
		return getMetaFromState(state);
	}

	@Override
	public String getSpecialName(ItemStack stack)
	{
		return fromMeta(stack.getItemDamage()).getName();
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player)
	{
		return new ItemStack(Item.getItemFromBlock(this), 1, this.getMetaFromState(world.getBlockState(pos)));
	}


}


