package com.themastergeneral.ctdcurrency;

import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLFingerprintViolationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

import com.themastergeneral.ctdcurrency.proxy.CommonProxy;

@Mod(modid = CTDCurrency.MODID, name = CTDCurrency.MODNAME, certificateFingerprint = CTDCurrency.FingerPrint, version = CTDCurrency.VERSION, dependencies = CTDCurrency.DEPENDENCIES, updateJSON = CTDCurrency.updateJSON, acceptedMinecraftVersions = CTDCurrency.MCVersion)
public class CTDCurrency {

	public static final String MODID = "ctdcurrency";
	public static final String MODNAME = "CTD Currency";
	public static final String VERSION = "6.5.2";
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.2,]";
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/CTD-Currency.json";
	public static final String MCVersion = "1.12.2";
	public static final String FingerPrint = "5101015479fe39f20b47f365472250d312a50a57";

	@Instance
	public static CTDCurrency instance = new CTDCurrency();

	@SidedProxy(clientSide = "com.themastergeneral.ctdcurrency.proxy.ClientProxy", serverSide = "com.themastergeneral.ctdcurrency.proxy.ServerProxy")
	public static CommonProxy proxy;
	public static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		logger.info("Cha-ching! CTD Currency is loading!");
		proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
		logger.info("You win the lottery! Just kidding, but hey, CTD Currency has loaded successfully.");
	}
	
	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
		FMLLog.warning("Invalid fingerprint detected for CTD Currency! TheMasterGeneral will not support this version!");
	}
}
