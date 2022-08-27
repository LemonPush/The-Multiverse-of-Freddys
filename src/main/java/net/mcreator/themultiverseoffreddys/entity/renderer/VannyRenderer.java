
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

import net.mcreator.themultiverseoffreddys.entity.VannyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class VannyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(VannyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelVanny(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/vanny.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelVanny extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelVanny() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 1.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(24, 4).addBox(-3.0F, -8.0F, -4.2F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(20, 16).addBox(1.0F, -8.0F, -4.2F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(40, 30).addBox(-1.5F, -1.5F, -5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(58, 46).addBox(-1.0F, -3.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 32).addBox(-2.0F, -5.0F, -6.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(56, 62).addBox(1.5F, -5.0F, -6.1F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(56, 62).addBox(1.5F, -3.7F, -6.1F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(56, 62).addBox(-4.5F, -3.7F, -6.1F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(56, 62).addBox(-4.5F, -5.0F, -6.1F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(47, 44).addBox(-0.5F, -5.2F, -6.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-2.6264F, -8.8582F, 0.2805F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.8211F, 0.0522F, -0.3011F);
			head_r1.setTextureOffset(47, 24).addBox(-0.4502F, -9.5052F, 2.6119F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head_r1.setTextureOffset(40, 25).addBox(-0.4502F, -8.5052F, 2.6119F, 2.0F, 4.0F, 1.0F, 0.0F, true);
			head_r1.setTextureOffset(0, 48).addBox(1.5498F, -7.5052F, 2.6119F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			head_r1.setTextureOffset(4, 48).addBox(-1.4502F, -7.5052F, 2.6119F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-2.6264F, -8.8582F, 0.2805F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.1666F, 0.0522F, -0.3011F);
			head_r2.setTextureOffset(44, 45).addBox(1.5498F, -5.6608F, -0.7805F, 1.0F, 4.0F, 1.0F, 0.0F, true);
			head_r2.setTextureOffset(46, 34).addBox(-0.4502F, -0.6608F, -0.7805F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			head_r2.setTextureOffset(40, 45).addBox(-1.4502F, -5.6608F, -0.7805F, 1.0F, 4.0F, 1.0F, 0.0F, true);
			head_r2.setTextureOffset(32, 37).addBox(-0.4502F, -5.6608F, -0.7805F, 2.0F, 5.0F, 1.0F, 0.0F, true);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(2.6264F, -8.8582F, 0.2805F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.8211F, -0.0522F, 0.3011F);
			head_r3.setTextureOffset(0, 48).addBox(-2.5498F, -7.5052F, 2.6119F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head_r3.setTextureOffset(4, 48).addBox(0.4502F, -7.5052F, 2.6119F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head_r3.setTextureOffset(40, 25).addBox(-1.5498F, -8.5052F, 2.6119F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head_r3.setTextureOffset(47, 24).addBox(-1.5498F, -9.5052F, 2.6119F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(2.6264F, -8.8582F, 0.2805F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.1666F, -0.0522F, 0.3011F);
			head_r4.setTextureOffset(40, 45).addBox(0.4502F, -5.6608F, -0.7805F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r4.setTextureOffset(44, 45).addBox(-2.5498F, -5.6608F, -0.7805F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r4.setTextureOffset(32, 37).addBox(-1.5498F, -5.6608F, -0.7805F, 2.0F, 5.0F, 1.0F, 0.0F, false);
			head_r4.setTextureOffset(46, 34).addBox(-1.5498F, -0.6608F, -0.7805F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(40, 37).addBox(-4.0F, 0.0F, -3.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 32).addBox(1.0F, 0.0F, -3.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(46, 41).addBox(-1.0F, 0.5F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(38, 41).addBox(-1.0F, 10.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.0F, 2.0F, 0.0F);
			left_arm.setTextureOffset(16, 32).addBox(1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.0F, 2.0F, 0.0F);
			right_arm.setTextureOffset(0, 32).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.1F, 12.0F, 0.0F);
			left_leg.setTextureOffset(32, 0).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(36, 16).addBox(-2.1F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.1F, 12.0F, 0.0F);
			right_leg.setTextureOffset(24, 16).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(24, 0).addBox(-1.9F, 10.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
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
