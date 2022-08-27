
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

import net.mcreator.themultiverseoffreddys.entity.Buffy2Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class Buffy2Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(Buffy2Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBuff_Mapbot(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/buff_mapbot.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBuff_Mapbot extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelBuff_Mapbot() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -8.9688F, 0.4625F);
			head.setTextureOffset(0, 57).addBox(-2.5F, -7.0313F, -3.4625F, 5.0F, 7.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(14, 21).addBox(-3.0F, -5.7813F, -3.6625F, 6.0F, 3.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(0, 4).addBox(1.51F, -5.7813F, -3.6625F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(54, 11).addBox(-2.5F, -8.5312F, -3.4625F, 5.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 4).addBox(-2.51F, -5.7813F, -3.6625F, 1.0F, 3.0F, 2.0F, 0.0F, true);
			head.setTextureOffset(40, 21).addBox(-5.5F, -7.5312F, -5.4625F, 11.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(120, 0).addBox(0.25F, -5.2813F, -3.8125F, 2.0F, 2.0F, 2.0F, -0.3F, false);
			head.setTextureOffset(120, 0).addBox(-2.25F, -5.2813F, -3.8125F, 2.0F, 2.0F, 2.0F, -0.3F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -7.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-9.0F, -2.0F, -5.0F, 18.0F, 12.0F, 9.0F, 0.0F, false);
			body.setTextureOffset(54, 0).addBox(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, 0.5F, false);
			body.setTextureOffset(34, 21).addBox(-3.0F, 11.0F, -4.5F, 6.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 21).addBox(0.4F, 10.0F, -4.4F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(0, 21).addBox(-2.4F, 10.0F, -4.4F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 21).addBox(0.4F, 10.0F, 3.4F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(34, 21).addBox(-3.0F, 11.0F, 3.5F, 6.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 21).addBox(-2.4F, 10.0F, 3.4F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(0.0F, -7.0F, 0.0F);
			right_arm.setTextureOffset(20, 21).addBox(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(0.0F, -7.0F, 0.0F);
			left_arm.setTextureOffset(0, 21).addBox(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(4.0F, 11.0F, 0.0F);
			right_leg.setTextureOffset(35, 53).addBox(-11.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(-5.0F, 11.0F, 0.0F);
			left_leg.setTextureOffset(40, 32).addBox(6.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
