
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

import net.mcreator.themultiverseoffreddys.entity.TamedPiranhaPlushtrapEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedPiranhaPlushtrapRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedPiranhaPlushtrapEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPiranha_Plushtrap(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/piranha_plushtrap.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelPiranha_Plushtrap extends EntityModel<Entity> {
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
		private final ModelRenderer right_arm;
		private final ModelRenderer lowerarm3;
		private final ModelRenderer left_arm;
		private final ModelRenderer lowerarm2;
		private final ModelRenderer right_leg;
		private final ModelRenderer lower;
		private final ModelRenderer left_leg;
		private final ModelRenderer lower2;

		public ModelPiranha_Plushtrap() {
			textureWidth = 64;
			textureHeight = 64;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 10.0F, -0.5F);
			Head.setTextureOffset(0, 12).addBox(-2.5F, -5.7F, -1.5F, 5.0F, 3.0F, 4.0F, 0.0F, false);
			Head.setTextureOffset(24, 29).addBox(2.5F, -5.7F, 0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 29).addBox(-4.5F, -5.7F, 0.5F, 2.0F, 3.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(0, 0).addBox(-2.5F, -3.2F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(0, 6).addBox(-2.5F, -1.2F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(0, 24).addBox(-2.5F, -2.2F, 0.5F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(14, 12).addBox(-2.5F, -2.2F, -2.5F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 14).addBox(-1.5F, -5.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			Head.setTextureOffset(0, 12).addBox(0.5F, -5.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			earright = new ModelRenderer(this);
			earright.setRotationPoint(0.0F, 9.0F, 0.0F);
			Head.addChild(earright);
			earright.setTextureOffset(0, 32).addBox(-2.5F, -16.7F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			lower3 = new ModelRenderer(this);
			lower3.setRotationPoint(-1.5F, -16.2F, -1.1F);
			earright.addChild(lower3);
			setRotationAngle(lower3, 0.7854F, 0.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 1.1F, 0.5F);
			lower3.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(31, 19).addBox(-1.0F, -1.617F, 0.2935F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			tip = new ModelRenderer(this);
			tip.setRotationPoint(0.0F, -1.0F, -1.0F);
			earright.addChild(tip);
			tip.setTextureOffset(6, 32).addBox(-2.5F, -16.7F, -0.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			earleft = new ModelRenderer(this);
			earleft.setRotationPoint(0.0F, 9.0F, 0.0F);
			Head.addChild(earleft);
			earleft.setTextureOffset(31, 2).addBox(0.5F, -16.7F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			lower4 = new ModelRenderer(this);
			lower4.setRotationPoint(1.5F, -16.2F, -1.1F);
			earleft.addChild(lower4);
			setRotationAngle(lower4, 0.7854F, 0.0F, 0.0F);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 1.1F, 0.5F);
			lower4.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(30, 29).addBox(-1.0F, -1.617F, 0.2935F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			tip2 = new ModelRenderer(this);
			tip2.setRotationPoint(0.0F, -1.0F, -1.0F);
			earleft.addChild(tip2);
			tip2.setTextureOffset(31, 5).addBox(0.5F, -16.7F, -0.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 25.0F, 0.0F);
			Body.setTextureOffset(15, 16).addBox(-2.5F, -15.25F, -1.5F, 5.0F, 5.0F, 3.0F, 0.0F, false);
			Body.setTextureOffset(14, 24).addBox(-2.0F, -14.3F, -1.65F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(28, 0).addBox(-1.5F, -15.3F, -1.65F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 21).addBox(-0.5F, -10.2F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(10, 19).addBox(2.0F, -14.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 19).addBox(-3.0F, -14.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(15, 0).addBox(-2.5F, -10.0F, -1.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);
			Body.setTextureOffset(10, 21).addBox(-0.5F, -15.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-1.75F, 10.51F, 0.0F);
			right_arm.setTextureOffset(25, 5).addBox(-3.0F, -0.71F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(24, 24).addBox(-3.0F, 2.54F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(28, 15).addBox(-3.0F, 5.79F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(0, 9).addBox(-2.5F, 2.29F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm.setTextureOffset(0, 3).addBox(-2.5F, 5.09F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm.setTextureOffset(30, 23).addBox(-5.0F, 2.99F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			right_arm.setTextureOffset(30, 23).addBox(-5.0F, -0.01F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			lowerarm3 = new ModelRenderer(this);
			lowerarm3.setRotationPoint(2.25F, 13.49F, 0.0F);
			right_arm.addChild(lowerarm3);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(1.75F, 10.51F, 0.0F);
			left_arm.setTextureOffset(25, 5).addBox(1.0F, -0.71F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(30, 23).addBox(3.0F, -0.01F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(30, 23).addBox(3.0F, 2.99F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(24, 24).addBox(1.0F, 2.54F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(28, 15).addBox(1.0F, 5.79F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 9).addBox(1.5F, 2.29F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 3).addBox(1.5F, 5.09F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lowerarm2 = new ModelRenderer(this);
			lowerarm2.setRotationPoint(-2.25F, 13.49F, 0.0F);
			left_arm.addChild(lowerarm2);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-1.6F, 16.5F, 0.0F);
			right_leg.setTextureOffset(0, 6).addBox(-0.4F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(15, 8).addBox(-0.4F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(27, 10).addBox(-0.9F, 0.75F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(30, 23).addBox(-2.85F, 4.5F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			right_leg.setTextureOffset(30, 23).addBox(-2.85F, 1.5F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			lower = new ModelRenderer(this);
			lower.setRotationPoint(3.0F, 7.5F, 0.0F);
			right_leg.addChild(lower);
			lower.setTextureOffset(16, 29).addBox(-3.9F, -3.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(0, 19).addBox(-4.4F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(1.6F, 16.5F, 0.0F);
			left_leg.setTextureOffset(0, 0).addBox(-0.6F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(15, 6).addBox(-0.6F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(8, 27).addBox(-1.1F, 0.75F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(30, 23).addBox(0.85F, 1.5F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(30, 23).addBox(0.85F, 4.5F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			lower2 = new ModelRenderer(this);
			lower2.setRotationPoint(-3.0F, 7.5F, 0.0F);
			left_leg.addChild(lower2);
			lower2.setTextureOffset(0, 27).addBox(1.9F, -3.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(15, 6).addBox(1.4F, -1.0F, -3.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
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
