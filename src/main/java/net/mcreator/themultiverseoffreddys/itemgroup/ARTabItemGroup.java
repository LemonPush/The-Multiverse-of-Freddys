
package net.mcreator.themultiverseoffreddys.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.themultiverseoffreddys.item.ARiconItem;
import net.mcreator.themultiverseoffreddys.UltimateFnafModModElements;

@UltimateFnafModModElements.ModElement.Tag
public class ARTabItemGroup extends UltimateFnafModModElements.ModElement {
	public ARTabItemGroup(UltimateFnafModModElements instance) {
		super(instance, 1077);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabar_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ARiconItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
