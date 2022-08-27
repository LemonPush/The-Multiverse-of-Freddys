
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

import net.mcreator.themultiverseoffreddys.entity.GraveweedEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GraveweedRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GraveweedEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelGraveweed(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/graveweed.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelGraveweed extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer bone;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;

		public ModelGraveweed() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 8.0572F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-2.0F, 4.7857F, 0.0F);
			head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -1.0908F);
			cube_r1.setTextureOffset(0, 15).addBox(13.4775F, -12.9633F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, true);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-2.0F, 4.7857F, 0.0F);
			head.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 0.48F);
			cube_r2.setTextureOffset(0, 15).addBox(-17.4775F, -12.9633F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-2.0F, 4.7857F, 0.0F);
			head.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3054F);
			cube_r3.setTextureOffset(38, 20).addBox(-5.0F, -18.7429F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 8.7857F, 0.0F);
			head.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 1.1345F);
			cube_r4.setTextureOffset(0, 15).addBox(-17.4775F, -12.9633F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, 8.7857F, 0.0F);
			head.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, -0.4363F);
			cube_r5.setTextureOffset(0, 15).addBox(13.4775F, -12.9633F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, true);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 8.7857F, 0.0F);
			head.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3491F);
			cube_r6.setTextureOffset(38, 20).addBox(-5.0F, -18.7429F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.setTextureOffset(0, 0).addBox(-6.5F, -5.0F, -6.5F, 13.0F, 2.0F, 13.0F, 0.0F, false);
			bone.setTextureOffset(0, 30).addBox(-6.0F, -7.0F, -6.0F, 12.0F, 2.0F, 12.0F, 0.0F, false);
			bone.setTextureOffset(0, 15).addBox(-6.0F, -3.0F, -6.0F, 12.0F, 3.0F, 12.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-2.0F, -11.1571F, 0.0F);
			bone.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3054F);
			cube_r7.setTextureOffset(42, 40).addBox(-3.0F, 0.2571F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);
			cube_r7.setTextureOffset(42, 40).addBox(-3.0F, -8.7429F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, -7.1571F, 0.0F);
			bone.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3491F);
			cube_r8.setTextureOffset(42, 40).addBox(-3.0F, -8.7429F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-4.0F, -8.5F, 0.0F);
			bone.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, -1.0908F);
			cube_r9.setTextureOffset(0, 0).addBox(-1.0F, -7.5F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, true);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(4.0F, -8.5F, 0.0F);
			bone.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.0F, 0.0F, 1.2217F);
			cube_r10.setTextureOffset(0, 0).addBox(-2.0F, -7.5F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
