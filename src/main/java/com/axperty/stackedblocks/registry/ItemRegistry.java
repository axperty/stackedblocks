package com.axperty.stackedblocks.registry;

import com.axperty.stackedblocks.StackedBlocks;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StackedBlocks.MOD_ID);

    private static final Item.Properties DEFAULT_PROPS = new Item.Properties();

    // Stacked Stone Blocks
    public static final RegistryObject<Item> STACKED_STONE_BLOCKS_ITEM = ITEMS.register("stacked_stone_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_STONE_BLOCKS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Cobblestone Blocks
    public static final RegistryObject<Item> STACKED_COBBLESTONE_BLOCKS_ITEM = ITEMS.register("stacked_cobblestone_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_COBBLESTONE_BLOCKS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Netherrack Blocks
    public static final RegistryObject<Item> STACKED_NETHERRACK_BLOCKS_ITEM = ITEMS.register("stacked_netherrack_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_NETHERRACK_BLOCKS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Bricks
    public static final RegistryObject<Item> STACKED_BRICKS_ITEM = ITEMS.register("stacked_bricks",
            () -> new BlockItem(BlockRegistry.STACKED_BRICKS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Melons
    public static final RegistryObject<Item> STACKED_MELONS_ITEM = ITEMS.register("stacked_melons",
            () -> new BlockItem(BlockRegistry.STACKED_MELONS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Pumpkins
    public static final RegistryObject<Item> STACKED_PUMPKINS_ITEM = ITEMS.register("stacked_pumpkins",
            () -> new BlockItem(BlockRegistry.STACKED_PUMPKINS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Lapis Blocks
    public static final RegistryObject<Item> STACKED_LAPIS_BLOCKS_ITEM = ITEMS.register("stacked_lapis_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_LAPIS_BLOCKS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Redstone Blocks
    public static final RegistryObject<Item> STACKED_REDSTONE_BLOCKS_ITEM = ITEMS.register("stacked_redstone_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_REDSTONE_BLOCKS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Coal Blocks
    public static final RegistryObject<Item> STACKED_COAL_BLOCKS_ITEM = ITEMS.register("stacked_coal_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_COAL_BLOCKS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Iron Blocks
    public static final RegistryObject<Item> STACKED_IRON_BLOCKS_ITEM = ITEMS.register("stacked_iron_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_IRON_BLOCKS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Gold Blocks
    public static final RegistryObject<Item> STACKED_GOLD_BLOCKS_ITEM = ITEMS.register("stacked_gold_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_GOLD_BLOCKS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Emerald Blocks
    public static final RegistryObject<Item> STACKED_EMERALD_BLOCKS_ITEM = ITEMS.register("stacked_emerald_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_EMERALD_BLOCKS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Diamond Blocks
    public static final RegistryObject<Item> STACKED_DIAMOND_BLOCKS_ITEM = ITEMS.register("stacked_diamond_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_DIAMOND_BLOCKS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Netherite Blocks
    public static final RegistryObject<Item> STACKED_NETHERITE_BLOCKS_ITEM = ITEMS.register("stacked_netherite_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_NETHERITE_BLOCKS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Quartz Blocks
    public static final RegistryObject<Item> STACKED_QUARTZ_BLOCKS_ITEM = ITEMS.register("stacked_quartz_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_QUARTZ_BLOCKS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Oak Logs
    public static final RegistryObject<Item> STACKED_OAK_LOGS_ITEM = ITEMS.register("stacked_oak_logs",
            () -> new BlockItem(BlockRegistry.STACKED_OAK_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Stripped Oak Logs
    public static final RegistryObject<Item> STACKED_STRIPPED_OAK_LOGS_ITEM = ITEMS.register("stacked_stripped_oak_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_OAK_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Spruce Logs
    public static final RegistryObject<Item> STACKED_SPRUCE_LOGS_ITEM = ITEMS.register("stacked_spruce_logs",
            () -> new BlockItem(BlockRegistry.STACKED_SPRUCE_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Stripped Spruce Logs
    public static final RegistryObject<Item> STACKED_STRIPPED_SPRUCE_LOGS_ITEM = ITEMS.register("stacked_stripped_spruce_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_SPRUCE_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Birch Logs
    public static final RegistryObject<Item> STACKED_BIRCH_LOGS_ITEM = ITEMS.register("stacked_birch_logs",
            () -> new BlockItem(BlockRegistry.STACKED_BIRCH_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Stripped Birch Logs
    public static final RegistryObject<Item> STACKED_STRIPPED_BIRCH_LOGS_ITEM = ITEMS.register("stacked_stripped_birch_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_BIRCH_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Jungle Logs
    public static final RegistryObject<Item> STACKED_JUNGLE_LOGS_ITEM = ITEMS.register("stacked_jungle_logs",
            () -> new BlockItem(BlockRegistry.STACKED_JUNGLE_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Stripped Jungle Logs
    public static final RegistryObject<Item> STACKED_STRIPPED_JUNGLE_LOGS_ITEM = ITEMS.register("stacked_stripped_jungle_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_JUNGLE_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Acacia Logs
    public static final RegistryObject<Item> STACKED_ACACIA_LOGS_ITEM = ITEMS.register("stacked_acacia_logs",
            () -> new BlockItem(BlockRegistry.STACKED_ACACIA_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Stripped Acacia Logs
    public static final RegistryObject<Item> STACKED_STRIPPED_ACACIA_LOGS_ITEM = ITEMS.register("stacked_stripped_acacia_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Dark Oak Logs
    public static final RegistryObject<Item> STACKED_DARK_OAK_LOGS_ITEM = ITEMS.register("stacked_dark_oak_logs",
            () -> new BlockItem(BlockRegistry.STACKED_DARK_OAK_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Stripped Dark Oak Logs
    public static final RegistryObject<Item> STACKED_STRIPPED_DARK_OAK_LOGS_ITEM = ITEMS.register("stacked_stripped_dark_oak_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_DARK_OAK_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Mangrove Logs
    public static final RegistryObject<Item> STACKED_MANGROVE_LOGS_ITEM = ITEMS.register("stacked_mangrove_logs",
            () -> new BlockItem(BlockRegistry.STACKED_MANGROVE_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Stripped Mangrove Logs
    public static final RegistryObject<Item> STACKED_STRIPPED_MANGROVE_LOGS_ITEM = ITEMS.register("stacked_stripped_mangrove_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_MANGROVE_LOGS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Crimson Logs
    public static final RegistryObject<Item> STACKED_CRIMSON_STEMS_ITEM = ITEMS.register("stacked_crimson_stems",
            () -> new BlockItem(BlockRegistry.STACKED_CRIMSON_STEMS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Stripped Crimson Logs
    public static final RegistryObject<Item> STACKED_STRIPPED_CRIMSON_STEMS_ITEM = ITEMS.register("stacked_stripped_crimson_stems",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_CRIMSON_STEMS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Warped Logs
    public static final RegistryObject<Item> STACKED_WARPED_STEMS_ITEM = ITEMS.register("stacked_warped_stems",
            () -> new BlockItem(BlockRegistry.STACKED_WARPED_STEMS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    // Stacked Stripped Warped Logs
    public static final RegistryObject<Item> STACKED_STRIPPED_WARPED_STEMS_ITEM = ITEMS.register("stacked_stripped_warped_stems",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_WARPED_STEMS.get(), new Item.Properties().tab(StackedBlocks.ITEM_GROUP)));

    private static Item.Properties addToTabIfLoaded(Item.Properties properties, String modId) {
        return ModList.get().isLoaded(modId) ? properties.tab(StackedBlocks.ITEM_GROUP) : properties;
    }
}
