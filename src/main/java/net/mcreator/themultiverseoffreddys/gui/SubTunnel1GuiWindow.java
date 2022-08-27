
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
public class SubTunnel1GuiWindow extends ContainerScreen<SubTunnel1Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = SubTunnel1Gui.guistate;

	public SubTunnel1GuiWindow(SubTunnel1Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ultimate_fnaf_mod:textures/screens/sub_tunnel_1.png");

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
		this.font.drawString(ms, "Sub-Tunnel", 60, 7, -10066330);
		this.font.drawString(ms, "A pocket dimension where", 24, 34, -16777216);
		this.font.drawString(ms, "the most dangerous entities of", 6, 43, -16777216);
		this.font.drawString(ms, "- ???", 78, 97, -16777216);
		this.font.drawString(ms, "multiverse are kept far from", 15, 52, -16777216);
		this.font.drawString(ms, "any other realities...", 42, 61, -16777216);
		this.font.drawString(ms, "...for everyone's sake...", 24, 70, -16777216);
		this.font.drawString(ms, "- ???", 24, 106, -16777216);
		this.font.drawString(ms, "- ???", 123, 106, -16777216);
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
		this.addButton(new Button(this.guiLeft + 54, this.guiTop + 133, 67, 20, new StringTextComponent("Coming Soon"), e -> {
			if (true) {
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new SubTunnel1Gui.ButtonPressedMessage(0, x, y, z));
				SubTunnel1Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
