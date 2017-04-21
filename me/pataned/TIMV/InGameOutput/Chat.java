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

	
	public static void broadcastWithConsole(String prefix, String text){
		Bukkit.broadcastMessage(prefix + text);
		
	}
	
	public static void broadcastExceptConsole(String prefix, String text){
		for (Player p : Bukkit.getOnlinePlayers()){
			p.sendMessage(prefix + text);
		}
	}
	
	public static void send(Player p, String text){
		p.sendMessage(text);
	
	}
//	[]
	public static String newTempPrefix(ChatColor bracketClr, ChatColor bodyClr, ChatColor txtClr, String body){
		return bracketClr + "[" + bodyClr + body + bracketClr + "] " + txtClr;
	}
	public static String newTempPrefix(ChatColor bracketClr, ChatColor bodyClr, ChatColor txtClr, String body, String leftBracket, String rightBracket){
		return bracketClr + leftBracket + bodyClr + body + bracketClr + rightBracket + txtClr + " ";
	}
	
}
