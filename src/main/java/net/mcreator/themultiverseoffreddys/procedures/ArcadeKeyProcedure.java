package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.potion.EffectInstance;
import net.minecraft.network.play.server.SPlayerAbilitiesPacket;
import net.minecraft.network.play.server.SPlaySoundEventPacket;
import net.minecraft.network.play.server.SPlayEntityEffectPacket;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.themultiverseoffreddys.item.ShadowRemnantItem;
import net.mcreator.themultiverseoffreddys.item.EmotionalEnergyItem;
import net.mcreator.themultiverseoffreddys.block.ArcadeBlock;
import net.mcreator.themultiverseoffreddys.UltimateFnafModModVariables;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class ArcadeKeyProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
			PlayerEntity entity = event.getPlayer();
			if (event.getHand() != entity.getActiveHand()) {
				return;
			}
			double i = event.getPos().getX();
			double j = event.getPos().getY();
			double k = event.getPos().getZ();
			IWorld world = event.getWorld();
			BlockState state = world.getBlockState(event.getPos());
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("direction", event.getFace());
			dependencies.put("blockstate", state);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency world for procedure ArcadeKey!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency x for procedure ArcadeKey!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency y for procedure ArcadeKey!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency z for procedure ArcadeKey!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure ArcadeKey!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ArcadeBlock.block) {
			if ((RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("ultimate_fnaf_mod:the_flip_side"))) == (entity.world
					.getDimensionKey())) {
				if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == ShadowRemnantItem.block
						|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
								.getItem() == EmotionalEnergyItem.block) {
					{
						Entity _ent = entity;
						if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
							RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
									new ResourceLocation("ultimate_fnaf_mod:memories"));
							ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
							if (nextWorld != null) {
								((ServerPlayerEntity) _ent).connection
										.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
								((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
										nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
								for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
									((ServerPlayerEntity) _ent).connection
											.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
								}
								((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
					}
					if ((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UltimateFnafModModVariables.PlayerVariables())).playerSpawnLocationX == 0
							&& (entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UltimateFnafModModVariables.PlayerVariables())).playerSpawnLocationY == 0
							&& (entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UltimateFnafModModVariables.PlayerVariables())).playerSpawnLocationZ == 0) {
						{
							Entity _ent = entity;
							_ent.setPositionAndUpdate((world.getWorldInfo().getSpawnX()), (world.getWorldInfo().getSpawnY()),
									(world.getWorldInfo().getSpawnZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((world.getWorldInfo().getSpawnX()),
										(world.getWorldInfo().getSpawnY()), (world.getWorldInfo().getSpawnZ()), _ent.rotationYaw, _ent.rotationPitch,
										Collections.emptySet());
							}
						}
					} else {
						{
							Entity _ent = entity;
							_ent.setPositionAndUpdate(
									((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new UltimateFnafModModVariables.PlayerVariables())).playerSpawnLocationX),
									((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new UltimateFnafModModVariables.PlayerVariables())).playerSpawnLocationY),
									((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new UltimateFnafModModVariables.PlayerVariables())).playerSpawnLocationZ));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation(
										((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new UltimateFnafModModVariables.PlayerVariables())).playerSpawnLocationX),
										((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new UltimateFnafModModVariables.PlayerVariables())).playerSpawnLocationY),
										((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new UltimateFnafModModVariables.PlayerVariables())).playerSpawnLocationZ),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
					}
				}
			}
		}
	}
}
