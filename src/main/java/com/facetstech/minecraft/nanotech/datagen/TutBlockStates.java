package com.facetstech.minecraft.nanotech.datagen;


import com.facetstech.minecraft.nanotech.NanotechMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.facetstech.minecraft.nanotech.block.BlockRegistrar.*;

public class TutBlockStates extends BlockStateProvider {

    public TutBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, NanotechMod.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlock(MYSTERIOUS_ORE_OVERWORLD.get());
        simpleBlock(MYSTERIOUS_ORE_NETHER.get());
        simpleBlock(MYSTERIOUS_ORE_END.get());
        simpleBlock(MYSTERIOUS_ORE_DEEPSLATE.get());
    }

}
