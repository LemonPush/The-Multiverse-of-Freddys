
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

import net.mcreator.themultiverseoffreddys.entity.ToBeBeautifulEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ToBeBeautifulRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ToBeBeautifulEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelToBeBeautiful(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/tobebeautiful.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelToBeBeautiful extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_arm_r1;
		private final ModelRenderer bone;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm_r2;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelToBeBeautiful() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0889F, -0.2444F);
			head.setTextureOffset(0, 0).addBox(-3.5F, -7.9111F, -2.7556F, 7.0F, 8.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-2.5F, -5.6111F, -3.0556F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(0.5F, -5.6111F, -3.0556F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(0, 3).addBox(-2.5F, -6.6111F, -3.0556F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 3).addBox(0.5F, -6.6111F, -3.0556F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(32, 32).addBox(4.2F, -5.9111F, -0.7556F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(32, 27).addBox(2.2F, -7.9111F, -0.7556F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(30, 19).addBox(-6.2F, -5.9111F, -0.7556F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(26, 3).addBox(-5.2F, -7.9111F, -0.7556F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.0F, 2.0F, 0.0F);
			left_arm_r1 = new ModelRenderer(this);
			left_arm_r1.setRotationPoint(-0.5F, 0.0F, 0.0F);
			left_arm.addChild(left_arm_r1);
			setRotationAngle(left_arm_r1, 0.0F, 0.0F, -0.3491F);
			left_arm_r1.setTextureOffset(16, 29).addBox(0.0F, -1.3F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			left_arm.addChild(bone);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(22, 10).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 5.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(20, 0).addBox(-2.5F, 1.0F, -2.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 22).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(8, 26).addBox(-1.0F, -5.4F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 14).addBox(-3.0F, 8.0F, -2.5F, 6.0F, 7.0F, 5.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.0F, 2.0F, 0.0F);
			left_arm_r2 = new ModelRenderer(this);
			left_arm_r2.setRotationPoint(0.5F, 0.0F, 0.0F);
			right_arm.addChild(left_arm_r2);
			setRotationAngle(left_arm_r2, 0.0F, 0.0F, 0.3491F);
			left_arm_r2.setTextureOffset(0, 26).addBox(-2.0F, -1.3F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(1.8F, 14.875F, -0.5F);
			left_leg.setTextureOffset(33, 5).addBox(-1.0F, 7.125F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(22, 19).addBox(-1.0F, 8.125F, -2.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 14).addBox(-0.5F, 8.125F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 29).addBox(-1.0F, -2.875F, -0.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-1.8F, 14.875F, -0.5F);
			right_leg.setTextureOffset(33, 5).addBox(-1.0F, 7.125F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(22, 19).addBox(-1.0F, 8.125F, -2.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 14).addBox(-0.5F, 8.125F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_leg.setTextureOffset(24, 29).addBox(-1.0F, -2.875F, -0.5F, 2.0F, 10.0F, 2.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
