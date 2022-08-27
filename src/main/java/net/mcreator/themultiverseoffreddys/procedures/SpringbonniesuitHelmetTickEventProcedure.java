package net.mcreator.themultiverseoffreddys.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.themultiverseoffreddys.potion.SpringlockPotionEffect;
import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.Map;

public class SpringbonniesuitHelmetTickEventProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency entity for procedure SpringbonniesuitHelmetTickEvent!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				UltimateFnafModMod.LOGGER.warn("Failed to load dependency itemstack for procedure SpringbonniesuitHelmetTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity.isInWaterRainOrBubbleColumn()) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(SpringlockPotionEffect.potion, (int) 60, (int) 1));
			(itemstack).addEnchantment(Enchantments.BINDING_CURSE, (int) 0);
		}
		if (!entity.isInWaterRainOrBubbleColumn()) {
			{
				Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
				if (_enchantments.containsKey(Enchantments.BINDING_CURSE)) {
					_enchantments.remove(Enchantments.BINDING_CURSE);
					EnchantmentHelper.setEnchantments(_enchantments, itemstack);
				}
			}
		}
	}
}
