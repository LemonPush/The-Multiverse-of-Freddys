
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

import net.mcreator.themultiverseoffreddys.entity.FloaterEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FloaterRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FloaterEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelFloater(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/floater.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFloater extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;

		public ModelFloater() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 4.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 7.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(14, 20).addBox(-5.0F, -3.0F, -5.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 17).addBox(-4.0F, -17.0F, -1.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(1.0F, -17.0F, -1.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(18, 24).addBox(-4.0F, -18.0F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 30).addBox(1.0F, -18.0F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -1.5F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.829F, 0.0F, 0.0F);
			head_r1.setTextureOffset(14, 17).addBox(-5.0F, -1.4F, -5.5F, 10.0F, 1.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(30, 0).addBox(-3.0F, -0.4F, -5.5F, 6.0F, 3.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 17).addBox(3.0F, -0.4F, -5.5F, 2.0F, 3.0F, 10.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 30).addBox(3.5F, -4.4F, -1.5F, 1.0F, 4.0F, 1.0F, 0.0F, true);
			head_r1.setTextureOffset(0, 30).addBox(-4.5F, -4.4F, -1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 17).addBox(-5.0F, -0.4F, -5.5F, 2.0F, 3.0F, 10.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
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
