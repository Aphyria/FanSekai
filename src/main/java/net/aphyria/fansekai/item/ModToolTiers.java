package net.aphyria.fansekai.item;

import net.aphyria.fansekai.FanSekai;
import net.aphyria.fansekai.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static Tier VAL_TIER;
    public static Tier CHO_TIER;
    public static Tier MOMO_TIER;
    public static Tier RAT_TIER;
    public static Tier TIG_TIER;
    public static Tier RAB_TIER;
    public static Tier INF_TIER;

    static {
        VAL_TIER = TierSortingRegistry.registerTier(
                new ForgeTier(6, 24000, 10f, 6f, 18, ModTags.Blocks.NEEDS_VAL_TOOL, () -> Ingredient.of(ModItems.ANGEL.get())),
                        new ResourceLocation(FanSekai.MODID, "angel"), List.of(Tiers.NETHERITE), List.of(ModToolTiers.CHO_TIER));
        CHO_TIER = TierSortingRegistry.registerTier(
                new ForgeTier(6, 24000, 10f, 6f, 18, ModTags.Blocks.NEEDS_CHO_TOOL, () -> Ingredient.of(ModItems.DRAGON.get())),
                        new ResourceLocation(FanSekai.MODID, "dragon"), List.of(VAL_TIER), List.of(MOMO_TIER));
        MOMO_TIER = TierSortingRegistry.registerTier(
                new ForgeTier(6, 24000, 10f, 6f, 18, ModTags.Blocks.NEEDS_MOMO_TOOL, () -> Ingredient.of(ModItems.DEMON.get())),
                        new ResourceLocation(FanSekai.MODID, "demon"), List.of(CHO_TIER), List.of(RAT_TIER));
        RAT_TIER = TierSortingRegistry.registerTier(
                new ForgeTier(6, 24000, 10f, 6f, 18, ModTags.Blocks.NEEDS_RAT_TOOL, () -> Ingredient.of(ModItems.RAT.get())),
                        new ResourceLocation(FanSekai.MODID, "rat"), List.of(MOMO_TIER), List.of(TIG_TIER));
        TIG_TIER = TierSortingRegistry.registerTier(
                new ForgeTier(6, 24000, 10f, 6f, 18, ModTags.Blocks.NEEDS_TIG_TOOL, () -> Ingredient.of(ModItems.TIGER.get())),
                        new ResourceLocation(FanSekai.MODID, "tiger"), List.of(RAT_TIER), List.of(RAB_TIER));
        RAB_TIER = TierSortingRegistry.registerTier(
                new ForgeTier(6, 24000, 10f, 6f, 18, ModTags.Blocks.NEEDS_RAB_TOOL, () -> Ingredient.of(ModItems.RABU.get())),
                        new ResourceLocation(FanSekai.MODID, "rabu"), List.of(TIG_TIER), List.of(INF_TIER));
        INF_TIER = TierSortingRegistry.registerTier(
                new ForgeTier(200, 240000, 50f, 12f, 18, ModTags.Blocks.NEEDS_INF_TOOL, null),
                        new ResourceLocation(FanSekai.MODID, "infinity"), List.of(RAB_TIER), List.of());
    }
}