
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
public class PageRecolor2GuiWindow extends ContainerScreen<PageRecolor2Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PageRecolor2Gui.guistate;

	public PageRecolor2GuiWindow(PageRecolor2Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 276;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ultimate_fnaf_mod:textures/screens/page_recolor_2.png");

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
		this.font.drawString(ms, "A.U. Mayhem", 47, 7, -16737844);
		this.font.drawString(ms, "This is where", 56, 43, -16777216);
		this.font.drawString(ms, "unwanted Hoaxes go", 29, 52, -16777216);
		this.font.drawString(ms, "to die due to their", 29, 61, -16777216);
		this.font.drawString(ms, "relevance.", 29, 79, -16777216);
		this.font.drawString(ms, "- Junkyard", 47, 34, -16777216);
		this.font.drawString(ms, "lack of lore", 29, 70, -16777216);
		this.font.drawString(ms, "aren't like the ones", 146, 142, -16777216);
		this.font.drawString(ms, "- Utah", 164, 34, -16777216);
		this.font.drawString(ms, "Now this is ", 164, 43, -16777216);
		this.font.drawString(ms, "what people have been", 146, 52, -16777216);
		this.font.drawString(ms, "waiting for, a land", 146, 61, -16777216);
		this.font.drawString(ms, "where Glamrock Bonnie", 146, 70, -16777216);
		this.font.drawString(ms, "lived! In here you'll", 146, 79, -16777216);
		this.font.drawString(ms, "find yourself roaming", 146, 88, -16777216);
		this.font.drawString(ms, "the Alternate", 146, 97, -16777216);
		this.font.drawString(ms, "A.U. Mayhem", 164, 7, -16737844);
		this.font.drawString(ms, "Universe biome. Be ", 146, 106, -16777216);
		this.font.drawString(ms, "everyone here in", 146, 133, -16777216);
		this.font.drawString(ms, "from your world.", 146, 151, -16777216);
		this.font.drawString(ms, "wary...you're in", 146, 115, -16777216);
		this.font.drawString(ms, "for a shock knowing", 146, 124, -16777216);
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
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageRecolor2Gui.ButtonPressedMessage(0, x, y, z));
				PageRecolor2Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + -60, this.guiTop + 70, 46, 20, new StringTextComponent("Back"), e -> {
			if (true) {
				UltimateFnafModMod.PACKET_HANDLER.sendToServer(new PageRecolor2Gui.ButtonPressedMessage(1, x, y, z));
				PageRecolor2Gui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
