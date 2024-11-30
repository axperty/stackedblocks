package com.axperty.stackedblocks.registry;

import com.axperty.stackedblocks.StackedBlocks;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegistry {

    // Stacked Stone Blocks
    public static final Block STACKED_STONE_BLOCKS = registerBlock("stacked_stone_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    // Stacked Cobblestone Blocks
    public static final Block STACKED_COBBLESTONE_BLOCKS = registerBlock("stacked_cobblestone_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));

    // Stacked Netherrack Blocks
    public static final Block STACKED_NETHERRACK_BLOCKS = registerBlock("stacked_netherrack_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));

    // Stacked Bricks
    public static final Block STACKED_BRICKS = registerBlock("stacked_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));

    // Stacked Melons
    public static final Block STACKED_MELONS = registerBlock("stacked_melons",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Stacked Pumpkins
    public static final Block STACKED_PUMPKINS = registerBlock("stacked_pumpkins",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Stacked Lapis Blocks
    public static final Block STACKED_LAPIS_BLOCKS = registerBlock("stacked_lapis_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));

    // Stacked Redstone Blocks
    public static final Block STACKED_REDSTONE_BLOCKS = registerBlock("stacked_redstone_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));

    // Stacked Coal Blocks
    public static final Block STACKED_COAL_BLOCKS = registerBlock("stacked_coal_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));

    // Stacked Iron Blocks
    public static final Block STACKED_IRON_BLOCKS = registerBlock("stacked_iron_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    // Stacked Gold Blocks
    public static final Block STACKED_GOLD_BLOCKS = registerBlock("stacked_gold_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));

    // Stacked Emerald Blocks
    public static final Block STACKED_EMERALD_BLOCKS = registerBlock("stacked_emerald_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));

    // Stacked Diamond Blocks
    public static final Block STACKED_DIAMOND_BLOCKS = registerBlock("stacked_diamond_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));

    // Stacked Netherite Blocks
    public static final Block STACKED_NETHERITE_BLOCKS = registerBlock("stacked_netherite_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));

    // Stacked Quartz Blocks
    public static final Block STACKED_QUARTZ_BLOCKS = registerBlock("stacked_quartz_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));

    // Stacked Oak Logs
    public static final Block STACKED_OAK_LOGS = registerBlock("stacked_oak_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Stacked Stripped Oak Logs
    public static final Block STACKED_STRIPPED_OAK_LOGS = registerBlock("stacked_stripped_oak_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    // Stacked Spruce Logs
    public static final Block STACKED_SPRUCE_LOGS = registerBlock("stacked_spruce_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));

    // Stacked Stripped Spruce Logs
    public static final Block STACKED_STRIPPED_SPRUCE_LOGS = registerBlock("stacked_stripped_spruce_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));

    // Stacked Birch Logs
    public static final Block STACKED_BIRCH_LOGS = registerBlock("stacked_birch_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));

    // Stacked Stripped Birch Logs
    public static final Block STACKED_STRIPPED_BIRCH_LOGS = registerBlock("stacked_stripped_birch_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));

    // Stacked Jungle Logs
    public static final Block STACKED_JUNGLE_LOGS = registerBlock("stacked_jungle_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));

    // Stacked Stripped Jungle Logs
    public static final Block STACKED_STRIPPED_JUNGLE_LOGS = registerBlock("stacked_stripped_jungle_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));

    // Stacked Acacia Logs
    public static final Block STACKED_ACACIA_LOGS = registerBlock("stacked_acacia_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));

    // Stacked Stripped Acacia Logs
    public static final Block STACKED_STRIPPED_ACACIA_LOGS = registerBlock("stacked_stripped_acacia_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));

    // Stacked Dark Oak Logs
    public static final Block STACKED_DARK_OAK_LOGS = registerBlock("stacked_dark_oak_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));

    // Stacked Stripped Dark Oak Logs
    public static final Block STACKED_STRIPPED_DARK_OAK_LOGS = registerBlock("stacked_stripped_dark_oak_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));

    // Stacked Mangrove Logs
    public static final Block STACKED_MANGROVE_LOGS = registerBlock("stacked_mangrove_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));

    // Stacked Stripped Mangrove Logs
    public static final Block STACKED_STRIPPED_MANGROVE_LOGS = registerBlock("stacked_stripped_mangrove_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));

    // Stacked Cherry Logs
    public static final Block STACKED_CHERRY_LOGS = registerBlock("stacked_cherry_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));

    // Stacked Stripped Cherry Logs
    public static final Block STACKED_STRIPPED_CHERRY_LOGS = registerBlock("stacked_stripped_cherry_logs",
            new Block(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));

    // Stacked Bamboo Blocks
    public static final Block STACKED_BAMBOO_BLOCKS = registerBlock("stacked_bamboo_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));

    // Stacked Stripped Bamboo Blocks
    public static final Block STACKED_STRIPPED_BAMBOO_BLOCKS = registerBlock("stacked_stripped_bamboo_blocks",
            new Block(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));

    // Stacked Crimson Logs
    public static final Block STACKED_CRIMSON_STEMS = registerBlock("stacked_crimson_stems",
            new Block(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));

    // Stacked Stripped Crimson Logs
    public static final Block STACKED_STRIPPED_CRIMSON_STEMS = registerBlock("stacked_stripped_crimson_stems",
            new Block(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));

    // Stacked Warped Logs
    public static final Block STACKED_WARPED_STEMS = registerBlock("stacked_warped_stems",
            new Block(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    // Stacked Stripped Warped Logs
    public static final Block STACKED_STRIPPED_WARPED_STEMS = registerBlock("stacked_stripped_warped_stems",
            new Block(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.tryParse(StackedBlocks.MODID + ":" + name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.tryParse(StackedBlocks.MODID + ":" + name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        StackedBlocks.LOGGER.info("Registering mod blocks for " + StackedBlocks.MODID);
    }
}
