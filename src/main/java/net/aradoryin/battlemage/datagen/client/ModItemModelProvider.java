package net.aradoryin.battlemage.datagen.client;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.io.FileNotFoundException;

public class ModItemModelProvider extends ItemModelProvider
{
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper)
    {
        super(generator, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        //Items
        simpleItemIngots(ModItems.WIP_INGOT);
        simpleItemRaw(ModItems.WIP_RAW);
        //GEODES
        simpleItemGeode(ModItems.GEODE_WIP);
        simpleItemGeode(ModItems.GEODE_AMETHYST);
        simpleItemGeode(ModItems.GEODE_CITRINE);
        simpleItemGeode(ModItems.GEODE_DIAMOND);
        simpleItemGeode(ModItems.GEODE_EMERALD);
        simpleItemGeode(ModItems.GEODE_ONYX);
        simpleItemGeode(ModItems.GEODE_OPAL);
        simpleItemGeode(ModItems.GEODE_QUARTZ);
        simpleItemGeode(ModItems.GEODE_RUBY);
        simpleItemGeode(ModItems.GEODE_SAPPHIRE);
    }

    private ItemModelBuilder simpleItemGeode(RegistryObject<Item> item)
    {
        try
        {
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
        }
        catch (Exception e)
        {
            System.out.println(e);
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + ModItems.GEODE_WIP.getId().getPath()));
        }
    }

    private ItemModelBuilder simpleItemIngots(RegistryObject<Item> item)
    {
        try
        {
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + ModItems.WIP_INGOT.getId().getPath()));
        }
    }

    private ItemModelBuilder simpleItemRaw(RegistryObject<Item> item)
    {
        try
        {
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
        }
        catch (IllegalArgumentException e)
        {
            System.out.println(e);
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + ModItems.WIP_RAW.getId().getPath()));
        }
    }

    private ItemModelBuilder simpleHandheldItem(RegistryObject<Item> item)
    {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
    }
}
