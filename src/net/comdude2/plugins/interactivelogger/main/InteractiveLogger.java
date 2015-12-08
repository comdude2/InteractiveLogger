package net.comdude2.plugins.interactivelogger.main;

import net.comdude2.plugins.comlibrary.main.ComLibrary;
import net.comdude2.plugins.comlibrary.util.Messenger;
import net.md_5.bungee.api.ChatColor;

import org.bukkit.plugin.java.JavaPlugin;

public class InteractiveLogger extends JavaPlugin{
	
	public ComLibrary lib = null;
	public Messenger msg = null;
	
	public void onEnable(){
		
		//Dependencies
		
		this.getLogger().info("Checking if ComLibrary is loaded...");
		if (this.getServer().getPluginManager().getPlugin("ComLibrary") != null){
			ComLibrary lib = ComLibrary.inst;
			if (lib != null){
				this.lib = lib;
				this.getLogger().info("ComLibrary found and loaded.");
			}else{
				this.getLogger().info("Failed to get ComLibrary instance, disabling myself.");
				this.getServer().getPluginManager().disablePlugin(this);
				return;
			}
		}else{
			this.getLogger().severe("ComLibrary not found, disabling myself.");
			this.getServer().getPluginManager().disablePlugin(this);
			return;
		}
		
		//Initialise Messenger class
		msg = new Messenger(ChatColor.YELLOW + "[" + ChatColor.WHITE + this.getDescription().getName() + ChatColor.YELLOW + "] ","");
		
		
	}
	
	public void onDisable(){
		
	}
	
}
