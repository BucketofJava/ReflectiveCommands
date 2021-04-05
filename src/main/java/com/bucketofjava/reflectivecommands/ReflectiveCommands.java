package com.bucketofjava.reflectivecommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Locale;

public final class ReflectiveCommands extends JavaPlugin {

    @Override
    public void onEnable() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String s=command.toString().toLowerCase();
        return false;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
