package net.aphyria.fansekai.customclass.aphy;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public class AphyKatana extends SwordItem {
    public AphyKatana() {
        super(Tiers.NETHERITE, 12, 0.2f, new Properties().fireResistant().stacksTo(1).setNoRepair().rarity(Rarity.create("legy", ChatFormatting.GOLD)));
    }

    @Override
    public <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity, Consumer<T> onBroken) {
        return 0;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.literal(""));
        components.add(Component.literal("The Blade of the gods.").withStyle(ChatFormatting.GRAY));components.add(Component.literal(""));components.add(Component.literal(""));
        components.add(Component.literal("How did you get your hands on this...").withStyle(ChatFormatting.DARK_RED));

        super.appendHoverText(itemStack, level, components, tooltipFlag);
    }

}
