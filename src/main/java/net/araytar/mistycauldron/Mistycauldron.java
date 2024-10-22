package net.araytar.mistycauldron;

import net.araytar.mistycauldron.framework.blocks.cauldronPlacedLogic;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public final class Mistycauldron extends JavaPlugin {
    private ExecutorService executor;

    @Override
    public void onEnable() {
        executor = Executors.newCachedThreadPool();

        //event register here
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
