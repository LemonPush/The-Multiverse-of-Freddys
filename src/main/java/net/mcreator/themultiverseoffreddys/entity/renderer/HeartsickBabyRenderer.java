
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

import net.mcreator.themultiverseoffreddys.entity.HeartsickBabyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HeartsickBabyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(HeartsickBabyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelHeartsick_Circus_Baby(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/heartsick_circus_baby.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelHeartsick_Circus_Baby extends EntityModel<Entity> {
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
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer right_arm_r5;
		private final ModelRenderer right_arm_r6;
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
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

		public ModelHeartsick_Circus_Baby() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -9.0F, 0.0F);
			head.setTextureOffset(0, 39).addBox(0.1F, -16.0F, -5.5F, 6.0F, 7.0F, 11.0F, 0.0F, true);
			head.setTextureOffset(56, 46).addBox(0.1F, -16.5F, -5.5F, 6.0F, 1.0F, 11.0F, 0.0F, false);
			head.setTextureOffset(56, 46).addBox(-6.1F, -16.5F, -5.5F, 6.0F, 1.0F, 11.0F, 0.0F, true);
			head.setTextureOffset(0, 39).addBox(-6.1F, -16.0F, -5.5F, 6.0F, 7.0F, 11.0F, 0.0F, false);
			head.setTextureOffset(43, 12).addBox(0.1F, -8.9F, -5.5F, 6.0F, 5.0F, 11.0F, 0.0F, true);
			head.setTextureOffset(43, 12).addBox(-6.1F, -8.9F, -5.5F, 6.0F, 5.0F, 11.0F, 0.0F, false);
			head.setTextureOffset(0, 46).addBox(1.6F, -12.0F, -5.5F, 2.0F, 2.0F, 1.0F, 0.25F, true);
			head.setTextureOffset(40, 12).addBox(1.6F, -13.5F, -5.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 46).addBox(-3.6F, -12.0F, -5.5F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(40, 12).addBox(-3.6F, -13.5F, -5.7F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(23, 39).addBox(-1.05F, -9.3F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(23, 39).addBox(0.05F, -9.3F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(23, 46).addBox(-5.2F, -8.4F, -6.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(23, 46).addBox(3.2F, -8.4F, -6.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(0, 2).addBox(0.0F, -15.3F, -5.1F, 4.0F, 10.0F, 1.0F, 0.25F, true);
			head.setTextureOffset(0, 2).addBox(-4.0F, -15.3F, -5.1F, 4.0F, 10.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(33, 24).addBox(8.2364F, -15.624F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, true);
			head.setTextureOffset(33, 24).addBox(-11.2364F, -15.624F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-10.6192F, -11.1948F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 1.5708F);
			head_r1.setTextureOffset(54, 87).addBox(0.0869F, -0.4762F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-10.6192F, -11.1948F, 0.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.3927F);
			head_r2.setTextureOffset(38, 46).addBox(-2.3172F, -3.8292F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-9.2192F, -11.8948F, 0.0F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, 0.3927F);
			head_r3.setTextureOffset(42, 84).addBox(-0.5611F, -3.8146F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(9.2192F, -11.8948F, 0.0F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, -0.3927F);
			head_r4.setTextureOffset(42, 84).addBox(-3.4389F, -3.8146F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, true);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(10.6192F, -11.1948F, 0.0F);
			head.addChild(head_r5);
			setRotationAngle(head_r5, 0.0F, 0.0F, -0.3927F);
			head_r5.setTextureOffset(38, 46).addBox(-0.6828F, -3.8292F, -2.0F, 3.0F, 5.0F, 4.0F, 0.0F, true);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(10.6192F, -11.1948F, 0.0F);
			head.addChild(head_r6);
			setRotationAngle(head_r6, 0.0F, 0.0F, -1.5708F);
			head_r6.setTextureOffset(54, 87).addBox(-4.0869F, -0.4762F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, true);
			head_r7 = new ModelRenderer(this);
			head_r7.setRotationPoint(-0.1F, -12.7F, -5.2F);
			head.addChild(head_r7);
			setRotationAngle(head_r7, 0.6109F, 0.0F, 0.0F);
			head_r7.setTextureOffset(0, 29).addBox(-3.75F, -0.7F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			head_r7.setTextureOffset(0, 29).addBox(0.95F, -0.7F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(38, 48).addBox(-8.0F, 2.0F, -7.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			body.setTextureOffset(20, 46).addBox(6.0F, 2.0F, -7.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
			body.setTextureOffset(79, 49).addBox(-6.0F, 2.0F, -7.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(77, 21).addBox(-6.0F, 2.0F, 5.0F, 12.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(60, 59).addBox(7.0F, 3.5F, -6.0F, 2.0F, 3.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(0, 62).addBox(-9.0F, 3.5F, -8.0F, 18.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(66, 2).addBox(-9.0F, 3.5F, -6.0F, 2.0F, 3.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(64, 28).addBox(-9.0F, 3.5F, 6.0F, 18.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 2).addBox(-7.0F, 1.0F, -6.0F, 14.0F, 2.0F, 12.0F, 0.0F, false);
			body.setTextureOffset(0, 23).addBox(-6.0F, -11.0F, -4.5F, 12.0F, 7.0F, 9.0F, 0.0F, false);
			body.setTextureOffset(0, 91).addBox(1.0F, -10.0F, 4.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(64, 33).addBox(8.0F, -15.0F, 4.5F, 16.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(66, 17).addBox(8.0F, -12.0F, 4.5F, 14.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(79, 53).addBox(8.0F, -9.0F, 4.5F, 12.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 84).addBox(8.0F, -6.0F, 4.5F, 10.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 91).addBox(-8.0F, -10.0F, 4.5F, 7.0F, 4.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(64, 33).addBox(-24.0F, -15.0F, 4.5F, 16.0F, 3.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(66, 17).addBox(-22.0F, -12.0F, 4.5F, 14.0F, 3.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(79, 53).addBox(-20.0F, -9.0F, 4.5F, 12.0F, 3.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(24, 84).addBox(-18.0F, -6.0F, 4.5F, 10.0F, 3.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(40, 2).addBox(-5.5F, 3.0F, -4.0F, 11.0F, 2.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(34, 31).addBox(-5.5F, -6.0F, -4.0F, 11.0F, 7.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(16, 93).addBox(-5.5F, -11.0F, -5.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(56, 46).addBox(1.5F, -11.0F, -5.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 23).addBox(-1.5F, -11.0F, -5.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(96, 71).addBox(6.0F, -9.9F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(72, 37).addBox(-1.5F, -14.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(26, 93).addBox(-8.0F, -9.9F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-5.2619F, -10.4261F, 0.0F);
			body.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 0.0F, 0.4363F);
			right_arm_r1.setTextureOffset(46, 94).addBox(-3.5F, -0.9F, 2.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 57).addBox(-6.5F, -0.9F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 39).addBox(-7.5F, -0.9F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(68, 92).addBox(-7.5F, -0.9F, -4.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(36, 91).addBox(-7.5F, -0.9F, 2.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(22, 67).addBox(-1.5F, -0.9F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(94, 12).addBox(-3.5F, -0.9F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(5.2619F, -10.4261F, 0.0F);
			body.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, -0.4363F);
			right_arm_r2.setTextureOffset(48, 71).addBox(-0.5F, -0.9F, -2.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(20, 88).addBox(1.5F, -0.9F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(23, 39).addBox(6.5F, -0.9F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(0, 96).addBox(-0.5F, -0.9F, 2.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(80, 92).addBox(3.5F, -0.9F, 2.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(96, 16).addBox(-0.5F, -0.9F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(92, 92).addBox(3.5F, -0.9F, -4.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(-10.25F, -9.0F, 5.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, -3.1416F, 0.0F);
			body_r1.setTextureOffset(0, 91).addBox(-18.25F, -1.0F, -0.6F, 7.0F, 4.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(64, 33).addBox(-34.25F, -6.0F, -0.6F, 16.0F, 3.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(66, 17).addBox(-32.25F, -3.0F, -0.6F, 14.0F, 3.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(79, 53).addBox(-30.25F, 0.0F, -0.6F, 12.0F, 3.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(24, 84).addBox(-28.25F, 3.0F, -0.6F, 10.0F, 3.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(6, 39).addBox(-35.25F, -6.0F, -0.6F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(0, 39).addBox(-33.25F, -3.0F, -0.6F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(0, 16).addBox(-29.25F, 3.0F, -0.6F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(33, 23).addBox(-31.25F, 0.0F, -0.6F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(6, 39).addBox(-35.25F, -6.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(0, 39).addBox(-33.25F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(33, 23).addBox(-31.25F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(0, 16).addBox(-29.25F, 3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(10.25F, -9.0F, 5.0F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, 3.1416F, 0.0F);
			body_r2.setTextureOffset(0, 91).addBox(11.25F, -1.0F, -0.6F, 7.0F, 4.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(64, 33).addBox(18.25F, -6.0F, -0.6F, 16.0F, 3.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(66, 17).addBox(18.25F, -3.0F, -0.6F, 14.0F, 3.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(79, 53).addBox(18.25F, 0.0F, -0.6F, 12.0F, 3.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(6, 39).addBox(34.25F, -6.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(0, 39).addBox(32.25F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(33, 23).addBox(30.25F, 0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(0, 16).addBox(28.25F, 3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(33, 23).addBox(30.25F, 0.0F, -0.6F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(6, 39).addBox(34.25F, -6.0F, -0.6F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(0, 39).addBox(32.25F, -3.0F, -0.6F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(0, 16).addBox(28.25F, 3.0F, -0.6F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(24, 84).addBox(18.25F, 3.0F, -0.6F, 10.0F, 3.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.5061F, -9.5194F, -2.8869F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.4363F);
			left_arm.setTextureOffset(82, 0).addBox(0.1693F, -1.6339F, -0.1131F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			left_arm.setTextureOffset(47, 28).addBox(5.6693F, 0.8661F, 2.3869F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(23, 41).addBox(7.6693F, 0.8661F, 2.3869F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(3.4074F, 11.0764F, 0.736F);
			left_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -0.5061F, 0.0F, 0.0F);
			right_arm_r3.setTextureOffset(72, 74).addBox(-1.7381F, -0.4489F, -1.156F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(3.4074F, 3.6672F, 2.8869F);
			left_arm.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -0.1745F, 0.0F, 0.0F);
			right_arm_r4.setTextureOffset(18, 79).addBox(-1.7381F, 0.0826F, -1.3135F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(3.4074F, 11.0764F, 0.736F);
			left_arm.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, -0.6109F, 0.0F, 0.0F);
			right_arm_r5.setTextureOffset(0, 79).addBox(-3.2381F, 0.8204F, -2.7022F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			right_arm_r6 = new ModelRenderer(this);
			right_arm_r6.setRotationPoint(3.4074F, 3.6672F, 2.8869F);
			left_arm.addChild(right_arm_r6);
			setRotationAngle(right_arm_r6, -0.3054F, 0.0F, 0.0F);
			right_arm_r6.setTextureOffset(29, 39).addBox(4.2619F, 4.0492F, -0.3271F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			right_arm_r6.setTextureOffset(46, 12).addBox(2.2619F, 4.0492F, -0.3271F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r6.setTextureOffset(79, 37).addBox(-3.2381F, 1.6492F, -2.6271F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(2.3689F, 19.6408F, -4.6131F);
			left_arm.addChild(bone);
			setRotationAngle(bone, -1.3578F, -0.9052F, 1.4023F);
			bone.setTextureOffset(0, 16).addBox(-12.875F, -7.1213F, -2.5F, 23.0F, 3.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-20.875F, 3.5787F, -1.0F, 39.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(16.125F, -4.6213F, 0.0F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
			cube_r1.setTextureOffset(36, 64).addBox(-6.0F, 2.5F, -2.5F, 14.0F, 3.0F, 4.0F, 0.0F, true);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-18.875F, -4.6213F, 0.0F);
			bone.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
			cube_r2.setTextureOffset(36, 64).addBox(-8.0F, 2.5F, -2.5F, 14.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.5061F, -9.5194F, -2.8869F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.4363F);
			right_arm.setTextureOffset(82, 0).addBox(-6.1693F, -1.6339F, -0.1131F, 6.0F, 6.0F, 6.0F, 0.0F, true);
			right_arm.setTextureOffset(47, 28).addBox(-7.6693F, 0.8661F, 2.3869F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm.setTextureOffset(23, 41).addBox(-8.6693F, 0.8661F, 2.3869F, 1.0F, 1.0F, 1.0F, 0.25F, true);
			right_arm_r7 = new ModelRenderer(this);
			right_arm_r7.setRotationPoint(-3.4074F, 11.0764F, 0.736F);
			right_arm.addChild(right_arm_r7);
			setRotationAngle(right_arm_r7, -0.5061F, 0.0F, 0.0F);
			right_arm_r7.setTextureOffset(72, 74).addBox(-1.2619F, -0.4489F, -1.156F, 3.0F, 2.0F, 3.0F, 0.0F, true);
			right_arm_r8 = new ModelRenderer(this);
			right_arm_r8.setRotationPoint(-3.4074F, 3.6672F, 2.8869F);
			right_arm.addChild(right_arm_r8);
			setRotationAngle(right_arm_r8, -0.1745F, 0.0F, 0.0F);
			right_arm_r8.setTextureOffset(18, 79).addBox(-1.2619F, 0.0826F, -1.3135F, 3.0F, 2.0F, 3.0F, 0.0F, true);
			right_arm_r9 = new ModelRenderer(this);
			right_arm_r9.setRotationPoint(-3.4074F, 11.0764F, 0.736F);
			right_arm.addChild(right_arm_r9);
			setRotationAngle(right_arm_r9, -0.6109F, 0.0F, 0.0F);
			right_arm_r9.setTextureOffset(0, 79).addBox(-2.7619F, 0.8204F, -2.7022F, 6.0F, 6.0F, 6.0F, 0.0F, true);
			right_arm_r10 = new ModelRenderer(this);
			right_arm_r10.setRotationPoint(-3.4074F, 3.6672F, 2.8869F);
			right_arm.addChild(right_arm_r10);
			setRotationAngle(right_arm_r10, -0.3054F, 0.0F, 0.0F);
			right_arm_r10.setTextureOffset(29, 39).addBox(-5.2619F, 4.0492F, -0.3271F, 1.0F, 1.0F, 1.0F, 0.25F, true);
			right_arm_r10.setTextureOffset(46, 12).addBox(-4.2619F, 4.0492F, -0.3271F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm_r10.setTextureOffset(79, 37).addBox(-2.7619F, 1.6492F, -2.6271F, 6.0F, 6.0F, 6.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.5625F, 3.8859F, -0.3721F);
			left_leg.setTextureOffset(78, 74).addBox(-3.0625F, 1.1141F, -3.1279F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(52, 29).addBox(2.4375F, 4.1141F, -0.6279F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(50, 18).addBox(4.4375F, 4.1141F, -0.6279F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(50, 16).addBox(4.4375F, 12.1141F, -0.6279F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(48, 46).addBox(2.4375F, 12.1141F, -0.6279F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(76, 58).addBox(-3.0625F, 9.1141F, -3.1279F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(56, 58).addBox(-3.0625F, 7.1141F, -3.6279F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(97, 34).addBox(-1.5625F, 0.1141F, -1.6279F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 67).addBox(-3.5625F, 16.1141F, -4.6279F, 7.0F, 4.0F, 8.0F, 0.0F, false);
			left_leg.setTextureOffset(88, 87).addBox(-3.0625F, 18.1141F, -7.6279F, 6.0F, 2.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(33, 96).addBox(-1.5625F, 8.1141F, -1.6279F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg_r1 = new ModelRenderer(this);
			right_leg_r1.setRotationPoint(-0.0625F, 18.9245F, -7.3282F);
			left_leg.addChild(right_leg_r1);
			setRotationAngle(right_leg_r1, -2.0508F, 0.0F, 0.0F);
			right_leg_r1.setTextureOffset(40, 6).addBox(-1.0F, 0.4074F, -4.5299F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg_r1.setTextureOffset(56, 55).addBox(-0.5F, 0.8074F, -2.5299F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg_r2 = new ModelRenderer(this);
			right_leg_r2.setRotationPoint(-0.0625F, 18.9245F, -7.3282F);
			left_leg.addChild(right_leg_r2);
			setRotationAngle(right_leg_r2, -1.7017F, 0.0F, 0.0F);
			right_leg_r2.setTextureOffset(0, 57).addBox(-0.5F, 0.1804F, -2.0902F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg_r3 = new ModelRenderer(this);
			right_leg_r3.setRotationPoint(-0.0625F, 18.6141F, -6.6279F);
			left_leg.addChild(right_leg_r3);
			setRotationAngle(right_leg_r3, -0.6545F, 0.0F, 0.0F);
			right_leg_r3.setTextureOffset(56, 53).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg_r4 = new ModelRenderer(this);
			right_leg_r4.setRotationPoint(-0.0625F, 18.9245F, -7.3282F);
			left_leg.addChild(right_leg_r4);
			setRotationAngle(right_leg_r4, -1.0472F, 0.0F, 0.0F);
			right_leg_r4.setTextureOffset(14, 57).addBox(-0.5F, -0.753F, -1.5909F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.5625F, 3.8859F, -0.3721F);
			right_leg.setTextureOffset(54, 74).addBox(-2.9375F, 1.1141F, -3.1279F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(28, 48).addBox(-4.4375F, 4.1141F, -0.6279F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(48, 48).addBox(-5.4375F, 4.1141F, -0.6279F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(38, 48).addBox(-5.4375F, 12.1141F, -0.6279F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(5, 48).addBox(-4.4375F, 12.1141F, -0.6279F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(30, 71).addBox(-2.9375F, 9.1141F, -3.1279F, 6.0F, 7.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(38, 55).addBox(-2.9375F, 7.1141F, -3.6279F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(58, 94).addBox(-1.4375F, 0.1141F, -1.6279F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 67).addBox(-3.4375F, 16.1141F, -4.6279F, 7.0F, 4.0F, 8.0F, 0.0F, false);
			right_leg.setTextureOffset(70, 87).addBox(-2.9375F, 18.1141F, -7.6279F, 6.0F, 2.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(94, 57).addBox(-1.4375F, 8.1141F, -1.6279F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg_r5 = new ModelRenderer(this);
			right_leg_r5.setRotationPoint(0.0625F, 18.9245F, -7.3282F);
			right_leg.addChild(right_leg_r5);
			setRotationAngle(right_leg_r5, -2.0508F, 0.0F, 0.0F);
			right_leg_r5.setTextureOffset(40, 2).addBox(-1.0F, 0.4074F, -4.5299F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg_r5.setTextureOffset(29, 41).addBox(-0.5F, 0.8074F, -2.5299F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg_r6 = new ModelRenderer(this);
			right_leg_r6.setRotationPoint(0.0625F, 18.9245F, -7.3282F);
			right_leg.addChild(right_leg_r6);
			setRotationAngle(right_leg_r6, -1.7017F, 0.0F, 0.0F);
			right_leg_r6.setTextureOffset(6, 46).addBox(-0.5F, 0.1804F, -2.0902F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg_r7 = new ModelRenderer(this);
			right_leg_r7.setRotationPoint(0.0625F, 18.6141F, -6.6279F);
			right_leg.addChild(right_leg_r7);
			setRotationAngle(right_leg_r7, -0.6545F, 0.0F, 0.0F);
			right_leg_r7.setTextureOffset(29, 46).addBox(-0.5F, -0.3F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg_r8 = new ModelRenderer(this);
			right_leg_r8.setRotationPoint(0.0625F, 18.9245F, -7.3282F);
			right_leg.addChild(right_leg_r8);
			setRotationAngle(right_leg_r8, -1.0472F, 0.0F, 0.0F);
			right_leg_r8.setTextureOffset(38, 46).addBox(-0.5F, -0.753F, -1.5909F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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
