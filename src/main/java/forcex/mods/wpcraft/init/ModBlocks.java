package forcex.mods.wpcraft.init;


import forcex.mods.wpcraft.blocks.FancyTiles.*;
import forcex.mods.wpcraft.blocks.ItemBlockMeta;
import forcex.mods.wpcraft.blocks.bricks.*;
import forcex.mods.wpcraft.blocks.carpets.*;
import forcex.mods.wpcraft.blocks.clay.*;
import forcex.mods.wpcraft.blocks.damask.*;
import forcex.mods.wpcraft.blocks.dotted.*;
import forcex.mods.wpcraft.blocks.floral.*;
import forcex.mods.wpcraft.blocks.glass.*;
import forcex.mods.wpcraft.blocks.jewel.Jewel;
import forcex.mods.wpcraft.blocks.lamps.*;
import forcex.mods.wpcraft.blocks.planks.*;
import forcex.mods.wpcraft.blocks.rippled.*;
import forcex.mods.wpcraft.blocks.solid.*;
import forcex.mods.wpcraft.blocks.stamp.Stamp;
import forcex.mods.wpcraft.blocks.striped.*;
import forcex.mods.wpcraft.blocks.wool.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
@GameRegistry.ObjectHolder("wpcraft")
public class ModBlocks
{
	//Blocks definition
	public static SolidRed SolidRed = new SolidRed();
	public static SolidPurple SolidPurple = new SolidPurple();
	public static SolidBlue SolidBlue = new SolidBlue();
	public static SolidCyan SolidCyan = new SolidCyan();
	public static SolidGreen SolidGreen = new SolidGreen();
	public static SolidYellow SolidYellow = new SolidYellow();
	public static SolidBrown SolidBrown = new SolidBrown();
	public static SolidGray SolidGray = new SolidGray();

	public static DiagonallyDottedRed DiagonallyDottedRed = new DiagonallyDottedRed();
	public static DiagonallyDottedPurple DiagonallyDottedPurple = new DiagonallyDottedPurple();
	public static DiagonallyDottedBlue DiagonallyDottedBlue = new DiagonallyDottedBlue();
	public static DiagonallyDottedCyan DiagonallyDottedCyan = new DiagonallyDottedCyan();
	public static DiagonallyDottedGreen DiagonallyDottedGreen = new DiagonallyDottedGreen();
	public static DiagonallyDottedYellow DiagonallyDottedYellow = new DiagonallyDottedYellow();
	public static DiagonallyDottedBrown DiagonallyDottedBrown = new DiagonallyDottedBrown();
	public static DiagonallyDottedGray DiagonallyDottedGray = new DiagonallyDottedGray();

	public static DottedRed DottedRed = new DottedRed();
	public static DottedPurple DottedPurple = new DottedPurple();
	public static DottedBlue DottedBlue = new DottedBlue();
	public static DottedCyan DottedCyan = new DottedCyan();
	public static DottedGreen DottedGreen = new DottedGreen();
	public static DottedYellow DottedYellow = new DottedYellow();
	public static DottedBrown DottedBrown = new DottedBrown();
	public static DottedGray DottedGray = new DottedGray();

	public static StripedRed StripedRed = new StripedRed();
	public static StripedPurple StripedPurple = new StripedPurple();
	public static StripedBlue StripedBlue = new StripedBlue();
	public static StripedCyan StripedCyan = new StripedCyan();
	public static StripedGreen StripedGreen = new StripedGreen();
	public static StripedYellow StripedYellow = new StripedYellow();
	public static StripedBrown StripedBrown = new StripedBrown();
	public static StripedGray StripedGray = new StripedGray();

	public static FloralRed FloralRed = new FloralRed();
	public static FloralPurple FloralPurple = new FloralPurple();
	public static FloralBlue FloralBlue = new FloralBlue();
	public static FloralCyan FloralCyan = new FloralCyan();
	public static FloralGreen FloralGreen = new FloralGreen();
	public static FloralYellow FloralYellow = new FloralYellow();
	public static FloralBrown FloralBrown = new FloralBrown();
	public static FloralGray FloralGray = new FloralGray();

