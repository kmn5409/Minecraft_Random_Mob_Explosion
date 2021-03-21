package com.keanu.CreeperPlugin;

//import org.bukkit.plugin.java.JavaPlugin;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
//import org.bukkit.entity.Cow;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

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
				Player plr = Bukkit.getPlayer("KeanuNichols");
				plr.sendMessage("Power level" + random_number);
				event.getEntity().getWorld().createExplosion(event.getEntity().getLocation(), random_number, true, true, event.getEntity());
			}
		}
	}
}
