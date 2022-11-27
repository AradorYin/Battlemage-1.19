package net.aradoryin.battlemage.datagen.server.loot;

import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot
{
    @Override
    protected void addTables()
    {
        this.dropSelf(ModBlocks.WIP_BLOCK.get());
        this.add(ModBlocks.ORE_WIP.get(),
                (block -> createOreDrop(ModBlocks.ORE_WIP.get(), ModItems.WIP_RAW.get())));
        this.add(ModBlocks.ORE_WIP_DEEPSLATE.get(),
                (block -> createOreDrop(ModBlocks.ORE_WIP_DEEPSLATE.get(), ModItems.WIP_RAW.get())));
        this.add(ModBlocks.ORE_AMETHYST.get(),
                (block -> createOreDrop(ModBlocks.ORE_AMETHYST.get(), ModItems.GEODE_AMETHYST.get())));
        this.add(ModBlocks.ORE_AMETHYST_DEEPSLATE.get(),
                (block -> createOreDrop(ModBlocks.ORE_AMETHYST_DEEPSLATE.get(), ModItems.GEODE_AMETHYST.get())));
        this.add(ModBlocks.ORE_CITRINE.get(),
                (block -> createOreDrop(ModBlocks.ORE_CITRINE.get(), ModItems.GEODE_CITRINE.get())));
        this.add(ModBlocks.ORE_CITRINE_DEEPSLATE.get(),
                (block -> createOreDrop(ModBlocks.ORE_CITRINE_DEEPSLATE.get(), ModItems.GEODE_CITRINE.get())));
        this.add(ModBlocks.ORE_DIAMOND.get(),
                (block -> createOreDrop(ModBlocks.ORE_DIAMOND.get(), ModItems.GEODE_DIAMOND.get())));
        this.add(ModBlocks.ORE_DIAMOND_DEEPSLATE.get(),
                (block -> createOreDrop(ModBlocks.ORE_DIAMOND_DEEPSLATE.get(), ModItems.GEODE_DIAMOND.get())));
        this.add(ModBlocks.ORE_EMERALD.get(),
                (block -> createOreDrop(ModBlocks.ORE_EMERALD.get(), ModItems.GEODE_EMERALD.get())));
        this.add(ModBlocks.ORE_EMERALD_DEEPSLATE.get(),
                (block -> createOreDrop(ModBlocks.ORE_EMERALD_DEEPSLATE.get(), ModItems.GEODE_EMERALD.get())));
        this.add(ModBlocks.ORE_ONYX.get(),
                (block -> createOreDrop(ModBlocks.ORE_ONYX.get(), ModItems.GEODE_ONYX.get())));
        this.add(ModBlocks.ORE_ONYX_DEEPSLATE.get(),
                (block -> createOreDrop(ModBlocks.ORE_ONYX_DEEPSLATE.get(), ModItems.GEODE_ONYX.get())));
        this.add(ModBlocks.ORE_OPAL.get(),
                (block -> createOreDrop(ModBlocks.ORE_OPAL.get(), ModItems.GEODE_OPAL.get())));
        this.add(ModBlocks.ORE_OPAL_DEEPSLATE.get(),
                (block -> createOreDrop(ModBlocks.ORE_OPAL_DEEPSLATE.get(), ModItems.GEODE_OPAL.get())));
        this.add(ModBlocks.ORE_QUARTZ.get(),
                (block -> createOreDrop(ModBlocks.ORE_QUARTZ.get(), ModItems.GEODE_QUARTZ.get())));
        this.add(ModBlocks.ORE_QUARTZ_DEEPSLATE.get(),
                (block -> createOreDrop(ModBlocks.ORE_QUARTZ_DEEPSLATE.get(), ModItems.GEODE_QUARTZ.get())));
        this.add(ModBlocks.ORE_RUBY.get(),
                (block -> createOreDrop(ModBlocks.ORE_RUBY.get(), ModItems.GEODE_RUBY.get())));
        this.add(ModBlocks.ORE_RUBY_DEEPSLATE.get(),
                (block -> createOreDrop(ModBlocks.ORE_RUBY_DEEPSLATE.get(), ModItems.GEODE_RUBY.get())));
        this.add(ModBlocks.ORE_SAPPHIRE.get(),
                (block -> createOreDrop(ModBlocks.ORE_SAPPHIRE.get(), ModItems.GEODE_SAPPHIRE.get())));
        this.add(ModBlocks.ORE_SAPPHIRE_DEEPSLATE.get(),
                (block -> createOreDrop(ModBlocks.ORE_SAPPHIRE_DEEPSLATE.get(), ModItems.GEODE_SAPPHIRE.get())));
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
