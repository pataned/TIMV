package me.pataned.TIMV;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.pataned.TIMV.Listeners.Join;
import me.pataned.TIMV.Listeners.Quit;
import me.pataned.TIMV.enumerators.GamePhase;

public class Main extends JavaPlugin{

	

	public static Main plugin;
	public void onEnable(){
		getLogger().warning("For plugin function you need plugins: ActionBarAPI, PermissionsEx, EasyCoins (by Petrosaurus), TitleAPI (1.7.4)");
		plugin = this;
		registerEvents(getServer().getPluginManager());
		GamePhase.setPhase(GamePhase.CEKANI);
	}
	
	public void onDisable(){
		Join.o.stop();
	}
	private void registerEvents(PluginManager pm){
		pm.registerEvents(new Join(), this);
		pm.registerEvents(new Quit(), this);
	}



}
