
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

import net.mcreator.themultiverseoffreddys.entity.TamedMontyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedMontyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedMontyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMonty(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/monty.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMonty extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer tail;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelMonty() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(24, 20).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(30, 43).addBox(4.0F, -10.0F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(42, 35).addBox(-5.0F, -10.0F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 40).addBox(-2.5F, -12.5F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 19).addBox(-2.5F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 6).addBox(0.5F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 37).addBox(0.5F, -12.5F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 124).addBox(0.4F, -13.5F, -5.2F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 124).addBox(-3.4F, -13.5F, -5.2F, 3.0F, 3.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(44, 80).addBox(-1.0F, -17.0F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(44, 80).addBox(-1.0F, -16.0F, 1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(44, 80).addBox(-1.0F, -18.0F, -2.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(104, 118).addBox(-3.0F, -6.0F, -9.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(29, 121).addBox(-3.0F, -7.0F, -9.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(28, 112).addBox(-3.0F, -8.0F, -9.5F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 28).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(97, 65).addBox(-3.0F, -10.0F, -9.5F, 6.0F, 2.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(86, 121).addBox(-2.0F, -10.5F, -8.5F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(24, 33).addBox(-0.5F, -13.0F, -5.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 95).addBox(3.4F, -13.0F, -5.3F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 95).addBox(-4.4F, -13.0F, -5.3F, 1.0F, 1.0F, 4.0F, 0.0F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(26, 9).addBox(-5.5F, -6.0F, -3.0F, 11.0F, 5.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(26, 36).addBox(4.5F, -7.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(24, 29).addBox(-10.5F, -7.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 15).addBox(-5.0F, -1.0F, -3.0F, 10.0F, 7.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(42, 29).addBox(-4.5F, -5.0F, -3.5F, 9.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 43).addBox(-3.5F, 0.0F, -3.5F, 7.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 28).addBox(-6.0F, -5.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(5.0F, -5.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(49, 0).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(64, 34).addBox(-1.5F, -8.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(-3.0F, 5.0F, 1.0F);
			body.addChild(tail);
			setRotationAngle(tail, 0.5236F, 0.0F, 0.0F);
			tail.setTextureOffset(56, 16).addBox(1.0F, 1.4142F, -2.4142F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			tail.setTextureOffset(56, 16).addBox(1.0F, 13.4142F, -2.4142F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			tail.setTextureOffset(112, 0).addBox(1.0F, 7.4142F, -2.4142F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			tail.setTextureOffset(52, 67).addBox(1.5F, 6.4142F, -1.9142F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			tail.setTextureOffset(0, 66).addBox(1.5F, 12.4142F, -1.9142F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			tail.setTextureOffset(112, 0).addBox(1.0F, 19.4142F, -2.4142F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			tail.setTextureOffset(0, 66).addBox(1.5F, 18.4142F, -1.9142F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(56, 16).addBox(1.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(54, 0).addBox(1.0F, 3.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(52, 67).addBox(1.5F, 3.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 66).addBox(1.5F, 9.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(52, 35).addBox(1.0F, 10.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(48, 57).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(16, 51).addBox(-5.0F, 3.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(21, 67).addBox(-4.5F, 3.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(40, 46).addBox(-4.5F, 9.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(60, 53).addBox(-5.0F, 10.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(0, 45).addBox(-2.1F, 7.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(32, 54).addBox(-2.1F, 0.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(64, 50).addBox(-2.1F, 6.5F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(68, 15).addBox(-1.6F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(12, 66).addBox(-1.6F, 6.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 37).addBox(-2.6F, 14.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(16, 61).addBox(-3.1F, 14.0F, -6.0F, 6.0F, 2.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(48, 46).addBox(-1.9F, 7.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 56).addBox(-1.9F, 0.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(64, 61).addBox(-1.9F, 6.5F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(64, 67).addBox(-1.4F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(66, 0).addBox(-1.4F, 6.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(16, 43).addBox(-2.4F, 14.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(61, 25).addBox(-2.9F, 14.0F, -6.0F, 6.0F, 2.0F, 3.0F, 0.0F, false);
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
