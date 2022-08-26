package com.facetstech.minecraft.nanotech.item;

import net.minecraft.world.item.Item;

import static com.facetstech.minecraft.nanotech.setup.ModSetup.CREATIVE_TAB_NANOTECH;

public class KratarenAlloyItem extends Item {

    public static final String LANG_KEY = "alloy_krataren";

    private static final Item.Properties itemProps = new Item.Properties()
            .tab(CREATIVE_TAB_NANOTECH);

    public KratarenAlloyItem() {
        super(itemProps);
    }
}
