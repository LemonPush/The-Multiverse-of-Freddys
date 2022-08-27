package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.item.ParanormalDeviceItem;
import net.mcreator.themultiverseoffreddys.entity.TamedMinireenaEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedFuntimeFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedFuntimeFoxyEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedEnnardEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedCircusBabyEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedBidybabEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedBalloraEntity;
import net.mcreator.themultiverseoffreddys.entity.NoAiMinireenaEntity;
import net.mcreator.themultiverseoffreddys.entity.NoAiEnnardEntity;
import net.mcreator.themultiverseoffreddys.entity.NoAiBidyBabEntity;
import net.mcreator.themultiverseoffreddys.entity.NoAIFuntimeFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.NoAIFuntimeFoxyEntity;
import net.mcreator.themultiverseoffreddys.entity.NoAICircusBabyEntity;
import net.mcreator.themultiverseoffreddys.entity.NoAIBalloraEntity;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;
import java.util.HashMap;

public class FNaFSLOfflineProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
			Entity entity = event.getTarget();
			PlayerEntity sourceentity = event.getPlayer();
			if (event.getHand() != sourceentity.getActiveHand()) {
				return;
			}
			double i = event.getPos().getX();
			double j = event.getPos().getY();
			double k = event.getPos().getZ();
			IWorld world = event.getWorld();
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

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency world for procedure FNaFSLOffline!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency x for procedure FNaFSLOffline!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency y for procedure FNaFSLOffline!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency z for procedure FNaFSLOffline!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure FNaFSLOffline!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency sourceentity for procedure FNaFSLOffline!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == ParanormalDeviceItem.block) {
			if (entity instanceof TamedCircusBabyEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAICircusBabyEntity.CustomEntity(NoAICircusBabyEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (entity instanceof TamedBalloraEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAIBalloraEntity.CustomEntity(NoAIBalloraEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (entity instanceof TamedFuntimeFreddyEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAIFuntimeFreddyEntity.CustomEntity(NoAIFuntimeFreddyEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (entity instanceof TamedFuntimeFoxyEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAIFuntimeFoxyEntity.CustomEntity(NoAIFuntimeFoxyEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (entity instanceof TamedBidybabEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAiBidyBabEntity.CustomEntity(NoAiBidyBabEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (entity instanceof TamedMinireenaEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAiMinireenaEntity.CustomEntity(NoAiMinireenaEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (entity instanceof TamedEnnardEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAiEnnardEntity.CustomEntity(NoAiEnnardEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == ParanormalDeviceItem.block) {
			if (entity instanceof NoAICircusBabyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedCircusBabyEntity.CustomEntity(TamedCircusBabyEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) entity).setTamed(true);
					((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
				}
			}
			if (entity instanceof NoAIBalloraEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedBalloraEntity.CustomEntity(TamedBalloraEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) entity).setTamed(true);
					((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
				}
			}
			if (entity instanceof NoAIFuntimeFreddyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedFuntimeFreddyEntity.CustomEntity(TamedFuntimeFreddyEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) entity).setTamed(true);
					((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
				}
			}
			if (entity instanceof NoAIFuntimeFoxyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedFuntimeFoxyEntity.CustomEntity(TamedFuntimeFoxyEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) entity).setTamed(true);
					((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
				}
			}
			if (entity instanceof NoAiBidyBabEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedBidybabEntity.CustomEntity(TamedBidybabEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) entity).setTamed(true);
					((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
				}
			}
			if (entity instanceof NoAiMinireenaEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedMinireenaEntity.CustomEntity(TamedMinireenaEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) entity).setTamed(true);
					((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
				}
			}
			if (entity instanceof NoAiEnnardEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedEnnardEntity.CustomEntity(TamedEnnardEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) entity).setTamed(true);
					((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
				}
			}
		}
	}
}
