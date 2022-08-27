
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

import net.mcreator.themultiverseoffreddys.entity.PhoneGuyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PhoneGuyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PhoneGuyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPhoneGuy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/phoneguy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelPhoneGuy extends EntityModel<Entity> {
		private final ModelRenderer Phone;

		public ModelPhoneGuy() {
			textureWidth = 32;
			textureHeight = 32;
			Phone = new ModelRenderer(this);
			Phone.setRotationPoint(0.0F, 24.0F, 0.0F);
			Phone.setTextureOffset(0, 0).addBox(-2.0F, -20.0F, 0.0F, 4.0F, 16.0F, 2.0F, 0.0F, false);
			Phone.setTextureOffset(0, 18).addBox(-2.0F, -20.0F, -2.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			Phone.setTextureOffset(12, 0).addBox(-2.0F, -20.0F, -4.0F, 4.0F, 4.0F, 2.0F, 0.25F, false);
			Phone.setTextureOffset(19, 7).addBox(2.0F, -20.0F, -4.1F, 0.0F, 4.0F, 0.0F, 0.25F, false);
			Phone.setTextureOffset(14, 10).addBox(-2.0F, -16.0F, -4.1F, 4.0F, 0.0F, 0.0F, 0.25F, false);
			Phone.setTextureOffset(14, 10).addBox(-2.0F, -20.0F, -4.1F, 4.0F, 0.0F, 0.0F, 0.25F, false);
			Phone.setTextureOffset(19, 8).addBox(-2.0F, -20.0F, -4.1F, 0.0F, 4.0F, 0.0F, 0.25F, false);
			Phone.setTextureOffset(14, 10).addBox(-2.0F, -8.0F, -4.1F, 4.0F, 0.0F, 0.0F, 0.25F, false);
			Phone.setTextureOffset(14, 10).addBox(-2.0F, -4.0F, -4.1F, 4.0F, 0.0F, 0.0F, 0.25F, false);
			Phone.setTextureOffset(19, 7).addBox(2.0F, -8.0F, -4.1F, 0.0F, 4.0F, 0.0F, 0.25F, false);
			Phone.setTextureOffset(19, 8).addBox(-2.0F, -8.0F, -4.1F, 0.0F, 4.0F, 0.0F, 0.25F, false);
			Phone.setTextureOffset(12, 0).addBox(-2.0F, -8.0F, -4.0F, 4.0F, 4.0F, 2.0F, 0.25F, false);
			Phone.setTextureOffset(12, 6).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Phone.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.Phone.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Phone.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
