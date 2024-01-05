package net.aphyria.fansekai;

import com.mojang.logging.LogUtils;
import net.aphyria.fansekai.block.ModBlocks;
import net.aphyria.fansekai.customclass.armors.heliotrope.HeliotropeArmorItem;
import net.aphyria.fansekai.customclass.armors.heliotrope.HeliotropeArmorRenderer;
import net.aphyria.fansekai.customclass.armors.howlite.HowliteArmorItem;
import net.aphyria.fansekai.customclass.armors.howlite.HowliteArmorRenderer;
import net.aphyria.fansekai.customclass.armors.jade.JadeArmorItem;
import net.aphyria.fansekai.customclass.armors.jade.JadeArmorRenderer;
import net.aphyria.fansekai.effects.ModEffects;
import net.aphyria.fansekai.item.ModItems;
import net.aphyria.fansekai.world.feature.ModConfigFeatures;
import net.aphyria.fansekai.world.feature.ModPlacedFeatures;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FanSekai.MODID)
public class FanSekai
{
    public static final String MODID = "fansekai";
    private static final Logger LOGGER = LogUtils.getLogger();

    public FanSekai()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModEffects.register(modEventBus);
        ModConfigFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);

        GeckoLib.initialize();

        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
        });
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("Running a developmental version of the FanSekai mod");
        LOGGER.info("Fansekai: Do /stop for a cool surprise :)");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }

        @SubscribeEvent
        public static void registerRenderers(final EntityRenderersEvent.AddLayers event){
            GeoArmorRenderer.registerArmorRenderer(JadeArmorItem.class, JadeArmorRenderer::new);
            GeoArmorRenderer.registerArmorRenderer(HowliteArmorItem.class, HowliteArmorRenderer::new);
            GeoArmorRenderer.registerArmorRenderer(HeliotropeArmorItem.class, HeliotropeArmorRenderer::new);
        }

    }
}
