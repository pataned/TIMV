
package me.pataned.TIMV;

import org.bukkit.plugin.java.JavaPlugin;

import me.pataned.TIMV.Threads.CountDown.ZacatecniOdpocitavani;

public class Main extends JavaPlugin{

	private ZacatecniOdpocitavani o1 = new ZacatecniOdpocitavani();

	public static Main plugin;
	public void onEnable(){
		plugin = this;
		o1.start();
	}
	
	public void onDisable(){
		o1.stop();
	}



}
