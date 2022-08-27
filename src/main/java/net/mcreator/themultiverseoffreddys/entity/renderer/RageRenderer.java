
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

import net.mcreator.themultiverseoffreddys.entity.RageEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RageRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RageEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelRage_Quit(), 0.6f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/rage_quit.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelRage_Quit extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer arm;
		private final ModelRenderer lower_arm_left;
		private final ModelRenderer Steel_Wool;
		private final ModelRenderer left_leg_r1;
		private final ModelRenderer upper_arm_left;
		private final ModelRenderer right_arm;
		private final ModelRenderer arm2;
		private final ModelRenderer lower_arm_right;
		private final ModelRenderer Illumix;
		private final ModelRenderer left_leg_r2;
		private final ModelRenderer upper_arm_right;
		private final ModelRenderer left_leg;
		private final ModelRenderer leg;
		private final ModelRenderer bone;
		private final ModelRenderer right_leg;
		private final ModelRenderer leg2;
		private final ModelRenderer bone2;

		public ModelRage_Quit() {
			textureWidth = 256;
			textureHeight = 256;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -33.0F, 5.6F);
			head.setTextureOffset(0, 24).addBox(-6.0F, -13.0F, -6.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
			head.setTextureOffset(0, 63).addBox(6.0F, -6.8F, -1.7F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 63).addBox(6.0F, -10.2F, -1.7F, 7.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 63).addBox(-13.0F, -10.2F, -1.7F, 7.0F, 3.0F, 3.0F, 0.0F, true);
			head.setTextureOffset(0, 63).addBox(-13.0F, -6.8F, -1.7F, 7.0F, 3.0F, 3.0F, 0.0F, true);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-2.8015F, -11.0964F, -5.6F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.3927F);
			head_r1.setTextureOffset(6, 6).addBox(-1.5F, 0.3F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(2.8015F, -11.0964F, -5.6F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, -0.3927F);
			head_r2.setTextureOffset(6, 6).addBox(-2.5F, 0.3F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-10.0F, -7.1F, -0.2F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, 1.5708F);
			head_r3.setTextureOffset(0, 63).addBox(-13.0F, -8.0F, -1.5F, 7.0F, 3.0F, 3.0F, 0.0F, true);
			head_r3.setTextureOffset(0, 63).addBox(-13.0F, -11.5F, -1.5F, 7.0F, 3.0F, 3.0F, 0.0F, true);
			head_r3.setTextureOffset(0, 63).addBox(-13.0F, -15.0F, -1.5F, 7.0F, 3.0F, 3.0F, 0.0F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(92, 77).addBox(-10.0F, -33.0F, -2.4F, 20.0F, 18.0F, 16.0F, 0.0F, false);
			body.setTextureOffset(67, 45).addBox(-11.0F, -34.0F, 12.6F, 22.0F, 5.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(20, 109).addBox(7.0F, -34.0F, -2.4F, 3.0F, 1.0F, 15.0F, 0.0F, false);
			body.setTextureOffset(20, 109).addBox(-10.0F, -34.0F, -2.4F, 3.0F, 1.0F, 15.0F, 0.0F, false);
			body.setTextureOffset(8, 8).addBox(-10.0F, -34.0F, -3.4F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(8, 8).addBox(7.0F, -34.0F, -3.4F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(81, 73).addBox(-8.0F, -32.0F, -3.4F, 16.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 48).addBox(-13.0F, -29.0F, 12.6F, 26.0F, 6.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(67, 0).addBox(-15.0F, -23.0F, 12.6F, 30.0F, 43.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 93).addBox(-9.5F, -15.0F, 1.6F, 19.0F, 8.0F, 8.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(9.3886F, -30.3086F, 5.2514F);
			arm = new ModelRenderer(this);
			arm.setRotationPoint(0.0F, 0.0F, 0.0F);
			left_arm.addChild(arm);
			setRotationAngle(arm, -2.7517F, -0.0974F, 2.6674F);
			lower_arm_left = new ModelRenderer(this);
			lower_arm_left.setRotationPoint(-3.634F, 8.2953F, -5.3752F);
			arm.addChild(lower_arm_left);
			setRotationAngle(lower_arm_left, 0.3491F, 0.0F, 0.0F);
			lower_arm_left.setTextureOffset(48, 119).addBox(-4.0F, 0.5F, -4.0F, 8.0F, 12.0F, 8.0F, 0.0F, false);
			lower_arm_left.setTextureOffset(44, 99).addBox(-5.0F, 12.5F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			Steel_Wool = new ModelRenderer(this);
			Steel_Wool.setRotationPoint(-0.5F, 24.0F, 0.3889F);
			lower_arm_left.addChild(Steel_Wool);
			Steel_Wool.setTextureOffset(0, 63).addBox(-13.5F, -1.5F, -13.3889F, 27.0F, 3.0F, 27.0F, 0.0F, false);
			Steel_Wool.setTextureOffset(122, 123).addBox(-9.5F, -1.5F, 15.6111F, 19.0F, 3.0F, 2.0F, 0.0F, false);
			Steel_Wool.setTextureOffset(84, 111).addBox(-11.5F, -1.5F, 13.6111F, 23.0F, 3.0F, 2.0F, 0.0F, false);
			Steel_Wool.setTextureOffset(122, 123).addBox(-9.5F, -1.5F, -17.3889F, 19.0F, 3.0F, 2.0F, 0.0F, false);
			Steel_Wool.setTextureOffset(81, 68).addBox(-11.5F, -1.5F, -15.3889F, 23.0F, 3.0F, 2.0F, 0.0F, false);
			Steel_Wool.setTextureOffset(0, 6).addBox(-0.5F, -4.5F, 5.6111F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			Steel_Wool.setTextureOffset(0, 109).addBox(-0.5F, -6.5F, -8.3889F, 2.0F, 2.0F, 16.0F, 0.0F, false);
			Steel_Wool.setTextureOffset(0, 6).addBox(-0.5F, -4.5F, -8.3889F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_leg_r1 = new ModelRenderer(this);
			left_leg_r1.setRotationPoint(0.5F, 0.0F, 14.6111F);
			Steel_Wool.addChild(left_leg_r1);
			setRotationAngle(left_leg_r1, 0.0F, -1.5708F, 0.0F);
			left_leg_r1.setTextureOffset(46, 93).addBox(-24.0F, -1.5F, -17.0F, 19.0F, 3.0F, 2.0F, 0.0F, false);
			left_leg_r1.setTextureOffset(67, 52).addBox(-26.0F, -1.5F, -15.0F, 23.0F, 3.0F, 2.0F, 0.0F, false);
			left_leg_r1.setTextureOffset(81, 63).addBox(-26.0F, -1.5F, 14.0F, 23.0F, 3.0F, 2.0F, 0.0F, false);
			left_leg_r1.setTextureOffset(80, 123).addBox(-24.0F, -1.5F, 16.0F, 19.0F, 3.0F, 2.0F, 0.0F, false);
			upper_arm_left = new ModelRenderer(this);
			upper_arm_left.setRotationPoint(-17.5922F, 11.6293F, -4.7788F);
			arm.addChild(upper_arm_left);
			setRotationAngle(upper_arm_left, -0.48F, 0.0F, 0.0F);
			upper_arm_left.setTextureOffset(48, 119).addBox(9.9582F, -14.6587F, -5.7063F, 8.0F, 12.0F, 8.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-9.3886F, -30.3086F, 5.2514F);
			arm2 = new ModelRenderer(this);
			arm2.setRotationPoint(0.0F, 0.0F, 0.0F);
			right_arm.addChild(arm2);
			setRotationAngle(arm2, -2.7517F, 0.0974F, -2.6674F);
			lower_arm_right = new ModelRenderer(this);
			lower_arm_right.setRotationPoint(3.634F, 8.2953F, -5.3752F);
			arm2.addChild(lower_arm_right);
			lower_arm_right.setTextureOffset(48, 119).addBox(-4.0F, 0.5F, -4.0F, 8.0F, 12.0F, 8.0F, 0.0F, true);
			lower_arm_right.setTextureOffset(44, 99).addBox(-5.0F, 12.5F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, true);
			Illumix = new ModelRenderer(this);
			Illumix.setRotationPoint(-0.3421F, 17.3646F, -2.2105F);
			lower_arm_right.addChild(Illumix);
			Illumix.setTextureOffset(106, 46).addBox(-4.6579F, 1.2354F, 10.2105F, 10.0F, 1.0F, 11.0F, 0.0F, false);
			Illumix.setTextureOffset(0, 0).addBox(-1.6579F, -1.8646F, -8.7895F, 4.0F, 4.0F, 59.0F, 0.0F, false);
			Illumix.setTextureOffset(81, 116).addBox(-9.6579F, -1.8646F, 12.2105F, 20.0F, 4.0F, 3.0F, 0.0F, false);
			Illumix.setTextureOffset(36, 0).addBox(-10.6579F, -1.8646F, 15.2105F, 2.0F, 4.0F, 8.0F, 0.0F, false);
			Illumix.setTextureOffset(36, 0).addBox(9.3421F, -1.8646F, 15.2105F, 2.0F, 4.0F, 8.0F, 0.0F, false);
			Illumix.setTextureOffset(120, 34).addBox(-7.6579F, 1.2354F, 10.2105F, 3.0F, 1.0F, 11.0F, 0.0F, false);
			Illumix.setTextureOffset(0, 3).addBox(-2.6579F, 1.2354F, 8.2105F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			Illumix.setTextureOffset(36, 14).addBox(-3.6579F, 1.2354F, 9.2105F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			Illumix.setTextureOffset(120, 62).addBox(5.3421F, 1.2354F, 10.2105F, 3.0F, 1.0F, 11.0F, 0.0F, false);
			Illumix.setTextureOffset(0, 0).addBox(-2.6579F, 1.2354F, 21.2105F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			Illumix.setTextureOffset(36, 12).addBox(-3.6579F, 1.2354F, 21.2105F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			Illumix.setTextureOffset(36, 24).addBox(-6.6579F, -2.938F, 11.2105F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			left_leg_r2 = new ModelRenderer(this);
			left_leg_r2.setRotationPoint(0.3421F, 1.7354F, 15.7105F);
			Illumix.addChild(left_leg_r2);
			setRotationAngle(left_leg_r2, 3.1416F, 0.0F, 0.0F);
			left_leg_r2.setTextureOffset(120, 62).addBox(5.0F, 2.7F, -5.5F, 3.0F, 1.0F, 11.0F, 0.0F, false);
			left_leg_r2.setTextureOffset(106, 46).addBox(-5.0F, 2.7F, -5.5F, 10.0F, 1.0F, 11.0F, 0.0F, false);
			left_leg_r2.setTextureOffset(36, 14).addBox(-4.0F, 2.7F, -6.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg_r2.setTextureOffset(0, 3).addBox(-3.0F, 2.7F, -7.5F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg_r2.setTextureOffset(120, 34).addBox(-8.0F, 2.7F, -5.5F, 3.0F, 1.0F, 11.0F, 0.0F, false);
			left_leg_r2.setTextureOffset(36, 12).addBox(-4.0F, 2.7F, 5.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg_r2.setTextureOffset(0, 0).addBox(-3.0F, 2.7F, 5.5F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			upper_arm_right = new ModelRenderer(this);
			upper_arm_right.setRotationPoint(17.5922F, 11.6293F, -4.7788F);
			arm2.addChild(upper_arm_right);
			setRotationAngle(upper_arm_right, -0.48F, 0.0F, 0.0F);
			upper_arm_right.setTextureOffset(48, 119).addBox(-17.9582F, -14.6587F, -5.7063F, 8.0F, 12.0F, 8.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(5.5F, -8.0F, 6.0F);
			left_leg.setTextureOffset(0, 0).addBox(-5.0F, 24.0F, -14.0F, 10.0F, 8.0F, 16.0F, 0.0F, false);
			leg = new ModelRenderer(this);
			leg.setRotationPoint(-7.4F, 20.0F, -3.5F);
			left_leg.addChild(leg);
			setRotationAngle(leg, 0.1745F, 0.0F, 0.0F);
			leg.setTextureOffset(48, 119).addBox(3.4F, -7.5333F, -3.2659F, 8.0F, 12.0F, 8.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(19.4F, -6.0F, -3.5F);
			leg.addChild(bone);
			setRotationAngle(bone, -0.48F, 0.0F, 0.0F);
			bone.setTextureOffset(48, 119).addBox(-16.0F, -15.7356F, -0.821F, 8.0F, 12.0F, 8.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-5.5F, -8.0F, 6.0F);
			right_leg.setTextureOffset(0, 0).addBox(-5.0F, 24.0F, -14.0F, 10.0F, 8.0F, 16.0F, 0.0F, true);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(7.4F, 20.0F, -3.5F);
			right_leg.addChild(leg2);
			setRotationAngle(leg2, 0.1745F, 0.0F, 0.0F);
			leg2.setTextureOffset(48, 119).addBox(-11.4F, -7.5333F, -3.2659F, 8.0F, 12.0F, 8.0F, 0.0F, true);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-19.4F, -6.0F, -3.5F);
			leg2.addChild(bone2);
			setRotationAngle(bone2, -0.48F, 0.0F, 0.0F);
			bone2.setTextureOffset(48, 119).addBox(8.0F, -15.7356F, -0.821F, 8.0F, 12.0F, 8.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
