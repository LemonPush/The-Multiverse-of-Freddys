
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

import net.mcreator.themultiverseoffreddys.entity.HighSchoolEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HighSchoolRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(HighSchoolEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelHighSchool(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/highschool.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelHighSchool extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_arm_r1;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm_r2;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelHighSchool() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-3.5F, -9.0F, -3.0F, 7.0F, 8.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(31, 0).addBox(-1.5F, -4.0F, -3.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 3).addBox(-1.0F, -3.5F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-2.5F, -6.7F, -3.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(0.5F, -6.7F, -3.3F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(17, 16).addBox(-2.5F, -7.7F, -3.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(17, 16).addBox(0.5F, -7.7F, -3.3F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(32, 29).addBox(-2.0F, -8.0F, 4.2F, 4.0F, 5.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(20, 0).addBox(-2.0F, -10.0F, 2.2F, 4.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(32, 4).addBox(-1.6F, -9.5F, 0.4F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-4.45F, -7.0F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, -0.4538F, 0.0F);
			head_r1.setTextureOffset(32, 4).addBox(1.85F, -2.5F, -3.6F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(32, 4).addBox(-1.15F, -3.0F, -3.6F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(34, 17).addBox(-2.15F, -1.0F, -3.6F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(18, 20).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 5.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(22, 17).addBox(-2.5F, 1.0F, -2.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(22, 10).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(8, 24).addBox(-1.0F, -5.4F, -0.6F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 14).addBox(-3.0F, 8.0F, -2.5F, 6.0F, 5.0F, 5.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.0F, 2.0F, 0.0F);
			left_arm_r1 = new ModelRenderer(this);
			left_arm_r1.setRotationPoint(-0.5F, 0.0F, 0.0F);
			left_arm.addChild(left_arm_r1);
			setRotationAngle(left_arm_r1, 0.0F, 0.0F, -0.3491F);
			left_arm_r1.setTextureOffset(16, 29).addBox(0.0F, -1.3F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.0F, 2.0F, 0.0F);
			left_arm_r2 = new ModelRenderer(this);
			left_arm_r2.setRotationPoint(0.5F, 0.0F, 0.0F);
			right_arm.addChild(left_arm_r2);
			setRotationAngle(left_arm_r2, 0.0F, 0.0F, 0.3491F);
			left_arm_r2.setTextureOffset(0, 24).addBox(-2.0F, -1.3F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(1.7F, 11.75F, -0.25F);
			left_leg.setTextureOffset(24, 29).addBox(-1.0F, -0.75F, -0.75F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(34, 9).addBox(-1.0F, 10.25F, -1.75F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-1.7F, 11.75F, -0.25F);
			right_leg.setTextureOffset(24, 29).addBox(-1.0F, -0.75F, -0.75F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(34, 9).addBox(-1.0F, 10.25F, -1.75F, 2.0F, 2.0F, 3.0F, 0.0F, true);
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
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
