
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

import net.mcreator.themultiverseoffreddys.entity.BeaverEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BeaverRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BeaverEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBeaver(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/beaver.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBeaver extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer headwear;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelBeaver() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(44, 23).addBox(-2.0F, -4.0F, -7.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(4, 0).addBox(-0.5F, -4.5F, -7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-1.1F, -2.5F, -7.1F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(0.1F, -2.5F, -7.1F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(0, 4).addBox(2.5F, -6.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(3, 3).addBox(-3.5F, -6.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			headwear = new ModelRenderer(this);
			headwear.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.addChild(headwear);
			headwear.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, -2.0F, 8.0F, 8.0F, 6.0F, 0.5F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(24, 26).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 11.0F, 2.5F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.4363F, 0.0F, 0.0F);
			body_r1.setTextureOffset(44, 42).addBox(-2.0F, -1.0F, -0.9F, 4.0F, 14.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			left_arm.setTextureOffset(32, 0).addBox(9.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
			right_arm.setTextureOffset(0, 30).addBox(-13.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			left_leg.setTextureOffset(28, 42).addBox(1.9F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(28, 16).addBox(1.9F, 11.0F, -4.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(1.9F, 12.0F, 0.0F);
			right_leg.setTextureOffset(12, 42).addBox(-5.9F, 0.0F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(42, 10).addBox(-5.9F, 11.0F, -4.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);
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
