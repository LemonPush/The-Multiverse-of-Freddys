package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;

public class DeathcoinLivingEntityIsHitWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure DeathcoinLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof MonsterEntity) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) <= 100) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 10000);
			}
		}
	}
}
