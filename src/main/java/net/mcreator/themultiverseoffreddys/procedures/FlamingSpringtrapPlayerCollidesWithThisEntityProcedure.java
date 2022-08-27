package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;

public class FlamingSpringtrapPlayerCollidesWithThisEntityProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency sourceentity for procedure FlamingSpringtrapPlayerCollidesWithThisEntity!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		sourceentity.setFire((int) 3);
	}
}
