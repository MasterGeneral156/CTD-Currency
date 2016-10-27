package com.themastergeneral.ctdcurrency.items;

import com.themastergeneral.ctdcurrency.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Items extends Item 
{
	protected Items(String unlocalizedName)
	{
		setUnlocalizedName(unlocalizedName);
		//setTextureName(Main.MODID + ":" + unlocalizedName);
		setCreativeTab(CreativeTabs.tabMisc);
	}
}
