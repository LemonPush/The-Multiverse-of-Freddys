
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

import net.mcreator.themultiverseoffreddys.entity.TamedVaccumEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedVaccumRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedVaccumEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelVaccum(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/vaccum.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelVaccum extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer vaccum;
		private final ModelRenderer cube_r1;

		public ModelVaccum() {
			textureWidth = 64;
			textureHeight = 64;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			vaccum = new ModelRenderer(this);
			vaccum.setRotationPoint(4.0F, 0.0F, -11.0F);
			bone.addChild(vaccum);
			vaccum.setTextureOffset(0, 0).addBox(-7.5F, -3.0F, 8.0F, 7.0F, 3.0F, 7.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-4.0F, -1.5F, 14.0F);
			vaccum.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(21, 0).addBox(6.0F, -14.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 0).addBox(-2.5F, -18.0F, -1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 0).addBox(0.5F, -18.0F, -1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(24, 21).addBox(-9.0F, -14.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 25).addBox(-6.0F, -13.5F, -1.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(24, 27).addBox(1.0F, -13.5F, -1.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(24, 10).addBox(-1.5F, -28.5F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 10).addBox(-3.0F, -16.5F, 1.0F, 6.0F, 13.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(16, 10).addBox(-1.0F, -20.5F, -1.0F, 2.0F, 20.0F, 2.0F, 0.0F, false);
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
