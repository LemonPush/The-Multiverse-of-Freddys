
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

import net.mcreator.themultiverseoffreddys.entity.HammerHeadPuppetEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class HammerHeadPuppetRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(HammerHeadPuppetEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelHammerHeadPuppet(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/hammerheadpuppet.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelHammerHeadPuppet extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer bone3;
		private final ModelRenderer body;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer body_r3;
		private final ModelRenderer body_r4;
		private final ModelRenderer body_r5;
		private final ModelRenderer body_r6;
		private final ModelRenderer body_r7;
		private final ModelRenderer body_r8;
		private final ModelRenderer body_r9;
		private final ModelRenderer body_r10;
		private final ModelRenderer body_r11;
		private final ModelRenderer body_r12;
		private final ModelRenderer bone;
		private final ModelRenderer body_r13;
		private final ModelRenderer bone2;
		private final ModelRenderer body_r14;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer lower;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer tent;
		private final ModelRenderer right_arm_r5;
		private final ModelRenderer right_arm_r6;
		private final ModelRenderer right_arm_r7;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r8;
		private final ModelRenderer lower2;
		private final ModelRenderer right_arm_r9;
		private final ModelRenderer tent2;
		private final ModelRenderer right_arm_r10;
		private final ModelRenderer right_arm_r11;
		private final ModelRenderer right_arm_r12;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg_r1;
		private final ModelRenderer lower_leg2;
		private final ModelRenderer right_leg_r2;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg_r3;
		private final ModelRenderer lower_leg3;
		private final ModelRenderer right_leg_r4;

		public ModelHammerHeadPuppet() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -23.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-5.0F, -13.0F, -4.0F, 10.0F, 12.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 29).addBox(-5.0F, -13.0F, -5.0F, 10.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 29).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 38).addBox(-5.0F, -11.0F, 4.0F, 10.0F, 10.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(38, 28).addBox(-4.0F, -9.0F, 6.0F, 8.0F, 8.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(28, 0).addBox(-3.0F, -7.0F, 8.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(54, 62).addBox(-2.0F, -5.0F, 10.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(74, 0).addBox(-1.0F, -3.0F, 12.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 20).addBox(-5.5F, -1.0F, -4.0F, 11.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(27, 29).addBox(-6.0F, -12.0F, -5.0F, 1.0F, 11.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(36, 0).addBox(5.0F, -12.0F, -5.0F, 1.0F, 11.0F, 9.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-12.0F, 18.0F, 0.0F);
			head.addChild(bone3);
			bone3.setTextureOffset(47, 38).addBox(7.0F, -23.5F, -5.0F, 10.0F, 5.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(0, 50).addBox(7.5F, -30.5F, -5.0F, 9.0F, 5.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(55, 24).addBox(7.5F, -25.5F, -5.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(47, 0).addBox(16.0F, -24.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(22, 38).addBox(7.0F, -24.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(36, 73).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(72, 50).addBox(-2.0F, -9.5F, 1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(52, 50).addBox(-2.0F, -19.0F, -1.0F, 4.0F, 9.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(38, 50).addBox(-2.0F, -19.0F, -2.0F, 4.0F, 9.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(64, 22).addBox(-3.0F, -11.5F, 1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(58, 32).addBox(-4.0F, -13.5F, 1.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(20, 68).addBox(-3.0F, -19.0F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(69, 11).addBox(-2.0F, -19.0F, -1.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(67, 41).addBox(-4.0F, -19.0F, -1.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(72, 24).addBox(-5.0F, -19.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 20).addBox(-3.0F, -19.0F, -1.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(71, 71).addBox(4.0F, -19.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 29).addBox(3.0F, -19.0F, -1.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(2.0F, -19.0F, -1.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(28, 29).addBox(1.0F, -19.0F, -1.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(63, 65).addBox(2.0F, -19.0F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(69, 2).addBox(3.0F, -19.5F, -2.0F, 1.0F, 6.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(54, 68).addBox(-4.0F, -19.5F, -2.0F, 1.0F, 6.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(71, 64).addBox(-5.0F, -19.4F, -2.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(44, 73).addBox(-6.0F, -19.2F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(72, 45).addBox(5.0F, -19.2F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(70, 34).addBox(4.0F, -19.4F, -2.0F, 1.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(58, 27).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(47, 0).addBox(-4.0F, -4.0F, -2.0F, 8.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 56).addBox(-3.0F, -5.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(73, 58).addBox(-1.0F, -23.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(30, 20).addBox(-7.0F, -20.0F, -2.0F, 14.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(6.0F, -18.0F, 0.0F);
			body.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 0.0F, -1.0472F);
			right_arm_r1.setTextureOffset(64, 60).addBox(-0.8F, -0.2F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-6.0F, -18.0F, 0.0F);
			body.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, 1.0472F);
			right_arm_r2.setTextureOffset(66, 18).addBox(-2.2F, -0.2F, -2.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(4.0F, -13.0F, 1.5F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 1.4835F, 0.0F);
			body_r1.setTextureOffset(56, 5).addBox(2.0F, -0.5F, 0.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(4.0F, -13.0F, 1.5F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, 0.9163F, 0.0F);
			body_r2.setTextureOffset(74, 11).addBox(-0.4F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(-4.0F, -13.0F, 1.5F);
			body.addChild(body_r3);
			setRotationAngle(body_r3, 0.0F, -0.9163F, 0.0F);
			body_r3.setTextureOffset(67, 0).addBox(-2.6F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(-4.0F, -13.0F, 1.5F);
			body.addChild(body_r4);
			setRotationAngle(body_r4, 0.0F, -1.4835F, 0.0F);
			body_r4.setTextureOffset(49, 50).addBox(-4.0F, -0.5F, 0.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body_r5 = new ModelRenderer(this);
			body_r5.setRotationPoint(3.0F, -11.0F, 1.5F);
			body.addChild(body_r5);
			setRotationAngle(body_r5, 0.0F, 0.9163F, 0.0F);
			body_r5.setTextureOffset(74, 30).addBox(-0.4F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body_r6 = new ModelRenderer(this);
			body_r6.setRotationPoint(3.0F, -11.0F, 1.5F);
			body.addChild(body_r6);
			setRotationAngle(body_r6, 0.0F, 1.4835F, 0.0F);
			body_r6.setTextureOffset(16, 56).addBox(2.0F, -0.5F, 0.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body_r7 = new ModelRenderer(this);
			body_r7.setRotationPoint(-3.0F, -11.0F, 1.5F);
			body.addChild(body_r7);
			setRotationAngle(body_r7, 0.0F, -0.9163F, 0.0F);
			body_r7.setTextureOffset(74, 52).addBox(-2.6F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body_r8 = new ModelRenderer(this);
			body_r8.setRotationPoint(-3.0F, -11.0F, 1.5F);
			body.addChild(body_r8);
			setRotationAngle(body_r8, 0.0F, -1.4835F, 0.0F);
			body_r8.setTextureOffset(56, 28).addBox(-4.0F, -0.5F, 0.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body_r9 = new ModelRenderer(this);
			body_r9.setRotationPoint(-2.0F, -9.0F, 1.5F);
			body.addChild(body_r9);
			setRotationAngle(body_r9, 0.0F, -0.9163F, 0.0F);
			body_r9.setTextureOffset(74, 54).addBox(-2.6F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body_r10 = new ModelRenderer(this);
			body_r10.setRotationPoint(-2.0F, -9.0F, 1.5F);
			body.addChild(body_r10);
			setRotationAngle(body_r10, 0.0F, -1.4835F, 0.0F);
			body_r10.setTextureOffset(16, 58).addBox(-4.0F, -0.5F, 0.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body_r11 = new ModelRenderer(this);
			body_r11.setRotationPoint(2.0F, -9.0F, 1.5F);
			body.addChild(body_r11);
			setRotationAngle(body_r11, 0.0F, 1.4835F, 0.0F);
			body_r11.setTextureOffset(67, 34).addBox(2.0F, -0.5F, 0.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body_r12 = new ModelRenderer(this);
			body_r12.setRotationPoint(2.0F, -9.0F, 1.5F);
			body.addChild(body_r12);
			setRotationAngle(body_r12, 0.0F, 0.9163F, 0.0F);
			body_r12.setTextureOffset(74, 56).addBox(-0.4F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(-18.0F, -5.5F, 0.0F);
			body.addChild(bone);
			body_r13 = new ModelRenderer(this);
			body_r13.setRotationPoint(17.0F, -4.0F, 0.0F);
			bone.addChild(body_r13);
			setRotationAngle(body_r13, 0.0F, 0.0F, 1.0472F);
			body_r13.setTextureOffset(30, 24).addBox(-11.866F, -0.4F, -2.0F, 11.0F, 1.0F, 3.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(-16.0F, -5.5F, 0.0F);
			body.addChild(bone2);
			body_r14 = new ModelRenderer(this);
			body_r14.setRotationPoint(17.0F, -4.0F, 0.0F);
			bone2.addChild(body_r14);
			setRotationAngle(body_r14, 0.0F, 0.0F, -1.0472F);
			body_r14.setTextureOffset(44, 46).addBox(0.866F, -0.4F, -2.0F, 10.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-6.0F, -18.0F, 0.0F);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			right_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, 0.0F, 0.0F, 0.4363F);
			right_arm_r3.setTextureOffset(28, 68).addBox(-1.9F, -0.3F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			lower = new ModelRenderer(this);
			lower.setRotationPoint(-3.7603F, 10.2234F, 0.0F);
			right_arm.addChild(lower);
			setRotationAngle(lower, -1.0526F, -0.3474F, 0.2729F);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(-2.0F, 4.0F, 0.0F);
			lower.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, 0.0F, 0.0F, 0.3927F);
			right_arm_r4.setTextureOffset(46, 62).addBox(-2.5886F, -6.6693F, -4.1646F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			tent = new ModelRenderer(this);
			tent.setRotationPoint(2.1603F, -1.6234F, 0.0F);
			lower.addChild(tent);
			tent.setTextureOffset(12, 61).addBox(-6.5136F, 7.3733F, -3.6646F, 1.0F, 16.0F, 1.0F, 0.0F, false);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
			tent.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, 0.0F, 0.0F, 0.4363F);
			right_arm_r5.setTextureOffset(58, 34).addBox(-4.3597F, 9.1103F, -4.6646F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm_r6 = new ModelRenderer(this);
			right_arm_r6.setRotationPoint(-6.7F, 10.1F, 1.0F);
			tent.addChild(right_arm_r6);
			setRotationAngle(right_arm_r6, 0.1165F, -0.0604F, 0.563F);
			right_arm_r6.setTextureOffset(8, 61).addBox(-2.7329F, -2.1857F, -3.3587F, 1.0F, 16.0F, 1.0F, 0.0F, false);
			right_arm_r7 = new ModelRenderer(this);
			right_arm_r7.setRotationPoint(-6.7F, 10.1F, -1.0F);
			tent.addChild(right_arm_r7);
			setRotationAngle(right_arm_r7, -0.4363F, 0.0F, 0.5672F);
			right_arm_r7.setTextureOffset(16, 61).addBox(-2.5513F, -0.371F, -3.9316F, 1.0F, 16.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(6.0F, -18.0F, 0.0F);
			right_arm_r8 = new ModelRenderer(this);
			right_arm_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
			left_arm.addChild(right_arm_r8);
			setRotationAngle(right_arm_r8, 0.0F, 0.0F, -0.4363F);
			right_arm_r8.setTextureOffset(66, 50).addBox(-0.1F, -0.3F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			lower2 = new ModelRenderer(this);
			lower2.setRotationPoint(3.7603F, 10.2234F, 0.0F);
			left_arm.addChild(lower2);
			setRotationAngle(lower2, -1.0526F, 0.3474F, -0.2729F);
			right_arm_r9 = new ModelRenderer(this);
			right_arm_r9.setRotationPoint(2.0F, 4.0F, 0.0F);
			lower2.addChild(right_arm_r9);
			setRotationAngle(right_arm_r9, 0.0F, 0.0F, -0.3927F);
			right_arm_r9.setTextureOffset(38, 62).addBox(0.5886F, -6.6693F, -4.1646F, 2.0F, 9.0F, 2.0F, 0.0F, false);
			tent2 = new ModelRenderer(this);
			tent2.setRotationPoint(-2.1603F, -1.6234F, 0.0F);
			lower2.addChild(tent2);
			tent2.setTextureOffset(12, 61).addBox(5.5136F, 7.3733F, -3.6646F, 1.0F, 16.0F, 1.0F, 0.0F, false);
			right_arm_r10 = new ModelRenderer(this);
			right_arm_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			tent2.addChild(right_arm_r10);
			setRotationAngle(right_arm_r10, 0.0F, 0.0F, -0.4363F);
			right_arm_r10.setTextureOffset(47, 5).addBox(1.3597F, 9.1103F, -4.6646F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm_r11 = new ModelRenderer(this);
			right_arm_r11.setRotationPoint(6.7F, 10.1F, 1.0F);
			tent2.addChild(right_arm_r11);
			setRotationAngle(right_arm_r11, 0.1165F, 0.0604F, -0.563F);
			right_arm_r11.setTextureOffset(8, 61).addBox(1.7329F, -2.1857F, -3.3587F, 1.0F, 16.0F, 1.0F, 0.0F, false);
			right_arm_r12 = new ModelRenderer(this);
			right_arm_r12.setRotationPoint(6.7F, 10.1F, -1.0F);
			tent2.addChild(right_arm_r12);
			setRotationAngle(right_arm_r12, -0.4363F, 0.0F, -0.5672F);
			right_arm_r12.setTextureOffset(8, 61).addBox(1.5513F, -0.371F, -3.9316F, 1.0F, 16.0F, 1.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, -3.0F, 0.1F);
			right_leg_r1 = new ModelRenderer(this);
			right_leg_r1.setRotationPoint(0.0F, 4.5F, -0.6F);
			left_leg.addChild(right_leg_r1);
			setRotationAngle(right_leg_r1, -0.4363F, 0.0F, 0.0F);
			right_leg_r1.setTextureOffset(61, 5).addBox(-1.0F, -5.1F, -2.4F, 2.0F, 14.0F, 2.0F, 0.0F, false);
			lower_leg2 = new ModelRenderer(this);
			lower_leg2.setRotationPoint(-4.0F, 15.0F, 0.8F);
			left_leg.addChild(lower_leg2);
			right_leg_r2 = new ModelRenderer(this);
			right_leg_r2.setRotationPoint(4.0F, -0.5F, -5.6F);
			lower_leg2.addChild(right_leg_r2);
			setRotationAngle(right_leg_r2, 0.3054F, 0.0F, 0.0F);
			right_leg_r2.setTextureOffset(30, 49).addBox(-1.0F, -3.3F, -0.7F, 2.0F, 17.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, -3.0F, 0.1F);
			right_leg_r3 = new ModelRenderer(this);
			right_leg_r3.setRotationPoint(0.0F, 4.5F, -0.6F);
			right_leg.addChild(right_leg_r3);
			setRotationAngle(right_leg_r3, -0.4363F, 0.0F, 0.0F);
			right_leg_r3.setTextureOffset(0, 61).addBox(-1.0F, -5.1F, -2.4F, 2.0F, 14.0F, 2.0F, 0.0F, false);
			lower_leg3 = new ModelRenderer(this);
			lower_leg3.setRotationPoint(4.0F, 15.0F, 0.8F);
			right_leg.addChild(lower_leg3);
			right_leg_r4 = new ModelRenderer(this);
			right_leg_r4.setRotationPoint(-4.0F, -0.5F, -5.6F);
			lower_leg3.addChild(right_leg_r4);
			setRotationAngle(right_leg_r4, 0.3054F, 0.0F, 0.0F);
			right_leg_r4.setTextureOffset(22, 49).addBox(-1.0F, -3.3F, -0.7F, 2.0F, 17.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
