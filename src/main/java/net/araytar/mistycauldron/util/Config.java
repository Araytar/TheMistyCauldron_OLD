package net.araytar.mistycauldron.util;

import org.bukkit.Material;

import java.util.ArrayList;

public class Config {
    ArrayList<Material> heatedMaterials = new ArrayList<>();
    ArrayList<Material> soulHeatedMaterials = new ArrayList<>();

    public Config() {
        //heated material config here
        heatedMaterials.add(Material.CAMPFIRE);
        heatedMaterials.add(Material.MAGMA_BLOCK);
        heatedMaterials.add(Material.LAVA);
        heatedMaterials.add(Material.FIRE);

        //superheated material config here
        soulHeatedMaterials.add(Material.SOUL_FIRE);
        soulHeatedMaterials.add(Material.SOUL_CAMPFIRE);
    }

    public ArrayList<Material> getHeatedMaterials() {

        return this.heatedMaterials;
    }

    public ArrayList<Material> getSoulHeatedBlocks() {
        return this.soulHeatedMaterials;
    }
}
