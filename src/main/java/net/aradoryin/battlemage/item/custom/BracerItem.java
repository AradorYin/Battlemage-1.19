package net.aradoryin.battlemage.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BracerItem extends Item
{
    public BracerItem(Properties properties)
    {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand)
    {
        if(!level.isClientSide && hand == InteractionHand.MAIN_HAND)
        {
            /*
            Cooldown
             */
            player.getCooldowns().addCooldown(this, 20); // Item | int number of ticks
        }

        return super.use(level, player, hand);
    }
}
