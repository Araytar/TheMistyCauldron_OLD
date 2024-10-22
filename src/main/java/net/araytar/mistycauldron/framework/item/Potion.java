package net.araytar.mistycauldron.framework.item;

import org.bukkit.Color;
import org.bukkit.Material;

public class Potion {
        protected String name;
        protected String lore;
        protected Color potionColor;

        public Potion potionColor(byte r, byte g, byte b) {
            this.potionColor = Color.fromRGB(r, g, b);
            return this;
        }

        public Potion setName(String name) {
            this.name = name;
            return this;
        }

        public Potion setLore(String lore) {
            this.lore = lore;
            return this;
        }

        public Potion addToRecipe(Material item, int count) {
            return this;
        }
    }
