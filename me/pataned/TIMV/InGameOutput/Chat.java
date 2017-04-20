package me.pataned.TIMV.InGameOutput;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Chat {
	
	
	/*
	 *====== ZÁKONY FARIEB =======
	 * ChatColor.WHITE = Objekty
	 * ChatColor.RED = Hraci
	 * ChatColor.GREEN = Cisla
	 * ===========================
	 * 
	 * 
	 * 
	 * 
	 */

	public static void broadcast(String prefix, String text){
		Bukkit.broadcastMessage(prefix + text);
	}
	
	public static void broadcast(String prefix, String text, Player array){
		array.sendMessage(prefix + text);
	}
	
	public static Player getArrayPlayer(boolean auto){
		if (auto){
			for (Player p : Bukkit.getOnlinePlayers()){
				return p;
			}
		}
		return null;
	}
	
	public static void send(Player p, String prefix, String text){
		p.sendMessage(prefix + text);
	}
	
	public static String newPrefix(boolean brackets, ChatColor bracketclr, boolean hranate, String body, ChatColor bodyclr){
		if (brackets){
			if (hranate){
				return bracketclr + "[" + bodyclr + body + bracketclr + "] ";
			} else {
				return bracketclr + "(" + bodyclr + body + bracketclr + ") ";
			}
		} else {
			return bodyclr + body + bracketclr + " > " + ChatColor.GRAY;
		}
	}
	
}
