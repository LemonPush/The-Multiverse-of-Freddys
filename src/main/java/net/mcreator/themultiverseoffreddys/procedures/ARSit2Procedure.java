package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.item.ParanormalDeviceItem;
import net.mcreator.themultiverseoffreddys.entity.TamedToxicSpringtrapEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedScorchingChicaEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedRadioactiveFoxyEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedLibertyChicaEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedFlamingSpringtrapEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedFlamethrowerBareEndoEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedFireworkFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedBroilerBabyEntity;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;
import java.util.HashMap;

public class ARSit2Procedure {
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
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure ARSit2!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ARSit2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == ParanormalDeviceItem.block) {
			if (entity instanceof TamedToxicSpringtrapEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_toxic_springtrap ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedRadioactiveFoxyEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_radioactive_foxy ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedFireworkFreddyEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_firework_freddy ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedLibertyChicaEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_liberty_chica ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedFlamethrowerBareEndoEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_flamthrower_bare_endo ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedBroilerBabyEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_broiler_baby ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedScorchingChicaEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_scorching_chica ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedFlamingSpringtrapEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_flaming_springtrap ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
		}
	}
}
