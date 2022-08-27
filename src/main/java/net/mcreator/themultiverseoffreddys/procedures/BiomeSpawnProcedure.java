package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.RegistryKey;

import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;

public class BiomeSpawnProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency world for procedure BiomeSpawn!");
			return false;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency x for procedure BiomeSpawn!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency y for procedure BiomeSpawn!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency z for procedure BiomeSpawn!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD) == (World.OVERWORLD)) {
			if (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
					&& BiomeDictionary.hasType(
							RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
									world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))),
							BiomeDictionary.Type.HILLS)
					|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
							&& BiomeDictionary.hasType(
									RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
											world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))),
									BiomeDictionary.Type.SWAMP)
					|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
							&& BiomeDictionary.hasType(
									RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
											world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))),
									BiomeDictionary.Type.SANDY)
					|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
							&& BiomeDictionary.hasType(
									RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
											world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))),
									BiomeDictionary.Type.SNOWY)
					|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
							&& BiomeDictionary.hasType(
									RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
											world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))),
									BiomeDictionary.Type.FOREST)
					|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
							&& BiomeDictionary.hasType(
									RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
											world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))),
									BiomeDictionary.Type.MESA)
					|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
							&& BiomeDictionary.hasType(
									RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
											world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))),
									BiomeDictionary.Type.PLAINS)
					|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
							&& BiomeDictionary.hasType(
									RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
											world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))),
									BiomeDictionary.Type.MOUNTAIN)
					|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
							&& BiomeDictionary.hasType(
									RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
											world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))),
									BiomeDictionary.Type.WASTELAND)
					|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
							&& BiomeDictionary.hasType(
									RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
											world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))),
									BiomeDictionary.Type.SAVANNA)
					|| world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
							&& BiomeDictionary.hasType(
									RegistryKey.getOrCreateKey(Registry.BIOME_KEY,
											world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))),
									BiomeDictionary.Type.JUNGLE)) {
				if (world.getLight(new BlockPos(x, y, z)) <= 7) {
					return true;
				}
			}
		}
		return false;
	}
}
