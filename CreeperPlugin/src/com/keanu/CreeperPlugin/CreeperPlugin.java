package com.keanu.CreeperPlugin;

import org.bukkit.plugin.java.JavaPlugin;



public class CreeperPlugin extends JavaPlugin {
	
	// Fired when plugin is first enabled
    //@Override
	
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new DeathListener(), this);    	
    }
    
    // Fired when plugin is disabled
    //@Override
    public void onDisable() {

    }
    

}
