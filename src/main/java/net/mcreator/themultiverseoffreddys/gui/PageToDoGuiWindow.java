
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
public class PageToDoGuiWindow extends ContainerScreen<PageToDoGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PageToDoGui.guistate;

	public PageToDoGuiWindow(PageToDoGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 276;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ultimate_fnaf_mod:textures/screens/page_to_do.png");

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
		this.font.drawString(ms, "To-Do", 65, 7, -16777216);
		this.font.drawString(ms, "Faz-Coins as ", 29, 43, -16777216);
		this.font.drawString(ms, "possible.", 29, 52, -16777216);
		this.font.drawString(ms, "in the Ballpit,", 29, 88, -16777216);
		this.font.drawString(ms, "location and get", 29, 79, -16777216);
		this.font.drawString(ms, "once you get in ", 29, 97, -16777216);
		this.font.drawString(ms, "find the Flipside", 29, 106, -16777216);
		this.font.drawString(ms, "Arcade and give", 29, 115, -16777216);
		this.font.drawString(ms, "1. Gather as many", 29, 34, -16777216);
		this.font.drawString(ms, "2. Look for a FNaF", 29, 70, -16777216);
		this.font.drawString(ms, "it coins order to", 29, 124, -16777216);
		this.font.drawString(ms, "to get Faz-Tickets.", 29, 133, -16777216);
		this.font.drawString(ms, "and give ", 182, 43, -16777216);
		this.font.drawString(ms, "William ", 146, 43, -10092442);
		this.font.drawString(ms, "3. Find           or", 146, 34, -16777216);
		this.font.drawString(ms, "them the Faz-Tickets", 146, 52, -16777216);
		this.font.drawString(ms, "in order to trade", 146, 61, -16777216);
		this.font.drawString(ms, "with them. If you ", 146, 70, -16777216);
		this.font.drawString(ms, "Henry", 187, 34, -13395712);
		this.font.drawString(ms, "find them in the wild", 146, 79, -16777216);
		this.font.drawString(ms, "To-Do", 182, 7, -16777216);
		this.font.drawString(ms, "you'll have to tame", 146, 88, -16777216);
		this.font.drawString(ms, "them first. If you", 146, 97, -16777216);
		this.font.drawString(ms, "spawned them with", 146, 106, -16777216);
		this.font.drawString(ms, "items then they will", 146, 115, -16777216);
		this.font.drawString(ms, "already be tamed.", 146, 124, -16777216);
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
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageToDoGui.ButtonPressedMessage(0, x, y, z));
				PageToDoGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
