package net.aphyria.fansekai.event;


import net.aphyria.fansekai.FanSekai;
import net.aphyria.fansekai.clans.PlayerClan;
import net.aphyria.fansekai.clans.PlayerClansProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.RegisterGameTestsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = FanSekai.MODID)
public class ModEvents {
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
        if (event.isWasDeath()){
            event.getOriginal().getCapability(PlayerClansProvider.PLAYER_CLAN).ifPresent(oldStore ->
            {
                event.getOriginal().getCapability(PlayerClansProvider.PLAYER_CLAN).ifPresent(newStore ->{ newStore.copyFrom(oldStore); });
            });
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
                switch (clan.getClan()){
                    case 1:{
                        event.player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 1, 2));
                    }
                    case 2:{
                        event.player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 3));
                        event.player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING));
                    }
                    case 3:{
                        event.player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE));
                    }
                    case 4:{
                        if (event.player.getHealth() > event.player.getMaxHealth()/2) event.player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST));
                        else event.player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE));
                    }
                    case 5:{
                        event.player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 2));
                    }
                    case 6:{
                        event.player.addEffect(new MobEffectInstance(MobEffects.REGENERATION));
                    }
                    case 7:{
                        event.player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 300));
                        event.player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1, 300));
                        event.player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1, 5));
                    }
                    default: break;
                }
            });
        }
    }
}
