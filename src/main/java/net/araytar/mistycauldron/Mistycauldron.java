package net.araytar.mistycauldron;

import net.araytar.mistycauldron.cauldron.cauldronPlacedLogic;
import org.bukkit.plugin.java.JavaPlugin;

public final class Mistycauldron extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(cauldronPlacedLogic.createcauldronPlacedLogic(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
