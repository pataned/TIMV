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

	
	int i = -1;

	public int getId(){
		return id;
	}
	
	private String OdpocitavaniDeftext(int s){
		return "Do startu hry zbyva " + ChatColor.GREEN + s + ChatColor.GRAY + " sekund";
	}
	public void start() {
		id = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable(){
			@SuppressWarnings("deprecation")
			public void run(){
				if (i == -1){
					i = 31;
					Main.plugin.getServer().getLogger().info("Nastartovalo odpocitavanie s ID: " + getId());
				}
				i--;
				String PrubehOdpocitavaniprefix = Chat.newTempPrefix(ChatColor.DARK_AQUA, ChatColor.RED, ChatColor.GRAY, "Prubeh odpocitavani", "<", ">");
				for (Player p : Bukkit.getOnlinePlayers()){
					p.setLevel(i);
					if (i == 30){
						Chat.send(p, PrubehOdpocitavaniprefix + OdpocitavaniDeftext(i));
						TitleAPI.sendFullTitle(p, 20, 40, 20, "", "Hra zacina za &a" + i);
					}
					if (i == 20){
						Chat.send(p, PrubehOdpocitavaniprefix + OdpocitavaniDeftext(i));
					}
					if (i == 15){
						TitleAPI.sendFullTitle(p, 20, 40, 20, "", "Hra zacina za &a" + i);
						Chat.send(p, PrubehOdpocitavaniprefix + OdpocitavaniDeftext(i));
					}
					if (i == 10){
						TitleAPI.sendFullTitle(p, 20, 40, 20, "", "Hra zacina za &a" + i);
						Chat.send(p, PrubehOdpocitavaniprefix + OdpocitavaniDeftext(i));
					}
					if (i == 5){
						TitleAPI.sendFullTitle(p, 20, 40, 20, "", "Hra zacina za &a" + i);
						Chat.send(p, PrubehOdpocitavaniprefix + OdpocitavaniDeftext(i));
					}
					if (i == 4){
						TitleAPI.sendFullTitle(p, 20, 40, 20, "", "Hra zacina za &a" + i);
						Chat.send(p, PrubehOdpocitavaniprefix + OdpocitavaniDeftext(i));
					}
					if (i == 3){
						TitleAPI.sendFullTitle(p, 20, 40, 20, "", "Hra zacina za &a" + i);
						Chat.send(p, PrubehOdpocitavaniprefix + OdpocitavaniDeftext(i));
					}
					if (i == 2){
						TitleAPI.sendFullTitle(p, 20, 40, 20, "", "Hra zacina za &a" + i);
						Chat.send(p, PrubehOdpocitavaniprefix + OdpocitavaniDeftext(i));
					}
					if (i == 1){
						TitleAPI.sendFullTitle(p, 20, 40, 20, "", "Hra zacina za &a" + i);
						Chat.send(p, PrubehOdpocitavaniprefix + OdpocitavaniDeftext(i));
					}
					if (i == 0){
						for (Player o : Bukkit.getOnlinePlayers()){
							TitleAPI.sendFullTitle(o, 20, 40, 20, "&6Hra zacina", "&eTIMV &e&o(plugin by pataned & vlcik128)");
							Chat.send(o, PrubehOdpocitavaniprefix + ChatColor.AQUA + "Hra zacina!");
						}
						ActionBarAPI.sendActionBarToAllPlayers(ChatColor.DARK_GRAY + "Spousteji se dulezite herni eventy a mechaniky");
						i = -1;
						stop();
					}
				}

			}
		}, 0L, 20L);

	}

	public void stop() {
		Bukkit.getScheduler().cancelTask(id);
		Main.plugin.getServer().getLogger().info("Zrusene odpocitavanie s ID: " + getId());

	}



}
