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
        this.dropSelf(ModBlocks.TEST_BLOCK.get());
        this.add(ModBlocks.TEST_ORE.get(),
                (block -> createOreDrop(ModBlocks.TEST_ORE.get(), ModItems.TEST_INGOT.get())));
        this.add(ModBlocks.DEEPSLATE_TEST_ORE.get(),
                (block -> createOreDrop(ModBlocks.DEEPSLATE_TEST_ORE.get(), ModItems.TEST_INGOT.get())));
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
