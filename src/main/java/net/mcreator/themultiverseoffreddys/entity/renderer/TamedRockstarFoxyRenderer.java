
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

import net.mcreator.themultiverseoffreddys.entity.TamedRockstarFoxyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedRockstarFoxyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedRockstarFoxyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelRockstarFoxy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/rockstarfoxy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelRockstarFoxy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer head_r6;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelRockstarFoxy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 22).addBox(-4.0F, -9.4F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(42, 30).addBox(4.0F, -10.5F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(41, 60).addBox(4.0F, -10.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(9, 57).addBox(4.0F, -9.4F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(18, 31).addBox(-7.0F, -10.5F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(54, 33).addBox(-5.0F, -9.4F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(12, 60).addBox(-6.0F, -10.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(45, 56).addBox(-3.0F, -9.4F, -7.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 43).addBox(-2.0F, -9.4F, -9.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(19, 60).addBox(-1.5F, -10.4F, -8.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(75, 24).addBox(-0.5F, -11.0F, -8.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(58, 33).addBox(-2.5F, -10.4F, -7.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(49, 0).addBox(-3.0F, -7.0F, -7.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(55, 13).addBox(-2.0F, -7.0F, -9.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 13).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(116, 51).addBox(-2.0F, -8.4F, -9.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(116, 42).addBox(-2.0F, -8.0F, -9.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(111, 62).addBox(-3.0F, -8.4F, -7.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(116, 61).addBox(-3.0F, -8.0F, -7.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(74, 42).addBox(2.0F, -8.0F, -7.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(76, 53).addBox(2.0F, -8.4F, -7.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(116, 61).addBox(-4.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(74, 42).addBox(3.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(111, 62).addBox(-4.0F, -8.4F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(76, 53).addBox(3.0F, -8.4F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(62, 63).addBox(0.7F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(50, 63).addBox(-2.7F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(88, 0).addBox(-2.7F, -13.7F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(110, 30).addBox(0.7F, -13.7F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-3.3719F, -13.1917F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, -0.6109F);
			head_r1.setTextureOffset(28, 31).addBox(-0.5585F, -1.1304F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			head_r1.setTextureOffset(0, 22).addBox(-1.5585F, -5.1304F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, true);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(3.3719F, -13.1917F, 0.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.6109F);
			head_r2.setTextureOffset(0, 22).addBox(-1.4415F, -5.1304F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(28, 31).addBox(-0.4415F, -1.1304F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(1.0F, -12.8F, 0.0F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, 0.3927F);
			head_r3.setTextureOffset(64, 0).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-1.0F, -13.0F, 0.0F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, -1.5708F, -1.2654F, 1.5708F);
			head_r4.setTextureOffset(16, 51).addBox(-0.5F, -2.8F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(-1.0F, -13.0F, 0.0F);
			head.addChild(head_r5);
			setRotationAngle(head_r5, 1.5708F, -1.2654F, -1.5708F);
			head_r5.setTextureOffset(26, 63).addBox(-1.5F, -3.2F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(-1.0F, -12.8F, 0.0F);
			head.addChild(head_r6);
			setRotationAngle(head_r6, 0.0F, 0.0F, -0.3927F);
			head_r6.setTextureOffset(11, 64).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(27, 20).addBox(-5.0F, -6.5F, -2.5F, 10.0F, 5.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(27, 8).addBox(-4.5F, -1.5F, -2.5F, 9.0F, 7.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 31).addBox(-4.0F, -6.5F, -2.75F, 8.0F, 11.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(75, 0).addBox(-2.0F, -5.5F, -3.05F, 4.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(20, 63).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(18, 36).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(62, 43).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, -10.0F, -0.8F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.7F, -5.0F, 0.0F);
			right_arm.setTextureOffset(0, 47).addBox(-5.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(50, 4).addBox(-5.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(42, 35).addBox(-4.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 18).addBox(-4.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(53, 26).addBox(-5.0F, 9.5F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(46, 46).addBox(-3.55F, 12.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(24, 0).addBox(-4.75F, 15.1F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-3.05F, 12.5F, 0.0F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 0.0F, 1.9635F);
			right_arm_r1.setTextureOffset(42, 40).addBox(4.9F, -2.6F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.05F, 12.5F, 0.0F);
			right_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, 0.829F);
			right_arm_r2.setTextureOffset(42, 30).addBox(3.9F, 2.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(0, 46).addBox(0.8F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.7F, -5.0F, 0.0F);
			left_arm.setTextureOffset(46, 36).addBox(1.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(16, 51).addBox(1.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 27).addBox(2.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(24, 22).addBox(2.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(52, 16).addBox(1.0F, 9.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(4.0355F, -2.2931F, -0.4167F);
			left_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, 0.1185F, 0.1841F, 0.2903F);
			right_arm_r3.setTextureOffset(92, 74).addBox(-0.7491F, -4.9322F, -0.0833F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			right_arm_r3.setTextureOffset(102, 77).addBox(-2.7491F, -4.9322F, -0.5833F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			right_arm_r3.setTextureOffset(102, 77).addBox(1.2509F, -4.9322F, -0.5833F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			right_arm_r3.setTextureOffset(104, 73).addBox(-0.7491F, -5.5322F, -2.5833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r3.setTextureOffset(101, 85).addBox(-0.7491F, -8.9322F, -0.0833F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm_r3.setTextureOffset(109, 74).addBox(-1.7491F, -6.9322F, -1.5833F, 3.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.0F, 7.6F, -0.2F);
			right_leg.setTextureOffset(46, 46).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(60, 56).addBox(-2.0F, 7.15F, -2.3F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(30, 40).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(62, 52).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(62, 4).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(24, 30).addBox(-2.5F, 14.4F, -4.8F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.0F, 7.6F, -0.2F);
			left_leg.setTextureOffset(32, 52).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 57).addBox(-1.5F, 11.4F, -1.3F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(14, 40).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(62, 49).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(62, 40).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(48, 60).addBox(-2.0F, 7.15F, -2.3F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
