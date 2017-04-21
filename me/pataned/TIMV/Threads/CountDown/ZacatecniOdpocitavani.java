package me.pataned.TIMV.Threads.CountDown;

import org.bukkit.Bukkit;
import me.pataned.TIMV.Main;
import me.pataned.TIMV.Threads.Odpocitavani;

public class ZacatecniOdpocitavani extends Odpocitavani{
	
	int id;
	
	int i;
	                        
	public void start() {
		id = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable(){
			public void run(){
				i++;
			
			}
		}, 0L, 20L);
		
	}

	public void stop() {
		Bukkit.getScheduler().cancelTask(id);
		
	}
	
	

}
	
	

}
