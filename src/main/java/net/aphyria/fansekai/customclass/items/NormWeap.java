package net.aphyria.fansekai.customclass.items;

import net.aphyria.fansekai.item.ModTabs;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class NormWeap extends SwordItem {

    public NormWeap(int dmg, float speed, Rarity rarity, int durability) {
        super(Tiers.NETHERITE, dmg, speed, new Properties().tab(ModTabs.FANSEKAI_TAB).fireResistant().rarity(rarity).fireResistant().stacksTo(1).durability(durability));
    }
}
