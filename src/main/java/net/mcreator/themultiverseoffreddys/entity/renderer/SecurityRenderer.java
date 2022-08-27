
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

import net.mcreator.themultiverseoffreddys.entity.SecurityEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SecurityRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SecurityEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelSecurity(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/security.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSecurity extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body_r1;
		private final ModelRenderer body;
		private final ModelRenderer body_r2;
		private final ModelRenderer body_r3;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelSecurity() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.253F, 0.1333F);
			head.setTextureOffset(0, 16).addBox(-3.0F, -6.247F, -2.1333F, 6.0F, 4.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(8, 30).addBox(-1.0F, -5.247F, -3.1333F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, -0.997F, 2.8667F);
			head.addChild(body_r1);
			setRotationAngle(body_r1, 0.7854F, 0.0F, 0.0F);
			body_r1.setTextureOffset(32, 20).addBox(-1.0F, -3.8F, 0.2F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 30).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 4.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(29, 0).addBox(-1.0F, 1.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			body.setTextureOffset(0, 9).addBox(-3.5F, 8.5F, -2.0F, 7.0F, 3.0F, 4.0F, 0.25F, false);
			body.setTextureOffset(8, 37).addBox(-3.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(8, 35).addBox(-3.0F, 4.8F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(8, 33).addBox(-3.0F, 6.3F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 11).addBox(1.0F, 6.3F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(11, 24).addBox(1.0F, 4.8F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(32, 7).addBox(1.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(16, 16).addBox(-5.0F, 0.25F, -1.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(22, 11).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(22, 36).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-0.5F, -7.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(21, 0).addBox(-1.0F, -8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(-3.5F, 0.5F, 0.0F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, 0.0F, 0.7854F);
			body_r2.setTextureOffset(0, 24).addBox(-2.5F, -0.5F, -2.5F, 3.0F, 1.0F, 5.0F, 0.0F, true);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(3.5F, 0.5F, 0.0F);
			body.addChild(body_r3);
			setRotationAngle(body_r3, 0.0F, 0.0F, -0.7854F);
			body_r3.setTextureOffset(0, 24).addBox(-0.5F, -0.5F, -2.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.9F, 0.85F, 0.0F);
			left_arm.setTextureOffset(34, 27).addBox(1.1F, -0.6F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(32, 20).addBox(1.1F, 6.4F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(32, 0).addBox(0.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(38, 7).addBox(1.1F, 4.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.9F, 0.85F, 0.0F);
			right_arm.setTextureOffset(34, 27).addBox(-3.1F, -0.6F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(32, 0).addBox(-3.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(38, 7).addBox(-3.1F, 4.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, true);
			right_arm.setTextureOffset(32, 20).addBox(-3.1F, 6.4F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(14, 28).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(22, 28).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(32, 34).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(26, 23).addBox(-1.0F, 5.2083F, -1.8333F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(14, 20).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(20, 3).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(14, 28).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(22, 28).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(32, 34).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, true);
			right_leg.setTextureOffset(14, 20).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, true);
			right_leg.setTextureOffset(20, 3).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, true);
			right_leg.setTextureOffset(26, 20).addBox(-1.0F, 5.2083F, -1.8333F, 2.0F, 2.0F, 1.0F, 0.0F, false);
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
