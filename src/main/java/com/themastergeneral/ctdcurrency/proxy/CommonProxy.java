package com.themastergeneral.ctdcurrency.proxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.themastergeneral.ctdcurrency.events.Events;
import com.themastergeneral.ctdcurrency.events.achievements.Achievements;
import com.themastergeneral.ctdcurrency.handler.Crafting;
import com.themastergeneral.ctdcurrency.items.Items;
import com.themastergeneral.ctdcurrency.items.ModItems;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.init();
    	Achievements.init();
    	Achievements.secondinit();
    	MinecraftForge.EVENT_BUS.register(new Events());
    	Crafting.addRecipes();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }

	public void registerItemRenderer(Items items, int i, String name) 
	{
		
	}
}