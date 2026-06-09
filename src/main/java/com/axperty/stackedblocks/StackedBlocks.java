package com.axperty.stackedblocks;

import com.axperty.stackedblocks.registry.CreativeTabRegistry;
import com.axperty.stackedblocks.registry.BlockRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackedBlocks implements ModInitializer {
    public static final String MOD_ID = "stackedblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        CreativeTabRegistry.registerItemGroups();
        BlockRegistry.registerModBlocks();
        LOGGER.info("Stacked Blocks loaded");
    }
}
