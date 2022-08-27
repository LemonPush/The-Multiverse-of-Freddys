
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

import net.mcreator.themultiverseoffreddys.entity.NoAiScrapBabyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NoAiScrapBabyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NoAiScrapBabyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelScrapBaby(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/scrapbaby.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelScrapBaby extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer head_r6;
		private final ModelRenderer body;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer body_r1;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer right_arm_r5;
		private final ModelRenderer right_arm_r6;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r7;
		private final ModelRenderer right_arm_r8;
		private final ModelRenderer right_arm_r9;
		private final ModelRenderer right_arm_r10;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelScrapBaby() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -9.0F, 0.0F);
			head.setTextureOffset(0, 14).addBox(-5.5F, -15.0F, -5.5F, 11.0F, 11.0F, 11.0F, 0.0F, false);
			head.setTextureOffset(0, 118).addBox(-4.5F, -21.0F, -0.5F, 6.0F, 6.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(32, 24).addBox(-6.0F, -16.0F, -6.0F, 12.0F, 3.0F, 12.0F, 0.0F, false);
			head.setTextureOffset(40, 0).addBox(-6.0F, -13.0F, -3.0F, 12.0F, 3.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(26, 36).addBox(-3.5F, -11.5F, -5.5F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(33, 23).addBox(1.5F, -12.9F, -5.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(33, 23).addBox(-3.5F, -12.9F, -5.7F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(26, 36).addBox(1.5F, -11.5F, -5.5F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(40, 5).addBox(-1.0F, -9.3F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(40, 0).addBox(-5.2F, -8.2F, -5.5F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(40, 0).addBox(3.2F, -8.2F, -5.5F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(0, 21).addBox(-3.0F, -8.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(0, 21).addBox(0.0F, -8.0F, -5.0F, 3.0F, 3.0F, 1.0F, 0.25F, true);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-4.0F, -12.0F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.3054F);
			head_r1.setTextureOffset(60, 119).addBox(-8.3F, 2.3F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, true);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-10.6468F, -10.7004F, 0.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.8727F);
			head_r2.setTextureOffset(86, 103).addBox(-2.4516F, -4.4381F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, false);
			head_r2.setTextureOffset(12, 109).addBox(-1.4516F, -3.4381F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-5.7F, -13.2F, 0.0F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, 0.3054F);
			head_r3.setTextureOffset(24, 121).addBox(-3.6F, -1.2F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, true);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(10.6468F, -10.7004F, 0.0F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, -0.8727F);
			head_r4.setTextureOffset(12, 109).addBox(-0.5484F, -3.4381F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, true);
			head_r4.setTextureOffset(86, 103).addBox(1.4516F, -4.4381F, -2.0F, 1.0F, 5.0F, 4.0F, 0.0F, true);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(4.0F, -12.0F, 0.0F);
			head.addChild(head_r5);
			setRotationAngle(head_r5, 0.0F, 0.0F, -0.3054F);
			head_r5.setTextureOffset(60, 119).addBox(5.3F, 2.3F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(5.7F, -13.2F, 0.0F);
			head.addChild(head_r6);
			setRotationAngle(head_r6, 0.0F, 0.0F, -0.3054F);
			head_r6.setTextureOffset(24, 121).addBox(-0.4F, -1.2F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(46, 52).addBox(-8.0F, 2.0F, -7.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			body.setTextureOffset(28, 50).addBox(6.0F, 2.0F, -7.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			body.setTextureOffset(68, 24).addBox(-6.0F, 2.0F, -7.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(33, 19).addBox(-6.0F, 2.0F, 5.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 55).addBox(7.0F, 3.5F, -6.0F, 2.0F, 3.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(68, 28).addBox(-9.0F, 3.5F, -8.0F, 8.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(68, 28).addBox(1.0F, 3.5F, -8.0F, 8.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(64, 50).addBox(-9.0F, 3.5F, -6.0F, 2.0F, 3.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(33, 14).addBox(-9.0F, 3.5F, 6.0F, 18.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-7.0F, 1.0F, -6.0F, 14.0F, 2.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(0, 39).addBox(-6.0F, -11.0F, -4.5F, 12.0F, 7.0F, 9.0F, 0.0F, false);
			body.setTextureOffset(42, 39).addBox(-5.5F, 3.0F, -4.0F, 11.0F, 3.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 70).addBox(-5.5F, -6.0F, -4.0F, 3.0F, 7.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 70).addBox(2.5F, -6.0F, -4.0F, 3.0F, 7.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(88, 59).addBox(-2.5F, -6.0F, -2.0F, 5.0F, 7.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(88, 87).addBox(-1.5F, -3.0F, -2.6F, 3.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(40, 94).addBox(-5.5F, -9.0F, -5.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(0.5F, -11.0F, -5.5F, 5.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 36).addBox(-0.5F, -11.0F, -5.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(20, 36).addBox(-5.5F, -11.0F, -5.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 97).addBox(6.0F, -9.9F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(98, 38).addBox(-1.5F, -12.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(40, 78).addBox(-8.0F, -9.9F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-5.2619F, -10.4261F, 0.0F);
			body.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 0.0F, 0.4363F);
			right_arm_r1.setTextureOffset(94, 22).addBox(-3.5F, -0.9F, 2.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(87, 12).addBox(-6.5F, -0.9F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 14).addBox(-7.5F, -0.9F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(64, 55).addBox(-7.5F, -0.9F, -4.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(64, 50).addBox(-7.5F, -0.9F, 2.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 55).addBox(-1.5F, -0.9F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(14, 70).addBox(-3.5F, -0.9F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(5.2619F, -10.4261F, 0.0F);
			body.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, -0.4363F);
			right_arm_r2.setTextureOffset(0, 61).addBox(-0.5F, -0.9F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(42, 89).addBox(1.5F, -0.9F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(74, 93).addBox(6.5F, -0.9F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(84, 96).addBox(-0.5F, -0.9F, 2.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(64, 68).addBox(3.5F, -0.9F, 2.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(96, 96).addBox(-0.5F, -0.9F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(73, 0).addBox(3.5F, -0.9F, -4.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(2.5F, -10.0F, -5.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, -0.3491F, 0.0F, 0.0F);
			body_r1.setTextureOffset(79, 123).addBox(-2.0F, -1.4F, -0.9F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.5061F, -9.5194F, 0.1131F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.4363F);
			left_arm.setTextureOffset(82, 0).addBox(0.1693F, -1.6339F, -3.1131F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(3.4074F, 11.0764F, -2.264F);
			left_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -0.5061F, 0.0F, 0.0F);
			right_arm_r3.setTextureOffset(0, 7).addBox(-1.7381F, -0.4489F, -1.156F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(3.4074F, 3.6672F, -0.1131F);
			left_arm.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -0.1745F, 0.0F, 0.0F);
			right_arm_r4.setTextureOffset(16, 62).addBox(-1.7381F, 0.0826F, -1.3135F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(3.4074F, 11.0764F, -2.264F);
			left_arm.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, -0.6109F, 0.0F, 0.0F);
			right_arm_r5.setTextureOffset(0, 85).addBox(-3.2381F, 0.8204F, -2.7022F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			right_arm_r6 = new ModelRenderer(this);
			right_arm_r6.setRotationPoint(3.4074F, 3.6672F, -0.1131F);
			left_arm.addChild(right_arm_r6);
			setRotationAngle(right_arm_r6, -0.3054F, 0.0F, 0.0F);
			right_arm_r6.setTextureOffset(0, 14).addBox(4.2619F, 4.0492F, -0.3271F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			right_arm_r6.setTextureOffset(40, 3).addBox(2.2619F, 4.0492F, -0.3271F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r6.setTextureOffset(70, 81).addBox(-3.2381F, 1.6492F, -2.6271F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.5061F, -9.5194F, 0.1131F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.4363F);
			right_arm.setTextureOffset(82, 0).addBox(-6.1693F, -1.6339F, -3.1131F, 6.0F, 6.0F, 6.0F, 0.0F, true);
			right_arm_r7 = new ModelRenderer(this);
			right_arm_r7.setRotationPoint(-3.4074F, 11.0764F, -2.264F);
			right_arm.addChild(right_arm_r7);
			setRotationAngle(right_arm_r7, -0.5061F, 0.0F, 0.0F);
			right_arm_r7.setTextureOffset(0, 7).addBox(-1.2619F, -0.4489F, -1.156F, 3.0F, 2.0F, 3.0F, 0.0F, true);
			right_arm_r8 = new ModelRenderer(this);
			right_arm_r8.setRotationPoint(-3.4074F, 3.6672F, -0.1131F);
			right_arm.addChild(right_arm_r8);
			setRotationAngle(right_arm_r8, -0.1745F, 0.0F, 0.0F);
			right_arm_r8.setTextureOffset(16, 62).addBox(-1.2619F, 0.0826F, -1.3135F, 3.0F, 2.0F, 3.0F, 0.0F, true);
			right_arm_r9 = new ModelRenderer(this);
			right_arm_r9.setRotationPoint(-3.4074F, 11.0764F, -2.264F);
			right_arm.addChild(right_arm_r9);
			setRotationAngle(right_arm_r9, -0.6109F, 0.0F, 0.0F);
			right_arm_r9.setTextureOffset(50, 68).addBox(-1.7619F, 3.8204F, 1.2978F, 4.0F, 15.0F, 4.0F, 0.0F, false);
			right_arm_r9.setTextureOffset(47, 113).addBox(-1.7619F, 6.8204F, -0.7022F, 4.0F, 12.0F, 2.0F, 0.0F, false);
			right_arm_r9.setTextureOffset(50, 68).addBox(-1.7619F, 3.8204F, -4.7022F, 4.0F, 15.0F, 4.0F, 0.0F, false);
			right_arm_r9.setTextureOffset(118, 115).addBox(1.6381F, 1.8204F, -1.7022F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r9.setTextureOffset(118, 115).addBox(-2.1619F, 1.8204F, -1.7022F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r9.setTextureOffset(88, 75).addBox(-1.7619F, 0.8204F, -2.7022F, 4.0F, 6.0F, 6.0F, 0.0F, false);
			right_arm_r10 = new ModelRenderer(this);
			right_arm_r10.setRotationPoint(-3.4074F, 3.6672F, -0.1131F);
			right_arm.addChild(right_arm_r10);
			setRotationAngle(right_arm_r10, -0.3054F, 0.0F, 0.0F);
			right_arm_r10.setTextureOffset(0, 14).addBox(-5.2619F, 4.0492F, -0.3271F, 1.0F, 1.0F, 1.0F, 0.25F, true);
			right_arm_r10.setTextureOffset(40, 3).addBox(-4.2619F, 4.0492F, -0.3271F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm_r10.setTextureOffset(70, 81).addBox(-2.7619F, 1.6492F, -2.6271F, 6.0F, 6.0F, 6.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.8625F, 3.8859F, -0.3721F);
			left_leg.setTextureOffset(80, 46).addBox(-3.0625F, 1.1141F, -3.1279F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(12, 36).addBox(1.4375F, 8.1141F, -0.6279F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 16).addBox(4.4375F, 8.1141F, -0.6279F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(22, 78).addBox(-3.0625F, 9.1141F, -3.1279F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(42, 68).addBox(-3.0625F, 7.1141F, -3.6279F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(22, 98).addBox(-1.5625F, 0.1141F, -1.6279F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(20, 66).addBox(-3.5625F, 16.1141F, -4.6279F, 7.0F, 4.0F, 8.0F, 0.0F, false);
			left_leg.setTextureOffset(106, 0).addBox(-3.0625F, 16.1141F, -7.6279F, 6.0F, 4.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 97).addBox(-1.5625F, 8.1141F, -1.6279F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.8625F, 3.8859F, -0.3721F);
			right_leg.setTextureOffset(74, 33).addBox(-2.9375F, 1.1141F, -3.1279F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(4, 36).addBox(-4.4375F, 8.1141F, -0.6279F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(6, 14).addBox(-5.4375F, 8.1141F, -0.6279F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(70, 68).addBox(-2.9375F, 9.1141F, -3.1279F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(46, 59).addBox(-2.9375F, 7.1141F, -3.6279F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(49, 96).addBox(-1.4375F, 0.1141F, -1.6279F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(65, 12).addBox(-3.4375F, 16.1141F, -4.6279F, 7.0F, 4.0F, 8.0F, 0.0F, false);
			right_leg.setTextureOffset(106, 0).addBox(-2.9375F, 16.1141F, -7.6279F, 6.0F, 4.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(95, 17).addBox(-1.4375F, 8.1141F, -1.6279F, 3.0F, 1.0F, 3.0F, 0.0F, false);
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

			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
