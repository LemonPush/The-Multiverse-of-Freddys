
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

import net.mcreator.themultiverseoffreddys.entity.TamedScraptrapEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedScraptrapRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedScraptrapEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelScraptrap(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/scraptrap.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelScraptrap extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelScraptrap() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 2.9774F, 0.0366F);
			head.setTextureOffset(0, 16).addBox(-0.5F, -3.9774F, -0.5366F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(26, 35).addBox(-2.25F, -12.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(26, 33).addBox(-2.25F, -11.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 0).addBox(1.25F, -16.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 29).addBox(0.75F, -15.5774F, -0.5366F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 31).addBox(-3.0F, -8.4774F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(58, 6).addBox(-2.5F, -9.7274F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(58, 6).addBox(0.5F, -9.7274F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 27).addBox(1.0F, -8.4774F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.5F, -6.4774F, -4.0366F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(3.5F, -6.4774F, -4.0366F, 1.0F, 3.0F, 8.0F, 0.0F, true);
			head.setTextureOffset(0, 0).addBox(-3.5F, -11.4774F, -4.0366F, 7.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(48, 48).addBox(0.25F, -15.5274F, -1.0366F, 3.0F, 4.0F, 2.0F, 0.0F, true);
			head.setTextureOffset(43, 27).addBox(-2.5F, -7.4774F, -7.0366F, 5.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(48, 62).addBox(-3.0F, -5.4774F, -7.0366F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(20, 23).addBox(-2.5F, -10.4774F, -3.5366F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			head.setTextureOffset(13, 33).addBox(-2.0F, -5.9774F, -3.0366F, 4.0F, 2.0F, 5.0F, 0.25F, false);
			head.setTextureOffset(21, 16).addBox(-0.5F, -7.9274F, -5.8366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -4.4774F, -2.5366F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.3927F, 0.0F, 0.0F);
			head_r1.setTextureOffset(36, 23).addBox(-2.5F, -1.0F, -4.3F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			head_r1.setTextureOffset(44, 16).addBox(-2.5F, 0.0F, -4.3F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(1.75F, -15.3774F, -0.0366F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.5672F, 0.0F, 0.0F);
			head_r2.setTextureOffset(5, 0).addBox(-0.5F, -4.6F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(38, 41).addBox(-1.0F, -3.6F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(40, 48).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(46, 19).addBox(-2.5F, 0.3F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(16, 49).addBox(-1.5F, 6.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(46, 19).addBox(-2.5F, 8.0F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(16, 49).addBox(-1.5F, 3.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 8.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(31, 33).addBox(-3.5F, 0.75F, -2.75F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 19).addBox(-0.5F, 2.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 0).addBox(-3.5F, 8.5F, -2.0F, 7.0F, 3.0F, 4.0F, 0.25F, false);
			body.setTextureOffset(58, 50).addBox(-3.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(58, 0).addBox(-3.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(57, 16).addBox(-3.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(47, 39).addBox(1.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(20, 53).addBox(1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(56, 27).addBox(1.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(54, 25).addBox(1.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(51, 23).addBox(-5.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(26, 18).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.5F, 0.85F, 0.0F);
			left_arm.setTextureOffset(26, 49).addBox(1.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(14, 40).addBox(0.6F, -0.9F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(22, 55).addBox(1.5F, 3.85F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.5F, 0.85F, 0.0F);
			right_arm.setTextureOffset(8, 47).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 0).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(52, 11).addBox(-3.0F, 4.65F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(12, 29).addBox(-3.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(14, 40).addBox(-3.6F, -0.9F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(42, 41).addBox(-3.6F, 8.6F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(28, 41).addBox(-3.6F, 4.3F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(0, 46).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			left_leg.setTextureOffset(47, 31).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(48, 54).addBox(-1.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(0, 37).addBox(-1.5F, 6.3583F, -1.8333F, 3.0F, 5.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(38, 7).addBox(-1.5F, 0.9583F, -1.8333F, 3.0F, 5.0F, 4.0F, 0.25F, false);
			left_leg.setTextureOffset(0, 29).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(0, 46).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(47, 31).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(52, 39).addBox(-1.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_leg.setTextureOffset(26, 10).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, false);
			right_leg.setTextureOffset(0, 37).addBox(-1.5F, 6.3583F, -1.8333F, 3.0F, 5.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(38, 7).addBox(-1.5F, 0.9583F, -1.8333F, 3.0F, 5.0F, 4.0F, 0.25F, false);
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
