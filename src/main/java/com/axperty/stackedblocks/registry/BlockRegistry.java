package com.axperty.stackedblocks.registry;

import com.axperty.stackedblocks.StackedBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, StackedBlocks.MOD_ID);

    // Stacked Stone Blocks
    public static final RegistryObject<Block> STACKED_STONE_BLOCKS = BLOCKS.register("stacked_stone_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.STONE).setId(BLOCKS.key("stacked_stone_blocks"))));

    // Stacked Cobblestone Blocks
    public static final RegistryObject<Block> STACKED_COBBLESTONE_BLOCKS = BLOCKS.register("stacked_cobblestone_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.COBBLESTONE).setId(BLOCKS.key("stacked_cobblestone_blocks"))));

    // Stacked Netherrack Blocks
    public static final RegistryObject<Block> STACKED_NETHERRACK_BLOCKS = BLOCKS.register("stacked_netherrack_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.NETHERRACK).setId(BLOCKS.key("stacked_netherrack_blocks"))));

    // Stacked Bricks
    public static final RegistryObject<Block> STACKED_BRICKS = BLOCKS.register("stacked_bricks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.BRICKS).setId(BLOCKS.key("stacked_bricks"))));

    // Stacked Lapis Blocks
    public static final RegistryObject<Block> STACKED_LAPIS_BLOCKS = BLOCKS.register("stacked_lapis_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.LAPIS_BLOCK).setId(BLOCKS.key("stacked_lapis_blocks"))));

    // Stacked Redstone Blocks
    public static final RegistryObject<Block> STACKED_REDSTONE_BLOCKS = BLOCKS.register("stacked_redstone_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK).setId(BLOCKS.key("stacked_redstone_blocks"))));

    // Stacked Coal Blocks
    public static final RegistryObject<Block> STACKED_COAL_BLOCKS = BLOCKS.register("stacked_coal_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.COAL_BLOCK).setId(BLOCKS.key("stacked_coal_blocks"))));

    // Stacked Iron Blocks
    public static final RegistryObject<Block> STACKED_IRON_BLOCKS = BLOCKS.register("stacked_iron_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.IRON_BLOCK).setId(BLOCKS.key("stacked_iron_blocks"))));

    // Stacked Gold Blocks
    public static final RegistryObject<Block> STACKED_GOLD_BLOCKS = BLOCKS.register("stacked_gold_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.GOLD_BLOCK).setId(BLOCKS.key("stacked_gold_blocks"))));

    // Stacked Emerald Blocks
    public static final RegistryObject<Block> STACKED_EMERALD_BLOCKS = BLOCKS.register("stacked_emerald_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.EMERALD_BLOCK).setId(BLOCKS.key("stacked_emerald_blocks"))));

    // Stacked Diamond Blocks
    public static final RegistryObject<Block> STACKED_DIAMOND_BLOCKS = BLOCKS.register("stacked_diamond_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK).setId(BLOCKS.key("stacked_diamond_blocks"))));

    // Stacked Netherite Blocks
    public static final RegistryObject<Block> STACKED_NETHERITE_BLOCKS = BLOCKS.register("stacked_netherite_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).setId(BLOCKS.key("stacked_netherite_blocks"))));

    // Stacked Quartz Blocks
    public static final RegistryObject<Block> STACKED_QUARTZ_BLOCKS = BLOCKS.register("stacked_quartz_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK).setId(BLOCKS.key("stacked_quartz_blocks"))));

    // Stacked Melons
    public static final RegistryObject<Block> STACKED_MELONS = BLOCKS.register("stacked_melons",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("stacked_melons"))));

    // Stacked Pumpkins
    public static final RegistryObject<Block> STACKED_PUMPKINS = BLOCKS.register("stacked_pumpkins",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.PUMPKIN).setId(BLOCKS.key("stacked_pumpkins"))));

    // Stacked Oak Logs
    public static final RegistryObject<Block> STACKED_OAK_LOGS = BLOCKS.register("stacked_oak_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("stacked_oak_logs"))));

    // Stacked Stripped Oak Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_OAK_LOGS = BLOCKS.register("stacked_stripped_oak_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.OAK_PLANKS).setId(BLOCKS.key("stacked_stripped_oak_logs"))));

    // Stacked Spruce Logs
    public static final RegistryObject<Block> STACKED_SPRUCE_LOGS = BLOCKS.register("stacked_spruce_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).setId(BLOCKS.key("stacked_spruce_logs"))));

    // Stacked Stripped Spruce Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_SPRUCE_LOGS = BLOCKS.register("stacked_stripped_spruce_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).setId(BLOCKS.key("stacked_stripped_spruce_logs"))));

    // Stacked Birch Logs
    public static final RegistryObject<Block> STACKED_BIRCH_LOGS = BLOCKS.register("stacked_birch_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).setId(BLOCKS.key("stacked_birch_logs"))));

    // Stacked Stripped Birch Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_BIRCH_LOGS = BLOCKS.register("stacked_stripped_birch_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).setId(BLOCKS.key("stacked_stripped_birch_logs"))));

    // Stacked Jungle Logs
    public static final RegistryObject<Block> STACKED_JUNGLE_LOGS = BLOCKS.register("stacked_jungle_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).setId(BLOCKS.key("stacked_jungle_logs"))));

    // Stacked Stripped Jungle Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_JUNGLE_LOGS = BLOCKS.register("stacked_stripped_jungle_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).setId(BLOCKS.key("stacked_stripped_jungle_logs"))));

    // Stacked Acacia Logs
    public static final RegistryObject<Block> STACKED_ACACIA_LOGS = BLOCKS.register("stacked_acacia_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).setId(BLOCKS.key("stacked_acacia_logs"))));

    // Stacked Stripped Acacia Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_ACACIA_LOGS = BLOCKS.register("stacked_stripped_acacia_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).setId(BLOCKS.key("stacked_stripped_acacia_logs"))));

    // Stacked Dark Oak Logs
    public static final RegistryObject<Block> STACKED_DARK_OAK_LOGS = BLOCKS.register("stacked_dark_oak_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).setId(BLOCKS.key("stacked_dark_oak_logs"))));

    // Stacked Stripped Dark Oak Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_DARK_OAK_LOGS = BLOCKS.register("stacked_stripped_dark_oak_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).setId(BLOCKS.key("stacked_stripped_dark_oak_logs"))));

    // Stacked Mangrove Logs
    public static final RegistryObject<Block> STACKED_MANGROVE_LOGS = BLOCKS.register("stacked_mangrove_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).setId(BLOCKS.key("stacked_mangrove_logs"))));

    // Stacked Stripped Mangrove Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_MANGROVE_LOGS = BLOCKS.register("stacked_stripped_mangrove_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).setId(BLOCKS.key("stacked_stripped_mangrove_logs"))));

    // Stacked Cherry Logs
    public static final RegistryObject<Block> STACKED_CHERRY_LOGS = BLOCKS.register("stacked_cherry_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).setId(BLOCKS.key("stacked_cherry_logs"))));

    // Stacked Stripped Cherry Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_CHERRY_LOGS = BLOCKS.register("stacked_stripped_cherry_logs",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).setId(BLOCKS.key("stacked_stripped_cherry_logs"))));

    // Stacked Bamboo Blocks
    public static final RegistryObject<Block> STACKED_BAMBOO_BLOCKS = BLOCKS.register("stacked_bamboo_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS).setId(BLOCKS.key("stacked_bamboo_blocks"))));

    // Stacked Stripped Bamboo Blocks
    public static final RegistryObject<Block> STACKED_STRIPPED_BAMBOO_BLOCKS = BLOCKS.register("stacked_stripped_bamboo_blocks",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS).setId(BLOCKS.key("stacked_stripped_bamboo_blocks"))));

    // Stacked Crimson Logs
    public static final RegistryObject<Block> STACKED_CRIMSON_STEMS = BLOCKS.register("stacked_crimson_stems",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).setId(BLOCKS.key("stacked_crimson_stems"))));

    // Stacked Stripped Crimson Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_CRIMSON_STEMS = BLOCKS.register("stacked_stripped_crimson_stems",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).setId(BLOCKS.key("stacked_stripped_crimson_stems"))));

    // Stacked Warped Logs
    public static final RegistryObject<Block> STACKED_WARPED_STEMS = BLOCKS.register("stacked_warped_stems",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.WARPED_PLANKS).setId(BLOCKS.key("stacked_warped_stems"))));

    // Stacked Stripped Warped Logs
    public static final RegistryObject<Block> STACKED_STRIPPED_WARPED_STEMS = BLOCKS.register("stacked_stripped_warped_stems",
            () -> new Block(Block.Properties.ofFullCopy(Blocks.WARPED_PLANKS).setId(BLOCKS.key("stacked_stripped_warped_stems"))));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
