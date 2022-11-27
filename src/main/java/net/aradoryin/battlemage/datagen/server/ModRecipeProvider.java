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
        ShapedRecipeBuilder.shaped(ModBlocks.WIP_BLOCK.get(), 1)
                .define('T', ModItems.WIP_INGOT.get())
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .unlockedBy("has_wip_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.WIP_INGOT.get()).build()))
                .save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, ModBlocks.WIP_BLOCK.getId().getPath()));

        //Shapeless Recipes
        ShapelessRecipeBuilder.shapeless(ModItems.WIP_INGOT.get(), 9)
                .requires(ModBlocks.WIP_BLOCK.get())
                .unlockedBy("has_wip_block", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.WIP_BLOCK.get()).build()))
                .save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, ModItems.WIP_INGOT.getId().getPath()));

        //Smelting Recipes
        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(ModBlocks.ORE_WIP.get()),
                ModItems.WIP_INGOT.get(),
                2f, 200)
                .unlockedBy("has_wip_ore", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORE_WIP.get()).build()))
                .save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, ModBlocks.ORE_WIP.getId().getPath() + "_smelting"));
        SimpleCookingRecipeBuilder.smelting(
                Ingredient.of(ModBlocks.ORE_WIP_DEEPSLATE.get()),
                ModItems.WIP_INGOT.get(),
                2f, 200)
                .unlockedBy("has_wip_ore_deepslate", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORE_WIP_DEEPSLATE.get()).build()))
                .save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, ModBlocks.ORE_WIP_DEEPSLATE.getId().getPath() + "_smelting"));

        //Blasting Recipes
        SimpleCookingRecipeBuilder.blasting(
                Ingredient.of(ModBlocks.ORE_WIP.get()),
                ModItems.WIP_INGOT.get(),
                3f, 180)
                .unlockedBy("has_wip_ore", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORE_WIP.get()).build()))
                .save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, ModBlocks.ORE_WIP.getId().getPath() + "_blasting"));
        SimpleCookingRecipeBuilder.blasting(
                Ingredient.of(ModBlocks.ORE_WIP_DEEPSLATE.get()),
                ModItems.WIP_INGOT.get(),
                3f, 180)
                .unlockedBy("has_wip_ore_deepslate", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.ORE_WIP_DEEPSLATE.get()).build()))
                .save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, ModBlocks.ORE_WIP_DEEPSLATE.getId().getPath() + "_blasting"));
    }
}
