package net.araytar.mistycauldron.framework.crafting;

import net.araytar.mistycauldron.framework.Exceptions;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import java.util.ArrayList;
import java.util.List;

public class Potion {
    protected List<ItemStack> ingredients = new ArrayList<ItemStack>();
    protected List<ItemStack> results = new ArrayList<ItemStack>();
    protected int brewingTicks;
    protected int accuracy;
    protected boolean dynamicEffects = true;
    protected Color particleColor;

    public Potion addIngredient(Material item, int count) throws Exception {
        if (!item.isItem()) {Exceptions.notAnItem(item);}
        ItemStack iStack = new ItemStack(item, count);
        ingredients.add(iStack);
        return this;
    }

    public Potion setParticleColor(byte r, byte g, byte b) {
        particleColor = Color.fromRGB(r, g, b);
        return this;
    }


    public Potion setDynamicEffects(boolean value) {
        dynamicEffects = value;
        return this;
    }

    public Potion setBrewingTime(int Seconds) {
        this.brewingTicks = Seconds/20;
        return this;
    }

    public Potion addResult(Material item, int count) throws Exception {
        if (!item.isItem()) {Exceptions.notAnItem(item);}
        ItemStack iStack = new ItemStack(item, count);
        results.add(iStack);
        return this;
    }

    public Potion setAccuracy(int percent) throws Exception {
        if (percent < 0 || percent > 100) {Exceptions.notAPercentNumber();}
        this.accuracy = percent;
        return this;
    }
}
