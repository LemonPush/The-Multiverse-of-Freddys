
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

import net.mcreator.themultiverseoffreddys.entity.WitheredTweetieEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WitheredTweetieRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WitheredTweetieEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelWithered_Tweetie(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/withered_tweetie.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelWithered_Tweetie extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer bone2;
		private final ModelRenderer bone;
		private final ModelRenderer head2;
		private final ModelRenderer body;
		private final ModelRenderer body2;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg2;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_arm4;
		private final ModelRenderer left_leg;
		private final ModelRenderer left_leg4;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm3;

		public ModelWithered_Tweetie() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.2817F, -0.0462F);
			head.setTextureOffset(52, 5).addBox(-4.0F, -8.7183F, 2.0462F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(26, 0).addBox(-4.0F, -8.7183F, -2.9538F, 6.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(-4.0F, -1.7183F, -2.9538F, 8.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(15, 27).addBox(-4.0F, -7.7183F, -2.9538F, 1.0F, 7.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(0, 56).addBox(-3.0F, -7.7183F, 3.0462F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(31, 27).addBox(3.0F, -5.7183F, -2.9538F, 1.0F, 5.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(26, 8).addBox(0.0F, -6.7183F, -3.9538F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(26, 8).addBox(-1.0F, -6.7183F, -3.9538F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(0, 0).addBox(3.0F, -6.7183F, -3.9538F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(26, 14).addBox(2.5F, -5.2183F, -3.9538F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 24).addBox(0.0F, -8.7183F, -3.9538F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(6, 34).addBox(0.0F, -7.7183F, -3.9538F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 31).addBox(-4.0F, -7.7183F, -3.9538F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(52, 8).addBox(-4.0F, -8.7183F, -3.9538F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -6.7183F, -3.9538F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(26, 14).addBox(-3.5F, -5.2183F, -3.9538F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-16.0F, 18.2817F, 0.0462F);
			head.addChild(bone2);
			bone2.setTextureOffset(24, 27).addBox(13.0F, -23.0F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(24, 29).addBox(13.5F, -22.5F, -4.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(59, 18).addBox(14.0F, -20.5F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(26, 6).addBox(12.0F, -20.0F, -4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(23, 18).addBox(18.0F, -23.0F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			bone2.setTextureOffset(0, 16).addBox(12.0F, -23.0F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -1.7183F, 0.0462F);
			head.addChild(bone);
			head2 = new ModelRenderer(this);
			head2.setRotationPoint(-19.0F, 3.0591F, 0.6828F);
			head.addChild(head2);
			head2.setTextureOffset(0, 20).addBox(20.0F, -9.7774F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head2.setTextureOffset(0, 20).addBox(16.0F, -9.7774F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			head2.setTextureOffset(0, 24).addBox(16.5F, -10.4774F, -3.5366F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			head2.setTextureOffset(42, 34).addBox(17.0F, -6.0774F, -3.0366F, 4.0F, 2.0F, 5.0F, 0.25F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-4.5F, 0.5F, -2.0F, 9.0F, 12.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(33, 32).addBox(-0.5F, 1.1F, -2.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(27, 0).addBox(-1.5F, 0.6F, -2.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(26, 11).addBox(0.5F, 0.6F, -2.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(62, 67).addBox(4.0F, 1.5F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(67, 50).addBox(-6.0F, 1.5F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(59, 27).addBox(-1.0F, 8.5F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(24, 48).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body2 = new ModelRenderer(this);
			body2.setRotationPoint(-19.0F, 0.7F, 0.0F);
			body.addChild(body2);
			body2.setTextureOffset(48, 58).addBox(18.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body2.setTextureOffset(0, 39).addBox(16.0F, 0.3F, -1.0F, 6.0F, 10.0F, 2.0F, 0.25F, false);
			body2.setTextureOffset(8, 36).addBox(16.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(16, 28).addBox(16.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(0, 28).addBox(16.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(16, 24).addBox(20.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(0, 26).addBox(20.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(16, 26).addBox(20.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(43, 0).addBox(15.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.5F, 11.02F, -0.2F);
			right_leg.setTextureOffset(12, 47).addBox(-2.0F, 5.88F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(43, 41).addBox(-2.0F, 0.58F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(23, 18).addBox(-2.5F, 10.98F, -3.8F, 5.0F, 2.0F, 7.0F, 0.0F, false);
			right_leg2 = new ModelRenderer(this);
			right_leg2.setRotationPoint(-19.0F, 0.2717F, 0.0333F);
			right_leg.addChild(right_leg2);
			right_leg2.setTextureOffset(24, 56).addBox(18.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			right_leg2.setTextureOffset(57, 55).addBox(17.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_leg2.setTextureOffset(56, 63).addBox(18.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, 1.62F, 0.0F);
			left_arm.setTextureOffset(44, 50).addBox(0.0F, 3.08F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(43, 24).addBox(0.0F, -2.12F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(67, 18).addBox(1.5F, 4.58F, 2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(67, 8).addBox(1.5F, 5.88F, 2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(65, 35).addBox(1.5F, 3.28F, 2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(8, 64).addBox(1.5F, -0.12F, 2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(64, 63).addBox(1.5F, 1.18F, 2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(65, 27).addBox(1.5F, -1.42F, 2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(55, 20).addBox(0.0F, 7.28F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			left_arm4 = new ModelRenderer(this);
			left_arm4.setRotationPoint(19.0F, -0.77F, 0.0F);
			left_arm.addChild(left_arm4);
			left_arm4.setTextureOffset(40, 58).addBox(-18.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_arm4.setTextureOffset(58, 39).addBox(-18.0F, -0.7F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_arm4.setTextureOffset(0, 51).addBox(-18.0F, 4.55F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.5F, 11.02F, -0.2F);
			left_leg.setTextureOffset(43, 15).addBox(-2.0F, 5.88F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(40, 6).addBox(-2.0F, 0.58F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(23, 9).addBox(-2.5F, 10.98F, -3.8F, 5.0F, 2.0F, 7.0F, 0.0F, false);
			left_leg4 = new ModelRenderer(this);
			left_leg4.setRotationPoint(19.0F, 0.2717F, 0.0333F);
			left_leg.addChild(left_leg4);
			left_leg4.setTextureOffset(16, 56).addBox(-20.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			left_leg4.setTextureOffset(56, 30).addBox(-20.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg4.setTextureOffset(57, 48).addBox(-20.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, 1.62F, 0.0F);
			right_arm.setTextureOffset(28, 48).addBox(-4.0F, 3.08F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(27, 39).addBox(-4.0F, -2.12F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 64).addBox(-2.5F, 4.58F, 2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(63, 46).addBox(-2.5F, 5.88F, 2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(63, 42).addBox(-2.5F, 3.28F, 2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(63, 0).addBox(-2.5F, -0.12F, 2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(62, 51).addBox(-2.5F, 1.18F, 2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(22, 0).addBox(-2.5F, -1.42F, 2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(55, 11).addBox(-4.0F, 7.28F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm3 = new ModelRenderer(this);
			right_arm3.setRotationPoint(-19.0F, -0.77F, 0.0F);
			right_arm.addChild(right_arm3);
			right_arm3.setTextureOffset(32, 56).addBox(16.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			right_arm3.setTextureOffset(16, 41).addBox(16.0F, -0.7F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_arm3.setTextureOffset(0, 34).addBox(16.0F, 4.55F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
