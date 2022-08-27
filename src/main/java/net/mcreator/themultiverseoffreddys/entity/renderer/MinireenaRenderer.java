
package net.mcreator.themultiverseoffreddys.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.themultiverseoffreddys.entity.MinireenaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MinireenaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MinireenaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMinireena(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/minireena.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMinireena extends EntityModel<Entity> {
		private final ModelRenderer Mini;
		private final ModelRenderer right_leg;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer left_leg;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer right_arm;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer left_arm;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer Body;
		private final ModelRenderer Head;

		public ModelMinireena() {
			textureWidth = 32;
			textureHeight = 32;
			Mini = new ModelRenderer(this);
			Mini.setRotationPoint(0.0F, 24.0F, 0.0F);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(0.3F, -1.4F, 0.5F);
			Mini.addChild(right_leg);
			setRotationAngle(right_leg, 0.0F, 0.0F, -0.8727F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.7931F, -3.2685F, 0.0F);
			right_leg.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.1745F, 0.0F, 0.829F);
			cube_r1.setTextureOffset(0, 8).addBox(-0.1716F, -0.0525F, -1.6F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(4.4012F, -3.8223F, 0.0F);
			right_leg.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.3011F, -0.0522F, 1.2297F);
			cube_r2.setTextureOffset(11, 3).addBox(-0.8473F, -0.0304F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(-0.3F, -1.4F, 0.5F);
			Mini.addChild(left_leg);
			setRotationAngle(left_leg, 0.0F, 0.0F, 0.8727F);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-0.7931F, -3.2685F, 0.0F);
			left_leg.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3054F);
			cube_r3.setTextureOffset(11, 8).addBox(-0.4452F, -0.6239F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(2.0F, 0.0F, 0.0F);
			left_leg.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, -1.3963F);
			cube_r4.setTextureOffset(3, 12).addBox(2.5F, -6.9981F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-0.4F, -10.0F, 0.5F);
			Mini.addChild(right_arm);
			setRotationAngle(right_arm, 0.0F, 0.0F, -0.8727F);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-2.0F, 2.0F, 0.0F);
			right_arm.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, 0.1309F);
			cube_r5.setTextureOffset(7, 13).addBox(1.5268F, -6.2118F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-2.0F, 0.0F, 0.0F);
			right_arm.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, 1.3963F);
			cube_r6.setTextureOffset(11, 13).addBox(-3.5F, -6.9981F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(0.4F, -10.0F, 0.5F);
			Mini.addChild(left_arm);
			setRotationAngle(left_arm, 0.0F, 0.0F, 0.8727F);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(2.0F, 2.0F, 0.0F);
			left_arm.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -0.1309F);
			cube_r7.setTextureOffset(15, 0).addBox(-2.5268F, -6.2118F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(2.0F, 0.0F, 0.0F);
			left_arm.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, -1.3963F);
			cube_r8.setTextureOffset(15, 5).addBox(2.5F, -6.9981F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Mini.addChild(Body);
			Body.setTextureOffset(0, 0).addBox(-1.5F, -9.0F, -1.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			Body.setTextureOffset(7, 7).addBox(-0.5F, -12.0F, 0.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Mini.addChild(Head);
			Head.setTextureOffset(0, 4).addBox(-1.0F, -14.0F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Mini.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.Mini.rotateAngleY = f2 / 20.f;
		}
	}

}
