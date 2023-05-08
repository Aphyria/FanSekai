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

    public static final Supplier<List<OreConfiguration.TargetBlockState>> JADE_ORE_OVERWORLD = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.JADE_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> ANGEL_ORE_OVERWORLD = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ANGEL_ORE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> DEMON_ORE_NETHER = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.NETHER_ORE_REPLACEABLES, ModBlocks.DEMON_ORE.get().defaultBlockState())));

    public static final RegistryObject<ConfiguredFeature<?, ?>> JADE_ORE = CONFIGURED_FEATURES.register("jade_ore",
            ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(JADE_ORE_OVERWORLD.get(), 8)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ANGEL_ORE = CONFIGURED_FEATURES.register("angel_ore",
            ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(ANGEL_ORE_OVERWORLD.get(), 12)));
    public static final RegistryObject<ConfiguredFeature<?, ?>> DEMON_ORE = CONFIGURED_FEATURES.register("demon_ore",
            ()-> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEMON_ORE_NETHER.get(), 10)));

    public static void register(IEventBus eventBus){
        CONFIGURED_FEATURES.register(eventBus);
    }
}
