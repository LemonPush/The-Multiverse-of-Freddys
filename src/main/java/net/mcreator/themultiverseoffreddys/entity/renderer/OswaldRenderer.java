
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

import net.mcreator.themultiverseoffreddys.entity.OswaldEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class OswaldRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(OswaldEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelOswald(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/oswald.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelOswald extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer body;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelOswald() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 2.9853F, 0.2339F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.9853F, -4.2339F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(1.0F, -12.9853F, -1.2339F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-3.0F, -12.9853F, -1.2339F, 2.0F, 6.0F, 2.0F, 0.0F, true);
			head.setTextureOffset(24, 4).addBox(-2.0F, -4.9853F, -5.7339F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(-0.5F, -5.4853F, -6.2339F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-2.0F, -13.9853F, -0.2339F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.5672F, 0.0F, 0.0F);
			head_r1.setTextureOffset(8, 29).addBox(-1.0F, -3.6F, -1.7F, 2.0F, 5.0F, 2.0F, 0.0F, true);
			head_r1.setTextureOffset(8, 29).addBox(3.0F, -3.6F, -1.7F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 4.0F, 0.0F);
			body.setTextureOffset(0, 16).addBox(-5.0F, 4.0F, -3.0F, 10.0F, 7.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(28, 12).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(24, 0).addBox(-5.0F, -1.6F, -1.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.5F, 13.75F, -0.75F);
			right_leg.setTextureOffset(0, 29).addBox(-1.0F, 0.25F, -0.25F, 2.0F, 7.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(25, 22).addBox(-2.0F, 7.25F, -3.75F, 4.0F, 3.0F, 7.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.5F, 13.75F, -0.75F);
			left_leg.setTextureOffset(0, 29).addBox(-1.0F, 0.25F, -0.25F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(25, 22).addBox(-2.0F, 7.25F, -3.75F, 4.0F, 3.0F, 7.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