	public static DamaskRed DamaskRed = new DamaskRed();
	public static DamaskPurple DamaskPurple = new DamaskPurple();
	public static DamaskBlue DamaskBlue = new DamaskBlue();
	public static DamaskCyan DamaskCyan = new DamaskCyan();
	public static DamaskGreen DamaskGreen = new DamaskGreen();
	public static DamaskYellow DamaskYellow = new DamaskYellow();
	public static DamaskBrown DamaskBrown = new DamaskBrown();
	public static DamaskGray DamaskGray = new DamaskGray();

	public static ClayRed ClayRed = new ClayRed();
	public static ClayPurple ClayPurple = new ClayPurple();
	public static ClayBlue ClayBlue = new ClayBlue();
	public static ClayCyan ClayCyan = new ClayCyan();
	public static ClayGreen ClayGreen = new ClayGreen();
	public static ClayYellow ClayYellow = new ClayYellow();
	public static ClayBrown ClayBrown = new ClayBrown();
	public static ClayGray ClayGray = new ClayGray();

	public static BrickRed BrickRed = new BrickRed();
	public static BrickPurple BrickPurple = new BrickPurple();
	public static BrickBlue BrickBlue = new BrickBlue();
	public static BrickCyan BrickCyan = new BrickCyan();
	public static BrickGreen BrickGreen = new BrickGreen();
	public static BrickYellow BrickYellow = new BrickYellow();
	public static BrickBrown BrickBrown = new BrickBrown();
	public static BrickGray BrickGray = new BrickGray();

	public static StoneBrickRed StoneBrickRed = new StoneBrickRed();
	public static StoneBrickPurple StoneBrickPurple = new StoneBrickPurple();
	public static StoneBrickBlue StoneBrickBlue = new StoneBrickBlue();
	public static StoneBrickCyan StoneBrickCyan = new StoneBrickCyan();
	public static StoneBrickGreen StoneBrickGreen = new StoneBrickGreen();
	public static StoneBrickYellow StoneBrickYellow = new StoneBrickYellow();
	public static StoneBrickBrown StoneBrickBrown = new StoneBrickBrown();
	public static StoneBrickGray StoneBrickGray = new StoneBrickGray();

	public static ColouredBrickRed ColouredBrickRed = new ColouredBrickRed();
	public static ColouredBrickPurple ColouredBrickPurple = new ColouredBrickPurple();
	public static ColouredBrickBlue ColouredBrickBlue = new ColouredBrickBlue();
	public static ColouredBrickCyan ColouredBrickCyan = new ColouredBrickCyan();
	public static ColouredBrickGreen ColouredBrickGreen = new ColouredBrickGreen();
	public static ColouredBrickYellow ColouredBrickYellow = new ColouredBrickYellow();
	public static ColouredBrickBrown ColouredBrickBrown = new ColouredBrickBrown();
	public static ColouredBrickGray ColouredBrickGray = new ColouredBrickGray();

	public static StoneLampRed StoneLampRed = new StoneLampRed();
	public static StoneLampPurple StoneLampPurple = new StoneLampPurple();
	public static StoneLampBlue StoneLampBlue = new StoneLampBlue();
	public static StoneLampCyan StoneLampCyan = new StoneLampCyan();
	public static StoneLampGreen StoneLampGreen = new StoneLampGreen();
	public static StoneLampYellow StoneLampYellow = new StoneLampYellow();
	public static StoneLampBrown StoneLampBrown = new StoneLampBrown();
	public static StoneLampGray StoneLampGray = new StoneLampGray();

	public static RippledRed RippledRed = new RippledRed();
	public static RippledPurple RippledPurple = new RippledPurple();
	public static RippledBlue RippledBlue = new RippledBlue();
	public static RippledCyan RippledCyan = new RippledCyan();
	public static RippledGreen RippledGreen = new RippledGreen();
	public static RippledYellow RippledYellow = new RippledYellow();
	public static RippledBrown RippledBrown = new RippledBrown();
	public static RippledGray RippledGray = new RippledGray();

