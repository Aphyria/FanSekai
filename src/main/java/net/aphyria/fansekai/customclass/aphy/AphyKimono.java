package net.aphyria.fansekai.customclass.aphy;

import net.aphyria.fansekai.FanSekai;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

public class AphyKimono extends ArmorItem {
    public AphyKimono() {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlot p_40410_) {
                return 200;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot p_40411_) {
                return 20;
            }

            @Override
            public int getEnchantmentValue() {
                return 0;
            }

            @Override
            public SoundEvent getEquipSound() {
                return null;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return null;
            }

            @Override
            public String getName() {
                return FanSekai.MODID+":aphymat";
            }

            @Override
            public float getToughness() {
                return 200f;
            }

            @Override
            public float getKnockbackResistance() {
                return 1200f;
            }
        }, EquipmentSlot.CHEST, new Properties().fireResistant());
    }


    @Override
    public boolean canEquip(ItemStack stack, EquipmentSlot armorType, Entity entity) {
        if (armorType.getName() == EquipmentSlot.CHEST.getName()) return true; else return false;
    }

    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 50));
        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1, 500));
        super.onArmorTick(stack, level, player);
    }

    @Override
    public int getDamage(ItemStack stack) {
        return 0;
    }

    @Override
    public void setDamage(ItemStack stack, int damage) {
        super.setDamage(stack, 0);
    }

    @Override
    public boolean isEnderMask(ItemStack stack, Player player, EnderMan endermanEntity) {
        return true;
    }

    @Override
    public boolean canWalkOnPowderedSnow(ItemStack stack, LivingEntity wearer) {
        return true;
    }
}
