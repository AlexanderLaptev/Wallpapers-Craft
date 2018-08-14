package forcex.mods.wpcraft.blocks;

import forcex.mods.wpcraft.Reference;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemBlockMeta extends ItemBlock
{
	public ItemBlockMeta(Block block)
	{
		super(block);

		if (!(block instanceof IMetaBlockName))
		{
			throw new IllegalArgumentException(String.format("The given Block %s is not an instance of ISpecialBlockName!", block.getUnlocalizedName()));
		}
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		this.setRegistryName(block.getRegistryName());
		this.setCreativeTab(Reference.MODTAB);
	}

	public int getMetadata(int damage)
	{
		return damage;
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return super.getUnlocalizedName(stack) + "_" + ((IMetaBlockName) this.block).getSpecialName(stack);
	}

	public void registerModels()
	{

	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items)
	{
		for(int i = 0; i < 15; i++)
		{
			ItemStack stack = new ItemStack(this, 1, i);

			if(tab == Reference.MODTAB && isInCreativeTab(tab))
			{
				items.add(stack);
			}
		}
	}
}