	public static FancyTilesRed FancyTilesRed = new FancyTilesRed();
	public static FancyTilesPurple FancyTilesPurple = new FancyTilesPurple();
	public static FancyTilesBlue FancyTilesBlue = new FancyTilesBlue();
	public static FancyTilesCyan FancyTilesCyan = new FancyTilesCyan();
	public static FancyTilesGreen FancyTilesGreen = new FancyTilesGreen();
	public static FancyTilesYellow FancyTilesYellow = new FancyTilesYellow();
	public static FancyTilesBrown FancyTilesBrown = new FancyTilesBrown();
	public static FancyTilesGray FancyTilesGray = new FancyTilesGray();

	public static Stamp Stamp = new Stamp();

	public static Jewel Jewel = new Jewel();

	public static WoodPlankRed WoodPlankRed = new WoodPlankRed();
	public static WoodPlankPurple WoodPlankPurple = new WoodPlankPurple();
	public static WoodPlankBlue WoodPlankBlue = new WoodPlankBlue();
	public static WoodPlankCyan WoodPlankCyan = new WoodPlankCyan();
	public static WoodPlankGreen WoodPlankGreen = new WoodPlankGreen();
	public static WoodPlankYellow WoodPlankYellow = new WoodPlankYellow();
	public static WoodPlankBrown WoodPlankBrown = new WoodPlankBrown();
	public static WoodPlankGray WoodPlankGray = new WoodPlankGray();

	public static WoolRed WoolRed = new WoolRed();
	public static WoolPurple WoolPurple = new WoolPurple();
	public static WoolBlue WoolBlue = new WoolBlue();
	public static WoolCyan WoolCyan = new WoolCyan();
	public static WoolGreen WoolGreen = new WoolGreen();
	public static WoolYellow WoolYellow = new WoolYellow();
	public static WoolBrown WoolBrown = new WoolBrown();
	public static WoolGray WoolGray = new WoolGray();

	public static CheckeredWoolRed CheckeredWoolRed = new CheckeredWoolRed();
	public static CheckeredWoolPurple CheckeredWoolPurple = new CheckeredWoolPurple();
	public static CheckeredWoolBlue CheckeredWoolBlue = new CheckeredWoolBlue();
	public static CheckeredWoolCyan CheckeredWoolCyan = new CheckeredWoolCyan();
	public static CheckeredWoolGreen CheckeredWoolGreen = new CheckeredWoolGreen();
	public static CheckeredWoolYellow CheckeredWoolYellow = new CheckeredWoolYellow();
	public static CheckeredWoolBrown CheckeredWoolBrown = new CheckeredWoolBrown();
	public static CheckeredWoolGray CheckeredWoolGray = new CheckeredWoolGray();

	public static AuraLampRed AuraLampRed = new AuraLampRed();
	public static AuraLampPurple AuraLampPurple = new AuraLampPurple();
	public static AuraLampBlue AuraLampBlue = new AuraLampBlue();
	public static AuraLampCyan AuraLampCyan = new AuraLampCyan();
	public static AuraLampGreen AuraLampGreen = new AuraLampGreen();
	public static AuraLampYellow AuraLampYellow = new AuraLampYellow();
	public static AuraLampBrown AuraLampBrown = new AuraLampBrown();
	public static AuraLampGray AuraLampGray = new AuraLampGray();

	public static TintedGlassRed TintedGlassRed = new TintedGlassRed();
	public static TintedGlassPurple TintedGlassPurple = new TintedGlassPurple();
	public static TintedGlassBlue TintedGlassBlue = new TintedGlassBlue();
	public static TintedGlassCyan TintedGlassCyan = new TintedGlassCyan();
	public static TintedGlassGreen TintedGlassGreen = new TintedGlassGreen();
	public static TintedGlassYellow TintedGlassYellow = new TintedGlassYellow();
	public static TintedGlassBrown TintedGlassBrown = new TintedGlassBrown();
	public static TintedGlassGray TintedGlassGray = new TintedGlassGray();

