
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

import net.mcreator.themultiverseoffreddys.entity.WitheredRoxyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WitheredRoxyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WitheredRoxyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBrokenRoxy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/brokenroxy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBrokenRoxy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer head_r6;
		private final ModelRenderer head_r7;
		private final ModelRenderer head_r8;
		private final ModelRenderer head_r9;
		private final ModelRenderer head_r10;
		private final ModelRenderer head_r11;
		private final ModelRenderer head_r12;
		private final ModelRenderer head_r13;
		private final ModelRenderer head_r14;
		private final ModelRenderer head_r15;
		private final ModelRenderer head_r16;
		private final ModelRenderer head_r17;
		private final ModelRenderer body;
		private final ModelRenderer tail;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelBrokenRoxy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(24, 0).addBox(4.0F, -9.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(12, 15).addBox(4.0F, -8.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(72, 30).addBox(4.0F, -7.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(72, 30).addBox(-5.0F, -7.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, true);
			head.setTextureOffset(12, 15).addBox(-6.0F, -8.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, true);
			head.setTextureOffset(24, 0).addBox(-7.0F, -9.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, true);
			head.setTextureOffset(36, 27).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(50, 17).addBox(-3.5594F, -14.5959F, -1.3802F, 7.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(70, 69).addBox(-2.5F, -10.0F, -7.5F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(63, 45).addBox(-2.5F, -8.0F, -7.5F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(58, 0).addBox(-2.5F, -9.0F, -7.5F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(68, 15).addBox(-2.5F, -7.0F, -7.5F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(23, 73).addBox(-1.5F, -10.5F, -6.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(2.9729F, -11.003F, 7.0861F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, -2.6836F, -1.1144F, -0.4904F);
			head_r1.setTextureOffset(32, 47).addBox(-1.2F, -10.7F, -0.8F, 3.0F, 14.0F, 4.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-0.9153F, -14.6266F, 7.1225F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 1.505F, -1.5178F, 2.1917F);
			head_r2.setTextureOffset(18, 27).addBox(-1.0F, -17.5F, -2.0F, 3.0F, 17.0F, 6.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-2.9729F, -11.003F, 7.0861F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, -2.7667F, 1.132F, 0.3981F);
			head_r3.setTextureOffset(32, 47).addBox(-1.8F, -10.7F, -0.4F, 3.0F, 14.0F, 4.0F, 0.0F, true);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(2.9729F, -11.003F, 6.0861F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 2.6379F, -1.1617F, 0.1328F);
			head_r4.setTextureOffset(0, 41).addBox(-1.2F, -13.7F, 0.2F, 3.0F, 17.0F, 4.0F, 0.0F, false);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(-2.9729F, -11.003F, 6.0861F);
			head.addChild(head_r5);
			setRotationAngle(head_r5, 2.7251F, 1.1617F, -0.1328F);
			head_r5.setTextureOffset(0, 41).addBox(-1.8F, -13.7F, 0.2F, 3.0F, 17.0F, 4.0F, 0.0F, true);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(-2.9729F, -9.303F, 5.0861F);
			head.addChild(head_r6);
			setRotationAngle(head_r6, -2.1009F, 0.6732F, 1.2086F);
			head_r6.setTextureOffset(44, 17).addBox(-3.7F, 4.7F, 0.2F, 4.0F, 3.0F, 1.0F, 0.0F, true);
			head_r7 = new ModelRenderer(this);
			head_r7.setRotationPoint(0.0837F, -11.8945F, 5.152F);
			head.addChild(head_r7);
			setRotationAngle(head_r7, -1.5291F, -0.7854F, -1.5681F);
			head_r7.setTextureOffset(42, 65).addBox(-2.6431F, 2.2986F, -2.5322F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			head_r8 = new ModelRenderer(this);
			head_r8.setRotationPoint(2.9729F, -9.303F, 5.0861F);
			head.addChild(head_r8);
			setRotationAngle(head_r8, -2.1009F, -0.6732F, -1.2086F);
			head_r8.setTextureOffset(44, 17).addBox(-0.3F, 4.7F, 0.2F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			head_r9 = new ModelRenderer(this);
			head_r9.setRotationPoint(2.9729F, -11.003F, 6.0861F);
			head.addChild(head_r9);
			setRotationAngle(head_r9, -2.1009F, -0.6732F, -1.2086F);
			head_r9.setTextureOffset(32, 9).addBox(-2.3F, 4.7F, 0.2F, 6.0F, 2.0F, 3.0F, 0.0F, false);
			head_r9.setTextureOffset(0, 67).addBox(0.7F, 0.7F, -0.3F, 3.0F, 5.0F, 4.0F, 0.0F, false);
			head_r10 = new ModelRenderer(this);
			head_r10.setRotationPoint(-2.9729F, -11.003F, 6.0861F);
			head.addChild(head_r10);
			setRotationAngle(head_r10, -2.1009F, 0.6732F, 1.2086F);
			head_r10.setTextureOffset(32, 9).addBox(-3.7F, 4.7F, 0.2F, 6.0F, 2.0F, 3.0F, 0.0F, true);
			head_r10.setTextureOffset(0, 67).addBox(-3.7F, 0.7F, -0.3F, 3.0F, 5.0F, 4.0F, 0.0F, true);
			head_r11 = new ModelRenderer(this);
			head_r11.setRotationPoint(0.0837F, -13.5945F, 6.152F);
			head.addChild(head_r11);
			setRotationAngle(head_r11, -1.5291F, -0.7854F, -1.5681F);
			head_r11.setTextureOffset(46, 47).addBox(-4.6431F, 2.2986F, -2.5322F, 6.0F, 3.0F, 5.0F, 0.0F, false);
			head_r11.setTextureOffset(60, 24).addBox(-1.6431F, -0.7014F, -2.5322F, 3.0F, 5.0F, 5.0F, 0.0F, false);
			head_r12 = new ModelRenderer(this);
			head_r12.setRotationPoint(-0.9153F, -14.6266F, 6.1225F);
			head.addChild(head_r12);
			setRotationAngle(head_r12, 0.9814F, -1.5178F, 2.1917F);
			head_r12.setTextureOffset(0, 15).addBox(-1.5F, -20.5F, -2.0F, 3.0F, 20.0F, 6.0F, 0.0F, false);
			head_r13 = new ModelRenderer(this);
			head_r13.setRotationPoint(-0.6142F, -16.3679F, -2.8146F);
			head.addChild(head_r13);
			setRotationAngle(head_r13, 2.731F, -0.4701F, -1.4834F);
			head_r13.setTextureOffset(67, 74).addBox(0.2056F, -4.3556F, -2.0746F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			head_r14 = new ModelRenderer(this);
			head_r14.setRotationPoint(-0.6142F, -16.3679F, -2.8146F);
			head.addChild(head_r14);
			setRotationAngle(head_r14, -3.0578F, -0.6088F, -2.3948F);
			head_r14.setTextureOffset(35, 73).addBox(-1.3847F, -2.54F, -2.0746F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			head_r15 = new ModelRenderer(this);
			head_r15.setRotationPoint(-1.0902F, -13.97F, -4.115F);
			head.addChild(head_r15);
			setRotationAngle(head_r15, 1.4862F, -1.0282F, -1.4983F);
			head_r15.setTextureOffset(67, 74).addBox(0.7135F, -0.9012F, -0.985F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			head_r16 = new ModelRenderer(this);
			head_r16.setRotationPoint(-3.5F, -13.5F, 0.0F);
			head.addChild(head_r16);
			setRotationAngle(head_r16, 0.0F, 0.0F, -0.7854F);
			head_r16.setTextureOffset(24, 5).addBox(-0.9F, -5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			head_r16.setTextureOffset(0, 18).addBox(-0.4F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			head_r16.setTextureOffset(0, 15).addBox(-2.4F, -3.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			head_r16.setTextureOffset(0, 62).addBox(-1.4F, -4.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, true);
			head_r17 = new ModelRenderer(this);
			head_r17.setRotationPoint(3.5F, -13.5F, 0.0F);
			head.addChild(head_r17);
			setRotationAngle(head_r17, 0.0F, 0.0F, 0.7854F);
			head_r17.setTextureOffset(0, 18).addBox(-0.6F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head_r17.setTextureOffset(24, 5).addBox(-1.1F, -5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head_r17.setTextureOffset(0, 15).addBox(1.4F, -3.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head_r17.setTextureOffset(0, 62).addBox(-1.6F, -4.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(32, 0).addBox(-5.0F, 6.0F, -3.0F, 10.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(18, 15).addBox(-5.0F, -6.0F, -3.0F, 10.0F, 6.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(57, 60).addBox(4.5F, -7.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(57, 60).addBox(-9.5F, -7.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, true);
			body.setTextureOffset(36, 36).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 6.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(51, 73).addBox(-6.0F, -5.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(43, 73).addBox(5.0F, -5.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(36, 32).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(30, 27).addBox(-1.5F, -8.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(2.5F, 7.0F, 2.5F);
			body.addChild(tail);
			setRotationAngle(tail, 0.829F, 0.0F, 0.0F);
			tail.setTextureOffset(46, 55).addBox(-4.5F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			tail.setTextureOffset(74, 35).addBox(-3.5F, 4.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.5F, -5.0F, 0.0F);
			left_arm.setTextureOffset(62, 36).addBox(1.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(72, 60).addBox(1.5F, 3.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(72, 5).addBox(1.5F, 9.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 0).addBox(2.0F, 4.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(26, 65).addBox(1.0F, 10.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.5F, -5.0F, 0.0F);
			right_arm.setTextureOffset(62, 36).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(58, 66).addBox(-5.0F, 3.5F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(72, 60).addBox(-4.5F, 3.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(26, 65).addBox(-5.0F, 10.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(0, 0).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(72, 5).addBox(-4.5F, 9.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(10, 61).addBox(-2.1F, 8.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(64, 51).addBox(-2.1F, 0.5F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(72, 0).addBox(-1.6F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(59, 73).addBox(-1.1F, 5.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(44, 9).addBox(-2.6F, 14.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(71, 22).addBox(-3.1F, 14.0F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(14, 50).addBox(-1.9F, 7.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(60, 5).addBox(-1.9F, 0.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(50, 24).addBox(-1.9F, 6.5F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(72, 0).addBox(-1.4F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(14, 71).addBox(-1.4F, 6.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(44, 9).addBox(-2.4F, 14.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, true);
			right_leg.setTextureOffset(71, 22).addBox(-2.9F, 14.0F, -5.0F, 6.0F, 2.0F, 2.0F, 0.0F, true);
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
