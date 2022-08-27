
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

import net.mcreator.themultiverseoffreddys.entity.JumpForTicketsEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class JumpForTicketsRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(JumpForTicketsEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelJumpForTickets(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/jumpfortickets.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelJumpForTickets extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_arm_r1;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm_r2;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelJumpForTickets() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(-0.5131F, 2.0237F, 0.1771F);
			head.setTextureOffset(0, 16).addBox(-4.4869F, -12.0237F, -4.1771F, 10.0F, 1.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(28, 28).addBox(-4.4869F, -13.0237F, -3.1771F, 10.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 26).addBox(-4.4869F, -11.0237F, -3.1771F, 10.0F, 2.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(29, 9).addBox(-4.4869F, -9.0237F, -2.1771F, 10.0F, 2.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(24, 0).addBox(-4.4869F, -7.0237F, -1.1771F, 10.0F, 2.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-3.4869F, -11.0237F, -4.1771F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(36, 40).addBox(-2.4869F, -10.0237F, -4.3771F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(22, 40).addBox(1.5131F, -10.0237F, -4.3771F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 37).addBox(2.4131F, -7.0237F, -4.3771F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(37, 25).addBox(-3.3869F, -7.0237F, -4.3771F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-1.4869F, -12.357F, -1.1771F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, -0.1421F, 0.0597F, -0.0955F);
			head_r1.setTextureOffset(0, 6).addBox(-0.5F, -5.2667F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 0).addBox(-1.0F, -4.2667F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(50, 0).addBox(-1.5F, -1.2667F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(18, 36).addBox(-1.0F, 1.0F, -3.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(31, 45).addBox(-0.5F, 4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(43, 25).addBox(2.5F, 4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(28, 30).addBox(2.0F, 1.0F, -3.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(42, 37).addBox(-3.5F, 4.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(29, 18).addBox(-4.0F, 1.0F, -3.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(4, 6).addBox(-3.5F, 4.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 0).addBox(-4.0F, 1.0F, 2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(28, 26).addBox(-1.0F, 1.0F, 2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 4).addBox(-0.5F, 4.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 29).addBox(2.0F, 1.0F, 2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(29, 22).addBox(2.5F, 4.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(29, 18).addBox(-4.5F, 0.0F, -3.0F, 9.0F, 1.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 36).addBox(-3.5F, 0.0F, -2.0F, 7.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 26).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.5213F, 1.5606F, 0.1833F);
			setRotationAngle(left_arm, 0.0107F, -0.0024F, -0.7666F);
			left_arm.setTextureOffset(50, 37).addBox(-1.963F, -1.1524F, -1.6833F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm_r1 = new ModelRenderer(this);
			left_arm_r1.setRotationPoint(-0.063F, 2.8476F, -0.0633F);
			left_arm.addChild(left_arm_r1);
			setRotationAngle(left_arm_r1, 0.0F, 0.0F, 0.48F);
			left_arm_r1.setTextureOffset(0, 20).addBox(-0.6F, 9.0F, -0.52F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(0, 52).addBox(-0.1F, 6.0F, -0.12F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(4, 52).addBox(-1.1F, 4.0F, -1.12F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(8, 52).addBox(-0.1F, 2.0F, -0.12F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(12, 52).addBox(-1.1F, 0.0F, -1.12F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.5213F, 1.5606F, 0.1833F);
			setRotationAngle(right_arm, 0.0107F, 0.0024F, 0.7666F);
			right_arm.setTextureOffset(46, 47).addBox(-1.037F, -1.1524F, -1.6833F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm_r2 = new ModelRenderer(this);
			left_arm_r2.setRotationPoint(0.063F, 2.8476F, -0.0633F);
			right_arm.addChild(left_arm_r2);
			setRotationAngle(left_arm_r2, 0.0F, 0.0F, -0.48F);
			left_arm_r2.setTextureOffset(0, 16).addBox(-1.4F, 9.0F, -0.52F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm_r2.setTextureOffset(32, 8).addBox(-0.9F, 6.0F, -0.12F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			left_arm_r2.setTextureOffset(32, 12).addBox(0.1F, 4.0F, -1.12F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			left_arm_r2.setTextureOffset(0, 36).addBox(-0.9F, 2.0F, -0.12F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			left_arm_r2.setTextureOffset(24, 36).addBox(0.1F, 0.0F, -1.12F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 12.25F, -0.9167F);
			left_leg.setTextureOffset(34, 47).addBox(-1.5F, -0.25F, -0.5833F, 3.0F, 10.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(36, 39).addBox(-2.0F, 9.75F, -3.0833F, 4.0F, 2.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 12.25F, -0.9167F);
			right_leg.setTextureOffset(22, 45).addBox(-1.5F, -0.25F, -0.5833F, 3.0F, 10.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(22, 37).addBox(-2.0F, 9.75F, -3.0833F, 4.0F, 2.0F, 6.0F, 0.0F, false);
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
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
