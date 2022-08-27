
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

import net.mcreator.themultiverseoffreddys.entity.NoAiRockstarChicaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NoAiRockstarChicaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NoAiRockstarChicaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelRockstarChica(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/rockstarchica.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelRockstarChica extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelRockstarChica() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 17).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(24, 22).addBox(-4.0F, -9.4F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(10, 118).addBox(3.5F, -10.4F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(18, 31).addBox(-3.0F, -9.4F, -6.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(55, 0).addBox(-2.0F, -9.4F, -7.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(25, 0).addBox(-1.5F, -10.4F, -7.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 34).addBox(-2.5F, -10.4F, -6.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(44, 58).addBox(-1.0F, -10.7F, -6.6F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(24, 18).addBox(-3.0F, -7.0F, -6.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(58, 47).addBox(-2.0F, -7.0F, -7.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(48, 8).addBox(2.9F, -9.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 41).addBox(2.9F, -9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-3.9F, -9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 40).addBox(-3.9F, -9.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 9).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(110, 119).addBox(3.5F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(10, 118).addBox(-4.5F, -10.4F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, true);
			head.setTextureOffset(110, 119).addBox(-4.5F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, true);
			head.setTextureOffset(87, 6).addBox(-3.0F, -8.4F, -6.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(85, 0).addBox(-3.0F, -8.0F, -6.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 62).addBox(0.7F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(6, 62).addBox(-2.7F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(70, 0).addBox(-2.7F, -13.7F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(70, 7).addBox(0.7F, -13.7F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(1.0F, -12.8F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.3927F);
			head_r1.setTextureOffset(69, 55).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-1.0F, -13.0F, 0.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, -1.5708F, -1.2654F, 1.5708F);
			head_r2.setTextureOffset(84, 53).addBox(0.5F, -3.2F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-1.0F, -13.0F, 0.0F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 1.5708F, -1.2654F, -1.5708F);
			head_r3.setTextureOffset(84, 53).addBox(-1.5F, -3.2F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-1.0F, -12.8F, 0.0F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, -0.3927F);
			head_r4.setTextureOffset(83, 55).addBox(-0.5F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(30, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-5.0F, -6.5F, -2.5F, 10.0F, 12.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 40).addBox(-4.0F, -6.5F, -2.75F, 8.0F, 11.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 62).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(56, 61).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(60, 3).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 17).addBox(-1.0F, -10.0F, -0.8F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.7F, -5.0F, 0.0F);
			right_arm.setTextureOffset(0, 52).addBox(-5.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(48, 8).addBox(-5.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(30, 41).addBox(-4.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(24, 21).addBox(-4.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(52, 28).addBox(-5.0F, 9.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.7F, -5.0F, 0.0F);
			left_arm.setTextureOffset(48, 18).addBox(1.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(16, 52).addBox(1.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 33).addBox(2.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 30).addBox(2.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(32, 54).addBox(1.0F, 9.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.0F, 7.6F, -0.2F);
			right_leg.setTextureOffset(50, 37).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(52, 58).addBox(-2.0F, 7.15F, -2.3F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(34, 41).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(60, 9).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(44, 31).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(26, 31).addBox(-2.5F, 14.4F, -4.8F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.0F, 7.6F, -0.2F);
			left_leg.setTextureOffset(46, 48).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(18, 41).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(60, 6).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(12, 52).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 30).addBox(-2.5F, 14.4F, -4.8F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			left_leg.setTextureOffset(44, 36).addBox(-2.0F, 7.15F, -2.3F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
