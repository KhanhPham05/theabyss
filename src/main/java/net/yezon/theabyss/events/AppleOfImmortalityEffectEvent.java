package net.yezon.theabyss.events;

import net.yezon.theabyss.init.TheabyssModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class AppleOfImmortalityEffectEvent {
	public static void execute(Entity entity) {
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(TheabyssModMobEffects.IMMORTAL.get(), 110, 1));
	}
}
