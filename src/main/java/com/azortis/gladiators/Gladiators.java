package com.azortis.gladiators;

import com.azortis.azortislib.AzortisLib;
import com.azortis.gladiators.commands.GladiatorsCMD;
import org.bukkit.plugin.java.JavaPlugin;

public final class Gladiators extends JavaPlugin {
    private AzortisLib al;

    @Override
    public void onEnable(){
        al = new AzortisLib(this, "Gladiators", "§c[§6Gladiators§c]");
        al.getLogger().info("Loading commands...");
        new GladiatorsCMD(al);
    }

    @Override
    public void onDisable(){

    }

}
