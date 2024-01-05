package net.aphyria.fansekai.util;

import net.aphyria.fansekai.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final CreativeModeTab FANSEKAI_TAB = new CreativeModeTab("fansekai_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.JAIDO_ORE.get());
        }
    };
    public static final CreativeModeTab FANSEKAI_TAB_COMBAT = new CreativeModeTab("fansekai_tab_combat") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.JAIDO_ORE.get());
        }
    };
}
