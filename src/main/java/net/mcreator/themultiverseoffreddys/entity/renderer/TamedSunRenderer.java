
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

import net.mcreator.themultiverseoffreddys.entity.TamedSunEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedSunRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedSunEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelSun(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/sun.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSun extends EntityModel<Entity> {
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

		public ModelSun() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.3125F, -4.2969F, -1.3562F);
			head.setTextureOffset(18, 16).addBox(-4.3125F, -3.7031F, -2.6438F, 8.0F, 8.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 43).addBox(-4.3125F, -3.7031F, -2.8438F, 4.0F, 8.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(41, 23).addBox(-0.3125F, -3.7031F, -2.8438F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 25).addBox(2.6875F, -2.7031F, -2.8438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(20, 11).addBox(2.6875F, 2.2969F, -2.8438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(26, 14).addBox(-0.3125F, 3.2969F, -2.8438F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 28).addBox(-0.3125F, 0.2969F, -2.8438F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(44, 0).addBox(0.6875F, -1.7031F, -2.9437F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 12).addBox(1.5875F, 0.2969F, -2.9437F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 9).addBox(-4.2125F, 0.2969F, -2.9437F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 25).addBox(-3.3125F, -1.7031F, -2.9437F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 3).addBox(3.6875F, -2.2031F, -2.6438F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(48, 16).addBox(5.6875F, -1.7031F, -2.6438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(45, 13).addBox(3.6875F, 0.7969F, -2.6438F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(4, 48).addBox(5.6875F, 1.2969F, -2.6438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(44, 41).addBox(-6.3125F, -2.2031F, -2.6438F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(35, 15).addBox(-7.3125F, -1.7031F, -2.6438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 34).addBox(-0.8125F, -6.7031F, -2.6438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(44, 34).addBox(-1.3125F, -5.7031F, -2.6438F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(44, 44).addBox(-6.3125F, 0.7969F, -2.6438F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(34, 39).addBox(-7.3125F, 1.2969F, -2.6438F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(-4.3125F, -3.7031F, -1.6438F, 8.0F, 8.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-0.8125F, -0.7031F, -1.1438F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(26, 0).addBox(-0.8125F, 0.2969F, 0.8562F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-6.0625F, 4.2969F, -2.1438F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, -0.7854F);
			head_r1.setTextureOffset(0, 48).addBox(-1.25F, 0.75F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(29, 25).addBox(-0.25F, 0.25F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(5.4375F, 4.2969F, -2.1438F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.7854F);
			head_r2.setTextureOffset(44, 47).addBox(0.25F, 0.75F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 4).addBox(-2.75F, 0.25F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-6.0625F, -3.7031F, -2.1438F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, 0.7854F);
			head_r3.setTextureOffset(8, 48).addBox(-1.25F, -1.75F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r3.setTextureOffset(41, 25).addBox(-0.25F, -2.25F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(5.4375F, -3.7031F, -2.1438F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, -0.7854F);
			head_r4.setTextureOffset(43, 38).addBox(-2.75F, -2.25F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			head_r4.setTextureOffset(12, 48).addBox(0.25F, -1.75F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(37, 4).addBox(-1.5F, 6.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-4.5F, 11.0F, -4.0F, 9.0F, 1.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 9).addBox(-3.5F, 10.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(20, 9).addBox(-3.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(16, 25).addBox(-2.5F, 0.0F, -1.5F, 5.0F, 6.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(6, 34).addBox(-0.5F, 2.5F, -1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 27).addBox(-0.5F, 1.0F, -1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(2.0F, 0.9F, 0.0F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.8116F);
			left_arm.setTextureOffset(8, 34).addBox(-0.9604F, -0.2494F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-2.0F, 0.9F, 0.0F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.8116F);
			right_arm.setTextureOffset(0, 34).addBox(-1.0396F, -0.2494F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 12.25F, -0.9167F);
			left_leg.setTextureOffset(28, 30).addBox(-2.0F, 2.75F, -1.0833F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(40, 30).addBox(-1.5F, 7.75F, -0.5833F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(36, 14).addBox(-1.5F, -0.25F, -0.5833F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(36, 39).addBox(-1.0F, -0.25F, -0.0833F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(32, 23).addBox(-1.0F, 9.75F, -3.0833F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(48, 18).addBox(-0.5F, 8.75F, -3.5833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 12.25F, -0.9167F);
			right_leg.setTextureOffset(0, 25).addBox(-2.0F, 2.75F, -1.0833F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(35, 0).addBox(-1.5F, 7.75F, -0.5833F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(16, 34).addBox(-1.5F, -0.25F, -0.5833F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(28, 39).addBox(-1.0F, -0.25F, -0.0833F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(26, 0).addBox(-1.0F, 9.75F, -3.0833F, 2.0F, 2.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(20, 9).addBox(-0.5F, 8.75F, -3.5833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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
