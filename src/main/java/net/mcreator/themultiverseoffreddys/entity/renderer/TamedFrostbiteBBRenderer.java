
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

import net.mcreator.themultiverseoffreddys.entity.TamedFrostbiteBBEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedFrostbiteBBRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedFrostbiteBBEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelFrostbite_Balloon_Boy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/frostbite_balloon_boy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFrostbite_Balloon_Boy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelFrostbite_Balloon_Boy() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 9.0F, 0.0F);
			head.setTextureOffset(0, 23).addBox(-3.5F, -9.0F, -3.0F, 7.0F, 7.0F, 7.0F, 0.1F, false);
			head.setTextureOffset(10, 10).addBox(-2.5F, -6.7F, -3.4F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(4, 10).addBox(0.5F, -6.7F, -3.4F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(21, 33).addBox(-3.5F, -9.0F, -3.0F, 7.0F, 2.0F, 7.0F, 0.2F, false);
			head.setTextureOffset(0, 10).addBox(0.5F, -13.0F, 0.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 0).addBox(-1.5F, -11.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-3.5F, -11.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 14).addBox(-3.5F, -6.6F, -1.0F, 7.0F, 3.0F, 5.0F, 0.2F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(28, 23).addBox(-4.5F, 8.0F, -3.0F, 9.0F, 4.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 37).addBox(-4.5F, 12.0F, -3.0F, 7.0F, 4.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(50, 52).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.0F, 11.0F, -1.0F);
			setRotationAngle(right_arm, -1.5272F, 0.6109F, 0.0F);
			right_arm.setTextureOffset(0, 0).addBox(-3.5F, 4.0F, -12.0F, 1.0F, 1.0F, 16.0F, 0.0F, false);
			right_arm.setTextureOffset(18, 0).addBox(-6.5F, 1.0F, -19.0F, 7.0F, 7.0F, 7.0F, 0.0F, false);
			right_arm.setTextureOffset(39, 0).addBox(-8.5F, 4.0F, -16.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(39, 0).addBox(-8.5F, 6.0F, -18.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(39, 0).addBox(-8.5F, 6.0F, -14.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(39, 0).addBox(-8.5F, 2.0F, -14.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(39, 0).addBox(-8.5F, 2.0F, -18.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 47).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(16, 51).addBox(-4.5F, 2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-3.0F, 4.5F, -15.5F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 1.5708F, -1.5708F);
			right_arm_r1.setTextureOffset(39, 0).addBox(-5.5F, -2.5F, -2.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(39, 0).addBox(-5.5F, 1.5F, -2.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(39, 0).addBox(-5.5F, 1.5F, 1.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(39, 0).addBox(-5.5F, -0.5F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(39, 0).addBox(-5.5F, -2.5F, 1.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.0F, 4.5F, -15.5F);
			right_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, -1.5708F);
			right_arm_r2.setTextureOffset(39, 0).addBox(-5.5F, -2.5F, -2.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(39, 0).addBox(-5.5F, 1.5F, -2.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(39, 0).addBox(-5.5F, 1.5F, 1.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(39, 0).addBox(-5.5F, -0.5F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(39, 0).addBox(-5.5F, -2.5F, 1.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.0F, 11.0F, -2.0F);
			setRotationAngle(left_arm, -1.5708F, -0.6109F, 0.0F);
			left_arm.setTextureOffset(32, 44).addBox(2.5F, 4.0F, -3.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 17).addBox(-4.0F, 3.5F, -7.0F, 14.0F, 2.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(43, 44).addBox(1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(52, 22).addBox(1.5F, 2.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.1F, 16.0F, 0.0F);
			right_leg.setTextureOffset(46, 2).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(42, 35).addBox(-1.9F, 6.0F, -5.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.1F, 16.0F, 0.0F);
			left_leg.setTextureOffset(0, 0).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(19, 42).addBox(-2.1F, 6.0F, -5.0F, 4.0F, 2.0F, 7.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
