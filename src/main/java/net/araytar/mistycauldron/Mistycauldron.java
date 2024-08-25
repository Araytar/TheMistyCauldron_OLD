package net.araytar.mistycauldron;

import net.araytar.mistycauldron.cauldron.cauldronPlacedLogic;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public final class Mistycauldron extends JavaPlugin {
    private ExecutorService executor;
    public FileConfiguration config;

    @Override
    public void onEnable() {
        executor = Executors.newCachedThreadPool();
        this.config = this.getConfig();

        //event register here :>
        getServer().getPluginManager().registerEvents(new cauldronPlacedLogic(this), this);
    }

    @Override
    public void onDisable() {
        shutdownExecutor();
    }

    private void shutdownExecutor() {
        try {
            executor.shutdown();
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }


}
