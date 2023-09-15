package net.aphyria.fansekai.event;


import net.aphyria.fansekai.FanSekai;
import net.aphyria.fansekai.clans.PlayerClan;
import net.aphyria.fansekai.clans.PlayerClansProvider;
import net.aphyria.fansekai.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.RegisterGameTestsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.atomic.AtomicInteger;

@Mod.EventBusSubscriber(modid = FanSekai.MODID)
public class ModEvents {
    private static AtomicInteger x = new AtomicInteger();
    @SubscribeEvent
    public static void onAttachCapabilitiesPlayer(AttachCapabilitiesEvent<Entity> event){
        if (event.getObject() instanceof Player){
            if (!event.getCapabilities().containsValue(PlayerClansProvider.PLAYER_CLAN)){
                event.addCapability(new ResourceLocation(FanSekai.MODID, "properties"), new PlayerClansProvider());
            }
        }
    }
    @SubscribeEvent
    public static void onPlayerCloned(PlayerEvent.Clone event){
        if (event.isWasDeath()) {
            event.getOriginal().reviveCaps();
            event.getOriginal().getCapability(PlayerClansProvider.PLAYER_CLAN).ifPresent(clan -> x.set(clan.getClan()));
            event.getOriginal().invalidateCaps();
            event.getEntity().getCapability(PlayerClansProvider.PLAYER_CLAN).ifPresent(clan -> clan.setClan(x.get()));
        }
    }
    @SubscribeEvent
    public static void onRegisterCapabilities(RegisterGameTestsEvent event){
        event.register(PlayerClan.class);
    }
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event){
        if (event.side == LogicalSide.SERVER){
            event.player.getCapability(PlayerClansProvider.PLAYER_CLAN).ifPresent(clan -> {
                if (clan.getClan() == 1){
                    event.player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED));
                    if (event.player.getOffhandItem().is(ModItems.JAIDO.get())){
                        event.player.addEffect(new MobEffectInstance(MobEffects.LUCK));
                    }
                }
                if (clan.getClan() == 2){
                    event.player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING));
                    if (event.player.getOffhandItem().is(ModItems.HOWLITE.get())){
                        event.player.addEffect(new MobEffectInstance(MobEffects.JUMP));
                    }
                }
                if (clan.getClan() == 3){
                    event.player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE));
                    if (event.player.isInLava() && event.player.getOffhandItem().is(ModItems.HELIOTROPE.get())){
                        event.player.heal(0.8f);
                    }
                }
                if (clan.getClan() == 4){
                    event.player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED));
                    if (event.player.getOffhandItem().is(ModItems.TURQUOISE.get())){
                        event.player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 11));
                    }
                }
                if (clan.getClan() == 5){
                    event.player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST));
                    if (event.player.getOffhandItem().is(ModItems.PSEUDOCROCIDOLITE.get())){
                        event.player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED));
                    }
                }
                if (clan.getClan() == 6){
                    event.player.addEffect(new MobEffectInstance(MobEffects.REGENERATION));
                    if (event.player.isInWater() && event.player.getOffhandItem().is(ModItems.RHODONITE.get())){
                        event.player.heal(0.8f);
                        event.player.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING));
                    }
                }
                if (clan.getClan() == 7){
                    event.player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 300));
                    event.player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1, 300));
                    event.player.heal(4f);
                }
            });
        }
    }
}
