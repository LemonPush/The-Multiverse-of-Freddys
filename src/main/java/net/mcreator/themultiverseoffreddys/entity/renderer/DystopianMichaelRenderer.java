
package net.mcreator.themultiverseoffreddys.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.themultiverseoffreddys.entity.DystopianMichaelEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DystopianMichaelRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DystopianMichaelEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelDystopian_Michael(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/dystopian_michael.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelDystopian_Michael extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer mask;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer body;
		private final ModelRenderer coat;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		private final ModelRenderer cube_r5;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelDystopian_Michael() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.9774F, 0.0366F);
			head.setTextureOffset(18, 31).addBox(-0.5F, -1.9774F, -0.5366F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 25).addBox(-2.5F, -7.7274F, -3.9866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(9, 30).addBox(0.5F, -7.7274F, -3.9866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-2.5F, -8.4774F, -3.5366F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			head.setTextureOffset(16, 0).addBox(-3.5F, -9.4774F, -1.3366F, 7.0F, 1.0F, 4.0F, 0.25F, false);
			head.setTextureOffset(34, 35).addBox(2.5F, -8.4774F, -1.3366F, 1.0F, 7.0F, 4.0F, 0.25F, false);
			head.setTextureOffset(22, 31).addBox(-3.5F, -8.4774F, 1.6634F, 7.0F, 7.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(34, 35).addBox(-3.5F, -8.4774F, -1.3366F, 1.0F, 7.0F, 4.0F, 0.25F, true);
			head.setTextureOffset(16, 10).addBox(-2.5F, -3.9774F, -3.0366F, 5.0F, 2.0F, 5.0F, 0.25F, false);
			mask = new ModelRenderer(this);
			mask.setRotationPoint(0.0F, 2.0F, 1.0F);
			head.addChild(mask);
			mask.setTextureOffset(34, 0).addBox(-3.5F, -7.6774F, -7.0366F, 7.0F, 2.0F, 2.0F, 0.0F, false);
			mask.setTextureOffset(31, 10).addBox(-3.5F, -5.6774F, -6.7866F, 7.0F, 2.0F, 2.0F, 0.0F, false);
			mask.setTextureOffset(42, 8).addBox(-3.5F, -10.6774F, -5.0366F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			mask.setTextureOffset(52, 10).addBox(-3.5F, -10.6774F, -4.0366F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			mask.setTextureOffset(16, 0).addBox(-3.5F, -9.6774F, -5.0366F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			mask.setTextureOffset(30, 23).addBox(-3.5F, -11.6774F, -5.0366F, 7.0F, 1.0F, 3.0F, 0.0F, false);
			mask.setTextureOffset(16, 0).addBox(2.5F, -9.6774F, -5.0366F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			mask.setTextureOffset(40, 35).addBox(-0.5F, -8.6774F, -7.0366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			mask.setTextureOffset(38, 31).addBox(-0.5F, -12.6774F, -4.0366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			mask.setTextureOffset(52, 10).addBox(2.5F, -10.6774F, -4.0366F, 1.0F, 7.0F, 2.0F, 0.0F, true);
			mask.setTextureOffset(16, 10).addBox(-3.5F, -7.6774F, -5.0366F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			mask.setTextureOffset(16, 10).addBox(2.5F, -7.6774F, -5.0366F, 1.0F, 4.0F, 1.0F, 0.0F, true);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(1.0F, -12.1774F, -3.5366F);
			mask.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.5672F);
			cube_r1.setTextureOffset(38, 31).addBox(-0.3F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-1.0F, -12.1774F, -3.5366F);
			mask.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.5672F);
			cube_r2.setTextureOffset(38, 31).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(2.5F, -10.6774F, -3.0366F);
			mask.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
			cube_r3.setTextureOffset(0, 4).addBox(1.25F, 0.45F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r3.setTextureOffset(12, 23).addBox(0.0F, -1.05F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, true);
			cube_r3.setTextureOffset(0, 4).addBox(1.25F, -1.55F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-2.5F, -10.6774F, -3.0366F);
			mask.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
			cube_r4.setTextureOffset(0, 4).addBox(-3.25F, -1.55F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4.setTextureOffset(0, 4).addBox(-3.25F, 0.45F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4.setTextureOffset(12, 23).addBox(-4.0F, -1.05F, -1.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(16, 46).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(16, 17).addBox(-3.5F, 0.0F, -1.5F, 7.0F, 3.0F, 3.0F, 0.25F, false);
			body.setTextureOffset(36, 14).addBox(-3.0F, 3.5F, -1.0F, 6.0F, 4.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(39, 4).addBox(-3.0F, 8.0F, -1.0F, 6.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(48, 30).addBox(-3.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(28, 48).addBox(-3.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(47, 10).addBox(-3.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 29).addBox(1.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(6, 43).addBox(1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(44, 40).addBox(1.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 20).addBox(1.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 26).addBox(-5.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(22, 5).addBox(-3.5F, 9.6F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			coat = new ModelRenderer(this);
			coat.setRotationPoint(0.5F, 3.0F, 2.0F);
			body.addChild(coat);
			coat.setTextureOffset(0, 10).addBox(-4.0F, -3.7F, -1.0F, 7.0F, 11.0F, 1.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(-1.0F, 0.0F, 0.0F);
			coat.addChild(bone);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
			coat.addChild(bone2);
			bone2.setTextureOffset(12, 30).addBox(2.3F, -3.7F, -4.0F, 1.0F, 11.0F, 4.0F, 0.0F, false);
			bone2.setTextureOffset(30, 46).addBox(2.3F, 7.3F, -4.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			bone2.setTextureOffset(44, 35).addBox(-3.5F, 7.3F, -1.0F, 6.0F, 4.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(30, 46).addBox(-4.3F, 7.3F, -4.0F, 1.0F, 4.0F, 4.0F, 0.0F, true);
			bone2.setTextureOffset(12, 30).addBox(-4.3F, -3.7F, -4.0F, 1.0F, 11.0F, 4.0F, 0.0F, true);
			bone2.setTextureOffset(30, 27).addBox(-4.39F, 5.0F, -0.7F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(30, 27).addBox(-4.39F, 5.0F, -4.3F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(49, 47).addBox(3.31F, 4.5F, -4.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			bone2.setTextureOffset(40, 51).addBox(0.0F, -0.7F, -4.0F, 3.0F, 8.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(50, 20).addBox(-4.0F, -1.7F, -4.0F, 3.0F, 9.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(36, 54).addBox(-1.0F, 0.3F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(0, 22).addBox(-4.0F, -3.7F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(0, 0).addBox(1.0F, -3.7F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-3.8F, 1.8F, 0.5F);
			bone2.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, -0.6109F);
			cube_r5.setTextureOffset(24, 48).addBox(2.41F, -4.3F, -1.2F, 1.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r5.setTextureOffset(24, 48).addBox(2.41F, -4.3F, -4.8F, 1.0F, 11.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.5F, 0.85F, 0.0F);
			left_arm.setTextureOffset(8, 45).addBox(1.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(48, 54).addBox(1.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(0, 30).addBox(0.5F, -1.6F, -1.5F, 3.0F, 10.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(28, 54).addBox(1.0F, 4.15F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(55, 46).addBox(1.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.5F, 0.85F, 0.0F);
			right_arm.setTextureOffset(8, 45).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 30).addBox(-3.5F, -1.6F, -1.5F, 3.0F, 10.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(53, 0).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(50, 40).addBox(-3.0F, 4.15F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(52, 30).addBox(-3.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(0, 43).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			left_leg.setTextureOffset(22, 39).addBox(-1.5F, 0.2583F, -1.3333F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(41, 43).addBox(-1.5F, 6.2583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(18, 23).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, false);
			left_leg.setTextureOffset(38, 29).addBox(-1.5F, 8.7083F, -1.8333F, 3.0F, 2.0F, 4.0F, 0.25F, false);
			left_leg.setTextureOffset(0, 56).addBox(-1.5F, 4.2583F, -1.8333F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(0, 43).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(38, 29).addBox(-1.5F, 8.7083F, -1.8333F, 3.0F, 2.0F, 4.0F, 0.25F, false);
			right_leg.setTextureOffset(22, 39).addBox(-1.5F, 0.2583F, -1.3333F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 56).addBox(-1.5F, 4.2583F, -1.8333F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(41, 43).addBox(-1.5F, 6.2583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 22).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
