
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

import net.mcreator.themultiverseoffreddys.entity.ScrapBalloraEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ScrapBalloraRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ScrapBalloraEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelScrap_Ballora(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/scrap_ballora.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelScrap_Ballora extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer right_arm_r5;
		private final ModelRenderer right_arm_r6;
		private final ModelRenderer bone;
		private final ModelRenderer ballora;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer body_r3;
		private final ModelRenderer body_r4;
		private final ModelRenderer body_r5;
		private final ModelRenderer body_r6;
		private final ModelRenderer body_r7;
		private final ModelRenderer body_r8;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelScrap_Ballora() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -10.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 3).addBox(1.0F, -5.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(8, 29).addBox(-0.5F, -2.7F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(4, 29).addBox(2.7F, -2.0F, -3.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 29).addBox(-3.7F, -2.0F, -3.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-3.0F, -5.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(22, 4).addBox(0.7F, -6.0F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(22, 4).addBox(-3.3F, -6.0F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(22, 4).addBox(-2.7F, -6.0F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(22, 4).addBox(1.3F, -6.0F, -3.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 22).addBox(4.0F, -4.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 14).addBox(-5.0F, -4.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 8).addBox(-2.0F, -9.0F, 1.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(35, 39).addBox(-2.0F, -8.0F, 0.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.6431F, -4.1644F, 0.0F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.3054F);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-5.4077F, 12.8508F, 0.0F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 0.0F, -0.2618F);
			right_arm_r1.setTextureOffset(62, 30).addBox(1.1766F, 1.1127F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			right_arm_r1.setTextureOffset(62, 24).addBox(1.6266F, 0.1127F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);
			right_arm_r1.setTextureOffset(0, 55).addBox(1.1766F, -5.8873F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-5.6608F, 13.6553F, 0.0F);
			right_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, -0.0087F);
			right_arm_r2.setTextureOffset(45, 65).addBox(0.5715F, -9.8216F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(-0.1077F, 6.8674F, 0.0F);
			right_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, 0.0F, 0.0F, 0.3927F);
			right_arm_r3.setTextureOffset(24, 46).addBox(-6.1176F, -8.4029F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.6431F, -4.1644F, 0.0F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.3054F);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(5.4077F, 12.8508F, 0.0F);
			left_arm.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, 0.0F, 0.0F, 0.2618F);
			right_arm_r4.setTextureOffset(0, 65).addBox(-4.1766F, 4.1127F, -15.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			right_arm_r4.setTextureOffset(27, 68).addBox(-4.1766F, 13.1127F, -13.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			right_arm_r4.setTextureOffset(0, 33).addBox(-4.1766F, 4.1127F, -17.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_arm_r4.setTextureOffset(0, 0).addBox(-4.1766F, 2.1127F, -17.0F, 2.0F, 2.0F, 31.0F, 0.0F, false);
			right_arm_r4.setTextureOffset(62, 30).addBox(-5.1766F, 1.1127F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r4.setTextureOffset(62, 24).addBox(-4.6266F, 0.1127F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm_r4.setTextureOffset(0, 55).addBox(-5.1766F, -5.8873F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(5.6608F, 13.6553F, 0.0F);
			left_arm.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, 0.0F, 0.0F, 0.0087F);
			right_arm_r5.setTextureOffset(45, 65).addBox(-3.5715F, -9.8216F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_arm_r6 = new ModelRenderer(this);
			right_arm_r6.setRotationPoint(0.1077F, 6.8674F, 0.0F);
			left_arm.addChild(right_arm_r6);
			setRotationAngle(right_arm_r6, 0.0F, 0.0F, -0.3927F);
			right_arm_r6.setTextureOffset(24, 46).addBox(2.1176F, -8.4029F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 10.0F, 0.0F);
			bone.setTextureOffset(0, 46).addBox(-3.5F, -12.0F, -2.5F, 7.0F, 4.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(0, 22).addBox(-4.5F, -13.0F, -3.0F, 9.0F, 2.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(35, 0).addBox(-5.0F, -18.0F, -3.5F, 10.0F, 6.0F, 6.0F, 0.0F, false);
			bone.setTextureOffset(15, 68).addBox(-1.5F, -19.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(66, 62).addBox(5.0F, -17.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(8, 65).addBox(-7.0F, -17.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			ballora = new ModelRenderer(this);
			ballora.setRotationPoint(0.0F, 4.0F, 0.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -13.0F, 0.0F);
			ballora.addChild(body);
			body.setTextureOffset(0, 14).addBox(-5.0F, 12.2F, -2.5F, 10.0F, 3.0F, 5.0F, 0.25F, false);
			body.setTextureOffset(0, 33).addBox(-6.0F, 11.0F, -5.5F, 12.0F, 2.0F, 11.0F, 0.0F, false);
			body.setTextureOffset(46, 71).addBox(4.0F, 13.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(71, 22).addBox(3.5F, 15.0F, -6.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 71).addBox(1.0F, 13.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(8, 71).addBox(0.5F, 15.0F, -6.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(63, 69).addBox(-2.0F, 13.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(55, 69).addBox(-2.5F, 15.0F, -6.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(61, 0).addBox(-5.0F, 13.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(67, 68).addBox(-5.5F, 15.0F, -6.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(44, 58).addBox(-5.5F, 15.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 46).addBox(-5.0F, 13.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(35, 68).addBox(-2.5F, 15.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(36, 46).addBox(-2.0F, 13.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(68, 45).addBox(0.5F, 15.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(40, 47).addBox(1.0F, 13.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(68, 58).addBox(3.5F, 15.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 55).addBox(4.0F, 13.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(-1.0F, 17.0F, 0.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, -1.5708F, 0.0F);
			body_r1.setTextureOffset(35, 12).addBox(-3.5F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r1.setTextureOffset(35, 0).addBox(-0.5F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r1.setTextureOffset(25, 14).addBox(2.5F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(-1.0F, 16.0F, 0.0F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, -1.5708F, 0.0F);
			body_r2.setTextureOffset(19, 46).addBox(-4.0F, -1.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r2.setTextureOffset(23, 22).addBox(-1.0F, -1.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r2.setTextureOffset(22, 0).addBox(2.0F, -1.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(-1.0F, 11.0F, 0.5F);
			body.addChild(body_r3);
			setRotationAngle(body_r3, 0.0F, -1.5708F, -0.2618F);
			body_r3.setTextureOffset(35, 24).addBox(-6.0F, 0.0F, 1.5F, 11.0F, 1.0F, 5.0F, 0.0F, false);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(1.0F, 11.0F, 0.5F);
			body.addChild(body_r4);
			setRotationAngle(body_r4, 0.0F, 1.5708F, 0.2618F);
			body_r4.setTextureOffset(35, 33).addBox(-5.0F, 0.0F, 1.5F, 11.0F, 1.0F, 5.0F, 0.0F, false);
			body_r5 = new ModelRenderer(this);
			body_r5.setRotationPoint(1.0F, 17.0F, 0.0F);
			body.addChild(body_r5);
			setRotationAngle(body_r5, 0.0F, 1.5708F, 0.0F);
			body_r5.setTextureOffset(35, 33).addBox(2.5F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r5.setTextureOffset(35, 24).addBox(-0.5F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r5.setTextureOffset(35, 18).addBox(-3.5F, -4.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r6 = new ModelRenderer(this);
			body_r6.setRotationPoint(1.0F, 16.0F, 0.0F);
			body.addChild(body_r6);
			setRotationAngle(body_r6, 0.0F, 1.5708F, 0.0F);
			body_r6.setTextureOffset(28, 58).addBox(2.0F, -1.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r6.setTextureOffset(12, 55).addBox(-1.0F, -1.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r6.setTextureOffset(52, 47).addBox(-4.0F, -1.0F, 4.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r7 = new ModelRenderer(this);
			body_r7.setRotationPoint(0.0F, 11.0F, 0.5F);
			body.addChild(body_r7);
			setRotationAngle(body_r7, -0.2618F, 0.0F, 0.0F);
			body_r7.setTextureOffset(35, 12).addBox(-6.0F, 0.0F, 1.5F, 12.0F, 1.0F, 5.0F, 0.0F, false);
			body_r8 = new ModelRenderer(this);
			body_r8.setRotationPoint(0.0F, 11.0F, -0.5F);
			body.addChild(body_r8);
			setRotationAngle(body_r8, 0.2618F, 0.0F, 0.0F);
			body_r8.setTextureOffset(35, 18).addBox(-6.0F, 0.0F, -6.5F, 12.0F, 1.0F, 5.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.8F, -3.0F, 0.0F);
			ballora.addChild(right_leg);
			setRotationAngle(right_leg, 0.0F, 0.48F, 0.0F);
			right_leg.setTextureOffset(52, 54).addBox(-1.9F, 12.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(32, 58).addBox(-1.9F, 5.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(57, 65).addBox(-1.4F, 11.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(61, 0).addBox(-1.9F, 19.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(64, 52).addBox(-1.9F, 20.0F, -2.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(27, 28).addBox(-0.4F, 22.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.8F, -3.0F, 0.0F);
			ballora.addChild(left_leg);
			setRotationAngle(left_leg, 0.0F, -0.48F, 0.0F);
			left_leg.setTextureOffset(40, 47).addBox(-2.1F, 12.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(16, 58).addBox(-2.1F, 5.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(64, 18).addBox(-1.6F, 11.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(56, 47).addBox(-2.1F, 19.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(64, 38).addBox(-2.1F, 20.0F, -2.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(27, 28).addBox(-0.6F, 22.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
			ballora.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.ballora.rotateAngleY = f2 / 20.f;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
