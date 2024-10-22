package net.araytar.mistycauldron.registers;

import net.araytar.mistycauldron.crafting.Potion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//A basic class to store and work with potions.
public class PotionRegister {
    private static final Map<String, Potion> potions = new HashMap<>();

    public static void registerItem(String key, Potion recipe) {
        potions.put(key, recipe);
    }

    public static Potion get(String identifier) {
        return potions.get(identifier);
    }

    public static boolean hasKey(String identifier) {
        return potions.containsKey(identifier);
    }

    public static boolean hasRecipe(Potion potion) {
        return potions.containsValue(potion);
    }

    public static void removeItem(String key) {
        potions.remove(key);
    }

    public static List<Potion> getAll() {
        return new ArrayList<>(potions.values());
    }
}
