package com.keanu.CreeperPlugin;

import java.util.Random;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.entity.LivingEntity;

public class DeathListener implements Listener{
	
	public boolean getRandomBoolean() {
	    Random random = new Random();
	    return random.nextBoolean();
	}
	
	public int getRandomNumber(int min, int max) {
	    return (int) ((Math.random() * (max - min)) + min);
	}

	@EventHandler
	public void onEntityDeath(EntityDeathEvent event){
		int random_number;
		if(getRandomBoolean()){
			if(event.getEntity() instanceof LivingEntity){
					//event.getEntity().getWorld().createExplosion(event.getEntity().getLocation(), 1, true, true, event.getEntity());
				random_number = getRandomNumber(1,10);
				event.getEntity().getWorld().createExplosion(event.getEntity().getLocation(), random_number, true, true, event.getEntity());
			}
		}
	}
}
