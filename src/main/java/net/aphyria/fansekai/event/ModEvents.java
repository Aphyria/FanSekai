package net.aphyria.fansekai.event;


import net.aphyria.fansekai.FanSekai;
import net.aphyria.fansekai.clans.PlayerClansProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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
}
