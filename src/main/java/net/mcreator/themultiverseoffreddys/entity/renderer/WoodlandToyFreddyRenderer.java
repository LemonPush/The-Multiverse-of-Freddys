
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

import net.mcreator.themultiverseoffreddys.entity.WoodlandToyFreddyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WoodlandToyFreddyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WoodlandToyFreddyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelWoodland__Toy_Freddy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/woodland__toy_freddy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelWoodland__Toy_Freddy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelWoodland__Toy_Freddy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 16).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
			head.setTextureOffset(42, 28).addBox(-4.0F, -5.5F, -7.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(60, 0).addBox(-4.0F, -6.5F, -7.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(56, 47).addBox(-4.0F, -7.5F, -7.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 49).addBox(-4.0F, -9.6F, -7.3F, 8.0F, 2.0F, 3.0F, 0.1F, false);
			head.setTextureOffset(29, 66).addBox(-3.0F, -10.5F, -7.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(42, 10).addBox(-1.0F, -11.5F, -7.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(57, 37).addBox(-2.9F, -13.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.1F, false);
			head.setTextureOffset(12, 54).addBox(0.9F, -13.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.1F, false);
			head.setTextureOffset(23, 45).addBox(-5.5F, -10.0F, -4.5F, 1.0F, 4.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(23, 45).addBox(4.5F, -10.0F, -4.5F, 1.0F, 4.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(21, 0).addBox(-0.8F, -17.8F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-4.5F, -13.5F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.6109F);
			head_r1.setTextureOffset(24, 22).addBox(-1.7F, -1.3F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(4.5F, -13.5F, 0.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.5236F);
			head_r2.setTextureOffset(21, 0).addBox(-4.3F, -1.3F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(4.5F, -13.5F, 0.0F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, -0.6109F);
			head_r3.setTextureOffset(26, 40).addBox(-1.3F, -1.3F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(32, 37).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.5F, false);
			body.setTextureOffset(42, 20).addBox(-4.5F, -5.5F, -2.5F, 9.0F, 3.0F, 5.0F, 0.75F, false);
			body.setTextureOffset(0, 37).addBox(-5.0F, -1.5F, -3.0F, 10.0F, 6.0F, 6.0F, 0.75F, false);
			body.setTextureOffset(34, 45).addBox(-5.0F, -4.0F, -4.0F, 10.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(64, 50).addBox(-4.5F, -5.0F, -4.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 3).addBox(-4.5F, 4.0F, -4.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(64, 52).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(44, 67).addBox(4.0F, -1.6F, -5.0F, 3.0F, 2.0F, 3.0F, -0.5F, false);
			body.setTextureOffset(44, 67).addBox(4.0F, 0.4F, -5.0F, 3.0F, 2.0F, 3.0F, -0.5F, false);
			body.setTextureOffset(44, 67).addBox(-7.0F, -5.6F, -5.0F, 3.0F, 2.0F, 3.0F, -0.5F, false);
			body.setTextureOffset(44, 67).addBox(-7.0F, -3.6F, -5.0F, 3.0F, 2.0F, 3.0F, -0.5F, false);
			body.setTextureOffset(44, 67).addBox(4.0F, 2.4F, -5.0F, 3.0F, 2.0F, 3.0F, -0.5F, false);
			body.setTextureOffset(19, 49).addBox(-1.0F, -4.9F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(42, 13).addBox(1.0F, -5.4F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 37).addBox(-3.0F, -5.4F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-6.5F, -5.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 4).addBox(4.5F, -5.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 3).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 0).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.5F, -5.0F, 0.0F);
			right_arm.setTextureOffset(62, 37).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			right_arm.setTextureOffset(0, 0).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-3.0F, 0.8333F, -8.6667F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, -0.6545F);
			right_arm_r1.setTextureOffset(0, 0).addBox(-1.25F, -2.5F, -11.25F, 5.0F, 5.0F, 11.0F, -0.75F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.0F, 10.3333F, 1.0F);
			right_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.0F);
			right_arm_r2.setTextureOffset(0, 0).addBox(-2.5F, 7.1667F, -13.0F, 5.0F, 5.0F, 32.0F, -0.75F, false);
			right_arm_r2.setTextureOffset(65, 16).addBox(-2.0F, 7.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);
			right_arm_r2.setTextureOffset(26, 37).addBox(-1.0F, 6.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(0, 64).addBox(-2.0F, 1.6667F, -7.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(6.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(55, 60).addBox(0.5F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			left_arm.setTextureOffset(0, 64).addBox(0.5F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);
			left_arm.setTextureOffset(24, 19).addBox(1.5F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(24, 16).addBox(1.5F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(65, 16).addBox(0.5F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(16, 58).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			right_leg.setTextureOffset(39, 56).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			right_leg.setTextureOffset(21, 8).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(21, 5).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(42, 10).addBox(-2.4F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.25F, false);
			right_leg.setTextureOffset(44, 67).addBox(-2.9F, 7.4F, -3.0F, 3.0F, 2.0F, 3.0F, -0.5F, false);
			right_leg.setTextureOffset(44, 67).addBox(-2.9F, 5.4F, -3.0F, 3.0F, 2.0F, 3.0F, -0.5F, false);
			right_leg.setTextureOffset(44, 67).addBox(-2.9F, 3.4F, -3.0F, 3.0F, 2.0F, 3.0F, -0.5F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(0, 54).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			left_leg.setTextureOffset(52, 50).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			left_leg.setTextureOffset(0, 20).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 8).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(42, 0).addBox(-2.6F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.25F, false);
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
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
