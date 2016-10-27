package com.themastergeneral.ctdcurrency.client.render.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.themastergeneral.ctdcurrency.Main;
import com.themastergeneral.ctdcurrency.items.ModItems;

public final class ItemRenderRegister {

	public static String modid = Main.MODID;

	public static void registerItemRenderer() {
	    reg(ModItems.hundredth);
	    reg(ModItems.twenthith);
	    reg(ModItems.tenth);
	    reg(ModItems.quarter);
	    reg(ModItems.one);
	    reg(ModItems.five);
	    reg(ModItems.ten);
	    reg(ModItems.twenty);
	    reg(ModItems.fifty);
	    reg(ModItems.hundred);
	    reg(ModItems.thousand);
	    reg(ModItems.tenthousand);
	    reg(ModItems.hundredthousand);
	    reg(ModItems.million);
	}

	public static void reg(Item item) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
