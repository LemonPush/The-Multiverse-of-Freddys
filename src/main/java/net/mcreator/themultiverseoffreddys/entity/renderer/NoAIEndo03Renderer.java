
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

import net.mcreator.themultiverseoffreddys.entity.NoAIEndo03Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NoAIEndo03Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NoAIEndo03Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelEndo_03(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/endo_03.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelEndo_03 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_arm;

		public ModelEndo_03() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 2.9774F, 0.0366F);
			head.setTextureOffset(12, 11).addBox(-3.5F, -3.9774F, -1.0366F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(12, 8).addBox(-3.5F, -10.9774F, -1.0366F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 8).addBox(-2.75F, -15.4774F, -0.5366F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(29, 0).addBox(-2.25F, -16.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 28).addBox(-2.25F, -11.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(10, 26).addBox(1.25F, -16.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(27, 20).addBox(1.25F, -11.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(0.75F, -15.4774F, -0.5366F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 26).addBox(3.0F, -9.9774F, -1.0366F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(12, 36).addBox(3.0F, -5.9774F, 0.9634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(36, 8).addBox(2.0F, -5.9774F, 1.9634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 36).addBox(-3.0F, -5.9774F, 1.9634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(18, 5).addBox(-2.0F, -5.9774F, 2.9634F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(38, 20).addBox(-1.0F, -7.9774F, 2.9634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 38).addBox(-1.0F, -9.4774F, 1.9634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(6, 38).addBox(-1.0F, -10.9774F, 0.9634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 4).addBox(-4.0F, -5.9774F, 0.9634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(38, 23).addBox(-3.0F, -8.4774F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 34).addBox(-4.0F, -8.4774F, -2.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(37, 37).addBox(-2.5F, -8.9774F, -4.0366F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(23, 36).addBox(0.5F, -8.9774F, -4.0366F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(38, 12).addBox(1.0F, -8.4774F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(38, 0).addBox(2.0F, -8.4774F, -2.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(6, 26).addBox(-4.0F, -9.9774F, -1.0366F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(1.75F, -15.3774F, -0.0366F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.5672F, 0.0F, 0.0F);
			head_r1.setTextureOffset(24, 14).addBox(-0.5F, -4.6F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(22, 22).addBox(-4.0F, -4.6F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(8, 16).addBox(-1.0F, -3.6F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 28).addBox(-4.5F, -3.6F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(40, 8).addBox(-3.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(40, 4).addBox(-3.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(40, 2).addBox(-3.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(28, 38).addBox(1.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(38, 30).addBox(1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 40).addBox(1.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(33, 14).addBox(1.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(32, 28).addBox(-5.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 0).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.5F, 0.85F, 0.0F);
			left_arm.setTextureOffset(16, 22).addBox(1.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(18, 28).addBox(1.0F, 4.65F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(24, 32).addBox(1.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(32, 0).addBox(1.0F, 7.4F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 32).addBox(1.0F, 3.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(15, 14).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(35, 16).addBox(-1.0F, 0.2083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(30, 34).addBox(-1.0F, 5.2083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(6, 34).addBox(-1.0F, 9.7083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(27, 14).addBox(-1.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(0, 8).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(15, 14).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(16, 33).addBox(-1.0F, 0.2083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(32, 30).addBox(-1.0F, 5.2083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(32, 24).addBox(-1.0F, 9.7083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(24, 22).addBox(-1.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_leg.setTextureOffset(0, 0).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.5F, 0.85F, 0.0F);
			right_arm.setTextureOffset(8, 20).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(28, 5).addBox(-3.0F, 4.65F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(30, 20).addBox(-3.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(30, 10).addBox(-3.0F, 7.4F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(26, 28).addBox(-3.0F, 3.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
