package me.pataned.TIMV.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.pataned.TIMV.InGameOutput.Chat;

public class Join implements Listener{
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		e.setJoinMessage(Chat.newTempPrefix(ChatColor.DARK_GREEN, ChatColor.DARK_RED, ChatColor.GRAY, "TIMV-Join") + "Hrac " + ChatColor.RED + p.getName() + ChatColor.GRAY + " se pripojil.");
		
	}
	
	

}
