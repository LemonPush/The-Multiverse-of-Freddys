
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

import net.mcreator.themultiverseoffreddys.entity.BlackRabbitEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BlackRabbitRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BlackRabbitEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBlackRabbit(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/blackrabbit.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBlackRabbit extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg_r1;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg_r2;

		public ModelBlackRabbit() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -4.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -17.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(50, 22).addBox(-3.5F, -9.0F, -5.8F, 7.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(55, 9).addBox(-3.5F, -10.0F, -5.8F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(25, 18).addBox(-3.5F, -11.0F, -5.8F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 55).addBox(-3.5F, -13.0F, -5.8F, 7.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(55, 12).addBox(-3.0F, -13.5F, -5.5F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(19, 27).addBox(-0.5F, -14.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(28, 46).addBox(3.5F, -12.0F, -4.5F, 2.0F, 2.0F, 1.0F, -0.25F, false);
			head.setTextureOffset(0, 31).addBox(-5.5F, -12.0F, -4.5F, 2.0F, 2.0F, 1.0F, -0.25F, false);
			head.setTextureOffset(58, 54).addBox(-2.7F, -15.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(38, 57).addBox(0.7F, -15.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(43, 10).addBox(-5.5F, -13.0F, -4.0F, 2.0F, 4.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(36, 32).addBox(3.5F, -13.0F, -4.0F, 2.0F, 4.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-2.0F, -17.0235F, -0.3248F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.1309F, 0.0F, -0.1745F);
			head_r1.setTextureOffset(0, 19).addBox(-0.5F, -5.8765F, -0.1752F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(11, 27).addBox(-1.5F, -4.6765F, -0.5752F, 3.0F, 4.0F, 2.0F, 0.25F, false);
			head_r1.setTextureOffset(0, 16).addBox(-0.5F, -0.8765F, -0.1752F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-2.0F, -17.0235F, -0.3248F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.5236F, 0.0F, -0.1745F);
			head_r2.setTextureOffset(12, 45).addBox(-1.0F, -9.2677F, 1.6361F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			head_r2.setTextureOffset(29, 34).addBox(-1.5F, -8.2677F, 1.6361F, 3.0F, 3.0F, 2.0F, 0.25F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(2.0F, -17.0235F, -0.3248F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.1309F, 0.0F, 0.1745F);
			head_r3.setTextureOffset(24, 3).addBox(-0.5F, -5.8765F, -0.1752F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r3.setTextureOffset(18, 56).addBox(-1.5F, -4.6765F, -0.5752F, 3.0F, 4.0F, 2.0F, 0.25F, false);
			head_r3.setTextureOffset(24, 0).addBox(-0.5F, -0.8765F, -0.1752F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(2.0F, -17.0235F, -0.3248F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.5236F, 0.0F, 0.1745F);
			head_r4.setTextureOffset(49, 0).addBox(-1.0F, -9.2677F, 1.6361F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			head_r4.setTextureOffset(28, 57).addBox(-1.5F, -8.2677F, 1.6361F, 3.0F, 3.0F, 2.0F, 0.25F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 3.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.25F, false);
			body.setTextureOffset(43, 8).addBox(-1.0F, 4.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, -9.0F, -2.5F, 10.0F, 6.0F, 5.0F, 0.25F, false);
			body.setTextureOffset(0, 27).addBox(-5.3F, -9.0F, -3.5F, 2.0F, 11.0F, 7.0F, 0.25F, false);
			body.setTextureOffset(34, 44).addBox(-3.1F, -9.0F, 1.5F, 6.0F, 11.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(0, 27).addBox(3.3F, -9.0F, -3.5F, 2.0F, 11.0F, 7.0F, 0.25F, false);
			body.setTextureOffset(18, 32).addBox(2.3F, -5.0F, -3.5F, 2.0F, 7.0F, 7.0F, 0.25F, false);
			body.setTextureOffset(18, 32).addBox(-4.3F, -5.0F, -3.5F, 2.0F, 7.0F, 7.0F, 0.25F, true);
			body.setTextureOffset(25, 22).addBox(-5.0F, -3.0F, -2.5F, 10.0F, 5.0F, 5.0F, 0.5F, false);
			body.setTextureOffset(48, 32).addBox(-4.0F, -6.0F, -3.5F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(55, 26).addBox(-3.5F, -7.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(55, 15).addBox(-3.5F, 1.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(29, 32).addBox(-3.0F, -8.0F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(56, 40).addBox(-1.0F, -8.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 33).addBox(1.0F, -9.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 27).addBox(-3.0F, -9.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(55, 28).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-7.0F, -6.0F, 0.0F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.3491F);
			right_arm.setTextureOffset(0, 45).addBox(-5.684F, -3.8794F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, true);
			right_arm.setTextureOffset(0, 0).addBox(-4.684F, 2.1206F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-3.0F, 4.25F, 0.0F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -0.8727F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(46, 54).addBox(-2.684F, 5.542F, -3.4397F, 4.0F, 4.0F, 4.0F, 0.25F, true);
			right_arm_r1.setTextureOffset(43, 12).addBox(-1.684F, 4.542F, -2.4397F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_arm_r1.setTextureOffset(54, 0).addBox(-2.684F, -0.458F, -3.4397F, 4.0F, 5.0F, 4.0F, 0.25F, true);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(7.0F, -6.0F, 0.0F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.3491F);
			left_arm.setTextureOffset(0, 45).addBox(1.684F, -3.8794F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			left_arm.setTextureOffset(0, 0).addBox(2.684F, 2.1206F, -1.3F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(3.0F, 4.25F, 0.0F);
			left_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -0.8727F, 0.0F, 0.0F);
			right_arm_r2.setTextureOffset(46, 54).addBox(-1.316F, 5.542F, -3.4397F, 4.0F, 4.0F, 4.0F, 0.25F, false);
			right_arm_r2.setTextureOffset(43, 12).addBox(-0.316F, 4.542F, -2.4397F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(54, 0).addBox(-1.316F, -0.458F, -3.4397F, 4.0F, 5.0F, 4.0F, 0.25F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 7.0F, 0.0F);
			setRotationAngle(left_leg, -0.3442F, -0.0594F, -0.1642F);
			left_leg.setTextureOffset(16, 46).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			right_leg_r1 = new ModelRenderer(this);
			right_leg_r1.setRotationPoint(-0.1F, 7.45F, -0.5F);
			left_leg.addChild(right_leg_r1);
			setRotationAngle(right_leg_r1, 0.9599F, 0.0F, 0.0F);
			right_leg_r1.setTextureOffset(25, 8).addBox(-2.5F, 6.75F, -4.5F, 5.0F, 2.0F, 8.0F, 0.25F, false);
			right_leg_r1.setTextureOffset(0, 4).addBox(-1.0F, -1.25F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg_r1.setTextureOffset(50, 44).addBox(-2.0F, 0.75F, -1.5F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 7.0F, 0.0F);
			setRotationAngle(right_leg, -0.3442F, 0.0594F, 0.1642F);
			right_leg.setTextureOffset(16, 46).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, true);
			right_leg_r2 = new ModelRenderer(this);
			right_leg_r2.setRotationPoint(0.1F, 7.45F, -0.5F);
			right_leg.addChild(right_leg_r2);
			setRotationAngle(right_leg_r2, 0.9599F, 0.0F, 0.0F);
			right_leg_r2.setTextureOffset(25, 8).addBox(-2.5F, 6.75F, -4.5F, 5.0F, 2.0F, 8.0F, 0.25F, true);
			right_leg_r2.setTextureOffset(0, 4).addBox(-1.0F, -1.25F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			right_leg_r2.setTextureOffset(50, 44).addBox(-2.0F, 0.75F, -1.5F, 4.0F, 6.0F, 4.0F, 0.25F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
		}
	}

}
