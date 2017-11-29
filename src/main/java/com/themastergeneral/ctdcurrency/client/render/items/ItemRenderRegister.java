package com.themastergeneral.ctdcurrency.client.render.items;

import net.minecraft.item.Item;

public final class ItemRenderRegister {
	public interface ItemModelProvider {
		void registerItemModel(Item item);
	}
}
