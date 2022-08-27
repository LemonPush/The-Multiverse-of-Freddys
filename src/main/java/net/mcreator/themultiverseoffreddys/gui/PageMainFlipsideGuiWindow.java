
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
public class PageMainFlipsideGuiWindow extends ContainerScreen<PageMainFlipsideGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PageMainFlipsideGui.guistate;

	public PageMainFlipsideGuiWindow(PageMainFlipsideGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ultimate_fnaf_mod:textures/screens/page_main_flipside.png");

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
		this.blit(ms, this.guiLeft + -50, this.guiTop + 0, 0, 0, 276, 166, 276, 166);

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
		this.font.drawString(ms, "Multiverse", 6, 7, -16777216);
		this.font.drawString(ms, "Multiverse", 114, 7, -16777216);
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
		this.addButton(new Button(this.guiLeft + 98, this.guiTop + 43, 82, 20, new StringTextComponent("A.U. Mayhem"), e -> {
			if (true) {
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageMainFlipsideGui.ButtonPressedMessage(0, x, y, z));
				PageMainFlipsideGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 98, this.guiTop + 69, 82, 20, new StringTextComponent("Meme Land"), e -> {
			if (true) {
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageMainFlipsideGui.ButtonPressedMessage(1, x, y, z));
				PageMainFlipsideGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 98, this.guiTop + 97, 82, 20, new StringTextComponent("Sub-Tunnel"), e -> {
			if (true) {
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageMainFlipsideGui.ButtonPressedMessage(2, x, y, z));
				PageMainFlipsideGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -3, this.guiTop + 69, 82, 20, new StringTextComponent("The Glitch"), e -> {
			if (true) {
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageMainFlipsideGui.ButtonPressedMessage(3, x, y, z));
				PageMainFlipsideGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -3, this.guiTop + 43, 82, 20, new StringTextComponent("FlipSide"), e -> {
			if (true) {
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageMainFlipsideGui.ButtonPressedMessage(4, x, y, z));
				PageMainFlipsideGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -3, this.guiTop + 97, 82, 20, new StringTextComponent("Revenge"), e -> {
			if (true) {
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageMainFlipsideGui.ButtonPressedMessage(5, x, y, z));
				PageMainFlipsideGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
	}
}
