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
import net.mcreator.themultiverseoffreddys.entity.TamedWoodlandToyFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedSwampBBEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedRingmasterFoxyEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedMagicianMangleEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedClownSpringtrapEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedCatrinaToyChicaEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedBoulderToyBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.TamedBlackiceFrostbearEntity;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;
import java.util.HashMap;

public class ARSit3Procedure {
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
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure ARSit3!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ARSit3!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == ParanormalDeviceItem.block) {
			if (entity instanceof TamedRingmasterFoxyEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_ringmaster_foxy ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedClownSpringtrapEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_clown_springtrap ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedMagicianMangleEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_magician_mangle ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedCatrinaToyChicaEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_catrina_toy_chica ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedWoodlandToyFreddyEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_woodland_toy_freddy ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedBoulderToyBonnieEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_boulder_toy_bonnie ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedSwampBBEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_swamp_bb ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
			if (entity instanceof TamedBlackiceFrostbearEntity.CustomEntity) {
				if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:tamed_blackice_frostbear ~ ~ ~");
						}
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
			}
		}
	}
}
