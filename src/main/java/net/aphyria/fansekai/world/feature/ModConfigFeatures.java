package net.aphyria.fansekai.world.feature;

import com.google.common.base.Suppliers;
import net.aphyria.fansekai.FanSekai;
import net.aphyria.fansekai.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
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

    public static final RegistryObject<ConfiguredFeature<?, ?>> JAIDO_GEODE = CONFIGURED_FEATURES.register("jaido_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                    BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(ModBlocks.JAIDO_PACKED_BLOCK_VIVID.get()),
                    BlockStateProvider.simple(ModBlocks.JAIDO_PACKED_BLOCK_VIVID.get()),
                    BlockStateProvider.simple(ModBlocks.JAIDO_PACKED_BLOCK.get()),
                    BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                    List.of(ModBlocks.JAIDO_CLUSTER.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE,
                    BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                    new GeodeCrackSettings(0.25D, 1.5D, 1), 0.5D, 0.1D, true,
                    UniformInt.of(3, 8), UniformInt.of(2, 6), UniformInt.of(1, 2), -15, 15, 0.06D, 1)));
            public static final RegistryObject<ConfiguredFeature<?, ?>> HOWLITE_GEODE = CONFIGURED_FEATURES.register("howlite_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                    BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(ModBlocks.HOWLITE_PACKED_BLOCK_VIVID.get()),
                    BlockStateProvider.simple(ModBlocks.HOWLITE_PACKED_BLOCK_VIVID.get()),
                    BlockStateProvider.simple(ModBlocks.HOWLITE_PACKED_BLOCK.get()),
                    BlockStateProvider.simple(Blocks.CALCITE),
                    List.of(ModBlocks.HOWLITE_CLUSTER.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE,
                    BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                    new GeodeCrackSettings(0.25D, 1.5D, 1), 0.5D, 0.1D, true,
                    UniformInt.of(3, 8), UniformInt.of(2, 6), UniformInt.of(1, 2), -15, 15, 0.06D, 1)));
            public static final RegistryObject<ConfiguredFeature<?, ?>> HELIOTROPE_GEODE = CONFIGURED_FEATURES.register("heliotrope_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                    BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(ModBlocks.HELIOTROPE_PACKED_BLOCK_VIVID.get()),
                    BlockStateProvider.simple(ModBlocks.HELIOTROPE_PACKED_BLOCK_VIVID.get()),
                    BlockStateProvider.simple(ModBlocks.HELIOTROPE_PACKED_BLOCK.get()),
                    BlockStateProvider.simple(Blocks.POLISHED_BLACKSTONE),
                    List.of(ModBlocks.HELIOTROPE_CLUSTER.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE,
                    BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                    new GeodeCrackSettings(0.25D, 1.5D, 1), 0.5D, 0.1D, true,
                    UniformInt.of(3, 8), UniformInt.of(2, 6), UniformInt.of(1, 2), -15, 15, 0.06D, 1)));
            public static final RegistryObject<ConfiguredFeature<?, ?>> TURQUOISE_GEODE = CONFIGURED_FEATURES.register("turquoise_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                    BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(ModBlocks.TURQUOISE_PACKED_BLOCK_VIVID.get()),
                    BlockStateProvider.simple(ModBlocks.TURQUOISE_PACKED_BLOCK_VIVID.get()),
                    BlockStateProvider.simple(ModBlocks.TURQUOISE_PACKED_BLOCK.get()),
                    BlockStateProvider.simple(Blocks.POLISHED_DEEPSLATE),
                    List.of(ModBlocks.TURQUOISE_CLUSTER.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE,
                    BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                    new GeodeCrackSettings(0.25D, 1.5D, 1), 0.5D, 0.1D, true,
                    UniformInt.of(3, 8), UniformInt.of(2, 6), UniformInt.of(1, 2), -15, 15, 0.08D, 1)));
            public static final RegistryObject<ConfiguredFeature<?, ?>> PSEUDOCROCIDOLITE_GEODE = CONFIGURED_FEATURES.register("pseudocrocidolite_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                    BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(ModBlocks.PSEUDOCROCIDOLITE_PACKED_BLOCK_VIVID.get()),
                    BlockStateProvider.simple(ModBlocks.PSEUDOCROCIDOLITE_PACKED_BLOCK_VIVID.get()),
                    BlockStateProvider.simple(ModBlocks.PSEUDOCROCIDOLITE_PACKED_BLOCK.get()),
                    BlockStateProvider.simple(Blocks.POLISHED_DEEPSLATE),
                    List.of(ModBlocks.PSEUDOCROCIDOLITE_CLUSTER.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE,
                    BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                    new GeodeCrackSettings(0.25D, 1.5D, 1), 0.5D, 0.1D, true,
                    UniformInt.of(3, 8), UniformInt.of(2, 6), UniformInt.of(1, 2), -15, 15, 0.08D, 1)));
            public static final RegistryObject<ConfiguredFeature<?, ?>> RHODONITE_GEODE = CONFIGURED_FEATURES.register("rhodonite_geode",
            () -> new ConfiguredFeature<>(Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                    BlockStateProvider.simple(Blocks.AIR),
                    BlockStateProvider.simple(ModBlocks.RHODONITE_PACKED_BLOCK_VIVID.get()),
                    BlockStateProvider.simple(ModBlocks.RHODONITE_PACKED_BLOCK_VIVID.get()),
                    BlockStateProvider.simple(ModBlocks.RHODONITE_PACKED_BLOCK.get()),
                    BlockStateProvider.simple(Blocks.POLISHED_DEEPSLATE),
                    List.of(ModBlocks.RHODONITE_CLUSTER.get().defaultBlockState()),
                    BlockTags.FEATURES_CANNOT_REPLACE,
                    BlockTags.GEODE_INVALID_BLOCKS),
                    new GeodeLayerSettings(1.7D, 1.2D, 2.5D, 3.5D),
                    new GeodeCrackSettings(0.25D, 1.5D, 1), 0.5D, 0.1D, true,
                    UniformInt.of(3, 8), UniformInt.of(2, 6), UniformInt.of(1, 2), -15, 15, 0.08D, 1)));

    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }
}