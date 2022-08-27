
package net.mcreator.themultiverseoffreddys.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PageFlipsideGuiWindow extends ContainerScreen<PageFlipsideGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PageFlipsideGui.guistate;

	public PageFlipsideGuiWindow(PageFlipsideGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 276;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ultimate_fnaf_mod:textures/screens/page_flipside.png");

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
		this.font.drawString(ms, "FlipSide", 56, 7, -16737895);
		this.font.drawString(ms, "Multiverse; in here", 29, 43, -16777216);
		this.font.drawString(ms, "you can visit any", 29, 52, -16777216);
		this.font.drawString(ms, "Five Nights at", 29, 61, -16777216);
		this.font.drawString(ms, "realities.", 29, 79, -16777216);
		this.font.drawString(ms, "Scott Cawthon,", 47, 97, -16777216);
		this.font.drawString(ms, "now named Desk Man,", 29, 106, -16777216);
		this.font.drawString(ms, "guards these vast", 29, 115, -16777216);
		this.font.drawString(ms, "Welcome to the", 47, 34, -16777216);
		this.font.drawString(ms, "Freddy's related", 29, 70, -16777216);
		this.font.drawString(ms, "realities and makes", 29, 124, -16777216);
		this.font.drawString(ms, "sure none of them", 29, 133, -16777216);
		this.font.drawString(ms, "stray too far.", 29, 142, -16777216);
		this.font.drawString(ms, "There are only 4", 164, 34, -16777216);
		this.font.drawString(ms, "known realities for", 146, 43, -16777216);
		this.font.drawString(ms, "you to visit, however", 146, 52, -16777216);
		this.font.drawString(ms, "there is a 5th and", 146, 61, -16777216);
		this.font.drawString(ms, "this one is not meant", 146, 70, -16777216);
		this.font.drawString(ms, "for any visitors...", 146, 79, -16777216);
		this.font.drawString(ms, "Be careful when", 164, 97, -16777216);
		this.font.drawString(ms, "traveling into these", 146, 106, -16777216);
		this.font.drawString(ms, "FlipSide", 173, 7, -16737895);
		this.font.drawString(ms, "frightening new", 146, 115, -16777216);
		this.font.drawString(ms, "worlds, be prepared", 146, 124, -16777216);
		this.font.drawString(ms, "for anything...", 146, 133, -16777216);
		this.font.drawString(ms, "dangerous...", 146, 142, -16777216);
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
	}
}
