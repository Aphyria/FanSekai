package net.aphyria.fansekai.customclass.armors.jade;

import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class JadeArmorRenderer extends GeoArmorRenderer<JadeArmorItem> {
    public JadeArmorRenderer() {
        super(new JadeArmorModel());

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
