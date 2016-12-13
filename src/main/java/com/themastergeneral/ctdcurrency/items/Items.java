package com.themastergeneral.ctdcurrency.items;

import com.themastergeneral.ctdcurrency.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items extends Item //implements ItemModelProvider
{
	protected String name;
	public Items(String name) 
	{
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.MISC);
	}
}
