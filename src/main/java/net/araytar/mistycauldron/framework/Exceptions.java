package net.araytar.mistycauldron.framework;

import org.bukkit.Material;

public class Exceptions {
    public static void notAnItem(Material item) throws Exception {
        throw new Exception("MATERIAL " + item + " is not an Item.");
    }

    public static void notAPercentNumber() throws Exception {
        throw new Exception("pece");
    }
}
