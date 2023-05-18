package net.aphyria.fansekai.block;

import net.aphyria.fansekai.FanSekai;
import net.aphyria.fansekai.item.ModItems;
import net.aphyria.fansekai.item.ModTabs;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FanSekai.MODID);

    public static final RegistryObject<Block> JAIDO_ORE = registerBlock("jaido_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(100f).strength(80f)), ModTabs.FANSEKAI_TAB);
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

    public static final RegistryObject<Block> JAIDO_BLOCK = registerBlock("jaido_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).explosionResistance(80f).strength(100f)), ModTabs.FANSEKAI_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));}
    public static void register(IEventBus eventBus){BLOCKS.register(eventBus);}
}
