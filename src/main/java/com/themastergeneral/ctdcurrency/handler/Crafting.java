package com.themastergeneral.ctdcurrency.handler;

import com.themastergeneral.ctdcurrency.items.ModItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafting 
{
	public static void addRecipes() 
	{
		ConvertUp();
		ConvertDown();
		CraftingRecipes();
		BuyThings();
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
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.five, 1), 	
				new ItemStack(ModItems.one),
				new ItemStack(ModItems.one),
				new ItemStack(ModItems.one),
				new ItemStack(ModItems.one),
				new ItemStack(ModItems.one));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ten, 1), 	
				new ItemStack(ModItems.five),
				new ItemStack(ModItems.five));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.twenty, 1), 	
				new ItemStack(ModItems.five),
				new ItemStack(ModItems.five),
				new ItemStack(ModItems.five),
				new ItemStack(ModItems.five));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.twenty, 1), 	
				new ItemStack(ModItems.ten),
				new ItemStack(ModItems.ten));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fifty, 1), 	
				new ItemStack(ModItems.ten),
				new ItemStack(ModItems.ten),
				new ItemStack(ModItems.ten),
				new ItemStack(ModItems.ten),
				new ItemStack(ModItems.ten));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.hundred, 1), 	
				new ItemStack(ModItems.fifty),
				new ItemStack(ModItems.fifty));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fivehundred, 1), 	
				new ItemStack(ModItems.hundred),
				new ItemStack(ModItems.hundred),
				new ItemStack(ModItems.hundred),
				new ItemStack(ModItems.hundred),
				new ItemStack(ModItems.hundred));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.thousand, 1), 	
				new ItemStack(ModItems.fivehundred),
				new ItemStack(ModItems.fivehundred));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fivethousand, 1), 	
				new ItemStack(ModItems.thousand),
				new ItemStack(ModItems.thousand),
				new ItemStack(ModItems.thousand),
				new ItemStack(ModItems.thousand),
				new ItemStack(ModItems.thousand));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tenthousand, 1), 	
				new ItemStack(ModItems.fivethousand),
				new ItemStack(ModItems.fivethousand));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fiftythousand, 1), 	
				new ItemStack(ModItems.tenthousand),
				new ItemStack(ModItems.tenthousand),
				new ItemStack(ModItems.tenthousand),
				new ItemStack(ModItems.tenthousand),
				new ItemStack(ModItems.tenthousand));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.hundredthousand, 1), 	
				new ItemStack(ModItems.fiftythousand),
				new ItemStack(ModItems.fiftythousand));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fivehundredthousand, 1), 	
				new ItemStack(ModItems.hundredthousand),
				new ItemStack(ModItems.hundredthousand),
				new ItemStack(ModItems.hundredthousand),
				new ItemStack(ModItems.hundredthousand),
				new ItemStack(ModItems.hundredthousand));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.million, 1), 	
				new ItemStack(ModItems.fivehundredthousand),
				new ItemStack(ModItems.fivehundredthousand));
	}
	public static void ConvertDown()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fivehundredthousand, 2), 	
				new ItemStack(ModItems.million),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.hundredthousand, 5), 	
				new ItemStack(ModItems.fivehundredthousand),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fiftythousand, 2), 	
				new ItemStack(ModItems.hundredthousand),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tenthousand, 5), 	
				new ItemStack(ModItems.fiftythousand),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fivethousand, 2), 	
				new ItemStack(ModItems.tenthousand),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.thousand, 5), 	
				new ItemStack(ModItems.fivethousand),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fivehundred, 2), 	
				new ItemStack(ModItems.thousand),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.hundred, 5), 	
				new ItemStack(ModItems.fivehundred),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.fifty, 2), 	
				new ItemStack(ModItems.hundred),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ten, 5), 	
				new ItemStack(ModItems.fifty),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.five, 2), 	
				new ItemStack(ModItems.ten),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.one, 5), 	
				new ItemStack(ModItems.five),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.quarter, 4), 	
				new ItemStack(ModItems.one),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.twenthith, 5), 	
				new ItemStack(ModItems.quarter),
				new ItemStack(ModItems.down));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.hundredth, 5), 	
				new ItemStack(ModItems.twenthith),
				new ItemStack(ModItems.down));
	}
	public static void CraftingRecipes()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.buy, 1), 	
				new ItemStack(ModItems.twenthith),
				new ItemStack(ModItems.twenthith),
				new ItemStack(ModItems.twenthith),
				new ItemStack(Items.EMERALD),
				new ItemStack(ModItems.twenthith));
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.down, 1), 	
				new ItemStack(ModItems.twenthith),
				new ItemStack(ModItems.twenthith),
				new ItemStack(ModItems.twenthith),
				new ItemStack(Items.IRON_INGOT),
				new ItemStack(ModItems.twenthith));
	}
	public static void BuyThings()
	{
		
	}
}
