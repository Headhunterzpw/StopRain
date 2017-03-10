package nl.jessegeerts.customplugins.stoprain;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Jesse on 10-3-2017.
 */
public class Main extends JavaPlugin implements Listener{


    private static Plugin plugin;

    public void onEnable(){
        getLogger().info(getDescription().getName() + " is loaded and enabled.");
        getLogger().info("This plugin was made by Jesse Geerts.");
        getLogger().info("Please donate to my paypal: me@jessegeerts.nl or https://www.paypal.me/JGeerts2");
        plugin=this;
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }
    public void onDisable(){
plugin=null;
        getLogger().info(getDescription().getName() + " has been unloaded and disabled.");
    }

    @EventHandler
    public void weather(WeatherChangeEvent e){
        e.setCancelled(true);
    }
}
