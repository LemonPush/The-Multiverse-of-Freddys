
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

import net.mcreator.themultiverseoffreddys.entity.TamedOrvilleElephantEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedOrvilleElephantRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedOrvilleElephantEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelOrvilleElephant(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/orvilleelephant.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelOrvilleElephant extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelOrvilleElephant() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(31, 55).addBox(4.3F, -14.1F, -0.5F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(10, 39).addBox(3.3F, -12.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(10, 39).addBox(-4.3F, -12.1F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(31, 55).addBox(-8.3F, -14.1F, -0.5F, 4.0F, 7.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(16, 56).addBox(-1.5F, -15.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-1.0F, -18.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(49, 0).addBox(-3.0F, -10.4F, -7.0F, 6.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(52, 17).addBox(-2.0F, -10.4F, -9.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(42, 10).addBox(-1.0F, -8.4F, -9.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 10).addBox(-1.0F, -6.4F, -9.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 8).addBox(-1.0F, -3.4F, -10.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 33).addBox(-1.0F, -4.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(50, 38).addBox(-3.0F, -7.0F, -7.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(85, 13).addBox(-3.0F, -8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(25, 56).addBox(0.7F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 50).addBox(-2.7F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(98, 28).addBox(0.7F, -13.7F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(105, 22).addBox(-2.7F, -13.7F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, -6.5F, -2.5F, 10.0F, 12.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 33).addBox(-4.0F, -5.5F, -2.75F, 8.0F, 10.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(56, 21).addBox(-2.0F, -5.4F, -3.25F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 18).addBox(-0.5F, -0.4F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-0.5F, 1.6F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(58, 58).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(12, 54).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(56, 52).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(56, 26).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(0, 44).addBox(-5.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(46, 29).addBox(-5.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(12, 45).addBox(-4.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 5).addBox(-4.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 54).addBox(-5.0F, 9.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(40, 19).addBox(1.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(46, 43).addBox(1.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(40, 29).addBox(2.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(30, 36).addBox(2.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(44, 52).addBox(1.0F, 9.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(32, 47).addBox(2.0F, 10.5F, -8.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.0F, 7.6F, -0.2F);
			right_leg.setTextureOffset(48, 8).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(34, 36).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(58, 42).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(28, 47).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(24, 27).addBox(-2.5F, 13.4F, -2.8F, 5.0F, 3.0F, 6.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.0F, 7.6F, -0.2F);
			left_leg.setTextureOffset(16, 47).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(18, 36).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(58, 29).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(54, 5).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(26, 10).addBox(-2.5F, 13.4F, -2.8F, 5.0F, 3.0F, 6.0F, 0.0F, false);
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
