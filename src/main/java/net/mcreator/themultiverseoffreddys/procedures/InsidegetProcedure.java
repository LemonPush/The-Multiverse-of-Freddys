package net.mcreator.themultiverseoffreddys.procedures;

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
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.UltimateFnafModModVariables;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;
import java.util.Collections;

public class InsidegetProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency world for procedure Insideget!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure Insideget!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if ((World.OVERWORLD) == (entity.world.getDimensionKey())) {
			{
				double _setval = (entity.getPosX());
				entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ballpitX = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getPosY());
				entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ballpitY = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (entity.getPosZ());
				entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ballpitZ = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
					RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
							new ResourceLocation("ultimate_fnaf_mod:memories"));
					ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
					if (nextWorld != null) {
						((ServerPlayerEntity) _ent).connection.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
						((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(), nextWorld.getSpawnPoint().getY() + 1,
								nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
						((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
						for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
							((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
						}
						((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
			}
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate(1.5, 68, 4.5);
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation(1.5, 68, 4.5, _ent.rotationYaw, _ent.rotationPitch,
							Collections.emptySet());
				}
			}
		} else if ((RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("ultimate_fnaf_mod:memories"))) == (entity.world
				.getDimensionKey())) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
					RegistryKey<World> destinationType = World.OVERWORLD;
					ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
					if (nextWorld != null) {
						((ServerPlayerEntity) _ent).connection.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
						((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(), nextWorld.getSpawnPoint().getY() + 1,
								nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw, _ent.rotationPitch);
						((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
						for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
							((ServerPlayerEntity) _ent).connection.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
						}
						((ServerPlayerEntity) _ent).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
			}
			if ((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UltimateFnafModModVariables.PlayerVariables())).ballpitX == 0
					&& (entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UltimateFnafModModVariables.PlayerVariables())).ballpitY == 0
					&& (entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new UltimateFnafModModVariables.PlayerVariables())).ballpitZ == 0) {
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
									.orElse(new UltimateFnafModModVariables.PlayerVariables())).ballpitX),
							((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UltimateFnafModModVariables.PlayerVariables())).ballpitY),
							((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new UltimateFnafModModVariables.PlayerVariables())).ballpitZ));
					if (_ent instanceof ServerPlayerEntity) {
						((ServerPlayerEntity) _ent).connection.setPlayerLocation(
								((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new UltimateFnafModModVariables.PlayerVariables())).ballpitX),
								((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new UltimateFnafModModVariables.PlayerVariables())).ballpitY),
								((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new UltimateFnafModModVariables.PlayerVariables())).ballpitZ),
								_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
					}
				}
			}
		}
	}
}
