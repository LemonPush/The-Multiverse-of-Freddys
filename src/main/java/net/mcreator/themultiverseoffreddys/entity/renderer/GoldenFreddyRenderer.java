
package net.mcreator.themultiverseoffreddys.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.themultiverseoffreddys.entity.GoldenFreddyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GoldenFreddyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GoldenFreddyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelGolden_Freddy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/golden_freddy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelGolden_Freddy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg_r1;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg_r2;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r2;

		public ModelGolden_Freddy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(-3.0F, -1.0F, 0.0F);
			setRotationAngle(head, 0.0F, 0.0F, -0.3491F);
			head.setTextureOffset(0, 0).addBox(-4.0F, 1.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(58, 50).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 32).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(49, 0).addBox(-4.0F, 9.0F, -6.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(49, 16).addBox(-4.0F, 8.0F, -6.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(30, 18).addBox(-4.0F, 5.5F, -6.8F, 8.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 60).addBox(-3.0F, 5.0F, -6.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(60, 19).addBox(-1.0F, 4.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(62, 57).addBox(-2.8F, 2.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(62, 4).addBox(0.7F, 2.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 36).addBox(0.7F, 1.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(34, 34).addBox(-2.8F, 1.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 39).addBox(-5.0F, 5.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(31, 36).addBox(4.0F, 5.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-4.5F, 1.5F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.6109F);
			head_r1.setTextureOffset(0, 39).addBox(-3.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 16).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(4.5F, 1.5F, 0.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, -0.6109F);
			head_r2.setTextureOffset(10, 39).addBox(0.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 18).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 21.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, 9.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(53, 29).addBox(-4.0F, 12.0F, -3.5F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(57, 45).addBox(-3.5F, 11.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(43, 14).addBox(-3.5F, 19.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(59, 14).addBox(-3.0F, 10.0F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(61, 47).addBox(-1.0F, 10.0F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 50).addBox(0.5F, 9.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(43, 8).addBox(-2.5F, 9.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 32).addBox(-6.0F, 10.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 32).addBox(5.0F, 10.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(38, 59).addBox(-1.0F, 20.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(34, 47).addBox(-1.0F, 8.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(50, 4).addBox(-5.0F, 13.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 4).addBox(-4.0F, 19.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-3.0F, 20.3333F, 0.0F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -0.6109F, 0.7418F, 0.0F);
			right_arm_r1.setTextureOffset(19, 34).addBox(-2.5F, 5.3857F, -7.9611F, 5.0F, 5.0F, 5.0F, -0.75F, false);
			right_arm_r1.setTextureOffset(28, 59).addBox(-1.5F, 6.3857F, -4.9611F, 3.0F, 3.0F, 4.0F, -0.75F, false);
			right_arm_r1.setTextureOffset(57, 37).addBox(-2.0F, 5.8857F, -1.9611F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(10, 43).addBox(-1.0F, 4.8857F, -0.9611F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(46, 54).addBox(-2.0F, -0.1143F, -1.9611F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			setRotationAngle(right_leg, -2.0944F, 0.0F, 0.0F);
			right_leg.setTextureOffset(48, 19).addBox(-1.9F, -5.3393F, 11.5946F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 43).addBox(-0.9F, 0.6607F, 12.5946F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(40, 29).addBox(-0.9F, -6.3393F, 12.5946F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg_r1 = new ModelRenderer(this);
			right_leg_r1.setRotationPoint(0.1F, 13.0F, -0.5F);
			right_leg.addChild(right_leg_r1);
			setRotationAngle(right_leg_r1, 0.7854F, 0.0F, 0.0F);
			right_leg_r1.setTextureOffset(25, 8).addBox(-2.5F, 7.1303F, 13.5954F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			right_leg_r1.setTextureOffset(0, 50).addBox(-2.0F, 1.1303F, 16.5954F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			setRotationAngle(left_leg, -2.0944F, 0.0F, 0.0F);
			left_leg.setTextureOffset(18, 44).addBox(-2.1F, -5.3393F, 11.5946F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(40, 26).addBox(-1.1F, 0.6607F, 12.5946F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(40, 23).addBox(-1.1F, -6.3393F, 12.5946F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg_r2 = new ModelRenderer(this);
			right_leg_r2.setRotationPoint(-0.1F, 13.0F, -0.5F);
			left_leg.addChild(right_leg_r2);
			setRotationAngle(right_leg_r2, 0.7854F, 0.0F, 0.0F);
			right_leg_r2.setTextureOffset(22, 24).addBox(-2.5F, 7.1303F, 13.5954F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			right_leg_r2.setTextureOffset(45, 44).addBox(-2.0F, 1.1303F, 16.5954F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(41, 34).addBox(1.0F, 13.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 0).addBox(2.0F, 19.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(3.0F, 20.3333F, 0.0F);
			left_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -0.6109F, -0.7418F, 0.0F);
			right_arm_r2.setTextureOffset(16, 55).addBox(-2.0F, 5.8857F, -1.9611F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(25, 18).addBox(-1.0F, 4.8857F, -0.9611F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(30, 50).addBox(-2.0F, -0.1143F, -1.9611F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}

}
