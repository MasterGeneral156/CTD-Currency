package com.themastergeneral.ctdcurrency.events;

import java.util.Random;

import com.themastergeneral.ctdcurrency.items.ModItems;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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
}
