package net.aphyria.fansekai.customclass.items;

import net.aphyria.fansekai.item.ModTabs;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ValSpear extends Item {
    public ValSpear() {
        super(new Properties().tab(ModTabs.FANSEKAI_TAB).fireResistant().rarity(Rarity.create("legy", ChatFormatting.GOLD)).stacksTo(1));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.literal(""));
        components.add(Component.literal("A Valkyrie's trusty Weapon").withStyle(ChatFormatting.WHITE));
        components.add(Component.literal(""));
        super.appendHoverText(itemStack, level, components, tooltipFlag);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {


        return super.use(level, player, hand);
    }
}
