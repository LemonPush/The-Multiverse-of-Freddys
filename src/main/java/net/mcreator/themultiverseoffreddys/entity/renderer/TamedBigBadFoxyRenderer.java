
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

import net.mcreator.themultiverseoffreddys.entity.TamedBigBadFoxyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedBigBadFoxyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedBigBadFoxyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBig_Bad_Foxy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/big_bad_foxy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBig_Bad_Foxy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer head_r6;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r5;
		private final ModelRenderer right_arm_r6;
		private final ModelRenderer right_arm_r7;
		private final ModelRenderer right_arm_r8;
		private final ModelRenderer right_arm_r9;

		public ModelBig_Bad_Foxy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(48, 2).addBox(-5.0F, -14.0F, -1.0F, 1.0F, 8.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(48, 2).addBox(4.0F, -14.0F, -1.0F, 1.0F, 8.0F, 6.0F, 0.0F, true);
			head.setTextureOffset(44, 59).addBox(5.0F, -12.0F, -1.0F, 1.0F, 3.0F, 6.0F, 0.0F, true);
			head.setTextureOffset(60, 36).addBox(6.0F, -10.0F, -1.0F, 1.0F, 1.0F, 6.0F, 0.0F, true);
			head.setTextureOffset(60, 36).addBox(-7.0F, -10.0F, -1.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(44, 59).addBox(-6.0F, -12.0F, -1.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 42).addBox(-4.0F, -14.0F, 4.0F, 8.0F, 8.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(26, 10).addBox(-4.0F, -15.0F, -1.0F, 8.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(49, 0).addBox(-0.7F, -15.5F, -0.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 17).addBox(-3.0F, -6.0F, -10.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(60, 65).addBox(-3.0F, -7.0F, -10.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 43).addBox(-3.0F, -7.0F, -9.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(23, 64).addBox(2.0F, -7.0F, -9.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(62, 29).addBox(2.0F, -8.5F, -9.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(32, 8).addBox(-3.0F, -8.5F, -10.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(63, 16).addBox(-3.0F, -8.5F, -9.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(38, 49).addBox(-2.0F, -10.0F, -9.8F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(23, 25).addBox(-3.0F, -9.5F, -10.2F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(56, 0).addBox(-1.0F, -10.5F, -9.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(46, 56).addBox(-1.0F, -11.1F, -9.5F, 2.0F, 1.0F, 2.0F, -0.1F, false);
			head.setTextureOffset(0, 71).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(48, 32).addBox(-2.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(20, 44).addBox(-8.0F, -9.0F, 0.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(38, 49).addBox(-6.0F, -9.0F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 52).addBox(-7.0F, -9.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(49, 17).addBox(4.0F, -9.0F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(17, 33).addBox(4.0F, -9.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(37, 33).addBox(4.0F, -9.0F, 0.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-1.7F, -13.3F, -4.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.2618F);
			head_r1.setTextureOffset(0, 6).addBox(-1.4F, -0.75F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(1.7F, -13.3F, -4.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, -0.2618F);
			head_r2.setTextureOffset(0, 6).addBox(-1.6F, -0.75F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(0.0F, -15.5F, -1.5F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, -0.5236F, 1.5708F, 0.0F);
			head_r3.setTextureOffset(0, 32).addBox(-2.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r3.setTextureOffset(66, 0).addBox(-2.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head_r3.setTextureOffset(30, 17).addBox(-2.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head_r3.setTextureOffset(0, 35).addBox(-2.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(0.0F, -15.5F, -1.5F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, -0.5236F, -1.5708F, 0.0F);
			head_r4.setTextureOffset(66, 52).addBox(1.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head_r4.setTextureOffset(18, 42).addBox(1.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r4.setTextureOffset(42, 25).addBox(1.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head_r4.setTextureOffset(16, 56).addBox(1.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(0.5F, -14.6F, -0.1F);
			head.addChild(head_r5);
			setRotationAngle(head_r5, 0.0F, 0.0F, 0.2618F);
			head_r5.setTextureOffset(32, 44).addBox(-0.1F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(-0.5F, -14.6F, -0.1F);
			head.addChild(head_r6);
			setRotationAngle(head_r6, 0.0F, 0.0F, -0.2618F);
			head_r6.setTextureOffset(56, 23).addBox(-1.2F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(36, 38).addBox(-7.0F, -7.0F, -3.0F, 4.0F, 5.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 32).addBox(-0.4F, -0.5F, -1.6F, 6.0F, 5.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 32).addBox(-5.6F, -0.5F, -1.6F, 6.0F, 5.0F, 5.0F, 0.0F, true);
			body.setTextureOffset(36, 38).addBox(3.0F, -7.0F, -3.0F, 4.0F, 5.0F, 6.0F, 0.0F, true);
			body.setTextureOffset(20, 49).addBox(-4.0F, -5.5F, -2.7F, 8.0F, 10.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(63, 70).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(56, 0).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(70, 61).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(70, 58).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(54, 55).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(12, 60).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(70, 16).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(35, 65).addBox(1.5F, 11.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(22, 33).addBox(0.5F, -2.4F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-15.5F, 6.5F, 0.0F);
			left_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 0.0F, -0.5236F);
			right_arm_r1.setTextureOffset(0, 0).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, true);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-15.5F, 1.0F, 0.0F);
			left_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, -0.5236F);
			right_arm_r2.setTextureOffset(55, 65).addBox(-0.5F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, 0.0F, true);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(5.5F, 6.5F, 0.0F);
			left_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, 0.0F, 0.0F, 0.5236F);
			right_arm_r3.setTextureOffset(0, 0).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(5.5F, 1.0F, 0.0F);
			left_arm.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, 0.0F, 0.0F, 0.5236F);
			right_arm_r4.setTextureOffset(55, 65).addBox(-0.5F, -3.0F, -1.5F, 1.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(52, 45).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(22, 33).addBox(-2.6F, 0.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(22, 33).addBox(-2.6F, 6.5F, -2.5F, 5.0F, 6.0F, 5.0F, -0.5F, false);
			left_leg.setTextureOffset(16, 70).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(68, 49).addBox(-1.1F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(69, 68).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(62, 7).addBox(-1.6F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(49, 16).addBox(-2.1F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(69, 29).addBox(0.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			left_leg.setTextureOffset(10, 69).addBox(-2.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(22, 33).addBox(-2.4F, 6.5F, -2.5F, 5.0F, 6.0F, 5.0F, -0.5F, true);
			right_leg.setTextureOffset(0, 52).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(47, 68).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(68, 38).addBox(-0.9F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(68, 35).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 62).addBox(-1.4F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(42, 25).addBox(-1.9F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(68, 22).addBox(-2.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_leg.setTextureOffset(22, 33).addBox(-2.4F, 0.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, true);
			right_leg.setTextureOffset(63, 67).addBox(0.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(50, 32).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(34, 56).addBox(-5.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(30, 65).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(24, 60).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(56, 23).addBox(-5.0F, 11.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(24, 70).addBox(12.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(22, 33).addBox(-5.5F, -2.4F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, true);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(-4.5672F, 17.9224F, -0.0495F);
			right_arm.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, -0.6545F, -1.5708F, 0.6545F);
			right_arm_r5.setTextureOffset(56, 42).addBox(-0.5F, 0.2F, -2.8F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r6 = new ModelRenderer(this);
			right_arm_r6.setRotationPoint(-3.6F, 16.4191F, 0.4505F);
			right_arm.addChild(right_arm_r6);
			setRotationAngle(right_arm_r6, -1.2217F, -1.5708F, 0.6545F);
			right_arm_r6.setTextureOffset(0, 16).addBox(-1.0F, -0.8185F, 0.6522F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r7 = new ModelRenderer(this);
			right_arm_r7.setRotationPoint(-3.6F, 16.4191F, 0.4505F);
			right_arm.addChild(right_arm_r7);
			setRotationAngle(right_arm_r7, 0.1745F, -1.5708F, 0.6981F);
			right_arm_r7.setTextureOffset(24, 0).addBox(-1.0F, -1.5185F, 0.0522F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r8 = new ModelRenderer(this);
			right_arm_r8.setRotationPoint(-3.6F, 16.4191F, 0.4505F);
			right_arm.addChild(right_arm_r8);
			setRotationAngle(right_arm_r8, -0.0873F, -1.5708F, 0.6545F);
			right_arm_r8.setTextureOffset(0, 52).addBox(-1.0F, -0.7185F, -2.9478F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm_r9 = new ModelRenderer(this);
			right_arm_r9.setRotationPoint(-3.2F, 16.9191F, 0.4505F);
			right_arm.addChild(right_arm_r9);
			setRotationAngle(right_arm_r9, 0.0F, -1.5708F, 0.0F);
			right_arm_r9.setTextureOffset(25, 17).addBox(-1.0F, -4.5191F, -0.7505F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
