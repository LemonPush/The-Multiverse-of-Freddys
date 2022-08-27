
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
public class PageWorld1GuiWindow extends ContainerScreen<PageWorld1Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PageWorld1Gui.guistate;

	public PageWorld1GuiWindow(PageWorld1Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 276;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ultimate_fnaf_mod:textures/screens/page_world_1.png");

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
		this.font.drawString(ms, "Overworld", 56, 7, -16777216);
		this.font.drawString(ms, "Fredbear's Diner", 29, 106, -16777216);
		this.font.drawString(ms, "Fazbear's Pizza 93", 29, 79, -16777216);
		this.font.drawString(ms, "Circus Baby's", 29, 115, -16777216);
		this.font.drawString(ms, "Fazbear's Fright", 29, 97, -16777216);
		this.font.drawString(ms, "locations:", 29, 61, -16777216);
		this.font.drawString(ms, "Fazbear's Pizza 87", 29, 88, -16777216);
		this.font.drawString(ms, "You'll also find", 146, 34, -16777216);
		this.font.drawString(ms, "both functioning", 29, 43, -16777216);
		this.font.drawString(ms, "Pizza Simulator", 29, 124, -16777216);
		this.font.drawString(ms, "and abandoned", 29, 52, -16777216);
		this.font.drawString(ms, "You'll encounter", 29, 34, -16777216);
		this.font.drawString(ms, "such as", 146, 52, -16777216);
		this.font.drawString(ms, "Overworld", 173, 7, -16777216);
		this.font.drawString(ms, "other strucutres", 146, 43, -16777216);
		this.font.drawString(ms, "- Halloween House", 146, 88, -16777216);
		this.font.drawString(ms, "- Midnight Motorist", 146, 70, -16777216);
		this.font.drawString(ms, "- Dreadbear Hub", 146, 79, -16777216);
		this.font.drawString(ms, "There is a new biome", 146, 106, -16777216);
		this.font.drawString(ms, "\"Haunted Woods\"", 155, 115, -16777216);
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
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageWorld1Gui.ButtonPressedMessage(0, x, y, z));
				PageWorld1Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
