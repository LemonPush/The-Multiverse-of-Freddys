
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

import net.mcreator.themultiverseoffreddys.entity.MoltenFoxyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MoltenFoxyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MoltenFoxyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMoltenFoxy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/moltenfoxy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMoltenFoxy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer body_r3;
		private final ModelRenderer body_r4;
		private final ModelRenderer body;
		private final ModelRenderer neck;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_arm_r1;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm_r2;

		public ModelMoltenFoxy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.7385F, 0.3571F);
			head.setTextureOffset(0, 28).addBox(-4.5F, -16.0615F, -3.2571F, 9.0F, 10.0F, 6.0F, 0.5F, false);
			head.setTextureOffset(66, 0).addBox(4.5F, -6.5615F, -2.7571F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(37, 65).addBox(4.5F, -7.5615F, -2.7571F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(31, 58).addBox(4.5F, -9.5615F, -2.7571F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(62, 35).addBox(4.5F, -8.5615F, -2.7571F, 3.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 65).addBox(-5.5F, -6.5615F, -2.7571F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(43, 16).addBox(-6.5F, -7.5615F, -2.7571F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(44, 59).addBox(-7.5F, -8.5615F, -2.7571F, 3.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(25, 16).addBox(-8.5F, -9.5615F, -2.7571F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(42, 44).addBox(-3.5F, -9.0615F, -9.7571F, 7.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(-3.5F, -10.2615F, -9.9571F, 7.0F, 1.0F, 11.0F, 0.25F, false);
			head.setTextureOffset(24, 28).addBox(-0.5F, -18.2615F, -1.7571F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(20, 35).addBox(-2.0F, -11.2615F, -8.7571F, 4.0F, 1.0F, 10.0F, 0.25F, false);
			head.setTextureOffset(9, 0).addBox(-0.5F, -12.0615F, -8.5571F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-8.0F, 1.7385F, 8.2429F);
			head.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.7854F);
			right_arm_r1.setTextureOffset(48, 68).addBox(-15.8F, 7.5F, -16.6F, 1.0F, 3.0F, 3.0F, 0.0F, true);
			right_arm_r1.setTextureOffset(60, 28).addBox(-14.8F, 7.5F, -17.1F, 4.0F, 3.0F, 4.0F, 0.0F, true);
			right_arm_r1.setTextureOffset(16, 47).addBox(-10.8F, 8.0F, -16.0F, 1.0F, 2.0F, 2.0F, 0.25F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(8.0F, 1.7385F, 8.2429F);
			head.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, -0.7854F);
			right_arm_r2.setTextureOffset(48, 68).addBox(14.8F, 7.5F, -16.6F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(60, 28).addBox(10.8F, 7.5F, -17.1F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(0, 28).addBox(9.8F, 8.0F, -16.0F, 1.0F, 2.0F, 2.0F, 0.25F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(1.0F, -16.2615F, -0.7571F);
			head.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 0.0F, 0.4363F);
			body_r1.setTextureOffset(38, 35).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(-1.0F, -16.2615F, -0.7571F);
			head.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, 0.0F, -0.4363F);
			body_r2.setTextureOffset(44, 0).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(8.0F, 1.7385F, 8.2429F);
			head.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5708F, 0.0F, 0.0F);
			right_arm_r3.setTextureOffset(59, 23).addBox(-7.25F, 11.2F, -17.1F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm_r3.setTextureOffset(59, 23).addBox(-11.75F, 11.2F, -17.1F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r3.setTextureOffset(13, 44).addBox(-11.25F, 11.2F, -15.9F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r3.setTextureOffset(34, 64).addBox(-6.75F, 11.2F, -15.9F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r3.setTextureOffset(54, 20).addBox(-11.0F, 7.0F, -11.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r3.setTextureOffset(44, 0).addBox(-12.0F, 7.0F, -17.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(0.0F, -8.1615F, -0.8905F);
			head.addChild(body_r3);
			setRotationAngle(body_r3, 0.3054F, 0.0F, 0.0F);
			body_r3.setTextureOffset(16, 46).addBox(-3.5F, 0.0F, -8.8667F, 7.0F, 1.0F, 6.0F, 0.0F, false);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(0.0F, -8.1615F, -0.8905F);
			head.addChild(body_r4);
			setRotationAngle(body_r4, 0.3054F, 0.0F, 0.0F);
			body_r4.setTextureOffset(36, 51).addBox(-3.5F, 1.2F, -9.0667F, 7.0F, 1.0F, 6.0F, 0.25F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(-0.5F, -9.0F, 0.0F);
			body.setTextureOffset(31, 53).addBox(-4.0F, 7.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(36, 46).addBox(1.0F, 7.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 10).addBox(1.0F, 4.7F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(44, 10).addBox(1.0F, 10.1F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(38, 16).addBox(4.5F, 4.7F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(25, 22).addBox(-6.5F, 4.7F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(30, 22).addBox(-4.0F, 4.8F, -3.0F, 9.0F, 7.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(0, 0).addBox(-7.0F, 30.8F, -7.0F, 15.0F, 2.0F, 14.0F, 0.25F, false);
			body.setTextureOffset(38, 35).addBox(-4.0F, 28.3F, -3.0F, 9.0F, 3.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(0, 44).addBox(-2.0F, 11.8F, -1.5F, 5.0F, 18.0F, 3.0F, 0.25F, false);
			body.setTextureOffset(54, 12).addBox(-3.5F, 11.8F, -2.0F, 8.0F, 4.0F, 4.0F, 0.25F, false);
			body.setTextureOffset(68, 41).addBox(-0.5F, 5.3F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(69, 63).addBox(-2.5F, 5.0F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(7, 65).addBox(1.5F, 5.0F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-1.0F, 4.7F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(62, 44).addBox(-1.5F, 2.7F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(67, 50).addBox(0.5F, 24.2F, -1.8F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			body.setTextureOffset(22, 63).addBox(-1.5F, 18.2F, -1.8F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			body.setTextureOffset(46, 65).addBox(1.5F, 13.2F, -2.2F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(2.0F, 1.0F, 0.0F);
			body.addChild(neck);
			setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.4F, -2.4F, 0.0F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.5236F);
			left_arm.setTextureOffset(25, 64).addBox(0.2F, -0.434F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(56, 51).addBox(2.3F, 2.6F, -1.0F, 1.0F, 2.0F, 2.0F, 0.25F, false);
			left_arm_r1 = new ModelRenderer(this);
			left_arm_r1.setRotationPoint(1.7F, 6.166F, 0.0F);
			left_arm.addChild(left_arm_r1);
			setRotationAngle(left_arm_r1, -0.8727F, 0.0F, 0.0F);
			left_arm_r1.setTextureOffset(57, 53).addBox(-2.5F, 7.1F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(57, 63).addBox(-1.5F, 0.4F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.4F, -2.4F, 0.0F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.5236F);
			right_arm.setTextureOffset(0, 0).addBox(-3.2F, -0.434F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_arm_r2 = new ModelRenderer(this);
			left_arm_r2.setRotationPoint(-1.7F, 6.166F, 0.0F);
			right_arm.addChild(left_arm_r2);
			setRotationAngle(left_arm_r2, -0.8727F, 0.0F, 0.0F);
			left_arm_r2.setTextureOffset(16, 53).addBox(-2.5F, 7.1F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			left_arm_r2.setTextureOffset(13, 63).addBox(-1.5F, 0.4F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
