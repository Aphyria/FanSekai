package net.aphyria.fansekai.customclass.aphy;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OPAmulet extends Item {

    public OPAmulet() {
        super(new Properties().stacksTo(1).fireResistant().rarity(Rarity.create("legend", ChatFormatting.GOLD)).setNoRepair());
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide() && hand == InteractionHand.MAIN_HAND){
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6000, 300));
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6000, 300));
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 6000, 5));
            player.getCooldowns().addCooldown(this, 10);
            Minecraft.getInstance().player.sendSystemMessage(Component.literal("Aphyria's Amulet resonates with the earth..."));
        }
        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.literal(""));
        components.add(Component.literal("The Amulet of the gods.").withStyle(ChatFormatting.GRAY));components.add(Component.literal(""));components.add(Component.literal(""));
        components.add(Component.literal("How did you get your hands on this...").withStyle(ChatFormatting.DARK_RED));

        super.appendHoverText(itemStack, level, components, tooltipFlag);
    }
}
