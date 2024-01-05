package net.aphyria.fansekai.customclass.armors.jade;

import net.aphyria.fansekai.FanSekai;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class JadeArmorModel extends AnimatedGeoModel<JadeArmorItem> {

    @Override
    public ResourceLocation getModelResource(JadeArmorItem animatable){
        return new ResourceLocation(FanSekai.MODID, "geo/infused_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JadeArmorItem animatable){
        return new ResourceLocation(FanSekai.MODID, "textures/armor/jade_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(JadeArmorItem animatable) {
        return null;
    }
}
