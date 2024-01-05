package net.aphyria.fansekai.customclass.armors.howlite;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class HowliteArmorRenderer extends GeoArmorRenderer<HowliteArmorItem> {
    public HowliteArmorRenderer() {
        super(new HowliteArmorModel());

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
