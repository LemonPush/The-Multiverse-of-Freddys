
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

import net.mcreator.themultiverseoffreddys.entity.GlamrockEndoEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GlamrockEndoRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GlamrockEndoEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelGlamrockEndo(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/glamrockendo.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelGlamrockEndo extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer bone;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelGlamrockEndo() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -8.0F, 0.11F);
			head.setTextureOffset(0, 15).addBox(-3.0F, -8.0F, -2.11F, 6.0F, 4.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-2.0F, -4.0F, -2.11F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(48, 59).addBox(-3.0F, -7.5F, -3.61F, 6.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(23, 27).addBox(-4.0F, -9.0F, -0.61F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 16).addBox(2.0F, -9.0F, -0.61F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(20, 37).addBox(-2.8F, -7.0F, -4.31F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(35, 0).addBox(0.8F, -7.0F, -4.31F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(49, 7).addBox(-1.0F, -2.0F, -4.11F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(47, 40).addBox(-1.0F, -4.0F, -4.11F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(22, 32).addBox(-1.0F, -3.0F, -4.11F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 20.0F, -0.11F);
			head.addChild(bone);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(0, 8).addBox(-4.5F, 6.0F, -2.0F, 9.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-5.5F, -6.0F, -2.0F, 11.0F, 4.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 26).addBox(-1.5F, -6.0F, 1.0F, 3.0F, 12.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(47, 0).addBox(-1.5F, 5.0F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(24, 51).addBox(-6.0F, -5.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(51, 11).addBox(5.0F, -5.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(36, 9).addBox(5.0F, -6.5F, -1.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(30, 21).addBox(-10.0F, -6.5F, -1.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(38, 0).addBox(-1.5F, -9.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(16, 42).addBox(1.5F, 2.5F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(16, 47).addBox(1.5F, 1.2F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(47, 3).addBox(1.5F, -0.2F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(50, 27).addBox(2.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 50).addBox(2.0F, 4.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(16, 51).addBox(2.0F, 10.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(42, 14).addBox(1.5F, 9.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(39, 31).addBox(-4.5F, 2.5F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(44, 44).addBox(-4.5F, 1.2F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(43, 19).addBox(-4.5F, -0.2F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(44, 48).addBox(-4.0F, -2.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(36, 47).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(8, 51).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(38, 26).addBox(-4.5F, 9.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(23, 37).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(26, 32).addBox(-2.1F, 10.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(10, 32).addBox(-2.1F, 13.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(28, 42).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 40).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(47, 36).addBox(-1.6F, 6.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(47, 23).addBox(-1.6F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(14, 20).addBox(-2.6F, 15.0F, -3.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(7, 37).addBox(-2.6F, 14.0F, -6.0F, 5.0F, 2.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(30, 16).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(26, 27).addBox(-1.9F, 10.5F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(26, 4).addBox(-1.9F, 13.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(8, 42).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(39, 37).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(26, 0).addBox(-1.4F, 6.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(20, 16).addBox(-1.4F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(20, 9).addBox(-2.4F, 15.0F, -3.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(10, 27).addBox(-2.4F, 14.0F, -6.0F, 5.0F, 2.0F, 3.0F, 0.0F, false);
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
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
