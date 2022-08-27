
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

import net.mcreator.themultiverseoffreddys.entity.TamedBonnetEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedBonnetRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedBonnetEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBonnet(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/bonnet.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.0
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBonnet extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer head;
		private final ModelRenderer cube_r3;

		public ModelBonnet() {
			textureWidth = 64;
			textureHeight = 64;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.setTextureOffset(0, 0).addBox(-3.5F, -8.0F, -2.5F, 7.0F, 8.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(12, 28).addBox(-1.5F, -9.0F, -0.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(27, 14).addBox(-3.0F, -7.9F, -2.8F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 3).addBox(0.5F, -7.8F, -3.1F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 17).addBox(-0.5F, -5.5F, -3.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 3).addBox(-2.5F, -7.8F, -3.1F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(3, 18).addBox(-0.5F, -7.3F, -3.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-3.5F, -7.5F, 1.0F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.9599F);
			cube_r1.setTextureOffset(0, 28).addBox(-0.2F, 2.6F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
			cube_r1.setTextureOffset(0, 28).addBox(-0.2F, -0.6F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
			cube_r1.setTextureOffset(28, 11).addBox(0.3F, 5.6F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			cube_r1.setTextureOffset(25, 25).addBox(-0.2F, 5.8F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
			cube_r1.setTextureOffset(28, 11).addBox(0.3F, 2.1F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(3.5F, -7.5F, 1.0F);
			bone.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.9599F);
			cube_r2.setTextureOffset(28, 11).addBox(-2.3F, 2.1F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r2.setTextureOffset(0, 28).addBox(-2.8F, 2.6F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r2.setTextureOffset(25, 25).addBox(-2.8F, 5.8F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r2.setTextureOffset(28, 11).addBox(-2.3F, 5.6F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r2.setTextureOffset(0, 28).addBox(-2.8F, -0.6F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 18.3F, 0.0F);
			head.setTextureOffset(21, 0).addBox(-3.5F, -5.5F, -4.5F, 7.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 17).addBox(-0.5F, -6.0F, -4.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-2.8F, -7.9F, -3.1F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(0.8F, -7.9F, -3.1F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-3.5F, -8.5F, -2.5F, 7.0F, 6.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(28, 5).addBox(-3.5F, -11.5F, -0.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(28, 5).addBox(0.5F, -11.5F, -0.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
			head.setTextureOffset(0, 15).addBox(-3.0F, -12.5F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(1.0F, -12.5F, 0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(2.0F, -11.5F, 1.0F);
			head.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(28, 5).addBox(-1.5F, -3.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
			cube_r3.setTextureOffset(28, 5).addBox(-5.5F, -3.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
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
