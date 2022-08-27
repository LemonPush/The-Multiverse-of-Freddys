
package net.mcreator.themultiverseoffreddys.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.themultiverseoffreddys.entity.TamedCleanBotEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedCleanBotRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedCleanBotEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelCleanBot(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/cleanbot.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelCleanBot extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer right_leg_r1;
		private final ModelRenderer right_leg_r2;
		private final ModelRenderer right_leg_r3;

		public ModelCleanBot() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 6.0F, 0.0F);
			head.setTextureOffset(0, 120).addBox(2.0F, -10.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 124).addBox(-5.0F, -10.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 12).addBox(-6.0F, -7.0F, -4.0F, 12.0F, 6.0F, 8.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(37, 0).addBox(-6.0F, -10.5644F, -4.4493F, 12.0F, 3.0F, 9.0F, 0.0F, false);
			body.setTextureOffset(0, 43).addBox(-6.0F, -13.5644F, -4.0493F, 12.0F, 3.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(38, 33).addBox(-6.0F, -7.5644F, -5.0493F, 12.0F, 5.0F, 10.0F, 0.0F, false);
			body.setTextureOffset(25, 82).addBox(-6.1F, -16.0F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(25, 82).addBox(5.1F, -16.0F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, true);
			body.setTextureOffset(65, 72).addBox(5.1F, -3.0F, -6.0F, 1.0F, 3.0F, 12.0F, 0.0F, true);
			body.setTextureOffset(65, 72).addBox(-6.1F, -3.0F, -6.0F, 1.0F, 3.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(32, 48).addBox(-6.0F, -16.0F, -4.0F, 12.0F, 3.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 28).addBox(-6.0F, -3.0F, -6.0F, 12.0F, 3.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(46, 26).addBox(-2.0F, -19.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			right_leg_r1 = new ModelRenderer(this);
			right_leg_r1.setRotationPoint(0.0F, -4.5F, -0.5F);
			body.addChild(right_leg_r1);
			setRotationAngle(right_leg_r1, 1.3963F, 0.0F, 0.0F);
			right_leg_r1.setTextureOffset(0, 14).addBox(-6.0F, -5.1F, -2.5F, 12.0F, 1.0F, 13.0F, 0.0F, false);
			right_leg_r1.setTextureOffset(0, 58).addBox(5.1F, -5.1F, -2.5F, 1.0F, 1.0F, 11.0F, 0.0F, true);
			right_leg_r1.setTextureOffset(0, 58).addBox(-6.1F, -5.1F, -2.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
			right_leg_r2 = new ModelRenderer(this);
			right_leg_r2.setRotationPoint(0.0F, -4.5F, 0.5F);
			body.addChild(right_leg_r2);
			setRotationAngle(right_leg_r2, -1.3963F, 0.0F, 0.0F);
			right_leg_r2.setTextureOffset(0, 58).addBox(5.1F, -5.1F, -8.5F, 1.0F, 1.0F, 11.0F, 0.0F, true);
			right_leg_r2.setTextureOffset(0, 58).addBox(-6.1F, -5.1F, -8.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
			right_leg_r3 = new ModelRenderer(this);
			right_leg_r3.setRotationPoint(0.0F, -9.0644F, 3.3507F);
			body.addChild(right_leg_r3);
			setRotationAngle(right_leg_r3, -1.3963F, 0.0F, 0.0F);
			right_leg_r3.setTextureOffset(0, 0).addBox(-6.0F, -1.5F, -6.5F, 12.0F, 1.0F, 13.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
