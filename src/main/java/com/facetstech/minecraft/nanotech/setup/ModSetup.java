package com.facetstech.minecraft.nanotech.setup;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

public class ModSetup {

    private static final Logger LOGGER = LogUtils.getLogger();


    public static final CreativeModeTab CREATIVE_TAB_NANOTECH = new CreativeModeNanotechTab();

    public static void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));
    }
}
