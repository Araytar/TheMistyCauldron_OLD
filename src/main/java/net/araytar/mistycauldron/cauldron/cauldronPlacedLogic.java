package net.araytar.mistycauldron.cauldron;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class cauldronPlacedLogic implements Listener {

    @EventHandler
    public static void onCauldronPlaced(BlockPlaceEvent event) {
        Block block = event.getBlockPlaced();
        Player player = event.getPlayer();
        World world = block.getWorld();

        if (block.getType() == Material.CAULDRON) {
            Location location = block.getLocation().clone();
            location = location.subtract(0, 1, 0);

            switch (world.getBlockAt(location).getType()) {
                //Non-Superheated Blocks
                case CAMPFIRE -> {
                    break;
                }
                case MAGMA_BLOCK -> {
                    break;
                }
                case FIRE -> {
                    break;
                }

                //Superheated Blocks
                case SOUL_FIRE -> {
                    break;
                }
                case SOUL_CAMPFIRE -> {
                    break;
                }

                default -> {
                    break;
                }
            }
        }
    }

    public static cauldronPlacedLogic createcauldronPlacedLogic() {
        return new cauldronPlacedLogic();
    }
}
