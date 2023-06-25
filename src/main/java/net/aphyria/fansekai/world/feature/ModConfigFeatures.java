package net.aphyria.fansekai.world.feature;

import com.google.common.base.Suppliers;
import net.aphyria.fansekai.FanSekai;
import net.aphyria.fansekai.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfigFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, FanSekai.MODID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> JAIDO_ORE_OVERWORLD = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.JAIDO_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> HOWLITE_ORE_OVERWORLD = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.HOWLITE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> HELIOTROPE_ORE_NETHER = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.HELIOTROPE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> TURQUOISE_ORE_OVER = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.TURQUOISE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> PSEUDOCROCIDOLITE_ORE_OVER = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PSEUDOCROCIDOLITE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> RHODONITE_ORE_OVER = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.RHODONITE_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> JAIDO_ORE = CONFIGURED_FEATURES.register("jaido_ore",
            ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(JAIDO_ORE_OVERWORLD.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> HOWLITE_ORE = CONFIGURED_FEATURES.register("howlite_ore",
            ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(HOWLITE_ORE_OVERWORLD.get(), 12)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> HELIOTROPE_ORE = CONFIGURED_FEATURES.register("heliotrope_ore",
            ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(HELIOTROPE_ORE_NETHER.get(), 10)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> TURQUOISE_ORE = CONFIGURED_FEATURES.register("rat_ore",
            ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(TURQUOISE_ORE_OVER.get(), 10)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PSEUDOCROCIDOLITE_ORE = CONFIGURED_FEATURES.register("pseudocrocidolite_ore",
            ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(PSEUDOCROCIDOLITE_ORE_OVER.get(), 10)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> RHODONITE_ORE = CONFIGURED_FEATURES.register("rhodonite_ore",
            ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(RHODONITE_ORE_OVER.get(), 10)));

    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }
}
