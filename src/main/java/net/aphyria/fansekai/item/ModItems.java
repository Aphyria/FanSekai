package net.aphyria.fansekai.item;

import net.aphyria.fansekai.FanSekai;
import net.aphyria.fansekai.customclass.aphy.AphyKatana;
import net.aphyria.fansekai.customclass.aphy.OPAmulet;
import net.aphyria.fansekai.customclass.aphy.AphyKimono;
import net.aphyria.fansekai.customclass.armors.heliotrope.HeliotropeArmorItem;
import net.aphyria.fansekai.customclass.armors.howlite.HowliteArmorItem;
import net.aphyria.fansekai.customclass.armors.jade.JadeArmorItem;
import net.aphyria.fansekai.customclass.choosers.*;
import net.aphyria.fansekai.util.ModTabs;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS= DeferredRegister.create(ForgeRegistries.ITEMS, FanSekai.MODID);

    //ingots
    public static final RegistryObject<Item> JAIDO = ITEMS.register("jaido", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> HOWLITE = ITEMS.register("howlite", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> HELIOTROPE = ITEMS.register("heliotrope", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> TURQUOISE = ITEMS.register("turquoise", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> PSEUDOCROCIDOLITE = ITEMS.register("pseudocrocidolite", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> RHODONITE = ITEMS.register("rhodonite", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));

    //dust
    public static final RegistryObject<Item> JAIDO_DUST = ITEMS.register("jaido_dust", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> HOWLITE_DUST = ITEMS.register("howlite_dust", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> HELIOTROPE_DUST = ITEMS.register("heliotrope_dust", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> TURQUOISE_DUST = ITEMS.register("turquoise_dust", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> PSEUDOCROCIDOLITE_DUST = ITEMS.register("pseudocrocidolite_dust", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> RHODONITE_DUST = ITEMS.register("rhodonite_dust", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));

    //amulets
/**    public static final RegistryObject<Item> AMULET = ITEMS.register("amulet", () -> new Amulet(Rarity.COMMON));
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

    //weapons
    //val
    public static final RegistryObject<Item> SWORD_V = ITEMS.register("sword_v", () -> new NormWeap(8, -3f, Rarity.EPIC, 1200));
    public static final RegistryObject<Item> SPEAR = ITEMS.register("spear", () -> new ValSpear());
**/

    //Armor
    public static final RegistryObject<Item> JADE_HELMET = ITEMS.register("jade_helmet", () -> new JadeArmorItem(ModArmorMat.JADE, EquipmentSlot.HEAD, new Item.Properties().rarity(Rarity.RARE).tab(ModTabs.FANSEKAI_TAB_COMBAT)));
    public static final RegistryObject<Item> JADE_CHEST = ITEMS.register("jade_chest", () -> new JadeArmorItem(ModArmorMat.JADE, EquipmentSlot.CHEST, new Item.Properties().rarity(Rarity.RARE).tab(ModTabs.FANSEKAI_TAB_COMBAT)));
    public static final RegistryObject<Item> JADE_LEGS = ITEMS.register("jade_legs", () -> new JadeArmorItem(ModArmorMat.JADE, EquipmentSlot.LEGS, new Item.Properties().rarity(Rarity.RARE).tab(ModTabs.FANSEKAI_TAB_COMBAT)));
    public static final RegistryObject<Item> JADE_BOOTS = ITEMS.register("jade_boots", () -> new JadeArmorItem(ModArmorMat.JADE, EquipmentSlot.FEET, new Item.Properties().rarity(Rarity.RARE).tab(ModTabs.FANSEKAI_TAB_COMBAT)));

    public static final RegistryObject<Item> HOWLITE_HELMET = ITEMS.register("howlite_helmet", () -> new HowliteArmorItem(ModArmorMat.HOWLITE, EquipmentSlot.HEAD, new Item.Properties().rarity(Rarity.RARE).tab(ModTabs.FANSEKAI_TAB_COMBAT)));
    public static final RegistryObject<Item> HOWLITE_CHEST = ITEMS.register("howlite_chest", () -> new HowliteArmorItem(ModArmorMat.HOWLITE, EquipmentSlot.CHEST, new Item.Properties().rarity(Rarity.RARE).tab(ModTabs.FANSEKAI_TAB_COMBAT)));
    public static final RegistryObject<Item> HOWLITE_LEGS = ITEMS.register("howlite_legs", () -> new HowliteArmorItem(ModArmorMat.HOWLITE, EquipmentSlot.LEGS, new Item.Properties().rarity(Rarity.RARE).tab(ModTabs.FANSEKAI_TAB_COMBAT)));
    public static final RegistryObject<Item> HOWLITE_BOOTS = ITEMS.register("howlite_boots", () -> new HowliteArmorItem(ModArmorMat.HOWLITE, EquipmentSlot.FEET, new Item.Properties().rarity(Rarity.RARE).tab(ModTabs.FANSEKAI_TAB_COMBAT)));

    public static final RegistryObject<Item> HELIOTROPE_HELMET = ITEMS.register("heliotrope_helmet", () -> new HeliotropeArmorItem(ModArmorMat.HELIOTROPE, EquipmentSlot.HEAD, new Item.Properties().rarity(Rarity.RARE).tab(ModTabs.FANSEKAI_TAB_COMBAT)));
    public static final RegistryObject<Item> HELIOTROPE_CHEST = ITEMS.register("heliotrope_chest", () -> new HeliotropeArmorItem(ModArmorMat.HELIOTROPE, EquipmentSlot.CHEST, new Item.Properties().rarity(Rarity.RARE).tab(ModTabs.FANSEKAI_TAB_COMBAT)));
    public static final RegistryObject<Item> HELIOTROPE_LEGS = ITEMS.register("heliotrope_legs", () -> new HeliotropeArmorItem(ModArmorMat.HELIOTROPE, EquipmentSlot.LEGS, new Item.Properties().rarity(Rarity.RARE).tab(ModTabs.FANSEKAI_TAB_COMBAT)));
    public static final RegistryObject<Item> HELIOTROPE_BOOTS = ITEMS.register("heliotrope_boots", () -> new HeliotropeArmorItem(ModArmorMat.HELIOTROPE, EquipmentSlot.FEET, new Item.Properties().rarity(Rarity.RARE).tab(ModTabs.FANSEKAI_TAB_COMBAT)));

    //misc
    public static final RegistryObject<Item> STRONG_PAPER = ITEMS.register("strong_paper", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> PARCHMENT = ITEMS.register("parchment", () -> new Item(new Item.Properties().tab(ModTabs.FANSEKAI_TAB)));
    public static final RegistryObject<Item> CHOOSER_C = ITEMS.register("chooser_c", () -> new Dragons());
    public static final RegistryObject<Item> CHOOSER_V = ITEMS.register("chooser_v", () -> new Warriors());
    public static final RegistryObject<Item> CHOOSER_M = ITEMS.register("chooser_m", () -> new Darkness());
    public static final RegistryObject<Item> CHOOSER_R = ITEMS.register("chooser_r", () -> new Mayhem());
    public static final RegistryObject<Item> CHOOSER_T = ITEMS.register("chooser_t", () -> new Hunters());
    public static final RegistryObject<Item> CHOOSER_B = ITEMS.register("chooser_b", () -> new Water());

    //Aphy stuffs

    public static final RegistryObject<Item> AMULET_OP = ITEMS.register("amulet_op", () -> new OPAmulet());
    public static final RegistryObject<Item> APHYKIMONO = ITEMS.register("aphykimono", () -> new AphyKimono());
    public static final RegistryObject<Item> KATANA_OP = ITEMS.register("katana_op", () -> new AphyKatana());
//    public static final RegistryObject<Item> SCYTHE_OP = ITEMS.register("scythe_op", () -> new AphyKatana()); //change class



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
