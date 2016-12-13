package com.themastergeneral.ctdcurrency.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems 
{
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
	public static Items thousand;
	public static Items tenthousand;
	public static Items hundredthousand;
	public static Items million;
	
	public static void init() 
	 {
		hundredth = register(new Items("hundredth"));
		twenthith = register(new Items("twenthith"));
		tenth = register(new Items("tenth"));
		quarter = register(new Items("quarter"));
		one = register(new Items("one"));
		five = register(new Items("five"));
		ten = register(new Items("ten"));
		twenty = register(new Items("twenty"));
		fifty = register(new Items("fifty"));
		hundred = register(new Items("hundred"));
		thousand = register(new Items("thousand"));
		tenthousand = register(new Items("tenthousand"));
		hundredthousand = register(new Items("hundredthousand"));
		million = register(new Items("million"));
		  
	 }
	private static <T extends Item> T register(T item) 
	{
		GameRegistry.register(item);
		return item;
	}
}