
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

import net.mcreator.themultiverseoffreddys.entity.TamedBalloraEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedBalloraRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedBalloraEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBallora(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/ballora.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBallora extends EntityModel<Entity> {
		private final ModelRenderer ballora;
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer body_r3;
		private final ModelRenderer body_r4;
		private final ModelRenderer body_r5;
		private final ModelRenderer body_r6;
		private final ModelRenderer body_r7;
		private final ModelRenderer body_r8;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer right_arm_r5;
		private final ModelRenderer right_arm_r6;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelBallora() {
			textureWidth = 128;
			textureHeight = 128;
			ballora = new ModelRenderer(this);
			ballora.setRotationPoint(0.0F, 4.0F, 0.0F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -14.0F, 0.0F);
			ballora.addChild(head);
			head.setTextureOffset(0, 25).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(1.0F, -5.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(35, 8).addBox(-0.5F, -2.7F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 29).addBox(2.7F, -2.0F, -3.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(7, 1).addBox(-3.7F, -2.0F, -3.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 13).addBox(-3.0F, -5.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(49, 6).addBox(1.0F, -6.0F, -3.0F, 2.0F, 0.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(49, 6).addBox(-3.0F, -6.0F, -3.0F, 2.0F, 0.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(22, 25).addBox(4.0F, -4.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 25).addBox(-5.0F, -4.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 62).addBox(-2.0F, -9.0F, 1.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 6).addBox(-2.0F, -8.0F, 0.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -13.0F, 0.0F);
			ballora.addChild(body);
			body.setTextureOffset(35, 0).addBox(-5.0F, 12.2F, -2.5F, 10.0F, 3.0F, 5.0F, 0.25F, false);
			body.setTextureOffset(0, 0).addBox(-6.0F, 11.0F, -5.5F, 12.0F, 2.0F, 11.0F, 0.0F, false);
			body.setTextureOffset(59, 36).addBox(4.0F, 13.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(72, 63).addBox(3.5F, 15.0F, -6.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(59, 19).addBox(1.0F, 13.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(72, 54).addBox(0.5F, 15.0F, -6.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(58, 8).addBox(-2.0F, 13.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(72, 33).addBox(-2.5F, 15.0F, -6.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(55, 12).addBox(-5.0F, 13.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(72, 29).addBox(-5.5F, 15.0F, -6.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(52, 70).addBox(-5.5F, 15.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(24, 44).addBox(-5.0F, 13.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 70).addBox(-2.5F, 15.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(47, 45).addBox(-2.0F, 13.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(68, 70).addBox(0.5F, 15.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 50).addBox(1.0F, 13.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(72, 7).addBox(3.5F, 15.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(44, 50).addBox(4.0F, 13.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 13).addBox(-5.0F, 1.0F, -3.5F, 10.0F, 6.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(23, 37).addBox(-4.5F, 6.0F, -3.0F, 9.0F, 2.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(24, 44).addBox(-4.5F, 4.0F, -2.5F, 9.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 39).addBox(-3.5F, 7.0F, -2.5F, 7.0F, 4.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(26, 70).addBox(5.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-7.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(68, 25).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(-1.0F, 17.0F, 0.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, -1.5708F, 0.0F);
			body_r1.setTextureOffset(32, 19).addBox(-3.5F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r1.setTextureOffset(28, 31).addBox(-0.5F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r1.setTextureOffset(26, 13).addBox(2.5F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(-1.0F, 16.0F, 0.0F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, -1.5708F, 0.0F);
			body_r2.setTextureOffset(51, 25).addBox(-4.0F, -1.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r2.setTextureOffset(28, 50).addBox(-1.0F, -1.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r2.setTextureOffset(12, 50).addBox(2.0F, -1.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(-1.0F, 11.0F, 0.5F);
			body.addChild(body_r3);
			setRotationAngle(body_r3, 0.0F, -1.5708F, -0.2618F);
			body_r3.setTextureOffset(28, 31).addBox(-6.0F, 0.0F, 1.5F, 11.0F, 1.0F, 5.0F, 0.0F, false);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(1.0F, 11.0F, 0.5F);
			body.addChild(body_r4);
			setRotationAngle(body_r4, 0.0F, 1.5708F, 0.2618F);
			body_r4.setTextureOffset(32, 19).addBox(-5.0F, 0.0F, 1.5F, 11.0F, 1.0F, 5.0F, 0.0F, false);
			body_r5 = new ModelRenderer(this);
			body_r5.setRotationPoint(1.0F, 17.0F, 0.0F);
			body.addChild(body_r5);
			setRotationAngle(body_r5, 0.0F, 1.5708F, 0.0F);
			body_r5.setTextureOffset(19, 39).addBox(2.5F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r5.setTextureOffset(0, 39).addBox(-0.5F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r5.setTextureOffset(35, 0).addBox(-3.5F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r6 = new ModelRenderer(this);
			body_r6.setRotationPoint(1.0F, 16.0F, 0.0F);
			body.addChild(body_r6);
			setRotationAngle(body_r6, 0.0F, 1.5708F, 0.0F);
			body_r6.setTextureOffset(44, 70).addBox(2.0F, -1.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r6.setTextureOffset(36, 70).addBox(-1.0F, -1.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r6.setTextureOffset(24, 62).addBox(-4.0F, -1.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r7 = new ModelRenderer(this);
			body_r7.setRotationPoint(0.0F, 11.0F, 0.5F);
			body.addChild(body_r7);
			setRotationAngle(body_r7, -0.2618F, 0.0F, 0.0F);
			body_r7.setTextureOffset(22, 25).addBox(-6.0F, 0.0F, 1.5F, 12.0F, 1.0F, 5.0F, 0.0F, false);
			body_r8 = new ModelRenderer(this);
			body_r8.setRotationPoint(0.0F, 11.0F, -0.5F);
			body.addChild(body_r8);
			setRotationAngle(body_r8, 0.2618F, 0.0F, 0.0F);
			body_r8.setTextureOffset(26, 13).addBox(-6.0F, 0.0F, -6.5F, 12.0F, 1.0F, 5.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.6F, -15.0F, 0.0F);
			ballora.addChild(right_arm);
			setRotationAngle(right_arm, 3.1416F, 0.0F, 0.1745F);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-5.3F, 6.2333F, 0.0F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 0.0F, -0.2618F);
			right_arm_r1.setTextureOffset(28, 62).addBox(0.754F, 2.019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 63).addBox(1.204F, 1.019F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(60, 36).addBox(0.754F, -4.981F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-5.5531F, 7.0379F, 0.0F);
			right_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, -0.0087F);
			right_arm_r2.setTextureOffset(14, 70).addBox(0.3892F, -8.8384F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(0.0F, 0.25F, 0.0F);
			right_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, 0.0F, 0.0F, 0.3927F);
			right_arm_r3.setTextureOffset(0, 51).addBox(-5.9011F, -7.4266F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.6F, -15.0F, 0.0F);
			ballora.addChild(left_arm);
			setRotationAngle(left_arm, 3.1416F, 0.0F, -0.1745F);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(5.3F, 6.2333F, 0.0F);
			left_arm.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, 0.0F, 0.0F, 0.2618F);
			right_arm_r4.setTextureOffset(60, 55).addBox(-5.1766F, 1.1127F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r4.setTextureOffset(46, 37).addBox(-4.6266F, 0.1127F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm_r4.setTextureOffset(44, 59).addBox(-5.1766F, -5.8873F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(5.5531F, 7.0379F, 0.0F);
			left_arm.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, 0.0F, 0.0F, 0.0087F);
			right_arm_r5.setTextureOffset(64, 19).addBox(-3.5715F, -9.8216F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_arm_r6 = new ModelRenderer(this);
			right_arm_r6.setRotationPoint(0.0F, 0.25F, 0.0F);
			left_arm.addChild(right_arm_r6);
			setRotationAngle(right_arm_r6, 0.0F, 0.0F, -0.3927F);
			right_arm_r6.setTextureOffset(48, 47).addBox(2.1176F, -8.4029F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.8F, -3.0F, 0.0F);
			ballora.addChild(right_leg);
			setRotationAngle(right_leg, 0.0F, 0.48F, 0.0F);
			right_leg.setTextureOffset(60, 8).addBox(-1.9F, 12.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(32, 51).addBox(-1.9F, 5.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(48, 41).addBox(-1.4F, 11.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(64, 47).addBox(-1.9F, 19.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 67).addBox(-1.9F, 20.0F, -2.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.8F, -3.0F, 0.0F);
			ballora.addChild(left_leg);
			setRotationAngle(left_leg, 0.0F, -0.48F, 0.0F);
			left_leg.setTextureOffset(56, 25).addBox(-2.1F, 12.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(16, 51).addBox(-2.1F, 5.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(46, 8).addBox(-1.6F, 11.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(60, 63).addBox(-2.1F, 19.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(65, 0).addBox(-2.1F, 20.0F, -2.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			ballora.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.ballora.rotateAngleY = f2 / 20.f;
		}
	}

}
