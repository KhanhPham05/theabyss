package net.yezon.theabyss.events;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.yezon.theabyss.init.TheabyssModItems;

import java.util.Map;
import java.util.function.Supplier;

public class RingOfTelekineticBenchEvent {
    public static void execute(Entity entity) {
        if (entity == null)
            return;
        if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt
                ? ((Slot) _slt.get(0)).getItem()
                : ItemStack.EMPTY).getItem() == TheabyssModItems.RING_OF_RING.get()) {
            if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
                    && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
                    .getItem() == TheabyssModItems.ENDER_CRYSTAL_SHARD.get()
                    && (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
                    && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
                    .getItem() == TheabyssModItems.HOLLOW_CRYSTAL_SHARD.get()
                    && (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
                    && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
                    .getItem() == TheabyssModItems.ENDER_CRYSTAL_SHARD.get()
                    && (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
                    && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY)
                    .getItem() == TheabyssModItems.HOLLOW_CRYSTAL_SHARD.get()
                    && (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
                    && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(5)).getItem() : ItemStack.EMPTY)
                    .getItem() == TheabyssModItems.ENDER_CRYSTAL_SHARD.get()
                    && (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
                    && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(6)).getItem() : ItemStack.EMPTY)
                    .getItem() == TheabyssModItems.HOLLOW_CRYSTAL_SHARD.get()
                    && (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
                    && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(7)).getItem() : ItemStack.EMPTY)
                    .getItem() == TheabyssModItems.ENDER_CRYSTAL_SHARD.get()
                    && (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
                    && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(8)).getItem() : ItemStack.EMPTY)
                    .getItem() == TheabyssModItems.HOLLOW_CRYSTAL_SHARD.get()) {
                if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
                        && _current.get() instanceof Map _slots) {
                    ((Slot) _slots.get(0)).remove(1);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
                        && _current.get() instanceof Map _slots) {
                    ((Slot) _slots.get(1)).remove(8);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
                        && _current.get() instanceof Map _slots) {
                    ((Slot) _slots.get(2)).remove(1);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
                        && _current.get() instanceof Map _slots) {
                    ((Slot) _slots.get(3)).remove(8);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
                        && _current.get() instanceof Map _slots) {
                    ((Slot) _slots.get(4)).remove(1);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
                        && _current.get() instanceof Map _slots) {
                    ((Slot) _slots.get(5)).remove(8);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
                        && _current.get() instanceof Map _slots) {
                    ((Slot) _slots.get(6)).remove(1);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
                        && _current.get() instanceof Map _slots) {
                    ((Slot) _slots.get(7)).remove(8);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
                        && _current.get() instanceof Map _slots) {
                    ((Slot) _slots.get(8)).remove(1);
                    _player.containerMenu.broadcastChanges();
                }
                if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
                        && _current.get() instanceof Map _slots) {
                    ItemStack _setstack = new ItemStack(TheabyssModItems.RING_OF_TELEKINETIC.get());
                    _setstack.setCount(1);
                    ((Slot) _slots.get(9)).set(_setstack);
                    _player.containerMenu.broadcastChanges();
                }
            }
        }
    }
}
