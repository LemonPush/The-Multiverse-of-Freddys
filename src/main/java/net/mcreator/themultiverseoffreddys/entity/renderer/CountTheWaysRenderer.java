
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

import net.mcreator.themultiverseoffreddys.entity.CountTheWaysEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CountTheWaysRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CountTheWaysEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelCountTheWays(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/counttheways.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelCountTheWays extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer right_arm_r5_r1;
		private final ModelRenderer right_arm_r4_r1;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer bone;
		private final ModelRenderer bone_r1;
		private final ModelRenderer bone_r2;
		private final ModelRenderer bone_r3;
		private final ModelRenderer bone_r4;
		private final ModelRenderer bone_r5;
		private final ModelRenderer bone_r6;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer body;
		private final ModelRenderer bone_r7;
		private final ModelRenderer bone_r8;
		private final ModelRenderer bone_r9;
		private final ModelRenderer bone_r10;
		private final ModelRenderer body_r1;
		private final ModelRenderer neck;
		private final ModelRenderer left_arm;
		private final ModelRenderer bone_r11;
		private final ModelRenderer bone_r12;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_arm;
		private final ModelRenderer bone_r13;
		private final ModelRenderer bone_r14;
		private final ModelRenderer bone_r15;
		private final ModelRenderer bone_r16;

		public ModelCountTheWays() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -7.8294F, 0.05F);
			right_arm_r5_r1 = new ModelRenderer(this);
			right_arm_r5_r1.setRotationPoint(-4.9548F, -8.6705F, -1.2167F);
			head.addChild(right_arm_r5_r1);
			setRotationAngle(right_arm_r5_r1, -1.5708F, 0.0F, 0.5672F);
			right_arm_r5_r1.setTextureOffset(21, 28).addBox(-0.05F, -2.1F, -1.5F, 1.0F, 2.0F, 1.0F, 0.25F, true);
			right_arm_r5_r1.setTextureOffset(25, 15).addBox(-3.55F, -2.1F, -2.5F, 3.0F, 2.0F, 3.0F, 0.25F, true);
			right_arm_r4_r1 = new ModelRenderer(this);
			right_arm_r4_r1.setRotationPoint(4.9548F, -8.6705F, -1.2167F);
			head.addChild(right_arm_r4_r1);
			setRotationAngle(right_arm_r4_r1, -1.5708F, 0.0F, -0.5672F);
			right_arm_r4_r1.setTextureOffset(21, 28).addBox(-0.95F, -2.1F, -1.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);
			right_arm_r4_r1.setTextureOffset(25, 15).addBox(0.55F, -2.1F, -2.5F, 3.0F, 2.0F, 3.0F, 0.25F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(8.0F, 3.8294F, 8.45F);
			head.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(60, 18).addBox(-11.0F, 7.0F, -7.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(32, 39).addBox(-12.0F, 7.0F, -12.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.5622F, -12.9931F, -0.55F);
			head.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(3.5622F, -12.9931F, -0.55F);
			head.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 14.8294F, -1.55F);
			head.addChild(bone);
			bone.setTextureOffset(62, 66).addBox(-3.5F, -17.5F, -5.0F, 7.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(58, 12).addBox(-3.5F, -19.5F, -5.0F, 7.0F, 2.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 13).addBox(-4.5F, -24.5F, -2.1F, 9.0F, 8.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(20, 49).addBox(-3.0F, -25.5F, -1.5F, 6.0F, 2.0F, 6.0F, -0.25F, false);
			bone.setTextureOffset(0, 64).addBox(-2.0F, -28.5F, -0.5F, 4.0F, 5.0F, 4.0F, -0.25F, false);
			bone.setTextureOffset(44, 60).addBox(4.5F, -19.5F, -2.1F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(35, 57).addBox(-5.5F, -19.5F, -2.1F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(71, 26).addBox(-2.5F, -20.1F, -4.8F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 4).addBox(-1.0F, -21.1F, -4.8F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r1 = new ModelRenderer(this);
			bone_r1.setRotationPoint(3.6549F, -23.222F, -0.3F);
			bone.addChild(bone_r1);
			setRotationAngle(bone_r1, 0.0F, 0.3927F, 0.5236F);
			bone_r1.setTextureOffset(97, 0).addBox(0.1451F, -0.678F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			bone_r2 = new ModelRenderer(this);
			bone_r2.setRotationPoint(3.6549F, -23.222F, -0.3F);
			bone.addChild(bone_r2);
			setRotationAngle(bone_r2, 0.1733F, 0.3542F, 0.991F);
			bone_r2.setTextureOffset(97, 0).addBox(1.6626F, -1.5452F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			bone_r3 = new ModelRenderer(this);
			bone_r3.setRotationPoint(-2.6549F, -20.222F, -2.3F);
			bone.addChild(bone_r3);
			setRotationAngle(bone_r3, 0.1733F, -0.3542F, -0.991F);
			bone_r3.setTextureOffset(97, 0).addBox(-3.6626F, -1.5452F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r4 = new ModelRenderer(this);
			bone_r4.setRotationPoint(-2.6549F, -20.222F, -2.3F);
			bone.addChild(bone_r4);
			setRotationAngle(bone_r4, 0.0F, -0.3927F, -0.5236F);
			bone_r4.setTextureOffset(97, 0).addBox(-2.1451F, -0.678F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r5 = new ModelRenderer(this);
			bone_r5.setRotationPoint(0.0F, -14.4F, 0.9F);
			bone.addChild(bone_r5);
			setRotationAngle(bone_r5, 0.1309F, 0.0F, 0.0F);
			bone_r5.setTextureOffset(69, 70).addBox(-3.5F, -1.9F, -5.7F, 7.0F, 1.0F, 3.0F, 0.0F, false);
			bone_r6 = new ModelRenderer(this);
			bone_r6.setRotationPoint(0.0F, -14.4F, 0.9F);
			bone.addChild(bone_r6);
			setRotationAngle(bone_r6, 0.1309F, 0.0F, 0.0F);
			bone_r6.setTextureOffset(28, 4).addBox(3.5F, -0.9F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r6.setTextureOffset(30, 31).addBox(-4.5F, -0.9F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r6.setTextureOffset(53, 66).addBox(-5.5F, -0.9F, -2.7F, 1.0F, 2.0F, 7.0F, 0.0F, false);
			bone_r6.setTextureOffset(28, 67).addBox(4.5F, -0.9F, -2.7F, 1.0F, 2.0F, 7.0F, 0.0F, false);
			bone_r6.setTextureOffset(0, 59).addBox(-4.5F, -0.9F, 3.3F, 9.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r6.setTextureOffset(28, 0).addBox(-3.5F, 0.1F, -5.7F, 7.0F, 1.0F, 3.0F, 0.0F, false);
			bone_r6.setTextureOffset(28, 0).addBox(-3.5F, -0.9F, -5.7F, 7.0F, 1.0F, 3.0F, 0.0F, false);
			bone_r6.setTextureOffset(0, 39).addBox(-4.5F, 0.1F, -2.7F, 9.0F, 1.0F, 7.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
			bone.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
			right_arm_r4.setTextureOffset(52, 70).addBox(-11.5F, 9.7F, -13.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);
			right_arm_r4.setTextureOffset(37, 68).addBox(-7.0F, 10.2F, -11.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r4.setTextureOffset(66, 9).addBox(-11.0F, 10.2F, -11.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r4.setTextureOffset(0, 61).addBox(-7.5F, 9.7F, -13.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(-0.5F, -9.0F, 0.0F);
			body.setTextureOffset(80, 19).addBox(-4.0F, 9.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(65, 79).addBox(-4.0F, 6.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(38, 49).addBox(1.0F, 6.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(78, 0).addBox(1.0F, 4.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(54, 39).addBox(-4.0F, 12.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(15, 47).addBox(1.0F, 9.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(79, 45).addBox(5.25F, 4.0F, -2.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(72, 33).addBox(-8.25F, 4.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(66, 0).addBox(-1.5F, 11.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(32, 15).addBox(-4.5F, 6.1F, -3.0F, 10.0F, 1.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(0, 0).addBox(-5.0F, 7.6F, -3.0F, 11.0F, 7.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(30, 31).addBox(-4.5F, 3.6F, -3.0F, 10.0F, 2.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(26, 22).addBox(-5.0F, 15.5F, -3.0F, 11.0F, 3.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(79, 59).addBox(-1.0F, 4.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(40, 72).addBox(-1.5F, 2.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			bone_r7 = new ModelRenderer(this);
			bone_r7.setRotationPoint(-3.8469F, 9.3426F, -3.3177F);
			body.addChild(bone_r7);
			setRotationAngle(bone_r7, -0.4244F, 0.3757F, -0.5197F);
			bone_r7.setTextureOffset(97, 0).addBox(0.8059F, 1.5451F, -1.162F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r8 = new ModelRenderer(this);
			bone_r8.setRotationPoint(-3.8469F, 9.3426F, -3.3177F);
			body.addChild(bone_r8);
			setRotationAngle(bone_r8, -0.5348F, 0.1715F, -0.9212F);
			bone_r8.setTextureOffset(97, 0).addBox(-1.9276F, 1.7167F, -1.162F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r9 = new ModelRenderer(this);
			bone_r9.setRotationPoint(5.1549F, 5.778F, -2.8F);
			body.addChild(bone_r9);
			setRotationAngle(bone_r9, 0.0F, 0.3927F, 0.5236F);
			bone_r9.setTextureOffset(97, 0).addBox(0.1451F, -0.678F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			bone_r10 = new ModelRenderer(this);
			bone_r10.setRotationPoint(5.1549F, 5.778F, -2.8F);
			body.addChild(bone_r10);
			setRotationAngle(bone_r10, 0.1733F, 0.3542F, 0.991F);
			bone_r10.setTextureOffset(97, 0).addBox(1.6626F, -1.5452F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(-3.8469F, 9.3426F, -3.3177F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 0.8727F, 0.0F);
			body_r1.setTextureOffset(0, 0).addBox(5.3469F, -6.0426F, -0.6823F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body_r1.setTextureOffset(0, 13).addBox(1.3469F, -6.0426F, -0.6823F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body_r1.setTextureOffset(34, 15).addBox(3.8469F, 3.4574F, -0.6823F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body_r1.setTextureOffset(0, 39).addBox(3.8469F, 1.9574F, -0.6823F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body_r1.setTextureOffset(61, 0).addBox(2.8469F, -2.0926F, -0.6823F, 3.0F, 3.0F, 1.0F, 0.5F, false);
			body_r1.setTextureOffset(0, 17).addBox(3.3469F, -5.7426F, -0.6823F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body_r1.setTextureOffset(36, 78).addBox(2.3469F, -4.0426F, -0.1823F, 4.0F, 9.0F, 1.0F, 0.0F, false);
			body_r1.setTextureOffset(0, 28).addBox(1.3469F, -3.0426F, -0.1823F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			body_r1.setTextureOffset(4, 28).addBox(6.3469F, -3.0426F, -0.1823F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			body_r1.setTextureOffset(46, 78).addBox(0.3469F, -2.0426F, -0.1823F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			body_r1.setTextureOffset(75, 80).addBox(7.3469F, -2.0426F, -0.1823F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(2.0F, 1.0F, 0.0F);
			body.addChild(neck);
			setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.5F, -3.0F, 0.0F);
			left_arm.setTextureOffset(76, 9).addBox(1.0F, 10.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(76, 14).addBox(1.0F, 3.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(53, 75).addBox(1.5F, 5.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(25, 39).addBox(1.5F, 12.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(12, 76).addBox(1.5F, -2.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(15, 57).addBox(0.5F, -2.7F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			left_arm.setTextureOffset(56, 26).addBox(0.5F, 4.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			left_arm.setTextureOffset(59, 44).addBox(0.5F, 10.7F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			bone_r11 = new ModelRenderer(this);
			bone_r11.setRotationPoint(4.1549F, 3.778F, -1.8F);
			left_arm.addChild(bone_r11);
			setRotationAngle(bone_r11, 2.2101F, 0.8989F, 2.3054F);
			bone_r11.setTextureOffset(97, 0).addBox(0.1451F, -0.678F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			bone_r12 = new ModelRenderer(this);
			bone_r12.setRotationPoint(4.1549F, 3.778F, -1.8F);
			left_arm.addChild(bone_r12);
			setRotationAngle(bone_r12, 2.0135F, 0.5215F, 2.0103F);
			bone_r12.setTextureOffset(97, 0).addBox(1.6626F, -1.5452F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.2F, 7.0F, -0.5F);
			left_leg.setTextureOffset(77, 75).addBox(-2.0F, 9.0F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(22, 68).addBox(-2.5F, 7.75F, -2.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(74, 40).addBox(-2.0F, 2.7F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 76).addBox(-1.5F, 10.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(59, 55).addBox(-2.5F, 3.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 47).addBox(-2.5F, 9.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 28).addBox(-3.0F, 15.0F, -6.0F, 6.0F, 2.0F, 9.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.2F, 7.0F, -0.5F);
			right_leg.setTextureOffset(65, 74).addBox(-2.0F, 9.0F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(74, 54).addBox(-2.0F, 2.7F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 73).addBox(-1.5F, 10.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(44, 49).addBox(-2.5F, 3.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(46, 0).addBox(-2.5F, 9.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(25, 4).addBox(-3.0F, 15.0F, -6.0F, 6.0F, 2.0F, 9.0F, 0.0F, false);
			right_leg.setTextureOffset(30, 57).addBox(-2.5F, 7.75F, -2.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.5F, -4.0F, 0.0F);
			right_arm.setTextureOffset(76, 9).addBox(-5.0F, 11.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(76, 14).addBox(-5.0F, 4.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(53, 75).addBox(-4.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(12, 76).addBox(-4.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(15, 57).addBox(-5.5F, -1.7F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, true);
			right_arm.setTextureOffset(56, 26).addBox(-5.5F, 5.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, true);
			bone_r13 = new ModelRenderer(this);
			bone_r13.setRotationPoint(-2.1549F, 10.778F, -0.8F);
			right_arm.addChild(bone_r13);
			setRotationAngle(bone_r13, 2.1802F, 0.312F, -1.4057F);
			bone_r13.setTextureOffset(97, 0).addBox(-3.6626F, -1.5452F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r14 = new ModelRenderer(this);
			bone_r14.setRotationPoint(-2.1549F, 10.778F, -0.8F);
			right_arm.addChild(bone_r14);
			setRotationAngle(bone_r14, 2.1478F, -0.0516F, -1.6503F);
			bone_r14.setTextureOffset(97, 0).addBox(-2.1451F, -0.678F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r15 = new ModelRenderer(this);
			bone_r15.setRotationPoint(-4.1549F, 10.778F, -0.8F);
			right_arm.addChild(bone_r15);
			setRotationAngle(bone_r15, 0.4747F, 0.1294F, -1.8988F);
			bone_r15.setTextureOffset(97, 0).addBox(-3.6626F, -1.5452F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r16 = new ModelRenderer(this);
			bone_r16.setRotationPoint(-4.1549F, 10.778F, -0.8F);
			right_arm.addChild(bone_r16);
			setRotationAngle(bone_r16, 0.4855F, -0.0746F, -1.5123F);
			bone_r16.setTextureOffset(97, 0).addBox(-2.1451F, -0.678F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
