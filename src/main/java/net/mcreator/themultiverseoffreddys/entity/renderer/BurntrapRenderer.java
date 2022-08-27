
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

import net.mcreator.themultiverseoffreddys.entity.BurntrapEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BurntrapRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BurntrapEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBurntrap(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/burntrap.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBurntrap extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelBurntrap() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 2.9774F, 0.0366F);
			head.setTextureOffset(50, 14).addBox(-1.0F, -3.9774F, -1.0366F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(32, 25).addBox(-3.5F, -10.9774F, -1.0366F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(34, 14).addBox(-2.25F, -16.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(13, 26).addBox(-2.25F, -11.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 23).addBox(1.15F, -16.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 25).addBox(1.25F, -11.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(34, 11).addBox(-1.0F, -9.4774F, 1.9634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 32).addBox(-1.0F, -10.9774F, 0.9634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 3).addBox(-3.0F, -8.4774F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 17).addBox(-3.5F, -8.4774F, -2.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 3).addBox(-2.5F, -9.7274F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 0).addBox(0.5F, -9.7274F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(6, 30).addBox(1.0F, -8.4774F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(13, 23).addBox(1.5F, -8.4774F, -2.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -11.4774F, -4.0366F, 8.0F, 5.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(46, 19).addBox(-3.25F, -15.4774F, -1.0366F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(46, 39).addBox(0.25F, -15.4774F, -1.0366F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(41, 28).addBox(-3.0F, -7.4774F, -6.0366F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 13).addBox(-2.5F, -10.4774F, -3.5366F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			head.setTextureOffset(0, 23).addBox(-2.0F, -5.9774F, -3.5366F, 4.0F, 2.0F, 5.0F, 0.25F, false);
			head.setTextureOffset(16, 13).addBox(-0.5F, -7.9274F, -5.8366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(1.85F, -15.3774F, 0.2634F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.5672F, 0.0F, 0.0F);
			head_r1.setTextureOffset(48, 9).addBox(-1.6F, -3.6F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(1.75F, -15.3774F, -0.0366F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.5672F, 0.0F, 0.0F);
			head_r2.setTextureOffset(16, 15).addBox(-0.5F, -4.4F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 13).addBox(-1.0F, -3.4F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 46).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(38, 37).addBox(-1.0F, 1.0F, -0.2F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(32, 7).addBox(-3.0F, 0.0F, -1.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(22, 49).addBox(-1.5F, 6.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(44, 35).addBox(-2.5F, 8.0F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(14, 47).addBox(-1.5F, 3.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(28, 19).addBox(-4.0F, 0.0F, 1.5F, 8.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(28, 19).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(3.0F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(8, 32).addBox(-3.5F, 0.75F, -2.75F, 7.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(16, 13).addBox(-3.5F, 9.3F, -2.0F, 7.0F, 2.0F, 4.0F, 0.25F, false);
			body.setTextureOffset(16, 43).addBox(-3.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(16, 41).addBox(-3.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(14, 37).addBox(1.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(16, 39).addBox(1.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(48, 25).addBox(1.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(47, 7).addBox(-5.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(15, 27).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.5F, 0.85F, 0.0F);
			left_arm.setTextureOffset(30, 37).addBox(1.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(14, 51).addBox(1.0F, 1.4F, -1.0F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(42, 0).addBox(0.5F, 4.3F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(44, 49).addBox(1.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.5F, 0.85F, 0.0F);
			right_arm.setTextureOffset(8, 37).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(8, 49).addBox(-3.0F, 0.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(36, 48).addBox(-3.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(22, 35).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(38, 11).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(50, 51).addBox(-1.0F, 5.7083F, -0.8333F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(30, 50).addBox(-1.0F, 7.7083F, -0.8333F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(36, 0).addBox(-1.0F, 9.7083F, -0.8333F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(31, 28).addBox(-1.5F, 0.9583F, -1.8333F, 3.0F, 5.0F, 4.0F, 0.25F, false);
			left_leg.setTextureOffset(16, 19).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(0, 30).addBox(-1.0F, -2.0417F, -0.8333F, 2.0F, 14.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(43, 45).addBox(-1.5F, 3.9583F, -1.3333F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(45, 31).addBox(-1.5F, 1.9583F, -1.3333F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(50, 51).addBox(-1.0F, 5.7083F, -0.8333F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_leg.setTextureOffset(51, 0).addBox(-1.0F, 7.7083F, -0.8333F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_leg.setTextureOffset(30, 50).addBox(-1.0F, 9.7083F, -0.8333F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_leg.setTextureOffset(24, 0).addBox(-1.5F, 11.7083F, -3.8333F, 3.0F, 1.0F, 6.0F, 0.0F, false);
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
