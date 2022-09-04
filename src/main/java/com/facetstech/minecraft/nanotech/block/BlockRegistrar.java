package com.facetstech.minecraft.nanotech.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.facetstech.minecraft.nanotech.NanotechMod.MOD_ID;

public class BlockRegistrar {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);

    public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();

    public static final RegistryObject<Block> MYSTERIOUS_ORE_OVERWORLD = BLOCKS.register("mysterious_ore_overworld", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Block> MYSTERIOUS_ORE_NETHER = BLOCKS.register("mysterious_ore_nether", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Block> MYSTERIOUS_ORE_END = BLOCKS.register("mysterious_ore_end", () -> new Block(BLOCK_PROPERTIES));
    public static final RegistryObject<Block> MYSTERIOUS_ORE_DEEPSLATE = BLOCKS.register("mysterious_ore_deepslate", () -> new Block(BLOCK_PROPERTIES));

    public static void register(IEventBus eventBus) {
        // Register the Deferred Register to the mod event bus so items get registered
        BLOCKS.register(eventBus);

    }

}
