
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

import net.mcreator.themultiverseoffreddys.entity.TFCCircusBabyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TFCCircusBabyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TFCCircusBabyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelTFC_CircusBaby(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/tfc_circusbaby.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelTFC_CircusBaby extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelTFC_CircusBaby() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(-0.1F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-3.9F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(54, 40).addBox(6.8F, -5.8F, -1.5F, 2.0F, 5.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(54, 40).addBox(-8.6F, -5.8F, -1.5F, 2.0F, 5.0F, 3.0F, 0.0F, true);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-6.85F, -5.5F, -0.5F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.48F);
			head_r1.setTextureOffset(22, 49).addBox(-0.75F, -4.4F, -1.0F, 4.0F, 2.0F, 3.0F, 0.0F, true);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-6.85F, -5.3F, -0.5F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.48F);
			head_r2.setTextureOffset(56, 16).addBox(-1.75F, -4.6F, -1.0F, 2.0F, 5.0F, 3.0F, 0.0F, true);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(7.05F, -5.5F, -0.5F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, -0.48F);
			head_r3.setTextureOffset(22, 49).addBox(-3.25F, -4.4F, -1.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(7.05F, -5.3F, -0.5F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, -0.48F);
			head_r4.setTextureOffset(56, 16).addBox(-0.25F, -4.6F, -1.0F, 2.0F, 5.0F, 3.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 25).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(26, 16).addBox(-3.5F, 1.0F, -3.0F, 7.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, 10.0F, -3.0F, 10.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 49).addBox(-6.0F, 12.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(46, 47).addBox(5.0F, 12.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(48, 36).addBox(-5.0F, 12.0F, -4.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(40, 32).addBox(-5.0F, 12.0F, 3.0F, 10.0F, 3.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.1667F, 1.6667F, 0.0F);
			left_arm.setTextureOffset(40, 16).addBox(-0.1667F, -1.6667F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(48, 8).addBox(-0.1667F, -2.1667F, -2.5F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			left_arm.setTextureOffset(48, 0).addBox(0.3333F, -2.1667F, -2.5F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.1667F, 1.6667F, 0.0F);
			right_arm.setTextureOffset(24, 25).addBox(-3.8333F, -1.6667F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(18, 41).addBox(-3.8333F, -2.1667F, -2.5F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 41).addBox(-4.3333F, -2.1667F, -2.5F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 12.0F, 0.0F);
			right_leg.setTextureOffset(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 12.0F, 0.0F);
			left_leg.setTextureOffset(36, 37).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
