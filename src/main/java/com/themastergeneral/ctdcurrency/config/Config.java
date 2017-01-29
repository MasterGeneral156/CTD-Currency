package com.themastergeneral.ctdcurrency.config;

import org.apache.logging.log4j.Level;

import com.themastergeneral.ctdcurrency.Main;
import com.themastergeneral.ctdcurrency.proxy.CommonProxy;

import scala.Int;
import net.minecraftforge.common.config.Configuration;

public class Config 
{
    private static final String CATEGORY_GENERAL = "General";

    // This values below you can access elsewhere in your mod:
    public static String ModVersion = Main.VERSION+"-1.10.2";
    public static Boolean disableJei = false;
    public static Boolean disableBossDrops = false;
    public static Boolean disableMobDrops = false;
    public static int dropChance = 100;

    // Call this from CommonProxy.preInit(). It will create our config if it doesn't
    // exist yet and read the values if it does exist.
    public static void readConfig() 
    {
        Configuration cfg = CommonProxy.config;
        try 
        {
            cfg.load();
            initGeneralConfig(cfg);
        } 
        catch (Exception e1) 
        {
            Main.logger.log(Level.ERROR, "Problem loading config file!", e1);
        }
        finally 
        {
            if (cfg.hasChanged()) 
            {
                cfg.save();
            }
        }
    }
    private static void initGeneralConfig(Configuration cfg) 
    {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration for the CTD Currency mod.");
        ModVersion = cfg.getString("ModVersion", CATEGORY_GENERAL, ModVersion, "Internal. Don't need to mess with this.");
        disableJei = cfg.getBoolean("disableJei", CATEGORY_GENERAL, disableJei, "Set to true to remove Just Enough Items integration.");
        disableMobDrops = cfg.getBoolean("disableMobDrops", CATEGORY_GENERAL, disableMobDrops, "Set to true to stop mobs dropping currency occasionally on death.");
        disableBossDrops = cfg.getBoolean("disableBossDrops", CATEGORY_GENERAL, disableBossDrops, "Set to true to stop Boss Mobs dropping substantial amount of currency on death.");
        dropChance = cfg.getInt("dropChance", CATEGORY_GENERAL, dropChance, 2, 65655, "How often mobs will drop currency. Higher the number, less of a chance.");
    }
}
