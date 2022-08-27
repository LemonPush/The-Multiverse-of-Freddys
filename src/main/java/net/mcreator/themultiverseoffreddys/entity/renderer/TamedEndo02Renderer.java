
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

import net.mcreator.themultiverseoffreddys.entity.TamedEndo02Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedEndo02Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedEndo02Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelEndo_02(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/endo_02.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelEndo_02 extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer body;
		private final ModelRenderer neck;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelEndo_02() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -7.8294F, -0.45F);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(8.0F, 3.8294F, 9.45F);
			head.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(40, 13).addBox(-10.5F, 11.0F, -11.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 40).addBox(-10.5F, 11.0F, -8.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(12, 35).addBox(-10.5F, 11.0F, -10.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(34, 38).addBox(-10.5F, 11.0F, -9.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 17).addBox(-11.0F, 7.0F, -11.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(30, 13).addBox(-7.0F, 10.2F, -15.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r1.setTextureOffset(30, 13).addBox(-11.0F, 10.2F, -15.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r1.setTextureOffset(0, 0).addBox(-12.0F, 7.0F, -17.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-8.0F, 3.8294F, 9.45F);
			head.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.7854F);
			right_arm_r2.setTextureOffset(0, 0).addBox(-13.0F, 8.0F, -16.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
			right_arm_r2.setTextureOffset(0, 35).addBox(-12.0F, 8.0F, -16.5F, 3.0F, 2.0F, 3.0F, 0.0F, true);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(8.0F, 3.8294F, 9.45F);
			head.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.7854F);
			right_arm_r3.setTextureOffset(0, 0).addBox(12.0F, 8.0F, -16.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r3.setTextureOffset(0, 35).addBox(9.0F, 8.0F, -16.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -9.0F, 0.0F);
			body.setTextureOffset(0, 10).addBox(-3.5F, 13.0F, -2.0F, 7.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(42, 17).addBox(-4.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 6).addBox(-4.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(20, 41).addBox(1.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(22, 37).addBox(1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 30).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(36, 26).addBox(-5.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(22, 0).addBox(-4.0F, 7.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(40, 2).addBox(1.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(30, 42).addBox(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 21).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(12, 39).addBox(-1.0F, 9.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(34, 16).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 10).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(2.0F, 1.0F, 0.0F);
			body.addChild(neck);
			setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(6.5F, -9.0F, 0.0F);
			left_arm.setTextureOffset(0, 44).addBox(1.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			left_arm.setTextureOffset(38, 42).addBox(1.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			left_arm.setTextureOffset(24, 26).addBox(0.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(33, 32).addBox(0.5F, 13.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
			left_arm.setTextureOffset(12, 26).addBox(0.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-6.5F, -9.0F, 0.0F);
			right_arm.setTextureOffset(0, 44).addBox(-3.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(38, 42).addBox(-3.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(12, 26).addBox(-3.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(33, 32).addBox(-3.5F, 13.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(12, 26).addBox(-3.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.5F, 6.0F, 0.5F);
			left_leg.setTextureOffset(6, 45).addBox(-1.0F, 9.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(44, 43).addBox(-1.0F, 16.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(44, 40).addBox(-1.0F, 1.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(30, 4).addBox(-1.5F, 10.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 25).addBox(-1.5F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(14, 19).addBox(-2.0F, 17.0F, -4.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(16, 11).addBox(-2.0F, 16.6F, -4.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(28, 18).addBox(-0.5F, 17.0F, -6.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(21, 26).addBox(-2.3F, 17.0F, -6.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(9, 25).addBox(1.3F, 17.0F, -6.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.5F, 6.0F, 0.5F);
			right_leg.setTextureOffset(6, 45).addBox(-1.0F, 9.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(44, 43).addBox(-1.0F, 16.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(44, 40).addBox(-1.0F, 1.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(30, 4).addBox(-1.5F, 10.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 25).addBox(-1.5F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(14, 19).addBox(-2.0F, 17.0F, -4.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
			right_leg.setTextureOffset(16, 11).addBox(-2.0F, 16.6F, -4.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
			right_leg.setTextureOffset(28, 18).addBox(-0.5F, 17.0F, -6.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(21, 26).addBox(1.3F, 17.0F, -6.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(9, 25).addBox(-2.3F, 17.0F, -6.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
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
