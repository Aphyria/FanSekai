package net.aphyria.fansekai.item;

import net.aphyria.fansekai.FanSekai;
import net.aphyria.fansekai.customclass.aphy.AphyKatana;
import net.aphyria.fansekai.customclass.aphy.OPAmulet;
import net.aphyria.fansekai.customclass.aphy.Yukata;
import net.aphyria.fansekai.customclass.items.Amulet;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS= DeferredRegister.create(ForgeRegistries.ITEMS, FanSekai.MODID);

    public static final RegistryObject<Item> LOGO = ITEMS.register("logo", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRAGON = ITEMS.register("dragon", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> ANGEL = ITEMS.register("angel", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> DEMON = ITEMS.register("demon", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> RAT = ITEMS.register("rat", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> TIGER = ITEMS.register("tiger", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));

    public static final RegistryObject<Item> DRAGONDUST = ITEMS.register("dragondust", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> ANGELDUST = ITEMS.register("angeldust", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> DEMONDUST = ITEMS.register("demondust", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> RATDUST = ITEMS.register("ratdust", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> TIGERDUST = ITEMS.register("tigerdust", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));

    public static final RegistryObject<Item> AMULET = ITEMS.register("amulet", () -> new Amulet(Rarity.COMMON));
    public static final RegistryObject<Item> AMULET_C = ITEMS.register("amulet_c", () -> new Amulet(Rarity.UNCOMMON));
    public static final RegistryObject<Item> AMULET_C2 = ITEMS.register("amulet_c2", () -> new Amulet(Rarity.RARE));
    public static final RegistryObject<Item> AMULET_C3 = ITEMS.register("amulet_c3", () -> new Amulet(Rarity.EPIC));
    public static final RegistryObject<Item> AMULET_V = ITEMS.register("amulet_v", () -> new Amulet(Rarity.UNCOMMON));
    public static final RegistryObject<Item> AMULET_V2 = ITEMS.register("amulet_v2", () -> new Amulet(Rarity.RARE));
    public static final RegistryObject<Item> AMULET_V3 = ITEMS.register("amulet_v3", () -> new Amulet(Rarity.EPIC));
    public static final RegistryObject<Item> AMULET_M = ITEMS.register("amulet_m", () -> new Amulet(Rarity.UNCOMMON));
    public static final RegistryObject<Item> AMULET_M2 = ITEMS.register("amulet_m2", () -> new Amulet(Rarity.RARE));
    public static final RegistryObject<Item> AMULET_M3 = ITEMS.register("amulet_m3", () -> new Amulet(Rarity.EPIC));
    public static final RegistryObject<Item> BADGE_R = ITEMS.register("badge_r", () -> new Amulet(Rarity.RARE));
    public static final RegistryObject<Item> BADGE_C = ITEMS.register("badge_c", () -> new Amulet(Rarity.RARE));
    public static final RegistryObject<Item> BADGE_T = ITEMS.register("badge_t", () -> new Amulet(Rarity.RARE));



    //Aphy stuffs

    public static final RegistryObject<Item> AMULET_OP = ITEMS.register("amulet_op", () -> new OPAmulet());
    public static final RegistryObject<Item> YUKATA_OP = ITEMS.register("yukata_op", () -> new Yukata());
    public static final RegistryObject<Item> KATANA_OP = ITEMS.register("katana_op", () -> new AphyKatana());
    public static final RegistryObject<Item> SCYTHE_OP = ITEMS.register("scythe_op", () -> new AphyKatana()); //change class



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
