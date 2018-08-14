package forcex.mods.wpcraft;

import forcex.mods.wpcraft.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/*  The To-Do section

	TODO: Make carpets not stay in the world
	TODO: Check for recipes issues
*/

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS, dependencies = "required-after:chisel", useMetadata = true)
public class WallpapersCraft
	{
	    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	    public static CommonProxy proxy;

	    public static Logger logger;

	    @Instance
	    public static WallpapersCraft instance = new WallpapersCraft();
	     
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event)
		{
			logger = event.getModLog();
			logger.info("Debug: " + String.valueOf(logger.isDebugEnabled()));
			logger.info("Wallpapers Craft preInit");
	        WallpapersCraft.proxy.preInit(event);
	    }

	    @EventHandler
	    public void init(FMLInitializationEvent event)
		{
			logger.info("Wallpapers Craft init");
	        WallpapersCraft.proxy.init(event);
	    }
	        
	    @EventHandler
	    public void postInit(FMLPostInitializationEvent event)
		{
			logger.info("Wallpapers Craft postInit");
	    	WallpapersCraft.proxy.postInit(event);
	    }
	}



