package net.aphyria.fansekai.world.feature;

import net.aphyria.fansekai.FanSekai;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, FanSekai.MODID);

    public static final RegistryObject<PlacedFeature> JAIDO_ORE_PLACED = PLACED_FEATURES.register("jaido_ore_placed",
            ()-> new PlacedFeature(ModConfigFeatures.JAIDO_ORE.getHolder().get(),
                    rareOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(5), VerticalAnchor.absolute(20)))));
    public static final RegistryObject<PlacedFeature> HOWLITE_ORE_PLACED = PLACED_FEATURES.register("howlite_ore_placed",
            ()-> new PlacedFeature(ModConfigFeatures.HOWLITE_ORE.getHolder().get(),
                    rareOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(40), VerticalAnchor.absolute(100)))));
    public static final RegistryObject<PlacedFeature> HELIOTROPE_ORE_PLACED = PLACED_FEATURES.register("heliotrope_ore_placed",
            ()-> new PlacedFeature(ModConfigFeatures.HELIOTROPE_ORE.getHolder().get(),
                    rareOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(20), VerticalAnchor.belowTop(20)))));
    public static final RegistryObject<PlacedFeature> TURQUIOSE_ORE_PLACED = PLACED_FEATURES.register("turquoise_ore_placed",
            ()-> new PlacedFeature(ModConfigFeatures.TURQUOISE_ORE.getHolder().get(),
                    commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(20)))));
    public static final RegistryObject<PlacedFeature> PSEUDOCROCIDOLITE_ORE_PLACED = PLACED_FEATURES.register("pseudocrocidolite_ore_placed",
            ()-> new PlacedFeature(ModConfigFeatures.PSEUDOCROCIDOLITE_ORE.getHolder().get(),
                    commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(20)))));
    public static final RegistryObject<PlacedFeature> RHODONITE_ORE_PLACED = PLACED_FEATURES.register("rhodonite_ore_placed",
            ()-> new PlacedFeature(ModConfigFeatures.RHODONITE_ORE.getHolder().get(),
                    commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(20)))));

    public static final RegistryObject<PlacedFeature> JAIDO_GEODE_PLACED = PLACED_FEATURES.register("jaido_geode_placed",
            () -> new PlacedFeature(ModConfigFeatures.JAIDO_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(30), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.absolute(15), VerticalAnchor.absolute(100)))));
    public static final RegistryObject<PlacedFeature> HOWLITE_GEODE_PLACED = PLACED_FEATURES.register("howlite_geode_placed",
            () -> new PlacedFeature(ModConfigFeatures.HOWLITE_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(30), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(15), VerticalAnchor.absolute(20)))));
    public static final RegistryObject<PlacedFeature> HELIOTROPE_GEODE_PLACED = PLACED_FEATURES.register("heliotrope_geode_placed",
            () -> new PlacedFeature(ModConfigFeatures.HELIOTROPE_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(75), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(5), VerticalAnchor.belowTop(5)))));
    public static final RegistryObject<PlacedFeature> TURQUOISE_GEODE_PLACED = PLACED_FEATURES.register("turquoise_geode_placed",
            () -> new PlacedFeature(ModConfigFeatures.TURQUOISE_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(15), VerticalAnchor.absolute(40)))));
    public static final RegistryObject<PlacedFeature> PSEUDOCROCIDOLITE_GEODE_PLACED = PLACED_FEATURES.register("pseudocrocidolite_geode_placed",
            () -> new PlacedFeature(ModConfigFeatures.PSEUDOCROCIDOLITE_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(15), VerticalAnchor.absolute(40)))));
    public static final RegistryObject<PlacedFeature> RHODONITE_GEODE_PLACED = PLACED_FEATURES.register("rhodonite_geode_placed",
            () -> new PlacedFeature(ModConfigFeatures.RHODONITE_GEODE.getHolder().get(), List.of(
                    RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(), HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(15), VerticalAnchor.absolute(40)))));



    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }

    public static void register(IEventBus eventBus){
        PLACED_FEATURES.register(eventBus);
    }
}
