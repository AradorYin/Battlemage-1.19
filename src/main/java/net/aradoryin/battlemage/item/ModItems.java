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
	
	public static final RegistryObject<Item> TEST_INGOT = ITEMS.register("test_ingot", 
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> TEST_RAW = ITEMS.register("test_raw", 
			()-> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEMAGE_TAB)));
	
	public static void register(IEventBus eventBus)
	{
		ITEMS.register(eventBus);
	}
}
