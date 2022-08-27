
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

import net.mcreator.themultiverseoffreddys.entity.MichaelEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MichaelRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MichaelEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMichael(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/michael.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMichael extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelMichael() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.0226F, 0.0366F);
			head.setTextureOffset(0, 10).addBox(-0.5F, -0.9774F, -0.5366F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 3).addBox(-2.5F, -6.7274F, -3.4866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 17).addBox(0.5F, -6.7274F, -3.4866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-2.5F, -7.4774F, -3.0366F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			head.setTextureOffset(0, 10).addBox(-2.5F, -2.9774F, -3.0366F, 5.0F, 2.0F, 5.0F, 0.25F, false);
			head.setTextureOffset(0, 0).addBox(-1.15F, -2.9774F, -3.0866F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(16, 30).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(16, 0).addBox(-3.5F, 0.0F, -1.5F, 7.0F, 3.0F, 3.0F, 0.25F, false);
			body.setTextureOffset(16, 24).addBox(-3.0F, 3.5F, -1.0F, 6.0F, 4.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(32, 15).addBox(-3.0F, 8.0F, -1.0F, 6.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(22, 30).addBox(-3.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(26, 15).addBox(-3.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(22, 6).addBox(-3.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 19).addBox(1.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 20).addBox(1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 21).addBox(1.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(38, 10).addBox(1.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(35, 19).addBox(-5.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 19).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.5F, 0.85F, 0.0F);
			left_arm.setTextureOffset(8, 25).addBox(1.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(6, 37).addBox(1.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(36, 0).addBox(1.0F, 4.15F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(38, 6).addBox(1.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.5F, 0.85F, 0.0F);
			right_arm.setTextureOffset(8, 25).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(32, 35).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(24, 35).addBox(-3.0F, 4.15F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(36, 22).addBox(-3.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(0, 25).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			left_leg.setTextureOffset(26, 6).addBox(-1.5F, 0.2583F, -1.3333F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(29, 27).addBox(-1.5F, 6.2583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 17).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(0, 25).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(26, 6).addBox(-1.5F, 0.2583F, -1.3333F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(29, 27).addBox(-1.5F, 6.2583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(14, 11).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, false);
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
