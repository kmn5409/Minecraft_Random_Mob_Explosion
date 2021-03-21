package com.keanu.CreeperPlugin;

//import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.entity.Cow;

public class DeathListener implements Listener{

	@EventHandler
	public void onEntityDeath(EntityDeathEvent event){
		if(event.getEntity() instanceof Cow){
				event.getEntity().getWorld().createExplosion(event.getEntity().getLocation(), 1, true, true, event.getEntity());
		}
	}
}
