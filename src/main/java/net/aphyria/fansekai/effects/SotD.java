package net.aphyria.fansekai.effects;

import net.minecraft.world.effect.AttackDamageMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Inventory;

public class SotD extends MobEffect {
    public SotD(){
        super(MobEffectCategory.BENEFICIAL, 5636095);

    }

    @Override
    public void applyEffectTick(LivingEntity livingEntity, int p_19468_) {
        //livingEntity;
        super.applyEffectTick(livingEntity, p_19468_);
    }

    @Override
    public boolean isDurationEffectTick(int p_19455_, int p_19456_) {
        return true;
    }
}
