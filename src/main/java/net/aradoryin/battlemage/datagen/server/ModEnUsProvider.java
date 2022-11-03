package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.ModCreativeModeTab;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsProvider extends LanguageProvider
{
    public ModEnUsProvider(DataGenerator generator)
    {
        super(generator, Battlemage.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations()
    {
        //Creative Tab
        add(ModCreativeModeTab.BATTLEMAGE_TAB.getDisplayName().getString(), "Battlemage");

        //Items
        add(ModItems.TEST_INGOT.get(), "Test Ingot");
        add(ModItems.TEST_RAW.get(), "Test Raw");

        //Blocks
        add(ModBlocks.TEST_BLOCK.get(), "Test Block");
        add(ModBlocks.TEST_ORE.get(), "Test Ore");
        add(ModBlocks.DEEPSLATE_TEST_ORE.get(), "Test Deepslate Ore");
    }
}
