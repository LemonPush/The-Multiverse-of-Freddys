package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.item.BatteryItem;
import net.mcreator.themultiverseoffreddys.entity.WitheredRoxyEntity;
import net.mcreator.themultiverseoffreddys.entity.WitheredMontyEntity;
import net.mcreator.themultiverseoffreddys.entity.WitheredGlamrockChicaEntity;
import net.mcreator.themultiverseoffreddys.entity.VannyEntity;
import net.mcreator.themultiverseoffreddys.entity.SunEntity;
import net.mcreator.themultiverseoffreddys.entity.StaffBotEntity;
import net.mcreator.themultiverseoffreddys.entity.SewerBotEntity;
import net.mcreator.themultiverseoffreddys.entity.RoxyEntity;
import net.mcreator.themultiverseoffreddys.entity.NightmarionneBotEntity;
import net.mcreator.themultiverseoffreddys.entity.MoonEntity;
import net.mcreator.themultiverseoffreddys.entity.MontyEntity;
import net.mcreator.themultiverseoffreddys.entity.MapBotEntity;
import net.mcreator.themultiverseoffreddys.entity.LittleMusicManEntity;
import net.mcreator.themultiverseoffreddys.entity.GlamrockFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.GlamrockEndoEntity;
import net.mcreator.themultiverseoffreddys.entity.GlamrockChicaEntity;
import net.mcreator.themultiverseoffreddys.entity.FrostEndoEntity;
import net.mcreator.themultiverseoffreddys.entity.DJMMEntity;
import net.mcreator.themultiverseoffreddys.entity.CleanBotEntity;
import net.mcreator.themultiverseoffreddys.entity.BurntrapEntity;
import net.mcreator.themultiverseoffreddys.entity.BlobEntity;
import net.mcreator.themultiverseoffreddys.block.SpringBonniePlushBlock;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;
import java.util.HashMap;

public class FNaF9TamedProcedure {
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
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure FNaF9Tamed!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency sourceentity for procedure FNaF9Tamed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == BatteryItem.block) {
			if (entity instanceof GlamrockFreddyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_glamrock_freddy ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof MontyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:tamed_monty ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof RoxyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:tamed_roxy ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof GlamrockChicaEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_glamrock_chica ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof SunEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:tamed_sun ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof MoonEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:tamed_moon ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof DJMMEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:tamed_djmm ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof StaffBotEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_staff_bot ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof GlamrockEndoEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_glamrock_endo ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof WitheredGlamrockChicaEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_withered_glamrock_chica ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof WitheredMontyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_withered_monty ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof WitheredRoxyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_withered_roxy ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof FrostEndoEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_frost_endo ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof NightmarionneBotEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_nightmarionne_bot ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof SewerBotEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_sewer_bot ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof LittleMusicManEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_little_music_man ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof CleanBotEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_clean_bot ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof MapBotEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_map_bot ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof BlobEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:tamed_blob ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(BatteryItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
		}
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == SpringBonniePlushBlock.block.asItem()) {
			if (entity instanceof VannyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:tamed_vanny ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SpringBonniePlushBlock.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof BurntrapEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_burntrap ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SpringBonniePlushBlock.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
		}
	}
}
