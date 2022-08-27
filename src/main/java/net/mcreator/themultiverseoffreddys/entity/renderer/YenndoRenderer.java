
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

import net.mcreator.themultiverseoffreddys.entity.YenndoEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class YenndoRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(YenndoEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelYenndo(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/yenndo.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelYenndo extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer right_arm_r6_r1;
		private final ModelRenderer right_arm_r5_r1;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer bone;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer body;
		private final ModelRenderer neck;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelYenndo() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -6.8294F, 0.05F);
			right_arm_r6_r1 = new ModelRenderer(this);
			right_arm_r6_r1.setRotationPoint(4.9548F, -9.6705F, -1.2167F);
			head.addChild(right_arm_r6_r1);
			setRotationAngle(right_arm_r6_r1, -1.5708F, 0.0F, -0.5672F);
			right_arm_r6_r1.setTextureOffset(0, 0).addBox(-0.95F, -2.1F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm_r6_r1.setTextureOffset(17, 26).addBox(0.05F, -2.1F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r5_r1 = new ModelRenderer(this);
			right_arm_r5_r1.setRotationPoint(-4.9548F, -9.6705F, -1.2167F);
			head.addChild(right_arm_r5_r1);
			setRotationAngle(right_arm_r5_r1, -1.5708F, 0.0F, 0.5672F);
			right_arm_r5_r1.setTextureOffset(0, 14).addBox(-0.05F, -2.1F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm_r5_r1.setTextureOffset(12, 65).addBox(-2.05F, -2.1F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(8.0F, 3.8294F, 8.45F);
			head.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(0, 36).addBox(-11.0F, 6.0F, -9.5F, 6.0F, 5.0F, 5.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(50, 0).addBox(-12.0F, 5.0F, -5.2F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(39, 18).addBox(-11.0F, 12.0F, -5.2F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(105, 43).addBox(-11.0F, 13.0F, -6.2F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.5622F, -12.9931F, -0.55F);
			head.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(3.5622F, -12.9931F, -0.55F);
			head.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 14.8294F, -1.55F);
			head.addChild(bone);
			bone.setTextureOffset(98, 54).addBox(-3.0F, -18.5F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(34, 30).addBox(-3.5F, -20.5F, -4.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 14).addBox(-4.0F, -25.5F, -2.1F, 8.0F, 5.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(0, 65).addBox(-2.0F, -26.5F, -0.5F, 4.0F, 2.0F, 4.0F, -0.25F, false);
			bone.setTextureOffset(18, 55).addBox(-1.0F, -28.5F, 0.5F, 2.0F, 4.0F, 2.0F, -0.25F, false);
			bone.setTextureOffset(9, 55).addBox(3.5F, -20.5F, -2.1F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(66, 49).addBox(-3.5F, -20.5F, 3.9F, 7.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(43, 53).addBox(-4.5F, -20.5F, -2.1F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(0, 3).addBox(-0.5F, -21.1F, -3.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
			bone.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
			right_arm_r4.setTextureOffset(65, 33).addBox(-11.5F, 9.7F, -14.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);
			right_arm_r4.setTextureOffset(49, 63).addBox(-7.0F, 10.2F, -12.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r4.setTextureOffset(62, 44).addBox(-11.0F, 10.2F, -12.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r4.setTextureOffset(0, 62).addBox(-7.5F, 9.7F, -14.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(-0.5F, -9.0F, 0.0F);
			body.setTextureOffset(25, 21).addBox(-4.5F, 15.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 71).addBox(-4.0F, 7.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(55, 24).addBox(-4.0F, 4.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(52, 53).addBox(1.0F, 4.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(67, 62).addBox(1.0F, 2.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(52, 8).addBox(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(25, 0).addBox(1.0F, 7.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(44, 69).addBox(5.05F, 2.0F, -2.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(67, 66).addBox(-6.05F, 2.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(61, 24).addBox(-1.5F, 12.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-4.5F, 6.1F, -2.5F, 10.0F, 9.0F, 5.0F, 0.25F, false);
			body.setTextureOffset(16, 47).addBox(-3.5F, 7.1F, -3.5F, 8.0F, 7.0F, 1.0F, 0.25F, false);
			body.setTextureOffset(25, 9).addBox(-5.0F, 2.6F, -2.5F, 11.0F, 3.0F, 5.0F, 0.25F, false);
			body.setTextureOffset(56, 70).addBox(-1.0F, 2.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(37, 63).addBox(-1.5F, 1.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(2.0F, 1.0F, 0.0F);
			body.addChild(neck);
			setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.5F, -9.0F, 0.0F);
			left_arm.setTextureOffset(53, 14).addBox(1.0F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(55, 62).addBox(1.0F, 14.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(50, 43).addBox(1.0F, 2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.5F, -9.0F, 0.0F);
			right_arm.setTextureOffset(49, 30).addBox(-5.0F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(62, 36).addBox(-5.0F, 14.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(34, 47).addBox(-5.0F, 2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.2F, 7.0F, -0.5F);
			left_leg.setTextureOffset(37, 57).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(28, 69).addBox(-1.95F, 2.0F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 47).addBox(-1.95F, 3.0F, -1.5F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(59, 53).addBox(-1.95F, 9.0F, -1.5F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(16, 40).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(17, 30).addBox(-2.45F, 14.0F, -4.0F, 5.0F, 3.0F, 7.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.2F, 7.0F, -0.5F);
			right_leg.setTextureOffset(53, 40).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(16, 66).addBox(-2.05F, 2.0F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(37, 37).addBox(-2.05F, 3.0F, -1.5F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(25, 57).addBox(-2.05F, 9.0F, -1.5F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(30, 0).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 26).addBox(-2.55F, 14.0F, -4.0F, 5.0F, 3.0F, 7.0F, 0.0F, false);
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
