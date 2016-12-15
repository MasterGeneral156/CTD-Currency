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
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.twenthith, 1),
				new ItemStack(ModItems.hundredth), 
				new ItemStack(ModItems.hundredth), 
				new ItemStack(ModItems.hundredth), 
				new ItemStack(ModItems.hundredth), 
				new ItemStack(ModItems.hundredth));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tenth, 1), 	
				new ItemStack(ModItems.twenthith), 
				new ItemStack(ModItems.twenthith));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.quarter, 1), 	
				new ItemStack(ModItems.twenthith),
				new ItemStack(ModItems.twenthith),
				new ItemStack(ModItems.twenthith),
				new ItemStack(ModItems.twenthith),
				new ItemStack(ModItems.twenthith));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.quarter, 1), 	
				new ItemStack(ModItems.tenth),
				new ItemStack(ModItems.tenth),
				new ItemStack(ModItems.twenthith));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.one, 1), 	
				new ItemStack(ModItems.quarter),
				new ItemStack(ModItems.quarter),
				new ItemStack(ModItems.quarter),
				new ItemStack(ModItems.quarter));
	}
}
