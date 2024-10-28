package net.araytar.mistycauldron.framework.item;

import org.bukkit.Color;

public abstract class Potion {

        protected String displayName;
        protected String lore;
        protected Color potionColor;
        protected String identifier;

        public Potion() {
             identifier = this.getClass().getSimpleName();
        }

        public void setPotionColor(int r, int g, int b) {
            this.potionColor = Color.fromRGB(r, g, b);
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public void setLore(String lore) {
            this.lore = lore;
        }

        public void onConsumed() {}
    }
