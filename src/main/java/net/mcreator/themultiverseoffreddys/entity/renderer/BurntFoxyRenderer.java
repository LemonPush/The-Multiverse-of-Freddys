
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

import net.mcreator.themultiverseoffreddys.entity.BurntFoxyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BurntFoxyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BurntFoxyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBurntFoxy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/burntfoxy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBurntFoxy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer right_arm_r5;

		public ModelBurntFoxy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(16, 50).addBox(-0.7F, -15.5F, -0.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(23, 25).addBox(-3.0F, -6.0F, -10.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(44, 18).addBox(-3.0F, -7.0F, -10.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(55, 12).addBox(-3.0F, -7.0F, -9.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(50, 54).addBox(2.0F, -7.0F, -9.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(54, 0).addBox(2.0F, -8.5F, -9.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 43).addBox(-3.0F, -8.5F, -10.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(54, 6).addBox(-3.0F, -8.5F, -9.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(32, 34).addBox(-2.0F, -10.0F, -9.8F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(25, 9).addBox(-3.0F, -9.5F, -10.2F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(44, 8).addBox(-1.0F, -10.5F, -9.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(26, 40).addBox(-1.0F, -11.1F, -9.5F, 2.0F, 1.0F, 2.0F, -0.1F, false);
			head.setTextureOffset(62, 33).addBox(-2.8F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(29, 62).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 37).addBox(0.7F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 6).addBox(-2.8F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(57, 50).addBox(-8.0F, -9.0F, 0.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(44, 8).addBox(-6.0F, -9.0F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(49, 0).addBox(-7.0F, -9.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 33).addBox(4.0F, -9.0F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 41).addBox(4.0F, -9.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 56).addBox(4.0F, -9.0F, 0.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -15.5F, -1.5F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, -0.5236F, 1.5708F, 0.0F);
			head_r1.setTextureOffset(42, 24).addBox(-2.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 0).addBox(-2.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head_r1.setTextureOffset(30, 17).addBox(-2.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(30, 43).addBox(-2.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(0.0F, -15.5F, -1.5F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, -0.5236F, -1.5708F, 0.0F);
			head_r2.setTextureOffset(58, 18).addBox(1.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head_r2.setTextureOffset(44, 12).addBox(1.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(18, 32).addBox(1.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head_r2.setTextureOffset(28, 51).addBox(1.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(0.5F, -14.6F, -0.1F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, 0.2618F);
			head_r3.setTextureOffset(0, 45).addBox(-0.1F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-0.5F, -14.6F, -0.1F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, -0.2618F);
			head_r4.setTextureOffset(38, 51).addBox(-1.2F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 32).addBox(-4.0F, -5.5F, -2.7F, 8.0F, 10.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(79, 0).addBox(1.0F, -0.5F, -3.7F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(62, 24).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 28).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(16, 62).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(62, 12).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(46, 20).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(46, 41).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 62).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(61, 61).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 56).addBox(1.5F, 11.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(0, 46).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(61, 58).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(55, 60).addBox(-1.1F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(10, 61).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(29, 53).addBox(-1.6F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(18, 33).addBox(-2.1F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(61, 6).addBox(0.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			left_leg.setTextureOffset(61, 0).addBox(-2.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(30, 41).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(47, 60).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(22, 60).addBox(-0.9F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(41, 59).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(43, 50).addBox(-1.4F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(79, 0).addBox(-0.9F, 8.5F, -2.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(30, 17).addBox(-1.9F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(58, 42).addBox(-2.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_leg.setTextureOffset(58, 39).addBox(0.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(79, 0).addBox(-4.0F, -1.0F, -3.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(14, 40).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(46, 30).addBox(-5.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(58, 30).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(57, 55).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(16, 50).addBox(-5.0F, 11.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-4.5672F, 17.9224F, -0.0495F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -0.6545F, -1.5708F, 0.6545F);
			right_arm_r1.setTextureOffset(44, 20).addBox(-0.5F, 0.2F, -2.8F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.6F, 16.4191F, 0.4505F);
			right_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.2217F, -1.5708F, 0.6545F);
			right_arm_r2.setTextureOffset(0, 16).addBox(-1.0F, -0.8185F, 0.6522F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(-3.6F, 16.4191F, 0.4505F);
			right_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, 0.1745F, -1.5708F, 0.6981F);
			right_arm_r3.setTextureOffset(24, 0).addBox(-1.0F, -1.5185F, 0.0522F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(-3.6F, 16.4191F, 0.4505F);
			right_arm.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -0.0873F, -1.5708F, 0.6545F);
			right_arm_r4.setTextureOffset(51, 15).addBox(-1.0F, -0.7185F, -2.9478F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(-3.2F, 16.9191F, 0.4505F);
			right_arm.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, 0.0F, -1.5708F, 0.0F);
			right_arm_r5.setTextureOffset(25, 17).addBox(-1.0F, -4.5191F, -0.7505F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
