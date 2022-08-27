package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.item.KnifeItem;
import net.mcreator.themultiverseoffreddys.item.AgonyItem;
import net.mcreator.themultiverseoffreddys.entity.WilliamAftonEntity;
import net.mcreator.themultiverseoffreddys.entity.SpringtrapEntity;
import net.mcreator.themultiverseoffreddys.entity.SpringBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.ShadowFreddyEntity;
import net.mcreator.themultiverseoffreddys.entity.ShadowBonnieEntity;
import net.mcreator.themultiverseoffreddys.entity.NoSuitEntity;
import net.mcreator.themultiverseoffreddys.entity.Endo03Entity;
import net.mcreator.themultiverseoffreddys.block.ShadowFreddyPlushBlock;
import net.mcreator.themultiverseoffreddys.block.ShadowBonniePlushBlock;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;
import java.util.HashMap;

public class FNaF3TamedProcedure {
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
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure FNaF3Tamed!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency sourceentity for procedure FNaF3Tamed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == KnifeItem.block) {
			if (entity instanceof SpringtrapEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_springtrap ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(KnifeItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof NoSuitEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_no_suit ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(KnifeItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof WilliamAftonEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_william_afton ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(KnifeItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
		}
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == ShadowFreddyPlushBlock.block.asItem()) {
			if (entity instanceof ShadowFreddyEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_shadow_freddy ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(ShadowFreddyPlushBlock.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
		}
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == ShadowBonniePlushBlock.block.asItem()) {
			if (entity instanceof ShadowBonnieEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_shadow_bonnie ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(ShadowBonniePlushBlock.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
		}
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == AgonyItem.block) {
			if (entity instanceof SpringBonnieEntity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_spring_bonnie ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(AgonyItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
			if (entity instanceof Endo03Entity.CustomEntity) {
				if (!entity.world.isRemote())
					entity.remove();
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"summon ultimate_fnaf_mod:tamed_endo_03 ~ ~ ~");
					}
				}
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(AgonyItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
				}
			}
		}
	}
}
