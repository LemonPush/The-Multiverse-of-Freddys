
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

import net.mcreator.themultiverseoffreddys.entity.TamedPlushkinChicaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedPlushkinChicaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedPlushkinChicaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPlushkinChica(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/plushkinchica.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelPlushkinChica extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer mask;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer bb_main;

		public ModelPlushkinChica() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 16.5163F, 0.3714F);
			head.setTextureOffset(0, 9).addBox(-3.0F, -8.5163F, -2.8714F, 6.0F, 6.0F, 5.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(2.55F, -7.5163F, -0.8714F);
			head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.4363F);
			cube_r1.setTextureOffset(20, 31).addBox(1.3088F, -1.2934F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(28, 31).addBox(-0.6912F, -1.2934F, -0.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-2.55F, -7.5163F, -0.8714F);
			head.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 0.4363F);
			cube_r2.setTextureOffset(12, 31).addBox(-3.3088F, -1.2934F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r2.setTextureOffset(31, 11).addBox(-2.3088F, -1.2934F, -0.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			mask = new ModelRenderer(this);
			mask.setRotationPoint(0.0F, 7.4837F, 0.1286F);
			head.addChild(mask);
			mask.setTextureOffset(56, 4).addBox(-1.5F, -12.5F, -4.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			mask.setTextureOffset(17, 9).addBox(-1.0F, -12.0F, -5.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			mask.setTextureOffset(0, 20).addBox(-3.5F, -16.5F, -3.5F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			mask.setTextureOffset(0, 0).addBox(-1.0F, -17.5F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(1.75F, 19.5F, 0.0F);
			left_leg.setTextureOffset(23, 0).addBox(-1.5F, 1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-1.75F, 19.5F, 0.0F);
			right_leg.setTextureOffset(0, 28).addBox(-1.5F, 1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb_main.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -3.5F, 8.0F, 2.0F, 7.0F, 0.0F, false);
			bb_main.setTextureOffset(18, 16).addBox(-3.0F, -10.0F, -2.0F, 6.0F, 5.0F, 4.0F, 0.0F, false);
			bb_main.setTextureOffset(25, 25).addBox(-5.95F, -10.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			bb_main.setTextureOffset(13, 25).addBox(3.05F, -10.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
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
