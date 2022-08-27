
package net.mcreator.themultiverseoffreddys.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.themultiverseoffreddys.item.Fnaf8iconItem;
import net.mcreator.themultiverseoffreddys.UltimateFnafModModElements;

@UltimateFnafModModElements.ModElement.Tag
public class FNaF8TabItemGroup extends UltimateFnafModModElements.ModElement {
	public FNaF8TabItemGroup(UltimateFnafModModElements instance) {
		super(instance, 1052);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabf_na_f_8_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Fnaf8iconItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
