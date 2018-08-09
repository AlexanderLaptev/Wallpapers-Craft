package forcex.mods.wpcraft.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public final class ModCreativeTabs
{
	private ModCreativeTabs()
	{
	}

	public static final CreativeTabs WPtab = new CreativeTabs("WPtab")
	{
		@SideOnly(Side.CLIENT)
		@Override
		public ItemStack getIconItemStack()
		{
			ItemStack iStack = new ItemStack(ModBlocks.SolidBlue, 1, 13);
			return iStack;
		}

		public int getIconItemDamage()
		{
			return 1;
		}

		@Override
		public ItemStack getTabIconItem()
		{
			ItemStack iStack = new ItemStack(ModBlocks.SolidBlue, 1, 13);
			return iStack;
		}
	};
}