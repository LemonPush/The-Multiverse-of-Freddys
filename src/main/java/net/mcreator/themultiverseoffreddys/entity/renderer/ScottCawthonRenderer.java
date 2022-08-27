
package net.mcreator.themultiverseoffreddys.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.themultiverseoffreddys.entity.ScottCawthonEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ScottCawthonRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ScottCawthonEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelScott_Cawthon(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/scott_cawthon.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("ultimate_fnaf_mod:textures/entities/scott_cawthon_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelScott_Cawthon extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer arm;
		private final ModelRenderer bone3;
		private final ModelRenderer right_arm;
		private final ModelRenderer arm2;
		private final ModelRenderer bone4;
		private final ModelRenderer left_leg;
		private final ModelRenderer leg;
		private final ModelRenderer bone;
		private final ModelRenderer right_leg;
		private final ModelRenderer leg2;
		private final ModelRenderer bone2;

		public ModelScott_Cawthon() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -33.0F, 5.6F);
			head.setTextureOffset(40, 46).addBox(-6.0F, -13.0F, -6.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -17.5F, 5.6F);
			body.setTextureOffset(0, 0).addBox(-10.0F, -15.5F, -8.0F, 20.0F, 18.0F, 16.0F, 0.0F, false);
			body.setTextureOffset(56, 0).addBox(-9.5F, 2.5F, -4.0F, 19.0F, 8.0F, 8.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(9.3886F, -30.3086F, 5.2514F);
			arm = new ModelRenderer(this);
			arm.setRotationPoint(11.0F, 18.0F, -3.0F);
			left_arm.addChild(arm);
			setRotationAngle(arm, -2.7609F, -0.1302F, 2.7488F);
			arm.setTextureOffset(64, 26).addBox(-4.0F, -11.5F, -4.0F, 8.0F, 12.0F, 8.0F, 0.0F, false);
			arm.setTextureOffset(0, 58).addBox(-5.0F, 0.5F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-13.9582F, -8.6661F, 0.5964F);
			arm.addChild(bone3);
			setRotationAngle(bone3, -0.48F, 0.0F, 0.0F);
			bone3.setTextureOffset(64, 26).addBox(9.9582F, -14.6587F, -5.7063F, 8.0F, 12.0F, 8.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-9.3886F, -30.3086F, 5.2514F);
			arm2 = new ModelRenderer(this);
			arm2.setRotationPoint(-11.0F, 18.0F, -3.0F);
			right_arm.addChild(arm2);
			setRotationAngle(arm2, -2.7609F, 0.1302F, -2.7488F);
			arm2.setTextureOffset(64, 26).addBox(-4.0F, -11.5F, -4.0F, 8.0F, 12.0F, 8.0F, 0.0F, true);
			arm2.setTextureOffset(0, 58).addBox(-5.0F, 0.5F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, true);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(13.9582F, -8.6661F, 0.5964F);
			arm2.addChild(bone4);
			setRotationAngle(bone4, -0.48F, 0.0F, 0.0F);
			bone4.setTextureOffset(64, 26).addBox(-17.9582F, -14.6587F, -5.7063F, 8.0F, 12.0F, 8.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(5.5F, -8.0F, 6.0F);
			left_leg.setTextureOffset(0, 34).addBox(-5.0F, 24.0F, -14.0F, 10.0F, 8.0F, 16.0F, 0.0F, false);
			leg = new ModelRenderer(this);
			leg.setRotationPoint(-7.4F, 20.0F, -3.5F);
			left_leg.addChild(leg);
			setRotationAngle(leg, 0.1745F, 0.0F, 0.0F);
			leg.setTextureOffset(64, 26).addBox(3.4F, -7.5333F, -3.2659F, 8.0F, 12.0F, 8.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(19.4F, -6.0F, -3.5F);
			leg.addChild(bone);
			setRotationAngle(bone, -0.48F, 0.0F, 0.0F);
			bone.setTextureOffset(64, 26).addBox(-16.0F, -15.7356F, -0.821F, 8.0F, 12.0F, 8.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-5.5F, -8.0F, 6.0F);
			right_leg.setTextureOffset(0, 34).addBox(-5.0F, 24.0F, -14.0F, 10.0F, 8.0F, 16.0F, 0.0F, true);
			leg2 = new ModelRenderer(this);
			leg2.setRotationPoint(7.4F, 20.0F, -3.5F);
			right_leg.addChild(leg2);
			setRotationAngle(leg2, 0.1745F, 0.0F, 0.0F);
			leg2.setTextureOffset(64, 26).addBox(-11.4F, -7.5333F, -3.2659F, 8.0F, 12.0F, 8.0F, 0.0F, true);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-19.4F, -6.0F, -3.5F);
			leg2.addChild(bone2);
			setRotationAngle(bone2, -0.48F, 0.0F, 0.0F);
			bone2.setTextureOffset(64, 26).addBox(8.0F, -15.7356F, -0.821F, 8.0F, 12.0F, 8.0F, 0.0F, true);
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
