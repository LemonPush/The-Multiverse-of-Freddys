package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.potion.SpringlockPotionEffect;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;

public class SpringBonnieHeadLivingEntityIsHitWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure SpringBonnieHeadLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(SpringlockPotionEffect.potion, (int) 100, (int) 0, (false), (false)));
	}
}
