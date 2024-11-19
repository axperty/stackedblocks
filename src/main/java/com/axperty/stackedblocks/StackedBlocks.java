package com.axperty.stackedblocks;

import com.axperty.stackedblocks.block.BlockList;
import com.axperty.stackedblocks.registry.BlockRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StackedBlocks implements ModInitializer {
    public static final String MODID = "stackedblocks";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MODID, "group"));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("itemGroup.stackedblocks"))
                .icon(() -> new ItemStack(BlockList.STACKED_MELONS))
                .build());
        BlockRegistry.registerBlocks();
    }
}
