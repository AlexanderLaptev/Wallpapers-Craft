package forcex.mods.wpcraft.items;

import java.util.List;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public class PressAuraLamp extends Item {

    public PressAuraLamp() {
        setRegistryName("press_aura_lamp");
        setUnlocalizedName("press_aura_lamp");
        setContainerItem(this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

	public void addInformation(ItemStack itemStack, EntityPlayer player, List tooltipLines, boolean advancedTooltips) {
		tooltipLines.add("Combine this with any solid colored block to apply the Aura Lamp pattern and make it glow!");
	}

}