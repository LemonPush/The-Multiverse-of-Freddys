
package net.mcreator.themultiverseoffreddys.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.themultiverseoffreddys.UltimateFnafModModElements;

@UltimateFnafModModElements.ModElement.Tag
public class Fnaf3iconItem extends UltimateFnafModModElements.ModElement {
	@ObjectHolder("ultimate_fnaf_mod:fnaf_3icon")
	public static final Item block = null;

	public Fnaf3iconItem(UltimateFnafModModElements instance) {
		super(instance, 952);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(null).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("fnaf_3icon");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
