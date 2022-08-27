
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

import net.mcreator.themultiverseoffreddys.entity.IntoThePitEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class IntoThePitRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(IntoThePitEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelIntothePit(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/intothepit.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelIntothePit extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_leg;

		public ModelIntothePit() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 1.9774F, 0.0366F);
			head.setTextureOffset(120, 0).addBox(-1.0F, -5.9774F, -1.0366F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(54, 3).addBox(-3.0F, -6.9774F, -1.0366F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(44, 0).addBox(-3.5F, -12.9774F, -1.0366F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(32, 7).addBox(-2.75F, -17.4774F, -0.5366F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(10, 48).addBox(-2.25F, -18.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 48).addBox(-2.25F, -13.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(31, 26).addBox(1.25F, -18.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 33).addBox(1.25F, -13.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 15).addBox(0.75F, -17.4774F, -0.5366F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(65, 15).addBox(2.0F, -7.9774F, 1.4634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(64, 60).addBox(-3.0F, -7.9774F, 1.4634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 21).addBox(-2.0F, -7.9774F, 2.4634F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(66, 64).addBox(-1.0F, -9.9774F, 2.4634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(66, 56).addBox(-1.0F, -11.4774F, 1.9634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(66, 6).addBox(-1.0F, -12.9774F, 0.9634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(40, 42).addBox(-3.0F, -10.4774F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 20).addBox(-3.5F, -10.4774F, -2.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(62, 44).addBox(0.75F, -12.2274F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(62, 44).addBox(-2.75F, -12.2274F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(30, 39).addBox(1.0F, -10.4774F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 6).addBox(1.5F, -10.4774F, -2.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -13.4774F, -4.0366F, 8.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(30, 36).addBox(3.5F, -9.4774F, -4.0366F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(20, 33).addBox(-4.5F, -9.4774F, -4.0366F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(24, 57).addBox(-3.25F, -17.4774F, -1.0366F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(0.25F, -17.4774F, -1.0366F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(53, 39).addBox(-3.0F, -9.9774F, -6.0366F, 6.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-3.5F, -6.2774F, -6.0366F, 7.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(83, 0).addBox(-3.0F, -7.2774F, -6.0366F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(90, 4).addBox(-3.0F, -7.9774F, -6.0366F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 26).addBox(-0.5F, -10.4274F, -6.4366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(1.85F, -17.3774F, 0.2634F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.5672F, 0.0F, 0.0F);
			head_r1.setTextureOffset(23, 26).addBox(-1.6F, -3.6F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(24, 45).addBox(-1.1F, -4.6F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(20, 54).addBox(-4.6F, -4.6F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(34, 57).addBox(-5.1F, -3.6F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(1.75F, -17.3774F, -0.0366F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.5672F, 0.0F, 0.0F);
			head_r2.setTextureOffset(5, 1).addBox(-0.5F, -3.6F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(5, 0).addBox(-4.0F, -3.6F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 40).addBox(-1.0F, -3.6F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(40, 63).addBox(-4.5F, -3.6F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 57).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 26).addBox(-4.5F, -3.0F, -2.5F, 9.0F, 9.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(40, 33).addBox(-3.5F, -2.25F, -2.75F, 7.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(57, 23).addBox(-2.5F, -2.45F, -3.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(62, 0).addBox(0.5F, -2.45F, -3.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(39, 20).addBox(-1.0F, -1.95F, -3.75F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 28).addBox(-0.5F, 0.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 28).addBox(-0.5F, 1.5F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 0).addBox(-4.0F, 6.5F, -2.0F, 8.0F, 3.0F, 4.0F, 0.25F, false);
			body.setTextureOffset(119, 16).addBox(-1.0F, 8.0F, 2.5F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(62, 37).addBox(-3.0F, 0.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(56, 37).addBox(-3.0F, 2.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(50, 13).addBox(-3.0F, 3.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 44).addBox(1.0F, 3.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 44).addBox(1.0F, 2.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(46, 42).addBox(1.0F, 0.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(56, 33).addBox(1.0F, -2.5F, -1.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(56, 11).addBox(-6.0F, -2.5F, -1.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(39, 15).addBox(-3.5F, 7.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.5F, -1.15F, 0.0F);
			left_arm.setTextureOffset(50, 62).addBox(1.0F, -1.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(28, 47).addBox(0.6F, -1.9F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(10, 54).addBox(0.6F, 4.3F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(55, 16).addBox(0.6F, 9.6F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(32, 62).addBox(1.0F, 6.4F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(8, 63).addBox(1.0F, 3.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.5F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(24, 63).addBox(-1.0F, -1.7917F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(63, 23).addBox(-1.0F, 5.2083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(16, 63).addBox(-1.0F, 9.7083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(58, 62).addBox(-1.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(14, 44).addBox(-1.5F, -1.0417F, -1.8333F, 3.0F, 6.0F, 4.0F, 0.25F, false);
			left_leg.setTextureOffset(52, 53).addBox(-1.5F, 5.6583F, -1.8333F, 3.0F, 5.0F, 4.0F, 0.25F, false);
			left_leg.setTextureOffset(28, 24).addBox(-2.0F, 10.5083F, -4.8333F, 4.0F, 2.0F, 7.0F, 0.25F, false);
			left_leg.setTextureOffset(94, 39).addBox(-1.5F, 4.3583F, -2.6333F, 3.0F, 2.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(0, 40).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.5F, -1.15F, 0.0F);
			right_arm.setTextureOffset(44, 57).addBox(-3.0F, -1.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(44, 3).addBox(-3.6F, -1.9F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(42, 48).addBox(-3.6F, 4.3F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(53, 26).addBox(-3.6F, 9.6F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(30, 33).addBox(-3.0F, 6.4F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(62, 52).addBox(-3.0F, 3.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.5F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(58, 6).addBox(-1.0F, -1.7917F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(38, 47).addBox(-1.0F, 5.2083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(12, 40).addBox(-1.0F, 9.7083F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 0).addBox(-1.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_leg.setTextureOffset(43, 20).addBox(-1.5F, -1.0417F, -1.8333F, 3.0F, 6.0F, 4.0F, 0.25F, false);
			right_leg.setTextureOffset(94, 39).addBox(-1.5F, 4.3583F, -2.6333F, 3.0F, 2.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(0, 48).addBox(-1.5F, 5.6583F, -1.8333F, 3.0F, 5.0F, 4.0F, 0.25F, false);
			right_leg.setTextureOffset(24, 15).addBox(-2.0F, 10.5083F, -4.8333F, 4.0F, 2.0F, 7.0F, 0.25F, false);
			right_leg.setTextureOffset(32, 7).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
