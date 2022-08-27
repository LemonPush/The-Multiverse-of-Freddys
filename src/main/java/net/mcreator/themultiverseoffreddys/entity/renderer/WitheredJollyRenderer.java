
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

import net.mcreator.themultiverseoffreddys.entity.WitheredJollyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WitheredJollyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WitheredJollyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelWithered_Jolly(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/withered_jolly.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelWithered_Jolly extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer bone2;
		private final ModelRenderer bone;
		private final ModelRenderer head2;
		private final ModelRenderer body;
		private final ModelRenderer body2;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm2;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg2;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_arm4;
		private final ModelRenderer left_leg;
		private final ModelRenderer left_leg4;

		public ModelWithered_Jolly() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.2817F, -0.0462F);
			head.setTextureOffset(23, 9).addBox(-4.0F, -8.7183F, -2.9538F, 8.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(-4.0F, -1.7183F, -2.9538F, 8.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(16, 36).addBox(-4.0F, -7.7183F, -2.9538F, 1.0F, 7.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(16, 50).addBox(-3.0F, -7.7183F, 3.0462F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 33).addBox(3.0F, -7.7183F, -2.9538F, 1.0F, 7.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(46, 9).addBox(-0.5F, -6.7183F, -3.9538F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(25, 40).addBox(3.0F, -6.7183F, -3.9538F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(2.5F, -6.7183F, -3.9538F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-3.5F, -6.7183F, -3.9538F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(25, 40).addBox(-4.0F, -6.7183F, -3.9538F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(18, 26).addBox(0.0F, -8.7183F, -3.9538F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 26).addBox(-4.0F, -8.7183F, -3.9538F, 4.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(0, 24).addBox(-3.0F, -14.7183F, -2.9538F, 6.0F, 3.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(26, 0).addBox(-2.5F, -11.7183F, -2.4538F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(2.5F, -8.2183F, -3.4538F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0873F, 0.0F, 0.0873F);
			head_r1.setTextureOffset(0, 16).addBox(-0.5F, -5.5F, -0.4F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-2.5F, -8.2183F, -3.4538F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0873F, 0.0F, -0.0873F);
			head_r2.setTextureOffset(26, 8).addBox(-0.5F, -5.5F, -0.4F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-16.0F, 18.2817F, 0.0462F);
			head.addChild(bone2);
			bone2.setTextureOffset(9, 33).addBox(13.0F, -23.0F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(23, 21).addBox(15.5F, -22.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(23, 21).addBox(14.5F, -22.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(23, 21).addBox(13.5F, -22.5F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(23, 21).addBox(16.5F, -22.5F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(0, 35).addBox(19.0F, -23.5F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(3, 21).addBox(20.0F, -22.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(3, 21).addBox(19.5F, -21.5F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(0, 28).addBox(18.5F, -21.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(48, 38).addBox(12.0F, -20.0F, -4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(0, 28).addBox(17.5F, -20.5F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(0, 28).addBox(12.0F, -20.5F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(0, 28).addBox(11.5F, -21.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(3, 21).addBox(11.5F, -21.5F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(3, 21).addBox(11.0F, -22.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(0, 33).addBox(11.0F, -23.5F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(3, 21).addBox(11.0F, -21.5F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(0, 28).addBox(11.0F, -21.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(0, 28).addBox(12.5F, -20.5F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			bone2.setTextureOffset(0, 28).addBox(18.0F, -20.5F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(0, 28).addBox(19.0F, -21.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(3, 21).addBox(20.0F, -21.5F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -1.7183F, 0.0462F);
			head.addChild(bone);
			head2 = new ModelRenderer(this);
			head2.setRotationPoint(-19.0F, 3.0591F, 0.6828F);
			head.addChild(head2);
			head2.setTextureOffset(24, 29).addBox(16.5F, -9.7774F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head2.setTextureOffset(24, 29).addBox(19.5F, -9.7774F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			head2.setTextureOffset(24, 26).addBox(16.5F, -10.4774F, -3.5366F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			head2.setTextureOffset(46, 9).addBox(17.0F, -6.0774F, -3.0366F, 4.0F, 2.0F, 5.0F, 0.25F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-4.5F, 0.5F, -2.0F, 9.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(18, 24).addBox(-0.5F, 1.1F, -2.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 47).addBox(-1.5F, 0.6F, -2.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(46, 31).addBox(0.5F, 0.6F, -2.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 24).addBox(4.0F, 1.5F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(23, 17).addBox(-5.0F, 1.5F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(41, 0).addBox(-1.0F, 8.5F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(22, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body2 = new ModelRenderer(this);
			body2.setRotationPoint(-19.0F, 0.7F, 0.0F);
			body.addChild(body2);
			body2.setTextureOffset(0, 55).addBox(18.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body2.setTextureOffset(32, 36).addBox(16.0F, 0.3F, -1.0F, 6.0F, 10.0F, 2.0F, 0.25F, false);
			body2.setTextureOffset(16, 39).addBox(16.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(25, 38).addBox(16.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(17, 37).addBox(16.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(15, 35).addBox(20.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(25, 36).addBox(20.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(0, 37).addBox(20.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(40, 17).addBox(15.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, 1.62F, 0.0F);
			right_arm.setTextureOffset(0, 47).addBox(-4.0F, 3.08F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(46, 0).addBox(-4.0F, -2.12F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(46, 31).addBox(-4.0F, 7.28F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm2 = new ModelRenderer(this);
			right_arm2.setRotationPoint(-19.0F, -0.77F, 0.0F);
			right_arm.addChild(right_arm2);
			right_arm2.setTextureOffset(50, 53).addBox(16.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			right_arm2.setTextureOffset(56, 40).addBox(16.0F, -0.7F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_arm2.setTextureOffset(9, 35).addBox(16.0F, 4.55F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.5F, 11.02F, -0.2F);
			right_leg.setTextureOffset(44, 44).addBox(-2.0F, 5.88F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(43, 22).addBox(-2.0F, 0.58F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(23, 17).addBox(-2.5F, 10.98F, -3.8F, 5.0F, 2.0F, 7.0F, 0.0F, false);
			right_leg2 = new ModelRenderer(this);
			right_leg2.setRotationPoint(-19.0F, 0.2717F, 0.0333F);
			right_leg.addChild(right_leg2);
			right_leg2.setTextureOffset(30, 48).addBox(18.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			right_leg2.setTextureOffset(38, 53).addBox(17.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_leg2.setTextureOffset(8, 55).addBox(18.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, 1.62F, 0.0F);
			left_arm.setTextureOffset(0, 47).addBox(0.0F, 3.08F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			left_arm.setTextureOffset(46, 0).addBox(0.0F, -2.12F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, true);
			left_arm.setTextureOffset(46, 31).addBox(0.0F, 7.28F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, true);
			left_arm4 = new ModelRenderer(this);
			left_arm4.setRotationPoint(19.0F, -0.77F, 0.0F);
			left_arm.addChild(left_arm4);
			left_arm4.setTextureOffset(50, 53).addBox(-18.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, true);
			left_arm4.setTextureOffset(56, 40).addBox(-18.0F, -0.7F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, true);
			left_arm4.setTextureOffset(9, 35).addBox(-18.0F, 4.55F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.5F, 11.02F, -0.2F);
			left_leg.setTextureOffset(44, 44).addBox(-2.0F, 5.88F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, true);
			left_leg.setTextureOffset(43, 22).addBox(-2.0F, 0.58F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, true);
			left_leg.setTextureOffset(23, 17).addBox(-2.5F, 10.98F, -3.8F, 5.0F, 2.0F, 7.0F, 0.0F, true);
			left_leg4 = new ModelRenderer(this);
			left_leg4.setRotationPoint(19.0F, 0.2717F, 0.0333F);
			left_leg.addChild(left_leg4);
			left_leg4.setTextureOffset(30, 48).addBox(-20.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			left_leg4.setTextureOffset(38, 53).addBox(-20.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, true);
			left_leg4.setTextureOffset(8, 55).addBox(-20.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
