package com.themastergeneral.ctdcurrency;

import net.minecraftforge.common.MinecraftForge;

import com.themastergeneral.ctdcurrency.events.Events;
import com.themastergeneral.ctdcurrency.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main 
{

    public static final String MODID = "ctdcurrency";
    public static final String MODNAME = "CTD Currency";
    public static final String VERSION = "1.1.0";
        
    @Instance
    public static Main instance = new Main();
    
    @SidedProxy(clientSide="com.themastergeneral.ctdcurrency.proxy.ClientProxy", serverSide="com.themastergeneral.ctdcurrency.proxy.ServerProxy")
    public static CommonProxy proxy;
     
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) 
    {
    	System.out.println("CTD Currency loading...");
    	proxy.preInit(e);
    	MinecraftForge.EVENT_BUS.register(new Events());
    }
        
    @EventHandler
    public void init(FMLInitializationEvent e) 
    {
    	proxy.init(e);
    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) 
    {
    	proxy.postInit(e);
    	System.out.println("CTD Currency loaded.");
    }
}
