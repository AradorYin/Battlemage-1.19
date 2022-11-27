package net.aradoryin.battlemage;

import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
	public static final CreativeModeTab BATTLEMAGE_TAB = new CreativeModeTab("battlemagetab")
	{
		@Override
		public ItemStack makeIcon()
		{
			return new ItemStack(ModItems.WIP_INGOT.get());
		}
	};
}
