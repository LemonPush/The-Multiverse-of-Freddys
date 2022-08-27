package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.item.FazcoinItem;
import net.mcreator.themultiverseoffreddys.entity.VRToyFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.SystemErrorToyBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.ShamrockFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.HighscoreToyChicaEntity;
import net.mcreator.themultiverseoffreddys.entity.FrostbearEntity;
import net.mcreator.themultiverseoffreddys.entity.EasterBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.ChocolateBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.BitBabyEntity;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;
import java.util.HashMap;

public class ARTamed1Procedure {
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
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure ARTamed1!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ARTamed1!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == FazcoinItem.block) {
			if (entity instanceof FrostbearEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_frostbear ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(FazcoinItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof ShamrockFreddyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_shamrock_freddy ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(FazcoinItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof ChocolateBonnieEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_chocolatebonnie ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(FazcoinItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof EasterBonnieEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_easter_bonnie ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(FazcoinItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof VRToyFreddyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_vr_toy_freddy ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(FazcoinItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof SystemErrorToyBonnieEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_system_error_toy_bonnie ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(FazcoinItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof HighscoreToyChicaEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_highscore_toy_chica ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(FazcoinItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof BitBabyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_bitbaby ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(FazcoinItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
		}
	}
}
