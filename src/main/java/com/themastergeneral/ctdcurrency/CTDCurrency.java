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

@Mod(modid = CTDCurrency.MODID, name = CTDCurrency.MODNAME, version = CTDCurrency.VERSION, certificateFingerprint = CTDCurrency.Fingerprint, dependencies = CTDCurrency.DEPENDENCIES, updateJSON = CTDCurrency.updateJSON)
public class CTDCurrency {

	public static final String MODID = "ctdcurrency";
	public static final String MODNAME = "CTD Currency";
	public static final String VERSION = "6.5.1";
	public static final String DEPENDENCIES = "required-after:ctdcore@[1.2.3,]";
	public static final String updateJSON = "https://raw.githubusercontent.com/MasterGeneral156/Version/master/CTD-Currency.json";
	public static final String Fingerprint = "441b509a0f58a0ef41aca8daf1be20d96287635e";

	@Instance
	public static CTDCurrency instance = new CTDCurrency();

	@SidedProxy(clientSide = "com.themastergeneral.ctdcurrency.proxy.ClientProxy", serverSide = "com.themastergeneral.ctdcurrency.proxy.ServerProxy")
	public static CommonProxy proxy;
	public static Logger logger;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		logger.info("Starting CTD Currency.");
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

	@EventHandler
	public void onFingerprintViolation(FMLFingerprintViolationEvent e) {
		FMLLog.warning("Invalid fingerprint detected for CTD Currency! TheMasterGeneral will not support this version!");
	}
}
