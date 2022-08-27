
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

import net.mcreator.themultiverseoffreddys.entity.KelseyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class KelseyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(KelseyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelChild(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/kelsey.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelChild extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer mask;
		private final ModelRenderer head_r1;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelChild() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 12.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 28).addBox(3.0F, -6.0F, 0.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 28).addBox(-6.0F, -6.0F, 0.0F, 3.0F, 6.0F, 1.0F, 0.0F, true);
			mask = new ModelRenderer(this);
			mask.setRotationPoint(0.0F, 39.2F, 0.0F);
			head.addChild(mask);
			mask.setTextureOffset(0, 12).addBox(-3.5F, -45.45F, -3.5F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			mask.setTextureOffset(16, 12).addBox(-2.5F, -40.45F, -6.25F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			mask.setTextureOffset(16, 16).addBox(-2.25F, -40.45F, -6.5F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			mask.setTextureOffset(18, 0).addBox(-2.5F, -41.45F, -6.5F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -38.95F, -5.0F);
			mask.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 3.1416F, 0.0F);
			head_r1.setTextureOffset(18, 0).addBox(-2.5F, -0.5F, -1.5F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 12.0F, 0.0F);
			body.setTextureOffset(0, 20).addBox(-2.0F, 0.0F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(2.0F, 13.0F, 0.0F);
			left_arm.setTextureOffset(26, 26).addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-2.0F, 13.0F, 0.0F);
			right_arm.setTextureOffset(24, 4).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(1.0F, 18.0F, 0.0F);
			left_leg.setTextureOffset(20, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-1.0F, 18.0F, 0.0F);
			right_leg.setTextureOffset(12, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
