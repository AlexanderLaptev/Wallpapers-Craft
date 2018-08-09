package forcex.mods.wpcraft.blocks;

import com.sun.istack.internal.NotNull;
import forcex.mods.wpcraft.Reference;
import forcex.mods.wpcraft.blockStates.BlockTypes;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

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

			if(stack != null && stack != ItemStack.EMPTY)
				items.add(stack);
		}
	}
}