package com.themastergeneral.ctdcurrency.items;

import cpw.mods.fml.common.registry.GameRegistry;

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
	
    public static final void init() 
    {
    	hundredth = new Items("hundredth");
    	twenthith = new Items("twenthith");
    	tenth = new Items("tenth");
    	quarter = new Items("quarter");
    	one = new Items("one");
    	five = new Items("five");
    	ten = new Items("ten");
    	twenty = new Items("twenty");
    	fifty = new Items("fifty");
    	hundred = new Items("hundred");
    	thousand = new Items("thousand");
    	tenthousand = new Items("tenthousand");
    	hundredthousand = new Items("hundredthousand");
    	million = new Items("million");
    	
    	GameRegistry.registerItem(hundredth, "hundredth");
    	GameRegistry.registerItem(twenthith, "twenthith");
    	GameRegistry.registerItem(tenth, "tenth");
    	GameRegistry.registerItem(quarter, "quarter");
    	GameRegistry.registerItem(one, "one");
    	GameRegistry.registerItem(five, "five");
    	GameRegistry.registerItem(ten, "ten");
    	GameRegistry.registerItem(twenty, "twenty");
    	GameRegistry.registerItem(fifty, "fifty");
    	GameRegistry.registerItem(hundred, "hundred");
    	GameRegistry.registerItem(thousand, "thousand");
    	GameRegistry.registerItem(tenthousand, "tenthousand");
    	GameRegistry.registerItem(hundredthousand, "hundredthousand");
    	GameRegistry.registerItem(million, "million");
    }

}