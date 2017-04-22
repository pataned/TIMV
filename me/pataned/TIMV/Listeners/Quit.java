package me.pataned.TIMV.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import me.pataned.TIMV.InGameOutput.Chat;

public class Quit implements Listener{
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		Player p = e.getPlayer();
		e.setQuitMessage(Chat.newTempPrefix(ChatColor.DARK_GREEN, ChatColor.DARK_RED, ChatColor.GRAY, "TIMV-Leave") + "Hrac " + ChatColor.RED + p.getName() + ChatColor.GRAY + " se odpojil.");
		if (Bukkit.getOnlinePlayers().size() < 2){
			Chat.broadcastWithConsole(Chat.newTempPrefix(ChatColor.DARK_GREEN, ChatColor.DARK_RED, ChatColor.GRAY, "Odpocitavani"), "Na serveru je nedostatek hracu pro start hry!");
			Join.o.stop();
			
			
		}
		
	}
	

}
