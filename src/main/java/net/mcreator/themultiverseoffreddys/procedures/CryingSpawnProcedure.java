package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.entity.YenndoEntity;
import net.mcreator.themultiverseoffreddys.entity.WitheredGoldenFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.WitheredFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.WitheredFoxyEntity;
import net.mcreator.themultiverseoffreddys.entity.WitheredChicaEntity;
import net.mcreator.themultiverseoffreddys.entity.WitheredBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.ToyFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.ToyChicaEntity;
import net.mcreator.themultiverseoffreddys.entity.ToyBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.ScrapBabyEntity;
import net.mcreator.themultiverseoffreddys.entity.PuppetEntity;
import net.mcreator.themultiverseoffreddys.entity.MoltenFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.MangleEntity;
import net.mcreator.themultiverseoffreddys.entity.LeftyEntity;
import net.mcreator.themultiverseoffreddys.entity.GoldenFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.FuntimeFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.FuntimeFoxyEntity;
import net.mcreator.themultiverseoffreddys.entity.FreddyFazbearEntity;
import net.mcreator.themultiverseoffreddys.entity.FoxyThePirateFoxEntity;
import net.mcreator.themultiverseoffreddys.entity.EnnardEntity;
import net.mcreator.themultiverseoffreddys.entity.CryingChildEntity;
import net.mcreator.themultiverseoffreddys.entity.CircusBabyEntity;
import net.mcreator.themultiverseoffreddys.entity.ChicaTheChickenEntity;
import net.mcreator.themultiverseoffreddys.entity.BonnieTheRabbitEntity;
import net.mcreator.themultiverseoffreddys.entity.BalloraEntity;
import net.mcreator.themultiverseoffreddys.entity.BalloonBoyEntity;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;
import java.util.HashMap;

public class CryingSpawnProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityDeath(LivingDeathEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency world for procedure CryingSpawn!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency x for procedure CryingSpawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency y for procedure CryingSpawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency z for procedure CryingSpawn!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure CryingSpawn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof FreddyFazbearEntity.CustomEntity || entity instanceof BonnieTheRabbitEntity.CustomEntity
				|| entity instanceof ChicaTheChickenEntity.CustomEntity || entity instanceof FoxyThePirateFoxEntity.CustomEntity
				|| entity instanceof ToyFreddyEntity.CustomEntity || entity instanceof ToyBonnieEntity.CustomEntity
				|| entity instanceof ToyChicaEntity.CustomEntity || entity instanceof MangleEntity.CustomEntity
				|| entity instanceof WitheredFreddyEntity.CustomEntity || entity instanceof WitheredBonnieEntity.CustomEntity
				|| entity instanceof WitheredChicaEntity.CustomEntity || entity instanceof WitheredFoxyEntity.CustomEntity
				|| entity instanceof GoldenFreddyEntity.CustomEntity || entity instanceof PuppetEntity.CustomEntity
				|| entity instanceof BalloonBoyEntity.CustomEntity || entity instanceof WitheredGoldenFreddyEntity.CustomEntity
				|| entity instanceof CircusBabyEntity.CustomEntity || entity instanceof BalloraEntity.CustomEntity
				|| entity instanceof FuntimeFreddyEntity.CustomEntity || entity instanceof FuntimeFoxyEntity.CustomEntity
				|| entity instanceof YenndoEntity.CustomEntity || entity instanceof ScrapBabyEntity.CustomEntity
				|| entity instanceof LeftyEntity.CustomEntity) {
			if (Math.random() * 10 >= 5) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new CryingChildEntity.CustomEntity(CryingChildEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
		}
		if (entity instanceof EnnardEntity.CustomEntity || entity instanceof MoltenFreddyEntity.CustomEntity) {
			if (Math.random() * 10 >= 5) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new CryingChildEntity.CustomEntity(CryingChildEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new CryingChildEntity.CustomEntity(CryingChildEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new CryingChildEntity.CustomEntity(CryingChildEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new CryingChildEntity.CustomEntity(CryingChildEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new CryingChildEntity.CustomEntity(CryingChildEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
