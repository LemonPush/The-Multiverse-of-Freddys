
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

import net.mcreator.themultiverseoffreddys.entity.TamedScorchingChicaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedScorchingChicaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedScorchingChicaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelScorching_Chica(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/scorching_chica.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelScorching_Chica extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelScorching_Chica() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(49, 0).addBox(-3.0F, -7.0F, -7.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(49, 25).addBox(-3.0F, -8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 36).addBox(-3.0F, -8.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(32, 27).addBox(2.0F, -8.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(57, 58).addBox(-2.0F, -10.0F, -6.8F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(48, 18).addBox(-3.0F, -9.5F, -7.2F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(40, 8).addBox(-1.0F, -10.5F, -6.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(64, 12).addBox(-2.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(54, 5).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 51).addBox(0.7F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 41).addBox(-2.7F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 8).addBox(-4.5F, -13.5F, -4.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(22, 24).addBox(3.5F, -13.5F, -4.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -15.5F, -1.5F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.3054F, 0.0F, 0.0F);
			head_r1.setTextureOffset(32, 12).addBox(-1.0F, -1.1F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(0.0F, -15.5F, -1.5F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.3054F, -1.5708F, 0.0F);
			head_r2.setTextureOffset(0, 32).addBox(0.5F, -1.8F, -2.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(0.0F, -15.5F, -1.5F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, -0.3054F, -1.5708F, 0.0F);
			head_r3.setTextureOffset(32, 8).addBox(0.5F, -1.8F, 1.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(0.0F, -15.5F, -1.5F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, -0.3054F, 0.0F, 0.0F);
			head_r4.setTextureOffset(32, 23).addBox(-1.0F, -2.1F, 2.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(24, 39).addBox(-4.0F, -5.9F, -2.7F, 8.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(49, 23).addBox(-3.5F, 2.1F, -2.7F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 43).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(40, 32).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(62, 63).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(56, 62).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(28, 48).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 53).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(8, 62).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 62).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(54, 38).addBox(1.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(0, 41).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(42, 61).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-3.0F, 10.3333F, 0.0F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(24, 48).addBox(0.2F, 10.2667F, -12.9F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_arm_r1.setTextureOffset(56, 49).addBox(-2.0F, 6.6667F, -13.0F, 4.0F, 4.0F, 3.0F, 0.25F, false);
			right_arm_r1.setTextureOffset(0, 0).addBox(-0.5F, 8.1667F, -16.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(30, 58).addBox(-2.0F, 6.6667F, -10.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(16, 58).addBox(-3.0F, 5.6667F, -8.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(54, 28).addBox(-2.0F, 6.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(49, 27).addBox(-1.0F, 5.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(44, 52).addBox(-2.0F, 0.6667F, -7.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.0F, 10.3333F, -11.0F);
			right_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.0F);
			right_arm_r2.setTextureOffset(24, 48).addBox(-2.2F, -0.7333F, -12.9F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(48, 8).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(12, 47).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(50, 61).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(61, 25).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 4).addBox(0.6F, 14.0F, -6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(40, 12).addBox(-2.4F, 14.0F, -6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(32, 23).addBox(-2.4F, 14.0F, -4.0F, 5.0F, 2.0F, 7.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(42, 42).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(42, 32).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(60, 9).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(58, 46).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 32).addBox(-2.6F, 14.0F, -4.0F, 5.0F, 2.0F, 7.0F, 0.0F, false);
			left_leg.setTextureOffset(60, 5).addBox(-2.6F, 14.0F, -6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(12, 41).addBox(0.4F, 14.0F, -6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