	public static TexturedGlassRed TexturedGlassRed = new TexturedGlassRed();
	public static TexturedGlassPurple TexturedGlassPurple = new TexturedGlassPurple();
	public static TexturedGlassBlue TexturedGlassBlue = new TexturedGlassBlue();
	public static TexturedGlassCyan TexturedGlassCyan = new TexturedGlassCyan();
	public static TexturedGlassGreen TexturedGlassGreen = new TexturedGlassGreen();
	public static TexturedGlassYellow TexturedGlassYellow = new TexturedGlassYellow();
	public static TexturedGlassBrown TexturedGlassBrown = new TexturedGlassBrown();
	public static TexturedGlassGray TexturedGlassGray = new TexturedGlassGray();

	public static FrostedGlassRed FrostedGlassRed = new FrostedGlassRed();
	public static FrostedGlassPurple FrostedGlassPurple = new FrostedGlassPurple();
	public static FrostedGlassBlue FrostedGlassBlue = new FrostedGlassBlue();
	public static FrostedGlassCyan FrostedGlassCyan = new FrostedGlassCyan();
	public static FrostedGlassGreen FrostedGlassGreen = new FrostedGlassGreen();
	public static FrostedGlassYellow FrostedGlassYellow = new FrostedGlassYellow();
	public static FrostedGlassBrown FrostedGlassBrown = new FrostedGlassBrown();
	public static FrostedGlassGray FrostedGlassGray = new FrostedGlassGray();

	public static WoolCarpetRed WoolCarpetRed = new WoolCarpetRed();
	public static WoolCarpetPurple WoolCarpetPurple = new WoolCarpetPurple();
	public static WoolCarpetBlue WoolCarpetBlue = new WoolCarpetBlue();
	public static WoolCarpetCyan WoolCarpetCyan = new WoolCarpetCyan();
	public static WoolCarpetGreen WoolCarpetGreen = new WoolCarpetGreen();
	public static WoolCarpetYellow WoolCarpetYellow = new WoolCarpetYellow();
	public static WoolCarpetBrown WoolCarpetBrown = new WoolCarpetBrown();
	public static WoolCarpetGray WoolCarpetGray = new WoolCarpetGray();

	public static CheckeredCarpetRed CheckeredCarpetRed = new CheckeredCarpetRed();
	public static CheckeredCarpetPurple CheckeredCarpetPurple = new CheckeredCarpetPurple();
	public static CheckeredCarpetBlue CheckeredCarpetBlue = new CheckeredCarpetBlue();
	public static CheckeredCarpetCyan CheckeredCarpetCyan = new CheckeredCarpetCyan();
	public static CheckeredCarpetGreen CheckeredCarpetGreen = new CheckeredCarpetGreen();
	public static CheckeredCarpetYellow CheckeredCarpetYellow = new CheckeredCarpetYellow();
	public static CheckeredCarpetBrown CheckeredCarpetBrown = new CheckeredCarpetBrown();
	public static CheckeredCarpetGray CheckeredCarpetGray = new CheckeredCarpetGray();

