
package net.mcreator.themultiverseoffreddys.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.themultiverseoffreddys.entity.FuntimeFoxy2Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FuntimeFoxy2Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FuntimeFoxy2Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelFuntimeFoxyfnaf2(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/funtimefoxyfnaf2.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFuntimeFoxyfnaf2 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer body_r3;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm;

		public ModelFuntimeFoxyfnaf2() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -6.3144F, -0.1333F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -9.6856F, -3.8667F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 28).addBox(-3.0F, -1.6856F, -9.8667F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(108, 78).addBox(-3.0F, -2.6856F, -9.8667F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(74, 122).addBox(-3.0F, -2.6856F, -8.8667F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(116, 107).addBox(2.0F, -2.6856F, -8.8667F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(60, 119).addBox(2.0F, -4.1856F, -8.8667F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(92, 72).addBox(-3.0F, -4.1856F, -9.8667F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(67, 120).addBox(-3.0F, -4.1856F, -8.8667F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(36, 29).addBox(-2.0F, -5.6856F, -9.6667F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(25, 21).addBox(-3.0F, -5.1856F, -10.0667F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(52, 36).addBox(-1.0F, -6.1856F, -9.3667F, 2.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(28, 48).addBox(-1.0F, -6.7856F, -9.3667F, 2.0F, 1.0F, 2.0F, -0.1F, false);
			head.setTextureOffset(62, 39).addBox(-2.8F, -8.1856F, -4.3667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 40).addBox(0.8F, -8.1856F, -4.3667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 38).addBox(4.0F, -4.1856F, -2.3667F, 2.0F, 2.0F, 1.0F, -0.25F, false);
			head.setTextureOffset(19, 32).addBox(-6.0F, -4.1856F, -2.3667F, 2.0F, 2.0F, 1.0F, -0.25F, false);
			head.setTextureOffset(61, 14).addBox(-8.0F, -4.6856F, 0.1333F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(8, 62).addBox(-6.0F, -4.6856F, -1.8667F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 45).addBox(-7.0F, -4.6856F, -0.8667F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(62, 3).addBox(4.0F, -4.6856F, -1.8667F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(17, 38).addBox(4.0F, -4.6856F, -0.8667F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 49).addBox(4.0F, -4.6856F, 0.1333F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -11.1856F, -1.3667F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, -0.5236F, 1.5708F, 0.0F);
			head_r1.setTextureOffset(0, 45).addBox(-2.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 0).addBox(-2.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 16).addBox(-2.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(24, 3).addBox(-2.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(0.0F, -11.1856F, -1.3667F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, -0.5236F, -1.5708F, 0.0F);
			head_r2.setTextureOffset(26, 58).addBox(1.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head_r2.setTextureOffset(36, 33).addBox(1.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 28).addBox(1.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head_r2.setTextureOffset(20, 45).addBox(1.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(98, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.25F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, -6.0F, -3.5F, 10.0F, 6.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(27, 11).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 5.0F, 5.0F, 0.25F, false);
			body.setTextureOffset(63, 43).addBox(-1.0F, -5.0F, -4.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(58, 61).addBox(1.0F, -5.5F, -4.3F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 29).addBox(-3.0F, -5.5F, -4.3F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(62, 35).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(62, 27).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(50, 61).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 61).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 8.4508F, 2.0817F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 0.0F, 2.3998F);
			body_r1.setTextureOffset(0, 84).addBox(-1.5F, 6.7941F, 2.6344F, 3.0F, 6.0F, 3.0F, 0.25F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(0.0F, 8.4508F, 2.0817F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, -1.309F, 0.0F, 2.3998F);
			body_r2.setTextureOffset(24, 0).addBox(-1.5F, -3.7712F, 2.664F, 3.0F, 3.0F, 5.0F, 0.25F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(0.0F, 8.4508F, 2.0817F);
			body.addChild(body_r3);
			setRotationAngle(body_r3, -0.7418F, 0.0F, 2.3998F);
			body_r3.setTextureOffset(24, 0).addBox(-1.5F, -1.808F, -0.9713F, 3.0F, 3.0F, 5.0F, 0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(50, 4).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.1F, false);
			right_leg.setTextureOffset(49, 17).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			right_leg.setTextureOffset(34, 61).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(61, 0).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 36).addBox(-2.4F, 14.0F, -4.0F, 5.0F, 2.0F, 7.0F, 0.1F, false);
			right_leg.setTextureOffset(19, 28).addBox(-2.4F, 15.0F, -6.2F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			right_leg.setTextureOffset(19, 28).addBox(1.6F, 15.0F, -6.2F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			right_leg.setTextureOffset(19, 28).addBox(-0.4F, 15.0F, -6.2F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(16, 48).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.1F, false);
			left_leg.setTextureOffset(0, 45).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			left_leg.setTextureOffset(0, 61).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(21, 58).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(19, 29).addBox(-2.6F, 14.0F, -4.0F, 5.0F, 2.0F, 7.0F, 0.1F, false);
			left_leg.setTextureOffset(0, 36).addBox(-2.6F, 15.0F, -6.2F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			left_leg.setTextureOffset(0, 36).addBox(1.4F, 15.0F, -6.2F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			left_leg.setTextureOffset(0, 36).addBox(-0.6F, 15.0F, -6.2F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(40, 42).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(48, 52).addBox(-5.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(55, 1).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(44, 52).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(38, 36).addBox(-5.5F, 11.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			left_arm.setTextureOffset(44, 24).addBox(-3.5F, 12.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(40, 42).addBox(-4.5F, 14.8F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 6).addBox(-3.2F, 17.3F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-3.0F, 45.0F, 0.0F);
			left_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 0.0F, -0.7418F);
			right_arm_r1.setTextureOffset(24, 0).addBox(17.9F, -21.8F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.0F, 13.0F, 0.0F);
			left_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, 0.7418F);
			right_arm_r2.setTextureOffset(44, 21).addBox(0.1F, 0.4F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(24, 38).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(32, 52).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(52, 43).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(49, 0).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(50, 27).addBox(1.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
