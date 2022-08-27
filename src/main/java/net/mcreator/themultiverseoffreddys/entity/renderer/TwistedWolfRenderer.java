
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

import net.mcreator.themultiverseoffreddys.entity.TwistedWolfEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TwistedWolfRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TwistedWolfEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelTwistedWolf(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/twistedwolf.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelTwistedWolf extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer RightEar;
		private final ModelRenderer LeftEar;
		private final ModelRenderer LeftEar2;
		private final ModelRenderer mouth;
		private final ModelRenderer bone;
		private final ModelRenderer body;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer endo;
		private final ModelRenderer right_arm;
		private final ModelRenderer freddyarm3;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer lowerarm3;
		private final ModelRenderer cube_r5;
		private final ModelRenderer left_arm;
		private final ModelRenderer freddyarm2;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer lowerarm2;
		private final ModelRenderer cube_r8;
		private final ModelRenderer right_leg;
		private final ModelRenderer lower3;
		private final ModelRenderer left_leg;
		private final ModelRenderer lower2;

		public ModelTwistedWolf() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -19.0F, 3.0F);
			head.setTextureOffset(0, 80).addBox(-5.0F, -7.0F, -9.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 96).addBox(-5.0F, -7.0F, -1.0F, 10.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(96, 18).addBox(-3.0F, -1.0F, -13.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(100, 38).addBox(-2.0F, -2.0F, -15.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(99, 104).addBox(-1.5F, -3.0F, -14.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(96, 7).addBox(-3.0F, -1.0F, -16.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(112, 25).addBox(-1.0F, -3.5F, -14.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(99, 109).addBox(-5.0F, -7.0F, -10.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(86, 111).addBox(3.0F, -7.0F, -10.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(112, 61).addBox(1.0F, -3.0F, -10.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 104).addBox(-3.0F, -3.0F, -10.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(112, 74).addBox(1.0F, -7.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(94, 52).addBox(-3.0F, -7.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 80).addBox(-1.0F, -7.0F, -10.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(56, 77).addBox(4.0F, -7.0F, -9.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(42, 74).addBox(5.0F, 2.2F, -10.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(64, 45).addBox(5.0F, -5.8F, -10.0F, 1.0F, 5.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(58, 62).addBox(-6.0F, -5.8F, -10.0F, 1.0F, 5.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(16, 72).addBox(5.0F, 1.2F, -10.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(70, 0).addBox(5.0F, 0.2F, -10.0F, 3.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(52, 18).addBox(5.0F, -0.8F, -10.0F, 4.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(70, 69).addBox(-7.0F, 1.2F, -10.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(30, 73).addBox(-6.0F, 2.2F, -10.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(0, 69).addBox(-8.0F, 0.2F, -10.0F, 3.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(46, 51).addBox(-9.0F, -0.8F, -10.0F, 4.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(28, 24).addBox(-4.0F, -7.0F, -9.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(41, 0).addBox(-4.0F, -8.0F, -9.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(113, 37).addBox(-3.0F, -5.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(112, 89).addBox(1.0F, -5.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(81, 55).addBox(-4.0F, 0.0F, -9.0F, 8.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(30, 16).addBox(-3.0F, 0.0F, -16.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(108, 104).addBox(-3.0F, 0.0F, -15.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(100, 29).addBox(-5.0F, -1.0F, -10.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(96, 38).addBox(3.0F, -1.0F, -10.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(105, 74).addBox(2.0F, 0.0F, -15.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(46, 9).addBox(-4.0F, -2.0F, -9.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			RightEar = new ModelRenderer(this);
			RightEar.setRotationPoint(-4.5F, -8.5F, -4.0F);
			head.addChild(RightEar);
			setRotationAngle(RightEar, 0.0F, 0.0F, -0.7854F);
			LeftEar = new ModelRenderer(this);
			LeftEar.setRotationPoint(4.1F, -8.5F, -4.0F);
			head.addChild(LeftEar);
			setRotationAngle(LeftEar, 0.0F, 0.0F, 0.4363F);
			LeftEar.setTextureOffset(20, 37).addBox(0.2F, 0.5F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			LeftEar.setTextureOffset(74, 60).addBox(-0.3F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftEar.setTextureOffset(72, 80).addBox(-0.3F, -4.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftEar.setTextureOffset(64, 51).addBox(-0.8F, -3.5F, -1.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			LeftEar.setTextureOffset(64, 51).addBox(-0.8F, -3.5F, -1.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			LeftEar.setTextureOffset(74, 60).addBox(-0.3F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftEar.setTextureOffset(72, 80).addBox(-0.3F, -4.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftEar2 = new ModelRenderer(this);
			LeftEar2.setRotationPoint(-4.1F, -8.5F, -4.0F);
			head.addChild(LeftEar2);
			setRotationAngle(LeftEar2, 0.0F, 0.0F, -0.4363F);
			LeftEar2.setTextureOffset(6, 27).addBox(-1.2F, 0.5F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			LeftEar2.setTextureOffset(72, 80).addBox(-1.7F, -4.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			LeftEar2.setTextureOffset(74, 60).addBox(-1.7F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			LeftEar2.setTextureOffset(64, 51).addBox(-2.2F, -3.5F, -1.5F, 3.0F, 3.0F, 1.0F, 0.0F, true);
			mouth = new ModelRenderer(this);
			mouth.setRotationPoint(0.0F, 1.0F, -4.0F);
			head.addChild(mouth);
			setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
			mouth.setTextureOffset(0, 10).addBox(-5.0F, 0.7071F, -6.0247F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			mouth.setTextureOffset(0, 21).addBox(-4.0F, 1.7071F, -6.0247F, 8.0F, 1.0F, 10.0F, 0.0F, false);
			mouth.setTextureOffset(37, 99).addBox(-2.0F, 1.7071F, -11.0247F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			mouth.setTextureOffset(84, 69).addBox(-4.0F, -0.2164F, -5.127F, 8.0F, 1.0F, 5.0F, 0.0F, false);
			mouth.setTextureOffset(108, 104).addBox(-3.0F, -0.2929F, -11.0247F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			mouth.setTextureOffset(96, 38).addBox(3.0F, -0.2929F, -6.0247F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(100, 29).addBox(-5.0F, -0.2929F, -6.0247F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(105, 74).addBox(2.0F, -0.2929F, -11.0247F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			mouth.setTextureOffset(30, 16).addBox(-3.0F, -0.2929F, -12.0247F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 20.0F, 1.0F);
			mouth.addChild(bone);
			bone.setTextureOffset(88, 11).addBox(-3.0F, -19.2929F, -13.0247F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(26, 21).addBox(-7.0F, -32.0F, -4.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(30, 18).addBox(-7.0F, -33.0F, -5.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(70, 22).addBox(-7.0F, -33.0F, 3.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(70, 62).addBox(-7.0F, -31.0F, -4.0F, 14.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(83, 96).addBox(-5.0F, -32.0F, -4.3F, 10.0F, 6.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(84, 75).addBox(-6.0F, -34.7F, -5.3F, 12.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(50, 100).addBox(-7.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(75, 98).addBox(6.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(60, 29).addBox(-7.0F, -32.0F, 2.0F, 14.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(58, 92).addBox(-6.0F, -24.0F, -3.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(95, 23).addBox(-3.0F, -20.0F, -3.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(76, 45).addBox(5.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(16, 72).addBox(-6.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(89, 80).addBox(-6.0F, -24.0F, 1.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(52, 37).addBox(-8.0F, -36.0F, -5.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(58, 97).addBox(-5.0F, -37.0F, -6.0F, 10.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 32).addBox(-3.0F, -39.0F, 4.0F, 6.0F, 22.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(48, 68).addBox(-3.0F, -40.0F, 4.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(104, 0).addBox(-3.0F, -41.0F, 4.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(111, 6).addBox(-8.0F, -37.0F, -6.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(32, 62).addBox(-8.0F, -38.0F, -6.0F, 3.0F, 1.0F, 10.0F, 0.0F, false);
			body.setTextureOffset(16, 61).addBox(5.0F, -38.0F, -6.0F, 3.0F, 1.0F, 10.0F, 0.0F, false);
			body.setTextureOffset(105, 96).addBox(5.0F, -37.0F, -6.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 32).addBox(7.0F, -36.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 32).addBox(-8.0F, -36.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-8.0F, -37.0F, -5.0F, 16.0F, 1.0F, 9.0F, 0.0F, false);
			body.setTextureOffset(56, 41).addBox(-8.0F, -36.0F, 3.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-5.5F, -31.0F, 6.0F);
			body.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -0.5236F, 0.0F);
			cube_r1.setTextureOffset(104, 3).addBox(-3.7F, -10.0F, -3.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(102, 100).addBox(-3.7F, -9.0F, -3.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r1.setTextureOffset(20, 37).addBox(-3.7F, -8.0F, -3.0F, 5.0F, 20.0F, 4.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(5.5F, -31.0F, 6.0F);
			body.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.5236F, 0.0F);
			cube_r2.setTextureOffset(105, 44).addBox(-1.3F, -10.0F, -3.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r2.setTextureOffset(103, 29).addBox(-1.3F, -9.0F, -3.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r2.setTextureOffset(38, 37).addBox(-1.3F, -8.0F, -3.0F, 5.0F, 20.0F, 4.0F, 0.0F, false);
			endo = new ModelRenderer(this);
			endo.setRotationPoint(0.0F, -24.0F, 0.0F);
			body.addChild(endo);
			endo.setTextureOffset(76, 52).addBox(-4.5F, -8.0F, 1.5F, 9.0F, 3.0F, 0.0F, 0.0F, false);
			endo.setTextureOffset(113, 40).addBox(-4.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
			endo.setTextureOffset(43, 16).addBox(-1.5F, -6.0F, -2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			endo.setTextureOffset(39, 113).addBox(1.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
			endo.setTextureOffset(34, 33).addBox(4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			endo.setTextureOffset(52, 45).addBox(-4.5F, -5.0F, -2.5F, 9.0F, 0.0F, 4.0F, 0.0F, false);
			endo.setTextureOffset(24, 10).addBox(-6.0F, -8.0F, -3.5F, 12.0F, 0.0F, 6.0F, 0.0F, false);
			endo.setTextureOffset(0, 21).addBox(2.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			endo.setTextureOffset(0, 10).addBox(5.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			endo.setTextureOffset(2, 10).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			endo.setTextureOffset(0, 0).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			endo.setTextureOffset(39, 20).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
			endo.setTextureOffset(34, 23).addBox(-2.0F, -12.0F, 1.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
			endo.setTextureOffset(16, 28).addBox(-4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			endo.setTextureOffset(8, 69).addBox(2.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			endo.setTextureOffset(66, 68).addBox(5.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			endo.setTextureOffset(41, 7).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			endo.setTextureOffset(34, 40).addBox(-2.0F, -9.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			endo.setTextureOffset(43, 23).addBox(3.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			endo.setTextureOffset(63, 62).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			endo.setTextureOffset(20, 40).addBox(-5.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			endo.setTextureOffset(65, 62).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			endo.setTextureOffset(94, 85).addBox(-6.0F, -12.0F, 2.5F, 12.0F, 4.0F, 0.0F, 0.0F, false);
			endo.setTextureOffset(60, 17).addBox(6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			endo.setTextureOffset(20, 32).addBox(6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			endo.setTextureOffset(16, 31).addBox(6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			endo.setTextureOffset(18, 57).addBox(6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			endo.setTextureOffset(8, 20).addBox(-6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			endo.setTextureOffset(0, 15).addBox(-6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			endo.setTextureOffset(52, 22).addBox(-6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			endo.setTextureOffset(0, 26).addBox(-6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			endo.setTextureOffset(91, 89).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
			endo.setTextureOffset(112, 20).addBox(-5.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			endo.setTextureOffset(17, 112).addBox(3.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			endo.setTextureOffset(31, 103).addBox(-1.0F, -9.0F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			endo.setTextureOffset(52, 29).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			endo.setTextureOffset(62, 102).addBox(-1.0F, -20.0F, 1.6F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			endo.setTextureOffset(47, 112).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			endo.setTextureOffset(103, 33).addBox(-3.0F, -11.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			endo.setTextureOffset(66, 77).addBox(3.0F, -10.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			endo.setTextureOffset(56, 49).addBox(-9.0F, -10.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-7.0F, -11.0F, 0.0F);
			freddyarm3 = new ModelRenderer(this);
			freddyarm3.setRotationPoint(-1.0F, 1.0F, 0.0F);
			right_arm.addChild(freddyarm3);
			setRotationAngle(freddyarm3, 0.0F, 0.0F, 0.3927F);
			freddyarm3.setTextureOffset(42, 73).addBox(-4.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm3.setTextureOffset(48, 62).addBox(-4.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			freddyarm3.setTextureOffset(85, 31).addBox(-5.3827F, -3.1239F, -3.5F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			freddyarm3.setTextureOffset(0, 69).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm3.setTextureOffset(100, 61).addBox(-4.5F, -1.2F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm3.setTextureOffset(19, 102).addBox(-3.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm3.setTextureOffset(66, 80).addBox(-3.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			freddyarm3.setTextureOffset(65, 0).addBox(-4.5F, -1.2F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-3.0F, 10.6F, 0.5F);
			freddyarm3.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, 0.48F);
			cube_r3.setTextureOffset(70, 69).addBox(-9.2F, -8.3F, -1.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r3.setTextureOffset(16, 80).addBox(-8.4F, -6.8F, -1.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-3.0F, 10.6F, 0.5F);
			freddyarm3.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 1.5708F);
			cube_r4.setTextureOffset(41, 85).addBox(-17.1239F, -0.6173F, -2.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4.setTextureOffset(0, 64).addBox(-16.3239F, 0.8827F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4.setTextureOffset(86, 7).addBox(-17.1239F, -2.1173F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			lowerarm3 = new ModelRenderer(this);
			lowerarm3.setRotationPoint(-2.0F, 6.8F, 0.3F);
			freddyarm3.addChild(lowerarm3);
			setRotationAngle(lowerarm3, -1.1345F, 0.0F, 0.0F);
			lowerarm3.setTextureOffset(106, 11).addBox(-1.5F, 9.0F, -1.3F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm3.setTextureOffset(0, 58).addBox(-1.5F, 12.0F, -1.3F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm3.setTextureOffset(6, 16).addBox(0.5F, 12.0F, -1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			lowerarm3.setTextureOffset(41, 0).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			lowerarm3.setTextureOffset(18, 61).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm3.setTextureOffset(32, 61).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm3.setTextureOffset(26, 23).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm3.setTextureOffset(0, 10).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			lowerarm3.setTextureOffset(0, 0).addBox(1.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-1.0F, 3.8F, 0.2F);
			lowerarm3.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, 0.48F);
			cube_r5.setTextureOffset(86, 4).addBox(-0.6F, 3.7F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r5.setTextureOffset(16, 69).addBox(-4.2F, 0.7F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r5.setTextureOffset(32, 69).addBox(-3.4F, 2.2F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r5.setTextureOffset(88, 15).addBox(-3.0F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(7.0F, -11.0F, 0.0F);
			freddyarm2 = new ModelRenderer(this);
			freddyarm2.setRotationPoint(1.0F, 1.0F, 0.0F);
			left_arm.addChild(freddyarm2);
			setRotationAngle(freddyarm2, 0.0F, 0.0F, -0.3927F);
			freddyarm2.setTextureOffset(70, 107).addBox(3.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm2.setTextureOffset(22, 96).addBox(-0.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			freddyarm2.setTextureOffset(86, 0).addBox(-0.6173F, -3.1239F, -3.5F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			freddyarm2.setTextureOffset(9, 109).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm2.setTextureOffset(87, 103).addBox(-0.5F, -1.2F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(102, 49).addBox(0.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm2.setTextureOffset(105, 110).addBox(1.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			freddyarm2.setTextureOffset(0, 104).addBox(-0.5F, -1.2F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(3.0F, 10.6F, 0.5F);
			freddyarm2.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, -0.48F);
			cube_r6.setTextureOffset(90, 29).addBox(5.2F, -8.3F, -1.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(105, 72).addBox(4.4F, -6.8F, -1.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(3.0F, 10.6F, 0.5F);
			freddyarm2.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -1.5708F);
			cube_r7.setTextureOffset(10, 86).addBox(13.1239F, -0.6173F, -2.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(72, 8).addBox(13.3239F, 0.8827F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(86, 38).addBox(13.1239F, -2.1173F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			lowerarm2 = new ModelRenderer(this);
			lowerarm2.setRotationPoint(2.0F, 6.8F, 0.3F);
			freddyarm2.addChild(lowerarm2);
			setRotationAngle(lowerarm2, -1.1345F, 0.0F, 0.0F);
			lowerarm2.setTextureOffset(109, 66).addBox(-1.5F, 9.0F, -1.3F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm2.setTextureOffset(70, 11).addBox(0.5F, 12.0F, -1.3F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm2.setTextureOffset(48, 62).addBox(-1.5F, 12.0F, -1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(54, 21).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(78, 110).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(39, 105).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(30, 73).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(0, 21).addBox(1.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(54, 75).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(1.0F, 3.8F, 0.2F);
			lowerarm2.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, -0.48F);
			cube_r8.setTextureOffset(57, 102).addBox(-1.4F, 3.7F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r8.setTextureOffset(107, 59).addBox(0.2F, 0.7F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r8.setTextureOffset(111, 17).addBox(-0.6F, 2.2F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r8.setTextureOffset(68, 102).addBox(1.0F, -0.8F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-4.1F, 3.0F, 0.0F);
			right_leg.setTextureOffset(18, 84).addBox(-2.9F, 2.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(74, 80).addBox(-2.9F, 10.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 58).addBox(-2.9F, 18.0F, -6.0F, 5.0F, 3.0F, 8.0F, 0.0F, false);
			right_leg.setTextureOffset(84, 92).addBox(-2.9F, 19.0F, -8.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(88, 11).addBox(-0.9F, 19.0F, -8.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(86, 0).addBox(1.1F, 19.0F, -8.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(33, 84).addBox(-1.4F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower3 = new ModelRenderer(this);
			lower3.setRotationPoint(4.0F, 5.0F, 0.0F);
			right_leg.addChild(lower3);
			lower3.setTextureOffset(10, 81).addBox(-5.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(4.1F, 3.0F, 0.0F);
			left_leg.setTextureOffset(38, 87).addBox(-2.1F, 2.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(85, 40).addBox(-2.1F, 10.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(70, 11).addBox(-2.1F, 18.0F, -6.0F, 5.0F, 3.0F, 8.0F, 0.0F, false);
			left_leg.setTextureOffset(55, 112).addBox(1.9F, 19.0F, -8.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(92, 111).addBox(-0.1F, 19.0F, -8.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(25, 112).addBox(-2.1F, 19.0F, -8.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 112).addBox(-0.6F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2 = new ModelRenderer(this);
			lower2.setRotationPoint(-4.0F, 5.0F, 0.0F);
			left_leg.addChild(lower2);
			lower2.setTextureOffset(111, 47).addBox(3.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
