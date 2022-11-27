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
        this.add(ModBlocks.WIP_ORE.get(),
                (block -> createOreDrop(ModBlocks.WIP_ORE.get(), ModItems.WIP_RAW.get())));
        this.add(ModBlocks.WIP_ORE_DEEPSLATE.get(),
                (block -> createOreDrop(ModBlocks.WIP_ORE_DEEPSLATE.get(), ModItems.WIP_RAW.get())));
    }

    @Override
    protected Iterable<Block> getKnownBlocks()
    {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
