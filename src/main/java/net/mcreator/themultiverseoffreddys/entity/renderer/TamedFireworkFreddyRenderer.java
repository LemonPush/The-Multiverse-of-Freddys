
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

import net.mcreator.themultiverseoffreddys.entity.TamedFireworkFreddyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedFireworkFreddyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedFireworkFreddyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelFirework_Freddy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/firework_freddy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFirework_Freddy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer rocket;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelFirework_Freddy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 24).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(68, 69).addBox(-2.0F, -18.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(42, 32).addBox(-3.0F, -15.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(57, 0).addBox(-4.0F, -6.0F, -6.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(65, 57).addBox(-4.0F, -7.0F, -6.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(10, 53).addBox(-4.0F, -9.5F, -6.8F, 8.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(67, 22).addBox(-3.0F, -10.0F, -6.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(16, 70).addBox(-1.0F, -11.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(16, 73).addBox(-2.8F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 26).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 36).addBox(0.7F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 36).addBox(-2.8F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 50).addBox(-5.0F, -9.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(49, 16).addBox(4.0F, -9.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-4.5F, -13.5F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.6109F);
			head_r1.setTextureOffset(0, 40).addBox(-3.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 0).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(4.5F, -13.5F, 0.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, -0.6109F);
			head_r2.setTextureOffset(18, 42).addBox(0.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 2).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(0.0F, -14.8F, -3.6F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, -0.3491F, 0.0F, 0.0F);
			head_r3.setTextureOffset(18, 40).addBox(-0.8F, -0.9F, -0.9F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head_r3.setTextureOffset(0, 24).addBox(2.7F, -0.9F, -0.9F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head_r3.setTextureOffset(0, 24).addBox(-3.8F, -0.9F, -0.9F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head_r3.setTextureOffset(62, 8).addBox(-2.8F, -0.9F, -0.9F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r3.setTextureOffset(54, 29).addBox(0.7F, -0.9F, -0.9F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 24).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(32, 0).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(56, 61).addBox(-4.0F, -3.0F, -3.5F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(50, 39).addBox(-3.5F, -4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(10, 50).addBox(-3.5F, 4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(49, 27).addBox(-3.0F, -5.0F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(42, 71).addBox(-1.0F, -5.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(71, 12).addBox(1.0F, -6.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(62, 4).addBox(-3.0F, -6.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(40, 53).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 32).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(64, 69).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(68, 45).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-6.0F, -4.0F, 0.0F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.8727F);
			right_arm.setTextureOffset(40, 61).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 28).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-3.0F, 10.3333F, 1.0F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(52, 69).addBox(-2.0F, 7.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(30, 64).addBox(-1.0F, 6.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 66).addBox(-2.0F, 1.6667F, -7.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			rocket = new ModelRenderer(this);
			rocket.setRotationPoint(2.721F, 5.9498F, -12.7874F);
			right_arm.addChild(rocket);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(2.279F, 11.0502F, 12.7874F);
			rocket.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, -0.8727F);
			right_arm_r2.setTextureOffset(0, 10).addBox(4.5F, -11.5F, -19.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(68, 37).addBox(3.5F, -12.5F, -17.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(0, 61).addBox(5.0F, -11.0F, -20.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(71, 4).addBox(4.0F, -12.0F, -18.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(47, 52).addBox(3.0F, -13.0F, -16.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(26, 42).addBox(2.0F, -14.0F, -14.0F, 10.0F, 10.0F, 1.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(48, 42).addBox(2.5F, -13.5F, -15.0F, 9.0F, 9.0F, 1.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(0, 0).addBox(3.0F, -13.0F, -13.0F, 8.0F, 8.0F, 16.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(-0.1158F, -0.0972F, 14.2874F);
			rocket.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -0.48F, 0.0F, -0.8727F);
			right_arm_r3.setTextureOffset(62, 4).addBox(-0.5F, -1.1F, 0.6F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(60, 27).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(65, 48).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(10, 61).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 53).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(26, 67).addBox(1.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(14, 60).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(59, 12).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 50).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(48, 19).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 40).addBox(-2.4F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(28, 54).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(48, 16).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 44).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 32).addBox(-2.6F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);
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
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
