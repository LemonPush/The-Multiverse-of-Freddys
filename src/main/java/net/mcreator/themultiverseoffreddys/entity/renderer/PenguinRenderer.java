
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

import net.mcreator.themultiverseoffreddys.entity.PenguinEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PenguinRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PenguinEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPenguin(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/penguin.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelPenguin extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;

		public ModelPenguin() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 6.25F, -0.5F);
			head.setTextureOffset(0, 24).addBox(-3.5F, -6.75F, -3.5F, 7.0F, 7.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(0, 24).addBox(-2.5F, -5.75F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(0.5F, -5.75F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 3).addBox(-0.5F, -2.75F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -2.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-4.0F, 8.5F, -4.5F, 8.0F, 16.0F, 8.0F, 0.5F, false);
			body.setTextureOffset(21, 24).addBox(0.5F, 8.1F, -5.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 0).addBox(-1.5F, 8.1F, -5.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(4, 3).addBox(-0.5F, 8.6F, -5.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(23, 37).addBox(-3.5F, 25.0F, -7.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(24, 0).addBox(0.5F, 25.0F, -7.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(36, 0).addBox(-6.0F, 9.5F, -3.5F, 1.0F, 13.0F, 6.0F, 0.5F, false);
			body.setTextureOffset(28, 18).addBox(5.0F, 9.5F, -3.5F, 1.0F, 13.0F, 6.0F, 0.5F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
