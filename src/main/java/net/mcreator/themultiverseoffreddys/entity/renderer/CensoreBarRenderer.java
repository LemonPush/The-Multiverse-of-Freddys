
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

import net.mcreator.themultiverseoffreddys.entity.CensoreBarEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CensoreBarRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CensoreBarEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelAdultTheory(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/adulttheory.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelAdultTheory extends EntityModel<Entity> {
		private final ModelRenderer bone;

		public ModelAdultTheory() {
			textureWidth = 128;
			textureHeight = 128;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(-0.0714F, 6.4571F, -1.4429F);
			bone.setTextureOffset(0, 0).addBox(-25.9286F, -6.4571F, 0.4429F, 52.0F, 13.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(18, 26).addBox(-23.9286F, -4.4571F, -0.5571F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(6, 26).addBox(-13.9286F, -4.4571F, -0.5571F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 26).addBox(-8.9286F, -4.4571F, -0.5571F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(12, 26).addBox(-18.9286F, -4.4571F, -0.5571F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(24, 39).addBox(-21.9286F, -4.4571F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(36, 38).addBox(-11.9286F, -2.9571F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(30, 37).addBox(-11.4286F, -0.9571F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(36, 31).addBox(-10.9286F, 1.0429F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(18, 39).addBox(-21.9286F, 2.5429F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(30, 27).addBox(-5.9286F, -4.4571F, -0.5571F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(30, 22).addBox(-3.9286F, 0.5429F, -0.5571F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(24, 16).addBox(6.0714F, -4.4571F, -0.5571F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(36, 28).addBox(8.0714F, -4.4571F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(24, 32).addBox(8.0714F, -0.4571F, -0.5571F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(12, 16).addBox(-0.9286F, -4.4571F, -0.5571F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(6, 16).addBox(3.0714F, -4.4571F, -0.5571F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(18, 16).addBox(18.0714F, -4.4571F, -0.5571F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(30, 32).addBox(10.0714F, 1.5429F, -0.5571F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(30, 16).addBox(10.0714F, -4.4571F, -0.5571F, 2.0F, 5.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(36, 25).addBox(-3.9286F, -4.4571F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(36, 19).addBox(-5.9286F, 2.5429F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(18, 36).addBox(-4.9286F, -0.9571F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(24, 36).addBox(1.0714F, 2.5429F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(36, 22).addBox(1.0714F, -4.4571F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(6, 39).addBox(-16.9286F, 2.5429F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 39).addBox(-16.9286F, -0.9571F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(12, 39).addBox(-16.9286F, -4.4571F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(6, 36).addBox(15.0714F, -0.9571F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(12, 36).addBox(15.0714F, -4.4571F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 16).addBox(13.0714F, -4.4571F, -0.5571F, 2.0F, 9.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(36, 16).addBox(15.0714F, 2.5429F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(35, 35).addBox(20.0714F, -4.4571F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 36).addBox(20.0714F, 2.5429F, -0.5571F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(24, 26).addBox(22.0714F, -2.4571F, -0.5571F, 2.0F, 5.0F, 1.0F, 0.0F, false);
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
			this.bone.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.bone.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
