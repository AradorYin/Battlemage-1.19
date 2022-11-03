package net.aradoryin.battlemage;

import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Battlemage.MOD_ID)
public class Battlemage
{
	public static final String MOD_ID = "battlemage";
	
	public Battlemage()
	{
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ModItems.register(modEventBus);
		ModBlocks.register(modEventBus);
		
		modEventBus.addListener(this::commonSetup);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void commonSetup(final FMLCommonSetupEvent event)
	{
		
	}
	
	@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class ClientModEvents
	{
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event)
		{
			
		}
	}
}
