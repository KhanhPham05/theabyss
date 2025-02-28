package net.yezon.theabyss.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.yezon.theabyss.events.SwordParticleEvent;
import net.yezon.theabyss.events.UseDashEvent;
import net.yezon.theabyss.events.UseSliceEvent;
import net.yezon.theabyss.init.TheabyssModTabs;

public class AbyssSwordItem extends SwordItem {
    public AbyssSwordItem() {
        super(new Tier() {
            public int getUses() {
                return 2600;
            }

            public float getSpeed() {
                return 11f;
            }

            public float getAttackDamageBonus() {
                return 18f;
            }

            public int getLevel() {
                return 5;
            }

            public int getEnchantmentValue() {
                return 100;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }
        }, 3, -1.5f, new Item.Properties().tab(TheabyssModTabs.TAB_THE_ABYSS_WEAPONS));
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        UseSliceEvent.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
        return retval;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        UseDashEvent.execute(entity);
        return ar;
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected)
            SwordParticleEvent.execute(world, entity.getX(), entity.getY(), entity.getZ());
    }
}
