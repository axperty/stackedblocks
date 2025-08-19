package com.axperty.stackedblocks;

import com.axperty.stackedblocks.registry.CreativeTabRegistry;
import com.axperty.stackedblocks.registry.BlockRegistry;
import com.axperty.stackedblocks.registry.ItemRegistry;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(StackedBlocks.MOD_ID)
public class StackedBlocks
{
    public static final String MOD_ID = "stackedblocks";
    private static final Logger LOGGER = LogUtils.getLogger();

    public StackedBlocks(IEventBus modEventBus, ModContainer modContainer)
    {
        BlockRegistry.BLOCKS.register(modEventBus);
        ItemRegistry.ITEMS.register(modEventBus);
        CreativeTabRegistry.CREATIVE_MODE_TABS.register(modEventBus);
    }
}
