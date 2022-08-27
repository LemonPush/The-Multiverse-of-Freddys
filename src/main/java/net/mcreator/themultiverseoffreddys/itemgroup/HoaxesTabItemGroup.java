
package net.mcreator.themultiverseoffreddys.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.themultiverseoffreddys.item.HoaxesIconItem;
import net.mcreator.themultiverseoffreddys.UltimateFnafModModElements;

@UltimateFnafModModElements.ModElement.Tag
public class HoaxesTabItemGroup extends UltimateFnafModModElements.ModElement {
	public HoaxesTabItemGroup(UltimateFnafModModElements instance) {
		super(instance, 1225);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabhoaxes_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(HoaxesIconItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
