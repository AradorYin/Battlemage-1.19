package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider
{
    public ModBlockTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(generator, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.WIP_BLOCK.get())
                .add(ModBlocks.WIP_ORE.get())
                .add(ModBlocks.WIP_ORE_DEEPSLATE.get());
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.WIP_BLOCK.get())
                .add(ModBlocks.WIP_ORE.get())
                .add(ModBlocks.WIP_ORE_DEEPSLATE.get());
        tag(Tags.Blocks.ORES)
                .add(ModBlocks.WIP_ORE.get())
                .add(ModBlocks.WIP_ORE_DEEPSLATE.get());
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .add(ModBlocks.WIP_BLOCK.get());
    }
}
