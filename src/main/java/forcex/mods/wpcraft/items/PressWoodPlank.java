package forcex.mods.wpcraft.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class PressWoodPlank extends Item
{
	public PressWoodPlank()
	{
		setRegistryName("presswoodplank");
		setUnlocalizedName("presswoodplank");
		setContainerItem(this);
	}

	@SideOnly(Side.CLIENT)
	public void initModel()
	{
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

	public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips)
	{
		tooltipLines.add("Combine this with any solid colored block to apply the Wooden Plank pattern.");
	}
}
