package net.yezon.theabyss.events;

import net.yezon.theabyss.init.TheabyssModMobEffects;
import net.yezon.theabyss.init.TheabyssModItems;
import net.yezon.theabyss.init.TheabyssModEntities;
import net.yezon.theabyss.entity.PlayerBodyEntity;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AfterLifeHandlerEvent {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity instanceof Player _playerHasItem) {
			if (_playerHasItem.getInventory().contains(new ItemStack(TheabyssModItems.ARTIFACT_OF_AFTER_LIFE.get()))) {
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				}
				LivingEntity _entity = (LivingEntity) entity;
				_entity.setHealth(10);
				_entity.addEffect(new MobEffectInstance(TheabyssModMobEffects.AFTER_LIFE.get(), 800, 1, (false), (false)));
				{
					entity.teleportTo((x + Math.random() * Math.round(128)), y, (x + Math.random() * Math.round(128)));
					if (entity instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x + Math.random() * Math.round(128)), y, (x + Math.random() * Math.round(128)),
								entity.getYRot(), entity.getXRot());
				}
				if (world instanceof ServerLevel _level) {
					Mob entityToSpawn = new PlayerBodyEntity(TheabyssModEntities.PLAYER_BODY.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					entityToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
							null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
