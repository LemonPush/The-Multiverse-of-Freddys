
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
public class PageSubTunnelGuiWindow extends ContainerScreen<PageSubTunnelGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PageSubTunnelGui.guistate;

	public PageSubTunnelGuiWindow(PageSubTunnelGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 276;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ultimate_fnaf_mod:textures/screens/page_sub_tunnel.png");

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
		this.font.drawString(ms, "Sub-Tunnel", 56, 7, -10066330);
		this.font.drawString(ms, "Honestly I need a", 29, 52, -16777216);
		this.font.drawString(ms, "break, too much is", 29, 61, -16777216);
		this.font.drawString(ms, "going on rn. Don't", 29, 70, -16777216);
		this.font.drawString(ms, "Coming Soon", 47, 34, -16777216);
		this.font.drawString(ms, "worry the mod ain't", 29, 79, -16777216);
		this.font.drawString(ms, "Sub-Tunnel", 173, 7, -10066330);
		this.font.drawString(ms, "cancelled lol.", 29, 88, -16777216);
		this.font.drawString(ms, "I just need a break", 29, 115, -16777216);
		this.font.drawString(ms, "to collect my many", 29, 124, -16777216);
		this.font.drawString(ms, "thoughts and ideas", 29, 133, -16777216);
		this.font.drawString(ms, "too much strees atm.", 29, 142, -16777216);
		this.font.drawString(ms, "Thank you very much", 146, 43, -16777216);
		this.font.drawString(ms, "for playing the mod.", 146, 52, -16777216);
		this.font.drawString(ms, "Ya'll really motivate", 146, 61, -16777216);
		this.font.drawString(ms, "me to add more and", 146, 70, -16777216);
		this.font.drawString(ms, "fix stuff.", 146, 79, -16777216);
		this.font.drawString(ms, "I'll still fix bugs", 146, 106, -16777216);
		this.font.drawString(ms, "if needed but no", 146, 115, -16777216);
		this.font.drawString(ms, "big update for some", 146, 124, -16777216);
		this.font.drawString(ms, "time, maybe till", 146, 133, -16777216);
		this.font.drawString(ms, "idk lmao :skullface:", 146, 142, -16777216);
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
