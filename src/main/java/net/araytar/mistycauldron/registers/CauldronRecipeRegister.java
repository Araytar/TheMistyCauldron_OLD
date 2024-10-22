package net.araytar.mistycauldron.registers;

import net.araytar.mistycauldron.crafting.Potion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//A basic class to store and work with cauldronRecipes.
public class CauldronRecipeRegister {
    private static final Map<String, Potion> cauldronRecipes = new HashMap<>();

    public static void registerItem(String key, Potion recipe) {
        cauldronRecipes.put(key, recipe);
    }

    public static Potion get(String identifier) {
        return cauldronRecipes.get(identifier);
    }

    public static boolean hasKey(String identifier) {
        return cauldronRecipes.containsKey(identifier);
    }

    public static boolean hasRecipe(Potion potion) {
        return cauldronRecipes.containsValue(potion);
    }

    public static void removeItem(String key) {
        cauldronRecipes.remove(key);
    }

    public static List<Potion> getAll() {
        return new ArrayList<>(cauldronRecipes.values());
    }
}
