package com.themastergeneral.ctdcurrency.handler;

import com.themastergeneral.ctdcurrency.Main;
import com.themastergeneral.ctdcurrency.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
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
		//This doesn't work I think.
		CraftingManager.func_193373_a(new ResourceLocation(Main.MODID+":recipes/twenthith.json"));
	}
	public static void ConvertDown()
	{
		/*GameRegistry.addShapedRecipe(new ItemStack(ModItems.fivehundredthousand, 2), 	
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
				new ItemStack(ModItems.down));*/
	}
	public static void CraftingRecipes()
	{
		/*GameRegistry.addShapelessRecipe(new ItemStack(ModItems.buy, 1), 	
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
				new ItemStack(ModItems.twenthith));*/
	}
	public static void BuyThings()
	{
		/*GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE, 64), 	
				new ItemStack(ModItems.ten),
				new ItemStack(ModItems.five),
				new ItemStack(ModItems.buy));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DIRT, 64), 	
				new ItemStack(ModItems.one),
				new ItemStack(ModItems.one),
				new ItemStack(ModItems.one),
				new ItemStack(ModItems.five),
				new ItemStack(ModItems.buy));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND, 1), 	
				new ItemStack(ModItems.fivethousand),
				new ItemStack(ModItems.thousand),
				new ItemStack(ModItems.thousand),
				new ItemStack(ModItems.thousand),
				new ItemStack(ModItems.buy));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.GOLD_INGOT, 1), 	
				new ItemStack(ModItems.thousand),
				new ItemStack(ModItems.hundred),
				new ItemStack(ModItems.hundred),
				new ItemStack(ModItems.fifty),
				new ItemStack(ModItems.twenty),
				new ItemStack(ModItems.buy));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.IRON_INGOT, 1), 	
				new ItemStack(ModItems.hundred),
				new ItemStack(ModItems.hundred),
				new ItemStack(ModItems.fifty),
				new ItemStack(ModItems.twenty),
				new ItemStack(ModItems.twenty),
				new ItemStack(ModItems.five),
				new ItemStack(ModItems.buy));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ENDER_PEARL, 1), 	
				new ItemStack(ModItems.fivehundred),
				new ItemStack(ModItems.buy));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.EMERALD, 1), 	
				new ItemStack(ModItems.fivethousand),
				new ItemStack(ModItems.tenthousand),
				new ItemStack(ModItems.buy));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.LOG, 32), 	
				new ItemStack(ModItems.ten),
				new ItemStack(ModItems.fifty),
				new ItemStack(ModItems.five),
				new ItemStack(ModItems.one),
				new ItemStack(ModItems.buy));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_STAR, 1), 	
				new ItemStack(ModItems.fivehundredthousand),
				new ItemStack(ModItems.buy));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.DRAGON_EGG, 1), 	
				new ItemStack(ModItems.fivehundredthousand),
				new ItemStack(ModItems.hundredthousand),
				new ItemStack(ModItems.buy));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.COAL, 32), 	
				new ItemStack(ModItems.twenty),
				new ItemStack(ModItems.ten),
				new ItemStack(ModItems.five),
				new ItemStack(ModItems.buy));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.REDSTONE, 8), 	
				new ItemStack(ModItems.fifty),
				new ItemStack(ModItems.twenty),
				new ItemStack(ModItems.ten),
				new ItemStack(ModItems.buy));
		
		GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 8, 4), 	
				new ItemStack(ModItems.fifty),
				new ItemStack(ModItems.twenty),
				new ItemStack(ModItems.ten),
				new ItemStack(ModItems.buy));*/
	}
}
