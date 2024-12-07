package com.axperty.stackedblocks.registry;

import com.axperty.stackedblocks.StackedBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StackedBlocks.MOD_ID);

    // Stacked Stone Blocks Item
    public static final RegistryObject<Item> STACKED_STONE_BLOCKS_ITEM = ITEMS.register("stacked_stone_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_STONE_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_stone_blocks")))
    );

    // Stacked Cobblestone Blocks Item
    public static final RegistryObject<Item> STACKED_COBBLESTONE_BLOCKS_ITEM = ITEMS.register("stacked_cobblestone_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_COBBLESTONE_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_cobblestone_blocks")))
    );

    // Stacked Netherrack Blocks Item
    public static final RegistryObject<Item> STACKED_NETHERRACK_BLOCK_ITEM = ITEMS.register("stacked_netherrack_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_NETHERRACK_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_netherrack_blocks")))
    );

    // Stacked Bricks Item
    public static final RegistryObject<Item> STACKED_BRICKS_ITEM = ITEMS.register("stacked_bricks",
            () -> new BlockItem(BlockRegistry.STACKED_BRICKS.get(), new Item.Properties().setId(ITEMS.key("stacked_bricks")))
    );

    // Stacked Resin Blocks Item
    public static final RegistryObject<Item> STACKED_RESIN_BLOCKS_ITEM = ITEMS.register("stacked_resin_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_RESIN_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_resin_blocks")))
    );

    // Stacked Resin Bricks Item
    public static final RegistryObject<Item> STACKED_RESIN_BRICKS_ITEM = ITEMS.register("stacked_resin_bricks",
            () -> new BlockItem(BlockRegistry.STACKED_RESIN_BRICKS.get(), new Item.Properties().setId(ITEMS.key("stacked_resin_bricks")))
    );

    // Stacked Melons Item
    public static final RegistryObject<Item> STACKED_MELONS_ITEM = ITEMS.register("stacked_melons",
            () -> new BlockItem(BlockRegistry.STACKED_MELONS.get(), new Item.Properties().setId(ITEMS.key("stacked_melons")))
    );

    // Stacked Pumpkins Item
    public static final RegistryObject<Item> STACKED_PUMPKINS_ITEM = ITEMS.register("stacked_pumpkins",
            () -> new BlockItem(BlockRegistry.STACKED_PUMPKINS.get(), new Item.Properties().setId(ITEMS.key("stacked_pumpkins")))
    );

    // Stacked Lapis Blocks Item
    public static final RegistryObject<Item> STACKED_LAPIS_BLOCKS_ITEM = ITEMS.register("stacked_lapis_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_LAPIS_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_lapis_blocks")))
    );

    // Stacked Redstone Blocks Item
    public static final RegistryObject<Item> STACKED_REDSTONE_BLOCKS_ITEM = ITEMS.register("stacked_redstone_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_REDSTONE_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_redstone_blocks")))
    );

    // Stacked Coal Blocks Item
    public static final RegistryObject<Item> STACKED_COAL_BLOCKS_ITEM = ITEMS.register("stacked_coal_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_COAL_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_coal_blocks")))
    );

    // Stacked Iron Blocks Item
    public static final RegistryObject<Item> STACKED_IRON_BLOCKS_ITEM = ITEMS.register("stacked_iron_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_IRON_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_iron_blocks")))
    );

    // Stacked Gold Blocks Item
    public static final RegistryObject<Item> STACKED_GOLD_BLOCKS_ITEM = ITEMS.register("stacked_gold_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_GOLD_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_gold_blocks")))
    );

    // Stacked Emerald Blocks Item
    public static final RegistryObject<Item> STACKED_EMERALD_BLOCKS_ITEM = ITEMS.register("stacked_emerald_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_EMERALD_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_emerald_blocks")))
    );

    // Stacked Diamond Blocks Item
    public static final RegistryObject<Item> STACKED_DIAMOND_BLOCKS_ITEM = ITEMS.register("stacked_diamond_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_DIAMOND_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_diamond_blocks")))
    );

    // Stacked Netherite Blocks Item
    public static final RegistryObject<Item> STACKED_NETHERITE_BLOCKS_ITEM = ITEMS.register("stacked_netherite_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_NETHERITE_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_netherite_blocks")))
    );

    // Stacked Quartz Blocks Item
    public static final RegistryObject<Item> STACKED_QUARTZ_BLOCKS_ITEM = ITEMS.register("stacked_quartz_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_QUARTZ_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_quartz_blocks")))
    );

    // Stacked Oak Logs Item
    public static final RegistryObject<Item> STACKED_OAK_LOGS_ITEM = ITEMS.register("stacked_oak_logs",
            () -> new BlockItem(BlockRegistry.STACKED_OAK_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_oak_logs")))
    );

    // Stacked Stripped Oak Logs Item
    public static final RegistryObject<Item> STACKED_STRIPPED_OAK_LOGS_ITEM = ITEMS.register("stacked_stripped_oak_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_OAK_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_stripped_oak_logs")))
    );

    // Stacked Spruce Logs Item
    public static final RegistryObject<Item> STACKED_SPRUCE_LOGS_ITEM = ITEMS.register("stacked_spruce_logs",
            () -> new BlockItem(BlockRegistry.STACKED_SPRUCE_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_spruce_logs")))
    );

    // Stacked Stripped Spruce Logs Item
    public static final RegistryObject<Item> STACKED_STRIPPED_SPRUCE_LOGS_ITEM = ITEMS.register("stacked_stripped_spruce_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_SPRUCE_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_stripped_spruce_logs")))
    );

    // Stacked Birch Logs Item
    public static final RegistryObject<Item> STACKED_BIRCH_LOGS_ITEM = ITEMS.register("stacked_birch_logs",
            () -> new BlockItem(BlockRegistry.STACKED_BIRCH_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_birch_logs")))
    );

    // Stacked Stripped Birch Logs Item
    public static final RegistryObject<Item> STACKED_STRIPPED_BIRCH_LOGS_ITEM = ITEMS.register("stacked_stripped_birch_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_BIRCH_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_stripped_birch_logs")))
    );

    // Stacked Jungle Logs Item
    public static final RegistryObject<Item> STACKED_JUNGLE_LOGS_ITEM = ITEMS.register("stacked_jungle_logs",
            () -> new BlockItem(BlockRegistry.STACKED_JUNGLE_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_jungle_logs")))
    );

    // Stacked Stripped Jungle Logs Item
    public static final RegistryObject<Item> STACKED_STRIPPED_JUNGLE_LOGS_ITEM = ITEMS.register("stacked_stripped_jungle_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_JUNGLE_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_stripped_jungle_logs")))
    );

    // Stacked Acacia Logs Item
    public static final RegistryObject<Item> STACKED_ACACIA_LOGS_ITEM = ITEMS.register("stacked_acacia_logs",
            () -> new BlockItem(BlockRegistry.STACKED_ACACIA_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_acacia_logs")))
    );

    // Stacked Stripped Acacia Logs Item
    public static final RegistryObject<Item> STACKED_STRIPPED_ACACIA_LOGS_ITEM = ITEMS.register("stacked_stripped_acacia_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_stripped_acacia_logs")))
    );

    // Stacked Dark Oak Logs Item
    public static final RegistryObject<Item> STACKED_DARK_OAK_LOGS_ITEM = ITEMS.register("stacked_dark_oak_logs",
            () -> new BlockItem(BlockRegistry.STACKED_DARK_OAK_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_dark_oak_logs")))
    );

    // Stacked Stripped Dark Oak Logs Item
    public static final RegistryObject<Item> STACKED_STRIPPED_DARK_OAK_LOGS_ITEM = ITEMS.register("stacked_stripped_dark_oak_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_DARK_OAK_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_stripped_dark_oak_logs")))
    );

    // Stacked Mangrove Logs Item
    public static final RegistryObject<Item> STACKED_MANGROVE_LOGS_ITEM = ITEMS.register("stacked_mangrove_logs",
            () -> new BlockItem(BlockRegistry.STACKED_MANGROVE_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_mangrove_logs")))
    );

    // Stacked Stripped Mangrove Logs Item
    public static final RegistryObject<Item> STACKED_STRIPPED_MANGROVE_LOGS_ITEM = ITEMS.register("stacked_stripped_mangrove_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_MANGROVE_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_stripped_mangrove_logs")))
    );

    // Stacked Cherry Logs Item
    public static final RegistryObject<Item> STACKED_CHERRY_LOGS_ITEM = ITEMS.register("stacked_cherry_logs",
            () -> new BlockItem(BlockRegistry.STACKED_CHERRY_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_cherry_logs")))
    );

    // Stacked Stripped Cherry Logs Item
    public static final RegistryObject<Item> STACKED_STRIPPED_CHERRY_LOGS_ITEM = ITEMS.register("stacked_stripped_cherry_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_CHERRY_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_stripped_cherry_logs")))
    );

    // Stacked Pale Oak Logs Item
    public static final RegistryObject<Item> STACKED_PALE_OAK_LOGS_ITEM = ITEMS.register("stacked_pale_oak_logs",
            () -> new BlockItem(BlockRegistry.STACKED_PALE_OAK_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_pale_oak_logs")))
    );

    // Stacked Stripped Pale Oak Logs Item
    public static final RegistryObject<Item> STACKED_STRIPPED_PALE_OAK_LOGS_ITEM = ITEMS.register("stacked_stripped_pale_oak_logs",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_PALE_OAK_LOGS.get(), new Item.Properties().setId(ITEMS.key("stacked_stripped_pale_oak_logs")))
    );

    // Stacked Bamboo Logs Item
    public static final RegistryObject<Item> STACKED_BAMBOO_BLOCKS_ITEM = ITEMS.register("stacked_bamboo_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_BAMBOO_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_bamboo_blocks")))
    );

    // Stacked Stripped Bamboo Logs Item
    public static final RegistryObject<Item> STACKED_STRIPPED_BAMBOO_BLOCKS_ITEM = ITEMS.register("stacked_stripped_bamboo_blocks",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_BAMBOO_BLOCKS.get(), new Item.Properties().setId(ITEMS.key("stacked_stripped_bamboo_blocks")))
    );

    // Stacked Crimson Logs Item
    public static final RegistryObject<Item> STACKED_CRIMSON_STEMS_ITEM = ITEMS.register("stacked_crimson_stems",
            () -> new BlockItem(BlockRegistry.STACKED_CRIMSON_STEMS.get(), new Item.Properties().setId(ITEMS.key("stacked_crimson_stems")))
    );

    // Stacked Stripped Crimson Logs Item
    public static final RegistryObject<Item> STACKED_STRIPPED_CRIMSON_STEMS_ITEM = ITEMS.register("stacked_stripped_crimson_stems",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_CRIMSON_STEMS.get(), new Item.Properties().setId(ITEMS.key("stacked_stripped_crimson_stems")))
    );

    // Stacked Warped Logs Item
    public static final RegistryObject<Item> STACKED_WARPED_STEMS_ITEM = ITEMS.register("stacked_warped_stems",
            () -> new BlockItem(BlockRegistry.STACKED_WARPED_STEMS.get(), new Item.Properties().setId(ITEMS.key("stacked_warped_stems")))
    );

    // Stacked Stripped Warped Logs Item
    public static final RegistryObject<Item> STACKED_STRIPPED_WARPED_STEMS_ITEM = ITEMS.register("stacked_stripped_warped_stems",
            () -> new BlockItem(BlockRegistry.STACKED_STRIPPED_WARPED_STEMS.get(), new Item.Properties().setId(ITEMS.key("stacked_stripped_warped_stems")))
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}