package com.themastergeneral.ctdcurrency.integration.jei;

import javax.annotation.Nonnull;

import com.themastergeneral.ctdcurrency.config.Config;
import com.themastergeneral.ctdcurrency.items.ModItems;

import net.minecraft.item.ItemStack;
import mezz.jei.api.BlankModPlugin;
import mezz.jei.api.IModRegistry;

@mezz.jei.api.JEIPlugin
public class CTDCurrencyJEIIntegration extends BlankModPlugin 
{
	@Override
	public void register(@Nonnull IModRegistry registry) 
	{
		if (Config.disableJei == false)
		{
			registry.addDescription(new ItemStack(ModItems.buy), "This tool will allow you to buy items using currency you gain.");
			registry.addDescription(new ItemStack(ModItems.down), "This tool will allow you to break your currency into smaller bills.");
			registry.addDescription(new ItemStack(ModItems.hundredth), "Has a 1 in "+Config.dropChance+" chance to drop on a mob's death.");
			registry.addDescription(new ItemStack(ModItems.tenth), "Has a 1 in "+Config.dropChance+" chance to drop on a mob's death.");
			registry.addDescription(new ItemStack(ModItems.twenthith), "Has a 1 in "+Config.dropChance+" chance to drop on a mob's death.");
			registry.addDescription(new ItemStack(ModItems.quarter), "Has a 1 in "+Config.dropChance+" chance to drop on a mob's death.");
			registry.addDescription(new ItemStack(ModItems.one), "Has a 1 in "+Config.dropChance+" chance to drop on a mob's death.");
			registry.addDescription(new ItemStack(ModItems.five), "Has a 1 in "+Config.dropChance+" chance to drop on a mob's death.");
			registry.addDescription(new ItemStack(ModItems.ten), "Has a 1 in "+Config.dropChance+" chance to drop on a mob's death.");
			registry.addDescription(new ItemStack(ModItems.twenty), "Dropped when you kill an Ender Dragon or Wither Boss.");
		}
	}
}
