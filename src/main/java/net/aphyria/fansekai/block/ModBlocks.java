package net.aphyria.fansekai.block;

import net.aphyria.fansekai.FanSekai;
import net.aphyria.fansekai.item.ModItems;
import net.aphyria.fansekai.item.ModTabs;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FanSekai.MODID);


    public static final RegistryObject<Block> ANGEL_ORE = registerBlock("angel_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(100f).strength(80f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> DEMON_ORE = registerBlock("demon_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(100f).strength(65f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RAT_ORE = registerBlock("rat_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(100f).strength(50f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TIGER_ORE = registerBlock("tiger_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(100f).strength(50f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RABU_ORE = registerBlock("rabu_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(100f).strength(50f)), ModTabs.FANSEKAI_TAB);

    //chotto

    public static final RegistryObject<Block> JAIDO_ORE = registerBlock("jaido_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(100f).strength(80f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_BLOCK = registerBlock("jaido_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).explosionResistance(80f).strength(100f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_CLUSTER = registerBlock("jaido_cluster",
            () -> new AmethystClusterBlock(6, 4, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDOSTONE_BLOCK = registerBlock("jaidostone_block",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_CONCRETE = registerBlock("jaido_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_CONCRETE_POWDER = registerBlock("jaido_concrete_powder",
            () -> new ConcretePowderBlock(JAIDO_CONCRETE.get(), BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE_POWDER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_SEA_LANTERN = registerBlock("jaido_sea_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_CANDLE = registerBlock("jaido_candle",
            () -> new CandleBlock(BlockBehaviour.Properties.copy(Blocks.CANDLE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_CONCRETE_VIVID = registerBlock("jaido_concrete_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_GLAZED_TERRACOTTA = registerBlock("jaido_glazed_terracotta",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_GLAZED_TERRACOTTA_VIVID = registerBlock("jaido_glazed_terracotta_vivid",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_PACKED_BLOCK = registerBlock("jaido_packed_block",
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_PACKED_BLOCK_VIVID = registerBlock("jaido_packed_block_vivid",
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_SHULKER_BOX = registerBlock("jaido_shulker_box",
            () -> new ShulkerBoxBlock(null, BlockBehaviour.Properties.copy(Blocks.SHULKER_BOX)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_STAINED_GLASS = registerBlock("jaido_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_STAINED_GLASS_PANE = registerBlock("jaido_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.CYAN, BlockBehaviour.Properties.copy(Blocks.GLASS_PANE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_TERRACOTTA = registerBlock("jaido_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_TERRACOTTA_VIVID = registerBlock("jaido_terracotta_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_WOOL = registerBlock("jaido_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_TULIP = registerBlock("jaido_tulip",
            () -> new FlowerBlock((Supplier<MobEffect>) null, 0, BlockBehaviour.Properties.copy(Blocks.PINK_TULIP)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_TULIP_POTTED = registerBlock("jaido_tulip_potted",
            () -> new FlowerPotBlock(JAIDO_TULIP.get(), BlockBehaviour.Properties.copy(Blocks.POTTED_PINK_TULIP)), ModTabs.FANSEKAI_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));}
    public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}
}
