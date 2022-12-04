package net.aradoryin.battlemage.world.feature;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModConfiguredFeatures
{
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Battlemage.MOD_ID);

//    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORES_WIP = Suppliers.memoize(() -> List.of(
//            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ORE_WIP.get().defaultBlockState()),
//            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ORE_WIP_DEEPSLATE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORES_AMETHYST = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ORE_AMETHYST.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ORE_AMETHYST_DEEPSLATE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORES_CITRINE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ORE_CITRINE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ORE_CITRINE_DEEPSLATE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORES_DIAMOND = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ORE_DIAMOND.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ORE_DIAMOND_DEEPSLATE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORES_EMERALD = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ORE_EMERALD.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ORE_EMERALD_DEEPSLATE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORES_ONYX = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ORE_ONYX.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ORE_ONYX_DEEPSLATE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORES_OPAL = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ORE_OPAL.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ORE_OPAL_DEEPSLATE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORES_QUARTZ = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ORE_QUARTZ.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ORE_QUARTZ_DEEPSLATE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORES_RUBY = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ORE_RUBY.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ORE_RUBY_DEEPSLATE.get().defaultBlockState())));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_ORES_SAPPHIRE = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ORE_SAPPHIRE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.ORE_SAPPHIRE_DEEPSLATE.get().defaultBlockState())));

//    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_WIP = CONFIGURED_FEATURES.register("ore_wip",
//            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORES_WIP.get(), 7))); // The 7 is the vein size
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_AMETHYST = CONFIGURED_FEATURES.register("ore_amethyst",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORES_AMETHYST.get(), 7))); // The 7 is the vein size
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_CITRINE = CONFIGURED_FEATURES.register("ore_citrine",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORES_CITRINE.get(), 7))); // The 7 is the vein size
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_DIAMOND = CONFIGURED_FEATURES.register("ore_diamond",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORES_DIAMOND.get(), 7))); // The 7 is the vein size
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_EMERALD = CONFIGURED_FEATURES.register("ore_emerald",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORES_EMERALD.get(), 7))); // The 7 is the vein size
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_ONYX = CONFIGURED_FEATURES.register("ore_onyx",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORES_ONYX.get(), 7))); // The 7 is the vein size
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_OPAL = CONFIGURED_FEATURES.register("ore_opal",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORES_OPAL.get(), 7))); // The 7 is the vein size
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_QUARTZ = CONFIGURED_FEATURES.register("ore_quartz",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORES_QUARTZ.get(), 7))); // The 7 is the vein size
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_RUBY = CONFIGURED_FEATURES.register("ore_ruby",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORES_RUBY.get(), 7))); // The 7 is the vein size
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORE_SAPPHIRE = CONFIGURED_FEATURES.register("ore_sapphire",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(OVERWORLD_ORES_SAPPHIRE.get(), 7))); // The 7 is the vein size

    public static void register(IEventBus eventBus)
    {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
