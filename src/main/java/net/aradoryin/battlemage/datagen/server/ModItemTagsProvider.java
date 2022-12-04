package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModItemTagsProvider extends ItemTagsProvider
{
    public static final TagKey<Item> MOD_GEMS_UNCUT = create("mod_gems_uncut");
    public static final TagKey<Item> MOD_GEODES = create("mod_geodes");
    public static final TagKey<Item> MOD_ORES = create("mod_ores");
    public static final TagKey<Item> MOD_ORES_DEEPSLATE = create("mod_ores_deepslate");

    public ModItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTags, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(generator, blockTags, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        tag(Tags.Items.INGOTS)
                .add(ModItems.WIP_INGOT.get());
        tag(ModItemTagsProvider.MOD_GEMS_UNCUT)
                .add(ModItems.GEM_AMETHYST_UNCUT.get())
                .add(ModItems.GEM_CITRINE_UNCUT.get())
                .add(ModItems.GEM_DIAMOND_UNCUT.get())
                .add(ModItems.GEM_EMERALD_UNCUT.get())
                .add(ModItems.GEM_ONYX_UNCUT.get())
                .add(ModItems.GEM_OPAL_UNCUT.get())
                .add(ModItems.GEM_QUARTZ_UNCUT.get())
                .add(ModItems.GEM_RUBY_UNCUT.get())
                .add(ModItems.GEM_SAPPHIRE_UNCUT.get());
        tag(ModItemTagsProvider.MOD_GEODES)
                .add(ModItems.GEODE_WIP.get())
                .add(ModItems.GEODE_AMETHYST.get())
                .add(ModItems.GEODE_CITRINE.get())
                .add(ModItems.GEODE_DIAMOND.get())
                .add(ModItems.GEODE_EMERALD.get())
                .add(ModItems.GEODE_ONYX.get())
                .add(ModItems.GEODE_OPAL.get())
                .add(ModItems.GEODE_QUARTZ.get())
                .add(ModItems.GEODE_RUBY.get())
                .add(ModItems.GEODE_SAPPHIRE.get());
        tag(ModItemTagsProvider.MOD_ORES)
                .add(ModBlocks.ORE_WIP.get().asItem())
                .add(ModBlocks.ORE_AMETHYST.get().asItem())
                .add(ModBlocks.ORE_CITRINE.get().asItem())
                .add(ModBlocks.ORE_DIAMOND.get().asItem())
                .add(ModBlocks.ORE_EMERALD.get().asItem())
                .add(ModBlocks.ORE_ONYX.get().asItem())
                .add(ModBlocks.ORE_OPAL.get().asItem())
                .add(ModBlocks.ORE_QUARTZ.get().asItem())
                .add(ModBlocks.ORE_RUBY.get().asItem())
                .add(ModBlocks.ORE_SAPPHIRE.get().asItem());
        tag(ModItemTagsProvider.MOD_ORES_DEEPSLATE)
                .add(ModBlocks.ORE_WIP_DEEPSLATE.get().asItem())
                .add(ModBlocks.ORE_AMETHYST_DEEPSLATE.get().asItem())
                .add(ModBlocks.ORE_CITRINE_DEEPSLATE.get().asItem())
                .add(ModBlocks.ORE_DIAMOND_DEEPSLATE.get().asItem())
                .add(ModBlocks.ORE_EMERALD_DEEPSLATE.get().asItem())
                .add(ModBlocks.ORE_ONYX_DEEPSLATE.get().asItem())
                .add(ModBlocks.ORE_OPAL_DEEPSLATE.get().asItem())
                .add(ModBlocks.ORE_QUARTZ_DEEPSLATE.get().asItem())
                .add(ModBlocks.ORE_RUBY_DEEPSLATE.get().asItem())
                .add(ModBlocks.ORE_SAPPHIRE_DEEPSLATE.get().asItem());
        tag(Tags.Items.ORES)
                .addTag(MOD_ORES)
                .addTag(MOD_ORES_DEEPSLATE);
        tag(Tags.Items.STORAGE_BLOCKS)
                .add(ModBlocks.WIP_BLOCK.get().asItem());
    }

    private static TagKey<Item> create(String name) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(name));
    }
}
