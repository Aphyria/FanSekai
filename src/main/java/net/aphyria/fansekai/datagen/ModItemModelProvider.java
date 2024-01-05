package net.aphyria.fansekai.datagen;

import net.aphyria.fansekai.FanSekai;
import net.aphyria.fansekai.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, FanSekai.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.JADE_HELMET);
        simpleItem(ModItems.JADE_CHEST);
        simpleItem(ModItems.JADE_LEGS);
        simpleItem(ModItems.JADE_BOOTS);
        simpleItem(ModItems.HOWLITE_HELMET);
        simpleItem(ModItems.HOWLITE_CHEST);
        simpleItem(ModItems.HOWLITE_LEGS);
        simpleItem(ModItems.HOWLITE_BOOTS);
        simpleItem(ModItems.HELIOTROPE_HELMET);
        simpleItem(ModItems.HELIOTROPE_CHEST);
        simpleItem(ModItems.HELIOTROPE_LEGS);
        simpleItem(ModItems.HELIOTROPE_BOOTS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(FanSekai.MODID, "item/" + item.getId().getPath()));
    }
}
