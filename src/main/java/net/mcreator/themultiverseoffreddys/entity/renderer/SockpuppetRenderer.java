
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

import net.mcreator.themultiverseoffreddys.entity.SockpuppetEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SockpuppetRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SockpuppetEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsockpuppet(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/sockpuppet.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelsockpuppet extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;

		public Modelsockpuppet() {
			textureWidth = 128;
			textureHeight = 128;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.6504F, -3.4769F);
			bone.setTextureOffset(0, 0).addBox(-5.0F, -8.6504F, -4.5231F, 10.0F, 9.0F, 16.0F, 0.0F, false);
			bone.setTextureOffset(0, 4).addBox(-4.0F, -6.6504F, -5.5231F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(1.0F, -6.6504F, -5.5231F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 25).addBox(-5.0F, 0.3496F, 1.4769F, 10.0F, 23.0F, 10.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 1.8496F, 2.4769F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.3054F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(36, 0).addBox(-5.0F, -1.5F, -7.0F, 10.0F, 3.0F, 9.0F, 0.0F, false);
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
