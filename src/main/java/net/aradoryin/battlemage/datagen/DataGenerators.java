package net.aradoryin.battlemage.datagen;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.datagen.client.ModBlockStateProvider;
import net.aradoryin.battlemage.datagen.client.ModItemModelProvider;
import net.aradoryin.battlemage.datagen.server.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Battlemage.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        /*
        Client -> Model Providers | Sound Providers | Language Providers
        Server -> Tags | Loot Tables | Recipes | Advancements
         */
        generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModEnUsProvider(generator));
        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ModItemTagsProvider(generator, blockTags, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(generator));
        generator.addProvider(event.includeServer(), new ModLootTableProvider(generator));
    }
}
