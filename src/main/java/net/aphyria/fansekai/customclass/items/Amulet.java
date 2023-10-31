package net.aphyria.fansekai.customclass.items;

import net.aphyria.fansekai.util.ModTabs;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class Amulet extends Item {
    private int rarityInt;
    public Amulet(Rarity tier) {
        super(new Item.Properties().tab(ModTabs.FANSEKAI_TAB).stacksTo(1).rarity(tier));
        setRarityInt(tier);
    }

    public void setRarityInt(Rarity tier) {
        switch (tier){
            case UNCOMMON -> this.rarityInt = 1;
            case RARE -> this.rarityInt = 2;
            case EPIC -> this.rarityInt = 3;
            default -> this.rarityInt = 0;
        }
    }

    public int getRarityInt() {
        return rarityInt;
    }

    @Override
    public void onCraftedBy(ItemStack itemStack, Level level, Player player) {

        super.onCraftedBy(itemStack, level, player);
    }
}