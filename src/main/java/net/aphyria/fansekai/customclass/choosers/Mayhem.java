package net.aphyria.fansekai.customclass.choosers;

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

public class Mayhem extends Item {

    public Mayhem() {
        super(new Properties().tab(ModTabs.FANSEKAI_TAB).rarity(Rarity.EPIC).defaultDurability(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if (interactionHand == InteractionHand.MAIN_HAND){
                player.getCapability(PlayerClansProvider.PLAYER_CLAN).ifPresent(clan -> {
                    if (level.isClientSide && !clan.isInClan())player.sendSystemMessage(Component.literal("You are now part of the Mayhem Crew!").withStyle(ChatFormatting.RED));
                    if (level.isClientSide && clan.isInClan()){
                        if (clan.getClan() == 4)player.sendSystemMessage(Component.literal("You are already part of the Mayhem Crew.").withStyle(ChatFormatting.RED, ChatFormatting.BOLD));
                        else {
                            player.sendSystemMessage(Component.literal("What do you think you're doing...").withStyle(ChatFormatting.BOLD, ChatFormatting.DARK_RED));
                        }
                    }
                    if (!clan.isInClan())clan.setClan(4);
                });
        }
        return super.use(level, player, interactionHand);
    }
}

