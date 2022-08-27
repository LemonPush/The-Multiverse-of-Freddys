
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

import net.mcreator.themultiverseoffreddys.entity.NoAiBucketEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NoAiBucketRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NoAiBucketEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBucket(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/bucket.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBucket extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer bucket;

		public ModelBucket() {
			textureWidth = 64;
			textureHeight = 64;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bucket = new ModelRenderer(this);
			bucket.setRotationPoint(-10.0F, 0.0F, 5.0F);
			bone.addChild(bucket);
			bucket.setTextureOffset(8, 25).addBox(7.0F, -11.0F, -7.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			bucket.setTextureOffset(8, 21).addBox(2.0F, -20.0F, -7.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
			bucket.setTextureOffset(32, 6).addBox(-2.0F, -20.5F, -7.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			bucket.setTextureOffset(0, 4).addBox(0.0F, -22.5F, -7.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			bucket.setTextureOffset(24, 23).addBox(11.0F, -11.0F, -7.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			bucket.setTextureOffset(8, 17).addBox(11.0F, -20.0F, -7.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
			bucket.setTextureOffset(26, 17).addBox(18.0F, -20.5F, -7.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			bucket.setTextureOffset(0, 0).addBox(19.0F, -22.5F, -7.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			bucket.setTextureOffset(0, 17).addBox(9.0F, -22.0F, -7.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
			bucket.setTextureOffset(24, 0).addBox(7.0F, -22.0F, -7.1F, 6.0F, 5.0F, 1.0F, 0.0F, false);
			bucket.setTextureOffset(0, 0).addBox(6.0F, -31.0F, -10.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}

}
