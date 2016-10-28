package com.themastergeneral.ctdcurrency.proxy;

import net.minecraftforge.common.MinecraftForge;

import com.themastergeneral.ctdcurrency.events.Events;
import com.themastergeneral.ctdcurrency.events.achievements.Achievements;
import com.themastergeneral.ctdcurrency.items.ModItems;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.init();
    	Achievements.init();
    	Achievements.secondinit();
    	MinecraftForge.EVENT_BUS.register(new Events());
    	FMLCommonHandler.instance().bus().register(new Events());
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}