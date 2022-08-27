
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

import net.mcreator.themultiverseoffreddys.entity.IgnitedBonnieEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class IgnitedBonnieRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(IgnitedBonnieEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelIgnitedBonnie(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/ignitedbonnie.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelIgnitedBonnie extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer bone;
		private final ModelRenderer bone_r1;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer body;
		private final ModelRenderer neck;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelIgnitedBonnie() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -7.8294F, -0.95F);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(8.0F, 3.8294F, 9.45F);
			head.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(65, 11).addBox(-10.5F, 11.0F, -8.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(65, 7).addBox(-10.5F, 11.0F, -9.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(56, 59).addBox(-11.0F, 7.0F, -11.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(32, 0).addBox(-12.0F, 7.0F, -17.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.5622F, -12.9931F, 0.45F);
			head.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(3.5622F, -12.9931F, 0.45F);
			head.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 14.8294F, -0.55F);
			head.addChild(bone);
			bone.setTextureOffset(0, 19).addBox(-3.5F, -19.3F, -5.0F, 7.0F, 1.0F, 10.0F, 0.0F, false);
			bone.setTextureOffset(0, 30).addBox(-3.5F, -29.3F, -2.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(21, 30).addBox(-4.6F, -34.7F, 0.7F, 4.0F, 5.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(72, 60).addBox(-4.1F, -35.7F, 1.2F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(72, 60).addBox(-4.1F, -30.7F, 1.2F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(21, 30).addBox(0.6F, -34.7F, 0.7F, 4.0F, 5.0F, 2.0F, 0.0F, true);
			bone.setTextureOffset(72, 60).addBox(1.1F, -35.7F, 1.2F, 3.0F, 2.0F, 1.0F, 0.0F, true);
			bone.setTextureOffset(72, 60).addBox(1.1F, -30.7F, 1.2F, 3.0F, 2.0F, 1.0F, 0.0F, true);
			bone.setTextureOffset(0, 38).addBox(3.5F, -29.3F, -2.0F, 1.0F, 11.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(0, 38).addBox(-4.5F, -29.3F, -2.0F, 1.0F, 11.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(32, 10).addBox(-3.5F, -20.3F, -5.0F, 7.0F, 1.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(16, 53).addBox(-4.5F, -29.4F, 4.1F, 9.0F, 11.0F, 1.0F, -0.1F, false);
			bone.setTextureOffset(13, 65).addBox(4.5F, -23.5F, -2.1F, 1.0F, 4.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(13, 65).addBox(-5.5F, -23.5F, -2.1F, 1.0F, 4.0F, 7.0F, 0.0F, true);
			bone_r1 = new ModelRenderer(this);
			bone_r1.setRotationPoint(2.0919F, -35.8308F, 0.8243F);
			bone.addChild(bone_r1);
			setRotationAngle(bone_r1, 0.5236F, 0.0F, 0.0F);
			bone_r1.setTextureOffset(0, 56).addBox(-0.9919F, -4.1396F, -0.6186F, 3.0F, 1.0F, 2.0F, 0.0F, true);
			bone_r1.setTextureOffset(26, 0).addBox(-1.4919F, -3.1396F, -0.6186F, 4.0F, 4.0F, 2.0F, 0.0F, true);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
			bone.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -9.0F, 0.0F);
			body.setTextureOffset(51, 37).addBox(-3.5F, 13.0F, -2.0F, 7.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(72, 56).addBox(-4.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(71, 52).addBox(-4.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(66, 48).addBox(1.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(54, 0).addBox(1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(75, 26).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(32, 15).addBox(-5.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(56, 44).addBox(-4.0F, 7.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(31, 41).addBox(1.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(74, 0).addBox(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(12, 66).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(69, 34).addBox(-1.0F, 9.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 41).addBox(-1.0F, -1.2F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-3.0F, -1.5F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(1.0F, -1.5F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 19).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(75, 23).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(2.0F, 1.0F, 0.0F);
			body.addChild(neck);
			setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-6.5F, -9.0F, 0.0F);
			right_arm.setTextureOffset(75, 13).addBox(-3.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 75).addBox(-3.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(65, 67).addBox(-3.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(9, 38).addBox(-3.5F, 13.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(53, 67).addBox(-3.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.7F, 7.0F, -0.5F);
			left_leg.setTextureOffset(74, 65).addBox(-1.0F, 8.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(74, 46).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(73, 41).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 66).addBox(-1.5F, 9.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(41, 65).addBox(-1.5F, 1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(64, 16).addBox(-2.0F, 16.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 59).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(18, 38).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 38).addBox(-2.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 33).addBox(1.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(50, 10).addBox(-2.5F, 1.0F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(51, 48).addBox(-2.5F, 8.5F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(51, 48).addBox(-2.5F, 9.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.7F, 7.0F, -0.5F);
			right_leg.setTextureOffset(74, 65).addBox(-1.0F, 8.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(74, 46).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(73, 41).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 66).addBox(-1.5F, 9.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(41, 65).addBox(-1.5F, 1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(60, 0).addBox(-2.0F, 16.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 59).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 30).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(24, 22).addBox(1.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(24, 19).addBox(-2.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(36, 41).addBox(-2.5F, 1.0F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(25, 29).addBox(-2.5F, 14.0F, -6.0F, 5.0F, 3.0F, 9.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
