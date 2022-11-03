package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider
{
    public ModRecipeProvider(DataGenerator generator)
    {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> recipeConsumer)
    {
        //Shaped Recipes
        ShapedRecipeBuilder.shaped(ModBlocks.TEST_BLOCK.get(), 1)
                .define('T', ModItems.TEST_INGOT.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .unlockedBy("has_test_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TEST_INGOT.get()).build()))
                .save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, ModBlocks.TEST_BLOCK.getId().getPath()));

        //Shapeless Recipes
        ShapelessRecipeBuilder.shapeless(ModItems.TEST_INGOT.get(), 9)
                .requires(ModBlocks.TEST_BLOCK.get())
                .unlockedBy("has_test_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.TEST_BLOCK.get()).build()))
                .save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, ModItems.TEST_INGOT.getId().getPath()));

        //Smelting Recipes
        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(ModBlocks.TEST_ORE.get()),
                ModItems.TEST_INGOT.get(),
                2f, 200)
                .unlockedBy("has_test_ore", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.TEST_ORE.get()).build()))
                .save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, ModBlocks.TEST_ORE.getId().getPath() + "_smelting"));
        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(ModBlocks.DEEPSLATE_TEST_ORE.get()),
                ModItems.TEST_INGOT.get(),
                2f, 200)
                .unlockedBy("has_deepslate_test_ore", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DEEPSLATE_TEST_ORE.get()).build()))
                .save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, ModBlocks.DEEPSLATE_TEST_ORE.getId().getPath() + "_smelting"));

        //Blasting Recipes
        SimpleCookingRecipeBuilder.blasting(
                Ingredient.of(ModBlocks.TEST_ORE.get()),
                ModItems.TEST_INGOT.get(),
                3f, 180)
                .unlockedBy("has_test_ore", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.TEST_ORE.get()).build()))
                .save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, ModBlocks.TEST_ORE.getId().getPath() + "_blasting"));
        SimpleCookingRecipeBuilder.blasting(
                Ingredient.of(ModBlocks.DEEPSLATE_TEST_ORE.get()),
                ModItems.TEST_INGOT.get(),
                3f, 180)
                .unlockedBy("has_deepslate_test_ore", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.DEEPSLATE_TEST_ORE.get()).build()))
                .save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, ModBlocks.DEEPSLATE_TEST_ORE.getId().getPath() + "_blasting"));
    }
}
