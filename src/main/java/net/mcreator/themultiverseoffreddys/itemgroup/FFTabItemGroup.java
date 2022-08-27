
package net.mcreator.themultiverseoffreddys.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.themultiverseoffreddys.item.FFiconItem;
import net.mcreator.themultiverseoffreddys.UltimateFnafModModElements;

@UltimateFnafModModElements.ModElement.Tag
public class FFTabItemGroup extends UltimateFnafModModElements.ModElement {
	public FFTabItemGroup(UltimateFnafModModElements instance) {
		super(instance, 1079);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabff_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(FFiconItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
