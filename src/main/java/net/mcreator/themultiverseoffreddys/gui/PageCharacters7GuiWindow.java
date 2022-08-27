
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
public class PageCharacters7GuiWindow extends ContainerScreen<PageCharacters7Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PageCharacters7Gui.guistate;

	public PageCharacters7GuiWindow(PageCharacters7Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 276;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ultimate_fnaf_mod:textures/screens/page_characters_7.png");

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
		this.font.drawString(ms, "Characters", 56, 7, -16777216);
		this.font.drawString(ms, "Buff Mapbot:", 29, 106, -16777216);
		this.font.drawString(ms, "+ Buff Stuff", 38, 124, -16777216);
		this.font.drawString(ms, "Mapbot", 47, 115, -16777216);
		this.font.drawString(ms, "Breadbear:", 29, 34, -16777216);
		this.font.drawString(ms, "+ Remnant Syringe", 155, 52, -16777216);
		this.font.drawString(ms, "Burntrap", 164, 43, -16777216);
		this.font.drawString(ms, "Phone Dude:", 146, 106, -16777216);
		this.font.drawString(ms, "+ Rotten FLesh", 155, 88, -16777216);
		this.font.drawString(ms, "Characters", 173, 7, -16777216);
		this.font.drawString(ms, "+ Bread", 47, 52, -16777216);
		this.font.drawString(ms, "Phone Guy", 164, 115, -16777216);
		this.font.drawString(ms, "+ Buff Stuff", 38, 88, -16777216);
		this.font.drawString(ms, "N. Fredbear", 47, 43, -16777216);
		this.font.drawString(ms, "Freddy Fazbear", 164, 79, -16777216);
		this.font.drawString(ms, "Buff Helpy:", 29, 70, -16777216);
		this.font.drawString(ms, "Wheelchair Burntrap:", 146, 34, -16777216);
		this.font.drawString(ms, "Stuffed Freddy:", 146, 70, -16777216);
		this.font.drawString(ms, "Helpy ", 47, 79, -16777216);
		this.font.drawString(ms, "+ Green Dye", 155, 124, -16777216);
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
		this.addButton(new Button(this.guiLeft + 290, this.guiTop + 70, 46, 20, new StringTextComponent("Next"), e -> {
			if (true) {
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageCharacters7Gui.ButtonPressedMessage(0, x, y, z));
				PageCharacters7Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -60, this.guiTop + 70, 46, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageCharacters7Gui.ButtonPressedMessage(1, x, y, z));
				PageCharacters7Gui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
