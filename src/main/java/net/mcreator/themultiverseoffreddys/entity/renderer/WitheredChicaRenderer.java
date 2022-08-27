
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

import net.mcreator.themultiverseoffreddys.entity.WitheredChicaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WitheredChicaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WitheredChicaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelWitheredChica(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/witheredchica.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelWitheredChica extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer bone;
		private final ModelRenderer bone_r1;
		private final ModelRenderer bone_r2;
		private final ModelRenderer bone_r3;
		private final ModelRenderer bone_r4;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer body;
		private final ModelRenderer neck;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelWitheredChica() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -7.8294F, -0.95F);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(8.0F, 3.8294F, 9.45F);
			head.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(76, 56).addBox(-10.5F, 11.0F, -12.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(74, 37).addBox(-10.5F, 11.0F, -9.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(73, 26).addBox(-10.5F, 11.0F, -11.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(73, 22).addBox(-10.5F, 11.0F, -10.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 64).addBox(-11.0F, 7.0F, -12.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 43).addBox(-12.0F, 7.0F, -17.5F, 8.0F, 4.0F, 5.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.5622F, -12.9931F, 0.45F);
			head.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(3.5622F, -12.9931F, 0.45F);
			head.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 14.8294F, -0.55F);
			head.addChild(bone);
			bone.setTextureOffset(22, 23).addBox(-3.5F, -20.0F, -7.0F, 7.0F, 1.0F, 10.0F, 0.0F, false);
			bone.setTextureOffset(42, 34).addBox(-3.5F, -20.0F, -3.0F, 7.0F, 1.0F, 8.0F, 0.0F, false);
			bone.setTextureOffset(65, 37).addBox(3.5F, -20.0F, -2.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(65, 37).addBox(-4.5F, -20.0F, -2.0F, 1.0F, 1.0F, 7.0F, 0.0F, true);
			bone.setTextureOffset(62, 0).addBox(-3.5F, -21.0F, -7.0F, 7.0F, 1.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(62, 0).addBox(-3.5F, -24.5F, -7.0F, 7.0F, 1.0F, 5.0F, 0.0F, false);
			bone.setTextureOffset(45, 43).addBox(-3.5F, -26.5F, -7.0F, 7.0F, 2.0F, 6.0F, 0.0F, false);
			bone.setTextureOffset(0, 19).addBox(-4.5F, -31.5F, -2.1F, 9.0F, 7.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(0, 34).addBox(-4.5F, -24.5F, -2.1F, 9.0F, 2.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(68, 11).addBox(4.5F, -26.5F, -2.1F, 1.0F, 4.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(68, 11).addBox(-5.5F, -26.5F, -2.1F, 1.0F, 4.0F, 7.0F, 0.0F, true);
			bone.setTextureOffset(40, 63).addBox(-2.5F, -27.1F, -6.8F, 5.0F, 1.0F, 6.0F, 0.0F, false);
			bone_r1 = new ModelRenderer(this);
			bone_r1.setRotationPoint(-1.0F, -30.5F, 1.5F);
			bone.addChild(bone_r1);
			setRotationAngle(bone_r1, 0.3054F, 1.5708F, 0.0F);
			bone_r1.setTextureOffset(73, 78).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 4.0F, 1.0F, -0.25F, true);
			bone_r2 = new ModelRenderer(this);
			bone_r2.setRotationPoint(1.0F, -30.5F, 1.5F);
			bone.addChild(bone_r2);
			setRotationAngle(bone_r2, 0.3054F, -1.5708F, 0.0F);
			bone_r2.setTextureOffset(73, 78).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 4.0F, 1.0F, -0.25F, false);
			bone_r3 = new ModelRenderer(this);
			bone_r3.setRotationPoint(0.0F, -30.5F, 1.0F);
			bone.addChild(bone_r3);
			setRotationAngle(bone_r3, 0.3054F, 0.0F, 0.0F);
			bone_r3.setTextureOffset(73, 78).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 4.0F, 1.0F, -0.25F, false);
			bone_r4 = new ModelRenderer(this);
			bone_r4.setRotationPoint(0.0F, -30.5F, 2.0F);
			bone.addChild(bone_r4);
			setRotationAngle(bone_r4, -0.3054F, 0.0F, 0.0F);
			bone_r4.setTextureOffset(73, 78).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 4.0F, 1.0F, -0.25F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
			bone.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
			right_arm_r4.setTextureOffset(48, 80).addBox(-7.0F, 10.2F, -18.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r4.setTextureOffset(48, 80).addBox(-11.0F, 10.2F, -18.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -9.0F, 0.0F);
			body.setTextureOffset(64, 30).addBox(-3.5F, 13.0F, -2.0F, 7.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(77, 12).addBox(-4.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(77, 8).addBox(-4.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(35, 58).addBox(1.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(67, 6).addBox(1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(14, 80).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(56, 30).addBox(-5.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(61, 52).addBox(-4.0F, 7.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(46, 6).addBox(1.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(40, 79).addBox(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(32, 79).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 34).addBox(-1.0F, 9.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-5.0F, -1.4F, -3.0F, 10.0F, 13.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(28, 79).addBox(3.5F, -1.7F, -4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(20, 52).addBox(2.5F, -1.7F, -4.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(46, 23).addBox(-3.5F, -1.7F, -4.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 72).addBox(-4.5F, -1.7F, -4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(61, 69).addBox(-2.5F, -1.7F, -4.0F, 5.0F, 10.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(26, 13).addBox(-5.0F, 12.6F, -3.0F, 10.0F, 4.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(53, 70).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(79, 47).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(2.0F, 1.0F, 0.0F);
			body.addChild(neck);
			setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(6.5F, -9.0F, 0.0F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -1.5708F);
			left_arm.setTextureOffset(59, 0).addBox(-1.0F, 13.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			left_arm.setTextureOffset(41, 46).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			left_arm.setTextureOffset(41, 70).addBox(-1.5F, 7.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(26, 0).addBox(-13.5F, 14.0F, -1.5F, 15.0F, 3.0F, 3.0F, 0.0F, true);
			left_arm.setTextureOffset(29, 70).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
			left_arm.setTextureOffset(46, 51).addBox(-2.5F, -0.7F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			left_arm.setTextureOffset(61, 58).addBox(-2.5F, 7.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.5F, -9.0F, 0.0F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 1.5708F);
			right_arm.setTextureOffset(59, 0).addBox(-1.0F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(41, 46).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(41, 70).addBox(-1.5F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(26, 0).addBox(-1.5F, 15.0F, -1.5F, 15.0F, 3.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(29, 70).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(26, 46).addBox(-2.5F, 0.3F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			right_arm.setTextureOffset(61, 58).addBox(-2.5F, 8.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.7F, 7.0F, -0.5F);
			left_leg.setTextureOffset(79, 44).addBox(-1.0F, 8.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(76, 60).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(74, 41).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(73, 69).addBox(-1.5F, 9.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(17, 70).addBox(-1.5F, 1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(65, 45).addBox(-2.0F, 16.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(32, 6).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 19).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 3).addBox(-2.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(1.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(20, 58).addBox(-2.5F, 1.0F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(53, 18).addBox(-2.5F, 8.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(23, 34).addBox(-2.5F, 14.0F, -6.0F, 5.0F, 3.0F, 9.0F, 0.0F, false);
			left_leg.setTextureOffset(64, 37).addBox(-2.5F, 15.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(64, 37).addBox(1.5F, 15.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(64, 37).addBox(-0.5F, 15.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.7F, 7.0F, -0.5F);
			right_leg.setTextureOffset(79, 44).addBox(-1.0F, 8.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(76, 60).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(74, 41).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 72).addBox(-1.5F, 9.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(17, 70).addBox(-1.5F, 1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(65, 45).addBox(-2.0F, 16.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
			right_leg.setTextureOffset(32, 6).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 19).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 3).addBox(1.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 0).addBox(-2.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(52, 6).addBox(-2.5F, 1.0F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 52).addBox(-2.5F, 8.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(23, 34).addBox(-2.5F, 14.0F, -6.0F, 5.0F, 3.0F, 9.0F, 0.0F, true);
			right_leg.setTextureOffset(64, 37).addBox(-2.5F, 15.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(64, 37).addBox(1.5F, 15.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(64, 37).addBox(-0.5F, 15.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);
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

			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
