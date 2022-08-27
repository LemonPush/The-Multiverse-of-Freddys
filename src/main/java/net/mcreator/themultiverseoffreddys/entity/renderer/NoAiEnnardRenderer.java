
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

import net.mcreator.themultiverseoffreddys.entity.NoAiEnnardEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NoAiEnnardRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NoAiEnnardEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelEnnard(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/ennard.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelEnnard extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer right_arm_r5;
		private final ModelRenderer right_arm_r6;
		private final ModelRenderer right_arm_r7;
		private final ModelRenderer right_arm_r8;
		private final ModelRenderer right_arm_r9;
		private final ModelRenderer right_arm_r10;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r11;
		private final ModelRenderer right_arm_r12;
		private final ModelRenderer right_arm_r13;
		private final ModelRenderer right_arm_r14;
		private final ModelRenderer right_arm_r15;
		private final ModelRenderer right_arm_r16;
		private final ModelRenderer right_arm_r17;
		private final ModelRenderer right_arm_r18;
		private final ModelRenderer right_arm_r19;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_arm_r20;
		private final ModelRenderer right_arm_r21;
		private final ModelRenderer right_arm_r22;
		private final ModelRenderer right_arm_r23;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_arm_r24;
		private final ModelRenderer right_arm_r25;

		public ModelEnnard() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -11.0F, -1.0F);
			head.setTextureOffset(20, 21).addBox(-4.0F, -13.0F, -3.0F, 8.0F, 9.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(22, 25).addBox(-3.5F, -8.7F, -3.3F, 7.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 37).addBox(-3.5F, -12.0F, 1.0F, 7.0F, 8.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(60, 46).addBox(1.0F, -11.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(98, 38).addBox(-2.0F, -6.7F, -3.1F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(47, 15).addBox(-0.5F, -8.6F, -3.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(4, 60).addBox(-3.0F, -11.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(100, 29).addBox(1.0F, -12.0F, -3.0F, 2.0F, 0.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(100, 29).addBox(-3.0F, -12.0F, -3.0F, 2.0F, 0.0F, 1.0F, 0.25F, false);
			head.setTextureOffset(60, 49).addBox(3.5F, -10.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(47, 61).addBox(4.0F, -10.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(28, 59).addBox(-4.5F, -10.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(43, 61).addBox(-5.0F, -10.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-3.9F, -5.0F, 1.3F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.5236F, 0.0F);
			head_r1.setTextureOffset(0, 0).addBox(-0.6F, -1.0F, 0.2F, 1.0F, 2.0F, 2.0F, 0.25F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-1.5F, -12.75F, -0.5F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, -0.215F, -0.0376F, -0.1705F);
			head_r2.setTextureOffset(40, 23).addBox(-0.5F, -4.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 32).addBox(-0.5F, -5.25F, -0.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);
			head_r2.setTextureOffset(30, 34).addBox(-1.0F, -3.25F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head_r2.setTextureOffset(46, 33).addBox(-1.5F, -1.25F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -9.0F, 0.0F);
			body.setTextureOffset(24, 12).addBox(-4.5F, 8.2F, -2.5F, 9.0F, 3.0F, 5.0F, 0.25F, false);
			body.setTextureOffset(0, 0).addBox(-5.0F, -5.0F, -3.0F, 10.0F, 6.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 12).addBox(-3.5F, 0.0F, -2.5F, 7.0F, 8.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(40, 20).addBox(1.2F, 4.0F, -2.8F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 25).addBox(-1.0F, -3.75F, -3.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(45, 55).addBox(4.9F, -3.9F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(45, 55).addBox(-6.9F, -3.9F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, true);
			body.setTextureOffset(54, 4).addBox(-1.5F, -6.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.5451F, -11.3415F, -0.0667F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.2182F);
			left_arm.setTextureOffset(16, 59).addBox(1.6867F, 17.8571F, -0.4333F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(1.6691F, 17.9252F, 0.8667F);
			left_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 0.0F, 0.3054F);
			right_arm_r1.setTextureOffset(24, 59).addBox(0.0176F, -0.0681F, -2.3F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(1.6691F, 17.9252F, 0.8667F);
			left_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, 0.1745F);
			right_arm_r2.setTextureOffset(20, 59).addBox(-1.8824F, -1.0681F, -2.1F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(1.6691F, 17.9252F, 0.8667F);
			left_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, 0.0F, 0.0F, 0.7418F);
			right_arm_r3.setTextureOffset(0, 60).addBox(0.0176F, -0.0681F, -0.3F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(3.8413F, 8.5446F, 0.0667F);
			left_arm.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, 0.0F, 0.0F, 0.0087F);
			right_arm_r4.setTextureOffset(47, 9).addBox(-1.2F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(3.5882F, 7.7401F, 0.0667F);
			left_arm.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, 0.0F, 0.0F, 0.2618F);
			right_arm_r5.setTextureOffset(53, 19).addBox(-1.25F, 9.2667F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm_r5.setTextureOffset(36, 36).addBox(-1.2F, 1.2667F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);
			right_arm_r6 = new ModelRenderer(this);
			right_arm_r6.setRotationPoint(0.2408F, 5.5163F, 0.0667F);
			left_arm.addChild(right_arm_r6);
			setRotationAngle(right_arm_r6, -0.202F, -0.3918F, 1.9697F);
			right_arm_r6.setTextureOffset(56, 23).addBox(-0.7356F, 0.1824F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r7 = new ModelRenderer(this);
			right_arm_r7.setRotationPoint(0.2408F, 5.5163F, 0.0667F);
			left_arm.addChild(right_arm_r7);
			setRotationAngle(right_arm_r7, -0.4222F, -0.1216F, 2.7847F);
			right_arm_r7.setTextureOffset(57, 44).addBox(-3.6951F, 0.3398F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r8 = new ModelRenderer(this);
			right_arm_r8.setRotationPoint(3.1408F, -1.5837F, 0.0667F);
			left_arm.addChild(right_arm_r8);
			setRotationAngle(right_arm_r8, 0.0F, 0.0F, -1.2217F);
			right_arm_r8.setTextureOffset(56, 25).addBox(-0.7356F, 0.1824F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r9 = new ModelRenderer(this);
			right_arm_r9.setRotationPoint(3.1408F, -1.5837F, 0.0667F);
			left_arm.addChild(right_arm_r9);
			setRotationAngle(right_arm_r9, 0.0F, 0.0F, -0.3927F);
			right_arm_r9.setTextureOffset(55, 57).addBox(-3.6951F, 0.3398F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r10 = new ModelRenderer(this);
			right_arm_r10.setRotationPoint(-1.7118F, 1.7567F, 0.0667F);
			left_arm.addChild(right_arm_r10);
			setRotationAngle(right_arm_r10, 0.0F, 0.0F, -0.3927F);
			right_arm_r10.setTextureOffset(36, 35).addBox(1.3F, -1.55F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.5364F, -11.4457F, -0.1F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.2182F);
			right_arm_r11 = new ModelRenderer(this);
			right_arm_r11.setRotationPoint(-1.655F, 18.0288F, 0.9F);
			right_arm.addChild(right_arm_r11);
			setRotationAngle(right_arm_r11, 0.0F, 0.0F, -0.4363F);
			right_arm_r11.setTextureOffset(0, 12).addBox(-0.8176F, -0.3681F, -2.3F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r12 = new ModelRenderer(this);
			right_arm_r12.setRotationPoint(-1.655F, 18.0288F, 0.9F);
			right_arm.addChild(right_arm_r12);
			setRotationAngle(right_arm_r12, 0.0F, 0.0F, -0.8727F);
			right_arm_r12.setTextureOffset(16, 28).addBox(-1.0176F, -0.0681F, -1.3F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r13 = new ModelRenderer(this);
			right_arm_r13.setRotationPoint(-1.655F, 18.0288F, 0.9F);
			right_arm.addChild(right_arm_r13);
			setRotationAngle(right_arm_r13, 0.0F, 0.0F, -0.6109F);
			right_arm_r13.setTextureOffset(35, 58).addBox(0.8824F, -1.0681F, -2.1F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r14 = new ModelRenderer(this);
			right_arm_r14.setRotationPoint(-1.655F, 18.0288F, 0.9F);
			right_arm.addChild(right_arm_r14);
			setRotationAngle(right_arm_r14, 0.0F, 0.0F, -0.3491F);
			right_arm_r14.setTextureOffset(39, 58).addBox(-1.0176F, -0.0681F, -0.3F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r15 = new ModelRenderer(this);
			right_arm_r15.setRotationPoint(-3.8272F, 8.6482F, 0.1F);
			right_arm.addChild(right_arm_r15);
			setRotationAngle(right_arm_r15, 0.0F, 0.0F, -0.0087F);
			right_arm_r15.setTextureOffset(28, 1).addBox(-0.8F, -2.0F, -0.9F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			right_arm_r16 = new ModelRenderer(this);
			right_arm_r16.setRotationPoint(-3.5741F, 7.8436F, 0.1F);
			right_arm.addChild(right_arm_r16);
			setRotationAngle(right_arm_r16, 0.0F, 0.0F, -0.2618F);
			right_arm_r16.setTextureOffset(48, 0).addBox(-1.75F, 9.2667F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm_r16.setTextureOffset(19, 36).addBox(-1.8F, 1.2667F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);
			right_arm_r17 = new ModelRenderer(this);
			right_arm_r17.setRotationPoint(-4.6267F, 2.1198F, 0.1F);
			right_arm.addChild(right_arm_r17);
			setRotationAngle(right_arm_r17, 3.1416F, 0.0F, -0.7418F);
			right_arm_r17.setTextureOffset(50, 42).addBox(-4.2644F, 0.1824F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r18 = new ModelRenderer(this);
			right_arm_r18.setRotationPoint(-4.6267F, 2.1198F, 0.1F);
			right_arm.addChild(right_arm_r18);
			setRotationAngle(right_arm_r18, 3.1416F, 0.0F, 0.0873F);
			right_arm_r18.setTextureOffset(19, 12).addBox(-0.3049F, 0.3398F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r19 = new ModelRenderer(this);
			right_arm_r19.setRotationPoint(1.7259F, 1.8603F, 0.1F);
			right_arm.addChild(right_arm_r19);
			setRotationAngle(right_arm_r19, 0.0F, 0.0F, 0.3927F);
			right_arm_r19.setTextureOffset(0, 28).addBox(-4.7F, 4.45F, -1.4F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r19.setTextureOffset(20, 35).addBox(-4.3F, -1.55F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.9F, 1.0F, 0.0F);
			left_leg.setTextureOffset(0, 47).addBox(-1.6F, 10.0F, -1.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(44, 9).addBox(-1.0F, 12.3F, -2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(34, 34).addBox(-2.1F, 0.5F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(52, 15).addBox(-1.6F, 9.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(32, 0).addBox(-2.55F, 20.0F, -4.0F, 5.0F, 3.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(32, 9).addBox(-2.55F, 21.0F, -5.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(59, 59).addBox(1.45F, 22.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(53, 59).addBox(0.05F, 22.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(59, 36).addBox(-2.55F, 22.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(59, 12).addBox(-1.25F, 22.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r20 = new ModelRenderer(this);
			right_arm_r20.setRotationPoint(2.5526F, 3.3095F, 0.0F);
			left_leg.addChild(right_arm_r20);
			setRotationAngle(right_arm_r20, 2.6222F, 0.0335F, 0.8294F);
			right_arm_r20.setTextureOffset(56, 27).addBox(-3.6951F, 0.3398F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r21 = new ModelRenderer(this);
			right_arm_r21.setRotationPoint(2.5526F, 3.3095F, 0.0F);
			left_leg.addChild(right_arm_r21);
			setRotationAngle(right_arm_r21, 2.798F, 0.3988F, 1.5972F);
			right_arm_r21.setTextureOffset(56, 8).addBox(-0.7356F, 0.1824F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r22 = new ModelRenderer(this);
			right_arm_r22.setRotationPoint(-2.6474F, 14.5095F, 0.0F);
			left_leg.addChild(right_arm_r22);
			setRotationAngle(right_arm_r22, -0.4222F, -0.1216F, 2.3047F);
			right_arm_r22.setTextureOffset(57, 0).addBox(-3.6951F, 0.3398F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r23 = new ModelRenderer(this);
			right_arm_r23.setRotationPoint(-2.6474F, 14.5095F, 0.0F);
			left_leg.addChild(right_arm_r23);
			setRotationAngle(right_arm_r23, -0.202F, -0.3918F, 1.4898F);
			right_arm_r23.setTextureOffset(56, 10).addBox(-0.7356F, 0.1824F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.9F, 1.0F, 0.0F);
			right_leg.setTextureOffset(44, 20).addBox(-1.4F, 10.0F, -1.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(18, 34).addBox(-1.9F, 0.5F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(50, 38).addBox(-1.4F, 9.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 28).addBox(-2.45F, 20.0F, -4.0F, 5.0F, 3.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 25).addBox(-2.45F, 21.0F, -5.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(10, 59).addBox(-2.45F, 22.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(33, 47).addBox(-1.05F, 22.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(21, 47).addBox(1.55F, 22.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(9, 47).addBox(0.25F, 22.0F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r24 = new ModelRenderer(this);
			right_arm_r24.setRotationPoint(-0.5526F, 6.3095F, 3.0F);
			right_leg.addChild(right_arm_r24);
			setRotationAngle(right_arm_r24, 1.686F, 0.6227F, -1.1371F);
			right_arm_r24.setTextureOffset(19, 14).addBox(-0.3049F, 0.3398F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r25 = new ModelRenderer(this);
			right_arm_r25.setRotationPoint(-0.5526F, 6.3095F, 3.0F);
			right_leg.addChild(right_arm_r25);
			setRotationAngle(right_arm_r25, 1.6662F, -0.2023F, -1.2237F);
			right_arm_r25.setTextureOffset(52, 55).addBox(-4.2644F, 0.1824F, -0.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);
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
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
