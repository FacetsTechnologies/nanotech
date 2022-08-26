package com.facetstech.minecraft.nanotech.datagen;


import net.minecraft.data.DataGenerator;

import static com.facetstech.minecraft.nanotech.item.ModItemRegistrar.RAW_MYSTERIOUS_CHUNK;
import static com.facetstech.minecraft.nanotech.setup.Registrar.*;

public class TutLootTables extends BaseLootTableProvider {

    public TutLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

//    @Override
    protected void addTables() {
        lootTables.put(MYSTERIOUS_ORE_OVERWORLD.get(), createSilkTouchTable("mysterious_ore_overworld", MYSTERIOUS_ORE_OVERWORLD.get(), RAW_MYSTERIOUS_CHUNK.get(), 1, 3));
        lootTables.put(MYSTERIOUS_ORE_NETHER.get(), createSilkTouchTable("mysterious_ore_nether", MYSTERIOUS_ORE_NETHER.get(), RAW_MYSTERIOUS_CHUNK.get(), 1, 3));
        lootTables.put(MYSTERIOUS_ORE_END.get(), createSilkTouchTable("mysterious_ore_end", MYSTERIOUS_ORE_END.get(), RAW_MYSTERIOUS_CHUNK.get(), 1, 3));
        lootTables.put(MYSTERIOUS_ORE_DEEPSLATE.get(), createSilkTouchTable("mysterious_ore_deepslate", MYSTERIOUS_ORE_DEEPSLATE.get(), RAW_MYSTERIOUS_CHUNK.get(), 1, 3));
    }
}
