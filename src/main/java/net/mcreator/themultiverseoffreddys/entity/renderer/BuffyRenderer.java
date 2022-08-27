
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

import net.mcreator.themultiverseoffreddys.entity.BuffyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BuffyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BuffyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBuff_Helpy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/buff_helpy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBuff_Helpy extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer earright;
		private final ModelRenderer lower3;
		private final ModelRenderer tip;
		private final ModelRenderer earleft;
		private final ModelRenderer lower4;
		private final ModelRenderer tip2;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelBuff_Helpy() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, -7.4786F, -3.0143F);
			Head.setTextureOffset(54, 11).addBox(-3.5F, -4.5214F, -2.9857F, 7.0F, 3.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(0, 57).addBox(-3.0F, -8.5214F, -2.9857F, 6.0F, 4.0F, 6.0F, 0.0F, false);
			Head.setTextureOffset(34, 21).addBox(-2.5F, -7.2214F, -3.0857F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 24).addBox(0.5F, -7.2214F, -3.0857F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(14, 25).addBox(-2.5F, -8.2214F, -3.0857F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(20, 25).addBox(0.5F, -8.2214F, -3.0857F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 21).addBox(2.8F, -10.4214F, -0.4857F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 6).addBox(-4.8F, -10.4214F, -0.4857F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(14, 21).addBox(-1.5F, -9.4214F, -1.4857F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			Head.setTextureOffset(0, 0).addBox(-1.0F, -11.4214F, -0.9857F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(45, 0).addBox(-2.5F, -5.0214F, -5.0857F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(34, 24).addBox(-0.5F, -5.7214F, -5.5857F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(0, 4).addBox(-1.5F, -3.2214F, -4.9857F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(18, 57).addBox(-2.5F, -2.5214F, -5.0857F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			earright = new ModelRenderer(this);
			earright.setRotationPoint(0.0F, 6.5786F, -0.4857F);
			Head.addChild(earright);
			lower3 = new ModelRenderer(this);
			lower3.setRotationPoint(-1.5F, -16.2F, -1.1F);
			earright.addChild(lower3);
			setRotationAngle(lower3, 0.7854F, 0.0F, 0.0F);
			tip = new ModelRenderer(this);
			tip.setRotationPoint(0.0F, -1.0F, -1.0F);
			earright.addChild(tip);
			earleft = new ModelRenderer(this);
			earleft.setRotationPoint(0.0F, 6.5786F, -0.4857F);
			Head.addChild(earleft);
			lower4 = new ModelRenderer(this);
			lower4.setRotationPoint(1.5F, -16.2F, -1.1F);
			earleft.addChild(lower4);
			setRotationAngle(lower4, 0.7854F, 0.0F, 0.0F);
			tip2 = new ModelRenderer(this);
			tip2.setRotationPoint(0.0F, -1.0F, -1.0F);
			earleft.addChild(tip2);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -7.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-9.0F, -2.0F, -5.0F, 18.0F, 12.0F, 9.0F, 0.0F, false);
			body.setTextureOffset(54, 0).addBox(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, 0.5F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(0.0F, -7.0F, 0.0F);
			right_arm.setTextureOffset(20, 21).addBox(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(0.0F, -7.0F, 0.0F);
			left_arm.setTextureOffset(0, 21).addBox(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(4.0F, 11.0F, 0.0F);
			right_leg.setTextureOffset(40, 42).addBox(-11.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(-5.0F, 11.0F, 0.0F);
			left_leg.setTextureOffset(40, 21).addBox(6.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
