package net.aradoryin.battlemage.item;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.ModCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Battlemage.MOD_ID);
	
	public static final RegistryObject<Item> WIP_INGOT = ITEMS.register("wip_ingot",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> WIP_RAW = ITEMS.register("wip_raw",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEODE_WIP = ITEMS.register("geode_wip",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));

	public static final RegistryObject<Item> GEODE_AMETHYST = ITEMS.register("geode_amethyst",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEODE_CITRINE = ITEMS.register("geode_citrine",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEODE_DIAMOND = ITEMS.register("geode_diamond",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEODE_EMERALD = ITEMS.register("geode_emerald",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEODE_ONYX = ITEMS.register("geode_onyx",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEODE_OPAL = ITEMS.register("geode_opal",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEODE_QUARTZ = ITEMS.register("geode_quartz",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEODE_RUBY = ITEMS.register("geode_ruby",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEODE_SAPPHIRE = ITEMS.register("geode_sapphire",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	
	public static void register(IEventBus eventBus)
	{
		ITEMS.register(eventBus);
	}
}
