package com.themastergeneral.ctdcurrency.items;

import com.themastergeneral.ctdcurrency.client.render.items.ItemRenderRegister;
import com.themastergeneral.ctdcurrency.client.render.items.ItemRenderRegister.ItemModelProvider;

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
	
    public static final void init() 
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
		fivehundred = register(new Items("fivehundred"));
		thousand = register(new Items("thousand"));
		fivethousand = register(new Items("fivethousand"));
		tenthousand = register(new Items("tenthousand"));
		fiftythousand = register(new Items("fiftythousand"));
		hundredthousand = register(new Items("hundredthousand"));
		fivehundredthousand = register(new Items("fivehundredthousand"));
		million = register(new Items("million"));
		
		buy = register(new Tool("buy"));
		down = register(new Tool("down"));
    }
    private static <T extends Item> T register(T item) 
	{
		GameRegistry.register(item);
		if(item instanceof ItemModelProvider) 
		{
			((ItemModelProvider)item).registerItemModel(item);
		}
		return item;
	}
}