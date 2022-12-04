package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

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
        storageBlockRecipe(recipeConsumer, ModItems.WIP_INGOT.get(), ModBlocks.WIP_BLOCK.get(), ModBlocks.WIP_BLOCK.getId().getPath());

        //Shapeless Recipes
        shapelessRecipe(recipeConsumer, ModItems.WIP_INGOT.get(), 9, ModItems.WIP_INGOT.getId().getPath(),
                ModBlocks.WIP_BLOCK.get());

        //Smelting Recipes
        //WIP ORES
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_WIP.get(), ModItems.GEODE_WIP.get(), 2f, 200,
                ModBlocks.ORE_WIP.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_WIP_DEEPSLATE.get(), ModItems.GEODE_WIP.get(), 2f, 200,
                ModBlocks.ORE_WIP_DEEPSLATE.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_WIP.get(), ModItems.GEODE_WIP.get(), 2f, 200,
                ModBlocks.ORE_WIP.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_WIP_DEEPSLATE.get(), ModItems.GEODE_WIP.get(), 2f, 200,
                ModBlocks.ORE_WIP_DEEPSLATE.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModItems.GEODE_WIP.get(), ModItems.WIP_INGOT.get(), 1f, 200,
                ModItems.GEODE_WIP.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModItems.GEODE_WIP.get(), ModItems.WIP_INGOT.get(), 1f, 200,
                ModItems.GEODE_WIP.getId().getPath());
        //GEM ORES
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_AMETHYST.get(), ModItems.GEODE_AMETHYST.get(), 1f, 200,
                ModBlocks.ORE_AMETHYST.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_CITRINE.get(), ModItems.GEODE_CITRINE.get(), 1f, 200,
                ModBlocks.ORE_CITRINE.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_DIAMOND.get(), ModItems.GEODE_DIAMOND.get(), 1f, 200,
                ModBlocks.ORE_DIAMOND.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_EMERALD.get(), ModItems.GEODE_EMERALD.get(), 1f, 200,
                ModBlocks.ORE_EMERALD.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_ONYX.get(), ModItems.GEODE_ONYX.get(), 1f, 200,
                ModBlocks.ORE_ONYX.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_OPAL.get(), ModItems.GEODE_OPAL.get(), 1f, 200,
                ModBlocks.ORE_OPAL.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_QUARTZ.get(), ModItems.GEODE_QUARTZ.get(), 1f, 200,
                ModBlocks.ORE_QUARTZ.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_RUBY.get(), ModItems.GEODE_RUBY.get(), 1f, 200,
                ModBlocks.ORE_RUBY.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_SAPPHIRE.get(), ModItems.GEODE_SAPPHIRE.get(), 1f, 200,
                ModBlocks.ORE_SAPPHIRE.getId().getPath());
        //GEM ORES DEEPSLATE VARIANT
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_AMETHYST_DEEPSLATE.get(), ModItems.GEODE_AMETHYST.get(), 1f, 200,
                ModBlocks.ORE_AMETHYST_DEEPSLATE.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_CITRINE_DEEPSLATE.get(), ModItems.GEODE_CITRINE.get(), 1f, 200,
                ModBlocks.ORE_CITRINE_DEEPSLATE.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_DIAMOND_DEEPSLATE.get(), ModItems.GEODE_DIAMOND.get(), 1f, 200,
                ModBlocks.ORE_DIAMOND_DEEPSLATE.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_EMERALD_DEEPSLATE.get(), ModItems.GEODE_EMERALD.get(), 1f, 200,
                ModBlocks.ORE_EMERALD_DEEPSLATE.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_ONYX_DEEPSLATE.get(), ModItems.GEODE_ONYX.get(), 1f, 200,
                ModBlocks.ORE_ONYX_DEEPSLATE.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_OPAL_DEEPSLATE.get(), ModItems.GEODE_OPAL.get(), 1f, 200,
                ModBlocks.ORE_OPAL_DEEPSLATE.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_QUARTZ_DEEPSLATE.get(), ModItems.GEODE_QUARTZ.get(), 1f, 200,
                ModBlocks.ORE_QUARTZ_DEEPSLATE.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_RUBY_DEEPSLATE.get(), ModItems.GEODE_RUBY.get(), 1f, 200,
                ModBlocks.ORE_RUBY_DEEPSLATE.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModBlocks.ORE_SAPPHIRE_DEEPSLATE.get(), ModItems.GEODE_SAPPHIRE.get(), 1f, 200,
                ModBlocks.ORE_SAPPHIRE_DEEPSLATE.getId().getPath());
        //GEM GEODES
        simpleSmeltingRecipe(recipeConsumer, ModItems.GEODE_AMETHYST.get(), ModItems.GEM_AMETHYST_UNCUT.get(), 1f, 200,
                ModItems.GEODE_AMETHYST.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModItems.GEODE_CITRINE.get(), ModItems.GEM_CITRINE_UNCUT.get(), 1f, 200,
                ModItems.GEODE_CITRINE.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModItems.GEODE_DIAMOND.get(), ModItems.GEM_DIAMOND_UNCUT.get(), 1f, 200,
                ModItems.GEODE_DIAMOND.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModItems.GEODE_EMERALD.get(), ModItems.GEM_EMERALD_UNCUT.get(), 1f, 200,
                ModItems.GEODE_EMERALD.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModItems.GEODE_ONYX.get(), ModItems.GEM_ONYX_UNCUT.get(), 1f, 200,
                ModItems.GEODE_ONYX.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModItems.GEODE_OPAL.get(), ModItems.GEM_OPAL_UNCUT.get(), 1f, 200,
                ModItems.GEODE_OPAL.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModItems.GEODE_QUARTZ.get(), ModItems.GEM_QUARTZ_UNCUT.get(), 1f, 200,
                ModItems.GEODE_QUARTZ.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModItems.GEODE_RUBY.get(), ModItems.GEM_RUBY_UNCUT.get(), 1f, 200,
                ModItems.GEODE_RUBY.getId().getPath());
        simpleSmeltingRecipe(recipeConsumer, ModItems.GEODE_SAPPHIRE.get(), ModItems.GEM_SAPPHIRE_UNCUT.get(), 1f, 200,
                ModItems.GEODE_SAPPHIRE.getId().getPath());

        //Blasting Recipes
        //GEM ORE
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_AMETHYST.get(), ModItems.GEODE_AMETHYST.get(), 1f, 200,
                ModBlocks.ORE_AMETHYST.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_CITRINE.get(), ModItems.GEODE_CITRINE.get(), 1f, 200,
                ModBlocks.ORE_CITRINE.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_DIAMOND.get(), ModItems.GEODE_DIAMOND.get(), 1f, 200,
                ModBlocks.ORE_DIAMOND.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_EMERALD.get(), ModItems.GEODE_EMERALD.get(), 1f, 200,
                ModBlocks.ORE_EMERALD.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_ONYX.get(), ModItems.GEODE_ONYX.get(), 1f, 200,
                ModBlocks.ORE_ONYX.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_OPAL.get(), ModItems.GEODE_OPAL.get(), 1f, 200,
                ModBlocks.ORE_OPAL.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_QUARTZ.get(), ModItems.GEODE_QUARTZ.get(), 1f, 200,
                ModBlocks.ORE_QUARTZ.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_RUBY.get(), ModItems.GEODE_RUBY.get(), 1f, 200,
                ModBlocks.ORE_RUBY.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_SAPPHIRE.get(), ModItems.GEODE_SAPPHIRE.get(), 1f, 200,
                ModBlocks.ORE_SAPPHIRE.getId().getPath());
        //GEM ORES DEEPSLATE VARIANT
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_AMETHYST_DEEPSLATE.get(), ModItems.GEODE_AMETHYST.get(), 1f, 200,
                ModBlocks.ORE_AMETHYST_DEEPSLATE.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_CITRINE_DEEPSLATE.get(), ModItems.GEODE_CITRINE.get(), 1f, 200,
                ModBlocks.ORE_CITRINE_DEEPSLATE.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_DIAMOND_DEEPSLATE.get(), ModItems.GEODE_DIAMOND.get(), 1f, 200,
                ModBlocks.ORE_DIAMOND_DEEPSLATE.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_EMERALD_DEEPSLATE.get(), ModItems.GEODE_EMERALD.get(), 1f, 200,
                ModBlocks.ORE_EMERALD_DEEPSLATE.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_ONYX_DEEPSLATE.get(), ModItems.GEODE_ONYX.get(), 1f, 200,
                ModBlocks.ORE_ONYX_DEEPSLATE.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_OPAL_DEEPSLATE.get(), ModItems.GEODE_OPAL.get(), 1f, 200,
                ModBlocks.ORE_OPAL_DEEPSLATE.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_QUARTZ_DEEPSLATE.get(), ModItems.GEODE_QUARTZ.get(), 1f, 200,
                ModBlocks.ORE_QUARTZ_DEEPSLATE.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_RUBY_DEEPSLATE.get(), ModItems.GEODE_RUBY.get(), 1f, 200,
                ModBlocks.ORE_RUBY_DEEPSLATE.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModBlocks.ORE_SAPPHIRE_DEEPSLATE.get(), ModItems.GEODE_SAPPHIRE.get(), 1f, 200,
                ModBlocks.ORE_SAPPHIRE_DEEPSLATE.getId().getPath());
        //GEM GEODES
        simpleBlastingRecipe(recipeConsumer, ModItems.GEODE_AMETHYST.get(), ModItems.GEM_AMETHYST_UNCUT.get(), 1f, 200,
                ModItems.GEODE_AMETHYST.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModItems.GEODE_CITRINE.get(), ModItems.GEM_CITRINE_UNCUT.get(), 1f, 200,
                ModItems.GEODE_CITRINE.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModItems.GEODE_DIAMOND.get(), ModItems.GEM_DIAMOND_UNCUT.get(), 1f, 200,
                ModItems.GEODE_DIAMOND.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModItems.GEODE_EMERALD.get(), ModItems.GEM_EMERALD_UNCUT.get(), 1f, 200,
                ModItems.GEODE_EMERALD.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModItems.GEODE_ONYX.get(), ModItems.GEM_ONYX_UNCUT.get(), 1f, 200,
                ModItems.GEODE_ONYX.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModItems.GEODE_OPAL.get(), ModItems.GEM_OPAL_UNCUT.get(), 1f, 200,
                ModItems.GEODE_OPAL.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModItems.GEODE_QUARTZ.get(), ModItems.GEM_QUARTZ_UNCUT.get(), 1f, 200,
                ModItems.GEODE_QUARTZ.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModItems.GEODE_RUBY.get(), ModItems.GEM_RUBY_UNCUT.get(), 1f, 200,
                ModItems.GEODE_RUBY.getId().getPath());
        simpleBlastingRecipe(recipeConsumer, ModItems.GEODE_SAPPHIRE.get(), ModItems.GEM_SAPPHIRE_UNCUT.get(), 1f, 200,
                ModItems.GEODE_SAPPHIRE.getId().getPath());
    }

    /**
     * This method is used to create blasting recipes using only 1-2 lines (depending on spacing). It takes a Recipe Consumer
     * in the form of recipeConsumer, an ItemLike input which converts into an Ingredient.of(input), an ItemLike output which
     * is used to identify the output, float experience which is used to identify how much to reward the player for taking out
     * the output, int cookingTime which is used to identify how long the input cooks for, String inputLocation for use in the
     * unlockedBy and ResourceLocation. The format to use is as follows:
     * @param recipeConsumer recipeConsumer
     * @param input ModBlocks.ORE_WIP.get()
     * @param output ModItems.WIP_INGOT.get()
     * @param experience 3f
     * @param cookingTime 180
     * @param inputLocation ModBlocks.ORE_WIP.getId().getPath()
     */
    private void simpleBlastingRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike input, ItemLike output, float experience, int cookingTime, String inputLocation)
    {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(input), output, experience, cookingTime)
                .unlockedBy("has_" + inputLocation, inventoryTrigger(ItemPredicate.Builder.item().of(input).build())).save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, inputLocation + "_blasting"));
    }
    /**
     * This method is used to create smelting recipes using only 1-2 lines (depending on spacing). It takes a Recipe Consumer
     * in the form of recipeConsumer, an ItemLike input which converts into an Ingredient.of(input), an ItemLike output which
     * is used to identify the output, float experience which is used to identify how much to reward the player for taking out
     * the output, int cookingTime which is used to identify how long the input cooks for, String inputLocation for use in the
     * unlockedBy and ResourceLocation. The format to use is as follows:
     * @param recipeConsumer recipeConsumer
     * @param input ModBlocks.ORE_WIP.get()
     * @param output ModItems.WIP_INGOT.get()
     * @param experience 2f
     * @param cookingTime 200
     * @param inputLocation ModBlocks.ORE_WIP.getId().getPath()
     */
    private void simpleSmeltingRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike input, ItemLike output, float experience, int cookingTime, String inputLocation)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), output, experience, cookingTime)
                .unlockedBy("has_" + inputLocation, inventoryTrigger(ItemPredicate.Builder.item().of(input).build())).save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, inputLocation + "_smelting"));
    }

    /**
     * This method is used to create smelting recipes using only 1-2 lines (depending on spacing). It takes a Recipe Consumer
     * in the form of recipeConsumer, an ItemLike output which is used to identify the output, String inputLocation for use in the
     * unlockedBy and ResourceLocation, an outputAmount for the whole integer value that is the amount to be outputted, and a
     * variable length ItemLike arguments array to store the inputs. The format to use is as follows:
     * @param recipeConsumer recipeConsumer
     * @param output ModItems.WIP_INGOT.get()
     * @param outputAmount 9
     * @param outputLocation ModItems.WIP_INGOT.getId().getPath()
     * @param inputs ModBlocks.WIP_BLOCK.get()
     */
    private void shapelessRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike output, int outputAmount, String outputLocation, ItemLike... inputs)
    {
        switch (inputs.length)
        {
            case 1:
                ShapelessRecipeBuilder.shapeless(output, outputAmount).requires(inputs[0])
                        .unlockedBy("has_" + outputLocation, inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, outputLocation));
                break;
            case 2:
                ShapelessRecipeBuilder.shapeless(output, outputAmount).requires(inputs[0]).requires(inputs[1])
                        .unlockedBy("has_" + outputLocation, inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, outputLocation));
                break;
            case 3:
                ShapelessRecipeBuilder.shapeless(output, outputAmount).requires(inputs[0]).requires(inputs[1]).requires(inputs[2])
                        .unlockedBy("has_" + outputLocation, inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, outputLocation));
                break;
            case 4:
                ShapelessRecipeBuilder.shapeless(output, outputAmount).requires(inputs[0]).requires(inputs[1]).requires(inputs[2]).requires(inputs[3])
                        .unlockedBy("has_" + outputLocation, inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, outputLocation));
                break;
            default:
                break;
        }
    }
    /**
     * This method is used to create storage block recipes using only 1-2 lines (depending on spacing). It takes a Recipe
     * Consumer in the form of recipeConsumer, an ItemLike input which is used to identify the input item, an ItemLike
     * output which is used to identify the output item, String inputLocation for use in the unlockedBy and ResourceLocation.
     * The format to use is as follows:
     * @param recipeConsumer recipeConsumer
     * @param input ModItems.WIP_INGOT.get()
     * @param output ModBlocks.WIP_BLOCK.get()
     * @param outputLocation ModBlocks.WIP_BLOCK.getId().getPath()
     */
    private void storageBlockRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike input, ItemLike output, String outputLocation)
    {
        ShapedRecipeBuilder.shaped(output, 1)
                .define('i', input)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .unlockedBy("has_" + outputLocation, inventoryTrigger(ItemPredicate.Builder.item().of(input).build()))
                .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, outputLocation));
    }
}
