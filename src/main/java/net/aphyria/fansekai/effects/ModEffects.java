package net.aphyria.fansekai.effects;

import net.aphyria.fansekai.FanSekai;
import net.aphyria.fansekai.customclass.aphy.Infinity;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, FanSekai.MODID);

    public static final RegistryObject<MobEffect> INFEFF = MOB_EFFECTS.register("infeff", () -> new Infinity());
    public static final RegistryObject<MobEffect> SOTD = MOB_EFFECTS.register("sotd", () -> new SotD());
    public static final RegistryObject<MobEffect> VAL = MOB_EFFECTS.register("val", () -> new Val());

    public static void register(IEventBus eventBus){MOB_EFFECTS.register(eventBus);}
}
