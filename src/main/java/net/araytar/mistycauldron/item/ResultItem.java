package net.araytar.mistycauldron.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;

public final class ResultItem {
    String name;


    public ResultItem(float level, String name) {
        float stars = (float) (Math.round(level * 2) / 2.0);
        this.name = name;
    }

    ItemStack item = new ItemStack(Material.POTION);
    private PotionMeta metadata = (PotionMeta) item.getItemMeta();
}
