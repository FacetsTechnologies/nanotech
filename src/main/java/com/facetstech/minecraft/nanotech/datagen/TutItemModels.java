package com.facetstech.minecraft.nanotech.datagen;

import com.facetstech.minecraft.nanotech.NanotechMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.facetstech.minecraft.nanotech.item.ModItemRegistrar.*;

public class TutItemModels extends ItemModelProvider {

    public TutItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, NanotechMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // 1.18.1 version
//        withExistingParent(MYSTERIOUS_ORE_OVERWORLD_ITEM.get().getRegistryName().getPath(), modLoc("block/mysterious_ore_overworld"));
        withExistingParent(MYSTERIOUS_ORE_OVERWORLD_ITEM.getId().getPath(), modLoc("block/mysterious_ore_overworld"));
        withExistingParent(MYSTERIOUS_ORE_NETHER_ITEM.getId().getPath(), modLoc("block/mysterious_ore_nether"));
        withExistingParent(MYSTERIOUS_ORE_END_ITEM.getId().getPath(), modLoc("block/mysterious_ore_end"));
        withExistingParent(MYSTERIOUS_ORE_DEEPSLATE_ITEM.getId().getPath(), modLoc("block/mysterious_ore_deepslate"));

    }
}
