
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

import net.mcreator.themultiverseoffreddys.entity.BidybabEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BidybabRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BidybabEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBidybab(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/bidybab.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBidybab extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelBidybab() {
			textureWidth = 32;
			textureHeight = 32;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0375F, 13.6875F, -0.0437F);
			Head.setTextureOffset(0, 0).addBox(-3.0375F, -5.6875F, -2.4562F, 6.0F, 5.0F, 5.0F, 0.0F, false);
			Head.setTextureOffset(17, 3).addBox(-0.5375F, -3.3875F, -2.7063F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(22, 3).addBox(-0.2375F, -5.5875F, -2.8062F, 3.0F, 3.0F, 1.0F, -0.75F, false);
			Head.setTextureOffset(20, 17).addBox(-1.8875F, -2.9875F, -2.7563F, 4.0F, 2.0F, 1.0F, -0.75F, false);
			Head.setTextureOffset(20, 17).addBox(-1.8875F, -2.3875F, -2.7563F, 4.0F, 2.0F, 1.0F, -0.75F, false);
			Head.setTextureOffset(16, 21).addBox(-2.8375F, -5.5875F, -2.8062F, 3.0F, 3.0F, 1.0F, -0.75F, false);
			Head.setTextureOffset(22, 7).addBox(-2.3375F, -5.0875F, -2.5062F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(22, 7).addBox(0.2625F, -5.0875F, -2.5062F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			Head.setTextureOffset(0, 0).addBox(2.4625F, -3.6875F, -0.4562F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(13, 10).addBox(-3.5375F, -3.6875F, -0.4562F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 16.3333F, -0.4167F);
			Body.setTextureOffset(17, 0).addBox(-2.0F, 1.6667F, -0.5833F, 4.0F, 1.0F, 2.0F, 0.25F, false);
			Body.setTextureOffset(0, 10).addBox(-2.5F, -3.3333F, -1.0833F, 5.0F, 5.0F, 3.0F, 0.0F, false);
			Body.setTextureOffset(0, 2).addBox(-0.5F, -1.8333F, -1.3333F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(2.5F, 14.25F, 0.0F);
			left_arm.setTextureOffset(8, 21).addBox(0.0F, 3.75F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(16, 10).addBox(0.0F, -1.25F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-2.5F, 14.25F, 0.0F);
			right_arm.setTextureOffset(8, 21).addBox(-2.0F, 3.75F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(16, 10).addBox(-2.0F, -1.25F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(1.25F, 19.35F, -0.25F);
			left_leg.setTextureOffset(0, 18).addBox(-1.0F, -0.15F, -0.75F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(13, 17).addBox(-1.0F, 3.65F, -1.75F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-1.25F, 19.35F, -0.25F);
			right_leg.setTextureOffset(0, 18).addBox(-1.0F, -0.15F, -0.75F, 2.0F, 4.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(13, 17).addBox(-1.0F, 3.65F, -1.75F, 2.0F, 1.0F, 3.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
			this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
