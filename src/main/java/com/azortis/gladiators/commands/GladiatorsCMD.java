package com.azortis.gladiators.commands;

import com.azortis.azortislib.AzortisLib;
import com.azortis.azortislib.command.AlCommand;
import com.azortis.azortislib.command.CommandBuilder;
import com.azortis.azortislib.command.IAlCommandExecutor;
import com.azortis.azortislib.command.IAlTabCompleter;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;

import java.util.List;

public class GladiatorsCMD implements IAlCommandExecutor, IAlTabCompleter {
    private AzortisLib al;

    public GladiatorsCMD(AzortisLib al){
        AlCommand cmd = new CommandBuilder()
                .setName("gladiators")
                .setDescription("The main gladiators command.")
                .setUsage("&c/gladiators [Help]")
                .addAlias("gl")
                .setPlugin(al.getPlugin())
                .build();
        cmd.setExecutor(this);
        cmd.setTabCompleter(this);
        al.getCommandManager().register("gladiators", cmd);
    }

    public boolean onCommand(CommandSender commandSender, AlCommand alCommand, String s, String[] strings) {
        return false;
    }

    public List<String> tabComplete(CommandSender commandSender, String s, String[] strings, Location location) {
        return null;
    }

}
