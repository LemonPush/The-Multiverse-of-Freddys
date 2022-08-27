
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

import net.mcreator.themultiverseoffreddys.entity.NoAIEndo01Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NoAIEndo01Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NoAIEndo01Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelEndo_01(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/endo_01.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelEndo_01 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_arm;

		public ModelEndo_01() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -2.0F, 8.0F, 8.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(34, 20).addBox(1.0F, -9.2F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(36, 0).addBox(-2.0F, -9.2F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(48, 29).addBox(-2.0F, -9.2F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(26, 13).addBox(-2.0F, -10.2F, -5.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(24, 0).addBox(-2.0F, -7.0F, -5.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(9, 25).addBox(-2.0F, -8.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(21, 35).addBox(-2.0F, -8.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(21, 26).addBox(1.0F, -8.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(49, 25).addBox(-2.7F, -12.5F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(49, 3).addBox(0.7F, -12.5F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(0, 12).addBox(-4.5F, 6.0F, -2.0F, 9.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(8, 43).addBox(-6.5F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 31).addBox(4.5F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(28, 48).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(22, 13).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(16, 43).addBox(-1.0F, -2.5F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(24, 38).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(36, 41).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 19).addBox(-5.0F, -5.4F, -1.5F, 10.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(20, 0).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(1.5F, 0.5F, 0.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 0.0F, 0.5672F);
			body_r1.setTextureOffset(0, 42).addBox(0.3F, -4.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(-1.5F, 0.5F, 0.0F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, 0.0F, -0.5672F);
			body_r2.setTextureOffset(4, 42).addBox(-1.3F, -4.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(20, 48).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(48, 16).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(39, 16).addBox(1.5F, 11.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(37, 23).addBox(1.5F, 5.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(37, 2).addBox(1.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(48, 8).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(46, 22).addBox(-1.1F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(8, 47).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(33, 32).addBox(-1.6F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(12, 26).addBox(-1.6F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(22, 6).addBox(-2.1F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(44, 46).addBox(0.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			left_leg.setTextureOffset(36, 46).addBox(-2.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(14, 46).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(46, 0).addBox(-0.9F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(45, 41).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(24, 26).addBox(-1.4F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 25).addBox(-1.4F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(20, 19).addBox(-1.9F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(45, 38).addBox(-2.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_leg.setTextureOffset(45, 35).addBox(0.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(30, 45).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(22, 45).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(39, 10).addBox(-4.5F, 11.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(12, 35).addBox(-4.5F, 5.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 34).addBox(-4.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
