package me.pataned.TIMV;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.pataned.TIMV.Listeners.Join;
import me.pataned.TIMV.Threads.CountDown.ZacatecniOdpocitavani;
import me.pataned.TIMV.enumerators.GamePhase;

public class Main extends JavaPlugin{

	private ZacatecniOdpocitavani o1 = new ZacatecniOdpocitavani();

	public static Main plugin;
	public void onEnable(){
		getLogger().warning("For plugin function you need plugins: ActionBarAPI, PermissionsEx, EasyCoins (by Petrosaurus), TitleAPI (1.7.4)");
		plugin = this;
		registerEvents(getServer().getPluginManager());
		GamePhase.setPhase(GamePhase.CEKANI);
	}
	
	public void onDisable(){
		o1.stop();
	}
	private void registerEvents(PluginManager pm){
		pm.registerEvents(new Join(), this);
	}



}
