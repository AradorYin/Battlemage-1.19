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
                .add(ModItems.WIP_INGOT.get());
        tag(Tags.Items.ORES)
                .add(ModBlocks.WIP_ORE.get().asItem())
                .add(ModBlocks.WIP_ORE_DEEPSLATE.get().asItem());
        tag(Tags.Items.STORAGE_BLOCKS)
                .add(ModBlocks.WIP_BLOCK.get().asItem());
    }
}
