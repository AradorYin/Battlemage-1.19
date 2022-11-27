package net.aradoryin.battlemage.datagen.client;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.io.FileNotFoundException;

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
        simpleBlockWithItem(ModBlocks.WIP_ORE.get());
        simpleBlockWithItem(ModBlocks.WIP_ORE_DEEPSLATE.get());
    }

    private void simpleBlockWithItem(Block block) {
        String blockName = ForgeRegistries.BLOCKS.getKey(block).getPath();

        simpleBlock(block);

        itemModels().withExistingParent(blockName,
                new ResourceLocation(Battlemage.MOD_ID, "block/" + blockName));
    }
}
