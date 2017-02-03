package com.themastergeneral.ctdcurrency.items;

import com.themastergeneral.ctdcore.client.ItemModelProvider;

import net.minecraft.item.ItemStack;

public class Tool extends Items implements ItemModelProvider {

	protected Tool(String name, String modid) 
	{
		super(name,modid);
		this.maxStackSize = 1;
		this.setNoRepair();
	}
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
	{
		 return false;
	}
	 @Override
	 public boolean getShareTag()
	 {
		 return true;
	 }
	 public boolean hasContainerItem(ItemStack itemStack)
	 {
		 return true;
	 }
	 @Override
	 public ItemStack getContainerItem(ItemStack itemStack)
	 {
		 ItemStack stack = itemStack.copy();
		 this.maxStackSize = 1;
		 return stack;
	 }
}
