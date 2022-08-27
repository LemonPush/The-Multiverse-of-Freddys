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
import net.mcreator.themultiverseoffreddys.entity.WheelchairBurntrapEntity;
import net.mcreator.themultiverseoffreddys.entity.UpgradedGlamrockFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.TeaserNightmareFredbearEntity;
import net.mcreator.themultiverseoffreddys.entity.StuffedSuitEntity;
import net.mcreator.themultiverseoffreddys.entity.ScottCawthonEntity;
import net.mcreator.themultiverseoffreddys.entity.PhoneDudeEntity;
import net.mcreator.themultiverseoffreddys.entity.OriginsPuppetEntity;
import net.mcreator.themultiverseoffreddys.entity.NightmareFreddyBearEntity;
import net.mcreator.themultiverseoffreddys.entity.HighSchoolEntity;
import net.mcreator.themultiverseoffreddys.entity.GoldenHeadEntity;
import net.mcreator.themultiverseoffreddys.entity.GamesSpringtrapEntity;
import net.mcreator.themultiverseoffreddys.entity.EclipseEntity;
import net.mcreator.themultiverseoffreddys.entity.DystopianMichaelEntity;
import net.mcreator.themultiverseoffreddys.entity.CoffeeEntity;
import net.mcreator.themultiverseoffreddys.entity.ChipperEntity;
import net.mcreator.themultiverseoffreddys.entity.CharlotteEntity;
import net.mcreator.themultiverseoffreddys.entity.BuffMapbotEntity;
import net.mcreator.themultiverseoffreddys.entity.BuffHelpyEntity;
import net.mcreator.themultiverseoffreddys.entity.BreadbearEntity;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;
import java.util.HashMap;

public class OtherSitProcedure {
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
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure OtherSit!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency sourceentity for procedure OtherSit!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == ParanormalDeviceItem.block) {
			if (entity instanceof ScottCawthonEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:scott_cawthon ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof ChipperEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:chipper ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof CoffeeEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:coffee ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof DystopianMichaelEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:dystopian_michael ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof BuffHelpyEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:buff_helpy ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof HighSchoolEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:high_school ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof OriginsPuppetEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:origins_puppet ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof BreadbearEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:breadbear ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof WheelchairBurntrapEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:wheelchair_burntrap ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof TeaserNightmareFredbearEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:teaser_nightmare_fredbear ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof NightmareFreddyBearEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:nightmare_freddy_bear ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof GoldenHeadEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:golden_head ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof GamesSpringtrapEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:games_springtrap ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof StuffedSuitEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:stuffed_suit ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof CharlotteEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:chalotte ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof BuffMapbotEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:buff_mapbot ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof PhoneDudeEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:phone_dude ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof EclipseEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:exlipse ~ ~ ~");
						}
					}
				}
			}
			if (entity instanceof UpgradedGlamrockFreddyEntity.CustomEntity) {
				if (!((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false)) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 9999999, (int) 7, (false), (false)));
				} else if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
					if (!entity.world.isRemote())
						entity.remove();
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent.world.getServer() != null) {
							_ent.world.getServer().getCommandManager().handleCommand(
									_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
									"summon ultimate_fnaf_mod:upgraded_glamrock_freddy ~ ~ ~");
						}
					}
				}
			}
		}
	}
}
