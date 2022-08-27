
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

import net.mcreator.themultiverseoffreddys.entity.WheelchairBurntrapEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WheelchairBurntrapRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WheelchairBurntrapEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelWheelchairBurntrap(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/wheelchairburntrap.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelWheelchairBurntrap extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer chair;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_arm_r1;
		private final ModelRenderer left_leg;
		private final ModelRenderer left_leg_r1;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm_r2;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg_r2;

		public ModelWheelchairBurntrap() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 2.9774F, 0.0366F);
			head.setTextureOffset(40, 64).addBox(-1.0F, -0.9774F, -1.0366F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(24, 14).addBox(-3.5F, -7.9774F, -1.0366F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 48).addBox(-2.25F, -13.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 46).addBox(-2.25F, -8.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 27).addBox(1.15F, -13.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 37).addBox(1.25F, -8.4774F, -0.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(66, 45).addBox(-1.0F, -6.4774F, 1.9634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(65, 31).addBox(-1.0F, -7.9774F, 0.9634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 43).addBox(-3.0F, -5.4774F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(34, 17).addBox(-3.5F, -5.4774F, -2.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(47, 13).addBox(-2.5F, -6.7274F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(47, 10).addBox(0.5F, -6.7274F, -4.2866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(20, 43).addBox(1.0F, -5.4774F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(37, 10).addBox(1.5F, -5.4774F, -2.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 14).addBox(-4.0F, -8.4774F, -4.0366F, 8.0F, 5.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(28, 49).addBox(-3.25F, -12.4774F, -1.0366F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(44, 49).addBox(0.25F, -12.4774F, -1.0366F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(49, 57).addBox(-3.0F, -4.4774F, -6.0366F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(20, 39).addBox(-2.5F, -7.4774F, -3.5366F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			head.setTextureOffset(48, 25).addBox(-2.0F, -2.9774F, -3.5366F, 4.0F, 2.0F, 5.0F, 0.25F, false);
			head.setTextureOffset(9, 0).addBox(-0.5F, -4.9274F, -5.8366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(1.85F, -12.3774F, 0.2634F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.5672F, 0.0F, 0.0F);
			head_r1.setTextureOffset(24, 17).addBox(-1.6F, -3.6F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(1.75F, -12.3774F, -0.0366F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.5672F, 0.0F, 0.0F);
			head_r2.setTextureOffset(9, 8).addBox(-0.5F, -4.4F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(20, 39).addBox(-1.0F, -3.4F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(12, 60).addBox(-1.0F, 4.0F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(32, 57).addBox(-1.0F, 4.0F, -0.2F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(14, 56).addBox(-3.0F, 3.0F, -1.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(29, 10).addBox(-1.5F, 9.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(58, 37).addBox(-2.5F, 11.0F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(36, 39).addBox(-1.5F, 6.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(53, 0).addBox(-4.0F, 3.0F, 1.5F, 8.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(53, 0).addBox(-4.0F, 3.0F, -2.5F, 8.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 14).addBox(3.0F, 3.0F, -1.5F, 1.0F, 5.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 14).addBox(-4.0F, 3.0F, -1.5F, 1.0F, 5.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(56, 18).addBox(-3.5F, 3.75F, -2.75F, 7.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 46).addBox(-3.5F, 12.3F, -2.0F, 7.0F, 2.0F, 4.0F, 0.25F, false);
			body.setTextureOffset(26, 60).addBox(-3.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(58, 41).addBox(-3.0F, 8.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(16, 52).addBox(1.0F, 8.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(53, 6).addBox(1.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(20, 37).addBox(1.0F, 3.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(34, 25).addBox(-5.0F, 3.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(48, 32).addBox(-3.5F, 12.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			chair = new ModelRenderer(this);
			chair.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.addChild(chair);
			chair.setTextureOffset(29, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
			chair.setTextureOffset(0, 0).addBox(-4.0F, -1.5F, -9.0F, 8.0F, 1.0F, 13.0F, 0.0F, false);
			chair.setTextureOffset(34, 21).addBox(-5.0F, -6.0F, -1.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
			chair.setTextureOffset(42, 39).addBox(-3.0F, -7.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
			chair.setTextureOffset(22, 17).addBox(-6.0F, -10.0F, -5.0F, 1.0F, 10.0F, 10.0F, 0.0F, true);
			chair.setTextureOffset(0, 27).addBox(-4.0F, -24.0F, 3.0F, 8.0F, 17.0F, 2.0F, 0.0F, false);
			chair.setTextureOffset(50, 49).addBox(2.0F, -24.0F, 5.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			chair.setTextureOffset(50, 49).addBox(-4.0F, -24.0F, 5.0F, 2.0F, 2.0F, 6.0F, 0.0F, true);
			chair.setTextureOffset(34, 10).addBox(-6.0F, -15.0F, -7.2F, 2.0F, 2.0F, 9.0F, 0.0F, false);
			chair.setTextureOffset(34, 49).addBox(4.0F, -15.0F, -7.2F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			chair.setTextureOffset(34, 10).addBox(-6.0F, -15.0F, -4.2F, 2.0F, 2.0F, 9.0F, 0.0F, false);
			chair.setTextureOffset(35, 28).addBox(4.0F, -15.0F, -4.2F, 2.0F, 2.0F, 9.0F, 0.0F, false);
			chair.setTextureOffset(22, 17).addBox(5.0F, -10.0F, -5.0F, 1.0F, 10.0F, 10.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.5F, 0.85F, 0.0F);
			body.addChild(left_arm);
			left_arm.setTextureOffset(0, 61).addBox(1.0F, 2.4F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(64, 55).addBox(1.0F, 4.4F, -1.0F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			left_arm_r1 = new ModelRenderer(this);
			left_arm_r1.setRotationPoint(2.0F, 7.1F, 0.0F);
			left_arm.addChild(left_arm_r1);
			setRotationAngle(left_arm_r1, -1.5708F, 0.0F, 0.0F);
			left_arm_r1.setTextureOffset(62, 41).addBox(-1.0F, 4.8F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			left_arm_r1.setTextureOffset(40, 57).addBox(-1.5F, 0.2F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(52, 60).addBox(-1.0F, 0.3F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			body.addChild(left_leg);
			setRotationAngle(left_leg, -1.5708F, 0.0F, 0.0F);
			left_leg.setTextureOffset(0, 0).addBox(-1.5F, 0.9583F, 1.6667F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 52).addBox(-1.5F, 0.9583F, 1.1667F, 3.0F, 5.0F, 4.0F, 0.25F, false);
			left_leg.setTextureOffset(20, 60).addBox(-1.0F, -2.0417F, 2.1667F, 2.0F, 8.0F, 2.0F, 0.0F, true);
			left_leg_r1 = new ModelRenderer(this);
			left_leg_r1.setRotationPoint(0.0F, 4.9583F, 0.6667F);
			left_leg.addChild(left_leg_r1);
			setRotationAngle(left_leg_r1, 1.5708F, 0.0F, 0.0F);
			left_leg_r1.setTextureOffset(47, 10).addBox(-1.5F, 8.75F, -4.5F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			left_leg_r1.setTextureOffset(60, 60).addBox(-1.0F, 5.0F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, true);
			left_leg_r1.setTextureOffset(44, 25).addBox(-1.0F, 7.75F, -1.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			left_leg_r1.setTextureOffset(10, 52).addBox(-1.0F, 5.75F, -1.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			left_leg_r1.setTextureOffset(65, 13).addBox(-1.0F, 3.75F, -1.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.5F, 0.85F, 0.0F);
			body.addChild(right_arm);
			right_arm.setTextureOffset(60, 47).addBox(-3.0F, 2.4F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(61, 23).addBox(-3.0F, 3.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			left_arm_r2 = new ModelRenderer(this);
			left_arm_r2.setRotationPoint(-2.0F, 7.4F, 0.0F);
			right_arm.addChild(left_arm_r2);
			setRotationAngle(left_arm_r2, -1.5708F, 0.0F, 0.0F);
			left_arm_r2.setTextureOffset(59, 11).addBox(-1.0F, 4.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			left_arm_r2.setTextureOffset(29, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			body.addChild(right_leg);
			setRotationAngle(right_leg, -1.5708F, 0.0F, 0.0F);
			right_leg.setTextureOffset(20, 60).addBox(-1.0F, -2.0417F, 2.1667F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(59, 7).addBox(-1.5F, 3.9583F, 1.6667F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 8).addBox(-1.5F, 1.9583F, 1.6667F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg_r2 = new ModelRenderer(this);
			left_leg_r2.setRotationPoint(0.0F, 5.2083F, 0.6667F);
			right_leg.addChild(left_leg_r2);
			setRotationAngle(left_leg_r2, 1.5708F, 0.0F, 0.0F);
			left_leg_r2.setTextureOffset(16, 49).addBox(-1.5F, 9.5F, -4.5F, 3.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg_r2.setTextureOffset(10, 52).addBox(-1.0F, 7.5F, -1.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			left_leg_r2.setTextureOffset(61, 27).addBox(-1.0F, 5.5F, -1.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			left_leg_r2.setTextureOffset(65, 13).addBox(-1.0F, 3.5F, -1.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			left_leg_r2.setTextureOffset(60, 60).addBox(-1.0F, 4.75F, -1.5F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
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
