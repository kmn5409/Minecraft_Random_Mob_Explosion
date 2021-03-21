package com.keanu.CreeperPlugin;

//import org.bukkit.plugin.java.JavaPlugin;
import java.util.Random;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
//import org.bukkit.entity.Cow;
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
		if(getRandomBoolean()){
			if(event.getEntity() instanceof LivingEntity){
					//event.getEntity().getWorld().createExplosion(event.getEntity().getLocation(), 1, true, true, event.getEntity());
				event.getEntity().getWorld().createExplosion(event.getEntity().getLocation(), getRandomNumber(1,5), true, true, event.getEntity());
			}
		}
	}
}
