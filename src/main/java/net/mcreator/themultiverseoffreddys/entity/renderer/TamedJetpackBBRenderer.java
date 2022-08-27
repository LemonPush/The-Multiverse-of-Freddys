
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

import net.mcreator.themultiverseoffreddys.entity.TamedJetpackBBEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedJetpackBBRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedJetpackBBEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelJetpack_Balloon_Boy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/jetpack_balloon_boy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelJetpack_Balloon_Boy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelJetpack_Balloon_Boy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 9.0F, 0.0F);
			head.setTextureOffset(0, 20).addBox(-3.5F, -9.0F, -3.0F, 7.0F, 7.0F, 7.0F, 0.1F, false);
			head.setTextureOffset(0, 3).addBox(-2.5F, -6.7F, -3.4F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 3).addBox(0.5F, -6.7F, -3.4F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 8).addBox(-4.1F, -5.1F, -3.9F, 2.0F, 2.0F, 2.0F, -0.5F, false);
			head.setTextureOffset(30, 8).addBox(2.1F, -5.1F, -3.9F, 2.0F, 2.0F, 2.0F, -0.5F, false);
			head.setTextureOffset(0, 0).addBox(-0.5F, -4.9F, -4.4F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(29, 13).addBox(-3.5F, -9.0F, -3.0F, 7.0F, 2.0F, 7.0F, 0.2F, false);
			head.setTextureOffset(0, 35).addBox(-3.5F, -6.6F, -1.0F, 7.0F, 3.0F, 5.0F, 0.2F, false);
			head.setTextureOffset(24, 0).addBox(3.5F, -6.8F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(24, 0).addBox(-4.5F, -6.8F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, true);
			head.setTextureOffset(0, 14).addBox(-0.5F, -11.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.1F, false);
			head.setTextureOffset(30, 0).addBox(-3.5F, -12.0F, -3.0F, 7.0F, 1.0F, 7.0F, 0.1F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-4.5F, 8.0F, -3.0F, 9.0F, 8.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(49, 45).addBox(-4.5F, 7.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(49, 45).addBox(2.5F, 7.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(28, 22).addBox(-2.5F, 7.0F, 1.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(16, 49).addBox(0.5F, 8.0F, 3.0F, 4.0F, 8.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(16, 49).addBox(-4.5F, 8.0F, 3.0F, 4.0F, 8.0F, 3.0F, 0.0F, true);
			body.setTextureOffset(42, 51).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.0F, 11.0F, -1.0F);
			setRotationAngle(right_arm, -1.5708F, 0.6109F, 0.0F);
			right_arm.setTextureOffset(38, 31).addBox(-3.5F, 4.0F, -10.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			right_arm.setTextureOffset(21, 27).addBox(-6.0F, 1.5F, -17.0F, 6.0F, 6.0F, 7.0F, 0.0F, false);
			right_arm.setTextureOffset(50, 8).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(30, 49).addBox(-4.5F, 2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.0F, 11.0F, -2.0F);
			setRotationAngle(left_arm, -1.5708F, -0.6109F, 0.0F);
			left_arm.setTextureOffset(21, 20).addBox(2.5F, 4.0F, -6.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			left_arm.setTextureOffset(96, 0).addBox(-3.0F, 3.5F, -13.0F, 13.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(120, 27).addBox(-5.0F, 4.5F, -12.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(120, 27).addBox(-3.4F, 4.5F, -14.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(120, 27).addBox(9.0F, 4.5F, -9.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(2, 14).addBox(-3.0F, 3.5F, -10.0F, 13.0F, 2.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(49, 31).addBox(1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(51, 0).addBox(1.5F, 2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.1F, 16.0F, 0.0F);
			right_leg.setTextureOffset(0, 43).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(40, 22).addBox(-1.9F, 6.0F, -5.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.1F, 16.0F, 0.0F);
			left_leg.setTextureOffset(39, 41).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(17, 40).addBox(-2.1F, 6.0F, -5.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);
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
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
