package com.facetstech.minecraft.nanotech.datagen;


import com.facetstech.minecraft.nanotech.NanotechMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.facetstech.minecraft.nanotech.item.ModItemRegistrar.*;

public class TutItemTags extends ItemTagsProvider {

    public TutItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, NanotechMod.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.ORES)
                .add(MYSTERIOUS_ORE_OVERWORLD_ITEM.get())
                .add(MYSTERIOUS_ORE_NETHER_ITEM.get())
                .add(MYSTERIOUS_ORE_END_ITEM.get())
                .add(MYSTERIOUS_ORE_DEEPSLATE_ITEM.get());
        tag(Tags.Items.INGOTS)
                .add(MYSTERIOUS_INGOT.get());
//        tag(MYSTERIOUS_ORE_ITEM)
//                .add(MYSTERIOUS_ORE_OVERWORLD_ITEM.get())
//                .add(MYSTERIOUS_ORE_NETHER_ITEM.get())
//                .add(MYSTERIOUS_ORE_END_ITEM.get())
//                .add(MYSTERIOUS_ORE_DEEPSLATE_ITEM.get());
    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}
