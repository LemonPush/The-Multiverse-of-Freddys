
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

import net.mcreator.themultiverseoffreddys.entity.ChillaxEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ChillaxRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ChillaxEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelChillax(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/chillax.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelChillax extends EntityModel<Entity> {
		private final ModelRenderer Middle_R_Leg;
		private final ModelRenderer cube_r1;
		private final ModelRenderer Front_R_leg;
		private final ModelRenderer cube_r2;
		private final ModelRenderer Back_R_Leg;
		private final ModelRenderer cube_r3;
		private final ModelRenderer Middle_L_Leg2;
		private final ModelRenderer cube_r4;
		private final ModelRenderer Front_L_leg2;
		private final ModelRenderer cube_r5;
		private final ModelRenderer Back_L_Leg2;
		private final ModelRenderer cube_r6;
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r7;

		public ModelChillax() {
			textureWidth = 64;
			textureHeight = 64;
			Middle_R_Leg = new ModelRenderer(this);
			Middle_R_Leg.setRotationPoint(-2.7706F, 19.8577F, 0.0F);
			Middle_R_Leg.setTextureOffset(12, 29).addBox(-5.2294F, -0.8577F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-3.7294F, 0.6423F, 0.0F);
			Middle_R_Leg.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.829F);
			cube_r1.setTextureOffset(16, 33).addBox(-0.2F, -1.3F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(28, 27).addBox(-0.2F, 1.7F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Front_R_leg = new ModelRenderer(this);
			Front_R_leg.setRotationPoint(-2.7706F, 19.8577F, -1.5F);
			setRotationAngle(Front_R_leg, 0.0F, -0.5672F, 0.0F);
			Front_R_leg.setTextureOffset(8, 29).addBox(-5.2294F, -0.8577F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-3.7294F, 0.6423F, 0.0F);
			Front_R_leg.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.829F);
			cube_r2.setTextureOffset(24, 31).addBox(-0.2F, -1.3F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r2.setTextureOffset(27, 22).addBox(-0.2F, 1.7F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Back_R_Leg = new ModelRenderer(this);
			Back_R_Leg.setRotationPoint(-2.7706F, 19.8577F, 1.5F);
			setRotationAngle(Back_R_Leg, 0.0F, 0.5672F, 0.0F);
			Back_R_Leg.setTextureOffset(4, 29).addBox(-5.2294F, -0.8577F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-3.7294F, 0.6423F, 0.0F);
			Back_R_Leg.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, -0.829F);
			cube_r3.setTextureOffset(20, 31).addBox(-0.2F, -1.3F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r3.setTextureOffset(24, 25).addBox(-0.2F, 1.7F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Middle_L_Leg2 = new ModelRenderer(this);
			Middle_L_Leg2.setRotationPoint(2.7706F, 19.8577F, 0.0F);
			Middle_L_Leg2.setTextureOffset(0, 10).addBox(4.2294F, -0.8577F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(3.7294F, 0.6423F, 0.0F);
			Middle_L_Leg2.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 0.829F);
			cube_r4.setTextureOffset(24, 0).addBox(-0.8F, -1.3F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r4.setTextureOffset(21, 10).addBox(-3.8F, 1.7F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Front_L_leg2 = new ModelRenderer(this);
			Front_L_leg2.setRotationPoint(2.7706F, 19.8577F, -1.5F);
			setRotationAngle(Front_L_leg2, 0.0F, 0.5672F, 0.0F);
			Front_L_leg2.setTextureOffset(0, 19).addBox(4.2294F, -0.8577F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(3.7294F, 0.6423F, 0.0F);
			Front_L_leg2.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, 0.829F);
			cube_r5.setTextureOffset(16, 29).addBox(-0.8F, -1.3F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r5.setTextureOffset(18, 21).addBox(-3.8F, 1.7F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			Back_L_Leg2 = new ModelRenderer(this);
			Back_L_Leg2.setRotationPoint(2.7706F, 19.8577F, 1.5F);
			setRotationAngle(Back_L_Leg2, 0.0F, -0.5672F, 0.0F);
			Back_L_Leg2.setTextureOffset(0, 29).addBox(4.2294F, -0.8577F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(3.7294F, 0.6423F, 0.0F);
			Back_L_Leg2.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, 0.829F);
			cube_r6.setTextureOffset(29, 30).addBox(-0.8F, -1.3F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(18, 23).addBox(-3.8F, 1.7F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 19).addBox(-3.0F, -7.0F, -3.0F, 6.0F, 4.0F, 6.0F, 0.0F, false);
			bb_main.setTextureOffset(29, 10).addBox(-2.0F, -6.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 4).addBox(-2.5F, -6.5F, -6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(21, 12).addBox(1.0F, -6.0F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			bb_main.setTextureOffset(0, 0).addBox(0.5F, -6.5F, -6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, -5.0F, 0.0F);
			bb_main.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.4363F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(22, 27).addBox(-1.0F, -13.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r7.setTextureOffset(33, 7).addBox(-0.5F, -11.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(24, 0).addBox(-2.5F, -8.0F, -2.5F, 5.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r7.setTextureOffset(22, 13).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 10).addBox(-3.5F, -4.0F, -3.5F, 7.0F, 2.0F, 7.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 0).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Middle_R_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
			Front_R_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			Back_R_Leg.render(matrixStack, buffer, packedLight, packedOverlay);
			Middle_L_Leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			Front_L_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			Back_L_Leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.Front_R_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Middle_L_Leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Front_L_leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Back_R_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.Back_L_Leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.Middle_R_Leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
