package net.araytar.mistycauldron;

import net.araytar.mistycauldron.framework.blocks.listeners.cauldronPlacedLogic;
import net.araytar.mistycauldron.framework.item.listeners.PotionConsumedListener;
import net.araytar.mistycauldron.framework.registers.PotionRegister;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public final class Mistycauldron extends JavaPlugin {
    private ExecutorService executor;
    public static PotionRegister potionRegister = new PotionRegister();

    @Override
    public void onEnable() {
        executor = Executors.newCachedThreadPool();

        //event register here
        getServer().getPluginManager().registerEvents(new cauldronPlacedLogic(this), this);
        getServer().getPluginManager().registerEvents(new PotionConsumedListener(this), this);
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
