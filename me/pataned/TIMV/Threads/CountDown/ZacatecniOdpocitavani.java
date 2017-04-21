package me.pataned.TIMV.Threads.CountDown;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import me.pataned.TIMV.Main;
import me.pataned.TIMV.InGameOutput.Chat;
import me.pataned.TIMV.Threads.Odpocitavani;

public class ZacatecniOdpocitavani extends Odpocitavani{
	
	int id;
	
	int i;
	// TODO Po prenose do pocitaca - riadok: Chat.broadcastExceptConsole(Chat.newTempPrefix(ChatColor.GRAY, ChatColor.DARK_RED, ChatColor.YELLOW, "PrefixText"), "Testing the prefix - " + ChatColor.GREEN + i);
	//                                       Vymazat
	public void start() {
		id = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable(){
			public void run(){
				i++;
				Chat.broadcastExceptConsole(Chat.newTempPrefix(ChatColor.GRAY, ChatColor.DARK_RED, ChatColor.YELLOW, "PrefixText"), "Testing the prefix - " + ChatColor.GREEN + i);
			}
		}, 0L, 20L);
		
	}

	public void stop() {
		Bukkit.getScheduler().cancelTask(id);
		
	}
	
	

}
