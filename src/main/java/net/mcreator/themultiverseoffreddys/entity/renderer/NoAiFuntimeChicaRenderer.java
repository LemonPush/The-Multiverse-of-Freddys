
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

import net.mcreator.themultiverseoffreddys.entity.NoAiFuntimeChicaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NoAiFuntimeChicaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NoAiFuntimeChicaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelFuntimeChica(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/funtimechica.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFuntimeChica extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer body_r3;
		private final ModelRenderer body_r4;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer body_r5;
		private final ModelRenderer body;
		private final ModelRenderer neck;
		private final ModelRenderer left_arm;
		private final ModelRenderer body_r6;
		private final ModelRenderer body_r7;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelFuntimeChica() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.8294F, -0.85F);
			head.setTextureOffset(0, 0).addBox(-4.5F, -16.9706F, -2.05F, 9.0F, 10.0F, 6.0F, 0.5F, false);
			head.setTextureOffset(69, 69).addBox(5.0F, -12.4706F, -2.55F, 1.0F, 6.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(53, 69).addBox(-6.0F, -12.4706F, -2.55F, 1.0F, 6.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(0, 37).addBox(-3.0F, -11.1706F, -6.75F, 6.0F, 1.0F, 9.0F, 0.25F, false);
			head.setTextureOffset(66, 40).addBox(-1.5F, -12.1706F, -5.55F, 3.0F, 1.0F, 8.0F, 0.25F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(1.0F, -17.1706F, 0.45F);
			head.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 0.0F, 0.4363F);
			body_r1.setTextureOffset(0, 0).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(1.0F, -17.1706F, 0.45F);
			head.addChild(body_r2);
			setRotationAngle(body_r2, -0.5236F, 0.0F, 0.0F);
			body_r2.setTextureOffset(0, 28).addBox(-2.0F, -3.4F, 0.1F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(1.0F, -17.1706F, 0.45F);
			head.addChild(body_r3);
			setRotationAngle(body_r3, 0.3491F, 0.0F, 0.0F);
			body_r3.setTextureOffset(28, 28).addBox(-2.0F, -3.3F, -1.4F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(-1.0F, -17.1706F, 0.45F);
			head.addChild(body_r4);
			setRotationAngle(body_r4, 0.0F, 0.0F, -0.4363F);
			body_r4.setTextureOffset(0, 16).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(8.0F, 0.8294F, 9.45F);
			head.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(122, 39).addBox(-6.75F, 11.2F, -17.4F, 2.0F, 1.0F, 1.0F, 0.25F, false);
			right_arm_r1.setTextureOffset(106, 20).addBox(-11.25F, 11.2F, -17.4F, 2.0F, 1.0F, 1.0F, 0.25F, false);
			right_arm_r1.setTextureOffset(0, 43).addBox(-11.25F, 11.2F, -15.9F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r1.setTextureOffset(49, 92).addBox(-13.75F, 11.2F, -12.6F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_arm_r1.setTextureOffset(49, 92).addBox(-4.25F, 11.2F, -12.6F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(16, 62).addBox(-6.75F, 11.2F, -15.9F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r1.setTextureOffset(70, 24).addBox(-11.0F, 7.0F, -11.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(44, 18).addBox(-12.0F, 7.0F, -17.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);
			body_r5 = new ModelRenderer(this);
			body_r5.setRotationPoint(0.5F, -9.0706F, 0.3167F);
			head.addChild(body_r5);
			setRotationAngle(body_r5, 0.0436F, 0.0F, 0.0F);
			body_r5.setTextureOffset(103, 58).addBox(1.5F, 0.0F, -7.0667F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			body_r5.setTextureOffset(80, 105).addBox(-3.5F, 0.0F, -7.0667F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			body_r5.setTextureOffset(104, 80).addBox(-2.5F, 0.0F, -7.0667F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body_r5.setTextureOffset(83, 90).addBox(-2.5F, 0.0F, -4.5667F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			body_r5.setTextureOffset(24, 0).addBox(-3.5F, 1.2F, -7.0667F, 6.0F, 1.0F, 4.0F, 0.25F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -9.0F, 0.0F);
			body.setTextureOffset(8, 80).addBox(-4.0F, 8.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(80, 6).addBox(-4.0F, 5.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(78, 18).addBox(1.0F, 5.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(76, 59).addBox(1.0F, 3.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(54, 58).addBox(-5.0F, 3.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(28, 18).addBox(-4.0F, 11.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(44, 33).addBox(1.0F, 8.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(80, 40).addBox(6.0F, 3.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 80).addBox(-8.0F, 3.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(30, 5).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-5.5F, 3.0F, -3.5F, 11.0F, 6.0F, 6.0F, 0.5F, false);
			body.setTextureOffset(38, 52).addBox(-1.0F, 11.5F, -3.0F, 2.0F, 2.0F, 4.0F, 0.5F, false);
			body.setTextureOffset(30, 39).addBox(-4.0F, 10.0F, -2.5F, 8.0F, 4.0F, 5.0F, 0.5F, false);
			body.setTextureOffset(0, 28).addBox(-5.5F, 14.5F, -3.0F, 11.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(21, 39).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(2.0F, 1.0F, 0.0F);
			body.addChild(neck);
			setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(6.0F, -5.3286F, 0.0F);
			left_arm.setTextureOffset(66, 45).addBox(2.0F, 5.3286F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(54, 28).addBox(0.5F, -1.1714F, -3.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);
			body_r6 = new ModelRenderer(this);
			body_r6.setRotationPoint(3.0F, 4.8786F, 0.0F);
			left_arm.addChild(body_r6);
			setRotationAngle(body_r6, -1.4835F, 0.0F, 0.0F);
			body_r6.setTextureOffset(34, 22).addBox(-0.5F, 7.45F, -11.9F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body_r6.setTextureOffset(62, 69).addBox(-2.5F, 5.55F, -3.9F, 5.0F, 5.0F, 2.0F, 0.0F, false);
			body_r6.setTextureOffset(58, 107).addBox(-1.25F, 9.65F, -3.9F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			body_r6.setTextureOffset(0, 37).addBox(-2.5F, 10.15F, -7.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body_r6.setTextureOffset(0, 40).addBox(0.5F, 10.15F, -7.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body_r6.setTextureOffset(0, 71).addBox(-2.5F, 5.55F, -8.1F, 5.0F, 5.0F, 4.0F, 0.25F, false);
			body_r6.setTextureOffset(76, 32).addBox(-3.5F, 4.55F, -1.9F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			body_r6.setTextureOffset(22, 64).addBox(-2.5F, 0.15F, -0.9F, 5.0F, 5.0F, 6.0F, 0.0F, false);
			body_r6.setTextureOffset(78, 65).addBox(-2.0F, 2.25F, 0.1F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			body_r7 = new ModelRenderer(this);
			body_r7.setRotationPoint(3.0F, 7.6722F, -1.8363F);
			left_arm.addChild(body_r7);
			setRotationAngle(body_r7, -1.5708F, -0.0873F, 1.5708F);
			body_r7.setTextureOffset(64, 7).addBox(-3.5F, 3.4772F, -3.1229F, 5.0F, 5.0F, 6.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(3.0F, 4.8786F, 0.0F);
			left_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -0.5236F, 0.0F, 0.0F);
			right_arm_r2.setTextureOffset(76, 49).addBox(-2.0F, -2.55F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-6.0F, -5.3286F, 0.0F);
			right_arm.setTextureOffset(51, 40).addBox(-4.0F, 12.3286F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(46, 0).addBox(-4.0F, 5.3286F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(34, 75).addBox(-5.0F, 7.3286F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(18, 75).addBox(-5.0F, 1.3286F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(22, 52).addBox(-5.5F, -1.1714F, -3.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);
			right_arm.setTextureOffset(60, 58).addBox(-5.5F, 5.2286F, -3.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 60).addBox(-5.5F, 10.6286F, -3.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.0F, 9.0F, 0.5F);
			left_leg.setTextureOffset(76, 1).addBox(-2.0F, -1.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(66, 18).addBox(-2.0F, 6.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(38, 58).addBox(-2.5F, 0.0F, -3.5F, 5.0F, 6.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(44, 70).addBox(-2.0F, 6.4F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(48, 0).addBox(-2.5F, 6.4F, -3.5F, 5.0F, 7.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 27).addBox(-2.5F, 13.0F, -7.5F, 5.0F, 2.0F, 10.0F, 0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.5F, 9.0F, 0.5F);
			right_leg.setTextureOffset(64, 0).addBox(-2.5F, -1.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(56, 40).addBox(-2.5F, 6.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(50, 46).addBox(-3.0F, 0.0F, -3.5F, 5.0F, 6.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(44, 28).addBox(-2.5F, 6.4F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 47).addBox(-3.0F, 6.4F, -3.5F, 5.0F, 7.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(28, 6).addBox(-3.0F, 13.0F, -7.5F, 5.0F, 2.0F, 10.0F, 0.25F, false);
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

			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
