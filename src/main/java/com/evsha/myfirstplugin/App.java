package com.evsha.myfirstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("MyFirstPlugin has been enabled!");
        getCommand("hello").setExecutor((sender, command, label, args) -> {
            sender.sendMessage("Hello from MyFirstPlugin!");
            return true;
        });
    }

    @Override
    public void onDisable() {
        getLogger().info("MyFirstPlugin has been disabled!");
    }
}

