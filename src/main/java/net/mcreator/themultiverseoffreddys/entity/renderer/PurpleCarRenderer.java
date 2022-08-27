
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

import net.mcreator.themultiverseoffreddys.entity.PurpleCarEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PurpleCarRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PurpleCarEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPurpleCar(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/purplecar.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelPurpleCar extends EntityModel<Entity> {
		private final ModelRenderer car;
		private final ModelRenderer cube_r1;

		public ModelPurpleCar() {
			textureWidth = 256;
			textureHeight = 256;
			car = new ModelRenderer(this);
			car.setRotationPoint(0.037F, 17.0099F, -5.8836F);
			car.setTextureOffset(92, 0).addBox(-6.037F, -4.0099F, -2.1164F, 12.0F, 4.0F, 19.0F, 0.0F, false);
			car.setTextureOffset(88, 86).addBox(-15.037F, -0.0099F, -9.1164F, 30.0F, 3.0F, 32.0F, 0.0F, false);
			car.setTextureOffset(0, 118).addBox(-15.037F, -16.0099F, 22.8836F, 30.0F, 20.0F, 22.0F, 0.0F, false);
			car.setTextureOffset(0, 68).addBox(-15.037F, -16.0099F, -39.1164F, 30.0F, 20.0F, 30.0F, 0.0F, false);
			car.setTextureOffset(124, 133).addBox(-19.037F, -5.0099F, -26.1164F, 4.0F, 12.0F, 12.0F, 0.0F, false);
			car.setTextureOffset(104, 121).addBox(14.963F, -5.0099F, 24.8836F, 4.0F, 12.0F, 12.0F, 0.0F, false);
			car.setTextureOffset(0, 0).addBox(-19.037F, -5.0099F, 24.8836F, 4.0F, 12.0F, 12.0F, 0.0F, false);
			car.setTextureOffset(124, 23).addBox(14.963F, -5.0099F, -26.1164F, 4.0F, 12.0F, 12.0F, 0.0F, false);
			car.setTextureOffset(0, 0).addBox(-15.037F, -32.0099F, -9.1164F, 30.0F, 36.0F, 32.0F, 0.0F, false);
			car.setTextureOffset(90, 75).addBox(-15.037F, -0.0099F, -42.1164F, 30.0F, 4.0F, 3.0F, 0.0F, false);
			car.setTextureOffset(90, 68).addBox(-15.037F, -0.0099F, 44.8836F, 30.0F, 4.0F, 3.0F, 0.0F, false);
			car.setTextureOffset(0, 87).addBox(-15.037F, -11.0099F, -40.1164F, 8.0F, 6.0F, 1.0F, 0.0F, false);
			car.setTextureOffset(0, 24).addBox(6.963F, -11.0099F, -40.1164F, 8.0F, 6.0F, 1.0F, 0.0F, false);
			car.setTextureOffset(92, 0).addBox(-15.037F, -4.0099F, 44.8836F, 8.0F, 4.0F, 1.0F, 0.0F, false);
			car.setTextureOffset(92, 5).addBox(6.963F, -4.0099F, 44.8836F, 8.0F, 4.0F, 1.0F, 0.0F, false);
			car.setTextureOffset(90, 82).addBox(-15.037F, -9.0099F, 44.8836F, 8.0F, 5.0F, 1.0F, 0.0F, false);
			car.setTextureOffset(90, 88).addBox(6.963F, -9.0099F, 44.8836F, 8.0F, 5.0F, 1.0F, 0.0F, false);
			car.setTextureOffset(0, 68).addBox(-1.037F, -16.0099F, -9.1164F, 3.0F, 2.0F, 8.0F, 0.0F, false);
			car.setTextureOffset(0, 78).addBox(-3.037F, -18.5099F, -1.1164F, 7.0F, 7.0F, 2.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-0.037F, 2.7401F, 14.8836F);
			car.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.0873F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(124, 47).addBox(-6.0F, -21.75F, -2.0F, 12.0F, 16.0F, 4.0F, 0.0F, false);
			cube_r1.setTextureOffset(135, 0).addBox(-7.0F, -30.75F, -2.0F, 14.0F, 9.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			car.render(matrixStack, buffer, packedLight, packedOverlay);
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
