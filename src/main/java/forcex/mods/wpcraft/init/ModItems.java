package forcex.mods.wpcraft.init;

import forcex.mods.wpcraft.Reference;
import forcex.mods.wpcraft.blocks.ItemBlockMeta;
import forcex.mods.wpcraft.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import forcex.mods.wpcraft.items.*;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Objects;


@Mod.EventBusSubscriber
public class ModItems {

    //public static spectrum spectrum;
	@GameRegistry.ObjectHolder("wpcraft:press_blank")
	public static PressBlank PressBlank;

	@GameRegistry.ObjectHolder("wpcraft:press_diagonally_dotted")
	public static PressDiagonallyDotted PressDiagonallyDotted;

	public static forcex.mods.wpcraft.items.PressDotted PressDotted;
	public static forcex.mods.wpcraft.items.PressStriped PressStriped;
	public static forcex.mods.wpcraft.items.PressFloral PressFloral;
	public static PressDamask PressDamask;
	public static PressClay PressClay;
	public static PressTintedGlass PressTintedGlass;
	public static PressTexturedGlass PressTexturedGlass;
	public static PressFrostedGlass PressFrostedGlass;
	public static PressBrick PressBrick;
	public static PressStoneBrick PressStoneBrick;
	public static PressColouredBrick PressColouredBrick;
	public static PressStoneLamp PressStoneLamp;
	public static PressRippled PressRippled;
	public static PressFancyTiles PressFancyTiles;
	public static PressStamp PressStamp;
	public static PressJewel PressJewel;
	public static PressWoodPlank PressWoodPlank;
	public static PressWool PressWool;
	public static PressCheckered PressCheckered;
	public static PressAuraLamp PressAuraLamp;

    public static void init() {
    	//spectrum = new spectrum();
    	PressBlank = new PressBlank();
    	PressDiagonallyDotted = new PressDiagonallyDotted();
    	PressDotted = new PressDotted();
    	PressStriped = new PressStriped();
    	PressFloral = new PressFloral();
    	PressDamask = new PressDamask();
    	PressClay = new PressClay();
    	PressTintedGlass = new PressTintedGlass();
    	PressTexturedGlass = new PressTexturedGlass();
    	PressFrostedGlass = new PressFrostedGlass();
    	PressBrick = new PressBrick();
    	PressStoneBrick = new PressStoneBrick();
    	PressColouredBrick = new PressColouredBrick();
    	PressStoneLamp = new PressStoneLamp();
    	PressRippled = new PressRippled();
    	PressFancyTiles = new PressFancyTiles();
    	PressStamp = new PressStamp();
    	PressJewel = new PressJewel();
    	PressWoodPlank = new PressWoodPlank();
    	PressWool = new PressWool();
    	PressCheckered = new PressCheckered();
    	PressAuraLamp = new PressAuraLamp();
    }

//initModels(): deprecated [MC Forge 1.12.2]
//    @SideOnly(Side.CLIENT)
//    public static void initModels() {
//    	//spectrum.initModel();
//    	PressBlank.initModel();
//    	PressDiagonallyDotted.initModel();
//    	PressDotted.initModel();
//    	PressStriped.initModel();
//    	PressFloral.initModel();
//    	PressDamask.initModel();
//    	PressClay.initModel();
//    	PressTintedGlass.initModel();
//    	PressTexturedGlass.initModel();
//    	PressFrostedGlass.initModel();
//    	PressBrick.initModel();
//    	PressStoneBrick.initModel();
//    	PressColouredBrick.initModel();
//    	PressStoneLamp.initModel();
//    	PressRippled.initModel();
//    	PressFancyTiles.initModel();
//    	PressStamp.initModel();
//    	PressJewel.initModel();
//    	PressWoodPlank.initModel();
//     	PressWool.initModel();
//    	PressCheckered.initModel();
//    	PressAuraLamp.initModel();
//    }

    @SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		final IForgeRegistry<Item> registry = event.getRegistry(); //Getting the item registry

		registry.registerAll(PressBlank, PressDiagonallyDotted, PressDotted, PressStriped, PressFloral,
		PressDamask, PressClay, PressTintedGlass, PressTexturedGlass, PressFrostedGlass, PressBrick,
		PressStoneBrick, PressColouredBrick, PressStoneLamp, PressRippled, PressFancyTiles, PressStamp,
		PressJewel, PressWoodPlank, PressWool, PressCheckered, PressAuraLamp);

		//We don't call initModels() because this is not actual to the current MC Forge version
	}

	@SubscribeEvent
	public static void registerItemRenderers(ModelRegistryEvent event)
	{
		ModelLoader.setCustomModelResourceLocation(PressBlank, 0, new ModelResourceLocation(PressBlank.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressDiagonallyDotted, 0, new ModelResourceLocation(PressDiagonallyDotted.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressDotted, 0, new ModelResourceLocation(PressDotted.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressStriped, 0, new ModelResourceLocation(PressStriped.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressFloral, 0, new ModelResourceLocation(PressFloral.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressDamask, 0, new ModelResourceLocation(PressDamask.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressClay, 0, new ModelResourceLocation(PressClay.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressTintedGlass, 0, new ModelResourceLocation(PressTintedGlass.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressTexturedGlass, 0, new ModelResourceLocation(PressTexturedGlass.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressFrostedGlass, 0, new ModelResourceLocation(PressFrostedGlass.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressBrick, 0, new ModelResourceLocation(PressBrick.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressStoneBrick, 0, new ModelResourceLocation(PressStoneBrick.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressColouredBrick, 0, new ModelResourceLocation(PressColouredBrick.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressStoneLamp, 0, new ModelResourceLocation(PressStoneLamp.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressRippled, 0, new ModelResourceLocation(PressRippled.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressFancyTiles, 0, new ModelResourceLocation(PressFancyTiles.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressStamp, 0, new ModelResourceLocation(PressStamp.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressJewel, 0, new ModelResourceLocation(PressJewel.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressWoodPlank, 0, new ModelResourceLocation(PressWoodPlank.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressWool, 0, new ModelResourceLocation(PressWool.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressCheckered, 0, new ModelResourceLocation(PressCheckered.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(PressAuraLamp, 0, new ModelResourceLocation(PressAuraLamp.getRegistryName(), "inventory"));
	}
}