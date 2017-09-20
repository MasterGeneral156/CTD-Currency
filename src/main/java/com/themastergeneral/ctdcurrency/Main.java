package com.themastergeneral.ctdcurrency;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.ctdcurrency.proxy.CommonProxy;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, dependencies = Main.DEPENDENCIES, updateJSON = Main.updateJSON, acceptedMinecraftVersions = Main.MCVersion)
public class Main {

	public static final String MODID = "ctdcurrency";
	public static final String MODNAME = "CTD Currency";
	public static final String VERSION = "6.4.2";
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.1.6,]";
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/CTD-Currency.json";
	public static final String MCVersion = "1.12.2";

	@Instance
	public static Main instance = new Main();

	@SidedProxy(clientSide = "com.themastergeneral.ctdcurrency.proxy.ClientProxy", serverSide = "com.themastergeneral.ctdcurrency.proxy.ServerProxy")
	public static CommonProxy proxy;
	public static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		this.proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		this.proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		this.proxy.postInit(e);
	}
}
