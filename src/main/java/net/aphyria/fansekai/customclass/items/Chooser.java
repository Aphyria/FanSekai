package net.aphyria.fansekai.customclass.items;

import net.aphyria.fansekai.clans.PlayerClansProvider;
import net.aphyria.fansekai.item.ModTabs;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class Chooser extends Item {

    private int helpme;

    public Chooser(int x) {
        super(new Properties().tab(ModTabs.FANSEKAI_TAB).rarity(Rarity.EPIC).defaultDurability(1));
        setHelpme(x);
    }

    public void setHelpme(int helpme) {
        this.helpme = helpme;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if (interactionHand == InteractionHand.MAIN_HAND){
            if (!level.isClientSide) {
                player.getCapability(PlayerClansProvider.PLAYER_CLAN).ifPresent(clan -> {
                    clan.setClan(helpme);
                });
            }
            if (level.isClientSide){
                switch (helpme){
                    case 1 -> player.sendSystemMessage(Component.literal("You feel a sudden lust for gold.").withStyle(ChatFormatting.DARK_AQUA));
                    case 2 -> player.sendSystemMessage(Component.literal("Your conquest to Valhalla has begun!").withStyle(ChatFormatting.YELLOW));
                    case 3 -> player.sendSystemMessage(Component.literal("You feel the fiery pits of hell draw closer.").withStyle(ChatFormatting.DARK_RED));
                    case 4 -> player.sendSystemMessage(Component.literal("An insatiable hunger for cheese fills you.").withStyle(ChatFormatting.AQUA));
                    case 5 -> player.sendSystemMessage(Component.literal("The Tiger within you Roars!").withStyle(ChatFormatting.GOLD));
                    case 6 -> player.sendSystemMessage(Component.literal("Your Heart pounds loudly!").withStyle(ChatFormatting.RED));
                    case 7 -> player.sendSystemMessage(Component.literal("You feel your veins pulsing with raw magic...").withStyle(ChatFormatting.BLACK));
                }
            }
        }
        return super.use(level, player, interactionHand);
    }
}