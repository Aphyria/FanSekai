package net.aphyria.fansekai.util;

import net.aphyria.fansekai.FanSekai;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_VAL_TOOL = tag("needs_val_tool");
        public static final TagKey<Block> NEEDS_CHO_TOOL = tag("needs_cho_tool");
        public static final TagKey<Block> NEEDS_MOMO_TOOL = tag("needs_momo_tool");
        public static final TagKey<Block> NEEDS_RAT_TOOL = tag("needs_rat_tool");
        public static final TagKey<Block> NEEDS_TIG_TOOL = tag("needs_tig_tool");
        public static final TagKey<Block> NEEDS_RAB_TOOL = tag("needs_rab_tool");
        public static final TagKey<Block> NEEDS_INF_TOOL = tag("needs_inf_tool");



        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(FanSekai.MODID, name));
        }
        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
