package net.araytar.mistycauldron.cauldron;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.araytar.mistycauldron.util.TileEntityStorageHelper;
import net.araytar.mistycauldron.util.Config;

public class cauldronPlacedLogic implements Listener {
    private final Config config =  new Config();
    private final JavaPlugin pluginInstance;


    public cauldronPlacedLogic(JavaPlugin pluginInstance) {
        this.pluginInstance = pluginInstance;

    }

    @EventHandler
    public void onCauldronPlaced(BlockPlaceEvent event) {
        Block block = event.getBlockPlaced();
        World world = block.getWorld();

        if (block.getType() == Material.CAULDRON) {
            Location location = block.getLocation().clone().subtract(0,1,0);
            if (config.getHeatedMaterials().contains(world.getBlockAt(location).getType())) {
                TileEntityStorageHelper.setTileBlockData(block, "heatLevel", "1", this.pluginInstance);
            } else if (config.getSoulHeatedBlocks().contains(world.getBlockAt(location).getType())){
                TileEntityStorageHelper.setTileBlockData(block, "heatLevel", "1", this.pluginInstance);
            }
        }
    }

    @EventHandler
    public void onHeatSourcePlaced(BlockPlaceEvent event) {
        Block block = event.getBlockPlaced();
    }
}