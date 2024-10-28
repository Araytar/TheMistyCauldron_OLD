package net.araytar.mistycauldron.framework.registers;

import net.araytar.mistycauldron.framework.crafting.CauldronRecipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//A basic class to store and work with potions.
public class PotionRegister {
    private static final Map<String, CauldronRecipe> potions = new HashMap<>();

    public static void registerItem(String key, CauldronRecipe recipe) {
        potions.put(key, recipe);
    }

    public static CauldronRecipe get(String identifier) {
        return potions.get(identifier);
    }

    public static boolean hasKey(String identifier) {
        return potions.containsKey(identifier);
    }

    public static boolean hasRecipe(CauldronRecipe cauldronRecipe) {
        return potions.containsValue(cauldronRecipe);
    }

    public static void removeItem(String key) {
        potions.remove(key);
    }

    public static List<CauldronRecipe> getAll() {
        return new ArrayList<>(potions.values());
    }
}
