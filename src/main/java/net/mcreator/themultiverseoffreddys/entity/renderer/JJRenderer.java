
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

import net.mcreator.themultiverseoffreddys.entity.JJEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class JJRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(JJEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelJJ(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/jj.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelJJ extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer button_r1;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelJJ() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 9.0F, 0.0F);
			head.setTextureOffset(0, 14).addBox(-3.5F, -9.0F, -3.0F, 7.0F, 7.0F, 7.0F, 0.1F, false);
			head.setTextureOffset(0, 3).addBox(-2.5F, -6.7F, -3.4F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 3).addBox(0.5F, -6.7F, -3.4F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(15, 28).addBox(-4.1F, -5.1F, -3.9F, 2.0F, 2.0F, 2.0F, -0.5F, false);
			head.setTextureOffset(15, 28).addBox(2.1F, -5.1F, -3.9F, 2.0F, 2.0F, 2.0F, -0.5F, false);
			head.setTextureOffset(0, 0).addBox(-0.5F, -4.9F, -4.4F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(21, 21).addBox(-3.5F, -9.0F, -3.0F, 7.0F, 2.0F, 7.0F, 0.2F, false);
			head.setTextureOffset(25, 9).addBox(-3.5F, -6.6F, -1.0F, 7.0F, 3.0F, 5.0F, 0.2F, false);
			head.setTextureOffset(0, 14).addBox(-0.5F, -11.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.1F, false);
			head.setTextureOffset(21, 17).addBox(-3.5F, -12.0F, 0.0F, 7.0F, 1.0F, 1.0F, 0.1F, false);
			head.setTextureOffset(0, 37).addBox(-0.5F, -12.0F, -3.0F, 1.0F, 1.0F, 7.0F, 0.1F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-4.5F, 8.0F, -3.0F, 9.0F, 8.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(30, 46).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			button_r1 = new ModelRenderer(this);
			button_r1.setRotationPoint(0.0F, 9.8F, -8.9F);
			body.addChild(button_r1);
			setRotationAngle(button_r1, -3.1416F, 0.0F, 3.1416F);
			button_r1.setTextureOffset(24, 0).addBox(-2.5F, -0.9F, -7.3F, 5.0F, 5.0F, 1.0F, -1.5F, false);
			button_r1.setTextureOffset(24, 0).addBox(-2.5F, -3.1F, -7.3F, 5.0F, 5.0F, 1.0F, -1.5F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.5F, 9.0F, 0.0F);
			right_arm.setTextureOffset(42, 17).addBox(-5.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 45).addBox(-4.5F, 3.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.5F, 9.0F, 0.0F);
			setRotationAngle(left_arm, 0.0F, 0.0F, 0.0F);
			left_arm.setTextureOffset(16, 40).addBox(1.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(45, 0).addBox(1.5F, 3.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.1F, 16.0F, 0.0F);
			right_leg.setTextureOffset(34, 36).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(30, 0).addBox(-1.9F, 6.0F, -5.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.1F, 16.0F, 0.0F);
			left_leg.setTextureOffset(22, 30).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 28).addBox(-2.1F, 6.0F, -5.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);
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
