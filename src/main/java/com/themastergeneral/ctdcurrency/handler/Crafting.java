package com.themastergeneral.ctdcurrency.handler;

import com.themastergeneral.ctdcurrency.items.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafting 
{
	public static void addRecipes() 
	{
		ConvertUp();
	}
	public static void ConvertUp()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.twenthith, 1), new ItemStack(ModItems.hundredth, 5));
	}
}
