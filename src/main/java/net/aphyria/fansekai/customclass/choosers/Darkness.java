package net.aphyria.fansekai.customclass.choosers;

import net.aphyria.fansekai.clans.PlayerClansProvider;
import net.aphyria.fansekai.util.ModTabs;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;

public class Darkness extends Item {

    public Darkness() {
        super(new Properties().tab(ModTabs.FANSEKAI_TAB).rarity(Rarity.EPIC).defaultDurability(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if (interactionHand == InteractionHand.MAIN_HAND){
            player.getCapability(PlayerClansProvider.PLAYER_CLAN).ifPresent(clan -> {
                if (level.isClientSide && !clan.isInClan())player.sendSystemMessage(Component.literal("You are now part of Darkness Wrath!").withStyle(ChatFormatting.DARK_RED));
                if (level.isClientSide && clan.isInClan()){
                    if (clan.getClan() == 3)player.sendSystemMessage(Component.literal("You are already part of the Darkness Wrath.").withStyle(ChatFormatting.DARK_RED, ChatFormatting.BOLD));
                    else {
                        player.sendSystemMessage(Component.literal("What do you think you're doing...").withStyle(ChatFormatting.BOLD, ChatFormatting.DARK_RED));
                    }
                }
                if (!clan.isInClan())clan.setClan(3);
            });
        }
        return super.use(level, player, interactionHand);
    }
}