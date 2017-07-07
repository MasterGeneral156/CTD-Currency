package com.themastergeneral.ctdcurrency.events;

import java.util.Random;

import com.themastergeneral.ctdcurrency.config.Config;
import com.themastergeneral.ctdcurrency.items.ModItems;

import net.minecraft.entity.EntityLiving;
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
		if (Config.disableBossDrops == false)
		{
		      if(event.getEntity() instanceof EntityWither) 
		      {
		         ItemStack itemStackToDrop = new ItemStack(ModItems.twenty, 1);
		         event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
		      }
		      if (event.getEntity() instanceof EntityDragon)
		      {
		    	  ItemStack itemStackToDrop = new ItemStack(ModItems.twenty, 1);
		    	  event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
		      }
		}
		if (Config.disableMobDrops)
		{
		      if (event.getEntity() instanceof EntityLiving)
		      {
		    	  Random randomGenerator = new Random();
		    	  int randomInt = randomGenerator.nextInt(Config.dropChance);
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
	}
}
