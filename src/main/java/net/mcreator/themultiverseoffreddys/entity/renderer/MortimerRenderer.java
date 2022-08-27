
package net.mcreator.themultiverseoffreddys.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.themultiverseoffreddys.entity.MortimerEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MortimerRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MortimerEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMortimer(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/mortimer.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("ultimate_fnaf_mod:textures/entities/mortimer_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMortimer extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_arm;

		public ModelMortimer() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(32, 8).addBox(2.0F, -12.0F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(20, 31).addBox(-8.0F, -12.0F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(23, 16).addBox(-2.0F, -3.5F, -6.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(36, 0).addBox(-2.0F, 0.0F, -4.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-0.5F, -4.5F, -6.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 4.0F, 0.0F);
			body.setTextureOffset(0, 16).addBox(-4.5F, 2.0F, -2.5F, 9.0F, 7.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 28).addBox(-3.0F, -4.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(2.5774F, 0.6502F, 0.0F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.4363F);
			left_arm.setTextureOffset(36, 16).addBox(-0.3831F, 0.2846F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(24, 0).addBox(-1.2831F, 9.2846F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.5F, 12.75F, -0.75F);
			right_leg.setTextureOffset(36, 31).addBox(-1.0F, 0.25F, -0.25F, 2.0F, 8.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(21, 21).addBox(-2.0F, 8.25F, -3.75F, 4.0F, 3.0F, 7.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.5F, 12.75F, -0.75F);
			left_leg.setTextureOffset(36, 31).addBox(-1.0F, 0.25F, -0.25F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(21, 21).addBox(-2.0F, 8.25F, -3.75F, 4.0F, 3.0F, 7.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-2.5774F, 0.6502F, 0.0F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.4363F);
			right_arm.setTextureOffset(36, 16).addBox(-1.6169F, 0.2846F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(24, 0).addBox(-2.7169F, 9.2846F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
