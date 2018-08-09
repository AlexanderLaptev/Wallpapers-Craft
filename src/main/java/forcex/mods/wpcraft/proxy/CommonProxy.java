package forcex.mods.wpcraft.proxy;

import forcex.mods.wpcraft.compatability.ChiselSupport;
import forcex.mods.wpcraft.handler.ConfigHandler;
import forcex.mods.wpcraft.handler.EventHandler;
import forcex.mods.wpcraft.handler.PacketHandler;
import forcex.mods.wpcraft.init.ModItems;
//import forcex.mods.wpcraft.recipes.Recipies;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class CommonProxy
{

	public static Configuration config;

	public void preInit(FMLPreInitializationEvent event)
	{
		File directory = event.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "WallpapersCraft.cfg"));
		ConfigHandler.readConfig();

		if (ConfigHandler.enableChisel == true)
		{
			if (Loader.isModLoaded("chisel"))
			{
				ChiselSupport.init();
			}
			else System.out.print("Install Chisel and set 'enableChisel' to true in the WallpapersCraft config file to enable Chisel intergration ");
		}

//		if (ConfigHandler.enableForestry == true)
//		{
//			if (Loader.isModLoaded("forestry"))
//			{
//				ChiselSupport.init();
//			} else System.out.print("Install Chisel and set 'enableChisel' to true in the WallpapersCraft config file to enable Chisel intergration ");
//		}

		//ModBlocks.init();
		ModItems.init();
	}

	public void init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new EventHandler());
		PacketHandler.registerMessages("MetaCycle");
		//Recipies.init();
	}

	public void postInit(FMLPostInitializationEvent event)
	{
		if (config.hasChanged())
		{
			config.save();
		}
	}
}	