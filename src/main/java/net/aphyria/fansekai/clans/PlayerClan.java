package net.aphyria.fansekai.clans;

import net.minecraft.nbt.CompoundTag;

public class PlayerClan {

    private int clan;

    public int getClan(){
        return clan;
    }

    public void setClan(int clans) {
        this.clan = clans;
    }

    public void copyFrom(PlayerClan source){
        this.clan = source.clan;
    }

    public void saveNBTData(CompoundTag nbt){
        nbt.putInt("clan", clan);
    }

    public void loadNBTData(CompoundTag nbt){
        clan = nbt.getInt("clan");
    }
}
