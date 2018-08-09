package forcex.mods.wpcraft.handler;

import forcex.mods.wpcraft.blocks.ItemBlockMeta;
import forcex.mods.wpcraft.blocks.ItemBlockMeta2;
import forcex.mods.wpcraft.blocks.ItemBlockMeta3;
import forcex.mods.wpcraft.network.MetaCycle;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

public class EventHandler
{
	/* @SubscribeEvent
	 public void onMouseInput(MouseEvent event) {
		 if (Minecraft.getMinecraft().currentScreen == null) {
			 EntityPlayer player = Minecraft.getMinecraft().thePlayer;
			 ItemStack held = player.getHeldItem(EnumHand.MAIN_HAND);

			 if (event.getDwheel() != 0 && player.isSneaking() && held.getItem() instanceof ItemBlockMeta) {
				 PacketHandler.NETWORK_WRAPPER.sendToServer(new MetaCycle(event.getDwheel() > 0));
							 event.setCanceled(true);
			 }
		 }
	 }
	 */
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onMouseEvent(MouseEvent event)
	{
		EntityPlayer entityPlayer = Minecraft.getMinecraft().player;

		{
			ItemStack itemStack = entityPlayer.getHeldItem(EnumHand.MAIN_HAND);
			if ((Keyboard.isKeyDown(184)) || (Keyboard.isKeyDown(56)) || (Keyboard.isKeyDown(157)) || (Keyboard.isKeyDown(29)))
			{
				if ((itemStack != ItemStack.EMPTY) && ((itemStack.getItem() instanceof ItemBlockMeta)) ||
						(itemStack != ItemStack.EMPTY) && ((itemStack.getItem() instanceof ItemBlockMeta2)) ||
						(itemStack != ItemStack.EMPTY) && ((itemStack.getItem() instanceof ItemBlockMeta3)))
				{
					if (event.getDwheel() != 0)
					{
						PacketHandler.NETWORK_WRAPPER.sendToServer(new MetaCycle(event.getDwheel() > 0));
					}
					event.setCanceled(true);
				}
			}
		}
	}
}


