package com.axperty.stackedblocks.register;

import com.axperty.stackedblocks.StackedBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {

    // Stacked Stone Blocks
    public static final Block STACKED_STONE_BLOCKS = registerBlock("stacked_stone_blocks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Cobblestone Blocks
    public static final Block STACKED_COBBLESTONE_BLOCKS = registerBlock("stacked_cobblestone_blocks",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Netherrack Blocks
    public static final Block STACKED_NETHERRACK_BLOCKS = registerBlock("stacked_netherrack_blocks",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Bricks
    public static final Block STACKED_BRICKS = registerBlock("stacked_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Melons
    public static final Block STACKED_MELONS = registerBlock("stacked_melons",
            new Block(FabricBlockSettings.copyOf(Blocks.MELON)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Pumpkins
    public static final Block STACKED_PUMPKINS = registerBlock("stacked_pumpkins",
            new Block(FabricBlockSettings.copyOf(Blocks.PUMPKIN)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Oak Logs
    public static final Block STACKED_OAK_LOGS = registerBlock("stacked_oak_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Stripped Oak Logs
    public static final Block STACKED_STRIPPED_OAK_LOGS = registerBlock("stacked_stripped_oak_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Spruce Logs
    public static final Block STACKED_SPRUCE_LOGS = registerBlock("stacked_spruce_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Stripped Spruce Logs
    public static final Block STACKED_STRIPPED_SPRUCE_LOGS = registerBlock("stacked_stripped_spruce_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Birch Logs
    public static final Block STACKED_BIRCH_LOGS = registerBlock("stacked_birch_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Stripped Birch Logs
    public static final Block STACKED_STRIPPED_BIRCH_LOGS = registerBlock("stacked_stripped_birch_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Jungle Logs
    public static final Block STACKED_JUNGLE_LOGS = registerBlock("stacked_jungle_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Stripped Jungle Logs
    public static final Block STACKED_STRIPPED_JUNGLE_LOGS = registerBlock("stacked_stripped_jungle_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Acacia Logs
    public static final Block STACKED_ACACIA_LOGS = registerBlock("stacked_acacia_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Stripped Acacia Logs
    public static final Block STACKED_STRIPPED_ACACIA_LOGS = registerBlock("stacked_stripped_acacia_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Dark Oak Logs
    public static final Block STACKED_DARK_OAK_LOGS = registerBlock("stacked_dark_oak_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Stripped Dark Oak Logs
    public static final Block STACKED_STRIPPED_DARK_OAK_LOGS = registerBlock("stacked_stripped_dark_oak_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Mangrove Logs
    public static final Block STACKED_MANGROVE_LOGS = registerBlock("stacked_mangrove_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Stripped Mangrove Logs
    public static final Block STACKED_STRIPPED_MANGROVE_LOGS = registerBlock("stacked_stripped_mangrove_logs",
            new Block(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Crimson Logs
    public static final Block STACKED_CRIMSON_STEMS = registerBlock("stacked_crimson_stems",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Stripped Crimson Logs
    public static final Block STACKED_STRIPPED_CRIMSON_STEMS = registerBlock("stacked_stripped_crimson_stems",
            new Block(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Warped Logs
    public static final Block STACKED_WARPED_STEMS = registerBlock("stacked_warped_stems",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    // Stacked Stripped Warped Logs
    public static final Block STACKED_STRIPPED_WARPED_STEMS = registerBlock("stacked_stripped_warped_stems",
            new Block(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)), CreativeModTab.CREATIVE_MODE_TAB);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(StackedBlocks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(StackedBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        StackedBlocks.LOGGER.debug("Registering mod blocks for " + StackedBlocks.MOD_ID);
    }
}
