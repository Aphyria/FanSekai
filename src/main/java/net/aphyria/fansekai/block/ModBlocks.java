package net.aphyria.fansekai.block;

import net.aphyria.fansekai.FanSekai;
import net.aphyria.fansekai.customclass.blocks.Ore;
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
            () -> new Ore(4718587), ModTabs.FANSEKAI_TAB);
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
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> JAIDO_PACKED_BLOCK_VIVID = registerBlock("jaido_packed_block_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
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
    public static final RegistryObject<Block> JAIDO_BLOSSOM =registerBlock("jaido_blossom",
            () -> new SporeBlossomBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM)), ModTabs.FANSEKAI_TAB);

    //val

    public static final RegistryObject<Block> HOWLITE_ORE = registerBlock("howlite_ore",
            () -> new Ore(9756670), ModTabs.FANSEKAI_TAB);
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
//    public static final RegistryObject<Block> HOWLITE_CONCRETE_VIVID = registerBlock("howlite_concrete_vivid",
//            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModTabs.FANSEKAI_TAB); -> no textures
    public static final RegistryObject<Block> HOWLITE_GLAZED_TERRACOTTA = registerBlock("howlite_glazed_terracotta",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
//    public static final RegistryObject<Block> HOWLITE_GLAZED_TERRACOTTA_VIVID = registerBlock("howlite_glazed_terracotta_vivid",
//            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB); -> no textures
    public static final RegistryObject<Block> HOWLITE_PACKED_BLOCK = registerBlock("howlite_packed_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_PACKED_BLOCK_VIVID = registerBlock("howlite_packed_block_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
//    public static final RegistryObject<Block> HOWLITE_SHULKER_BOX = registerBlock("howlite_shulker_box",
//            () -> new ShulkerBoxBlock(null, BlockBehaviour.Properties.copy(Blocks.SHULKER_BOX)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_STAINED_GLASS = registerBlock("howlite_stained_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_STAINED_GLASS_PANE = registerBlock("howlite_stained_glass_pane",
            () -> new StainedGlassPaneBlock(DyeColor.CYAN, BlockBehaviour.Properties.copy(Blocks.GLASS_PANE)), ModTabs.FANSEKAI_TAB);
//    public static final RegistryObject<Block> HOWLITE_TERRACOTTA = registerBlock("howlite_terracotta",
//            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB); -> no textures
    public static final RegistryObject<Block> HOWLITE_TERRACOTTA_VIVID = registerBlock("howlite_terracotta_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_WOOL = registerBlock("howlite_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HOWLITE_TULIP = registerBlock("howlite_tulip",
            () -> new FlowerBlock((Supplier<MobEffect>) null, 0, BlockBehaviour.Properties.copy(Blocks.ORANGE_TULIP)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> POTTED_HOWLITE_TULIP = registerBlock("potted_howlite_tulip",
            () -> new FlowerPotBlock(HOWLITE_TULIP.get(), BlockBehaviour.Properties.copy(Blocks.POTTED_ORANGE_TULIP)), null);
    public static final RegistryObject<Block> HOWLITE_CANDLE_CAKE = registerBlock("howlite_candle_cake",
            () -> new CandleCakeBlock(HOWLITE_CANDLE.get(), BlockBehaviour.Properties.copy(Blocks.CANDLE_CAKE)), null);
    public static final RegistryObject<Block> HOWLITE_BLOSSOM =registerBlock("howlite_blossom",
            () -> new SporeBlossomBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM)), ModTabs.FANSEKAI_TAB);

    //momo

    public static final RegistryObject<Block> HELIOTROPE_ORE = registerBlock("heliotrope_ore",
            () -> new Ore(16129851), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HELIOTROPE_BLOCK = registerBlock("heliotrope_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).explosionResistance(80f).strength(100f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HELIOTROPE_CLUSTER = registerBlock("heliotrope_cluster",
            () -> new AmethystClusterBlock(6, 4, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HELIOTROPESTONE_BLOCK = registerBlock("heliotropestone_block",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HELIOTROPE_CONCRETE = registerBlock("heliotrope_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HELIOTROPE_CONCRETE_POWDER = registerBlock("heliotrope_concrete_powder",
            () -> new ConcretePowderBlock(HOWLITE_CONCRETE.get(), BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE_POWDER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HELIOTROPE_SEA_LANTERN = registerBlock("heliotrope_sea_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HELIOTROPE_CANDLE = registerBlock("heliotrope_candle",
            () -> new CandleBlock(BlockBehaviour.Properties.copy(Blocks.CANDLE)), ModTabs.FANSEKAI_TAB);
//    public static final RegistryObject<Block> HELIOTROPE_CONCRETE_VIVID = registerBlock("heliotrope_concrete_vivid",
//            () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_CONCRETE)), ModTabs.FANSEKAI_TAB); -> no textures
    public static final RegistryObject<Block> HELIOTROPE_GLAZED_TERRACOTTA = registerBlock("heliotrope_glazed_terracotta",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
//    public static final RegistryObject<Block> HELIOTROPE_GLAZED_TERRACOTTA_VIVID = registerBlock("heliotrope_glazed_terracotta_vivid",
//            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB); -> no textures
    public static final RegistryObject<Block> HELIOTROPE_PACKED_BLOCK = registerBlock("heliotrope_packed_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HELIOTROPE_PACKED_BLOCK_VIVID = registerBlock("heliotrope_packed_block_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HELIOTROPE_TERRACOTTA_VIVID = registerBlock("heliotrope_terracotta_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
//    public static final RegistryObject<Block> HELIOTROPE_TERRACOTTA = registerBlock("heliotrope_terracotta",
//            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB); -> no textures
    public static final RegistryObject<Block> HELIOTROPE_WOOL = registerBlock("heliotrope_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> HELIOTROPE_TULIP = registerBlock("heliotrope_tulip",
            () -> new FlowerBlock((Supplier<MobEffect>) null, 0, BlockBehaviour.Properties.copy(Blocks.ORANGE_TULIP)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> POTTED_HELIOTROPE_TULIP = registerBlock("potted_heliotrope_tulip",
            () -> new FlowerPotBlock(HELIOTROPE_TULIP.get(), BlockBehaviour.Properties.copy(Blocks.POTTED_ORANGE_TULIP)), null);
    public static final RegistryObject<Block> HELIOTROPE_CANDLE_CAKE = registerBlock("heliotrope_candle_cake",
            () -> new CandleCakeBlock(HELIOTROPE_CANDLE.get(), BlockBehaviour.Properties.copy(Blocks.CANDLE_CAKE)), null);
    public static final RegistryObject<Block> HELIOTROPE_BLOSSOM =registerBlock("heliotrope_blossom",
            () -> new SporeBlossomBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM)), ModTabs.FANSEKAI_TAB);

    //rat

    public static final RegistryObject<Block> TURQUOISE_ORE = registerBlock("turquoise_ore",
            () -> new Ore(9167569), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TURQUOISE_BLOCK = registerBlock("turquoise_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).explosionResistance(80f).strength(100f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TURQUOISE_CLUSTER = registerBlock("turquoise_cluster",
            () -> new AmethystClusterBlock(6, 4, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TURQUOISESTONE_BLOCK = registerBlock("turquoisestone_block",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TURQUOISE_CONCRETE = registerBlock("turquoise_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TURQUOISE_CONCRETE_POWDER = registerBlock("turquoise_concrete_powder",
            () -> new ConcretePowderBlock(HOWLITE_CONCRETE.get(), BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE_POWDER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TURQUOISE_SEA_LANTERN = registerBlock("turquoise_sea_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TURQUOISE_CANDLE = registerBlock("turquoise_candle",
            () -> new CandleBlock(BlockBehaviour.Properties.copy(Blocks.CANDLE)), ModTabs.FANSEKAI_TAB);
//    public static final RegistryObject<Block> TURQUOISE_CONCRETE_VIVID = registerBlock("turquoise_concrete_vivid",
//            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModTabs.FANSEKAI_TAB); -> no textures
    public static final RegistryObject<Block> TURQUOISE_GLAZED_TERRACOTTA = registerBlock("turquoise_glazed_terracotta",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
//    public static final RegistryObject<Block> TURQUOISE_GLAZED_TERRACOTTA_VIVID = registerBlock("turquoise_glazed_terracotta_vivid",
//            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB); -> no textures
    public static final RegistryObject<Block> TURQUOISE_PACKED_BLOCK = registerBlock("turquoise_packed_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TURQUOISE_PACKED_BLOCK_VIVID = registerBlock("turquoise_packed_block_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
//    public static final RegistryObject<Block> TURQUOISE_TERRACOTTA_VIVID = registerBlock("turquoise_terracotta_vivid",
//            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB); -> no textures
    public static final RegistryObject<Block> TURQUOISE_TERRACOTTA = registerBlock("turquoise_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TURQUOISE_WOOL = registerBlock("turquoise_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> TURQUOISE_TULIP = registerBlock("turquoise_tulip",
            () -> new FlowerBlock((Supplier<MobEffect>) null, 0, BlockBehaviour.Properties.copy(Blocks.ORANGE_TULIP)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> POTTED_TURQUOISE_TULIP = registerBlock("potted_turquoise_tulip",
            () -> new FlowerPotBlock(TURQUOISE_TULIP.get(), BlockBehaviour.Properties.copy(Blocks.POTTED_ORANGE_TULIP)), null);
    public static final RegistryObject<Block> TURQUOISE_CANDLE_CAKE = registerBlock("turquoise_candle_cake",
            () -> new CandleCakeBlock(TURQUOISE_CANDLE.get(), BlockBehaviour.Properties.copy(Blocks.CANDLE_CAKE)), null);
    public static final RegistryObject<Block> TURQUOISE_BLOSSOM =registerBlock("turquoise_blossom",
            () -> new SporeBlossomBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM)), ModTabs.FANSEKAI_TAB);

    //tiger

    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_ORE = registerBlock("pseudocrocidolite_ore",
            () -> new Ore(16750336), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_BLOCK = registerBlock("pseudocrocidolite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).explosionResistance(80f).strength(100f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_CLUSTER = registerBlock("pseudocrocidolite_cluster",
            () -> new AmethystClusterBlock(6, 4, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITESTONE_BLOCK = registerBlock("pseudocrocidolitestone_block",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_CONCRETE = registerBlock("pseudocrocidolite_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_CONCRETE_POWDER = registerBlock("pseudocrocidolite_concrete_powder",
            () -> new ConcretePowderBlock(HOWLITE_CONCRETE.get(), BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE_POWDER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_SEA_LANTERN = registerBlock("pseudocrocidolite_sea_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_CANDLE = registerBlock("pseudocrocidolite_candle",
            () -> new CandleBlock(BlockBehaviour.Properties.copy(Blocks.CANDLE)), ModTabs.FANSEKAI_TAB);
//    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_CONCRETE_VIVID = registerBlock("pseudocrocidolite_concrete_vivid",
//            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModTabs.FANSEKAI_TAB); -> no textures
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_GLAZED_TERRACOTTA = registerBlock("pseudocrocidolite_glazed_terracotta",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
//    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_GLAZED_TERRACOTTA_VIVID = registerBlock("pseudocrocidolite_glazed_terracotta_vivid",
//            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB); -> no textures
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_PACKED_BLOCK = registerBlock("pseudocrocidolite_packed_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_PACKED_BLOCK_VIVID = registerBlock("pseudocrocidolite_packed_block_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_TERRACOTTA_VIVID = registerBlock("pseudocrocidolite_terracotta_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_TERRACOTTA = registerBlock("pseudocrocidolite_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_WOOL = registerBlock("pseudocrocidolite_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_TULIP = registerBlock("pseudocrocidolite_tulip",
            () -> new FlowerBlock((Supplier<MobEffect>) null, 0, BlockBehaviour.Properties.copy(Blocks.ORANGE_TULIP)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> POTTED_PSEUDOCROCIDOLITE_TULIP = registerBlock("potted_pseudocrocidolite_tulip",
            () -> new FlowerPotBlock(PSEUDOCROCIDOLITE_TULIP.get(), BlockBehaviour.Properties.copy(Blocks.POTTED_ORANGE_TULIP)), null);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_CANDLE_CAKE = registerBlock("pseudocrocidolite_candle_cake",
            () -> new CandleCakeBlock(PSEUDOCROCIDOLITE_CANDLE.get(), BlockBehaviour.Properties.copy(Blocks.CANDLE_CAKE)), null);
    public static final RegistryObject<Block> PSEUDOCROCIDOLITE_BLOSSOM =registerBlock("pseudocrocidolite_blossom",
            () -> new SporeBlossomBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM)), ModTabs.FANSEKAI_TAB);

    //rabu

    public static final RegistryObject<Block> RHODONITE_ORE = registerBlock("rhodonite_ore",
            () -> new Ore(9167569), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_BLOCK = registerBlock("rhodonite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).explosionResistance(80f).strength(100f)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_CLUSTER = registerBlock("rhodonite_cluster",
            () -> new AmethystClusterBlock(6, 4, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITESTONE_BLOCK = registerBlock("rhodonitestone_block",
            () -> new PoweredBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_CONCRETE = registerBlock("rhodonite_concrete",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_CONCRETE_POWDER = registerBlock("rhodonite_concrete_powder",
            () -> new ConcretePowderBlock(HOWLITE_CONCRETE.get(), BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE_POWDER)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_SEA_LANTERN = registerBlock("rhodonite_sea_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SEA_LANTERN)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_CANDLE = registerBlock("rhodonite_candle",
            () -> new CandleBlock(BlockBehaviour.Properties.copy(Blocks.CANDLE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_CONCRETE_VIVID = registerBlock("rhodonite_concrete_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CYAN_CONCRETE)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_GLAZED_TERRACOTTA = registerBlock("rhodonite_glazed_terracotta",
            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
//    public static final RegistryObject<Block> RHODONITE_GLAZED_TERRACOTTA_VIVID = registerBlock("rhodonite_glazed_terracotta_vivid",
//            () -> new GlazedTerracottaBlock(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB); -> no textures
    public static final RegistryObject<Block> RHODONITE_PACKED_BLOCK = registerBlock("rhodonite_packed_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_PACKED_BLOCK_VIVID = registerBlock("rhodonite_packed_block_vivid",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), ModTabs.FANSEKAI_TAB);
//    public static final RegistryObject<Block> RHODONITE_TERRACOTTA_VIVID = registerBlock("rhodonite_terracotta_vivid",
//            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB); -> no textures
    public static final RegistryObject<Block> RHODONITE_TERRACOTTA = registerBlock("rhodonite_terracotta",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.TERRACOTTA)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_WOOL = registerBlock("rhodonite_wool",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LIGHT_BLUE_WOOL)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> RHODONITE_TULIP = registerBlock("rhodonite_tulip",
            () -> new FlowerBlock((Supplier<MobEffect>) null, 0, BlockBehaviour.Properties.copy(Blocks.ORANGE_TULIP)), ModTabs.FANSEKAI_TAB);
    public static final RegistryObject<Block> POTTED_RHODONITE_TULIP = registerBlock("potted_rhodonite_tulip",
            () -> new FlowerPotBlock(RHODONITE_TULIP.get(), BlockBehaviour.Properties.copy(Blocks.POTTED_ORANGE_TULIP)), null);
    public static final RegistryObject<Block> RHODONITE_CANDLE_CAKE = registerBlock("rhodonite_candle_cake",
            () -> new CandleCakeBlock(RHODONITE_CANDLE.get(), BlockBehaviour.Properties.copy(Blocks.CANDLE_CAKE)), null);
    public static final RegistryObject<Block> RHODONITE_BLOSSOM =registerBlock("rhodonite_blossom",
            () -> new SporeBlossomBlock(BlockBehaviour.Properties.copy(Blocks.SPORE_BLOSSOM)), ModTabs.FANSEKAI_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));}
    public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}
}
