
package net.mcreator.themultiverseoffreddys.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.themultiverseoffreddys.UltimateFnafModMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PageRevenge4GuiWindow extends ContainerScreen<PageRevenge4Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PageRevenge4Gui.guistate;

	public PageRevenge4GuiWindow(PageRevenge4Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 276;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ultimate_fnaf_mod:textures/screens/page_revenge_4.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("ultimate_fnaf_mod:textures/screens/page.png"));
		this.blit(ms, this.guiLeft + 0, this.guiTop + 0, 0, 0, 276, 166, 276, 166);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Cawthon's Revenge", 29, 7, -6750208);
		this.font.drawString(ms, "- Defeat Rage Quit,", 29, 52, -16777216);
		this.font.drawString(ms, "get his sword, and", 29, 61, -16777216);
		this.font.drawString(ms, "the Chips to gain", 29, 106, -16777216);
		this.font.drawString(ms, "the advantage.", 29, 115, -16777216);
		this.font.drawString(ms, "Mission", 56, 34, -16777216);
		this.font.drawString(ms, "minions and take", 29, 97, -16777216);
		this.font.drawString(ms, "Optional", 182, 34, -16777216);
		this.font.drawString(ms, "", 146, 52, -16777216);
		this.font.drawString(ms, "- Find the Faz-Town", 146, 52, -16777216);
		this.font.drawString(ms, "and have the folks", 146, 61, -16777216);
		this.font.drawString(ms, "join your fight.", 146, 70, -16777216);
		this.font.drawString(ms, "Cawthon's Revenge", 155, 7, -6750208);
		this.font.drawString(ms, "- Trade with Chipper", 146, 88, -16777216);
		this.font.drawString(ms, "- Defeat Rage Quit's", 29, 88, -16777216);
		this.font.drawString(ms, "for a big surpise.", 146, 97, -16777216);
		this.font.drawString(ms, "free this world.", 29, 70, -16777216);
		this.font.drawString(ms, "* Chica's M. R.", 38, 124, -16777216);
		this.font.drawString(ms, "* L.O.L.Z.H.A.X.", 38, 133, -16777216);
		this.font.drawString(ms, "* Dreamgeist", 38, 142, -16777216);
		this.font.drawString(ms, "* Sockpuppet", 38, 151, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + -60, this.guiTop + 70, 46, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageRevenge4Gui.ButtonPressedMessage(0, x, y, z));
				PageRevenge4Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
