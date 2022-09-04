package com.facetstech.minecraft.nanotech.item;

import com.facetstech.minecraft.nanotech.setup.ModSetup;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.facetstech.minecraft.nanotech.NanotechMod.MOD_ID;
import static com.facetstech.minecraft.nanotech.block.BlockRegistrar.*;

public class ModItemRegistrar {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);


    public static final RegistryObject<Item> ALLOY_KRATAREN = ITEMS.register(KratarenAlloyItem.LANG_KEY,() -> new KratarenAlloyItem());


    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.CREATIVE_TAB_NANOTECH);
    public static final RegistryObject<Item> RAW_MYSTERIOUS_CHUNK = ITEMS.register("raw_mysterious_chunk", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> MYSTERIOUS_INGOT = ITEMS.register("mysterious_ingot", () -> new Item(ITEM_PROPERTIES));

    public static final RegistryObject<Item> MYSTERIOUS_ORE_OVERWORLD_ITEM = fromBlock(MYSTERIOUS_ORE_OVERWORLD);

    public static final RegistryObject<Item> MYSTERIOUS_ORE_NETHER_ITEM = fromBlock(MYSTERIOUS_ORE_NETHER);
    public static final RegistryObject<Item> MYSTERIOUS_ORE_END_ITEM = fromBlock(MYSTERIOUS_ORE_END);
    public static final RegistryObject<Item> MYSTERIOUS_ORE_DEEPSLATE_ITEM = fromBlock(MYSTERIOUS_ORE_DEEPSLATE);


    public static void register(IEventBus eventBus) {
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(eventBus);

    }

    // Conveniance function: Take a RegistryObject<Block> and make a corresponding RegistryObject<Item> from it
    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
