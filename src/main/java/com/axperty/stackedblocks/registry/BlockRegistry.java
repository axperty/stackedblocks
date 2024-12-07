package com.axperty.stackedblocks.registry;

import com.axperty.stackedblocks.StackedBlocks;
import com.axperty.stackedblocks.block.BlockList;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BlockRegistry {

    public static void registerBlocks() {

        BlockList.STACKED_STONE_BLOCKS = block("stacked_stone_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

        BlockList.STACKED_COBBLESTONE_BLOCKS = block("stacked_cobblestone_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.COBBLESTONE)));

        BlockList.STACKED_NETHERRACK_BLOCKS = block("stacked_netherrack_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));

        BlockList.STACKED_BRICKS = block("stacked_bricks",
                new Block(AbstractBlock.Settings.copy(Blocks.BRICKS)));

        BlockList.STACKED_MELONS = block("stacked_melons",
                new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

        BlockList.STACKED_PUMPKINS = block("stacked_pumpkins",
                new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

        BlockList.STACKED_LAPIS_BLOCKS = block("stacked_lapis_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));

        BlockList.STACKED_REDSTONE_BLOCKS = block("stacked_redstone_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));

        BlockList.STACKED_COAL_BLOCKS = block("stacked_coal_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));

        BlockList.STACKED_IRON_BLOCKS = block("stacked_iron_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

        BlockList.STACKED_GOLD_BLOCKS = block("stacked_gold_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));

        BlockList.STACKED_EMERALD_BLOCKS = block("stacked_emerald_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));

        BlockList.STACKED_DIAMOND_BLOCKS = block("stacked_diamond_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));

        BlockList.STACKED_NETHERITE_BLOCKS = block("stacked_netherite_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));

        BlockList.STACKED_QUARTZ_BLOCKS = block("stacked_quartz_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));

        BlockList.STACKED_OAK_LOGS = block("stacked_oak_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

        BlockList.STACKED_STRIPPED_OAK_LOGS = block("stacked_stripped_oak_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

        BlockList.STACKED_SPRUCE_LOGS = block("stacked_spruce_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));

        BlockList.STACKED_STRIPPED_SPRUCE_LOGS = block("stacked_stripped_spruce_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.SPRUCE_PLANKS)));

        BlockList.STACKED_BIRCH_LOGS = block("stacked_birch_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));

        BlockList.STACKED_STRIPPED_BIRCH_LOGS = block("stacked_stripped_birch_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.BIRCH_PLANKS)));

        BlockList.STACKED_JUNGLE_LOGS = block("stacked_jungle_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));

        BlockList.STACKED_STRIPPED_JUNGLE_LOGS = block("stacked_stripped_jungle_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.JUNGLE_PLANKS)));

        BlockList.STACKED_ACACIA_LOGS = block("stacked_acacia_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));

        BlockList.STACKED_STRIPPED_ACACIA_LOGS = block("stacked_stripped_acacia_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.ACACIA_PLANKS)));

        BlockList.STACKED_DARK_OAK_LOGS = block("stacked_dark_oak_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));

        BlockList.STACKED_STRIPPED_DARK_OAK_LOGS = block("stacked_stripped_dark_oak_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));

        BlockList.STACKED_MANGROVE_LOGS = block("stacked_mangrove_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));

        BlockList.STACKED_STRIPPED_MANGROVE_LOGS = block("stacked_stripped_mangrove_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS)));

        BlockList.STACKED_CHERRY_LOGS = block("stacked_cherry_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));

        BlockList.STACKED_STRIPPED_CHERRY_LOGS = block("stacked_stripped_cherry_logs",
                new Block(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)));

        BlockList.STACKED_BAMBOO_BLOCKS = block("stacked_bamboo_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));

        BlockList.STACKED_STRIPPED_BAMBOO_BLOCKS = block("stacked_stripped_bamboo_blocks",
                new Block(AbstractBlock.Settings.copy(Blocks.BAMBOO_PLANKS)));

        BlockList.STACKED_CRIMSON_STEMS = block("stacked_crimson_stems",
                new Block(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));

        BlockList.STACKED_STRIPPED_CRIMSON_STEMS = block("stacked_stripped_crimson_stems",
                new Block(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));

        BlockList.STACKED_WARPED_STEMS = block("stacked_warped_stems",
                new Block(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

        BlockList.STACKED_STRIPPED_WARPED_STEMS = block("stacked_stripped_warped_stems",
                new Block(AbstractBlock.Settings.copy(Blocks.WARPED_PLANKS)));

    }
    private static FabricBlockSettings blockSettings(float hardness, float resistance, BlockSoundGroup sound) {
        return FabricBlockSettings.create().strength(hardness, resistance).sounds(sound);
    }

    private static Block block(String name, Block block) {
        blockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(StackedBlocks.MODID, name), block);
    }

    private static Item blockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(StackedBlocks.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(StackedBlocks.GROUP).register(entries -> entries.add(item));
        return item;
    }

    private static Block withoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(StackedBlocks.MODID, name), block);
    }
}
