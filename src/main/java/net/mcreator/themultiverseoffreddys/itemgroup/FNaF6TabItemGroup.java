
package net.mcreator.themultiverseoffreddys.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.themultiverseoffreddys.item.Fnaf6iconItem;
import net.mcreator.themultiverseoffreddys.UltimateFnafModModElements;

@UltimateFnafModModElements.ModElement.Tag
public class FNaF6TabItemGroup extends UltimateFnafModModElements.ModElement {
	public FNaF6TabItemGroup(UltimateFnafModModElements instance) {
		super(instance, 1017);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabf_na_f_6_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Fnaf6iconItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
