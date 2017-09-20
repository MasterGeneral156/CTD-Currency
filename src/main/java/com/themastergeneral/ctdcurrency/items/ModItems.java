package com.themastergeneral.ctdcurrency.items;

import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdcore.item.RegisterItem;
import com.themastergeneral.ctdcurrency.Main;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
		hundredth = register(new Items("hundredth", Main.MODID));
		twenthith = register(new Items("twenthith", Main.MODID));
		tenth = register(new Items("tenth", Main.MODID));
		quarter = register(new Items("quarter", Main.MODID));
		one = register(new Items("one", Main.MODID));
		five = register(new Items("five", Main.MODID));
		ten = register(new Items("ten", Main.MODID));
		twenty = register(new Items("twenty", Main.MODID));
		fifty = register(new Items("fifty", Main.MODID));
		hundred = register(new Items("hundred", Main.MODID));
		fivehundred = register(new Items("fivehundred", Main.MODID));
		thousand = register(new Items("thousand", Main.MODID));
		fivethousand = register(new Items("fivethousand", Main.MODID));
		tenthousand = register(new Items("tenthousand", Main.MODID));
		fiftythousand = register(new Items("fiftythousand", Main.MODID));
		hundredthousand = register(new Items("hundredthousand", Main.MODID));
		fivehundredthousand = register(new Items("fivehundredthousand",
				Main.MODID));
		million = register(new Items("million", Main.MODID));

		buy = register(new Tool("buy", Main.MODID));
		down = register(new Tool("down", Main.MODID));
	}
}