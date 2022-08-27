
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

import net.mcreator.themultiverseoffreddys.entity.FrostbearEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FrostbearRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FrostbearEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelFreddy_Frostbear(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/freddy_frostbear.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFreddy_Frostbear extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelFreddy_Frostbear() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 21).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 11).addBox(-2.0F, -18.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(26, 39).addBox(-3.0F, -15.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(49, 21).addBox(-4.0F, -6.0F, -6.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(54, 10).addBox(-4.0F, -7.0F, -6.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(42, 16).addBox(-4.0F, -9.5F, -6.8F, 8.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(60, 45).addBox(-3.0F, -10.0F, -6.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(34, 46).addBox(-1.0F, -11.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(16, 51).addBox(-2.8F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(50, 35).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 27).addBox(0.7F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 27).addBox(-2.8F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 38).addBox(-5.0F, -9.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(4.0F, -9.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-4.5F, -13.5F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.6109F);
			head_r1.setTextureOffset(0, 4).addBox(-3.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 11).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(4.5F, -13.5F, 0.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, -0.6109F);
			head_r2.setTextureOffset(10, 0).addBox(0.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 13).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 21).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(24, 0).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(54, 49).addBox(-4.0F, -3.0F, -3.5F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(54, 13).addBox(-3.5F, -4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 16).addBox(-3.5F, 4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 39).addBox(-3.0F, -5.0F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 47).addBox(-1.0F, -5.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(49, 0).addBox(1.0F, -6.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 47).addBox(-3.0F, -6.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(44, 39).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(12, 11).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 32).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 29).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(54, 0).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 0).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-3.0F, 10.3333F, 1.0F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(0, 0).addBox(-1.5F, 8.1667F, -11.0F, 3.0F, 3.0F, 18.0F, -0.75F, false);
			right_arm_r1.setTextureOffset(0, 61).addBox(-2.0F, 7.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(24, 42).addBox(-1.0F, 6.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(50, 57).addBox(-2.0F, 1.6667F, -7.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(52, 35).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(12, 56).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(18, 41).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 40).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(28, 59).addBox(1.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(50, 25).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(38, 49).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 37).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 24).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 37).addBox(-2.4F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(0, 47).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(22, 46).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 21).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(10, 4).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 29).addBox(-2.6F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);
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
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
