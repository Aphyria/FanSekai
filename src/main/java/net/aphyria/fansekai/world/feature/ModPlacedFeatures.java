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

    public static final RegistryObject<PlacedFeature> JADE_ORE_PLACED = PLACED_FEATURES.register("jade_ore_placed",
            ()-> new PlacedFeature(ModConfigFeatures.JADE_ORE.getHolder().get(),
                    rareOrePlacement(30, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(5), VerticalAnchor.absolute(20)))));
    public static final RegistryObject<PlacedFeature> ANGEL_ORE_PLACED = PLACED_FEATURES.register("angel_ore_placed",
            ()-> new PlacedFeature(ModConfigFeatures.ANGEL_ORE.getHolder().get(),
                    rareOrePlacement(25, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(40), VerticalAnchor.absolute(100)))));
    public static final RegistryObject<PlacedFeature> DEMON_ORE_PLACED = PLACED_FEATURES.register("demon_ore_placed",
            ()-> new PlacedFeature(ModConfigFeatures.DEMON_ORE.getHolder().get(),
                    commonOrePlacement(6, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(20), VerticalAnchor.belowTop(20)))));
    public static final RegistryObject<PlacedFeature> RAT_ORE_PLACED = PLACED_FEATURES.register("rat_ore_placed",
            ()-> new PlacedFeature(ModConfigFeatures.RAT_ORE.getHolder().get(),
                    commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(20)))));
    public static final RegistryObject<PlacedFeature> TIGER_ORE_PLACED = PLACED_FEATURES.register("tiger_ore_placed",
            ()-> new PlacedFeature(ModConfigFeatures.TIGER_ORE.getHolder().get(),
                    commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(20)))));
    public static final RegistryObject<PlacedFeature> RABU_ORE_PLACED = PLACED_FEATURES.register("rabu_ore_placed",
            ()-> new PlacedFeature(ModConfigFeatures.RABU_ORE.getHolder().get(),
                    commonOrePlacement(4, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(20)))));



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
