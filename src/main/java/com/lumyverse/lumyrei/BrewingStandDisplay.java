package com.lumyverse.lumyrei;

import com.cobblemon.mod.common.item.crafting.brewingstand.BrewingStandRecipe;

import me.shedaniel.rei.plugin.common.displays.brewing.DefaultBrewingDisplay;
import net.minecraft.recipe.RecipeEntry;

public class BrewingStandDisplay extends DefaultBrewingDisplay {
    public BrewingStandDisplay(RecipeEntry<BrewingStandRecipe> recipeEntry) {
        super(
                recipeEntry.value().getBottle(), // Base Potion
                recipeEntry.value().getInput(), // Potion Ingredient
                recipeEntry.value().getResult() // Result
        );
    }
}