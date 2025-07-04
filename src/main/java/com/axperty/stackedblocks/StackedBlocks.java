package com.axperty.stackedblocks;

import com.axperty.stackedblocks.registry.BlockRegistry;
import com.axperty.stackedblocks.registry.CreativeTabRegistry;
import com.axperty.stackedblocks.registry.ItemRegistry;
import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(StackedBlocks.MOD_ID)
public class StackedBlocks {
    public static final String MOD_ID = "stackedblocks";
    public static final Logger LOGGER = LogUtils.getLogger();

    public StackedBlocks(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();
        BlockRegistry.BLOCKS.register(modBusGroup);
        ItemRegistry.ITEMS.register(modBusGroup);
        CreativeTabRegistry.CREATIVE_MODE_TABS.register(modBusGroup);
    }
}
