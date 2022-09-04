package com.facetstech.minecraft.nanotech.datagen;

import com.facetstech.minecraft.nanotech.NanotechMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import static com.facetstech.minecraft.nanotech.block.BlockRegistrar.*;

public class TutBlockTags extends BlockTagsProvider {

    public TutBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, NanotechMod.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(MYSTERIOUS_ORE_OVERWORLD.get())
                .add(MYSTERIOUS_ORE_NETHER.get())
                .add(MYSTERIOUS_ORE_END.get())
                .add(MYSTERIOUS_ORE_DEEPSLATE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(MYSTERIOUS_ORE_OVERWORLD.get())
                .add(MYSTERIOUS_ORE_NETHER.get())
                .add(MYSTERIOUS_ORE_END.get())
                .add(MYSTERIOUS_ORE_DEEPSLATE.get());
        tag(Tags.Blocks.ORES)
                .add(MYSTERIOUS_ORE_OVERWORLD.get())
                .add(MYSTERIOUS_ORE_NETHER.get())
                .add(MYSTERIOUS_ORE_END.get())
                .add(MYSTERIOUS_ORE_DEEPSLATE.get());

//        tag(MYSTERIOUS_ORE)
//                .add(MYSTERIOUS_ORE_OVERWORLD.get())
//                .add(MYSTERIOUS_ORE_NETHER.get())
//                .add(MYSTERIOUS_ORE_END.get())
//                .add(MYSTERIOUS_ORE_DEEPSLATE.get());
    }

    @Override
    public String getName() {
        return "Tutorial Tags";
    }
}
