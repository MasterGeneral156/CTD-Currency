package com.themastergeneral.ctdcurrency.items;

import com.themastergeneral.ctdcurrency.Main;
import com.themastergeneral.ctdcurrency.client.render.items.ItemRenderRegister.ItemModelProvider;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Items extends Item implements ItemModelProvider
{
	protected String name;
	protected Items(String name)
	{
		this.name = name;
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(CreativeTabs.MISC);
	}
	public void registerItemModel(Item item) 
	{
		Main.proxy.registerItemRenderer(this, 0, name);
	}
}
