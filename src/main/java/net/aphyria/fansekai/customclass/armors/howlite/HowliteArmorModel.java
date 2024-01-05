package net.aphyria.fansekai.customclass.armors.howlite;

import net.aphyria.fansekai.FanSekai;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HowliteArmorModel extends AnimatedGeoModel<HowliteArmorItem> {

    @Override
    public ResourceLocation getModelResource(HowliteArmorItem animatable){
        return new ResourceLocation(FanSekai.MODID, "geo/infused_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HowliteArmorItem animatable){
        return new ResourceLocation(FanSekai.MODID, "textures/armor/howlite_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HowliteArmorItem animatable) {
        return null;
    }
}
