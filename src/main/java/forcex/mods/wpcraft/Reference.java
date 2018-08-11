package forcex.mods.wpcraft;

import forcex.mods.wpcraft.init.ModCreativeTabs;
import net.minecraft.creativetab.CreativeTabs;

public class Reference
{
    public static final String MODID = "wpcraft";
    public static final String MODNAME = "Wallpapers Craft";
    public static final String VERSION = "0.0.1";
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    
    public static final String CLIENT_PROXY_CLASS = "forcex.mods.wpcraft.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "forcex.mods.wpcraft.proxy.ServerProxy";

    public static final CreativeTabs MODTAB = ModCreativeTabs.WPtab;

    public static final boolean DEBUG = false;
}