package me.pataned.TIMV.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.pataned.TIMV.InGameOutput.Chat;
import me.pataned.TIMV.Threads.CountDown.ZacatecniOdpocitavani;

public class Join implements Listener{
	
	public static int PocetHracov;
	//TODO: vlcik128
	
	
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		e.setJoinMessage(Chat.newTempPrefix(ChatColor.DARK_GREEN, ChatColor.DARK_RED, ChatColor.GRAY, "TIMV-Join") + "Hrac " + ChatColor.RED + p.getName() + ChatColor.GRAY + " se pripojil.");
		if (Bukkit.getOnlinePlayers().size() == 2){
			ZacatecniOdpocitavani o = new ZacatecniOdpocitavani();
			Chat.broadcastWithConsole(Chat.newTempPrefix(ChatColor.DARK_GREEN, ChatColor.DARK_RED, ChatColor.GRAY, "Odpocitavani"), "Na serveru je dostatek hracu pro start hry!");
			o.start();
			
			
		}
		
	}
	
	

}
