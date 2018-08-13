package forcex.mods.wpcraft.items;

import java.util.List;

import forcex.mods.wpcraft.Reference;
import forcex.mods.wpcraft.init.ModCreativeTabs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

public class PressBlank extends Item {

    public PressBlank() {
        setRegistryName("press_blank");
        setUnlocalizedName("pressblank");
        setCreativeTab(Reference.MODTAB);
        setMaxDamage(4);
        setMaxStackSize(16);
    }

//    @SideOnly(Side.CLIENT)
//    public void initModel() {
//        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
//    }

	@Override
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	{
		tooltip.add("Combine this with a relevant item to get a pattern press.");
	}

	@Override
	public boolean hasContainerItem(ItemStack stack)
	{
		return true;
	}

	@Override
	public boolean isDamageable()
	{
		return true;
	}

	@Override
	public int getItemStackLimit(ItemStack stack)
	{
		return stack.getItemDamage() == 0 ? super.getItemStackLimit(stack) : 1;
	}

	@Nullable
	@Override
	public ItemStack getContainerItem(ItemStack stack)
	{
		stack = stack.copy();
		stack.attemptDamageItem(1, itemRand, null);
		return stack;
	}
}