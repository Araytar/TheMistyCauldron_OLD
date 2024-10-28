package net.araytar.mistycauldron.framework.item.listeners;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.java.JavaPlugin;

public class PotionConsumedListener implements Listener {
    private final JavaPlugin pluginInstance;

    //Constructor
    public PotionConsumedListener(JavaPlugin pluginInstance) {
        this.pluginInstance = pluginInstance;
    }

    @EventHandler
    public void onPlayerItemConsumeEvent(PlayerItemConsumeEvent event) {
        Player player = event.getPlayer();
        if (event.getItem().hasItemMeta() && event.getItem().getItemMeta() instanceof PotionMeta) {
            ItemMeta itemMeta = event.getItem().getItemMeta();
            NamespacedKey key = new NamespacedKey(pluginInstance, "tmc_identifier");

            if (itemMeta != null && itemMeta.getPersistentDataContainer().has(key, PersistentDataType.STRING)) {

            }
        }
    }
}
