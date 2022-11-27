package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider
{
    public static final TagKey<Block> MOD_ORES = create("mod_ores");
    public static final TagKey<Block> MOD_ORES_DEEPSLATE = create("mod_ores_deepslate");

    public ModBlockTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(generator, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.WIP_BLOCK.get())
                .addTag(MOD_ORES)
                .addTag(MOD_ORES_DEEPSLATE);
        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.WIP_BLOCK.get())
                .addTag(MOD_ORES).addTag(MOD_ORES_DEEPSLATE)
                .addTag(MOD_ORES_DEEPSLATE);
        tag(ModBlockTagsProvider.MOD_ORES)
                .add(ModBlocks.ORE_WIP.get())
                .add(ModBlocks.ORE_AMETHYST.get())
                .add(ModBlocks.ORE_CITRINE.get())
                .add(ModBlocks.ORE_DIAMOND.get())
                .add(ModBlocks.ORE_EMERALD.get())
                .add(ModBlocks.ORE_ONYX.get())
                .add(ModBlocks.ORE_OPAL.get())
                .add(ModBlocks.ORE_QUARTZ.get())
                .add(ModBlocks.ORE_RUBY.get())
                .add(ModBlocks.ORE_SAPPHIRE.get());
        tag(ModBlockTagsProvider.MOD_ORES_DEEPSLATE)
                .add(ModBlocks.ORE_WIP_DEEPSLATE.get())
                .add(ModBlocks.ORE_AMETHYST_DEEPSLATE.get())
                .add(ModBlocks.ORE_CITRINE_DEEPSLATE.get())
                .add(ModBlocks.ORE_DIAMOND_DEEPSLATE.get())
                .add(ModBlocks.ORE_EMERALD_DEEPSLATE.get())
                .add(ModBlocks.ORE_ONYX_DEEPSLATE.get())
                .add(ModBlocks.ORE_OPAL_DEEPSLATE.get())
                .add(ModBlocks.ORE_QUARTZ_DEEPSLATE.get())
                .add(ModBlocks.ORE_RUBY_DEEPSLATE.get())
                .add(ModBlocks.ORE_SAPPHIRE_DEEPSLATE.get());
        tag(Tags.Blocks.ORES)
                .addTag(MOD_ORES)
                .addTag(MOD_ORES_DEEPSLATE);
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .add(ModBlocks.WIP_BLOCK.get());
    }

    private static TagKey<Block> create(String name) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(name));
    }
}
