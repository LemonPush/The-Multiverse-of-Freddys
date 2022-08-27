package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
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
import net.mcreator.themultiverseoffreddys.entity.TamedWilliamAftonEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedSpringtrapEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedSpringBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedShadowFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedShadowBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedNoSuitEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedEndo03Entity;
import net.mcreator.themultiverseoffreddys.entity.NoAIWilliamAftonEntity;
import net.mcreator.themultiverseoffreddys.entity.NoAISpringtrapEntity;
import net.mcreator.themultiverseoffreddys.entity.NoAISpringBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.NoAIShadowFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.NoAIShadowBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.NoAINoSuitEntity;
import net.mcreator.themultiverseoffreddys.entity.NoAIEndo03Entity;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

public class FNaF3OfflineProcedure {
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
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency world for procedure FNaF3Offline!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency x for procedure FNaF3Offline!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency y for procedure FNaF3Offline!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency z for procedure FNaF3Offline!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure FNaF3Offline!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency sourceentity for procedure FNaF3Offline!");
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
			if (entity instanceof TamedSpringtrapEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAISpringtrapEntity.CustomEntity(NoAISpringtrapEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (entity instanceof TamedSpringBonnieEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAISpringBonnieEntity.CustomEntity(NoAISpringBonnieEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (entity instanceof TamedNoSuitEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAINoSuitEntity.CustomEntity(NoAINoSuitEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (entity instanceof TamedEndo03Entity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAIEndo03Entity.CustomEntity(NoAIEndo03Entity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (entity instanceof TamedWilliamAftonEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAIWilliamAftonEntity.CustomEntity(NoAIWilliamAftonEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (entity instanceof TamedShadowFreddyEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAIShadowFreddyEntity.CustomEntity(NoAIShadowFreddyEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (entity instanceof TamedShadowBonnieEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new NoAIShadowBonnieEntity.CustomEntity(NoAIShadowBonnieEntity.entity, (World) world);
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
			if (entity instanceof NoAISpringtrapEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedSpringtrapEntity.CustomEntity(TamedSpringtrapEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((((Entity) world
						.getEntitiesWithinAABB(TamedSpringtrapEntity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedSpringtrapEntity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamed(true);
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedSpringtrapEntity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamedBy((PlayerEntity) sourceentity);
				}
			}
			if (entity instanceof NoAISpringBonnieEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedSpringBonnieEntity.CustomEntity(TamedSpringBonnieEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((((Entity) world
						.getEntitiesWithinAABB(TamedSpringBonnieEntity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedSpringBonnieEntity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamed(true);
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedSpringBonnieEntity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamedBy((PlayerEntity) sourceentity);
				}
			}
			if (entity instanceof NoAINoSuitEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedNoSuitEntity.CustomEntity(TamedNoSuitEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((((Entity) world
						.getEntitiesWithinAABB(TamedNoSuitEntity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedNoSuitEntity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamed(true);
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedNoSuitEntity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamedBy((PlayerEntity) sourceentity);
				}
			}
			if (entity instanceof NoAIEndo03Entity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedEndo03Entity.CustomEntity(TamedEndo03Entity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((((Entity) world
						.getEntitiesWithinAABB(TamedEndo03Entity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedEndo03Entity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamed(true);
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedEndo03Entity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamedBy((PlayerEntity) sourceentity);
				}
			}
			if (entity instanceof NoAIWilliamAftonEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedWilliamAftonEntity.CustomEntity(TamedWilliamAftonEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((((Entity) world
						.getEntitiesWithinAABB(TamedWilliamAftonEntity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedWilliamAftonEntity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamed(true);
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedWilliamAftonEntity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamedBy((PlayerEntity) sourceentity);
				}
			}
			if (entity instanceof NoAIShadowFreddyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedShadowFreddyEntity.CustomEntity(TamedShadowFreddyEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((((Entity) world
						.getEntitiesWithinAABB(TamedShadowFreddyEntity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedShadowFreddyEntity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamed(true);
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedShadowFreddyEntity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamedBy((PlayerEntity) sourceentity);
				}
			}
			if (entity instanceof NoAIShadowBonnieEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new TamedShadowBonnieEntity.CustomEntity(TamedShadowBonnieEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				if ((((Entity) world
						.getEntitiesWithinAABB(TamedShadowBonnieEntity.CustomEntity.class,
								new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedShadowBonnieEntity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamed(true);
					((TameableEntity) ((Entity) world
							.getEntitiesWithinAABB(TamedShadowBonnieEntity.CustomEntity.class,
									new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null))).setTamedBy((PlayerEntity) sourceentity);
				}
			}
		}
	}
}
