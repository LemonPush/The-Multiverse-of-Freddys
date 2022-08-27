
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

import net.mcreator.themultiverseoffreddys.entity.MeltedChocolateBonnieEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MeltedChocolateBonnieRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MeltedChocolateBonnieEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelmelted_chocolate_bonnie(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/melted_chocolate_bonnie.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelmelted_chocolate_bonnie extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_arm;

		public Modelmelted_chocolate_bonnie() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(49, 0).addBox(-3.4F, -6.0F, -6.0F, 7.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(40, 27).addBox(-4.4F, -6.0F, -6.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(40, 27).addBox(3.4F, -6.0F, -6.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);
			head.setTextureOffset(52, 37).addBox(-3.4F, -7.0F, -6.0F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 55).addBox(-3.5F, -9.5F, -6.8F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(25, 17).addBox(-3.0F, -10.0F, -6.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(28, 45).addBox(-1.0F, -11.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(45, 27).addBox(-2.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 34).addBox(-5.0F, -9.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 32).addBox(4.0F, -9.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(10, 34).addBox(1.5F, -14.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(28, 62).addBox(0.5F, -18.5F, -0.9F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(10, 32).addBox(1.5F, -19.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 60).addBox(-3.5F, -18.5F, -0.9F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(24, 0).addBox(-2.5F, -19.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 2).addBox(-2.5F, -14.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(2.0F, -22.0F, -0.4F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.3927F, 0.0F, 0.0F);
			head_r1.setTextureOffset(30, 21).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(62, 61).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(52, 13).addBox(-4.0F, -3.0F, -3.5F, 8.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 53).addBox(-3.5F, -4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(62, 4).addBox(-0.5F, 3.0F, -3.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 40).addBox(-3.5F, 3.0F, -3.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 26).addBox(-3.0F, -5.0F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(43, 8).addBox(-1.0F, -5.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(43, 8).addBox(-2.5F, -4.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(43, 8).addBox(0.9F, -5.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(1.0F, -6.0F, -4.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 40).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(40, 54).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(56, 49).addBox(-1.0F, -6.0F, -0.8F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(28, 34).addBox(1.0F, 2.0F, -0.8F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(28, 34).addBox(-5.0F, 2.0F, -0.8F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(12, 43).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(48, 27).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(50, 4).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(10, 60).addBox(2.0F, 5.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 32).addBox(2.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(28, 54).addBox(1.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(16, 45).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(32, 44).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(48, 49).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 15.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(56, 20).addBox(-1.4F, 14.5F, -4.0F, 3.0F, 1.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(43, 11).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(25, 8).addBox(-2.4F, 15.0F, -5.0F, 5.0F, 1.0F, 8.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(0, 43).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(40, 17).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(20, 55).addBox(-1.1F, 1.0F, -1.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(28, 38).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(22, 24).addBox(-2.6F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(36, 34).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(48, 40).addBox(-5.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(38, 62).addBox(-4.0F, 6.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 0).addBox(-4.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(10, 32).addBox(-5.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
