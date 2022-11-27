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
        add(ModItems.WIP_INGOT.get(), "WIP Ingot");
        add(ModItems.WIP_RAW.get(), "WIP Raw");
        add(ModItems.GEODE_WIP.get(), "WIP Geode");
        add(ModItems.GEODE_AMETHYST.get(), "Amethyst Geode");
        add(ModItems.GEODE_CITRINE.get(), "Citrine Geode");
        add(ModItems.GEODE_DIAMOND.get(), "Diamond Geode");
        add(ModItems.GEODE_EMERALD.get(), "Emerald Geode");
        add(ModItems.GEODE_ONYX.get(), "Onyx Geode");
        add(ModItems.GEODE_OPAL.get(), "Opal Geode");
        add(ModItems.GEODE_QUARTZ.get(), "Quartz Geode");
        add(ModItems.GEODE_RUBY.get(), "Ruby Geode");
        add(ModItems.GEODE_SAPPHIRE.get(), "Sapphire Geode");

        //Blocks
        add(ModBlocks.WIP_BLOCK.get(), "WIP Block");
        add(ModBlocks.WIP_ORE.get(), "WIP Ore");
        add(ModBlocks.WIP_ORE_DEEPSLATE.get(), "WIP Deepslate Ore");
    }
}
