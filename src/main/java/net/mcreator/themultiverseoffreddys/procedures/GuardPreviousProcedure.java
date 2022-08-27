package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;

public class GuardPreviousProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure GuardPrevious!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getDouble("playerTradePage") == 6) {
			entity.getPersistentData().putDouble("playerTradePage", 5);
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 5) {
			entity.getPersistentData().putDouble("playerTradePage", 4);
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 4) {
			entity.getPersistentData().putDouble("playerTradePage", 3);
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 3) {
			entity.getPersistentData().putDouble("playerTradePage", 2);
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 2) {
			entity.getPersistentData().putDouble("playerTradePage", 1);
		}
	}
}
