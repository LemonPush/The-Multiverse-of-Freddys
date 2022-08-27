
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

import net.mcreator.themultiverseoffreddys.entity.TamedFreddleEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedFreddleRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedFreddleEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelFreddle(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/freddle.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFreddle extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer earright;
		private final ModelRenderer lower3;
		private final ModelRenderer tip;
		private final ModelRenderer earleft;
		private final ModelRenderer lower4;
		private final ModelRenderer tip2;
		private final ModelRenderer Body;
		private final ModelRenderer bone;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer lower5;
		private final ModelRenderer right_leg;
		private final ModelRenderer lower6;

		public ModelFreddle() {
			textureWidth = 32;
			textureHeight = 32;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 13.3F, -0.5F);
			Head.setTextureOffset(0, 0).addBox(-2.0F, -4.7F, -1.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(17, 22).addBox(-0.5F, -3.1F, -2.4F, 1.0F, 1.0F, 1.0F, -0.25F, false);
			Head.setTextureOffset(19, 25).addBox(1.5F, -5.7F, -0.3F, 1.0F, 1.0F, 1.0F, -0.25F, false);
			Head.setTextureOffset(19, 25).addBox(-2.5F, -5.7F, -0.3F, 1.0F, 1.0F, 1.0F, -0.25F, true);
			Head.setTextureOffset(0, 22).addBox(-1.5F, -4.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(21, 17).addBox(0.5F, -4.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(11, 0).addBox(-2.0F, -2.7F, -2.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(24, 24).addBox(-1.5F, -2.2F, -2.1F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			earright = new ModelRenderer(this);
			earright.setRotationPoint(0.0F, 9.0F, 0.0F);
			Head.addChild(earright);
			earright.setTextureOffset(7, 23).addBox(-2.5F, -14.7F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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
			earleft.setTextureOffset(0, 25).addBox(1.5F, -14.7F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			earleft.setTextureOffset(12, 8).addBox(-1.0F, -14.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			earleft.setTextureOffset(14, 21).addBox(-0.5F, -15.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lower4 = new ModelRenderer(this);
			lower4.setRotationPoint(1.5F, -16.2F, -1.1F);
			earleft.addChild(lower4);
			setRotationAngle(lower4, 0.7854F, 0.0F, 0.0F);
			tip2 = new ModelRenderer(this);
			tip2.setRotationPoint(0.0F, -1.0F, -1.0F);
			earleft.addChild(tip2);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 25.0F, 0.0F);
			Body.setTextureOffset(10, 15).addBox(-1.5F, -11.5F, -1.15F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(18, 3).addBox(-1.1F, -11.9F, -1.15F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(7, 14).addBox(-0.5F, -11.7F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(11, 22).addBox(-0.5F, -8.2F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(22, 5).addBox(2.0F, -11.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(18, 5).addBox(-3.0F, -11.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body.setTextureOffset(0, 7).addBox(-2.0F, -12.2F, -1.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(10, 11).addBox(-2.0F, -8.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			Body.setTextureOffset(23, 9).addBox(-0.5F, -12.7F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -0.7F, 0.0F);
			Body.addChild(bone);
			bone.setTextureOffset(18, 15).addBox(0.5F, -11.45F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(7, 18).addBox(-1.5F, -11.45F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(2.0F, 13.3333F, 0.0F);
			left_arm.setTextureOffset(20, 20).addBox(0.5F, -0.3333F, -0.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);
			left_arm.setTextureOffset(21, 0).addBox(0.5F, 2.1667F, -0.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);
			left_arm.setTextureOffset(21, 14).addBox(0.5F, 4.6667F, -0.5F, 1.0F, 1.0F, 1.0F, 0.5F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-2.0F, 13.3333F, 0.0F);
			right_arm.setTextureOffset(20, 10).addBox(-1.5F, -0.3333F, -0.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);
			right_arm.setTextureOffset(20, 7).addBox(-1.5F, 2.1667F, -0.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);
			right_arm.setTextureOffset(8, 21).addBox(-1.5F, 4.6667F, -0.5F, 1.0F, 1.0F, 1.0F, 0.5F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(1.0F, 19.0F, 0.0F);
			lower5 = new ModelRenderer(this);
			lower5.setRotationPoint(-2.4F, 5.0F, 0.0F);
			left_leg.addChild(lower5);
			lower5.setTextureOffset(4, 20).addBox(1.9F, -3.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			lower5.setTextureOffset(11, 19).addBox(1.9F, -5.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);
			lower5.setTextureOffset(0, 13).addBox(1.4F, -1.0F, -2.2F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-1.0F, 19.0F, 0.0F);
			lower6 = new ModelRenderer(this);
			lower6.setRotationPoint(2.4F, 5.0F, 0.0F);
			right_leg.addChild(lower6);
			lower6.setTextureOffset(0, 19).addBox(-2.9F, -2.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);
			lower6.setTextureOffset(17, 18).addBox(-2.9F, -5.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);
			lower6.setTextureOffset(11, 4).addBox(-3.4F, -1.0F, -2.2F, 2.0F, 1.0F, 3.0F, 0.0F, false);
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
