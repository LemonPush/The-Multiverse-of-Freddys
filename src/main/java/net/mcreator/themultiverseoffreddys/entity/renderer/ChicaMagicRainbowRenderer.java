
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

import net.mcreator.themultiverseoffreddys.entity.ChicaMagicRainbowEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ChicaMagicRainbowRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ChicaMagicRainbowEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelChicaMagicRainbow(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/chicamagicrainbow.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelChicaMagicRainbow extends EntityModel<Entity> {
		private final ModelRenderer bone;

		public ModelChicaMagicRainbow() {
			textureWidth = 128;
			textureHeight = 128;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 5.4524F, 1.7857F);
			bone.setTextureOffset(35, 0).addBox(-8.0F, 0.0476F, -2.7857F, 16.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(40, 3).addBox(-7.0F, 2.0476F, -2.7857F, 14.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(40, 16).addBox(-6.0F, 4.0476F, -2.7857F, 12.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(46, 45).addBox(-6.0F, -8.4524F, -2.7857F, 5.0F, 5.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(46, 45).addBox(1.0F, -8.4524F, -2.7857F, 5.0F, 5.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(37, 21).addBox(-5.0F, -13.4524F, -1.7857F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(0, 26).addBox(-8.0F, -10.4524F, -1.7857F, 16.0F, 3.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(28, 45).addBox(-2.0F, -7.4524F, -1.7857F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(35, 8).addBox(-5.0F, -4.4524F, -1.7857F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(0, 45).addBox(-11.0F, -7.4524F, -1.7857F, 9.0F, 3.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(0, 45).addBox(-14.0F, -4.4524F, -1.7857F, 9.0F, 3.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(0, 13).addBox(11.0F, 10.5476F, -1.7857F, 15.0F, 8.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(28, 34).addBox(14.0F, 4.5476F, -1.7857F, 9.0F, 6.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-26.0F, 10.5476F, -1.7857F, 15.0F, 8.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(0, 34).addBox(-23.0F, 4.5476F, -1.7857F, 9.0F, 6.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(0, 45).addBox(-20.0F, 1.5476F, -1.7857F, 9.0F, 3.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(0, 45).addBox(-17.0F, -1.4524F, -1.7857F, 9.0F, 3.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(0, 45).addBox(11.0F, 1.5476F, -1.7857F, 9.0F, 3.0F, 5.0F, 0.0F, true);
			bone.setTextureOffset(0, 45).addBox(8.0F, -1.4524F, -1.7857F, 9.0F, 3.0F, 5.0F, 0.0F, true);
			bone.setTextureOffset(0, 45).addBox(5.0F, -4.4524F, -1.7857F, 9.0F, 3.0F, 5.0F, 0.0F, true);
			bone.setTextureOffset(0, 45).addBox(2.0F, -7.4524F, -1.7857F, 9.0F, 3.0F, 5.0F, 0.0F, true);
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
