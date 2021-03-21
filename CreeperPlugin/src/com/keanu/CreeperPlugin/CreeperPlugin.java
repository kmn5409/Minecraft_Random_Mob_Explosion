package com.keanu.CreeperPlugin;

//import org.bukkit.Bukkit;
//import java.util.Collection;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;

//import org.bukkit.entity.Villager;
import org.bukkit.entity.Cow;

public class CreeperPlugin extends JavaPlugin {
	
	// Fired when plugin is first enabled
    //@Override
	
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new DeathListener(), this);
    	Player plr = Bukkit.getPlayer("KeanuNichols");
    	if(plr != null)
    		plr.setLevel(10);
    	 for (World world : Bukkit.getWorlds()) {
    		 for (LivingEntity entity : world.getEntitiesByClass(LivingEntity.class)){
    		 	if(entity instanceof Cow){
    		 		entity.setGlowing(true);
    		 	}
    		 }
    	 }
    	
    }
    
    // Fired when plugin is disabled
    //@Override
    public void onDisable() {

    }
    
    
    
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	if (command.getName().equalsIgnoreCase("mycommand")) {
    		sender.sendMessage("You ran /mycommand!");
    		return true;
    	}
    	
    	return false;
    }
    

}
