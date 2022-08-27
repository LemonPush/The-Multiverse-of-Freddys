
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

import net.mcreator.themultiverseoffreddys.entity.TamedRingmasterFoxyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedRingmasterFoxyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedRingmasterFoxyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelRingMaster_Foxy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/ringmaster_foxy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelRingMaster_Foxy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer right_arm_r5;

		public ModelRingMaster_Foxy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(-4.5F, -15.0F, -4.5F, 9.0F, 1.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(30, 26).addBox(-2.5F, -22.0F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 42).addBox(-0.7F, -15.5F, -0.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(27, 17).addBox(-3.0F, -6.0F, -10.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(60, 21).addBox(-3.0F, -7.0F, -10.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 31).addBox(-3.0F, -7.0F, -9.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(60, 15).addBox(2.0F, -7.0F, -9.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(59, 42).addBox(2.0F, -8.5F, -9.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(60, 12).addBox(-3.0F, -8.5F, -10.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 6).addBox(-3.0F, -8.5F, -9.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(47, 24).addBox(-2.0F, -10.0F, -9.8F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(27, 9).addBox(-3.0F, -9.5F, -10.2F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(50, 31).addBox(-1.0F, -10.5F, -9.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 22).addBox(-1.0F, -11.1F, -9.5F, 2.0F, 1.0F, 2.0F, -0.1F, false);
			head.setTextureOffset(67, 17).addBox(-2.8F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(67, 14).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(45, 28).addBox(0.7F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 6).addBox(-2.8F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 64).addBox(-8.0F, -9.0F, 0.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(50, 58).addBox(-6.0F, -9.0F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 42).addBox(-7.0F, -9.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(50, 31).addBox(4.0F, -9.0F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(25, 26).addBox(4.0F, -9.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(61, 24).addBox(4.0F, -9.0F, 0.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -15.5F, -1.5F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, -0.5236F, 1.5708F, 0.0F);
			head_r1.setTextureOffset(5, 16).addBox(-2.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 0).addBox(-2.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head_r1.setTextureOffset(27, 17).addBox(-2.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(49, 3).addBox(-2.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(0.0F, -15.5F, -1.5F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, -0.5236F, -1.5708F, 0.0F);
			head_r2.setTextureOffset(0, 16).addBox(1.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head_r2.setTextureOffset(22, 50).addBox(1.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(46, 8).addBox(1.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head_r2.setTextureOffset(22, 42).addBox(1.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(0.5F, -14.6F, -0.1F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, 0.2618F);
			head_r3.setTextureOffset(38, 38).addBox(-0.1F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-0.5F, -14.6F, -0.1F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, -0.2618F);
			head_r4.setTextureOffset(44, 58).addBox(-1.2F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(42, 38).addBox(-5.0F, 5.0F, 2.5F, 10.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 26).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(42, 47).addBox(-4.0F, -5.5F, -2.7F, 8.0F, 10.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(8, 67).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(67, 6).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 67).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(66, 54).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(0, 42).addBox(1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(44, 58).addBox(0.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(44, 66).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(66, 43).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(60, 48).addBox(1.5F, 11.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(28, 54).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(66, 40).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(58, 64).addBox(-1.1F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(66, 0).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 58).addBox(-1.6F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(46, 17).addBox(-2.1F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(64, 65).addBox(0.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			left_leg.setTextureOffset(38, 65).addBox(-2.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(12, 54).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(64, 37).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(32, 64).addBox(-0.9F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(24, 64).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(57, 55).addBox(-1.4F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(46, 8).addBox(-1.9F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(24, 54).addBox(-2.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_leg.setTextureOffset(16, 50).addBox(0.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(26, 38).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(16, 42).addBox(-1.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(49, 0).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(45, 25).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(54, 0).addBox(-5.0F, 11.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-3.2F, 16.9191F, 0.4505F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, -1.5708F, 0.0F);
			right_arm_r1.setTextureOffset(46, 17).addBox(-2.9F, 2.1809F, -0.7505F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 26).addBox(-1.0F, -4.5191F, -0.7505F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-2.9495F, 29.1916F, 5.3653F);
			right_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 1.5708F, 0.0F, -1.5708F);
			right_arm_r2.setTextureOffset(54, 63).addBox(0.3F, -2.0F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(-2.9495F, 28.8619F, 1.1723F);
			right_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, 1.5708F, -0.3927F, -1.5708F);
			right_arm_r3.setTextureOffset(24, 0).addBox(0.8F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(-2.9495F, 39.6F, -0.0495F);
			right_arm.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, 1.5708F, -1.0036F, -1.5708F);
			right_arm_r4.setTextureOffset(24, 0).addBox(6.3F, -14.4F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(-2.9495F, 18.4F, -0.0495F);
			right_arm.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, -1.5708F, -1.0036F, 1.5708F);
			right_arm_r5.setTextureOffset(0, 26).addBox(-1.7F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
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
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
