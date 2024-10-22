package net.araytar.mistycauldron.item;

import org.bukkit.Color;
import org.bukkit.Material;

public class Potion {
        protected String name;
        protected String lore;
        protected Color potionColor;


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
