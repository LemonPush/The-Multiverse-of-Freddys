
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

import net.mcreator.themultiverseoffreddys.entity.SimonEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SimonRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SimonEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelSimon(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/simon.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSimon extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_leg;

		public ModelSimon() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(1.0F, 2.5F, -2.15F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 16).addBox(-4.0F, 0.0F, -2.1F, 8.0F, 12.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 0).addBox(-3.5F, 0.0F, -1.5F, 7.0F, 5.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(24, 29).addBox(-3.5F, 0.0F, 0.9F, 7.0F, 12.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 29).addBox(-3.5F, 0.0F, 1.1F, 7.0F, 12.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.025F, 1.0F, 0.0F);
			left_arm.setTextureOffset(40, 27).addBox(-0.025F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			left_arm.setTextureOffset(16, 32).addBox(0.025F, -1.0F, -1.5F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.025F, 12.0F, 0.0F);
			left_leg.setTextureOffset(8, 32).addBox(-1.025F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			left_leg.setTextureOffset(0, 32).addBox(-0.975F, 0.0F, -1.5F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.025F, 1.0F, 0.0F);
			right_arm.setTextureOffset(40, 27).addBox(-1.975F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(16, 32).addBox(-2.025F, -1.0F, -1.5F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.025F, 12.0F, 0.0F);
			right_leg.setTextureOffset(8, 32).addBox(-0.975F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 32).addBox(-1.025F, 0.0F, -1.5F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