	//InitModels
	@SubscribeEvent
	public static void initModels(ModelRegistryEvent event)
	{
		SolidRed.initModel();
		SolidPurple.initModel();
		SolidBlue.initModel();
		SolidCyan.initModel();
		SolidGreen.initModel();
		SolidYellow.initModel();
		SolidBrown.initModel();
		SolidGray.initModel();

		DiagonallyDottedRed.initModel();
		DiagonallyDottedPurple.initModel();
		DiagonallyDottedBlue.initModel();
		DiagonallyDottedCyan.initModel();
		DiagonallyDottedGreen.initModel();
		DiagonallyDottedYellow.initModel();
		DiagonallyDottedBrown.initModel();
		DiagonallyDottedGray.initModel();

		DottedRed.initModel();
		DottedPurple.initModel();
		DottedBlue.initModel();
		DottedCyan.initModel();
		DottedGreen.initModel();
		DottedYellow.initModel();
		DottedBrown.initModel();
		DottedGray.initModel();

		StripedRed.initModel();
		StripedPurple.initModel();
		StripedBlue.initModel();
		StripedCyan.initModel();
		StripedGreen.initModel();
		StripedYellow.initModel();
		StripedBrown.initModel();
		StripedGray.initModel();

		FloralRed.initModel();
		FloralPurple.initModel();
		FloralBlue.initModel();
		FloralCyan.initModel();
		FloralGreen.initModel();
		FloralYellow.initModel();
		FloralBrown.initModel();
		FloralGray.initModel();

		DamaskRed.initModel();
		DamaskPurple.initModel();
		DamaskBlue.initModel();
		DamaskCyan.initModel();
		DamaskGreen.initModel();
		DamaskYellow.initModel();
		DamaskBrown.initModel();
		DamaskGray.initModel();

		ClayRed.initModel();
		ClayPurple.initModel();
		ClayBlue.initModel();
		ClayCyan.initModel();
		ClayGreen.initModel();
		ClayYellow.initModel();
		ClayBrown.initModel();
		ClayGray.initModel();

		BrickRed.initModel();
		BrickPurple.initModel();
		BrickBlue.initModel();
		BrickCyan.initModel();
		BrickGreen.initModel();
		BrickYellow.initModel();
		BrickBrown.initModel();
		BrickGray.initModel();

		StoneBrickRed.initModel();
		StoneBrickPurple.initModel();
		StoneBrickBlue.initModel();
		StoneBrickCyan.initModel();
		StoneBrickGreen.initModel();
		StoneBrickYellow.initModel();
		StoneBrickBrown.initModel();
		StoneBrickGray.initModel();

		ColouredBrickRed.initModel();
		ColouredBrickPurple.initModel();
		ColouredBrickBlue.initModel();
		ColouredBrickCyan.initModel();
		ColouredBrickGreen.initModel();
		ColouredBrickYellow.initModel();
		ColouredBrickBrown.initModel();
		ColouredBrickGray.initModel();

		StoneLampRed.initModel();
		StoneLampPurple.initModel();
		StoneLampBlue.initModel();
		StoneLampCyan.initModel();
		StoneLampGreen.initModel();
		StoneLampYellow.initModel();
		StoneLampBrown.initModel();
		StoneLampGray.initModel();

		RippledRed.initModel();
		RippledPurple.initModel();
		RippledBlue.initModel();
		RippledCyan.initModel();
		RippledGreen.initModel();
		RippledYellow.initModel();
		RippledBrown.initModel();
		RippledGray.initModel();

		FancyTilesRed.initModel();
		FancyTilesPurple.initModel();
		FancyTilesBlue.initModel();
		FancyTilesCyan.initModel();
		FancyTilesGreen.initModel();
		FancyTilesYellow.initModel();
		FancyTilesBrown.initModel();
		FancyTilesGray.initModel();

		Stamp.initModel();

		Jewel.initModel();

		WoodPlankRed.initModel();
		WoodPlankPurple.initModel();
		WoodPlankBlue.initModel();
		WoodPlankCyan.initModel();
		WoodPlankGreen.initModel();
		WoodPlankYellow.initModel();
		WoodPlankBrown.initModel();
		WoodPlankGray.initModel();

		WoolRed.initModel();
		WoolPurple.initModel();
		WoolBlue.initModel();
		WoolCyan.initModel();
		WoolGreen.initModel();
		WoolYellow.initModel();
		WoolBrown.initModel();
		WoolGray.initModel();

		CheckeredWoolRed.initModel();
		CheckeredWoolPurple.initModel();
		CheckeredWoolBlue.initModel();
		CheckeredWoolCyan.initModel();
		CheckeredWoolGreen.initModel();
		CheckeredWoolYellow.initModel();
		CheckeredWoolBrown.initModel();
		CheckeredWoolGray.initModel();

		AuraLampRed.initModel();
		AuraLampPurple.initModel();
		AuraLampBlue.initModel();
		AuraLampCyan.initModel();
		AuraLampGreen.initModel();
		AuraLampYellow.initModel();
		AuraLampBrown.initModel();
		AuraLampGray.initModel();

		TintedGlassRed.initModel();
		TintedGlassPurple.initModel();
		TintedGlassBlue.initModel();
		TintedGlassCyan.initModel();
		TintedGlassGreen.initModel();
		TintedGlassYellow.initModel();
		TintedGlassBrown.initModel();
		TintedGlassGray.initModel();

		TexturedGlassRed.initModel();
		TexturedGlassPurple.initModel();
		TexturedGlassBlue.initModel();
		TexturedGlassCyan.initModel();
		TexturedGlassGreen.initModel();
		TexturedGlassYellow.initModel();
		TexturedGlassBrown.initModel();
		TexturedGlassGray.initModel();

		FrostedGlassRed.initModel();
		FrostedGlassPurple.initModel();
		FrostedGlassBlue.initModel();
		FrostedGlassCyan.initModel();
		FrostedGlassGreen.initModel();
		FrostedGlassYellow.initModel();
		FrostedGlassBrown.initModel();
		FrostedGlassGray.initModel();

		WoolCarpetRed.initModel();
		WoolCarpetPurple.initModel();
		WoolCarpetBlue.initModel();
		WoolCarpetCyan.initModel();
		WoolCarpetGreen.initModel();
		WoolCarpetYellow.initModel();
		WoolCarpetBrown.initModel();
		WoolCarpetGray.initModel();

		CheckeredCarpetRed.initModel();
		CheckeredCarpetPurple.initModel();
		CheckeredCarpetBlue.initModel();
		CheckeredCarpetCyan.initModel();
		CheckeredCarpetGreen.initModel();
		CheckeredCarpetYellow.initModel();
		CheckeredCarpetBrown.initModel();
		CheckeredCarpetGray.initModel();
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		System.out.println("Registering blocks");
		event.getRegistry().register(SolidRed);
		event.getRegistry().register(SolidPurple);
		event.getRegistry().register(SolidBlue);
		event.getRegistry().register(SolidCyan);
		event.getRegistry().register(SolidGreen);
		event.getRegistry().register(SolidYellow);
		event.getRegistry().register(SolidBrown);
		event.getRegistry().register(SolidGray);

		event.getRegistry().register(DiagonallyDottedRed);
		event.getRegistry().register(DiagonallyDottedPurple);
		event.getRegistry().register(DiagonallyDottedBlue);
		event.getRegistry().register(DiagonallyDottedCyan);
		event.getRegistry().register(DiagonallyDottedGreen);
		event.getRegistry().register(DiagonallyDottedYellow);
		event.getRegistry().register(DiagonallyDottedBrown);
		event.getRegistry().register(DiagonallyDottedGray);

		event.getRegistry().register(DottedRed);
		event.getRegistry().register(DottedPurple);
		event.getRegistry().register(DottedBlue);
		event.getRegistry().register(DottedCyan);
		event.getRegistry().register(DottedGreen);
		event.getRegistry().register(DottedYellow);
		event.getRegistry().register(DottedBrown);
		event.getRegistry().register(DottedGray);

		event.getRegistry().register(StripedRed);
		event.getRegistry().register(StripedPurple);
		event.getRegistry().register(StripedBlue);
		event.getRegistry().register(StripedCyan);
		event.getRegistry().register(StripedGreen);
		event.getRegistry().register(StripedYellow);
		event.getRegistry().register(StripedBrown);
		event.getRegistry().register(StripedGray);

		event.getRegistry().register(FloralRed);
		event.getRegistry().register(FloralPurple);
		event.getRegistry().register(FloralBlue);
		event.getRegistry().register(FloralCyan);
		event.getRegistry().register(FloralGreen);
		event.getRegistry().register(FloralYellow);
		event.getRegistry().register(FloralBrown);
		event.getRegistry().register(FloralGray);

		event.getRegistry().register(DamaskRed);
		event.getRegistry().register(DamaskPurple);
		event.getRegistry().register(DamaskBlue);
		event.getRegistry().register(DamaskCyan);
		event.getRegistry().register(DamaskGreen);
		event.getRegistry().register(DamaskYellow);
		event.getRegistry().register(DamaskBrown);
		event.getRegistry().register(DamaskGray);

		event.getRegistry().register(ClayRed);
		event.getRegistry().register(ClayPurple);
		event.getRegistry().register(ClayBlue);
		event.getRegistry().register(ClayCyan);
		event.getRegistry().register(ClayGreen);
		event.getRegistry().register(ClayYellow);
		event.getRegistry().register(ClayBrown);
		event.getRegistry().register(ClayGray);

		event.getRegistry().register(BrickRed);
		event.getRegistry().register(BrickPurple);
		event.getRegistry().register(BrickBlue);
		event.getRegistry().register(BrickCyan);
		event.getRegistry().register(BrickGreen);
		event.getRegistry().register(BrickYellow);
		event.getRegistry().register(BrickBrown);
		event.getRegistry().register(BrickGray);

		event.getRegistry().register(StoneBrickRed);
		event.getRegistry().register(StoneBrickPurple);
		event.getRegistry().register(StoneBrickBlue);
		event.getRegistry().register(StoneBrickCyan);
		event.getRegistry().register(StoneBrickGreen);
		event.getRegistry().register(StoneBrickYellow);
		event.getRegistry().register(StoneBrickBrown);
		event.getRegistry().register(StoneBrickGray);

		event.getRegistry().register(ColouredBrickRed);
		event.getRegistry().register(ColouredBrickPurple);
		event.getRegistry().register(ColouredBrickBlue);
		event.getRegistry().register(ColouredBrickCyan);
		event.getRegistry().register(ColouredBrickGreen);
		event.getRegistry().register(ColouredBrickYellow);
		event.getRegistry().register(ColouredBrickBrown);
		event.getRegistry().register(ColouredBrickGray);

		event.getRegistry().register(StoneLampRed);
		event.getRegistry().register(StoneLampPurple);
		event.getRegistry().register(StoneLampBlue);
		event.getRegistry().register(StoneLampCyan);
		event.getRegistry().register(StoneLampGreen);
		event.getRegistry().register(StoneLampYellow);
		event.getRegistry().register(StoneLampBrown);
		event.getRegistry().register(StoneLampGray);

		event.getRegistry().register(RippledRed);
		event.getRegistry().register(RippledPurple);
		event.getRegistry().register(RippledBlue);
		event.getRegistry().register(RippledCyan);
		event.getRegistry().register(RippledGreen);
		event.getRegistry().register(RippledYellow);
		event.getRegistry().register(RippledBrown);
		event.getRegistry().register(RippledGray);

		event.getRegistry().register(FancyTilesRed);
		event.getRegistry().register(FancyTilesPurple);
		event.getRegistry().register(FancyTilesBlue);
		event.getRegistry().register(FancyTilesCyan);
		event.getRegistry().register(FancyTilesGreen);
		event.getRegistry().register(FancyTilesYellow);
		event.getRegistry().register(FancyTilesBrown);
		event.getRegistry().register(FancyTilesGray);

		event.getRegistry().register(Stamp);

		event.getRegistry().register(Jewel);

		event.getRegistry().register(WoodPlankRed);
		event.getRegistry().register(WoodPlankPurple);
		event.getRegistry().register(WoodPlankBlue);
		event.getRegistry().register(WoodPlankCyan);
		event.getRegistry().register(WoodPlankGreen);
		event.getRegistry().register(WoodPlankYellow);
		event.getRegistry().register(WoodPlankBrown);
		event.getRegistry().register(WoodPlankGray);

		event.getRegistry().register(WoolRed);
		event.getRegistry().register(WoolPurple);
		event.getRegistry().register(WoolBlue);
		event.getRegistry().register(WoolCyan);
		event.getRegistry().register(WoolGreen);
		event.getRegistry().register(WoolYellow);
		event.getRegistry().register(WoolBrown);
		event.getRegistry().register(WoolGray);

		event.getRegistry().register(CheckeredWoolRed);
		event.getRegistry().register(CheckeredWoolPurple);
		event.getRegistry().register(CheckeredWoolBlue);
		event.getRegistry().register(CheckeredWoolCyan);
		event.getRegistry().register(CheckeredWoolGreen);
		event.getRegistry().register(CheckeredWoolYellow);
		event.getRegistry().register(CheckeredWoolBrown);
		event.getRegistry().register(CheckeredWoolGray);

		event.getRegistry().register(AuraLampRed);
		event.getRegistry().register(AuraLampPurple);
		event.getRegistry().register(AuraLampBlue);
		event.getRegistry().register(AuraLampCyan);
		event.getRegistry().register(AuraLampGreen);
		event.getRegistry().register(AuraLampYellow);
		event.getRegistry().register(AuraLampBrown);
		event.getRegistry().register(AuraLampGray);

		event.getRegistry().register(TintedGlassRed);
		event.getRegistry().register(TintedGlassPurple);
		event.getRegistry().register(TintedGlassBlue);
		event.getRegistry().register(TintedGlassCyan);
		event.getRegistry().register(TintedGlassGreen);
		event.getRegistry().register(TintedGlassYellow);
		event.getRegistry().register(TintedGlassBrown);
		event.getRegistry().register(TintedGlassGray);

		event.getRegistry().register(TexturedGlassRed);
		event.getRegistry().register(TexturedGlassPurple);
		event.getRegistry().register(TexturedGlassBlue);
		event.getRegistry().register(TexturedGlassCyan);
		event.getRegistry().register(TexturedGlassGreen);
		event.getRegistry().register(TexturedGlassYellow);
		event.getRegistry().register(TexturedGlassBrown);
		event.getRegistry().register(TexturedGlassGray);

		event.getRegistry().register(FrostedGlassRed);
		event.getRegistry().register(FrostedGlassPurple);
		event.getRegistry().register(FrostedGlassBlue);
		event.getRegistry().register(FrostedGlassCyan);
		event.getRegistry().register(FrostedGlassGreen);
		event.getRegistry().register(FrostedGlassYellow);
		event.getRegistry().register(FrostedGlassBrown);
		event.getRegistry().register(FrostedGlassGray);

		event.getRegistry().register(WoolCarpetRed);
		event.getRegistry().register(WoolCarpetPurple);
		event.getRegistry().register(WoolCarpetBlue);
		event.getRegistry().register(WoolCarpetCyan);
		event.getRegistry().register(WoolCarpetGreen);
		event.getRegistry().register(WoolCarpetYellow);
		event.getRegistry().register(WoolCarpetBrown);
		event.getRegistry().register(WoolCarpetGray);

		event.getRegistry().register(CheckeredCarpetRed);
		event.getRegistry().register(CheckeredCarpetPurple);
		event.getRegistry().register(CheckeredCarpetBlue);
		event.getRegistry().register(CheckeredCarpetCyan);
		event.getRegistry().register(CheckeredCarpetGreen);
		event.getRegistry().register(CheckeredCarpetYellow);
		event.getRegistry().register(CheckeredCarpetBrown);
		event.getRegistry().register(CheckeredCarpetGray);

//		  //OreDict registration
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidRed, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidPurple, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidBlue, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidCyan, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidGreen, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidYellow, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidBrown, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("solidWPBlocks", new ItemStack(SolidGray, 1, OreDictionary.WILDCARD_VALUE));
	}
}