
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

import net.mcreator.themultiverseoffreddys.entity.GlitchtrapEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GlitchtrapRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GlitchtrapEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelGlitchtrap(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/glitchtrap.png");
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
					.getBuffer(RenderType.getEyes(new ResourceLocation("ultimate_fnaf_mod:textures/entities/glitchtrap_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelGlitchtrap extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer head_r6;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelGlitchtrap() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 2.9774F, 0.0366F);
			head.setTextureOffset(0, 16).addBox(-0.5F, -3.9774F, -0.5366F, 1.0F, 2.0F, 1.0F, 1.0F, false);
			head.setTextureOffset(21, 18).addBox(-3.0F, -4.9774F, -1.0366F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(38, 30).addBox(-3.5F, -10.9774F, -1.0366F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(37, 46).addBox(2.5F, -9.9774F, -1.0366F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(20, 56).addBox(2.5F, -5.9774F, 0.9634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(6, 56).addBox(2.0F, -5.9774F, 1.4634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(43, 55).addBox(-3.0F, -5.9774F, 1.4634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(43, 38).addBox(-2.0F, -5.9774F, 2.4634F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(55, 57).addBox(-1.0F, -7.9774F, 2.4634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(57, 47).addBox(-1.0F, -9.4774F, 1.9634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(57, 44).addBox(-1.0F, -10.9774F, 0.9634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 56).addBox(-3.5F, -5.9774F, 0.9634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(53, 8).addBox(-3.0F, -8.4774F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 0).addBox(-3.5F, -8.4774F, -2.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(57, 25).addBox(-2.5F, -9.7274F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(56, 54).addBox(0.5F, -9.7274F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(74, 54).addBox(0.5F, -10.7274F, -4.2866F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(75, 25).addBox(-2.5F, -10.7274F, -4.2866F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 52).addBox(1.0F, -8.4774F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(44, 22).addBox(1.5F, -8.4774F, -2.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(31, 46).addBox(-3.5F, -9.9774F, -1.0366F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -11.4774F, -4.0366F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(110, 36).addBox(-3.0F, -7.5774F, -5.4366F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(38, 26).addBox(-3.0F, -4.4774F, -5.4366F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(38, 12).addBox(-3.0F, -5.4774F, -5.4366F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(81, 28).addBox(-3.0F, -5.5774F, -5.4366F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 19).addBox(-0.5F, -7.9274F, -5.8366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-2.5F, -6.9774F, -5.0366F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.2182F);
			head_r1.setTextureOffset(79, 54).addBox(-3.5F, -0.5F, -0.5F, 4.0F, 2.0F, 1.0F, 0.0F, true);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(2.5F, -6.9774F, -5.0366F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, -0.2182F);
			head_r2.setTextureOffset(79, 54).addBox(-0.5F, -0.5F, -0.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(1.5F, -10.4871F, 0.053F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.5672F, 0.0F, 0.3054F);
			head_r3.setTextureOffset(76, 95).addBox(-1.0F, -7.6114F, 1.805F, 2.0F, 3.0F, 2.0F, 0.0F, true);
			head_r3.setTextureOffset(108, 56).addBox(-0.5F, -8.6114F, 1.805F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(1.5F, -10.4871F, 0.053F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, 0.3054F);
			head_r4.setTextureOffset(120, 65).addBox(-1.0F, -4.9903F, -1.0896F, 2.0F, 5.0F, 2.0F, 0.0F, true);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(-1.5F, -10.4871F, 0.053F);
			head.addChild(head_r5);
			setRotationAngle(head_r5, 0.5672F, 0.0F, -0.3054F);
			head_r5.setTextureOffset(108, 56).addBox(-0.5F, -8.6114F, 1.805F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head_r5.setTextureOffset(76, 95).addBox(-1.0F, -7.6114F, 1.805F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(-1.5F, -10.4871F, 0.053F);
			head.addChild(head_r6);
			setRotationAngle(head_r6, 0.0F, 0.0F, -0.3054F);
			head_r6.setTextureOffset(120, 65).addBox(-1.0F, -4.9903F, -1.0896F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(23, 44).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 8.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(17, 36).addBox(-3.5F, 0.75F, -2.75F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(72, 0).addBox(1.1F, -0.1F, -2.85F, 3.0F, 7.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(118, 0).addBox(-1.5F, -0.1F, 1.15F, 3.0F, 7.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(72, 0).addBox(-4.1F, -0.1F, -2.85F, 3.0F, 7.0F, 6.0F, 0.0F, true);
			body.setTextureOffset(32, 26).addBox(-2.5F, -0.25F, -3.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(32, 26).addBox(0.5F, -0.25F, -3.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 6).addBox(-1.0F, 0.25F, -3.75F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(21, 16).addBox(-0.5F, 2.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(21, 16).addBox(-0.5F, 3.5F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 0).addBox(-3.5F, 8.5F, -2.0F, 7.0F, 3.0F, 4.0F, 0.25F, false);
			body.setTextureOffset(59, 4).addBox(-3.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(48, 58).addBox(-3.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(32, 58).addBox(-3.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(56, 22).addBox(1.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 58).addBox(1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(26, 58).addBox(1.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(52, 33).addBox(1.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(26, 21).addBox(-5.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(35, 33).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.5F, 0.85F, 0.0F);
			left_arm.setTextureOffset(12, 29).addBox(1.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(0, 37).addBox(0.6F, -0.9F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(33, 38).addBox(0.6F, 4.3F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(43, 42).addBox(0.6F, 8.6F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(51, 49).addBox(1.0F, 4.65F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(54, 0).addBox(1.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(53, 40).addBox(1.0F, 7.4F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(53, 36).addBox(1.0F, 3.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.5F, 0.85F, 0.0F);
			right_arm.setTextureOffset(0, 0).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(0, 51).addBox(-3.0F, 4.65F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(53, 4).addBox(-3.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(8, 52).addBox(-3.0F, 7.4F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(50, 22).addBox(-3.0F, 3.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 37).addBox(-3.6F, -0.9F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(43, 42).addBox(-3.6F, 8.6F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(33, 38).addBox(-3.6F, 4.3F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(11, 44).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(29, 54).addBox(-1.0F, 0.2083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(54, 28).addBox(-1.0F, 5.2083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(54, 18).addBox(-1.0F, 9.7083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(43, 49).addBox(-1.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(0, 37).addBox(-1.5F, 6.3583F, -1.8333F, 3.0F, 5.0F, 4.0F, 0.0F, true);
			left_leg.setTextureOffset(0, 37).addBox(-1.5F, 0.9583F, -1.8333F, 3.0F, 5.0F, 4.0F, 0.25F, true);
			left_leg.setTextureOffset(26, 10).addBox(-1.5F, 10.5083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, false);
			left_leg.setTextureOffset(32, 18).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(11, 44).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(54, 14).addBox(-1.0F, 0.2083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(14, 54).addBox(-1.0F, 5.2083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(54, 10).addBox(-1.0F, 9.7083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(46, 0).addBox(-1.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_leg.setTextureOffset(0, 29).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 37).addBox(-1.5F, 6.3583F, -1.8333F, 3.0F, 5.0F, 4.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 37).addBox(-1.5F, 0.9583F, -1.8333F, 3.0F, 5.0F, 4.0F, 0.25F, true);
			right_leg.setTextureOffset(26, 10).addBox(-1.5F, 10.5083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
