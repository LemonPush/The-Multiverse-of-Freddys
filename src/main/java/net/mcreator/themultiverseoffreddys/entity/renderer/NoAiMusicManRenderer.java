
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

import net.mcreator.themultiverseoffreddys.entity.NoAiMusicManEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NoAiMusicManRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NoAiMusicManEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMusicMan(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/musicman.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMusicMan extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer right_arm_r5;
		private final ModelRenderer right_arm_r6;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg_r1;
		private final ModelRenderer right_leg_r2;
		private final ModelRenderer right_leg_r3;
		private final ModelRenderer left_leg2;
		private final ModelRenderer right_leg_r4;
		private final ModelRenderer right_leg_r5;
		private final ModelRenderer right_leg_r6;
		private final ModelRenderer left_leg3;
		private final ModelRenderer right_leg_r7;
		private final ModelRenderer right_leg_r8;
		private final ModelRenderer right_leg_r9;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg_r10;
		private final ModelRenderer right_leg_r11;
		private final ModelRenderer right_leg_r12;
		private final ModelRenderer right_leg2;
		private final ModelRenderer right_leg_r13;
		private final ModelRenderer right_leg_r14;
		private final ModelRenderer right_leg_r15;
		private final ModelRenderer right_leg3;
		private final ModelRenderer right_leg_r16;
		private final ModelRenderer right_leg_r17;
		private final ModelRenderer right_leg_r18;

		public ModelMusicMan() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-8.0F, -10.0F, -7.0F, 16.0F, 6.0F, 14.0F, 0.0F, false);
			head.setTextureOffset(0, 20).addBox(-7.0F, -16.0F, -7.0F, 14.0F, 6.0F, 14.0F, 0.0F, false);
			head.setTextureOffset(60, 17).addBox(-5.0F, -15.5F, -7.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 11).addBox(1.0F, -15.5F, -7.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(76, 40).addBox(1.0F, -14.5F, -7.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(8, 3).addBox(5.0F, -11.5F, -7.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(8, 0).addBox(-7.0F, -11.5F, -7.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(94, 9).addBox(-1.0F, -12.5F, -9.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(94, 9).addBox(-1.0F, -13.5F, -8.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(8, 6).addBox(-1.0F, -11.5F, -10.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(37, 48).addBox(-3.0F, -10.5F, -10.5F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(95, 18).addBox(-5.0F, -14.5F, -7.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(104, 110).addBox(-5.5F, -9.25F, -7.1F, 11.0F, 5.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 0).addBox(-5.0F, -17.0F, -5.0F, 9.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(26, 64).addBox(-4.0F, -22.0F, -4.0F, 7.0F, 5.0F, 8.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(45, 34).addBox(-5.0F, 6.0F, -5.5F, 10.0F, 3.0F, 11.0F, 0.0F, false);
			body.setTextureOffset(42, 20).addBox(-5.0F, -4.0F, -5.5F, 10.0F, 3.0F, 11.0F, 0.0F, false);
			body.setTextureOffset(0, 40).addBox(-6.0F, -3.0F, -6.5F, 12.0F, 11.0F, 13.0F, 0.0F, false);
			body.setTextureOffset(37, 40).addBox(-2.0F, 0.5F, -7.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(47, 40).addBox(-1.0F, -5.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(22.0F, -5.0F, 0.0F);
			setRotationAngle(left_arm, -1.5708F, 0.0F, 0.0F);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-10.2813F, 18.5389F, 3.4201F);
			left_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -0.2381F, 0.0132F, 0.0173F);
			right_arm_r1.setTextureOffset(0, 64).addBox(-3.0472F, -6.8725F, -2.8406F, 1.0F, 12.0F, 12.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(71, 67).addBox(-2.0472F, -3.4725F, 0.6594F, 4.0F, 5.0F, 5.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-9.994F, 5.9202F, 6.5317F);
			left_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -0.2753F, 0.5205F, -0.119F);
			right_arm_r2.setTextureOffset(0, 40).addBox(-2.6206F, -0.4727F, 1.6572F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(-15.0F, -0.5F, 3.0F);
			left_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, 0.3491F, 0.0F, -0.7854F);
			right_arm_r3.setTextureOffset(26, 77).addBox(-1.8586F, -0.7042F, 2.6494F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-22.0F, -5.0F, 0.0F);
			setRotationAngle(right_arm, -1.5708F, 0.0F, 0.0F);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(10.2813F, 18.5389F, 3.4201F);
			right_arm.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -0.2381F, -0.0132F, -0.0173F);
			right_arm_r4.setTextureOffset(50, 48).addBox(2.0472F, -6.8725F, -2.8406F, 1.0F, 12.0F, 12.0F, 0.0F, false);
			right_arm_r4.setTextureOffset(64, 48).addBox(-1.9528F, -3.4725F, 0.6594F, 4.0F, 5.0F, 5.0F, 0.0F, false);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(9.994F, 5.9202F, 6.5317F);
			right_arm.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, -0.2753F, -0.5205F, 0.119F);
			right_arm_r5.setTextureOffset(0, 0).addBox(0.6206F, -0.4727F, 1.6572F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			right_arm_r6 = new ModelRenderer(this);
			right_arm_r6.setRotationPoint(15.0F, -0.5F, 3.0F);
			right_arm.addChild(right_arm_r6);
			setRotationAngle(right_arm_r6, 0.3491F, 0.0F, 0.7854F);
			right_arm_r6.setTextureOffset(0, 20).addBox(-0.1414F, -0.7042F, 2.6494F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.4178F, 7.1299F, -3.2118F);
			setRotationAngle(left_leg, 0.0F, 0.829F, 0.0F);
			left_leg.setTextureOffset(86, 83).addBox(8.1913F, 7.2163F, -1.4288F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(76, 34).addBox(7.1978F, 14.8701F, -2.4288F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(86, 26).addBox(7.6978F, 6.8701F, -1.9288F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(86, 20).addBox(5.1978F, 0.7701F, -1.9288F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(85, 54).addBox(1.4978F, 4.9701F, -1.9288F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg_r1 = new ModelRenderer(this);
			right_leg_r1.setRotationPoint(-2.3802F, 1.3701F, -4.1152F);
			left_leg.addChild(right_leg_r1);
			setRotationAngle(right_leg_r1, 0.0F, 0.0F, 0.7418F);
			right_leg_r1.setTextureOffset(95, 58).addBox(6.3905F, -5.9821F, 2.6864F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg_r2 = new ModelRenderer(this);
			right_leg_r2.setRotationPoint(-0.4697F, 6.8044F, -4.1152F);
			left_leg.addChild(right_leg_r2);
			setRotationAngle(right_leg_r2, 0.0F, 0.0F, -0.4363F);
			right_leg_r2.setTextureOffset(94, 79).addBox(2.1805F, -6.4113F, 2.6864F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg_r3 = new ModelRenderer(this);
			right_leg_r3.setRotationPoint(2.6198F, 0.3701F, -4.1152F);
			left_leg.addChild(right_leg_r3);
			setRotationAngle(right_leg_r3, 0.0F, 0.0F, -0.4363F);
			right_leg_r3.setTextureOffset(96, 30).addBox(2.0615F, 2.4276F, 2.6864F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			left_leg2 = new ModelRenderer(this);
			left_leg2.setRotationPoint(3.1F, 7.0F, 0.0F);
			left_leg2.setTextureOffset(46, 85).addBox(7.0936F, 7.3462F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			left_leg2.setTextureOffset(74, 0).addBox(6.1F, 15.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			left_leg2.setTextureOffset(85, 12).addBox(6.6F, 7.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_leg2.setTextureOffset(84, 64).addBox(4.1F, 0.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_leg2.setTextureOffset(84, 6).addBox(0.4F, 5.1F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg_r4 = new ModelRenderer(this);
			right_leg_r4.setRotationPoint(-0.1F, 1.5F, 0.0F);
			left_leg2.addChild(right_leg_r4);
			setRotationAngle(right_leg_r4, 0.0F, 0.0F, 0.7418F);
			right_leg_r4.setTextureOffset(40, 93).addBox(3.9F, -3.7F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg_r5 = new ModelRenderer(this);
			right_leg_r5.setRotationPoint(1.8105F, 6.9343F, 0.0F);
			left_leg2.addChild(right_leg_r5);
			setRotationAngle(right_leg_r5, 0.0F, 0.0F, -0.4363F);
			right_leg_r5.setTextureOffset(80, 93).addBox(-0.881F, -7.8389F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg_r6 = new ModelRenderer(this);
			right_leg_r6.setRotationPoint(4.9F, 0.5F, 0.0F);
			left_leg2.addChild(right_leg_r6);
			setRotationAngle(right_leg_r6, 0.0F, 0.0F, -0.4363F);
			right_leg_r6.setTextureOffset(94, 47).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			left_leg3 = new ModelRenderer(this);
			left_leg3.setRotationPoint(3.1F, 7.0F, 4.0F);
			setRotationAngle(left_leg3, 0.0F, -0.829F, 0.0F);
			left_leg3.setTextureOffset(78, 83).addBox(7.745F, 7.3462F, -1.2467F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			left_leg3.setTextureOffset(52, 73).addBox(6.7515F, 15.0F, -2.2467F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			left_leg3.setTextureOffset(66, 83).addBox(7.2515F, 7.0F, -1.7467F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_leg3.setTextureOffset(34, 83).addBox(4.7515F, 0.9F, -1.7467F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_leg3.setTextureOffset(82, 48).addBox(1.0515F, 5.1F, -1.7467F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg_r7 = new ModelRenderer(this);
			right_leg_r7.setRotationPoint(-2.8265F, 1.5F, 3.4396F);
			left_leg3.addChild(right_leg_r7);
			setRotationAngle(right_leg_r7, 0.0F, 0.0F, 0.7418F);
			right_leg_r7.setTextureOffset(72, 91).addBox(6.3905F, -5.9821F, -4.6864F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg_r8 = new ModelRenderer(this);
			right_leg_r8.setRotationPoint(-0.9159F, 6.9343F, 3.4396F);
			left_leg3.addChild(right_leg_r8);
			setRotationAngle(right_leg_r8, 0.0F, 0.0F, -0.4363F);
			right_leg_r8.setTextureOffset(92, 91).addBox(2.1805F, -6.4113F, -4.6864F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg_r9 = new ModelRenderer(this);
			right_leg_r9.setRotationPoint(2.1735F, 0.5F, 3.4396F);
			left_leg3.addChild(right_leg_r9);
			setRotationAngle(right_leg_r9, 0.0F, 0.0F, -0.4363F);
			right_leg_r9.setTextureOffset(93, 0).addBox(2.0615F, 2.4276F, -4.6864F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.391F, 7.1299F, -4.0F);
			setRotationAngle(right_leg, 0.0F, -0.829F, 0.0F);
			right_leg.setTextureOffset(58, 81).addBox(-9.6283F, 7.2163F, -0.8766F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(73, 23).addBox(-10.6348F, 14.8701F, -1.8766F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(46, 79).addBox(-10.1348F, 6.8701F, -1.3766F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(77, 77).addBox(-7.6348F, 0.7701F, -1.3766F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(65, 77).addBox(-3.9348F, 4.9701F, -1.3766F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg_r10 = new ModelRenderer(this);
			right_leg_r10.setRotationPoint(2.9432F, 1.3701F, -3.563F);
			right_leg.addChild(right_leg_r10);
			setRotationAngle(right_leg_r10, 0.0F, 0.0F, -0.7418F);
			right_leg_r10.setTextureOffset(24, 90).addBox(-8.3905F, -5.9821F, 2.6864F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg_r11 = new ModelRenderer(this);
			right_leg_r11.setRotationPoint(1.0327F, 6.8044F, -3.563F);
			right_leg.addChild(right_leg_r11);
			setRotationAngle(right_leg_r11, 0.0F, 0.0F, 0.4363F);
			right_leg_r11.setTextureOffset(90, 38).addBox(-4.1805F, -6.4113F, 2.6864F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg_r12 = new ModelRenderer(this);
			right_leg_r12.setRotationPoint(-2.0568F, 0.3701F, -3.563F);
			right_leg.addChild(right_leg_r12);
			setRotationAngle(right_leg_r12, 0.0F, 0.0F, 0.4363F);
			right_leg_r12.setTextureOffset(54, 91).addBox(-4.0615F, 2.4276F, 2.6864F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg2 = new ModelRenderer(this);
			right_leg2.setRotationPoint(-3.1F, 7.0F, 0.0F);
			right_leg2.setTextureOffset(46, 0).addBox(-9.0936F, 7.3462F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			right_leg2.setTextureOffset(73, 17).addBox(-10.1F, 15.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			right_leg2.setTextureOffset(34, 77).addBox(-9.6F, 7.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg2.setTextureOffset(76, 58).addBox(-7.1F, 0.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg2.setTextureOffset(14, 70).addBox(-3.4F, 5.1F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg_r13 = new ModelRenderer(this);
			right_leg_r13.setRotationPoint(0.1F, 1.5F, 0.0F);
			right_leg2.addChild(right_leg_r13);
			setRotationAngle(right_leg_r13, 0.0F, 0.0F, -0.7418F);
			right_leg_r13.setTextureOffset(32, 89).addBox(-5.9F, -3.7F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg_r14 = new ModelRenderer(this);
			right_leg_r14.setRotationPoint(-1.8105F, 6.9343F, 0.0F);
			right_leg2.addChild(right_leg_r14);
			setRotationAngle(right_leg_r14, 0.0F, 0.0F, 0.4363F);
			right_leg_r14.setTextureOffset(64, 89).addBox(-1.119F, -7.8389F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg_r15 = new ModelRenderer(this);
			right_leg_r15.setRotationPoint(-4.9F, 0.5F, 0.0F);
			right_leg2.addChild(right_leg_r15);
			setRotationAngle(right_leg_r15, 0.0F, 0.0F, 0.4363F);
			right_leg_r15.setTextureOffset(89, 70).addBox(-1.0F, 1.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg3 = new ModelRenderer(this);
			right_leg3.setRotationPoint(-3.1F, 7.0F, 4.0F);
			setRotationAngle(right_leg3, 0.0F, 0.829F, 0.0F);
			right_leg3.setTextureOffset(42, 20).addBox(-9.745F, 7.3462F, -1.2467F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			right_leg3.setTextureOffset(14, 64).addBox(-10.7515F, 15.0F, -2.2467F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			right_leg3.setTextureOffset(0, 70).addBox(-10.2515F, 7.0F, -1.7467F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg3.setTextureOffset(0, 64).addBox(-7.7515F, 0.9F, -1.7467F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg3.setTextureOffset(50, 53).addBox(-4.0515F, 5.1F, -1.7467F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg_r16 = new ModelRenderer(this);
			right_leg_r16.setRotationPoint(2.8265F, 1.5F, 3.4396F);
			right_leg3.addChild(right_leg_r16);
			setRotationAngle(right_leg_r16, 0.0F, 0.0F, -0.7418F);
			right_leg_r16.setTextureOffset(0, 88).addBox(-8.3905F, -5.9821F, -4.6864F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg_r17 = new ModelRenderer(this);
			right_leg_r17.setRotationPoint(0.9159F, 6.9343F, 3.4396F);
			right_leg3.addChild(right_leg_r17);
			setRotationAngle(right_leg_r17, 0.0F, 0.0F, 0.4363F);
			right_leg_r17.setTextureOffset(8, 88).addBox(-4.1805F, -6.4113F, -4.6864F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg_r18 = new ModelRenderer(this);
			right_leg_r18.setRotationPoint(-2.1735F, 0.5F, 3.4396F);
			right_leg3.addChild(right_leg_r18);
			setRotationAngle(right_leg_r18, 0.0F, 0.0F, 0.4363F);
			right_leg_r18.setTextureOffset(16, 88).addBox(-4.0615F, 2.4276F, -4.6864F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg3.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.left_leg2.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.left_leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.right_leg2.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}

}
