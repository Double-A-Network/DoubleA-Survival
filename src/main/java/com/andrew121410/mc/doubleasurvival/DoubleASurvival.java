package com.andrew121410.mc.doubleasurvival;

import org.bukkit.plugin.java.JavaPlugin;

public final class DoubleASurvival extends JavaPlugin {

    @Override
    public void onEnable() {
        new CraftingRecipeManager(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
