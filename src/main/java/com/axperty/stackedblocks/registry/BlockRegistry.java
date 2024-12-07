package com.axperty.stackedblocks.registry;

import com.axperty.stackedblocks.StackedBlocks;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class BlockRegistry {

    // Stacked Stone Blocks
    public static final Block STACKED_STONE_BLOCKS = registerBlock("stacked_stone_blocks",
            Block::new, Block.Settings.copy(Blocks.STONE));

    // Stacked Cobblestone Blocks
    public static final Block STACKED_COBBLESTONE_BLOCKS = registerBlock("stacked_cobblestone_blocks",
            Block::new, Block.Settings.copy(Blocks.COBBLESTONE));

    // Stacked Netherrack Blocks
    public static final Block STACKED_NETHERRACK_BLOCKS = registerBlock("stacked_netherrack_blocks",
            Block::new, Block.Settings.copy(Blocks.NETHERRACK));

    // Stacked Bricks
    public static final Block STACKED_BRICKS = registerBlock("stacked_bricks",
            Block::new, Block.Settings.copy(Blocks.BRICKS));

    // Stacked Resin Blocks
    public static final Block STACKED_RESIN_BLOCKS = registerBlock("stacked_resin_blocks",
            Block::new, Block.Settings.copy(Blocks.RESIN_BLOCK));

    // Stacked Resin Bricks
    public static final Block STACKED_RESIN_BRICKS = registerBlock("stacked_resin_bricks",
            Block::new, Block.Settings.copy(Blocks.RESIN_BRICKS));

    // Stacked Melons
    public static final Block STACKED_MELONS = registerBlock("stacked_melons",
            Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    // Stacked Pumpkins
    public static final Block STACKED_PUMPKINS = registerBlock("stacked_pumpkins",
            Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    // Stacked Lapis Blocks
    public static final Block STACKED_LAPIS_BLOCKS = registerBlock("stacked_lapis_blocks",
            Block::new, Block.Settings.copy(Blocks.LAPIS_BLOCK));

    // Stacked Redstone Blocks
    public static final Block STACKED_REDSTONE_BLOCKS = registerBlock("stacked_redstone_blocks",
            Block::new, Block.Settings.copy(Blocks.REDSTONE_BLOCK));

    // Stacked Coal Blocks
    public static final Block STACKED_COAL_BLOCKS = registerBlock("stacked_coal_blocks",
            Block::new, Block.Settings.copy(Blocks.COAL_BLOCK));

    // Stacked Iron Blocks
    public static final Block STACKED_IRON_BLOCKS = registerBlock("stacked_iron_blocks",
            Block::new, Block.Settings.copy(Blocks.IRON_BLOCK));

    // Stacked Gold Blocks
    public static final Block STACKED_GOLD_BLOCKS = registerBlock("stacked_gold_blocks",
            Block::new, Block.Settings.copy(Blocks.GOLD_BLOCK));

    // Stacked Emerald Blocks
    public static final Block STACKED_EMERALD_BLOCKS = registerBlock("stacked_emerald_blocks",
            Block::new, Block.Settings.copy(Blocks.EMERALD_BLOCK));

    // Stacked Diamond Blocks
    public static final Block STACKED_DIAMOND_BLOCKS = registerBlock("stacked_diamond_blocks",
            Block::new, Block.Settings.copy(Blocks.DIAMOND_BLOCK));

    // Stacked Netherite Blocks
    public static final Block STACKED_NETHERITE_BLOCKS = registerBlock("stacked_netherite_blocks",
            Block::new, Block.Settings.copy(Blocks.NETHERITE_BLOCK));

    // Stacked Quartz Blocks
    public static final Block STACKED_QUARTZ_BLOCKS = registerBlock("stacked_quartz_blocks",
            Block::new, Block.Settings.copy(Blocks.QUARTZ_BLOCK));

    // Stacked Oak Logs
    public static final Block STACKED_OAK_LOGS = registerBlock("stacked_oak_logs",
            Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    // Stacked Stripped Oak Logs
    public static final Block STACKED_STRIPPED_OAK_LOGS = registerBlock("stacked_stripped_oak_logs",
            Block::new, Block.Settings.copy(Blocks.OAK_PLANKS));

    // Stacked Spruce Logs
    public static final Block STACKED_SPRUCE_LOGS = registerBlock("stacked_spruce_logs",
            Block::new, Block.Settings.copy(Blocks.SPRUCE_PLANKS));

    // Stacked Stripped Spruce Logs
    public static final Block STACKED_STRIPPED_SPRUCE_LOGS = registerBlock("stacked_stripped_spruce_logs",
            Block::new, Block.Settings.copy(Blocks.SPRUCE_PLANKS));

    // Stacked Birch Logs
    public static final Block STACKED_BIRCH_LOGS = registerBlock("stacked_birch_logs",
            Block::new, Block.Settings.copy(Blocks.BIRCH_PLANKS));

    // Stacked Stripped Birch Logs
    public static final Block STACKED_STRIPPED_BIRCH_LOGS = registerBlock("stacked_stripped_birch_logs",
            Block::new, Block.Settings.copy(Blocks.BIRCH_PLANKS));

    // Stacked Jungle Logs
    public static final Block STACKED_JUNGLE_LOGS = registerBlock("stacked_jungle_logs",
            Block::new, Block.Settings.copy(Blocks.JUNGLE_PLANKS));

    // Stacked Stripped Jungle Logs
    public static final Block STACKED_STRIPPED_JUNGLE_LOGS = registerBlock("stacked_stripped_jungle_logs",
            Block::new, Block.Settings.copy(Blocks.JUNGLE_PLANKS));

    // Stacked Acacia Logs
    public static final Block STACKED_ACACIA_LOGS = registerBlock("stacked_acacia_logs",
            Block::new, Block.Settings.copy(Blocks.ACACIA_PLANKS));

    // Stacked Stripped Acacia Logs
    public static final Block STACKED_STRIPPED_ACACIA_LOGS = registerBlock("stacked_stripped_acacia_logs",
            Block::new, Block.Settings.copy(Blocks.ACACIA_PLANKS));

    // Stacked Dark Oak Logs
    public static final Block STACKED_DARK_OAK_LOGS = registerBlock("stacked_dark_oak_logs",
            Block::new, Block.Settings.copy(Blocks.DARK_OAK_PLANKS));

    // Stacked Stripped Dark Oak Logs
    public static final Block STACKED_STRIPPED_DARK_OAK_LOGS = registerBlock("stacked_stripped_dark_oak_logs",
            Block::new, Block.Settings.copy(Blocks.DARK_OAK_PLANKS));

    // Stacked Mangrove Logs
    public static final Block STACKED_MANGROVE_LOGS = registerBlock("stacked_mangrove_logs",
            Block::new, Block.Settings.copy(Blocks.MANGROVE_PLANKS));

    // Stacked Stripped Mangrove Logs
    public static final Block STACKED_STRIPPED_MANGROVE_LOGS = registerBlock("stacked_stripped_mangrove_logs",
            Block::new, Block.Settings.copy(Blocks.MANGROVE_PLANKS));

    // Stacked Cherry Logs
    public static final Block STACKED_CHERRY_LOGS = registerBlock("stacked_cherry_logs",
            Block::new, Block.Settings.copy(Blocks.CHERRY_PLANKS));

    // Stacked Stripped Cherry Logs
    public static final Block STACKED_STRIPPED_CHERRY_LOGS = registerBlock("stacked_stripped_cherry_logs",
            Block::new, Block.Settings.copy(Blocks.CHERRY_PLANKS));

    // Stacked Pale Oak Logs
    public static final Block STACKED_PALE_OAK_LOGS = registerBlock("stacked_pale_oak_logs",
            Block::new, Block.Settings.copy(Blocks.PALE_OAK_PLANKS));

    // Stacked Stripped Pale Oak Logs
    public static final Block STACKED_STRIPPED_PALE_OAK_LOGS = registerBlock("stacked_stripped_pale_oak_logs",
            Block::new, Block.Settings.copy(Blocks.PALE_OAK_PLANKS));

    // Stacked Bamboo Blocks
    public static final Block STACKED_BAMBOO_BLOCKS = registerBlock("stacked_bamboo_blocks",
            Block::new, Block.Settings.copy(Blocks.BAMBOO_PLANKS));

    // Stacked Stripped Bamboo Blocks
    public static final Block STACKED_STRIPPED_BAMBOO_BLOCKS = registerBlock("stacked_stripped_bamboo_blocks",
            Block::new, Block.Settings.copy(Blocks.BAMBOO_PLANKS));

    // Stacked Crimson Logs
    public static final Block STACKED_CRIMSON_STEMS = registerBlock("stacked_crimson_stems",
            Block::new, Block.Settings.copy(Blocks.CRIMSON_PLANKS));

    // Stacked Stripped Crimson Logs
    public static final Block STACKED_STRIPPED_CRIMSON_STEMS = registerBlock("stacked_stripped_crimson_stems",
            Block::new, Block.Settings.copy(Blocks.CRIMSON_PLANKS));

    // Stacked Warped Logs
    public static final Block STACKED_WARPED_STEMS = registerBlock("stacked_warped_stems",
            Block::new, Block.Settings.copy(Blocks.WARPED_PLANKS));

    // Stacked Stripped Warped Logs
    public static final Block STACKED_STRIPPED_WARPED_STEMS = registerBlock("stacked_stripped_warped_stems",
            Block::new, Block.Settings.copy(Blocks.WARPED_PLANKS));

    private static Block registerBlock(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(StackedBlocks.MODID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);
        final Block block = Blocks.register(registryKey, factory, settings);
        registerItem(path, itemSettings -> new BlockItem(block, itemSettings), new Item.Settings());
        return block;
    }

    public static Item registerItem(String path, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(StackedBlocks.MODID, path));
        return Items.register(registryKey, factory, settings);
    }

    public static void registerModBlocks() {
        StackedBlocks.LOGGER.info("Registering mod blocks for " + StackedBlocks.MODID);
    }
}
