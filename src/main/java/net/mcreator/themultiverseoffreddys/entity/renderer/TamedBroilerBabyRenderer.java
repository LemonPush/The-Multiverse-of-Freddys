
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

import net.mcreator.themultiverseoffreddys.entity.TamedBroilerBabyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedBroilerBabyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedBroilerBabyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBroiler_Baby(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/broiler_baby.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBroiler_Baby extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer head_r6;
		private final ModelRenderer head_r7;
		private final ModelRenderer body;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
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
		private final ModelRenderer right_leg_r1;
		private final ModelRenderer right_leg_r2;
		private final ModelRenderer right_leg_r3;
		private final ModelRenderer right_leg_r4;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg_r5;
		private final ModelRenderer right_leg_r6;
		private final ModelRenderer right_leg_r7;
		private final ModelRenderer right_leg_r8;

		public ModelBroiler_Baby() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -9.0F, 0.0F);
			head.setTextureOffset(31, 19).addBox(0.1F, -16.0F, -5.5F, 6.0F, 7.0F, 11.0F, 0.0F, true);
			head.setTextureOffset(50, 47).addBox(0.1F, -16.5F, -5.5F, 6.0F, 1.0F, 11.0F, 0.0F, false);
			head.setTextureOffset(50, 47).addBox(-6.1F, -16.5F, -5.5F, 6.0F, 1.0F, 11.0F, 0.0F, true);
			head.setTextureOffset(31, 19).addBox(-6.1F, -16.0F, -5.5F, 6.0F, 7.0F, 11.0F, 0.0F, false);
			head.setTextureOffset(27, 37).addBox(0.1F, -8.9F, -5.5F, 6.0F, 5.0F, 11.0F, 0.0F, true);
			head.setTextureOffset(27, 37).addBox(-6.1F, -8.9F, -5.5F, 6.0F, 5.0F, 11.0F, 0.0F, false);
			head.setTextureOffset(43, 16).addBox(1.6F, -12.0F, -5.5F, 2.0F, 2.0F, 1.0F, 0.25F, true);
			head.setTextureOffset(7, 45).addBox(1.6F, -13.5F, -5.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(43, 16).addBox(-3.6F, -12.0F, -5.5F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(7, 45).addBox(-3.6F, -13.5F, -5.7F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(37, 19).addBox(-1.05F, -9.3F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(37, 19).addBox(0.05F, -9.3F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(37, 16).addBox(-5.2F, -8.4F, -6.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(37, 16).addBox(3.2F, -8.4F, -6.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(0, 0).addBox(0.0F, -15.3F, -5.1F, 4.0F, 10.0F, 1.0F, 0.25F, true);
			head.setTextureOffset(0, 0).addBox(-4.0F, -15.3F, -5.1F, 4.0F, 10.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(62, 88).addBox(8.2364F, -15.624F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, true);
			head.setTextureOffset(62, 88).addBox(-11.2364F, -15.624F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-10.6192F, -11.1948F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 1.5708F);
			head_r1.setTextureOffset(78, 0).addBox(0.0869F, -0.4762F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-10.6192F, -11.1948F, 0.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.3927F);
			head_r2.setTextureOffset(24, 86).addBox(-2.3172F, -3.8292F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-9.2192F, -11.8948F, 0.0F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, 0.3927F);
			head_r3.setTextureOffset(86, 57).addBox(-0.5611F, -3.8146F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(9.2192F, -11.8948F, 0.0F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, -0.3927F);
			head_r4.setTextureOffset(86, 57).addBox(-3.4389F, -3.8146F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, true);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(10.6192F, -11.1948F, 0.0F);
			head.addChild(head_r5);
			setRotationAngle(head_r5, 0.0F, 0.0F, -0.3927F);
			head_r5.setTextureOffset(24, 86).addBox(-0.6828F, -3.8292F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, true);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(10.6192F, -11.1948F, 0.0F);
			head.addChild(head_r6);
			setRotationAngle(head_r6, 0.0F, 0.0F, -1.5708F);
			head_r6.setTextureOffset(78, 0).addBox(-4.0869F, -0.4762F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, true);
			head_r7 = new ModelRenderer(this);
			head_r7.setRotationPoint(-0.1F, -12.7F, -5.2F);
			head.addChild(head_r7);
			setRotationAngle(head_r7, 0.6109F, 0.0F, 0.0F);
			head_r7.setTextureOffset(0, 20).addBox(-3.75F, -0.7F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			head_r7.setTextureOffset(0, 20).addBox(0.95F, -0.7F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(0, 45).addBox(-8.0F, 2.0F, -7.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			body.setTextureOffset(38, 0).addBox(6.0F, 2.0F, -7.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			body.setTextureOffset(73, 53).addBox(-6.0F, 2.0F, -7.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(70, 12).addBox(-6.0F, 2.0F, 5.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(20, 58).addBox(7.0F, 3.5F, -6.0F, 2.0F, 3.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(18, 53).addBox(-9.0F, 3.5F, -8.0F, 18.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(48, 59).addBox(-9.0F, 3.5F, -6.0F, 2.0F, 3.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(54, 16).addBox(-9.0F, 3.5F, 6.0F, 18.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-7.0F, 1.0F, -6.0F, 14.0F, 2.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(0, 14).addBox(-6.0F, -11.0F, -4.5F, 12.0F, 7.0F, 9.0F, 0.0F, false);
			body.setTextureOffset(50, 37).addBox(-5.5F, 3.0F, -4.0F, 11.0F, 2.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 30).addBox(-5.5F, -6.0F, -4.0F, 11.0F, 7.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(36, 59).addBox(-2.0F, -2.0F, -6.0F, 4.0F, 3.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 45).addBox(-5.0F, -8.0F, -7.0F, 1.0F, 9.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 45).addBox(4.0F, -8.0F, -7.0F, 1.0F, 9.0F, 5.0F, 0.0F, true);
			body.setTextureOffset(48, 74).addBox(-4.0F, -8.0F, -7.0F, 8.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 61).addBox(-4.0F, 0.0F, -7.0F, 8.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(92, 94).addBox(-5.5F, -11.0F, -5.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(82, 94).addBox(1.5F, -11.0F, -5.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 14).addBox(-1.5F, -11.0F, -5.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(65, 96).addBox(6.0F, -9.9F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(35, 92).addBox(-1.5F, -14.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(21, 95).addBox(-8.0F, -9.9F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-5.2619F, -10.4261F, 0.0F);
			body.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 0.0F, 0.4363F);
			right_arm_r1.setTextureOffset(94, 78).addBox(-3.5F, -0.9F, 2.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(80, 36).addBox(-6.5F, -0.9F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(22, 63).addBox(-7.5F, -0.9F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(93, 26).addBox(-7.5F, -0.9F, -4.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(12, 93).addBox(-7.5F, -0.9F, 2.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(40, 0).addBox(-1.5F, -0.9F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(94, 36).addBox(-3.5F, -0.9F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(5.2619F, -10.4261F, 0.0F);
			body.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, -0.4363F);
			right_arm_r2.setTextureOffset(40, 6).addBox(-0.5F, -0.9F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(86, 7).addBox(1.5F, -0.9F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(72, 91).addBox(6.5F, -0.9F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(0, 98).addBox(-0.5F, -0.9F, 2.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(94, 16).addBox(3.5F, -0.9F, 2.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(98, 12).addBox(-0.5F, -0.9F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(94, 64).addBox(3.5F, -0.9F, -4.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.5061F, -9.5194F, -2.8869F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.4363F);
			left_arm.setTextureOffset(81, 82).addBox(0.1693F, -1.6339F, -0.1131F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			left_arm.setTextureOffset(24, 45).addBox(5.6693F, 0.8661F, 2.3869F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(40, 0).addBox(7.6693F, 0.8661F, 2.3869F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(3.4074F, 11.0764F, 0.736F);
			left_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -0.5061F, 0.0F, 0.0F);
			right_arm_r3.setTextureOffset(47, 92).addBox(-1.7381F, -0.4489F, -1.156F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(3.4074F, 3.6672F, 2.8869F);
			left_arm.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -0.1745F, 0.0F, 0.0F);
			right_arm_r4.setTextureOffset(0, 93).addBox(-1.7381F, 0.0826F, -1.3135F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(3.4074F, 11.0764F, 0.736F);
			left_arm.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, -0.6109F, 0.0F, 0.0F);
			right_arm_r5.setTextureOffset(78, 71).addBox(-0.7381F, -0.1796F, -17.9022F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			right_arm_r5.setTextureOffset(78, 71).addBox(-0.7381F, 6.8204F, -17.9022F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			right_arm_r5.setTextureOffset(33, 14).addBox(-0.7381F, -0.1796F, -9.9022F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			right_arm_r5.setTextureOffset(67, 71).addBox(0.2619F, -0.1796F, -17.9022F, 1.0F, 8.0F, 9.0F, 0.0F, false);
			right_arm_r5.setTextureOffset(82, 27).addBox(-0.7381F, 2.8204F, -8.9022F, 2.0F, 2.0F, 7.0F, 0.0F, false);
			right_arm_r5.setTextureOffset(42, 80).addBox(-3.2381F, 0.8204F, -2.7022F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			right_arm_r6 = new ModelRenderer(this);
			right_arm_r6.setRotationPoint(3.4074F, 3.6672F, 2.8869F);
			left_arm.addChild(right_arm_r6);
			setRotationAngle(right_arm_r6, -0.3054F, 0.0F, 0.0F);
			right_arm_r6.setTextureOffset(37, 21).addBox(4.2619F, 4.0492F, -0.3271F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			right_arm_r6.setTextureOffset(18, 45).addBox(2.2619F, 4.0492F, -0.3271F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r6.setTextureOffset(82, 41).addBox(-3.2381F, 1.6492F, -2.6271F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.5061F, -9.5194F, -2.8869F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.4363F);
			right_arm.setTextureOffset(81, 82).addBox(-6.1693F, -1.6339F, -0.1131F, 6.0F, 6.0F, 6.0F, 0.0F, true);
			right_arm.setTextureOffset(24, 45).addBox(-7.6693F, 0.8661F, 2.3869F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm.setTextureOffset(40, 0).addBox(-8.6693F, 0.8661F, 2.3869F, 1.0F, 1.0F, 1.0F, 0.25F, true);
			right_arm_r7 = new ModelRenderer(this);
			right_arm_r7.setRotationPoint(-3.4074F, 11.0764F, 0.736F);
			right_arm.addChild(right_arm_r7);
			setRotationAngle(right_arm_r7, -0.5061F, 0.0F, 0.0F);
			right_arm_r7.setTextureOffset(47, 92).addBox(-1.2619F, -0.4489F, -1.156F, 3.0F, 2.0F, 3.0F, 0.0F, true);
			right_arm_r8 = new ModelRenderer(this);
			right_arm_r8.setRotationPoint(-3.4074F, 3.6672F, 2.8869F);
			right_arm.addChild(right_arm_r8);
			setRotationAngle(right_arm_r8, -0.1745F, 0.0F, 0.0F);
			right_arm_r8.setTextureOffset(0, 93).addBox(-1.2619F, 0.0826F, -1.3135F, 3.0F, 2.0F, 3.0F, 0.0F, true);
			right_arm_r9 = new ModelRenderer(this);
			right_arm_r9.setRotationPoint(-3.4074F, 11.0764F, 0.736F);
			right_arm.addChild(right_arm_r9);
			setRotationAngle(right_arm_r9, -0.6109F, 0.0F, 0.0F);
			right_arm_r9.setTextureOffset(42, 80).addBox(-2.7619F, 0.8204F, -2.7022F, 6.0F, 6.0F, 6.0F, 0.0F, true);
			right_arm_r10 = new ModelRenderer(this);
			right_arm_r10.setRotationPoint(-3.4074F, 3.6672F, 2.8869F);
			right_arm.addChild(right_arm_r10);
			setRotationAngle(right_arm_r10, -0.3054F, 0.0F, 0.0F);
			right_arm_r10.setTextureOffset(37, 21).addBox(-5.2619F, 4.0492F, -0.3271F, 1.0F, 1.0F, 1.0F, 0.25F, true);
			right_arm_r10.setTextureOffset(18, 45).addBox(-4.2619F, 4.0492F, -0.3271F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm_r10.setTextureOffset(82, 41).addBox(-2.7619F, 1.6492F, -2.6271F, 6.0F, 6.0F, 6.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.5625F, 3.8859F, -0.3721F);
			left_leg.setTextureOffset(0, 80).addBox(-3.0625F, 1.1141F, -3.1279F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(49, 16).addBox(2.4375F, 4.1141F, -0.6279F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(48, 6).addBox(4.4375F, 4.1141F, -0.6279F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(48, 2).addBox(4.4375F, 12.1141F, -0.6279F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(18, 47).addBox(2.4375F, 12.1141F, -0.6279F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 73).addBox(-3.0625F, 9.1141F, -3.1279F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(90, 0).addBox(-3.0625F, 7.1141F, -3.6279F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(28, 98).addBox(-1.5625F, 0.1141F, -1.6279F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(64, 59).addBox(-3.5625F, 16.1141F, -4.6279F, 7.0F, 4.0F, 8.0F, 0.0F, false);
			left_leg.setTextureOffset(88, 71).addBox(-3.0625F, 18.1141F, -7.6279F, 6.0F, 2.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(12, 98).addBox(-1.5625F, 8.1141F, -1.6279F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg_r1 = new ModelRenderer(this);
			right_leg_r1.setRotationPoint(-0.0625F, 18.9245F, -7.3282F);
			left_leg.addChild(right_leg_r1);
			setRotationAngle(right_leg_r1, -2.0508F, 0.0F, 0.0F);
			right_leg_r1.setTextureOffset(0, 34).addBox(-1.0F, 0.4074F, -4.5299F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg_r1.setTextureOffset(23, 48).addBox(-0.5F, 0.8074F, -2.5299F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg_r2 = new ModelRenderer(this);
			right_leg_r2.setRotationPoint(-0.0625F, 18.9245F, -7.3282F);
			left_leg.addChild(right_leg_r2);
			setRotationAngle(right_leg_r2, -1.7017F, 0.0F, 0.0F);
			right_leg_r2.setTextureOffset(37, 19).addBox(-0.5F, 0.1804F, -2.0902F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg_r3 = new ModelRenderer(this);
			right_leg_r3.setRotationPoint(-0.0625F, 18.6141F, -6.6279F);
			left_leg.addChild(right_leg_r3);
			setRotationAngle(right_leg_r3, -0.6545F, 0.0F, 0.0F);
			right_leg_r3.setTextureOffset(48, 8).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg_r4 = new ModelRenderer(this);
			right_leg_r4.setRotationPoint(-0.0625F, 18.9245F, -7.3282F);
			left_leg.addChild(right_leg_r4);
			setRotationAngle(right_leg_r4, -1.0472F, 0.0F, 0.0F);
			right_leg_r4.setTextureOffset(18, 49).addBox(-0.5F, -0.753F, -1.5909F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.5625F, 3.8859F, -0.3721F);
			right_leg.setTextureOffset(0, 67).addBox(-2.9375F, 1.1141F, -3.1279F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(7, 47).addBox(-4.4375F, 4.1141F, -0.6279F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(48, 0).addBox(-5.4375F, 4.1141F, -0.6279F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(0, 47).addBox(-5.4375F, 12.1141F, -0.6279F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(30, 45).addBox(-4.4375F, 12.1141F, -0.6279F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(65, 21).addBox(-2.9375F, 9.1141F, -3.1279F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(54, 21).addBox(-2.9375F, 7.1141F, -3.6279F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(44, 97).addBox(-1.4375F, 0.1141F, -1.6279F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(56, 0).addBox(-3.4375F, 16.1141F, -4.6279F, 7.0F, 4.0F, 8.0F, 0.0F, false);
			right_leg.setTextureOffset(83, 21).addBox(-2.9375F, 18.1141F, -7.6279F, 6.0F, 2.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(56, 95).addBox(-1.4375F, 8.1141F, -1.6279F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg_r5 = new ModelRenderer(this);
			right_leg_r5.setRotationPoint(0.0625F, 18.9245F, -7.3282F);
			right_leg.addChild(right_leg_r5);
			setRotationAngle(right_leg_r5, -2.0508F, 0.0F, 0.0F);
			right_leg_r5.setTextureOffset(0, 30).addBox(-1.0F, 0.4074F, -4.5299F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg_r5.setTextureOffset(40, 2).addBox(-0.5F, 0.8074F, -2.5299F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg_r6 = new ModelRenderer(this);
			right_leg_r6.setRotationPoint(0.0625F, 18.9245F, -7.3282F);
			right_leg.addChild(right_leg_r6);
			setRotationAngle(right_leg_r6, -1.7017F, 0.0F, 0.0F);
			right_leg_r6.setTextureOffset(40, 6).addBox(-0.5F, 0.1804F, -2.0902F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg_r7 = new ModelRenderer(this);
			right_leg_r7.setRotationPoint(0.0625F, 18.6141F, -6.6279F);
			right_leg.addChild(right_leg_r7);
			setRotationAngle(right_leg_r7, -0.6545F, 0.0F, 0.0F);
			right_leg_r7.setTextureOffset(40, 8).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg_r8 = new ModelRenderer(this);
			right_leg_r8.setRotationPoint(0.0625F, 18.9245F, -7.3282F);
			right_leg.addChild(right_leg_r8);
			setRotationAngle(right_leg_r8, -1.0472F, 0.0F, 0.0F);
			right_leg_r8.setTextureOffset(0, 45).addBox(-0.5F, -0.753F, -1.5909F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
