package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.item.Lure8Item;
import net.mcreator.themultiverseoffreddys.entity.ShadowMangleEntity;
import net.mcreator.themultiverseoffreddys.entity.NightmareFredbearEndoEntity;
import net.mcreator.themultiverseoffreddys.entity.HardcoreChicaEntity;
import net.mcreator.themultiverseoffreddys.entity.HardcoreBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.GrimFoxyEntity;
import net.mcreator.themultiverseoffreddys.entity.GlitchtrapEntity;
import net.mcreator.themultiverseoffreddys.entity.EndoPlushEntity;
import net.mcreator.themultiverseoffreddys.entity.DreadbearEntity;
import net.mcreator.themultiverseoffreddys.entity.DarkFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.CaptainFoxyEntity;
import net.mcreator.themultiverseoffreddys.entity.BurntFoxyEntity;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;

public class Lure8RightClickedOnBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency world for procedure Lure8RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency x for procedure Lure8RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency y for procedure Lure8RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency z for procedure Lure8RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure Lure8RightClickedOnBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(Lure8Item.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new GlitchtrapEntity.CustomEntity(GlitchtrapEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new DarkFreddyEntity.CustomEntity(DarkFreddyEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new BurntFoxyEntity.CustomEntity(BurntFoxyEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new ShadowMangleEntity.CustomEntity(ShadowMangleEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new NightmareFredbearEndoEntity.CustomEntity(NightmareFredbearEndoEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new EndoPlushEntity.CustomEntity(EndoPlushEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new CaptainFoxyEntity.CustomEntity(CaptainFoxyEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new DreadbearEntity.CustomEntity(DreadbearEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new GrimFoxyEntity.CustomEntity(GrimFoxyEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new HardcoreBonnieEntity.CustomEntity(HardcoreBonnieEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new HardcoreChicaEntity.CustomEntity(HardcoreChicaEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles(x, (y + 1), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof MobEntity)
				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
			world.addEntity(entityToSpawn);
		}
	}
}
