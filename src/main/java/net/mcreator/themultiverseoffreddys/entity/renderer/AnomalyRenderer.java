
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

import net.mcreator.themultiverseoffreddys.entity.AnomalyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AnomalyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AnomalyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelAnamoly_v3(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/anamoly_v3.png");
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
					.getBuffer(RenderType.getEyes(new ResourceLocation("ultimate_fnaf_mod:textures/entities/anamoly_v3_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.1.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelAnamoly_v3 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer bone;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer right_arm;
		private final ModelRenderer body_r2;
		private final ModelRenderer body_r3;
		private final ModelRenderer left_arm;
		private final ModelRenderer body_r4;
		private final ModelRenderer body_r5;
		private final ModelRenderer bottom;
		private final ModelRenderer tentacles;
		private final ModelRenderer tentacle;
		private final ModelRenderer body_r6;
		private final ModelRenderer body_r7;
		private final ModelRenderer tentacle2;
		private final ModelRenderer body_r8;
		private final ModelRenderer body_r9;
		private final ModelRenderer tentacle3;
		private final ModelRenderer body_r10;
		private final ModelRenderer body_r11;
		private final ModelRenderer tentacle4;
		private final ModelRenderer body_r12;
		private final ModelRenderer body_r13;
		private final ModelRenderer tentacle5;
		private final ModelRenderer body_r14;
		private final ModelRenderer body_r15;
		private final ModelRenderer tentacle6;
		private final ModelRenderer body_r16;
		private final ModelRenderer body_r17;
		private final ModelRenderer tentacle7;
		private final ModelRenderer body_r18;
		private final ModelRenderer body_r19;
		private final ModelRenderer tentacle8;
		private final ModelRenderer body_r20;
		private final ModelRenderer body_r21;

		public ModelAnamoly_v3() {
			textureWidth = 256;
			textureHeight = 256;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -9.8776F, -5.3068F);
			head.setTextureOffset(62, 0).addBox(-8.0F, -15.1263F, -4.265F, 16.0F, 15.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(42, 88).addBox(-8.0F, -19.1263F, -4.265F, 16.0F, 4.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(2.0F, -15.1224F, -4.395F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-5.0F, -15.1224F, -4.395F, 3.0F, 3.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(70, 107).addBox(8.0F, -14.1263F, -4.265F, 3.0F, 12.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-11.0F, -14.1263F, -4.265F, 3.0F, 12.0F, 10.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(4.4606F, -26.9528F, 1.006F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 1.1781F, -0.3927F, 0.0F);
			head_r1.setTextureOffset(0, 54).addBox(-2.7242F, -9.3257F, -2.488F, 5.0F, 9.0F, 4.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(4.5F, -19.4895F, 0.325F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, -0.3927F, 0.0F);
			head_r2.setTextureOffset(0, 30).addBox(-2.5F, -7.5368F, -1.4899F, 5.0F, 9.0F, 4.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-4.4606F, -26.9528F, 1.006F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 1.1781F, 0.3927F, 0.0F);
			head_r3.setTextureOffset(0, 138).addBox(-2.2758F, -9.3257F, -2.488F, 5.0F, 9.0F, 4.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-4.5F, -19.4895F, 0.325F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.3927F, 0.0F);
			head_r4.setTextureOffset(56, 137).addBox(-2.5F, -7.5368F, -1.4899F, 5.0F, 9.0F, 4.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -13.3224F, 0.1068F);
			head.addChild(bone);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 10.0F, 3.0F);
			setRotationAngle(body, 0.5672F, 0.0F, 0.0F);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, -4.1019F, -2.9356F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, -0.3491F, 0.0F, 0.0F);
			body_r1.setTextureOffset(28, 120).addBox(-14.7F, -17.1979F, -2.8238F, 7.0F, 6.0F, 8.0F, 0.0F, false);
			body_r1.setTextureOffset(120, 125).addBox(7.7F, -17.1979F, -2.8238F, 7.0F, 6.0F, 8.0F, 0.0F, false);
			body_r1.setTextureOffset(86, 94).addBox(-6.5F, -8.8979F, -2.8238F, 13.0F, 15.0F, 8.0F, 0.0F, false);
			body_r1.setTextureOffset(0, 78).addBox(-9.0F, -17.1979F, -2.8238F, 18.0F, 9.0F, 8.0F, 0.0F, false);
			body_r1.setTextureOffset(138, 73).addBox(-2.5F, -20.4979F, -1.2238F, 5.0F, 9.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-11.429F, -5.7163F, -4.3728F);
			right_arm.setTextureOffset(56, 71).addBox(-12.571F, 26.7163F, -13.6272F, 13.0F, 3.0F, 14.0F, 0.0F, false);
			right_arm.setTextureOffset(103, 47).addBox(-10.571F, 21.7163F, -11.6272F, 9.0F, 8.0F, 10.0F, 0.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(-4.8762F, 12.768F, -2.8838F);
			right_arm.addChild(body_r2);
			setRotationAngle(body_r2, -0.0138F, -0.3051F, -1.525F);
			body_r2.setTextureOffset(96, 71).addBox(-11.8027F, -4.1742F, -3.5F, 14.0F, 7.0F, 7.0F, 0.0F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(-4.8762F, 12.768F, -2.8838F);
			right_arm.addChild(body_r3);
			setRotationAngle(body_r3, -0.1325F, -0.276F, -1.116F);
			body_r3.setTextureOffset(114, 0).addBox(0.7332F, -4.5237F, -3.5F, 13.0F, 7.0F, 7.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(11.429F, -5.7163F, -4.3728F);
			left_arm.setTextureOffset(68, 30).addBox(-0.429F, 26.7163F, -13.6272F, 13.0F, 3.0F, 14.0F, 0.0F, false);
			left_arm.setTextureOffset(32, 102).addBox(1.571F, 21.7163F, -11.6272F, 9.0F, 8.0F, 10.0F, 0.0F, false);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(4.8762F, 12.768F, -2.8838F);
			left_arm.addChild(body_r4);
			setRotationAngle(body_r4, -0.0138F, 0.3051F, 1.525F);
			body_r4.setTextureOffset(0, 95).addBox(-2.1973F, -4.1742F, -3.5F, 14.0F, 7.0F, 7.0F, 0.0F, false);
			body_r5 = new ModelRenderer(this);
			body_r5.setRotationPoint(4.8762F, 12.768F, -2.8838F);
			left_arm.addChild(body_r5);
			setRotationAngle(body_r5, -0.1325F, 0.276F, 1.116F);
			body_r5.setTextureOffset(108, 18).addBox(-13.7332F, -4.5237F, -3.5F, 13.0F, 7.0F, 7.0F, 0.0F, false);
			bottom = new ModelRenderer(this);
			bottom.setRotationPoint(0.0F, 24.0F, 0.0F);
			bottom.setTextureOffset(0, 30).addBox(-12.0F, -4.0F, 0.5F, 24.0F, 4.0F, 20.0F, 0.0F, false);
			bottom.setTextureOffset(50, 54).addBox(-10.0F, -4.0F, -11.5F, 20.0F, 4.0F, 13.0F, 0.0F, false);
			bottom.setTextureOffset(0, 0).addBox(-9.0F, -8.0F, -8.5F, 18.0F, 4.0F, 26.0F, 0.0F, false);
			bottom.setTextureOffset(0, 54).addBox(-7.5F, -12.0F, -5.5F, 15.0F, 4.0F, 20.0F, 0.0F, false);
			tentacles = new ModelRenderer(this);
			tentacles.setRotationPoint(0.0F, 24.0F, 0.0F);
			tentacle = new ModelRenderer(this);
			tentacle.setRotationPoint(3.429F, -4.7163F, 12.8272F);
			tentacles.addChild(tentacle);
			setRotationAngle(tentacle, 2.9697F, 0.0302F, 0.1719F);
			body_r6 = new ModelRenderer(this);
			body_r6.setRotationPoint(4.8762F, 12.768F, -2.8838F);
			tentacle.addChild(body_r6);
			setRotationAngle(body_r6, -0.0138F, 0.3051F, 1.525F);
			body_r6.setTextureOffset(128, 109).addBox(-1.1973F, -1.1742F, -0.5F, 14.0F, 4.0F, 4.0F, 0.0F, false);
			body_r7 = new ModelRenderer(this);
			body_r7.setRotationPoint(4.8762F, 12.768F, -2.8838F);
			tentacle.addChild(body_r7);
			setRotationAngle(body_r7, -0.1325F, 0.276F, 1.116F);
			body_r7.setTextureOffset(26, 134).addBox(-11.7332F, -1.5237F, -0.5F, 11.0F, 4.0F, 4.0F, 0.0F, false);
			tentacle2 = new ModelRenderer(this);
			tentacle2.setRotationPoint(-3.429F, -4.7163F, 12.8272F);
			tentacles.addChild(tentacle2);
			setRotationAngle(tentacle2, -2.7704F, 0.1313F, -0.3244F);
			body_r8 = new ModelRenderer(this);
			body_r8.setRotationPoint(-4.8762F, 12.768F, -2.8838F);
			tentacle2.addChild(body_r8);
			setRotationAngle(body_r8, -0.0138F, -0.3051F, -1.525F);
			body_r8.setTextureOffset(128, 101).addBox(-12.8027F, -1.1742F, -0.5F, 14.0F, 4.0F, 4.0F, 0.0F, false);
			body_r9 = new ModelRenderer(this);
			body_r9.setRotationPoint(-4.8762F, 12.768F, -2.8838F);
			tentacle2.addChild(body_r9);
			setRotationAngle(body_r9, -0.1325F, -0.276F, -1.116F);
			body_r9.setTextureOffset(84, 133).addBox(0.7332F, -1.5237F, -0.5F, 11.0F, 4.0F, 4.0F, 0.0F, false);
			tentacle3 = new ModelRenderer(this);
			tentacle3.setRotationPoint(0.571F, -19.7163F, 0.8272F);
			tentacles.addChild(tentacle3);
			setRotationAngle(tentacle3, 2.7339F, 1.0923F, -1.0089F);
			body_r10 = new ModelRenderer(this);
			body_r10.setRotationPoint(-4.8762F, 12.768F, -2.8838F);
			tentacle3.addChild(body_r10);
			setRotationAngle(body_r10, -0.0138F, -0.3051F, -1.525F);
			body_r10.setTextureOffset(92, 125).addBox(-12.8027F, -1.1742F, -0.5F, 14.0F, 4.0F, 4.0F, 0.0F, false);
			body_r11 = new ModelRenderer(this);
			body_r11.setRotationPoint(-4.8762F, 12.768F, -2.8838F);
			tentacle3.addChild(body_r11);
			setRotationAngle(body_r11, -0.1325F, -0.276F, -1.116F);
			body_r11.setTextureOffset(132, 117).addBox(0.7332F, -1.5237F, -0.5F, 11.0F, 4.0F, 4.0F, 0.0F, false);
			tentacle4 = new ModelRenderer(this);
			tentacle4.setRotationPoint(5.9143F, -23.796F, -1.3731F);
			tentacles.addChild(tentacle4);
			setRotationAngle(tentacle4, 2.9173F, -1.229F, -2.9965F);
			body_r12 = new ModelRenderer(this);
			body_r12.setRotationPoint(3.9195F, 5.0001F, -6.3562F);
			tentacle4.addChild(body_r12);
			setRotationAngle(body_r12, -0.0138F, 0.3051F, 1.525F);
			body_r12.setTextureOffset(120, 93).addBox(-1.1973F, -1.1742F, -0.5F, 14.0F, 4.0F, 4.0F, 0.0F, false);
			body_r13 = new ModelRenderer(this);
			body_r13.setRotationPoint(3.9195F, 5.0001F, -6.3562F);
			tentacle4.addChild(body_r13);
			setRotationAngle(body_r13, -0.1325F, 0.276F, 1.116F);
			body_r13.setTextureOffset(131, 65).addBox(-11.7332F, -1.5237F, -0.5F, 11.0F, 4.0F, 4.0F, 0.0F, false);
			tentacle5 = new ModelRenderer(this);
			tentacle5.setRotationPoint(16.9556F, -39.4572F, -4.1155F);
			tentacles.addChild(tentacle5);
			setRotationAngle(tentacle5, 0.2348F, -0.7279F, 0.8807F);
			body_r14 = new ModelRenderer(this);
			body_r14.setRotationPoint(1.8189F, -0.6348F, -1.3726F);
			tentacle5.addChild(body_r14);
			setRotationAngle(body_r14, -0.0138F, 0.3051F, 1.525F);
			body_r14.setTextureOffset(96, 117).addBox(-1.1973F, -1.1742F, -0.5F, 14.0F, 4.0F, 4.0F, 0.0F, false);
			body_r15 = new ModelRenderer(this);
			body_r15.setRotationPoint(1.8189F, -0.6348F, -1.3726F);
			tentacle5.addChild(body_r15);
			setRotationAngle(body_r15, -0.1325F, 0.276F, 1.116F);
			body_r15.setTextureOffset(131, 48).addBox(-11.7332F, -1.5237F, -0.5F, 11.0F, 4.0F, 4.0F, 0.0F, false);
			tentacle6 = new ModelRenderer(this);
			tentacle6.setRotationPoint(6.9556F, -10.4572F, -11.1155F);
			tentacles.addChild(tentacle6);
			setRotationAngle(tentacle6, 1.3305F, -0.4187F, 0.0936F);
			body_r16 = new ModelRenderer(this);
			body_r16.setRotationPoint(1.8189F, -0.6348F, -1.3726F);
			tentacle6.addChild(body_r16);
			setRotationAngle(body_r16, -0.0138F, 0.3051F, 1.525F);
			body_r16.setTextureOffset(106, 85).addBox(-1.1973F, -1.1742F, -0.5F, 14.0F, 4.0F, 4.0F, 0.0F, false);
			body_r17 = new ModelRenderer(this);
			body_r17.setRotationPoint(1.8189F, -0.6348F, -1.3726F);
			tentacle6.addChild(body_r17);
			setRotationAngle(body_r17, -0.1325F, 0.276F, 1.116F);
			body_r17.setTextureOffset(58, 129).addBox(-11.7332F, -1.5237F, -0.5F, 11.0F, 4.0F, 4.0F, 0.0F, false);
			tentacle7 = new ModelRenderer(this);
			tentacle7.setRotationPoint(-6.9556F, -10.4572F, -11.1155F);
			tentacles.addChild(tentacle7);
			setRotationAngle(tentacle7, 1.909F, 0.3474F, 0.5049F);
			body_r18 = new ModelRenderer(this);
			body_r18.setRotationPoint(-1.8189F, -0.6348F, -1.3726F);
			tentacle7.addChild(body_r18);
			setRotationAngle(body_r18, -0.0138F, -0.3051F, -1.525F);
			body_r18.setTextureOffset(0, 116).addBox(-12.8027F, -1.1742F, -0.5F, 14.0F, 4.0F, 4.0F, 0.0F, false);
			body_r19 = new ModelRenderer(this);
			body_r19.setRotationPoint(-1.8189F, -0.6348F, -1.3726F);
			tentacle7.addChild(body_r19);
			setRotationAngle(body_r19, -0.1325F, -0.276F, -1.116F);
			body_r19.setTextureOffset(131, 40).addBox(0.7332F, -1.5237F, -0.5F, 11.0F, 4.0F, 4.0F, 0.0F, false);
			tentacle8 = new ModelRenderer(this);
			tentacle8.setRotationPoint(-15.7556F, -37.8572F, -12.1155F);
			tentacles.addChild(tentacle8);
			setRotationAngle(tentacle8, 1.4441F, 0.8244F, 0.4239F);
			body_r20 = new ModelRenderer(this);
			body_r20.setRotationPoint(-1.8189F, -0.6348F, -1.3726F);
			tentacle8.addChild(body_r20);
			setRotationAngle(body_r20, -0.0138F, -0.3051F, -1.525F);
			body_r20.setTextureOffset(108, 32).addBox(-12.8027F, -1.1742F, -0.5F, 14.0F, 4.0F, 4.0F, 0.0F, false);
			body_r21 = new ModelRenderer(this);
			body_r21.setRotationPoint(-1.8189F, -0.6348F, -1.3726F);
			tentacle8.addChild(body_r21);
			setRotationAngle(body_r21, -0.1325F, -0.276F, -1.116F);
			body_r21.setTextureOffset(0, 130).addBox(0.7332F, -1.5237F, -0.5F, 11.0F, 4.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			bottom.render(matrixStack, buffer, packedLight, packedOverlay);
			tentacles.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
