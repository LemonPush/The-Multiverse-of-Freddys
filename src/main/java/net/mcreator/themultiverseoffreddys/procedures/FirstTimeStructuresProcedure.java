package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.Mirror;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.UltimateFnafModModVariables;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;
import java.util.HashMap;

public class FirstTimeStructuresProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			Entity entity = event.getPlayer();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", entity.getPosX());
			dependencies.put("y", entity.getPosY());
			dependencies.put("z", entity.getPosZ());
			dependencies.put("world", entity.world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency world for procedure FirstTimeStructures!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure FirstTimeStructures!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = ((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new UltimateFnafModModVariables.PlayerVariables())).FirstTime + 1);
			entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.FirstTime = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(UltimateFnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new UltimateFnafModModVariables.PlayerVariables())).FirstTime == 1) {
			if (world instanceof ServerWorld) {
				IWorld _worldorig = world;
				world = ((ServerWorld) world).getServer()
						.getWorld(RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("ultimate_fnaf_mod:memories")));
				if (world != null) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("ultimate_fnaf_mod", "happiestday"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world, new BlockPos(0, 64, 0),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							if (world instanceof ServerWorld) {
								Template template = ((ServerWorld) world).getStructureTemplateManager()
										.getTemplateDefaulted(new ResourceLocation("ultimate_fnaf_mod", "ucn"));
								if (template != null) {
									template.func_237144_a_((ServerWorld) world, new BlockPos(25, 64, -100), new PlacementSettings()
											.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
											((World) world).rand);
								}
							}
							if (world instanceof ServerWorld) {
								Template template = ((ServerWorld) world).getStructureTemplateManager()
										.getTemplateDefaulted(new ResourceLocation("ultimate_fnaf_mod", "partyworld"));
								if (template != null) {
									template.func_237144_a_((ServerWorld) world, new BlockPos(100, 64, 100), new PlacementSettings()
											.setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
											((World) world).rand);
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 20);
				}
				world = _worldorig;
			}
			if (world instanceof ServerWorld) {
				IWorld _worldorig = world;
				world = ((ServerWorld) world).getServer()
						.getWorld(RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("ultimate_fnaf_mod:the_flip_side")));
				if (world != null) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("ultimate_fnaf_mod", "house"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world, new BlockPos(-30, 55, -6),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
				world = _worldorig;
			}
		}
	}
}
