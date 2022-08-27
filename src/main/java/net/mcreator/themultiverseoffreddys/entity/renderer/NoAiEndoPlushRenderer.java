
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

import net.mcreator.themultiverseoffreddys.entity.NoAiEndoPlushEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NoAiEndoPlushRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NoAiEndoPlushEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelEndoPlush(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/endoplush.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelEndoPlush extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer earright;
		private final ModelRenderer lower3;
		private final ModelRenderer tip;
		private final ModelRenderer earleft;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer lower4;
		private final ModelRenderer tip2;
		private final ModelRenderer Body;
		private final ModelRenderer right_arm;
		private final ModelRenderer lowerarm3;
		private final ModelRenderer left_arm;
		private final ModelRenderer lowerarm2;
		private final ModelRenderer right_leg;
		private final ModelRenderer lower;
		private final ModelRenderer left_leg;
		private final ModelRenderer lower2;

		public ModelEndoPlush() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 10.0F, -1.0F);
			Head.setTextureOffset(0, 0).addBox(-2.0F, -5.7F, -1.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(0, 12).addBox(-1.375F, -3.2F, -0.95F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(11, 9).addBox(-1.375F, -1.7F, -0.95F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 7).addBox(-2.0F, -2.7F, 0.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(19, 31).addBox(-2.25F, -2.95F, -0.7F, 1.0F, 2.0F, 1.0F, -0.25F, false);
			Head.setTextureOffset(15, 31).addBox(-2.25F, -2.95F, -1.2F, 1.0F, 2.0F, 1.0F, -0.25F, false);
			Head.setTextureOffset(0, 0).addBox(1.25F, -2.95F, -1.2F, 1.0F, 2.0F, 1.0F, -0.25F, false);
			Head.setTextureOffset(7, 16).addBox(1.25F, -2.95F, -0.7F, 1.0F, 2.0F, 1.0F, -0.25F, false);
			Head.setTextureOffset(30, 12).addBox(-0.75F, -1.45F, -1.2F, 3.0F, 1.0F, 1.0F, -0.25F, false);
			Head.setTextureOffset(8, 30).addBox(-2.25F, -1.45F, -1.2F, 3.0F, 1.0F, 1.0F, -0.25F, false);
			Head.setTextureOffset(20, 0).addBox(-2.25F, -1.45F, -0.7F, 3.0F, 1.0F, 1.0F, -0.25F, false);
			Head.setTextureOffset(28, 29).addBox(-0.75F, -1.45F, -0.7F, 3.0F, 1.0F, 1.0F, -0.25F, false);
			Head.setTextureOffset(32, 20).addBox(-1.5F, -5.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			Head.setTextureOffset(14, 25).addBox(0.5F, -5.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			earright = new ModelRenderer(this);
			earright.setRotationPoint(0.0F, 9.0F, 0.0F);
			Head.addChild(earright);
			lower3 = new ModelRenderer(this);
			lower3.setRotationPoint(-1.5F, -16.2F, -1.1F);
			earright.addChild(lower3);
			setRotationAngle(lower3, 0.7854F, 0.0F, 0.0F);
			tip = new ModelRenderer(this);
			tip.setRotationPoint(0.0F, -1.0F, -1.0F);
			earright.addChild(tip);
			earleft = new ModelRenderer(this);
			earleft.setRotationPoint(0.0F, 9.0F, 0.0F);
			Head.addChild(earleft);
			earleft.setTextureOffset(33, 4).addBox(1.0F, -16.7F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			earleft.setTextureOffset(0, 32).addBox(-2.0F, -16.7F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-1.5F, -17.8213F, -0.1213F);
			earleft.addChild(cube_r1);
			setRotationAngle(cube_r1, 1.789F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(4, 32).addBox(-0.5F, -1.8142F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1.setTextureOffset(8, 32).addBox(2.5F, -1.8142F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-1.5F, -16.7F, 1.0F);
			earleft.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.7854F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(28, 31).addBox(-0.5F, -1.7F, -0.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r2.setTextureOffset(32, 14).addBox(2.5F, -1.7F, -0.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			lower4 = new ModelRenderer(this);
			lower4.setRotationPoint(1.5F, -16.2F, -1.1F);
			earleft.addChild(lower4);
			setRotationAngle(lower4, 0.7854F, 0.0F, 0.0F);
			tip2 = new ModelRenderer(this);
			tip2.setRotationPoint(0.0F, -1.0F, -1.0F);
			earleft.addChild(tip2);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 25.0F, 0.0F);
			Body.setTextureOffset(15, 34).addBox(2.0F, -14.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(12, 13).addBox(-0.7F, -15.2F, -1.0F, 3.0F, 2.0F, 2.0F, -0.25F, false);
			Body.setTextureOffset(26, 16).addBox(-1.0F, -14.95F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(12, 0).addBox(-2.3F, -15.2F, -1.0F, 3.0F, 2.0F, 2.0F, -0.25F, false);
			Body.setTextureOffset(27, 5).addBox(-1.5F, -10.5F, -1.0F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			Body.setTextureOffset(28, 9).addBox(-0.5F, -10.5F, -1.0F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			Body.setTextureOffset(0, 20).addBox(-2.3F, -11.5F, -1.0F, 3.0F, 1.0F, 2.0F, -0.25F, false);
			Body.setTextureOffset(20, 2).addBox(-0.7F, -11.5F, -1.0F, 3.0F, 1.0F, 2.0F, -0.25F, false);
			Body.setTextureOffset(10, 17).addBox(-2.3F, -12.5F, -1.0F, 3.0F, 1.0F, 2.0F, -0.25F, false);
			Body.setTextureOffset(18, 18).addBox(-0.7F, -12.5F, -1.0F, 3.0F, 1.0F, 2.0F, -0.25F, false);
			Body.setTextureOffset(34, 9).addBox(-3.0F, -14.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(28, 0).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);
			Body.setTextureOffset(8, 20).addBox(-1.7F, -9.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(9, 13).addBox(0.7F, -9.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(24, 29).addBox(-0.5F, -15.7F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-1.75F, 10.51F, 0.0F);
			right_arm.setTextureOffset(18, 21).addBox(-3.0F, -0.71F, -1.0F, 2.0F, 3.0F, 2.0F, -0.25F, false);
			right_arm.setTextureOffset(21, 6).addBox(-3.0F, 2.54F, -1.0F, 2.0F, 3.0F, 2.0F, -0.25F, false);
			right_arm.setTextureOffset(26, 20).addBox(-3.0F, 5.79F, -1.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);
			right_arm.setTextureOffset(6, 23).addBox(-2.5F, 2.04F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(21, 16).addBox(-2.5F, 5.09F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lowerarm3 = new ModelRenderer(this);
			lowerarm3.setRotationPoint(2.25F, 13.49F, 0.0F);
			right_arm.addChild(lowerarm3);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(1.75F, 10.51F, 0.0F);
			left_arm.setTextureOffset(24, 24).addBox(1.0F, -0.71F, -1.0F, 2.0F, 3.0F, 2.0F, -0.25F, false);
			left_arm.setTextureOffset(10, 20).addBox(1.0F, 2.54F, -1.0F, 2.0F, 3.0F, 2.0F, -0.25F, false);
			left_arm.setTextureOffset(0, 28).addBox(1.0F, 5.79F, -1.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);
			left_arm.setTextureOffset(34, 0).addBox(1.5F, 2.04F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(12, 33).addBox(1.5F, 5.09F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lowerarm2 = new ModelRenderer(this);
			lowerarm2.setRotationPoint(-2.25F, 13.49F, 0.0F);
			left_arm.addChild(lowerarm2);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-1.6F, 16.5F, 0.0F);
			right_leg.setTextureOffset(32, 31).addBox(-0.4F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(34, 7).addBox(-0.4F, 3.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(8, 25).addBox(-0.9F, 0.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.25F, false);
			lower = new ModelRenderer(this);
			lower.setRotationPoint(3.0F, 7.5F, 0.0F);
			right_leg.addChild(lower);
			lower.setTextureOffset(16, 26).addBox(-3.9F, -3.5F, -1.0F, 2.0F, 3.0F, 2.0F, -0.25F, false);
			lower.setTextureOffset(0, 16).addBox(-3.9F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(1.6F, 16.5F, 0.0F);
			left_leg.setTextureOffset(32, 24).addBox(-0.6F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(32, 27).addBox(-0.6F, 3.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 23).addBox(-1.1F, 0.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.25F, false);
			lower2 = new ModelRenderer(this);
			lower2.setRotationPoint(-3.0F, 7.5F, 0.0F);
			left_leg.addChild(lower2);
			lower2.setTextureOffset(22, 11).addBox(1.9F, -3.5F, -1.0F, 2.0F, 3.0F, 2.0F, -0.25F, false);
			lower2.setTextureOffset(13, 4).addBox(2.0F, -1.0F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
