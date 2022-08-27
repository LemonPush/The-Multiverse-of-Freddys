
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
public class PageMechanics1GuiWindow extends ContainerScreen<PageMechanics1Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PageMechanics1Gui.guistate;

	public PageMechanics1GuiWindow(PageMechanics1Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 276;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ultimate_fnaf_mod:textures/screens/page_mechanics_1.png");

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
		this.font.drawString(ms, "Mechanics", 47, 7, -16777216);
		this.font.drawString(ms, "When worn you'll", 29, 43, -16777216);
		this.font.drawString(ms, "accepts Faz-Coins.", 146, 61, -16777216);
		this.font.drawString(ms, "have Iron like", 29, 52, -16777216);
		this.font.drawString(ms, "- Faz-Bag", 146, 88, -16777216);
		this.font.drawString(ms, "Springlock Suits:", 29, 34, -16777216);
		this.font.drawString(ms, "offer 6 things,", 146, 52, -16777216);
		this.font.drawString(ms, "armor, found in any", 29, 61, -16777216);
		this.font.drawString(ms, "- Golden Pack", 146, 124, -16777216);
		this.font.drawString(ms, "Mechanics", 173, 7, -16777216);
		this.font.drawString(ms, "- Race Car", 146, 106, -16777216);
		this.font.drawString(ms, "Trading:", 146, 34, -16777216);
		this.font.drawString(ms, "once you touch any", 29, 88, -16777216);
		this.font.drawString(ms, "location or from", 29, 70, -16777216);
		this.font.drawString(ms, "- Uniform Pack", 146, 79, -16777216);
		this.font.drawString(ms, "Night Guards can", 146, 43, -16777216);
		this.font.drawString(ms, "- Cake Slice", 146, 115, -16777216);
		this.font.drawString(ms, "watrer source you'll", 29, 97, -16777216);
		this.font.drawString(ms, "the Guard. Danger is", 29, 79, -16777216);
		this.font.drawString(ms, "take damage and get", 29, 106, -16777216);
		this.font.drawString(ms, "So get Springlocked", 29, 124, -16777216);
		this.font.drawString(ms, "noob.", 29, 133, -16777216);
		this.font.drawString(ms, "- Fizzy Faz", 146, 97, -16777216);
		this.font.drawString(ms, "Curse of Binding.", 29, 115, -16777216);
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
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageMechanics1Gui.ButtonPressedMessage(0, x, y, z));
				PageMechanics1Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
