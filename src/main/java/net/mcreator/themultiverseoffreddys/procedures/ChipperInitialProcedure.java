package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;

public class ChipperInitialProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency world for procedure ChipperInitial!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure ChipperInitial!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		double tradeNumber = 0;
		double randomNumber = 0;
		double randomAmount = 0;
		tradeNumber = 1;
		for (int index0 = 0; index0 < (int) (3); index0++) {
			if (!world.isRemote()) {
				randomNumber = Math.random();
			}
			entity.getPersistentData().putDouble(("tradeItem" + new java.text.DecimalFormat("##").format(tradeNumber)), 1);
			if (!world.isRemote()) {
				randomNumber = Math.random();
			}
			if (randomNumber >= 0.75) {
				entity.getPersistentData().putDouble(("tradeCount" + new java.text.DecimalFormat("##").format(tradeNumber)), 1);
			} else if (randomNumber >= 0.5) {
				entity.getPersistentData().putDouble(("tradeCount" + new java.text.DecimalFormat("##").format(tradeNumber)), 1);
			} else if (randomNumber >= 0.25) {
				if (!world.isRemote()) {
					randomAmount = Math.random();
				}
				entity.getPersistentData().putDouble(("tradeCount" + new java.text.DecimalFormat("##").format(tradeNumber)),
						Math.ceil(randomAmount * 1));
			} else if (randomNumber >= 0) {
				if (!world.isRemote()) {
					randomAmount = Math.random();
				}
				entity.getPersistentData().putDouble(("tradeCount" + new java.text.DecimalFormat("##").format(tradeNumber)),
						Math.ceil(randomAmount * 1));
			}
			tradeNumber = (tradeNumber + 1);
		}
	}
}
