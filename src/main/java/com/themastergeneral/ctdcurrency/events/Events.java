package com.themastergeneral.ctdcurrency.events;

import java.util.Random;

import com.themastergeneral.ctdcurrency.events.achievements.Achievements;
import com.themastergeneral.ctdcurrency.items.ModItems;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemPickupEvent;

public class Events 
{
	@SubscribeEvent
	public void onLivingDrop(LivingDropsEvent event) 
	{
	      if(event.getEntity() instanceof EntityWither) 
	      {
	         ItemStack itemStackToDrop = new ItemStack(ModItems.twenty, 1);
	         event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	      }
	      else if (event.getEntity() instanceof EntityDragon)
	      {
	    	  ItemStack itemStackToDrop = new ItemStack(ModItems.twenty, 1);
	    	  event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	      }
	      else
	      {
	    	  Random randomGenerator = new Random();
	    	  int randomInt = randomGenerator.nextInt(100);
	    	  if (randomInt == 1)
	    	  {
	    		  int itemdrop = randomGenerator.nextInt(1000);
	    		  if (itemdrop <= 500)
	    		  {
	    			  ItemStack itemStackToDrop = new ItemStack(ModItems.hundredth, 1);
	    			  event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    		  }
	    		  else if (itemdrop <= 750 && itemdrop >= 501)
	    		  {
	    			  ItemStack itemStackToDrop = new ItemStack(ModItems.twenthith, 1);
	    			  event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    		  }
	    		  else if (itemdrop <= 875 && itemdrop >= 751)
	    		  {
	    			  ItemStack itemStackToDrop = new ItemStack(ModItems.tenth, 1);
	    			  event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    		  }
	    		  else if (itemdrop <= 937 && itemdrop >= 876)
	    		  {
	    			  ItemStack itemStackToDrop = new ItemStack(ModItems.quarter, 1);
	    			  event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    		  }
	    		  else if (itemdrop <= 968 && itemdrop >= 938)
	    		  {
	    			  ItemStack itemStackToDrop = new ItemStack(ModItems.one, 1);
	    			  event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    		  }
	    		  else if (itemdrop <= 983 && itemdrop >= 969)
	    		  {
	    			  ItemStack itemStackToDrop = new ItemStack(ModItems.five, 1);
	    			  event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    		  }
	    		  else
	    		  {
	    			  ItemStack itemStackToDrop = new ItemStack(ModItems.ten, 1);
	    			  event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	    		  }
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
