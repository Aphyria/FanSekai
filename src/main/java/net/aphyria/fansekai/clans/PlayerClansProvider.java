package net.aphyria.fansekai.clans;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PlayerClansProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {
    public static Capability<PlayerClan> PLAYER_CLAN = CapabilityManager.get(new CapabilityToken<PlayerClan>() {  });

    private PlayerClan clan = null;
    private final LazyOptional<PlayerClan> optional = LazyOptional.of(this::createPlayerClan);

    private PlayerClan createPlayerClan() {
            if(this.clan == null){
                this.clan = new PlayerClan();
            }
            return this.clan;
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
            if (cap == PLAYER_CLAN){return optional.cast();}
        return LazyOptional.empty();
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag nbt = new CompoundTag();
        createPlayerClan().saveNBTData(nbt);
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        createPlayerClan().loadNBTData(nbt);
    }
}
