package com.axperty.stackedblocks.registry;

import com.axperty.stackedblocks.StackedBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StackedBlocks.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STACKEDBLOCKS_TAB = CREATIVE_MODE_TABS.register("stackedblocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(BlockRegistry.STACKED_MELONS.get()))
                    .title(Component.translatable("itemGroup.stackedblocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(BlockRegistry.STACKED_STONE_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_COBBLESTONE_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_NETHERRACK_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_BRICKS.get());
                        pOutput.accept(BlockRegistry.STACKED_MELONS.get());
                        pOutput.accept(BlockRegistry.STACKED_PUMPKINS.get());
                        pOutput.accept(BlockRegistry.STACKED_LAPIS_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_REDSTONE_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_COAL_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_IRON_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_GOLD_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_EMERALD_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_DIAMOND_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_NETHERITE_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_QUARTZ_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_OAK_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_STRIPPED_OAK_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_SPRUCE_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_STRIPPED_SPRUCE_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_BIRCH_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_STRIPPED_BIRCH_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_JUNGLE_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_STRIPPED_JUNGLE_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_ACACIA_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_STRIPPED_ACACIA_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_DARK_OAK_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_STRIPPED_DARK_OAK_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_MANGROVE_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_STRIPPED_MANGROVE_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_CHERRY_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_STRIPPED_CHERRY_LOGS.get());
                        pOutput.accept(BlockRegistry.STACKED_BAMBOO_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_STRIPPED_BAMBOO_BLOCKS.get());
                        pOutput.accept(BlockRegistry.STACKED_CRIMSON_STEMS.get());
                        pOutput.accept(BlockRegistry.STACKED_STRIPPED_CRIMSON_STEMS.get());
                        pOutput.accept(BlockRegistry.STACKED_WARPED_STEMS.get());
                        pOutput.accept(BlockRegistry.STACKED_STRIPPED_WARPED_STEMS.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
