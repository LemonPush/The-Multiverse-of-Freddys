
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

import net.mcreator.themultiverseoffreddys.entity.PhantomToyFreddyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PhantomToyFreddyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PhantomToyFreddyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPhantomToyFreddy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/phantomtoyfreddy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelPhantomToyFreddy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelPhantomToyFreddy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.5F, -14.0F, -4.0F, 9.0F, 8.0F, 8.0F, 0.5F, false);
			head.setTextureOffset(59, 56).addBox(-2.0F, -19.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(36, 37).addBox(-3.0F, -15.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(42, 28).addBox(-4.0F, -5.5F, -7.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(51, 0).addBox(-4.0F, -6.5F, -7.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(26, 18).addBox(-4.0F, -7.5F, -7.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(17, 43).addBox(-4.0F, -9.6F, -7.3F, 8.0F, 2.0F, 3.0F, 0.1F, false);
			head.setTextureOffset(13, 61).addBox(-3.0F, -10.5F, -7.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(16, 58).addBox(-1.0F, -11.5F, -7.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(64, 3).addBox(-2.9F, -13.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.1F, false);
			head.setTextureOffset(63, 53).addBox(-6.0F, -9.5F, -5.2F, 2.0F, 2.0F, 1.0F, -0.25F, false);
			head.setTextureOffset(63, 53).addBox(4.0F, -9.5F, -5.2F, 2.0F, 2.0F, 1.0F, -0.25F, true);
			head.setTextureOffset(0, 64).addBox(0.9F, -13.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.1F, false);
			head.setTextureOffset(0, 20).addBox(0.9F, -14.0F, -4.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 20).addBox(-2.9F, -14.0F, -4.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 32).addBox(-6.0F, -10.0F, -4.5F, 1.0F, 4.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(0, 32).addBox(5.0F, -10.0F, -4.5F, 1.0F, 4.0F, 9.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-4.5F, -13.5F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.6109F);
			head_r1.setTextureOffset(0, 32).addBox(-4.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(26, 0).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(4.5F, -13.5F, 0.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, -0.6109F);
			head_r2.setTextureOffset(11, 32).addBox(1.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(26, 2).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(26, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.5F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, -5.5F, -3.0F, 10.0F, 10.0F, 6.0F, 0.75F, false);
			body.setTextureOffset(20, 34).addBox(-5.0F, -4.0F, -4.0F, 10.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(59, 51).addBox(-4.5F, -5.0F, -4.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(59, 49).addBox(-4.5F, 4.0F, -4.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(61, 27).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, -0.9F, -5.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, -2.6F, -5.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);
			body.setTextureOffset(62, 22).addBox(-1.0F, -4.9F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(50, 60).addBox(1.0F, -5.4F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(40, 54).addBox(-3.0F, -5.4F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(28, 48).addBox(-6.5F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(5.5F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(52, 14).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(48, 32).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.5F, -5.0F, 0.0F);
			right_arm.setTextureOffset(28, 54).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			right_arm.setTextureOffset(0, 4).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-3.0F, 10.3333F, 1.0F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(42, 18).addBox(-2.5F, 7.1667F, -13.0F, 5.0F, 5.0F, 5.0F, -0.75F, false);
			right_arm_r1.setTextureOffset(40, 60).addBox(-1.5F, 8.1667F, -10.0F, 3.0F, 3.0F, 4.0F, -0.75F, false);
			right_arm_r1.setTextureOffset(57, 14).addBox(-2.0F, 7.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);
			right_arm_r1.setTextureOffset(47, 44).addBox(-1.0F, 6.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 55).addBox(-2.0F, 1.6667F, -7.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(6.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(52, 4).addBox(0.5F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			left_arm.setTextureOffset(54, 32).addBox(0.5F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);
			left_arm.setTextureOffset(44, 11).addBox(1.5F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(44, 8).addBox(1.5F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(56, 41).addBox(0.5F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(16, 48).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			right_leg.setTextureOffset(42, 34).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(11, 36).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(0, 45).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			left_leg.setTextureOffset(35, 44).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			left_leg.setTextureOffset(0, 36).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(32, 21).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 24).addBox(-2.6F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.25F, false);
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
		}
	}

}
