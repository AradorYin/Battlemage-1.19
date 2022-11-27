package net.aradoryin.battlemage.block;

import java.util.function.Supplier;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.ModCreativeModeTab;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Battlemage.MOD_ID);
	
	/* Gems: DropExperienceBlock */
	
	//BLOCKS
	public static final RegistryObject<Block> WIP_BLOCK = registerBlock("wip_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	
	//ORES | DEEPSLATE ORES
	public static final RegistryObject<Block> ORE_WIP = registerBlock("ore_wip",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_WIP_DEEPSLATE = registerBlock("ore_wip_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_AMETHYST = registerBlock("ore_amethyst",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_AMETHYST_DEEPSLATE = registerBlock("ore_amethyst_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_CITRINE = registerBlock("ore_citrine",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_CITRINE_DEEPSLATE = registerBlock("ore_citrine_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_DIAMOND = registerBlock("ore_diamond",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_DIAMOND_DEEPSLATE = registerBlock("ore_diamond_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_EMERALD = registerBlock("ore_emerald",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_EMERALD_DEEPSLATE = registerBlock("ore_emerald_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_ONYX = registerBlock("ore_onyx",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_ONYX_DEEPSLATE = registerBlock("ore_onyx_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_OPAL = registerBlock("ore_opal",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_OPAL_DEEPSLATE = registerBlock("ore_opal_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_QUARTZ = registerBlock("ore_quartz",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_QUARTZ_DEEPSLATE = registerBlock("ore_quartz_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_RUBY = registerBlock("ore_ruby",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_RUBY_DEEPSLATE = registerBlock("ore_ruby_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_SAPPHIRE = registerBlock("ore_sapphire",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	public static final RegistryObject<Block> ORE_SAPPHIRE_DEEPSLATE = registerBlock("ore_sapphire_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(6f)
					.requiresCorrectToolForDrops()), ModCreativeModeTab.BATTLEMAGE_TAB);
	
	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) 
	{
		RegistryObject<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn, tab);
		return toReturn;
	}
	
	private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab)
	{
		return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab))); 
	}
	
	public static void register(IEventBus eventBus)
	{
		BLOCKS.register(eventBus);
	}
}
