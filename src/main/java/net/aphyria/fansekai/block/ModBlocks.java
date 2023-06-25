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
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_PACKED_BLOCK_VIVID = registerBlock("jaido_packed_block_vivid",
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
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
            () -> new FlowerBlock((Supplier<MobEffect>) null, 0, BlockBehaviour.Properties.copy(Blocks.ORANGE_TULIP)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> POTTED_JAIDO_TULIP = registerBlock("potted_jaido_tulip",
            () -> new FlowerPotBlock(JAIDO_TULIP.get(), BlockBehaviour.Properties.copy(Blocks.POTTED_ORANGE_TULIP)), null);
    public static final RegistryObject<Block> JAIDO_CANDLE_CAKE = registerBlock("jaido_candle_cake",
            () -> new CandleCakeBlock(JAIDO_CANDLE.get(), BlockBehaviour.Properties.copy(Blocks.CANDLE_CAKE)), null);

    //val

    public static final RegistryObject<Block> HOWLITE_ORE = registerBlock("howlite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(100f).strength(80f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_BLOCK = registerBlock("howlite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).explosionResistance(80f).strength(100f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_CLUSTER = registerBlock("howlite_cluster",
            () -> new AmethystClusterBlock(6, 4, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITESTONE_BLOCK = registerBlock("howlitestone_block",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_CONCRETE = registerBlock("howlite_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_CONCRETE_POWDER = registerBlock("howlite_concrete_powder",
            () -> new ConcretePowderBlock(HOWLITE_CONCRETE.get(), BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE_POWDER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_SEA_LANTERN = registerBlock("howlite_sea_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_CANDLE = registerBlock("howlite_candle",
            () -> new CandleBlock(BlockBehaviour.Properties.copy(Blocks.CANDLE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_CONCRETE_VIVID = registerBlock("howlite_concrete_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_GLAZED_TERRACOTTA = registerBlock("howlite_glazed_terracotta",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_GLAZED_TERRACOTTA_VIVID = registerBlock("howlite_glazed_terracotta_vivid",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_PACKED_BLOCK = registerBlock("howlite_packed_block",
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_PACKED_BLOCK_VIVID = registerBlock("howlite_packed_block_vivid",
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_SHULKER_BOX = registerBlock("howlite_shulker_box",
            () -> new ShulkerBoxBlock(null, BlockBehaviour.Properties.copy(Blocks.SHULKER_BOX)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_STAINED_GLASS = registerBlock("howlite_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_STAINED_GLASS_PANE = registerBlock("howlite_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.CYAN, BlockBehaviour.Properties.copy(Blocks.GLASS_PANE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_TERRACOTTA = registerBlock("howlite_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_TERRACOTTA_VIVID = registerBlock("howlite_terracotta_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_WOOL = registerBlock("howlite_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_TULIP = registerBlock("howlite_tulip",
            () -> new FlowerBlock((Supplier<MobEffect>) null, 0, BlockBehaviour.Properties.copy(Blocks.ORANGE_TULIP)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> POTTED_HOWLITE_TULIP = registerBlock("potted_howlite_tulip",
            () -> new FlowerPotBlock(HOWLITE_TULIP.get(), BlockBehaviour.Properties.copy(Blocks.POTTED_ORANGE_TULIP)), null);

    //momo

    public static final RegistryObject<Block> HELIOTROPE_ORE = registerBlock("heliotrope_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(100f).strength(65f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HELIOTROPE_CLUSTER = registerBlock("heliotrope_cluster",
            () -> new AmethystClusterBlock(6, 4, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HELIOTROPE_PACKED_BLOCK = registerBlock("heliotrope_packed_block",
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HELIOTROPE_PACKED_BLOCK_VIVID = registerBlock("heliotrope_packed_block_vivid",
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);

    //rat

    public static final RegistryObject<Block> TURQUOISE_ORE = registerBlock("turquoise_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(100f).strength(50f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TURQUOISE_CLUSTER = registerBlock("turquoise_cluster",
            () -> new AmethystClusterBlock(6, 4, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TURQUOISE_PACKED_BLOCK = registerBlock("turquoise_packed_block",
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TURQUOISE_PACKED_BLOCK_VIVID = registerBlock("turquoise_packed_block_vivid",
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);

    //tiger

    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_ORE = registerBlock("pseudocrocidolite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(100f).strength(50f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_CLUSTER = registerBlock("pseudocrocidolite_cluster",
            () -> new AmethystClusterBlock(6, 4, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_PACKED_BLOCK = registerBlock("pseudocrocidolite_packed_block",
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_PACKED_BLOCK_VIVID = registerBlock("pseudocrocidolite_packed_block_vivid",
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);

    //rabu

    public static final RegistryObject<Block> RHODONITE_ORE = registerBlock("rhodonite_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(100f).strength(50f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_CLUSTER = registerBlock("rhodonite_cluster",
            () -> new AmethystClusterBlock(6, 4, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_PACKED_BLOCK = registerBlock("rhodonite_packed_block",
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_PACKED_BLOCK_VIVID = registerBlock("rhodonite_packed_block_vivid",
            () -> new IceBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));}
    public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}
}
