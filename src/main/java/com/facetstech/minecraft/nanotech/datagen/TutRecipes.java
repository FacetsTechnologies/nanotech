package com.facetstech.minecraft.nanotech.datagen;


import com.facetstech.minecraft.nanotech.setup.Registrar;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

import static com.facetstech.minecraft.nanotech.setup.Registrar.*;

public class TutRecipes extends RecipeProvider {

    public TutRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

//        ShapedRecipeBuilder.shaped(GENERATOR.get())
//                .pattern("mxm")
//                .pattern("x#x")
//                .pattern("#x#")
//                .define('x', Tags.Items.GEMS_DIAMOND)
//                .define('#', Tags.Items.INGOTS_IRON)
//                .define('m', MYSTERIOUS_INGOT.get())
//                .group("tutorialv3")
//                .unlockedBy("mysterious", InventoryChangeTrigger.TriggerInstance.hasItems(MYSTERIOUS_INGOT.get()))
//                .save(consumer);
//        ShapedRecipeBuilder.shaped(POWERGEN.get())
//                .pattern("mmm")
//                .pattern("x#x")
//                .pattern("#x#")
//                .define('x', Tags.Items.DUSTS_REDSTONE)
//                .define('#', Tags.Items.INGOTS_IRON)
//                .define('m', MYSTERIOUS_INGOT.get())
//                .group("tutorialv3")
//                .unlockedBy("mysterious", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.MYSTERIOUS_INGOT.get()))
//                .save(consumer);

    }

}
