
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

import net.mcreator.themultiverseoffreddys.entity.CreationEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CreationRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CreationEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelCreation(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/creation.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelCreation extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer bone;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer body;
		private final ModelRenderer neck;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm_r1;
		private final ModelRenderer left_arm_r2;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg2;
		private final ModelRenderer right_arm2;
		private final ModelRenderer left_arm2;

		public ModelCreation() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -7.8294F, -0.95F);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(8.0F, 3.8294F, 9.45F);
			head.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(56, 57).addBox(-10.5F, 11.0F, -11.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(56, 53).addBox(-10.5F, 11.0F, -8.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(56, 41).addBox(-10.5F, 11.0F, -10.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(56, 15).addBox(-10.5F, 11.0F, -9.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(22, 36).addBox(-11.0F, 7.0F, -11.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(28, 0).addBox(-12.0F, 7.0F, -17.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.5622F, -12.9931F, 0.45F);
			head.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);
			right_arm_r2.setTextureOffset(50, 0).addBox(-4.6426F, -1.6774F, -1.7667F, 4.0F, 2.0F, 4.0F, 0.25F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(3.5622F, -12.9931F, 0.45F);
			head.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 14.8294F, -0.55F);
			head.addChild(bone);
			bone.setTextureOffset(16, 44).addBox(-3.5F, -21.6F, -5.0F, 7.0F, 1.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(16, 44).addBox(-3.5F, -19.6F, -5.0F, 7.0F, 1.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(34, 10).addBox(-3.5F, -23.6F, -5.0F, 7.0F, 2.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 11).addBox(-4.5F, -28.5F, -2.1F, 9.0F, 7.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(26, 28).addBox(-3.0F, -29.5F, -1.5F, 6.0F, 2.0F, 6.0F, -0.25F, false);
			bone.setTextureOffset(47, 45).addBox(-2.0F, -32.5F, -0.5F, 4.0F, 4.0F, 4.0F, -0.25F, false);
			bone.setTextureOffset(0, 25).addBox(-4.5F, -21.5F, -2.1F, 9.0F, 2.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-4.5F, -18.5F, -5.1F, 9.0F, 1.0F, 10.0F, 0.0F, false);
			bone.setTextureOffset(31, 45).addBox(4.5F, -23.5F, -2.1F, 1.0F, 4.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(31, 45).addBox(-5.5F, -23.5F, -2.1F, 1.0F, 4.0F, 7.0F, 0.0F, true);
			bone.setTextureOffset(46, 32).addBox(-2.5F, -24.2F, -4.8F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(28, 3).addBox(-1.0F, -25.2F, -4.8F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
			bone.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
			right_arm_r4.setTextureOffset(62, 61).addBox(-11.5F, 9.7F, -17.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);
			right_arm_r4.setTextureOffset(0, 63).addBox(-7.0F, 10.2F, -15.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r4.setTextureOffset(0, 63).addBox(-11.0F, 10.2F, -15.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r4.setTextureOffset(62, 61).addBox(-7.5F, 9.7F, -17.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -9.0F, 0.0F);
			body.setTextureOffset(0, 34).addBox(-3.5F, 13.0F, -2.0F, 7.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(60, 19).addBox(-4.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(59, 45).addBox(-4.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(33, 56).addBox(1.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(53, 24).addBox(1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(47, 62).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(50, 37).addBox(-5.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(44, 28).addBox(-4.0F, 7.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(40, 45).addBox(1.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(33, 60).addBox(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(60, 32).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(25, 11).addBox(-1.0F, 9.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(28, 0).addBox(-1.0F, -1.2F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 11).addBox(-3.0F, -1.5F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 11).addBox(1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(39, 62).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(2.0F, 1.0F, 0.0F);
			body.addChild(neck);
			setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(6.5F, -9.0F, 0.0F);
			setRotationAngle(left_arm, -0.7854F, 0.0F, -0.6109F);
			left_arm.setTextureOffset(24, 49).addBox(1.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			left_arm.setTextureOffset(44, 16).addBox(0.0F, 13.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(14, 41).addBox(1.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			left_arm.setTextureOffset(9, 55).addBox(0.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(44, 53).addBox(0.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-6.5F, -9.0F, 0.0F);
			setRotationAngle(right_arm, -0.7854F, 0.0F, 0.6109F);
			right_arm.setTextureOffset(9, 55).addBox(-3.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(12, 49).addBox(-4.0F, 13.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(18, 34).addBox(-3.3F, 15.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(18, 34).addBox(-4.7F, 18.2F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(24, 49).addBox(-3.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(14, 41).addBox(-3.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(44, 53).addBox(-3.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_arm_r1 = new ModelRenderer(this);
			left_arm_r1.setRotationPoint(-2.3F, 17.0F, 0.0F);
			right_arm.addChild(left_arm_r1);
			setRotationAngle(left_arm_r1, 0.0F, 0.0F, 2.3562F);
			left_arm_r1.setTextureOffset(0, 58).addBox(1.9F, -3.6F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_arm_r2 = new ModelRenderer(this);
			left_arm_r2.setRotationPoint(-2.3F, 17.0F, 0.0F);
			right_arm.addChild(left_arm_r2);
			setRotationAngle(left_arm_r2, 0.0F, 0.0F, 0.6109F);
			left_arm_r2.setTextureOffset(0, 58).addBox(-1.2F, -0.6F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.7F, 7.0F, -0.5F);
			left_leg.setTextureOffset(62, 36).addBox(-1.0F, 8.0F, -2.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(62, 0).addBox(-1.0F, 15.0F, -2.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(54, 61).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(56, 6).addBox(-1.5F, 9.0F, -3.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 48).addBox(-1.5F, 1.0F, -3.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 41).addBox(-2.0F, 16.0F, -5.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(36, 38).addBox(-2.0F, 15.6F, -5.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 28).addBox(-0.5F, 16.0F, -7.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 25).addBox(-2.3F, 16.0F, -7.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 15).addBox(1.3F, 16.0F, -7.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(25, 16).addBox(-2.5F, 14.0F, -8.0F, 5.0F, 3.0F, 9.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.7F, 7.0F, -0.5F);
			right_leg.setTextureOffset(62, 36).addBox(-1.0F, 8.0F, -2.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(62, 0).addBox(-1.0F, 15.0F, -2.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(54, 61).addBox(-1.0F, 0.0F, -2.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(21, 55).addBox(-1.5F, 9.0F, -3.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 48).addBox(-1.5F, 1.0F, -3.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 41).addBox(-2.0F, 16.0F, -5.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
			right_leg.setTextureOffset(36, 38).addBox(-2.0F, 15.6F, -5.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 28).addBox(-0.5F, 16.0F, -7.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 25).addBox(1.3F, 16.0F, -7.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 15).addBox(-2.3F, 16.0F, -7.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(25, 16).addBox(-2.5F, 14.0F, -8.0F, 5.0F, 3.0F, 9.0F, 0.0F, true);
			right_leg2 = new ModelRenderer(this);
			right_leg2.setRotationPoint(0.3F, 7.0F, 2.5F);
			setRotationAngle(right_leg2, 0.0F, 3.1416F, 0.0F);
			right_leg2.setTextureOffset(62, 36).addBox(-1.0F, 8.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg2.setTextureOffset(62, 0).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg2.setTextureOffset(54, 61).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg2.setTextureOffset(21, 55).addBox(-1.5F, 9.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg2.setTextureOffset(0, 48).addBox(-1.5F, 1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
			right_leg2.setTextureOffset(0, 41).addBox(-2.0F, 16.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
			right_leg2.setTextureOffset(36, 38).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
			right_leg2.setTextureOffset(0, 28).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg2.setTextureOffset(0, 25).addBox(1.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg2.setTextureOffset(0, 15).addBox(-2.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			right_arm2 = new ModelRenderer(this);
			right_arm2.setRotationPoint(-3.5F, -4.0F, 0.0F);
			setRotationAngle(right_arm2, -0.7854F, 0.0F, 0.0F);
			right_arm2.setTextureOffset(9, 55).addBox(-3.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_arm2.setTextureOffset(24, 49).addBox(-3.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm2.setTextureOffset(14, 41).addBox(-3.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm2.setTextureOffset(44, 53).addBox(-3.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_arm2 = new ModelRenderer(this);
			left_arm2.setRotationPoint(3.5F, -4.0F, 0.0F);
			setRotationAngle(left_arm2, -0.7854F, 0.0F, 0.0F);
			left_arm2.setTextureOffset(24, 49).addBox(1.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			left_arm2.setTextureOffset(14, 41).addBox(1.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			left_arm2.setTextureOffset(9, 55).addBox(0.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_arm2.setTextureOffset(44, 53).addBox(0.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
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
			right_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm2.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm2.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.right_leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
