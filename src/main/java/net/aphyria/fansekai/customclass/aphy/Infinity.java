package net.aphyria.fansekai.customclass.aphy;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class Infinity extends MobEffect {
    public Infinity() {
        super(MobEffectCategory.BENEFICIAL, 3124687);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int amp) {
        if (!pLivingEntity.level.isClientSide){
            if (pLivingEntity.getHealth() < pLivingEntity.getMaxHealth()){
                pLivingEntity.getAttributes();
            }
            //pLivingEntity
        }
    }

    @Override
    public boolean isDurationEffectTick(int p_19455_, int p_19456_) {
        return true;
    }
}
