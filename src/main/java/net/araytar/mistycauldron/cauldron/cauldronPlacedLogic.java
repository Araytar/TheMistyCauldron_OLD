package net.araytar.mistycauldron.cauldron;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.araytar.mistycauldron.util.TileEntityStorageHelper;

public class cauldronPlacedLogic implements Listener {
    private final JavaPlugin pluginInstance;

    public cauldronPlacedLogic(JavaPlugin pluginInstance) {
        this.pluginInstance = pluginInstance;

    }

    @EventHandler
    public void onCauldronPlaced(BlockPlaceEvent event) {
        Block block = event.getBlockPlaced();
        Player player = event.getPlayer();
        World world = block.getWorld();

        if (block.getType() == Material.CAULDRON) {
            Location location = block.getLocation().clone().subtract(0,1,0);
            TileEntityStorageHelper.setTileBlockData(block, "heatLevel", Integer.toString(checkFuelSource(block.getWorld(), location)), this.pluginInstance);

        }
    }
    // Add or remove cases to add/remove heat levels for certain blocks.
    // Config/Helper method
    public static int checkFuelSource(World world, org.bukkit.Location location) {
        switch (world.getBlockAt(location).getType()) {
            //Non-Superheated Blocks
            case CAMPFIRE -> {
                return 1;
            }
            case MAGMA_BLOCK -> {
                return 1;
            }
            case FIRE -> {
                return 1;
            }

            //Superheated Blocks
            case SOUL_FIRE -> {
                return 2;
            }
            case SOUL_CAMPFIRE -> {
                return 2;
            }

            //Non heated
            default -> {
                return 0;
            }
        }
    }
}