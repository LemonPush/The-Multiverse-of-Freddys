
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
public class PageCharacters1GuiWindow extends ContainerScreen<PageCharacters1Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PageCharacters1Gui.guistate;

	public PageCharacters1GuiWindow(PageCharacters1Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 276;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ultimate_fnaf_mod:textures/screens/page_characters_1.png");

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
		this.font.drawString(ms, "Small:", 29, 70, -16777216);
		this.font.drawString(ms, "Huge:", 29, 43, -16777216);
		this.font.drawString(ms, "Tiny:", 29, 79, -16777216);
		this.font.drawString(ms, "Normal:", 29, 61, -16777216);
		this.font.drawString(ms, "Type  Health  Damage", 29, 34, -16777216);
		this.font.drawString(ms, "Big:", 29, 52, -16777216);
		this.font.drawString(ms, "Unique Tamed stats", 146, 34, -16777216);
		this.font.drawString(ms, "Nightmare stats", 29, 133, -16777216);
		this.font.drawString(ms, "Special:", 29, 88, -16777216);
		this.font.drawString(ms, "count as \"Big\"", 29, 142, -16777216);
		this.font.drawString(ms, "Phantom stats", 29, 106, -16777216);
		this.font.drawString(ms, "count as \"Tiny\"", 29, 115, -16777216);
		this.font.drawString(ms, "Characters", 173, 7, -16777216);
		this.font.drawString(ms, "count as \"Special\"", 146, 43, -16777216);
		this.font.drawString(ms, "plus 10 HP and DMG", 146, 142, -16777216);
		this.font.drawString(ms, "DJ Music Man stats", 146, 61, -16777216);
		this.font.drawString(ms, "and Blob stats", 146, 70, -16777216);
		this.font.drawString(ms, "count as \"Huge\"", 146, 79, -16777216);
		this.font.drawString(ms, "Taming characters", 146, 124, -16777216);
		this.font.drawString(ms, "rewards them with", 146, 133, -16777216);
		this.font.drawString(ms, "60        30", 74, 43, -16777216);
		this.font.drawString(ms, "30        15", 74, 52, -16777216);
		this.font.drawString(ms, "20        10", 74, 61, -16777216);
		this.font.drawString(ms, "10         5", 74, 70, -16777216);
		this.font.drawString(ms, " 5          2", 74, 79, -16777216);
		this.font.drawString(ms, "40        20 ", 74, 88, -16777216);
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
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageCharacters1Gui.ButtonPressedMessage(0, x, y, z));
				PageCharacters1Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
