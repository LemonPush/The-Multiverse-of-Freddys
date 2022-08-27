
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
public class PageRevengeGuiWindow extends ContainerScreen<PageRevengeGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PageRevengeGui.guistate;

	public PageRevengeGuiWindow(PageRevengeGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 276;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ultimate_fnaf_mod:textures/screens/page_revenge.png");

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
		this.font.drawString(ms, "Scott Cawthon has", 29, 43, -16777216);
		this.font.drawString(ms, "had it with the", 29, 52, -16777216);
		this.font.drawString(ms, "fanbase. ", 29, 61, -16777216);
		this.font.drawString(ms, "released spin-offs", 29, 106, -16777216);
		this.font.drawString(ms, "and troll games onto", 29, 115, -16777216);
		this.font.drawString(ms, "his desperate fans", 29, 124, -16777216);
		this.font.drawString(ms, "FnaF creator", 47, 34, -16777216);
		this.font.drawString(ms, "Scott got angry then", 29, 97, -16777216);
		this.font.drawString(ms, "all out of spite to", 29, 133, -16777216);
		this.font.drawString(ms, "- Fazbear Hills", 155, 34, -16777216);
		this.font.drawString(ms, "The safest place", 164, 43, -16777216);
		this.font.drawString(ms, "to be at when entering", 146, 52, -16777216);
		this.font.drawString(ms, "FnaF World. You'll", 146, 61, -16777216);
		this.font.drawString(ms, "see some friendly", 146, 70, -16777216);
		this.font.drawString(ms, "characters who only", 146, 79, -16777216);
		this.font.drawString(ms, "pizza in exchange", 146, 88, -16777216);
		this.font.drawString(ms, "of joining your party", 146, 97, -16777216);
		this.font.drawString(ms, "Cawthon's Revenge", 155, 7, -6750208);
		this.font.drawString(ms, "and freeing this once", 146, 106, -16777216);
		this.font.drawString(ms, "get them to shut up.", 29, 142, -16777216);
		this.font.drawString(ms, "In this timeline", 47, 88, -16777216);
		this.font.drawString(ms, "happy world.", 146, 115, -16777216);
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
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageRevengeGui.ButtonPressedMessage(0, x, y, z));
				PageRevengeGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
