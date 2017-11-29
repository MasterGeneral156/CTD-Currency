package com.themastergeneral.ctdcurrency.items;

import com.themastergeneral.ctdcore.client.ItemModelProvider;
import com.themastergeneral.ctdcore.item.CTDItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Items extends CTDItem implements ItemModelProvider {
	protected Items(String name, String modid) {
		super(name, modid);
		this.setCreativeTab(CreativeTabs.MISC);
	}
}
