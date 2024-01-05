package net.aphyria.fansekai.customclass.armors.heliotrope;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class HeliotropeArmorRenderer extends GeoArmorRenderer<HeliotropeArmorItem> {
    public HeliotropeArmorRenderer() {
        super(new HeliotropeArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.leftArmBone="armorRightArm";
        this.rightArmBone="armorLeftArm";
        this.leftLegBone="armorLeftLeg";
        this.rightLegBone="armorRightLeg";
        this.rightBootBone="armorRightBoot";
        this.leftBootBone="armorLeftBoot";
    }
}
