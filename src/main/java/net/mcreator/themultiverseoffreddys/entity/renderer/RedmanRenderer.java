
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

import net.mcreator.themultiverseoffreddys.entity.RedmanEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RedmanRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RedmanEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelRedman(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/redman.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelRedman extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer bone17;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer bone16;
		private final ModelRenderer left_arm;
		private final ModelRenderer bone12;
		private final ModelRenderer right_leg;
		private final ModelRenderer bone;
		private final ModelRenderer bone2;
		private final ModelRenderer left_leg;
		private final ModelRenderer bone3;
		private final ModelRenderer bone4;
		private final ModelRenderer left_leg2;
		private final ModelRenderer bone5;
		private final ModelRenderer bone6;
		private final ModelRenderer right_leg2;
		private final ModelRenderer bone9;
		private final ModelRenderer bone10;

		public ModelRedman() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -5.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-3.0F, -8.0F, -4.0F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(18, 19).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(26, 13).addBox(-1.0F, -5.0F, -8.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, -8.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bone17 = new ModelRenderer(this);
			bone17.setRotationPoint(0.0F, -1.0F, -3.8F);
			head.addChild(bone17);
			setRotationAngle(bone17, 0.6981F, 0.0F, 0.0F);
			bone17.setTextureOffset(8, 19).addBox(-1.0F, -1.0F, -4.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 19).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(18, 0).addBox(-6.0F, 5.0F, -0.5F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(8, 27).addBox(-6.0F, 5.0F, -4.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(8, 27).addBox(-6.0F, 2.0F, -4.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(8, 27).addBox(-6.0F, -1.0F, -4.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(8, 27).addBox(5.0F, -1.0F, -4.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(8, 27).addBox(5.0F, 2.0F, -4.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(8, 27).addBox(5.0F, 5.0F, -4.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 17).addBox(-6.0F, 2.0F, -0.5F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 15).addBox(-6.0F, -1.0F, -0.5F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 13).addBox(-6.0F, -4.0F, -0.5F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.8F, -3.4F, 0.0F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.6109F);
			bone16 = new ModelRenderer(this);
			bone16.setRotationPoint(-1.4725F, -0.1886F, -0.3831F);
			right_arm.addChild(bone16);
			setRotationAngle(bone16, -0.48F, 0.0F, 0.0873F);
			bone16.setTextureOffset(24, 2).addBox(-0.2385F, -0.5881F, -0.7608F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.8F, -1.4F, 0.0F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.6109F);
			bone12 = new ModelRenderer(this);
			bone12.setRotationPoint(1.8005F, -2.4005F, -0.3831F);
			left_arm.addChild(bone12);
			setRotationAngle(bone12, -0.48F, 0.0F, -0.0873F);
			bone12.setTextureOffset(24, 24).addBox(-1.7615F, -0.5881F, -0.7608F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 9.5F, -2.0F);
			right_leg.setTextureOffset(32, 19).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 8.0F, 0.0F);
			right_leg.addChild(bone);
			setRotationAngle(bone, -0.3491F, 0.0F, 0.3491F);
			bone.setTextureOffset(16, 37).addBox(-1.8681F, -4.0321F, -1.7856F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-2.0F, 10.0F, -2.0F);
			right_leg.addChild(bone2);
			bone2.setTextureOffset(36, 33).addBox(-0.2F, -1.5F, -0.3F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 9.5F, -2.0F);
			left_leg.setTextureOffset(8, 32).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.0F, 8.0F, 0.0F);
			left_leg.addChild(bone3);
			setRotationAngle(bone3, -0.3491F, 0.0F, -0.3491F);
			bone3.setTextureOffset(36, 26).addBox(0.8681F, -4.0321F, -1.7856F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(2.0F, 10.0F, -2.0F);
			left_leg.addChild(bone4);
			bone4.setTextureOffset(28, 35).addBox(-0.8F, -1.5F, -0.3F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			left_leg2 = new ModelRenderer(this);
			left_leg2.setRotationPoint(2.0F, 9.5F, 2.0F);
			left_leg2.setTextureOffset(32, 2).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			bone5 = new ModelRenderer(this);
			bone5.setRotationPoint(0.0F, 8.0F, 0.0F);
			left_leg2.addChild(bone5);
			setRotationAngle(bone5, 0.3491F, 0.0F, -0.3491F);
			bone5.setTextureOffset(24, 35).addBox(0.8681F, -4.0321F, 0.7856F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			bone6 = new ModelRenderer(this);
			bone6.setRotationPoint(2.0F, 10.0F, 2.0F);
			left_leg2.addChild(bone6);
			bone6.setTextureOffset(34, 9).addBox(-0.8F, -1.5F, -0.7F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			right_leg2 = new ModelRenderer(this);
			right_leg2.setRotationPoint(-2.0F, 9.5F, 2.0F);
			right_leg2.setTextureOffset(16, 30).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			bone9 = new ModelRenderer(this);
			bone9.setRotationPoint(0.0F, 8.0F, 0.0F);
			right_leg2.addChild(bone9);
			setRotationAngle(bone9, 0.3491F, 0.0F, 0.3491F);
			bone9.setTextureOffset(32, 33).addBox(-1.8681F, -4.0321F, 0.7856F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			bone10 = new ModelRenderer(this);
			bone10.setRotationPoint(-2.0F, 10.0F, 2.0F);
			right_leg2.addChild(bone10);
			bone10.setTextureOffset(32, 26).addBox(-0.2F, -1.5F, -0.7F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.right_leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
