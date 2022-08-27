
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

import net.mcreator.themultiverseoffreddys.entity.AcephalousEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AcephalousRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AcephalousEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelAcephalous(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/acephalous.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelAcephalous extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_arm_r1;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm_r2;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelAcephalous() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 4.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 15.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(12, 19).addBox(-1.0F, -14.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(2.9844F, -6.4704F, 0.0F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.4363F);
			left_arm_r1 = new ModelRenderer(this);
			left_arm_r1.setRotationPoint(-0.4226F, 0.9063F, 0.0F);
			left_arm.addChild(left_arm_r1);
			setRotationAngle(left_arm_r1, 0.0F, 0.0F, 0.4363F);
			left_arm_r1.setTextureOffset(24, 10).addBox(1.0F, 11.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(16, 19).addBox(1.0F, -2.5F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-2.9844F, -6.4704F, 0.0F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.4363F);
			left_arm_r2 = new ModelRenderer(this);
			left_arm_r2.setRotationPoint(0.4226F, 0.9063F, 0.0F);
			right_arm.addChild(left_arm_r2);
			setRotationAngle(left_arm_r2, 0.0F, 0.0F, -0.4363F);
			left_arm_r2.setTextureOffset(24, 10).addBox(-5.0F, 11.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			left_arm_r2.setTextureOffset(16, 19).addBox(-5.0F, -2.5F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 6.25F, -0.75F);
			left_leg.setTextureOffset(0, 19).addBox(-2.0F, 0.75F, -1.25F, 4.0F, 14.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 0).addBox(-2.0F, 14.75F, -4.25F, 4.0F, 3.0F, 7.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 6.25F, -0.75F);
			right_leg.setTextureOffset(0, 19).addBox(-2.0F, 0.75F, -1.25F, 4.0F, 14.0F, 4.0F, 0.0F, true);
			right_leg.setTextureOffset(24, 0).addBox(-2.0F, 14.75F, -4.25F, 4.0F, 3.0F, 7.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
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
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
