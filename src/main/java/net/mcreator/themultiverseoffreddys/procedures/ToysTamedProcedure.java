package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.item.SodaItem;
import net.mcreator.themultiverseoffreddys.item.GreenBraceletItem;
import net.mcreator.themultiverseoffreddys.entity.ToyFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.ToyChicaEntity;
import net.mcreator.themultiverseoffreddys.entity.ToyBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.PuppetEntity;
import net.mcreator.themultiverseoffreddys.entity.PaperPalsEntity;
import net.mcreator.themultiverseoffreddys.entity.MangleEntity;
import net.mcreator.themultiverseoffreddys.entity.JJEntity;
import net.mcreator.themultiverseoffreddys.entity.FuntimeFoxy2Entity;
import net.mcreator.themultiverseoffreddys.entity.BalloonBoyEntity;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;
import java.util.HashMap;

public class ToysTamedProcedure {
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
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure ToysTamed!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ToysTamed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (entity instanceof PuppetEntity.CustomEntity) {
			if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == GreenBraceletItem.block) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:tamed_puppet ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(GreenBraceletItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
		}
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == SodaItem.block) {
			if (entity instanceof ToyFreddyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_toy_freddy ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SodaItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof ToyBonnieEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_toy_bonnie ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SodaItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof ToyChicaEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_toy_chica ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SodaItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof MangleEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:tamed_mangle ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SodaItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof BalloonBoyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_balloon_boy ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SodaItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof JJEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "summon ultimate_fnaf_mod:tamed_jj ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SodaItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof PaperPalsEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_paper_pals ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SodaItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof FuntimeFoxy2Entity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_funtime_foxy_2 ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(SodaItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
		}
	}
}
