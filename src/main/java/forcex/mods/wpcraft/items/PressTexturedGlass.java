package forcex.mods.wpcraft.items;

import java.util.List;

import forcex.mods.wpcraft.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public class PressTexturedGlass extends Item {

    public PressTexturedGlass() {
        setRegistryName("press_textured_glass");
        setUnlocalizedName("presstexturedglass");
		setContainerItem(this);
		setCreativeTab(Reference.MODTAB);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

	public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips) {
		tooltipLines.add("Combine this with any stained glass to apply the Textured pattern.");
	}

}