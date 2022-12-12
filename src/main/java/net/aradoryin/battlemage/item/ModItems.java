package net.aradoryin.battlemage.item;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.ModCreativeModeTab;
import net.aradoryin.battlemage.item.custom.BracerItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Battlemage.MOD_ID);

	//BRACER
	public static final RegistryObject<Item> BRACER_INITIAL = ITEMS.register("bracer_initial",
			()-> new BracerItem(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB).stacksTo(1)));
	public static final RegistryObject<Item> BRACER_UPGRADE = ITEMS.register("bracer_upgrade",
			()-> new BracerItem(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB).stacksTo(1)));
	public static final RegistryObject<Item> BRACER_MAX = ITEMS.register("bracer_max",
			()-> new BracerItem(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB).stacksTo(1)));

	//WIP ITEMS
	public static final RegistryObject<Item> WIP_INGOT = ITEMS.register("wip_ingot",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> WIP_RAW = ITEMS.register("wip_raw",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEM_WIP_UNCUT = ITEMS.register("gem_wip_uncut",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEODE_WIP = ITEMS.register("geode_wip",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));

	//GEMS UNCUT
	public static final RegistryObject<Item> GEM_AMETHYST_UNCUT = ITEMS.register("gem_amethyst_uncut",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEM_CITRINE_UNCUT = ITEMS.register("gem_citrine_uncut",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEM_DIAMOND_UNCUT = ITEMS.register("gem_diamond_uncut",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEM_EMERALD_UNCUT = ITEMS.register("gem_emerald_uncut",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEM_ONYX_UNCUT = ITEMS.register("gem_onyx_uncut",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEM_OPAL_UNCUT = ITEMS.register("gem_opal_uncut",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEM_QUARTZ_UNCUT = ITEMS.register("gem_quartz_uncut",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEM_RUBY_UNCUT = ITEMS.register("gem_ruby_uncut",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> GEM_SAPPHIRE_UNCUT = ITEMS.register("gem_sapphire_uncut",
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));

	//GEODES
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
