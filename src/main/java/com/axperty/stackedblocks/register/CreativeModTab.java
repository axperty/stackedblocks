package com.axperty.stackedblocks.register;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import com.axperty.stackedblocks.StackedBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class CreativeModTab {
    public static final ItemGroup CREATIVE_MODE_TAB = FabricItemGroupBuilder.build(
            new Identifier(StackedBlocks.MOD_ID, "creative_tab"), () -> new ItemStack(BlockRegistry.STACKED_MELONS));
}
