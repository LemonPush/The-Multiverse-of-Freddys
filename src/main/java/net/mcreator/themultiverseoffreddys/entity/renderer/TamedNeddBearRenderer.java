
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

import net.mcreator.themultiverseoffreddys.entity.TamedNeddBearEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedNeddBearRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedNeddBearEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelNeddBear(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/neddbear.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelNeddBear extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelNeddBear() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(43, 12).addBox(3.0F, -16.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(-0.5F, -15.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 18).addBox(-1.5F, -16.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 5).addBox(-1.0F, -17.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(40, 28).addBox(-6.0F, -16.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(43, 8).addBox(-4.0F, -10.4F, -6.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(43, 8).addBox(-2.0F, -10.7F, -5.6F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(66, 8).addBox(-0.5F, -11.0F, -6.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(49, 0).addBox(-4.0F, -7.0F, -6.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(83, 8).addBox(-3.0F, -8.4F, -6.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(80, 42).addBox(-3.0F, -8.0F, -6.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(34, 56).addBox(1.0F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(108, 42).addBox(1.0F, -13.9F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(104, 23).addBox(-3.0F, -13.9F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(28, 56).addBox(-3.0F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, -6.5F, -2.5F, 10.0F, 12.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 33).addBox(-4.0F, -5.5F, -2.75F, 8.0F, 10.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 54).addBox(-1.0F, -6.4F, -3.25F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 19).addBox(-0.5F, 2.6F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(56, 24).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(56, 20).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(6, 54).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, -9.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(32, 46).addBox(-5.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(48, 28).addBox(-5.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(28, 46).addBox(-4.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(25, 18).addBox(-4.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(52, 12).addBox(-5.0F, 9.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(40, 18).addBox(1.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(48, 42).addBox(1.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(12, 44).addBox(2.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(30, 22).addBox(2.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(48, 51).addBox(1.0F, 9.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.0F, 7.6F, -0.2F);
			right_leg.setTextureOffset(16, 46).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(34, 35).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(20, 56).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(50, 39).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(22, 25).addBox(-2.5F, 14.4F, -4.8F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.0F, 7.6F, -0.2F);
			left_leg.setTextureOffset(0, 44).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(18, 35).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(12, 56).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(54, 5).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(25, 8).addBox(-2.5F, 14.4F, -4.8F, 5.0F, 2.0F, 8.0F, 0.0F, false);
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
