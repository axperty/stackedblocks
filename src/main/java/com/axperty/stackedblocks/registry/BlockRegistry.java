package com.axperty.stackedblocks.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.axperty.stackedblocks.StackedBlocks.MOD_ID;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);

    // Stacked Stone Blocks
    public static final DeferredBlock<Block> STACKED_STONE_BLOCKS = BLOCKS.registerBlock("stacked_stone_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STONE).mapColor(MapColor.WOOD));

    // Stacked Cobblestone Blocks
    public static final DeferredBlock<Block> STACKED_COBBLESTONE_BLOCKS = BLOCKS.registerBlock("stacked_cobblestone_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).mapColor(MapColor.WOOD));

    // Stacked Netherrack Blocks
    public static final DeferredBlock<Block> STACKED_NETHERRACK_BLOCKS = BLOCKS.registerBlock("stacked_netherrack_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK).mapColor(MapColor.WOOD));

    // Stacked Bricks
    public static final DeferredBlock<Block> STACKED_BRICKS = BLOCKS.registerBlock("stacked_bricks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS).mapColor(MapColor.WOOD));

    // Stacked Resin Blocks
    public static final DeferredBlock<Block> STACKED_RESIN_BLOCKS = BLOCKS.registerBlock("stacked_resin_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.RESIN_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Resin Bricks
    public static final DeferredBlock<Block> STACKED_RESIN_BRICKS = BLOCKS.registerBlock("stacked_resin_bricks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.RESIN_BRICKS).mapColor(MapColor.WOOD));

    // Stacked Melons
    public static final DeferredBlock<Block> STACKED_MELONS = BLOCKS.registerBlock("stacked_melons", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Pumpkins
    public static final DeferredBlock<Block> STACKED_PUMPKINS = BLOCKS.registerBlock("stacked_pumpkins", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Raw Iron Blocks
    public static final DeferredBlock<Block> STACKED_RAW_IRON_BLOCKS = BLOCKS.registerBlock("stacked_raw_iron_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Raw Gold Blocks
    public static final DeferredBlock<Block> STACKED_RAW_GOLD_BLOCKS = BLOCKS.registerBlock("stacked_raw_gold_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_GOLD_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Raw Copper Blocks
    public static final DeferredBlock<Block> STACKED_RAW_COPPER_BLOCKS = BLOCKS.registerBlock("stacked_raw_copper_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_COPPER_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Lapis Blocks
    public static final DeferredBlock<Block> STACKED_LAPIS_BLOCKS = BLOCKS.registerBlock("stacked_lapis_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Redstone Blocks
    public static final DeferredBlock<Block> STACKED_REDSTONE_BLOCKS = BLOCKS.registerBlock("stacked_redstone_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Coal Blocks
    public static final DeferredBlock<Block> STACKED_COAL_BLOCKS = BLOCKS.registerBlock("stacked_coal_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Iron Blocks
    public static final DeferredBlock<Block> STACKED_IRON_BLOCKS = BLOCKS.registerBlock("stacked_iron_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Gold Blocks
    public static final DeferredBlock<Block> STACKED_GOLD_BLOCKS = BLOCKS.registerBlock("stacked_gold_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Emerald Blocks
    public static final DeferredBlock<Block> STACKED_EMERALD_BLOCKS = BLOCKS.registerBlock("stacked_emerald_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Diamond Blocks
    public static final DeferredBlock<Block> STACKED_DIAMOND_BLOCKS = BLOCKS.registerBlock("stacked_diamond_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Netherite Blocks
    public static final DeferredBlock<Block> STACKED_NETHERITE_BLOCKS = BLOCKS.registerBlock("stacked_netherite_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Quartz Blocks
    public static final DeferredBlock<Block> STACKED_QUARTZ_BLOCKS = BLOCKS.registerBlock("stacked_quartz_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Oak Logs
    public static final DeferredBlock<Block> STACKED_OAK_LOGS = BLOCKS.registerBlock("stacked_oak_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Oak Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_OAK_LOGS = BLOCKS.registerBlock("stacked_stripped_oak_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Oak Planks
    public static final DeferredBlock<Block> STACKED_OAK_PLANKS = BLOCKS.registerBlock("stacked_oak_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Spruce Logs
    public static final DeferredBlock<Block> STACKED_SPRUCE_LOGS = BLOCKS.registerBlock("stacked_spruce_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Spruce Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_SPRUCE_LOGS = BLOCKS.registerBlock("stacked_stripped_spruce_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Spruce Planks
    public static final DeferredBlock<Block> STACKED_SPRUCE_PLANKS = BLOCKS.registerBlock("stacked_spruce_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Birch Logs
    public static final DeferredBlock<Block> STACKED_BIRCH_LOGS = BLOCKS.registerBlock("stacked_birch_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Birch Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_BIRCH_LOGS = BLOCKS.registerBlock("stacked_stripped_birch_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Birch Planks
    public static final DeferredBlock<Block> STACKED_BIRCH_PLANKS = BLOCKS.registerBlock("stacked_birch_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Jungle Logs
    public static final DeferredBlock<Block> STACKED_JUNGLE_LOGS = BLOCKS.registerBlock("stacked_jungle_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Jungle Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_JUNGLE_LOGS = BLOCKS.registerBlock("stacked_stripped_jungle_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Jungle Planks
    public static final DeferredBlock<Block> STACKED_JUNGLE_PLANKS = BLOCKS.registerBlock("stacked_jungle_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Acacia Logs
    public static final DeferredBlock<Block> STACKED_ACACIA_LOGS = BLOCKS.registerBlock("stacked_acacia_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Acacia Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_ACACIA_LOGS = BLOCKS.registerBlock("stacked_stripped_acacia_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Acacia Planks
    public static final DeferredBlock<Block> STACKED_ACACIA_PLANKS = BLOCKS.registerBlock("stacked_acacia_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Dark Oak Logs
    public static final DeferredBlock<Block> STACKED_DARK_OAK_LOGS = BLOCKS.registerBlock("stacked_dark_oak_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Dark Oak Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_DARK_OAK_LOGS = BLOCKS.registerBlock("stacked_stripped_dark_oak_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Dark Oak Planks
    public static final DeferredBlock<Block> STACKED_DARK_OAK_PLANKS = BLOCKS.registerBlock("stacked_dark_oak_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Mangrove Logs
    public static final DeferredBlock<Block> STACKED_MANGROVE_LOGS = BLOCKS.registerBlock("stacked_mangrove_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Mangrove Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_MANGROVE_LOGS = BLOCKS.registerBlock("stacked_stripped_mangrove_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Mangrove Planks
    public static final DeferredBlock<Block> STACKED_MANGROVE_PLANKS = BLOCKS.registerBlock("stacked_mangrove_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Cherry Logs
    public static final DeferredBlock<Block> STACKED_CHERRY_LOGS = BLOCKS.registerBlock("stacked_cherry_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Cherry Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_CHERRY_LOGS = BLOCKS.registerBlock("stacked_stripped_cherry_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Cherry Planks
    public static final DeferredBlock<Block> STACKED_CHERRY_PLANKS = BLOCKS.registerBlock("stacked_cherry_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Pale Oak Logs
    public static final DeferredBlock<Block> STACKED_PALE_OAK_LOGS = BLOCKS.registerBlock("stacked_pale_oak_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Pale Oak Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_PALE_OAK_LOGS = BLOCKS.registerBlock("stacked_stripped_pale_oak_logs", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Pale Oak Planks
    public static final DeferredBlock<Block> STACKED_PALE_OAK_PLANKS = BLOCKS.registerBlock("stacked_pale_oak_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Bamboo Blocks
    public static final DeferredBlock<Block> STACKED_BAMBOO_BLOCKS = BLOCKS.registerBlock("stacked_bamboo_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Stripped Bamboo Blocks
    public static final DeferredBlock<Block> STACKED_STRIPPED_BAMBOO_BLOCKS = BLOCKS.registerBlock("stacked_stripped_bamboo_blocks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Bamboo Planks
    public static final DeferredBlock<Block> STACKED_BAMBOO_PLANKS = BLOCKS.registerBlock("stacked_bamboo_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_BLOCK).mapColor(MapColor.WOOD));

    // Stacked Crimson Logs
    public static final DeferredBlock<Block> STACKED_CRIMSON_STEMS = BLOCKS.registerBlock("stacked_crimson_stems", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Crimson Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_CRIMSON_STEMS = BLOCKS.registerBlock("stacked_stripped_crimson_stems", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Crimson Planks
    public static final DeferredBlock<Block> STACKED_CRIMSON_PLANKS = BLOCKS.registerBlock("stacked_crimson_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Warped Logs
    public static final DeferredBlock<Block> STACKED_WARPED_STEMS = BLOCKS.registerBlock("stacked_warped_stems", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Stripped Warped Logs
    public static final DeferredBlock<Block> STACKED_STRIPPED_WARPED_STEMS = BLOCKS.registerBlock("stacked_stripped_warped_stems", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).mapColor(MapColor.WOOD));

    // Stacked Warped Planks
    public static final DeferredBlock<Block> STACKED_WARPED_PLANKS = BLOCKS.registerBlock("stacked_warped_planks", Block::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).mapColor(MapColor.WOOD));
}