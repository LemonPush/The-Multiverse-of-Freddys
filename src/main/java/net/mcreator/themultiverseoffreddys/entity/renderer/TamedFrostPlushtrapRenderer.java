
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

import net.mcreator.themultiverseoffreddys.entity.TamedFrostPlushtrapEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedFrostPlushtrapRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedFrostPlushtrapEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelFrost_PlushTrap(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/frost_plushtrap.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFrost_PlushTrap extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer earright;
		private final ModelRenderer lower3;
		private final ModelRenderer cube_r1;
		private final ModelRenderer tip;
		private final ModelRenderer earleft;
		private final ModelRenderer lower4;
		private final ModelRenderer cube_r2;
		private final ModelRenderer tip2;
		private final ModelRenderer Body;
		private final ModelRenderer left_arm;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer lowerarm2;
		private final ModelRenderer right_arm;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer lowerarm3;
		private final ModelRenderer left_leg;
		private final ModelRenderer cube_r7;
		private final ModelRenderer lower2;
		private final ModelRenderer right_leg;
		private final ModelRenderer cube_r8;
		private final ModelRenderer lower5;

		public ModelFrost_PlushTrap() {
			textureWidth = 32;
			textureHeight = 32;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 10.0F, -0.5F);
			Head.setTextureOffset(0, 0).addBox(-2.5F, -5.7F, -1.5F, 5.0F, 5.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(27, 27).addBox(-0.5F, -3.7F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 19).addBox(-1.5F, -5.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			Head.setTextureOffset(0, 17).addBox(0.5F, -5.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			Head.setTextureOffset(24, 12).addBox(-1.5F, -3.2F, -2.6F, 3.0F, 1.0F, 1.0F, 0.25F, false);
			Head.setTextureOffset(24, 7).addBox(-1.5F, -2.1F, -2.6F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(4, 14).addBox(-1.5F, -0.95F, -2.6F, 3.0F, 0.0F, 1.0F, 0.25F, false);
			earright = new ModelRenderer(this);
			earright.setRotationPoint(0.0F, 9.0F, 0.0F);
			Head.addChild(earright);
			earright.setTextureOffset(26, 14).addBox(-2.5F, -16.7F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			lower3 = new ModelRenderer(this);
			lower3.setRotationPoint(-1.5F, -16.2F, -1.1F);
			earright.addChild(lower3);
			setRotationAngle(lower3, 0.7854F, 0.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 1.1F, 0.5F);
			lower3.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(22, 25).addBox(-1.0F, -1.617F, 0.2935F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			tip = new ModelRenderer(this);
			tip.setRotationPoint(0.0F, -1.0F, -1.0F);
			earright.addChild(tip);
			tip.setTextureOffset(0, 27).addBox(-2.5F, -16.7F, -0.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			earleft = new ModelRenderer(this);
			earleft.setRotationPoint(0.0F, 9.0F, 0.0F);
			Head.addChild(earleft);
			earleft.setTextureOffset(16, 24).addBox(0.5F, -16.7F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			lower4 = new ModelRenderer(this);
			lower4.setRotationPoint(1.5F, -16.2F, -1.1F);
			earleft.addChild(lower4);
			setRotationAngle(lower4, 0.7854F, 0.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 1.1F, 0.5F);
			lower4.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(6, 18).addBox(-1.0F, -1.617F, 0.2935F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			tip2 = new ModelRenderer(this);
			tip2.setRotationPoint(0.0F, -1.0F, -1.0F);
			earleft.addChild(tip2);
			tip2.setTextureOffset(24, 19).addBox(0.5F, -16.7F, -0.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 25.0F, 0.0F);
			Body.setTextureOffset(0, 9).addBox(-2.5F, -15.25F, -1.5F, 5.0F, 5.0F, 3.0F, 0.0F, false);
			Body.setTextureOffset(18, 0).addBox(-1.9F, -14.3F, -1.75F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(24, 5).addBox(-1.5F, -14.7F, -1.75F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(16, 27).addBox(-0.5F, -10.2F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(6, 22).addBox(2.0F, -14.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(16, 19).addBox(-3.0F, -14.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(13, 14).addBox(-2.5F, -10.0F, -1.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);
			Body.setTextureOffset(28, 0).addBox(-0.5F, -15.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(1.75F, 10.51F, 0.0F);
			left_arm.setTextureOffset(18, 19).addBox(1.0F, -0.71F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(10, 19).addBox(1.0F, 2.54F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(16, 10).addBox(1.0F, 5.79F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(14, 0).addBox(1.5F, 2.29F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(13, 10).addBox(1.5F, 5.09F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-1.75F, 5.8888F, 5.1603F);
			left_arm.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.9599F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(23, 21).addBox(3.5F, -7.5F, 1.5F, 1.0F, 1.0F, 3.0F, 0.0F, true);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(4.0F, 6.79F, 0.0F);
			left_arm.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, -0.9599F);
			cube_r4.setTextureOffset(22, 10).addBox(-1.1F, -1.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			lowerarm2 = new ModelRenderer(this);
			lowerarm2.setRotationPoint(-2.25F, 13.49F, 0.0F);
			left_arm.addChild(lowerarm2);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-1.75F, 10.51F, 0.0F);
			right_arm.setTextureOffset(18, 19).addBox(-3.0F, -0.71F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(10, 19).addBox(-3.0F, 2.54F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(16, 10).addBox(-3.0F, 5.79F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(14, 0).addBox(-2.5F, 2.29F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm.setTextureOffset(13, 10).addBox(-2.5F, 5.09F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(1.75F, 5.8888F, 5.1603F);
			right_arm.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.9599F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(23, 21).addBox(-4.5F, -7.5F, 1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-4.0F, 6.79F, 0.0F);
			right_arm.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, 0.9599F);
			cube_r6.setTextureOffset(22, 10).addBox(-1.9F, -1.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			lowerarm3 = new ModelRenderer(this);
			lowerarm3.setRotationPoint(2.25F, 13.49F, 0.0F);
			right_arm.addChild(lowerarm3);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(1.6F, 16.5F, 0.0F);
			left_leg.setTextureOffset(0, 0).addBox(-0.6F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(14, 2).addBox(-0.6F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(8, 24).addBox(-1.1F, 0.75F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-1.6F, -0.1012F, 5.1603F);
			left_leg.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.9599F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(0, 17).addBox(0.9F, -2.5F, -5.5F, 1.0F, 1.0F, 4.0F, 0.0F, true);
			lower2 = new ModelRenderer(this);
			lower2.setRotationPoint(-3.0F, 7.5F, 0.0F);
			left_leg.addChild(lower2);
			lower2.setTextureOffset(0, 22).addBox(1.9F, -3.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(14, 5).addBox(1.4F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-1.6F, 16.5F, 0.0F);
			right_leg.setTextureOffset(0, 0).addBox(-0.4F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			right_leg.setTextureOffset(14, 2).addBox(-0.4F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_leg.setTextureOffset(8, 24).addBox(-0.9F, 0.75F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(1.6F, -0.1012F, 5.1603F);
			right_leg.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.9599F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(0, 17).addBox(-1.9F, -2.5F, -5.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			lower5 = new ModelRenderer(this);
			lower5.setRotationPoint(3.0F, 7.5F, 0.0F);
			right_leg.addChild(lower5);
			lower5.setTextureOffset(0, 22).addBox(-3.9F, -3.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);
			lower5.setTextureOffset(14, 5).addBox(-4.4F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
