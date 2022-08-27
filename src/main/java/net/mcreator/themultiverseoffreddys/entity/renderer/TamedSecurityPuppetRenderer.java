
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

import net.mcreator.themultiverseoffreddys.entity.TamedSecurityPuppetEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedSecurityPuppetRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedSecurityPuppetEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelSecurityPuppet(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/securitypuppet.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSecurityPuppet extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r5;
		private final ModelRenderer right_arm_r6;
		private final ModelRenderer right_arm_r7;
		private final ModelRenderer right_arm_r8;

		public ModelSecurityPuppet() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -5.5833F, -0.5833F);
			head.setTextureOffset(42, 0).addBox(-3.5F, -6.9167F, -2.9167F, 7.0F, 7.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(36, 32).addBox(-2.8F, -5.6167F, -3.0167F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 32).addBox(-0.2F, -5.6167F, -3.0167F, 3.0F, 3.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(0, 0).addBox(-4.05F, -7.4167F, -3.4167F, 4.0F, 8.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(0.05F, -7.4167F, -3.4167F, 4.0F, 8.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(42, 38).addBox(-1.0F, -8.4167F, 3.0833F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(42, 34).addBox(-1.0F, -10.4167F, 4.5833F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(36, 40).addBox(-1.0F, -8.4167F, 6.0833F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(36, 36).addBox(-1.0F, -6.4167F, 7.5833F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-1.5F, -4.4167F, 9.0833F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -2.0F, 0.0F);
			body.setTextureOffset(18, 31).addBox(-8.0F, 9.0F, -8.0F, 1.0F, 16.0F, 16.0F, 0.0F, false);
			body.setTextureOffset(0, 15).addBox(7.0F, 9.0F, -8.0F, 1.0F, 16.0F, 16.0F, 0.0F, false);
			body.setTextureOffset(52, 32).addBox(-7.0F, 9.0F, -8.0F, 14.0F, 16.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 15).addBox(-7.0F, 9.0F, 7.0F, 14.0F, 16.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-7.0F, 24.0F, -7.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
			body.setTextureOffset(0, 51).addBox(8.0F, 24.0F, -8.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(10, 47).addBox(8.0F, 24.0F, 6.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 0).addBox(-9.0F, 24.0F, 6.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 47).addBox(-9.0F, 24.0F, -8.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(52, 49).addBox(-5.0F, -2.0F, -1.5F, 10.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 9).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 4.0F, 1.0F, -1.0F, false);
			body.setTextureOffset(52, 55).addBox(-4.0F, 1.0F, -1.5F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(18, 24).addBox(-3.0F, 4.0F, -1.5F, 6.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 56).addBox(-6.0F, -1.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(10, 51).addBox(5.0F, -1.5F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(16, 63).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 17.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 42).addBox(-1.0F, -4.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.1F, -4.45F, 0.0F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.4363F);
			right_arm.setTextureOffset(18, 15).addBox(-1.7321F, 1.4689F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-2.0F, 9.1468F, -4.5227F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.7506F, 0.0298F, -0.3478F);
			right_arm_r1.setTextureOffset(18, 15).addBox(-0.235F, -0.5765F, 2.7271F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-2.0F, 9.1468F, -4.5227F);
			right_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5278F, 0.0227F, -0.1734F);
			right_arm_r2.setTextureOffset(0, 47).addBox(-0.2204F, -0.9276F, 2.6834F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(-2.0F, 9.1468F, -4.5227F);
			right_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5366F, 0.0346F, -0.4787F);
			right_arm_r3.setTextureOffset(0, 56).addBox(-0.1271F, -0.9276F, 2.7839F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(-2.0F, 3.75F, 0.0F);
			right_arm.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -0.7418F, 0.0F, 0.0F);
			right_arm_r4.setTextureOffset(0, 21).addBox(0.2679F, 2.0046F, 1.2369F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.1F, -4.45F, 0.0F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.4363F);
			left_arm.setTextureOffset(28, 15).addBox(-0.2679F, 1.4689F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(2.0F, 9.1468F, -4.5227F);
			left_arm.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, -1.7506F, -0.0298F, 0.3478F);
			right_arm_r5.setTextureOffset(44, 61).addBox(-0.765F, -0.5765F, 2.7271F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			right_arm_r6 = new ModelRenderer(this);
			right_arm_r6.setRotationPoint(2.0F, 9.1468F, -4.5227F);
			left_arm.addChild(right_arm_r6);
			setRotationAngle(right_arm_r6, -1.5278F, -0.0227F, 0.1734F);
			right_arm_r6.setTextureOffset(62, 6).addBox(-0.7796F, -0.9276F, 2.6834F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			right_arm_r7 = new ModelRenderer(this);
			right_arm_r7.setRotationPoint(2.0F, 9.1468F, -4.5227F);
			left_arm.addChild(right_arm_r7);
			setRotationAngle(right_arm_r7, -1.5366F, -0.0346F, 0.4787F);
			right_arm_r7.setTextureOffset(54, 62).addBox(-0.8729F, -0.9276F, 2.7839F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			right_arm_r8 = new ModelRenderer(this);
			right_arm_r8.setRotationPoint(2.0F, 3.75F, 0.0F);
			left_arm.addChild(right_arm_r8);
			setRotationAngle(right_arm_r8, -0.7418F, 0.0F, 0.0F);
			right_arm_r8.setTextureOffset(8, 21).addBox(-2.2679F, 2.0046F, 1.2369F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
