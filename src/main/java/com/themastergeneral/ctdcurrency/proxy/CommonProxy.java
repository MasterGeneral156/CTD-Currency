package com.themastergeneral.ctdcurrency.proxy;

import java.io.File;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.themastergeneral.ctdcurrency.config.Config;
import com.themastergeneral.ctdcurrency.events.Events;
import com.themastergeneral.ctdcurrency.events.achievements.Achievements;
import com.themastergeneral.ctdcurrency.handler.Crafting;
import com.themastergeneral.ctdcurrency.items.ModItems;

public class CommonProxy 
{
	public static Configuration config;
    public void preInit(FMLPreInitializationEvent e) 
    {
    	File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "CTD/CTDCurrency.cfg"));
		Config.readConfig();
    	ModItems.init();
    	Achievements.init();
    	Achievements.secondinit();
    	MinecraftForge.EVENT_BUS.register(new Events());
    	Crafting.addRecipes();
    }

    public void init(FMLInitializationEvent e) 
    {

    }

    public void postInit(FMLPostInitializationEvent e)
    {

    }
}