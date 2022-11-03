package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider
{
    public ModItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTags, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(generator, blockTags, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        tag(Tags.Items.INGOTS)
                .add(ModItems.TEST_INGOT.get());
        tag(Tags.Items.ORES)
                .add(ModBlocks.TEST_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_TEST_ORE.get().asItem());
        tag(Tags.Items.STORAGE_BLOCKS)
                .add(ModBlocks.TEST_BLOCK.get().asItem());
    }
}
