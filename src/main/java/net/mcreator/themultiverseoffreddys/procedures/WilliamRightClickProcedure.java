package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraftforge.fml.network.NetworkHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketBuffer;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.gui.TradingWilliamGui;
import net.mcreator.themultiverseoffreddys.entity.TamedWilliamAftonEntity;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;

import io.netty.buffer.Unpooled;

public class WilliamRightClickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency world for procedure WilliamRightClick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency x for procedure WilliamRightClick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency y for procedure WilliamRightClick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency z for procedure WilliamRightClick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure WilliamRightClick!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency sourceentity for procedure WilliamRightClick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (entity instanceof TamedWilliamAftonEntity.CustomEntity) {
			sourceentity.getPersistentData().putDouble("playerTradeCount1", (entity.getPersistentData().getDouble("tradeCount1")));
			sourceentity.getPersistentData().putDouble("playerTradeCount2", (entity.getPersistentData().getDouble("tradeCount2")));
			sourceentity.getPersistentData().putDouble("playerTradeCount3", (entity.getPersistentData().getDouble("tradeCount3")));
			sourceentity.getPersistentData().putDouble("playerTradeItem1", (entity.getPersistentData().getDouble("tradeItem1")));
			sourceentity.getPersistentData().putDouble("playerTradeItem2", (entity.getPersistentData().getDouble("tradeItem2")));
			sourceentity.getPersistentData().putDouble("playerTradeItem3", (entity.getPersistentData().getDouble("tradeItem3")));
			sourceentity.getPersistentData().putDouble("playerTradePage", 1);
			{
				Entity _ent = sourceentity;
				if (_ent instanceof ServerPlayerEntity) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayerEntity) _ent, new INamedContainerProvider() {
						@Override
						public ITextComponent getDisplayName() {
							return new StringTextComponent("TradingWilliam");
						}

						@Override
						public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
							return new TradingWilliamGui.GuiContainerMod(id, inventory, new PacketBuffer(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
	}
}
