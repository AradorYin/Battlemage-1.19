package net.aradoryin.battlemage.datagen.client;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        simpleBlockWithItem(ModBlocks.WIP_BLOCK.get());
        simpleBlockWithItem(ModBlocks.ORE_WIP.get());
        simpleBlockWithItem(ModBlocks.ORE_AMETHYST.get());
        simpleBlockWithItem(ModBlocks.ORE_CITRINE.get());
        simpleBlockWithItem(ModBlocks.ORE_DIAMOND.get());
        simpleBlockWithItem(ModBlocks.ORE_EMERALD.get());
        simpleBlockWithItem(ModBlocks.ORE_ONYX.get());
        simpleBlockWithItem(ModBlocks.ORE_OPAL.get());
        simpleBlockWithItem(ModBlocks.ORE_QUARTZ.get());
        simpleBlockWithItem(ModBlocks.ORE_RUBY.get());
        simpleBlockWithItem(ModBlocks.ORE_SAPPHIRE.get());
        simpleBlockWithItem(ModBlocks.ORE_WIP_DEEPSLATE.get());
        simpleBlockWithItem(ModBlocks.ORE_AMETHYST_DEEPSLATE.get());
        simpleBlockWithItem(ModBlocks.ORE_CITRINE_DEEPSLATE.get());
        simpleBlockWithItem(ModBlocks.ORE_DIAMOND_DEEPSLATE.get());
        simpleBlockWithItem(ModBlocks.ORE_EMERALD_DEEPSLATE.get());
        simpleBlockWithItem(ModBlocks.ORE_ONYX_DEEPSLATE.get());
        simpleBlockWithItem(ModBlocks.ORE_OPAL_DEEPSLATE.get());
        simpleBlockWithItem(ModBlocks.ORE_QUARTZ_DEEPSLATE.get());
        simpleBlockWithItem(ModBlocks.ORE_RUBY_DEEPSLATE.get());
        simpleBlockWithItem(ModBlocks.ORE_SAPPHIRE_DEEPSLATE.get());
    }

    private void simpleBlockWithItem(Block block)
    {
        String blockName = ForgeRegistries.BLOCKS.getKey(block).getPath();

        simpleBlock(block);
        itemModels().withExistingParent(blockName,
                new ResourceLocation(Battlemage.MOD_ID, "block/" + blockName));
    }
}
