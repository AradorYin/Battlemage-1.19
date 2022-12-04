package net.aradoryin.battlemage.world.feature;

import net.aradoryin.battlemage.Battlemage;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures
{
    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Battlemage.MOD_ID);

//    public static final RegistryObject<PlacedFeature> ORE_WIP_PLACED = PLACED_FEATURES.register("ore_wip_placed",
//            () -> new PlacedFeature(ModConfiguredFeatures.ORE_WIP.getHolder().get(), commonOrePlacement(7,
//                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> ORE_AMETHYST_PLACED = PLACED_FEATURES.register("ore_amethyst_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ORE_AMETHYST.getHolder().get(), commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> ORE_CITRINE_PLACED = PLACED_FEATURES.register("ore_citrine_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ORE_CITRINE.getHolder().get(), commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> ORE_DIAMOND_PLACED = PLACED_FEATURES.register("ore_diamond_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ORE_DIAMOND.getHolder().get(), commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> ORE_EMERALD_PLACED = PLACED_FEATURES.register("ore_emerald_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ORE_EMERALD.getHolder().get(), commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> ORE_ONYX_PLACED = PLACED_FEATURES.register("ore_onyx_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ORE_ONYX.getHolder().get(), commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> ORE_OPAL_PLACED = PLACED_FEATURES.register("ore_opal_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ORE_OPAL.getHolder().get(), commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> ORE_QUARTZ_PLACED = PLACED_FEATURES.register("ore_quartz_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ORE_QUARTZ.getHolder().get(), commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> ORE_RUBY_PLACED = PLACED_FEATURES.register("ore_ruby_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ORE_RUBY.getHolder().get(), commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));
    public static final RegistryObject<PlacedFeature> ORE_SAPPHIRE_PLACED = PLACED_FEATURES.register("ore_sapphire_placed",
            () -> new PlacedFeature(ModConfiguredFeatures.ORE_SAPPHIRE.getHolder().get(), commonOrePlacement(7,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80)))));

    public static List<PlacementModifier> orePlacement(PlacementModifier modifier1, PlacementModifier modifier2)
    {
        return List.of(modifier1, InSquarePlacement.spread(), modifier2, BiomeFilter.biome());
    }
    public static List<PlacementModifier> commonOrePlacement(int veinsPerChunk, PlacementModifier modifier)
    {
        return orePlacement(CountPlacement.of(veinsPerChunk), modifier);
    }
    public static List<PlacementModifier> rareOrePlacement(int veinsPerChunk, PlacementModifier modifier)
    {
        return orePlacement(RarityFilter.onAverageOnceEvery(veinsPerChunk), modifier);
    }

    public static void register(IEventBus eventBus)
    {
        PLACED_FEATURES.register(eventBus);
    }
}
