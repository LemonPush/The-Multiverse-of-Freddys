
package net.mcreator.themultiverseoffreddys.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.themultiverseoffreddys.entity.TposeEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TposeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TposeEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelTpose(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/fredbear_ucn.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelTpose extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelTpose() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -25.2936F, -0.2611F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.7064F, -3.7389F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(58, 50).addBox(-2.0F, -12.7064F, -1.7389F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 32).addBox(-3.0F, -9.7064F, -2.7389F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(49, 0).addBox(-4.0F, -0.7064F, -5.7389F, 8.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(49, 16).addBox(-4.0F, -1.7064F, -5.7389F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(30, 18).addBox(-4.0F, -4.2064F, -6.5389F, 8.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 60).addBox(-3.0F, -4.7064F, -6.2389F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(60, 19).addBox(-1.0F, -5.7064F, -6.2389F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(62, 57).addBox(-2.7F, -7.2064F, -4.2389F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(62, 4).addBox(0.7F, -7.2064F, -4.2389F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(34, 34).addBox(0.7F, -8.2064F, -3.9389F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(34, 34).addBox(-2.7F, -8.2064F, -3.9389F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 39).addBox(-5.0F, -4.2064F, -3.7389F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(31, 36).addBox(4.0F, -4.2064F, -3.7389F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-4.5F, -8.2064F, 0.2611F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.6109F);
			head_r1.setTextureOffset(0, 4).addBox(-3.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 16).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(4.5F, -8.2064F, 0.2611F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, -0.6109F);
			head_r2.setTextureOffset(0, 39).addBox(0.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 18).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -20.4231F, -1.7846F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 7.4231F, -0.7154F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, -4.5769F, -0.7154F, 10.0F, 11.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(53, 29).addBox(-4.0F, -1.5769F, -1.7154F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(57, 45).addBox(-3.5F, -2.5769F, -1.7154F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(43, 14).addBox(-3.5F, 5.4231F, -1.7154F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(59, 14).addBox(-3.0F, -3.5769F, -1.7154F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(61, 47).addBox(-1.0F, -4.0769F, -2.7154F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 50).addBox(1.0F, -4.5769F, -2.7154F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(43, 8).addBox(-3.0F, -4.5769F, -2.7154F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 32).addBox(-6.0F, -3.5769F, 0.9846F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 32).addBox(5.0F, -3.5769F, 0.9846F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(38, 59).addBox(-1.0F, 6.4231F, 0.9846F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(34, 47).addBox(-1.0F, -5.5769F, 0.9846F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-8.0F, 18.4231F, 1.7846F);
			body.addChild(right_arm);
			setRotationAngle(right_arm, 0.0F, 0.0F, 1.5708F);
			right_arm.setTextureOffset(18, 44).addBox(-23.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(46, 54).addBox(-23.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(0, 43).addBox(-22.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(10, 42).addBox(-22.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(57, 37).addBox(-23.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(8.0F, 18.4231F, 1.7846F);
			body.addChild(left_arm);
			setRotationAngle(left_arm, 0.0F, 0.0F, -1.5708F);
			left_arm.setTextureOffset(18, 44).addBox(19.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(46, 54).addBox(19.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 43).addBox(20.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(10, 42).addBox(20.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(57, 37).addBox(19.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 28.4231F, 1.7846F);
			body.addChild(right_leg);
			right_leg.setTextureOffset(50, 4).addBox(-1.9F, -10.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 50).addBox(-1.9F, -17.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(40, 29).addBox(-0.9F, -11.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(40, 26).addBox(-0.9F, -18.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(25, 8).addBox(-2.4F, -4.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 28.4231F, 1.7846F);
			body.addChild(left_leg);
			left_leg.setTextureOffset(48, 19).addBox(-2.1F, -10.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(45, 44).addBox(-2.1F, -17.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(40, 23).addBox(-1.1F, -11.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(10, 39).addBox(-1.1F, -18.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(22, 24).addBox(-2.6F, -4.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
