package net.aphyria.fansekai.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final CreativeModeTab FANSEKAI_TAB = new CreativeModeTab("fansekai_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LOGO.get());
        }
    };
}
