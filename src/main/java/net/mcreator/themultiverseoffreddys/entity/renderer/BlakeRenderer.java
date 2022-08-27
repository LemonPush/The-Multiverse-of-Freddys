
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

import net.mcreator.themultiverseoffreddys.entity.BlakeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BlakeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BlakeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBlake(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/blake.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBlake extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;

		public ModelBlake() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -1.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-3.5F, -14.0F, -3.5F, 7.0F, 7.0F, 7.0F, 0.5F, false);
			head.setTextureOffset(32, 25).addBox(-2.5F, -7.5F, -6.5F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(41, 14).addBox(-2.5F, -8.5F, -6.2F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(36, 7).addBox(-2.5F, -10.5F, -6.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(41, 29).addBox(-1.5F, -11.0F, -6.2F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 14).addBox(-0.5F, -11.5F, -6.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 3).addBox(-2.9F, -13.1F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(0.9F, -13.1F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(29, 31).addBox(0.9F, -14.1F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 31).addBox(-2.9F, -14.1F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(3.6555F, -13.5855F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, -0.9599F);
			head_r1.setTextureOffset(0, 29).addBox(-0.8573F, -0.7456F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head_r1.setTextureOffset(24, 16).addBox(1.1427F, -2.2456F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, true);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-3.6555F, -13.5855F, 0.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.9599F);
			head_r2.setTextureOffset(0, 29).addBox(-1.1427F, -0.7456F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(24, 16).addBox(-4.1427F, -2.2456F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(21, 0).addBox(-4.5F, 6.0F, -2.0F, 9.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 14).addBox(-4.0F, -5.5F, -2.0F, 8.0F, 11.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(44, 33).addBox(-6.0F, -5.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(44, 21).addBox(4.0F, -5.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 46).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(44, 17).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 7.5F, 2.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, -1.1781F, 0.0F, 0.0F);
			body_r1.setTextureOffset(0, 29).addBox(-1.5F, -0.8F, -0.5F, 3.0F, 3.0F, 7.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.6F, 8.0F, 0.0F);
			left_leg.setTextureOffset(0, 39).addBox(-1.6F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.25F, false);
			left_leg.setTextureOffset(32, 31).addBox(-1.6F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.25F, false);
			left_leg.setTextureOffset(34, 46).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(45, 40).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(17, 22).addBox(-2.1F, 14.0F, -4.5F, 4.0F, 2.0F, 7.0F, 0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.6F, 8.0F, 0.0F);
			right_leg.setTextureOffset(32, 16).addBox(-1.4F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.25F, false);
			right_leg.setTextureOffset(20, 31).addBox(-1.4F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.25F, false);
			right_leg.setTextureOffset(45, 25).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(44, 37).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(21, 7).addBox(-1.9F, 14.0F, -4.5F, 4.0F, 2.0F, 7.0F, 0.25F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.5F, -5.3F, 0.5F);
			left_arm.setTextureOffset(24, 40).addBox(0.5F, -1.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(12, 40).addBox(0.5F, 5.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(13, 31).addBox(1.0F, 10.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(43, 0).addBox(1.0F, 4.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(36, 40).addBox(0.5F, 11.0F, -2.0F, 3.0F, 3.0F, 3.0F, 0.25F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.5F, -5.3F, 0.5F);
			right_arm.setTextureOffset(24, 40).addBox(-3.5F, -1.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(12, 40).addBox(-3.5F, 5.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(13, 31).addBox(-3.0F, 10.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(43, 0).addBox(-3.0F, 4.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(36, 40).addBox(-3.5F, 11.0F, -2.0F, 3.0F, 3.0F, 3.0F, 0.25F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
