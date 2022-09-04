package com.facetstech.minecraft.nanotech.datagen;

import com.facetstech.minecraft.nanotech.NanotechMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.facetstech.minecraft.nanotech.block.BlockRegistrar.*;
import static com.facetstech.minecraft.nanotech.setup.CreativeModeNanotechTab.TAB_NAME;


public class TutLanguageProvider extends LanguageProvider {

    public TutLanguageProvider(DataGenerator gen, String locale) {
        super(gen, NanotechMod.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "Tutorial");

        add(MYSTERIOUS_ORE_OVERWORLD.get(), "Mysterious ore");
        add(MYSTERIOUS_ORE_NETHER.get(), "Mysterious ore");
        add(MYSTERIOUS_ORE_END.get(), "Mysterious ore");
        add(MYSTERIOUS_ORE_DEEPSLATE.get(), "Mysterious ore");


    }
}
