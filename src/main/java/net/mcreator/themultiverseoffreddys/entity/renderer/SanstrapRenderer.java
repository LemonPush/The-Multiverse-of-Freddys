
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

import net.mcreator.themultiverseoffreddys.entity.SanstrapEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SanstrapRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SanstrapEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsanstrap(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/sanstrap.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelsanstrap extends EntityModel<Entity> {
		private final ModelRenderer right_leg;
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer head;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer left_leg;

		public Modelsanstrap() {
			textureWidth = 128;
			textureHeight = 128;
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 13.4167F, -0.6667F);
			right_leg.setTextureOffset(14, 42).addBox(-2.0F, 0.5833F, -1.3333F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(25, 46).addBox(-2.0F, 9.5833F, -3.3333F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(33, 0).addBox(-2.0F, 8.5833F, -2.3333F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(24, 52).addBox(-2.0F, 7.5833F, -1.3333F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(52, 14).addBox(-2.0F, 8.5833F, 1.6667F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(14, 33).addBox(-1.0F, 5.5833F, -0.3333F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(4.0F, 24.0F, 0.0F);
			body.setTextureOffset(22, 27).addBox(-3.0F, -19.0F, -3.0F, 4.0F, 9.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 33).addBox(-5.0F, -19.0F, -2.0F, 2.0F, 9.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-9.0F, -20.0F, -3.0F, 10.0F, 1.0F, 7.0F, 0.0F, false);
			body.setTextureOffset(42, 35).addBox(-7.0F, -15.0F, 3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(47, 17).addBox(-8.0F, -19.0F, 3.0F, 8.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(32, 2).addBox(-9.0F, -19.0F, -3.0F, 4.0F, 9.0F, 6.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.5236F);
			cube_r1.setTextureOffset(52, 6).addBox(-18.0F, -12.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 47).addBox(-7.0F, -15.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.5236F);
			cube_r2.setTextureOffset(43, 47).addBox(-3.0F, -19.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r2.setTextureOffset(12, 51).addBox(8.0F, -16.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(-0.223F, 4.3782F, 0.6111F);
			head.setTextureOffset(0, 17).addBox(-4.777F, -4.3782F, -3.6111F, 10.0F, 3.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(36, 23).addBox(-3.777F, -1.3782F, -3.6111F, 8.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 26).addBox(-3.777F, -5.3782F, -3.6111F, 8.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(26, 17).addBox(-3.777F, -9.3782F, -3.6111F, 8.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(42, 29).addBox(-3.777F, -7.3782F, 2.3889F, 8.0F, 5.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 8).addBox(-4.777F, -8.3782F, -3.6111F, 10.0F, 3.0F, 6.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(4.223F, 19.6218F, -0.6111F);
			head.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, -0.1309F);
			cube_r3.setTextureOffset(79, 20).addBox(-4.0F, -34.0F, 0.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(4.223F, 19.6218F, -0.6111F);
			head.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 0.1309F);
			cube_r4.setTextureOffset(79, 0).addBox(-3.0F, -33.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r4.setTextureOffset(70, 0).addBox(-5.0F, -33.0F, 0.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 13.4167F, -0.6667F);
			left_leg.setTextureOffset(14, 42).addBox(-2.0F, 0.5833F, -1.3333F, 4.0F, 5.0F, 4.0F, 0.0F, true);
			left_leg.setTextureOffset(25, 46).addBox(-2.0F, 9.5833F, -3.3333F, 4.0F, 1.0F, 5.0F, 0.0F, true);
			left_leg.setTextureOffset(33, 0).addBox(-2.0F, 8.5833F, -2.3333F, 4.0F, 1.0F, 1.0F, 0.0F, true);
			left_leg.setTextureOffset(24, 52).addBox(-2.0F, 7.5833F, -1.3333F, 4.0F, 2.0F, 1.0F, 0.0F, true);
			left_leg.setTextureOffset(52, 14).addBox(-2.0F, 8.5833F, 1.6667F, 4.0F, 2.0F, 1.0F, 0.0F, true);
			left_leg.setTextureOffset(14, 33).addBox(-1.0F, 5.5833F, -0.3333F, 2.0F, 4.0F, 2.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
