package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.themultiverseoffreddys.item.PresentItem;
import net.mcreator.themultiverseoffreddys.item.FazBlasterItem;
import net.mcreator.themultiverseoffreddys.block.FredbearPlushBlock;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.function.Supplier;
import java.util.Map;

public class HenrySetPageProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure HenrySetPage!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getDouble("playerTradePage") == 1) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (0)) == 0) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity.getPersistentData().getDouble("playerTradeItem1") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(FredbearPlushBlock.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (2))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity.getPersistentData().getDouble("playerTradeItem1") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(FredbearPlushBlock.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount1")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 2) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (0)) == 0) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity.getPersistentData().getDouble("playerTradeItem2") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(PresentItem.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (2))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity.getPersistentData().getDouble("playerTradeItem2") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(PresentItem.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount2")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("playerTradePage") == 3) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (0)) == 0) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity.getPersistentData().getDouble("playerTradeItem3") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(FazBlasterItem.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (2))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			} else {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (2))).putStack(ItemStack.EMPTY);
							_current.detectAndSendChanges();
						}
					}
				}
				if (entity.getPersistentData().getDouble("playerTradeItem3") == 1) {
					if (entity instanceof PlayerEntity) {
						Container _current = ((PlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack _setstack = new ItemStack(FazBlasterItem.block);
								_setstack.setCount((int) (entity.getPersistentData().getDouble("playerTradeCount3")));
								((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
								_current.detectAndSendChanges();
							}
						}
					}
				}
			}
		}
	}
}
