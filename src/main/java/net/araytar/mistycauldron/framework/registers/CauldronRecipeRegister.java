package net.araytar.mistycauldron.framework.registers;

import net.araytar.mistycauldron.framework.crafting.CauldronRecipe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//A basic class to store and work with cauldronRecipes.
public class CauldronRecipeRegister {
    private static final Map<String, CauldronRecipe> cauldronRecipes = new HashMap<>();

    public static void registerItem(String key, CauldronRecipe recipe) {
        cauldronRecipes.put(key, recipe);
    }

    public static CauldronRecipe get(String identifier) {
        return cauldronRecipes.get(identifier);
    }

    public static boolean hasKey(String identifier) {
        return cauldronRecipes.containsKey(identifier);
    }

    public static boolean hasRecipe(CauldronRecipe cauldronRecipe) {
        return cauldronRecipes.containsValue(cauldronRecipe);
    }

    public static void removeItem(String key) {
        cauldronRecipes.remove(key);
    }

    public static List<CauldronRecipe> getAll() {
        return new ArrayList<>(cauldronRecipes.values());
    }
}
