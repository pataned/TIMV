package me.pataned.TIMV.Threads.CountDown;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import com.connorlinfoot.actionbarapi.ActionBarAPI;
import com.connorlinfoot.titleapi.TitleAPI;

import me.pataned.TIMV.Main;
import me.pataned.TIMV.InGameOutput.Chat;
import me.pataned.TIMV.Threads.Odpocitavani;

public class ZacatecniOdpocitavani extends Odpocitavani{
	
	int id;
	
	int i;
	      
	private String OdpocitavaniDeftext(int s){
		return "Do startu hry zbyva " + ChatColor.GREEN + s + ChatColor.GRAY + " sekund";
	}
	public void start() {
		id = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable(){
			@SuppressWarnings("deprecation")
			public void run(){
				i = 31;
				i--;
				String PrubehOdpocitavaniprefix = Chat.newTempPrefix(ChatColor.DARK_AQUA, ChatColor.RED, ChatColor.GRAY, "Prubeh odpocitavani", "<", ">");
				for (Player p : Bukkit.getOnlinePlayers()){
					p.setLevel(i);
					if (i == 30){
						Chat.broadcastWithConsole(Chat.newTempPrefix(ChatColor.DARK_AQUA, ChatColor.RED, ChatColor.GRAY, "Prubeh odpocitavani", "<", ">"), "Do startu hry zbyva " + ChatColor.GREEN + i + ChatColor.GRAY + " sekund");
						TitleAPI.sendSubtitle(p, 1, 2, 1, "Hra zacina &a" + i);
					}
					if (i == 20){
						Chat.broadcastExceptConsole(PrubehOdpocitavaniprefix, OdpocitavaniDeftext(i));
					}
					if (i == 15){
						TitleAPI.sendSubtitle(p, 1, 2, 1, "Hra zacina &a" + i);
						Chat.broadcastWithConsole(PrubehOdpocitavaniprefix, OdpocitavaniDeftext(i));
					}
					if (i == 10){
						TitleAPI.sendSubtitle(p, 1, 2, 1, "Hra zacina &a" + i);
						Chat.broadcastWithConsole(PrubehOdpocitavaniprefix, OdpocitavaniDeftext(i));
					}
					if (i == 5){
						TitleAPI.sendSubtitle(p, 1, 2, 1, "Hra zacina &a" + i);
						Chat.broadcastWithConsole(PrubehOdpocitavaniprefix, OdpocitavaniDeftext(i));
					}
					if (i == 4){
						TitleAPI.sendSubtitle(p, 1, 2, 1, "Hra zacina &a" + i);
						Chat.broadcastExceptConsole(PrubehOdpocitavaniprefix, OdpocitavaniDeftext(i));
					}
					if (i == 3){
						TitleAPI.sendSubtitle(p, 1, 2, 1, "Hra zacina &a" + i);
						Chat.broadcastExceptConsole(PrubehOdpocitavaniprefix, OdpocitavaniDeftext(i));
					}
					if (i == 2){
						TitleAPI.sendSubtitle(p, 1, 2, 1, "Hra zacina &a" + i);
						Chat.broadcastExceptConsole(PrubehOdpocitavaniprefix, OdpocitavaniDeftext(i));
					}
					if (i == 1){
						TitleAPI.sendSubtitle(p, 1, 2, 1, "Hra zacina &a" + i);
						Chat.broadcastWithConsole(PrubehOdpocitavaniprefix, OdpocitavaniDeftext(i));
					}
					if (i == 0){
						/*TODO: start hry
						 * 
						 */
						TitleAPI.sendFullTitle(p, 1, 3, 1, "&6Hra zacina!", "&eTIMV &e&o(plugin by pataned & vlcik128)");
						Chat.broadcastWithConsole(PrubehOdpocitavaniprefix, ChatColor.AQUA + "Hra zacina!");
						ActionBarAPI.sendActionBarToAllPlayers(ChatColor.DARK_GRAY + "Spousteji se dulezite herni eventy a mechaniky");
						stop();
					}
				}
			
			}
		}, 0L, 20L);
		
	}

	public void stop() {
		Bukkit.getScheduler().cancelTask(id);
		
	}
	
	

}
