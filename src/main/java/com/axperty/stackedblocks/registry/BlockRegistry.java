package com.axperty.stackedblocks.registry;

import com.axperty.stackedblocks.StackedBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(StackedBlocks.MOD_ID);

    // Stacked Stone Blocks
    public static final DeferredBlock<Block> STACKED_STONE_BLOCKS = BLOCKS.registerSimpleBlock("stacked_stone_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.WOOD));

    // Stacked Cobblestone Blocks
    public static final DeferredBlock<Block> STACKED_COBBLESTONE_BLOCKS = BLOCKS.registerSimpleBlock("stacked_cobblestone_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).mapColor(MapColor.WOOD));

    // Stacked Netherrack Blocks
    public static final DeferredBlock<Block> STACKED_NETHERRACK_BLOCKS = BLOCKS.registerSimpleBlock("stacked_netherrack_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).mapColor(MapColor.WOOD));

    // Stacked Bricks
    public static final DeferredBlock<Block> STACKED_BRICKS = BLOCKS.registerSimpleBlock("stacked_bricks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(MapColor.WOOD));

    // Stacked Melons
    public static final DeferredBlock<Block> STACKED_MELONS = BLOCKS.registerSimpleBlock("stacked_melons",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Pumpkins
    public static final DeferredBlock<Block> STACKED_PUMPKINS = BLOCKS.registerSimpleBlock("stacked_pumpkins",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Lapis Blocks
    public static final DeferredBlock<Block> STACKED_LAPIS_BLOCKS = BLOCKS.registerSimpleBlock("stacked_lapis_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Redstone Blocks
    public static final DeferredBlock<Block> STACKED_REDSTONE_BLOCKS = BLOCKS.registerSimpleBlock("stacked_redstone_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Coal Blocks
    public static final DeferredBlock<Block> STACKED_COAL_BLOCKS = BLOCKS.registerSimpleBlock("stacked_coal_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Iron Blocks
    public static final DeferredBlock<Block> STACKED_IRON_BLOCKS = BLOCKS.registerSimpleBlock("stacked_iron_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Gold Blocks
    public static final DeferredBlock<Block> STACKED_GOLD_BLOCKS = BLOCKS.registerSimpleBlock("stacked_gold_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Emerald Blocks
    public static final DeferredBlock<Block> STACKED_EMERALD_BLOCKS = BLOCKS.registerSimpleBlock("stacked_emerald_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Diamond Blocks
    public static final DeferredBlock<Block> STACKED_DIAMOND_BLOCKS = BLOCKS.registerSimpleBlock("stacked_diamond_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Netherite Blocks
    public static final DeferredBlock<Block> STACKED_NETHERITE_BLOCKS = BLOCKS.registerSimpleBlock("stacked_netherite_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Quartz Blocks
    public static final DeferredBlock<Block> STACKED_QUARTZ_BLOCKS = BLOCKS.registerSimpleBlock("stacked_quartz_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Oak Logs
    public static final DeferredBlock<Block> STACKED_OAK_LOGS = BLOCKS.registerSimpleBlock("stacked_oak_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Oak Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_OAK_LOGS = BLOCKS.registerSimpleBlock("stacked_stripped_oak_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Spruce Logs
    public static final DeferredBlock<Block> STACKED_SPRUCE_LOGS = BLOCKS.registerSimpleBlock("stacked_spruce_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Spruce Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_SPRUCE_LOGS = BLOCKS.registerSimpleBlock("stacked_stripped_spruce_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Birch Logs
    public static final DeferredBlock<Block> STACKED_BIRCH_LOGS = BLOCKS.registerSimpleBlock("stacked_birch_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Birch Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_BIRCH_LOGS = BLOCKS.registerSimpleBlock("stacked_stripped_birch_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Jungle Logs
    public static final DeferredBlock<Block> STACKED_JUNGLE_LOGS = BLOCKS.registerSimpleBlock("stacked_jungle_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Jungle Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_JUNGLE_LOGS = BLOCKS.registerSimpleBlock("stacked_stripped_jungle_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Acacia Logs
    public static final DeferredBlock<Block> STACKED_ACACIA_LOGS = BLOCKS.registerSimpleBlock("stacked_acacia_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Acacia Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_ACACIA_LOGS = BLOCKS.registerSimpleBlock("stacked_stripped_acacia_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Dark Oak Logs
    public static final DeferredBlock<Block> STACKED_DARK_OAK_LOGS = BLOCKS.registerSimpleBlock("stacked_dark_oak_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Dark Oak Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_DARK_OAK_LOGS = BLOCKS.registerSimpleBlock("stacked_stripped_dark_oak_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Mangrove Logs
    public static final DeferredBlock<Block> STACKED_MANGROVE_LOGS = BLOCKS.registerSimpleBlock("stacked_mangrove_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Mangrove Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_MANGROVE_LOGS = BLOCKS.registerSimpleBlock("stacked_stripped_mangrove_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Cherry Logs
    public static final DeferredBlock<Block> STACKED_CHERRY_LOGS = BLOCKS.registerSimpleBlock("stacked_cherry_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Cherry Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_CHERRY_LOGS = BLOCKS.registerSimpleBlock("stacked_stripped_cherry_logs",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Bamboo Blocks
    public static final DeferredBlock<Block> STACKED_BAMBOO_BLOCKS = BLOCKS.registerSimpleBlock("stacked_bamboo_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Stripped Bamboo Blocks
    public static final DeferredBlock<Block> STACKED_STRIPPED_BAMBOO_BLOCKS = BLOCKS.registerSimpleBlock("stacked_stripped_bamboo_blocks",
            BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Crimson Logs
    public static final DeferredBlock<Block> STACKED_CRIMSON_STEMS = BLOCKS.registerSimpleBlock("stacked_crimson_stems",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Crimson Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_CRIMSON_STEMS = BLOCKS.registerSimpleBlock("stacked_stripped_crimson_stems",
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Warped Logs
    public static final DeferredBlock<Block> STACKED_WARPED_STEMS = BLOCKS.registerSimpleBlock("stacked_warped_stems",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Warped Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_WARPED_STEMS = BLOCKS.registerSimpleBlock("stacked_stripped_warped_stems",
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).mapColor(MapColor.WOOD));

}
