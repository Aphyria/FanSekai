package net.aphyria.fansekai.customclass.armors.heliotrope;

import net.aphyria.fansekai.FanSekai;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HeliotropeArmorModel extends AnimatedGeoModel<HeliotropeArmorItem> {

    @Override
    public ResourceLocation getModelResource(HeliotropeArmorItem animatable){
        return new ResourceLocation(FanSekai.MODID, "geo/infused_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(HeliotropeArmorItem animatable){
        return new ResourceLocation(FanSekai.MODID, "textures/armor/heliotrope_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HeliotropeArmorItem animatable) {
        return null;
    }
}
