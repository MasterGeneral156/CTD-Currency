package com.themastergeneral.ctdcurrency.events;

import java.util.Random;

import com.themastergeneral.ctdcurrency.Main;
import com.themastergeneral.ctdcurrency.events.achievements.Achievements;
import com.themastergeneral.ctdcurrency.items.ModItems;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemPickupEvent;

public class Events 
{
	@SubscribeEvent
	public void onLivingDrop(LivingDropsEvent event) 
	{
	      if(event.entity instanceof EntityWither) 
	      {
	         ItemStack itemStackToDrop = new ItemStack(ModItems.ten, 1);
	         event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, itemStackToDrop));
	      }
	      else if (event.entity instanceof EntityDragon)
	      {
	    	  ItemStack itemStackToDrop = new ItemStack(ModItems.ten, 1);
	    	  event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, itemStackToDrop));
	      }
	      else
	      {
	    	  ItemStack itemStackToDrop = new ItemStack(ModItems.hundredth, 1);
	    	  Random randomGenerator = new Random();
	    	  int randomInt = randomGenerator.nextInt(100);
	    	  if (randomInt == 1)
	    	  {
	    	  	event.drops.add(new EntityItem(event.entity.worldObj, event.entity.posX, event.entity.posY, event.entity.posZ, itemStackToDrop));  
	    	  }
	      }
	}
	@SubscribeEvent
	 public void pickup(ItemPickupEvent event)
	 {
		if(event.pickedUp.getEntityItem().getItem() == ModItems.hundredth)
		{
			event.player.addStat(Achievements.Money1, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == ModItems.twenthith)
		{
			event.player.addStat(Achievements.Money2, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == ModItems.tenth)
		{
			event.player.addStat(Achievements.Money3, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == ModItems.quarter)
		{
			event.player.addStat(Achievements.Money4, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == ModItems.one)
		{
			event.player.addStat(Achievements.Money5, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == ModItems.five)
		{
			event.player.addStat(Achievements.Money6, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == ModItems.ten)
		{
			event.player.addStat(Achievements.Money7, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == ModItems.twenty)
		{
			event.player.addStat(Achievements.Money8, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == ModItems.fifty)
		{
			event.player.addStat(Achievements.Money9, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == ModItems.hundred)
		{
			event.player.addStat(Achievements.Money10, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == ModItems.thousand)
		{
			event.player.addStat(Achievements.Money11, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == ModItems.tenthousand)
		{
			event.player.addStat(Achievements.Money12, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == ModItems.hundredthousand)
		{
			event.player.addStat(Achievements.Money13, 1);
		}
		if(event.pickedUp.getEntityItem().getItem() == ModItems.million)
		{
			event.player.addStat(Achievements.Money14, 1);
		}
	 }
}
