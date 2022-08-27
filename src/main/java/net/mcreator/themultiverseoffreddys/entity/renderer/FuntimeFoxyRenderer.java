
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

import net.mcreator.themultiverseoffreddys.entity.FuntimeFoxyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FuntimeFoxyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FuntimeFoxyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelFuntimeFoxy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/funtimefoxy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFuntimeFoxy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer body_r3;
		private final ModelRenderer body;
		private final ModelRenderer body_r4;
		private final ModelRenderer body_r5;
		private final ModelRenderer body_r6;
		private final ModelRenderer body_r7;
		private final ModelRenderer neck;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelFuntimeFoxy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.8294F, -0.85F);
			head.setTextureOffset(0, 12).addBox(-4.5F, -16.9706F, -2.05F, 9.0F, 10.0F, 6.0F, 0.5F, false);
			head.setTextureOffset(0, 93).addBox(4.5F, -7.4706F, -1.55F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(41, 92).addBox(4.5F, -8.4706F, -1.55F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(78, 64).addBox(4.5F, -10.4706F, -1.55F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(87, 86).addBox(4.5F, -9.4706F, -1.55F, 3.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(52, 21).addBox(-5.5F, -7.4706F, -1.55F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(27, 92).addBox(-6.5F, -8.4706F, -1.55F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(61, 87).addBox(-7.5F, -9.4706F, -1.55F, 3.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(20, 32).addBox(-8.5F, -10.4706F, -1.55F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(30, 15).addBox(-3.5F, -9.9706F, -8.55F, 7.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-3.5F, -11.1706F, -8.75F, 7.0F, 1.0F, 11.0F, 0.25F, false);
			head.setTextureOffset(30, 16).addBox(-0.5F, -19.1706F, -0.55F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(46, 0).addBox(-2.0F, -12.1706F, -7.55F, 4.0F, 1.0F, 10.0F, 0.25F, false);
			head.setTextureOffset(6, 0).addBox(-0.5F, -12.9706F, -7.35F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-8.0F, 0.8294F, 9.45F);
			head.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.7854F);
			right_arm_r1.setTextureOffset(0, 28).addBox(-15.8F, 7.5F, -16.6F, 1.0F, 3.0F, 3.0F, 0.0F, true);
			right_arm_r1.setTextureOffset(85, 33).addBox(-14.8F, 7.5F, -17.1F, 4.0F, 3.0F, 4.0F, 0.0F, true);
			right_arm_r1.setTextureOffset(22, 59).addBox(-10.8F, 8.0F, -16.0F, 1.0F, 2.0F, 2.0F, 0.25F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(8.0F, 0.8294F, 9.45F);
			head.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, -0.7854F);
			right_arm_r2.setTextureOffset(0, 28).addBox(14.8F, 7.5F, -16.6F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(85, 33).addBox(10.8F, 7.5F, -17.1F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(0, 12).addBox(9.8F, 8.0F, -16.0F, 1.0F, 2.0F, 2.0F, 0.25F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(1.0F, -17.1706F, 0.45F);
			head.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 0.0F, 0.4363F);
			body_r1.setTextureOffset(0, 52).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(-1.0F, -17.1706F, 0.45F);
			head.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, 0.0F, -0.4363F);
			body_r2.setTextureOffset(16, 52).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(-8.0F, 0.8294F, 9.45F);
			head.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5708F, 0.0F, 0.0F);
			right_arm_r3.setTextureOffset(13, 6).addBox(4.75F, 11.2F, -17.2F, 2.0F, 1.0F, 0.0F, 0.25F, true);
			right_arm_r3.setTextureOffset(13, 6).addBox(9.25F, 11.2F, -17.2F, 2.0F, 1.0F, 0.0F, 0.25F, false);
			right_arm_r3.setTextureOffset(24, 15).addBox(4.75F, 11.2F, -15.9F, 2.0F, 1.0F, 2.0F, 0.25F, true);
			right_arm_r3.setTextureOffset(24, 15).addBox(9.25F, 11.2F, -15.9F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r3.setTextureOffset(0, 80).addBox(5.0F, 7.0F, -11.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r3.setTextureOffset(50, 11).addBox(4.0F, 7.0F, -17.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(0.0F, -9.0706F, 0.3167F);
			head.addChild(body_r3);
			setRotationAngle(body_r3, 0.0436F, 0.0F, 0.0F);
			body_r3.setTextureOffset(74, 17).addBox(-3.5F, 0.0F, -8.8667F, 7.0F, 1.0F, 6.0F, 0.0F, false);
			body_r3.setTextureOffset(54, 77).addBox(-3.5F, 1.2F, -9.0667F, 7.0F, 1.0F, 6.0F, 0.25F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -9.0F, 0.0F);
			body.setTextureOffset(46, 4).addBox(-4.0F, 8.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(46, 0).addBox(-4.0F, 5.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 34).addBox(1.0F, 5.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(32, 72).addBox(1.0F, 3.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(64, 5).addBox(-5.0F, 3.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(50, 36).addBox(-4.0F, 11.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(25, 7).addBox(1.0F, 8.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(85, 92).addBox(5.0F, 3.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(73, 91).addBox(-7.0F, 3.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 41).addBox(-5.0F, 3.0F, -2.5F, 10.0F, 6.0F, 5.0F, 0.5F, false);
			body.setTextureOffset(44, 59).addBox(-3.5F, 3.0F, -2.7F, 7.0F, 6.0F, 5.0F, 0.5F, false);
			body.setTextureOffset(79, 72).addBox(-3.0F, 10.0F, -2.7F, 6.0F, 4.0F, 5.0F, 0.5F, false);
			body.setTextureOffset(88, 81).addBox(-3.5F, 15.0F, -2.7F, 7.0F, 2.0F, 1.0F, 0.5F, false);
			body.setTextureOffset(38, 62).addBox(-1.0F, 3.0F, -3.7F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(50, 32).addBox(1.0F, 2.6F, -3.7F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(50, 32).addBox(-4.0F, 2.6F, -3.7F, 3.0F, 3.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(91, 40).addBox(-1.0F, 6.5F, -3.1F, 2.0F, 2.0F, 5.0F, 0.5F, false);
			body.setTextureOffset(48, 46).addBox(-4.0F, 6.0F, -2.5F, 8.0F, 8.0F, 5.0F, 0.5F, false);
			body.setTextureOffset(24, 22).addBox(-5.5F, 14.5F, -3.0F, 11.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(40, 46).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(-7.1927F, 4.0881F, 10.9513F);
			body.addChild(body_r4);
			setRotationAngle(body_r4, 1.9285F, -0.6614F, -1.5014F);
			body_r4.setTextureOffset(30, 32).addBox(-2.7531F, -2.9281F, 0.4531F, 6.0F, 6.0F, 8.0F, 0.5F, false);
			body_r5 = new ModelRenderer(this);
			body_r5.setRotationPoint(0.2117F, 10.388F, 8.2552F);
			body.addChild(body_r5);
			setRotationAngle(body_r5, 1.2764F, -0.6377F, -0.6709F);
			body_r5.setTextureOffset(22, 46).addBox(-2.9608F, -2.3502F, 3.5343F, 5.0F, 5.0F, 8.0F, 0.5F, false);
			body_r6 = new ModelRenderer(this);
			body_r6.setRotationPoint(1.1F, 12.8882F, 3.8865F);
			body.addChild(body_r6);
			setRotationAngle(body_r6, 0.7623F, -0.3742F, -0.3358F);
			body_r6.setTextureOffset(80, 24).addBox(-2.0F, -2.0968F, 2.969F, 4.0F, 4.0F, 5.0F, 0.5F, false);
			body_r7 = new ModelRenderer(this);
			body_r7.setRotationPoint(0.0F, 18.0F, 2.0F);
			body.addChild(body_r7);
			setRotationAngle(body_r7, 0.6981F, 0.0F, 0.0F);
			body_r7.setTextureOffset(50, 84).addBox(-1.5F, -4.3F, 1.9F, 3.0F, 3.0F, 5.0F, 0.5F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(2.0F, 1.0F, 0.0F);
			body.addChild(neck);
			setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.5F, -5.3286F, 0.0F);
			left_arm.setTextureOffset(38, 59).addBox(2.0F, 12.3286F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(58, 43).addBox(2.0F, 5.3286F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(84, 48).addBox(1.0F, 7.3286F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(16, 84).addBox(1.0F, 1.3286F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(72, 5).addBox(0.5F, -1.1714F, -3.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);
			left_arm.setTextureOffset(38, 71).addBox(0.5F, 5.2286F, -3.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);
			left_arm.setTextureOffset(16, 73).addBox(0.5F, 10.6286F, -3.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.5F, -5.3286F, 0.0F);
			right_arm.setTextureOffset(58, 40).addBox(-4.0F, 12.3286F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(40, 51).addBox(-4.0F, 5.3286F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(34, 82).addBox(-5.0F, 7.3286F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(76, 81).addBox(-5.0F, 1.3286F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(69, 36).addBox(-5.5F, -1.1714F, -3.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 68).addBox(-5.5F, 5.2286F, -3.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);
			right_arm.setTextureOffset(68, 53).addBox(-5.5F, 10.6286F, -3.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.0F, 9.0F, 0.5F);
			left_leg.setTextureOffset(91, 63).addBox(-2.0F, -1.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(88, 5).addBox(-2.0F, 6.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(62, 65).addBox(-2.5F, 0.0F, -3.5F, 5.0F, 6.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(90, 58).addBox(-2.0F, 6.4F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(58, 21).addBox(-2.5F, 6.4F, -3.5F, 5.0F, 7.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(26, 2).addBox(-2.4F, 13.0F, -7.5F, 5.0F, 2.0F, 10.0F, 0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.5F, 9.0F, 0.5F);
			right_leg.setTextureOffset(0, 88).addBox(-2.5F, -1.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(80, 0).addBox(-2.5F, 6.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(22, 60).addBox(-3.0F, 0.0F, -3.5F, 5.0F, 6.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(64, 0).addBox(-2.5F, 6.4F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 52).addBox(-3.0F, 6.4F, -3.5F, 5.0F, 7.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 28).addBox(-3.1F, 13.0F, -7.5F, 5.0F, 2.0F, 10.0F, 0.25F, false);
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
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
