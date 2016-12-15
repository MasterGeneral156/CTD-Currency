package com.themastergeneral.ctdcurrency.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.themastergeneral.ctdcurrency.Main;
import com.themastergeneral.ctdcurrency.items.ModItems;

public final class ItemRenderRegister 
{
	public interface ItemModelProvider 
	{
		void registerItemModel(Item item);
	}
}
