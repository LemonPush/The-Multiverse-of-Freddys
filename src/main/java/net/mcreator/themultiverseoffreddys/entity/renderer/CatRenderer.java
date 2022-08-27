
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

import net.mcreator.themultiverseoffreddys.entity.CatEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CatRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CatEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelCat(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/cat.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelCat extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer bone;
		private final ModelRenderer bone_r1;
		private final ModelRenderer bone_r2;
		private final ModelRenderer bone_r3;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer body;
		private final ModelRenderer neck;
		private final ModelRenderer bone2;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelCat() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -10.0F, 0.0F);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(8.0F, 6.0F, 8.0F);
			head.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.5622F, -10.8225F, -1.0F);
			head.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(3.5622F, -10.8225F, -1.0F);
			head.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 17.0F, -2.0F);
			head.addChild(bone);
			bone.setTextureOffset(55, 44).addBox(4.5F, -23.5F, -1.1F, 1.0F, 2.0F, 6.0F, 0.0F, false);
			bone.setTextureOffset(54, 53).addBox(-5.5F, -23.5F, -1.1F, 1.0F, 2.0F, 6.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-4.5F, -28.5F, -2.1F, 9.0F, 7.0F, 8.0F, 0.0F, false);
			bone.setTextureOffset(19, 55).addBox(-3.5F, -21.5F, -4.1F, 7.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(35, 32).addBox(-3.5F, -23.5F, -4.1F, 7.0F, 2.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 15).addBox(-0.5F, -24.0F, -3.9F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			bone_r1 = new ModelRenderer(this);
			bone_r1.setRotationPoint(0.0F, -20.3F, 2.5F);
			bone.addChild(bone_r1);
			setRotationAngle(bone_r1, 0.2182F, 0.0F, 0.0F);
			bone_r1.setTextureOffset(52, 20).addBox(-3.5F, 0.0F, -6.5F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			bone_r1.setTextureOffset(26, 0).addBox(-3.5F, -1.0F, -6.5F, 7.0F, 1.0F, 6.0F, 0.0F, false);
			bone_r1.setTextureOffset(26, 19).addBox(-3.5F, 0.0F, 2.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r1.setTextureOffset(50, 23).addBox(3.5F, 0.0F, -4.5F, 1.0F, 1.0F, 8.0F, 0.0F, true);
			bone_r1.setTextureOffset(50, 23).addBox(-4.5F, 0.0F, -4.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			bone_r2 = new ModelRenderer(this);
			bone_r2.setRotationPoint(-3.0F, -28.5F, 1.9F);
			bone.addChild(bone_r2);
			setRotationAngle(bone_r2, 0.0F, 0.0F, -0.2618F);
			bone_r2.setTextureOffset(62, 16).addBox(-2.15F, -4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			bone_r2.setTextureOffset(15, 27).addBox(-2.65F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, true);
			bone_r3 = new ModelRenderer(this);
			bone_r3.setRotationPoint(3.0F, -28.5F, 1.9F);
			bone.addChild(bone_r3);
			setRotationAngle(bone_r3, 0.0F, 0.0F, 0.2618F);
			bone_r3.setTextureOffset(62, 16).addBox(0.15F, -4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			bone_r3.setTextureOffset(15, 27).addBox(-0.35F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
			bone.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -9.0F, 0.0F);
			body.setTextureOffset(56, 65).addBox(-4.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(64, 0).addBox(-4.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(63, 44).addBox(1.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(62, 12).addBox(1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(62, 52).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(56, 61).addBox(-5.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(55, 40).addBox(-4.0F, 7.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(62, 32).addBox(1.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(66, 63).addBox(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(66, 59).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, 9.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 15).addBox(-5.0F, 5.3F, -3.0F, 10.0F, 6.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(0, 15).addBox(-5.0F, -1.4F, -3.0F, 10.0F, 6.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(26, 21).addBox(-5.0F, 11.9F, -3.0F, 10.0F, 4.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(48, 59).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(2.0F, 1.0F, 0.0F);
			body.addChild(neck);
			setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(bone2);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(6.5F, -9.0F, 0.0F);
			left_arm.setTextureOffset(64, 4).addBox(1.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 58).addBox(0.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(35, 38).addBox(-0.5F, 6.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			left_arm.setTextureOffset(50, 32).addBox(0.0F, 13.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(26, 15).addBox(1.0F, 12.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 27).addBox(-0.5F, -1.7F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-6.5F, -9.0F, 0.0F);
			right_arm.setTextureOffset(6, 68).addBox(-3.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(64, 67).addBox(-3.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(12, 59).addBox(-3.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(34, 7).addBox(-4.5F, -1.7F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			right_arm.setTextureOffset(20, 44).addBox(-4.5F, 6.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			right_arm.setTextureOffset(49, 2).addBox(-4.5F, 13.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.7F, 7.0F, -0.5F);
			left_leg.setTextureOffset(38, 67).addBox(-1.0F, 7.5F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(66, 36).addBox(-1.0F, 13.5F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(30, 67).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 59).addBox(-1.5F, 8.5F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 59).addBox(-1.5F, 2.5F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 50).addBox(-2.0F, 16.0F, -4.5F, 4.0F, 1.0F, 7.0F, 0.0F, false);
			left_leg.setTextureOffset(60, 23).addBox(-2.0F, 15.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(40, 49).addBox(-2.5F, 0.5F, -2.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.7F, 7.0F, -0.5F);
			right_leg.setTextureOffset(22, 67).addBox(-1.0F, 7.5F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(46, 0).addBox(-1.0F, 13.5F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 67).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(36, 59).addBox(-1.5F, 8.5F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(47, 12).addBox(-2.0F, 16.0F, -4.5F, 4.0F, 1.0F, 7.0F, 0.0F, false);
			right_leg.setTextureOffset(60, 27).addBox(-2.0F, 15.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(20, 31).addBox(-2.5F, 0.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 39).addBox(-2.5F, 8.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
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
