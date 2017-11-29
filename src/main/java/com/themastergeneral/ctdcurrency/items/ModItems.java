package com.themastergeneral.ctdcurrency.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.ctdcurrency.CTDCurrency;

public final class ModItems extends RegisterItem {
	public static Items hundredth;
	public static Items twenthith;
	public static Items tenth;
	public static Items quarter;
	public static Items one;
	public static Items five;
	public static Items ten;
	public static Items twenty;
	public static Items fifty;
	public static Items hundred;
	public static Items fivehundred;
	public static Items thousand;
	public static Items fivethousand;
	public static Items tenthousand;
	public static Items fiftythousand;
	public static Items hundredthousand;
	public static Items fivehundredthousand;
	public static Items million;

	public static Tool buy;
	public static Tool down;

	public static final void init() {
		hundredth = register(new Items("hundredth", CTDCurrency.MODID));
		twenthith = register(new Items("twenthith", CTDCurrency.MODID));
		tenth = register(new Items("tenth", CTDCurrency.MODID));
		quarter = register(new Items("quarter", CTDCurrency.MODID));
		one = register(new Items("one", CTDCurrency.MODID));
		five = register(new Items("five", CTDCurrency.MODID));
		ten = register(new Items("ten", CTDCurrency.MODID));
		twenty = register(new Items("twenty", CTDCurrency.MODID));
		fifty = register(new Items("fifty", CTDCurrency.MODID));
		hundred = register(new Items("hundred", CTDCurrency.MODID));
		fivehundred = register(new Items("fivehundred", CTDCurrency.MODID));
		thousand = register(new Items("thousand", CTDCurrency.MODID));
		fivethousand = register(new Items("fivethousand", CTDCurrency.MODID));
		tenthousand = register(new Items("tenthousand", CTDCurrency.MODID));
		fiftythousand = register(new Items("fiftythousand", CTDCurrency.MODID));
		hundredthousand = register(new Items("hundredthousand",
				CTDCurrency.MODID));
		fivehundredthousand = register(new Items("fivehundredthousand",
				CTDCurrency.MODID));
		million = register(new Items("million", CTDCurrency.MODID));

		buy = register(new Tool("buy", CTDCurrency.MODID));
		down = register(new Tool("down", CTDCurrency.MODID));
	}
}