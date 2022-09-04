package com.facetstech.minecraft.nanotech.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class CreativeModeNanotechTab extends CreativeModeTab {

    public static final String TAB_NAME = "Nanotech Mod";

    public static final String TAB_NAME_LANG_KEY = "nanotechtab";

    public CreativeModeNanotechTab() {
        super(TAB_NAME_LANG_KEY);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.AMETHYST_CLUSTER);
    }

}
