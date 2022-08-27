
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

import net.mcreator.themultiverseoffreddys.entity.NightmareChicaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NightmareChicaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NightmareChicaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelNightmareChica(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/nightmarechica.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelNightmareChica extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer feathers;
		private final ModelRenderer feathers2;
		private final ModelRenderer feathers3;
		private final ModelRenderer feathers4;
		private final ModelRenderer mouth;
		private final ModelRenderer NightmareBody;
		private final ModelRenderer body;
		private final ModelRenderer NightmareRightArm;
		private final ModelRenderer freddyarm;
		private final ModelRenderer right_arm;
		private final ModelRenderer lowerarm;
		private final ModelRenderer NightmareLeftArm;
		private final ModelRenderer freddyarm2;
		private final ModelRenderer left_arm;
		private final ModelRenderer lowerarm2;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer pumpkin;
		private final ModelRenderer cupcake;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_leg;
		private final ModelRenderer lower;
		private final ModelRenderer left_leg;
		private final ModelRenderer lower2;

		public ModelNightmareChica() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -18.0F, 3.0F);
			head.setTextureOffset(72, 66).addBox(-5.0F, -6.0F, -9.0F, 1.0F, 5.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(41, 74).addBox(-5.0F, -7.0F, -1.0F, 10.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(54, 6).addBox(-4.0F, -8.0F, -1.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(73, 79).addBox(-4.0F, -2.0F, -13.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(37, 53).addBox(-3.0F, -3.0F, -13.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(86, 30).addBox(-3.0F, -2.0F, -15.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(58, 33).addBox(-2.0F, -3.0F, -14.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 22).addBox(-2.0F, -4.0F, -13.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(10, 105).addBox(-5.0F, -7.0F, -10.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(28, 63).addBox(3.0F, -8.0F, -10.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(83, 109).addBox(1.0F, -4.0F, -10.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 109).addBox(-3.0F, -4.0F, -10.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(35, 95).addBox(1.0F, -8.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(108, 30).addBox(-4.0F, -8.0F, -10.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(48, 27).addBox(-1.0F, -8.0F, -10.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(55, 74).addBox(-6.0F, -4.0F, -9.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(63, 45).addBox(4.0F, -8.0F, -9.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(31, 74).addBox(5.0F, -4.0F, -9.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 22).addBox(-4.0F, -8.0F, -9.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(24, 36).addBox(-3.0F, -9.0F, -9.0F, 7.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(109, 83).addBox(-3.0F, -6.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(65, 74).addBox(4.0F, -3.3F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(58, 27).addBox(-5.0F, -3.3F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(100, 29).addBox(1.0F, -6.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 0).addBox(-4.0F, -2.0F, -9.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(37, 60).addBox(-3.0F, -1.0F, -14.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(106, 102).addBox(-3.0F, -1.0F, -13.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(106, 12).addBox(2.0F, -1.0F, -13.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			feathers = new ModelRenderer(this);
			feathers.setRotationPoint(0.0F, -8.0F, -4.5F);
			head.addChild(feathers);
			setRotationAngle(feathers, 0.4363F, 0.0F, 0.0F);
			feathers.setTextureOffset(108, 72).addBox(-1.0F, -5.4226F, -1.4063F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			feathers2 = new ModelRenderer(this);
			feathers2.setRotationPoint(0.0F, -8.0F, -3.5F);
			head.addChild(feathers2);
			setRotationAngle(feathers2, -0.4363F, 0.0F, 0.0F);
			feathers2.setTextureOffset(108, 67).addBox(-1.0F, -4.5774F, -1.4063F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			feathers3 = new ModelRenderer(this);
			feathers3.setRotationPoint(-1.0F, -8.0F, -4.0F);
			head.addChild(feathers3);
			setRotationAngle(feathers3, 0.0F, -1.5708F, -0.4363F);
			feathers3.setTextureOffset(78, 17).addBox(-2.0F, -5.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			feathers4 = new ModelRenderer(this);
			feathers4.setRotationPoint(1.0F, -8.0F, -4.0F);
			head.addChild(feathers4);
			setRotationAngle(feathers4, 0.0F, -1.5708F, 0.4363F);
			feathers4.setTextureOffset(32, 74).addBox(-2.0F, -5.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			mouth = new ModelRenderer(this);
			mouth.setRotationPoint(0.0F, 0.0F, -4.0F);
			head.addChild(mouth);
			setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
			mouth.setTextureOffset(0, 0).addBox(-5.0F, 0.7071F, -6.0247F, 10.0F, 2.0F, 10.0F, 0.0F, false);
			mouth.setTextureOffset(11, 49).addBox(-4.0F, 0.7071F, -9.0247F, 8.0F, 1.0F, 3.0F, 0.0F, false);
			mouth.setTextureOffset(11, 53).addBox(-3.0F, 1.7071F, -9.0247F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			mouth.setTextureOffset(0, 8).addBox(-2.0F, 1.7071F, -10.0247F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(37, 57).addBox(-3.0F, 0.7071F, -11.0247F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			mouth.setTextureOffset(24, 27).addBox(-4.0F, 0.7071F, -5.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(0, 35).addBox(-4.0F, -0.2929F, -5.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(108, 26).addBox(-3.0F, -0.2929F, -9.0247F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			mouth.setTextureOffset(33, 107).addBox(2.0F, -0.2929F, -9.0247F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			mouth.setTextureOffset(80, 43).addBox(-3.0F, -0.2929F, -10.0247F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareBody = new ModelRenderer(this);
			NightmareBody.setRotationPoint(0.0F, 24.0F, 0.0F);
			NightmareBody.setTextureOffset(83, 59).addBox(-7.0F, -32.0F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(10, 69).addBox(3.0F, -32.0F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(40, 9).addBox(-7.0F, -33.0F, -5.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(65, 80).addBox(3.0F, -33.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(54, 0).addBox(-7.0F, -33.0F, 3.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(53, 9).addBox(-7.0F, -31.0F, -4.0F, 14.0F, 6.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(17, 82).addBox(-7.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			NightmareBody.setTextureOffset(44, 81).addBox(6.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			NightmareBody.setTextureOffset(34, 45).addBox(-7.0F, -32.0F, 2.0F, 14.0F, 7.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(71, 38).addBox(-6.0F, -24.0F, -3.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(0, 78).addBox(-3.0F, -20.0F, -3.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
			NightmareBody.setTextureOffset(102, 50).addBox(5.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			NightmareBody.setTextureOffset(82, 68).addBox(-6.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			NightmareBody.setTextureOffset(71, 33).addBox(-6.0F, -24.0F, 1.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(104, 17).addBox(-8.0F, -36.0F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(104, 8).addBox(4.0F, -36.0F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(48, 101).addBox(7.0F, -36.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(12, 87).addBox(-8.0F, -36.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(46, 53).addBox(4.0F, -37.0F, -5.0F, 4.0F, 1.0F, 9.0F, 0.0F, false);
			NightmareBody.setTextureOffset(20, 53).addBox(-8.0F, -37.0F, -5.0F, 4.0F, 1.0F, 9.0F, 0.0F, false);
			NightmareBody.setTextureOffset(0, 45).addBox(-8.0F, -36.0F, 3.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -24.0F, 0.0F);
			NightmareBody.addChild(body);
			body.setTextureOffset(41, 108).addBox(5.0F, -12.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(102, 29).addBox(5.0F, -12.0F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(24, 108).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(100, 12).addBox(-6.0F, -12.0F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 73).addBox(-6.0F, -12.0F, 1.5F, 12.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(33, 21).addBox(-6.0F, -9.0F, -3.5F, 12.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(58, 27).addBox(-4.5F, -6.0F, -3.5F, 9.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 66).addBox(-4.5F, -8.0F, 0.5F, 9.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(80, 62).addBox(-4.5F, -8.0F, -1.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(80, 62).addBox(3.5F, -8.0F, -1.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(103, 41).addBox(1.5F, -8.0F, -3.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(103, 41).addBox(-4.5F, -8.0F, -3.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 78).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(65, 75).addBox(-3.0F, -12.0F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 78).addBox(2.0F, -12.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(65, 75).addBox(2.0F, -12.0F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(73, 45).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(106, 0).addBox(-5.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(105, 56).addBox(3.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(92, 91).addBox(-1.0F, -9.0F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(108, 106).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(10, 92).addBox(-1.0F, -20.0F, 1.6F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(54, 108).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(53, 16).addBox(-3.0F, -11.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(97, 65).addBox(3.0F, -10.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(97, 63).addBox(-9.0F, -10.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareRightArm = new ModelRenderer(this);
			NightmareRightArm.setRotationPoint(-7.0F, -10.0F, 0.0F);
			freddyarm = new ModelRenderer(this);
			freddyarm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			NightmareRightArm.addChild(freddyarm);
			setRotationAngle(freddyarm, 0.0F, 0.0F, 0.3927F);
			freddyarm.setTextureOffset(76, 100).addBox(-4.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm.setTextureOffset(82, 62).addBox(-4.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			freddyarm.setTextureOffset(62, 100).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm.setTextureOffset(67, 93).addBox(-4.5F, -1.2F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(41, 93).addBox(-4.5F, -1.2F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			NightmareRightArm.addChild(right_arm);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.3927F);
			right_arm.setTextureOffset(29, 85).addBox(-3.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(105, 45).addBox(-3.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm = new ModelRenderer(this);
			lowerarm.setRotationPoint(-2.0F, 6.8F, 0.3F);
			right_arm.addChild(lowerarm);
			setRotationAngle(lowerarm, -1.1345F, 0.0F, 0.0F);
			lowerarm.setTextureOffset(96, 23).addBox(-1.5F, 9.0F, -1.3F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm.setTextureOffset(104, 84).addBox(-1.5F, 12.0F, -1.3F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm.setTextureOffset(5, 49).addBox(0.5F, 12.0F, -1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(0, 35).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(105, 34).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(52, 100).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(94, 82).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(90, 103).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(102, 67).addBox(1.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			NightmareLeftArm = new ModelRenderer(this);
			NightmareLeftArm.setRotationPoint(7.0F, -10.0F, 0.0F);
			setRotationAngle(NightmareLeftArm, -0.4401F, 0.0106F, 0.2474F);
			freddyarm2 = new ModelRenderer(this);
			freddyarm2.setRotationPoint(1.0F, 0.0F, 0.0F);
			NightmareLeftArm.addChild(freddyarm2);
			setRotationAngle(freddyarm2, 0.0F, 0.0F, -0.3927F);
			freddyarm2.setTextureOffset(97, 33).addBox(3.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm2.setTextureOffset(81, 24).addBox(-0.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			freddyarm2.setTextureOffset(30, 95).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm2.setTextureOffset(90, 68).addBox(-0.5F, -1.2F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(55, 92).addBox(-0.5F, -1.2F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(1.0F, 0.0F, 0.0F);
			NightmareLeftArm.addChild(left_arm);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.3927F);
			left_arm.setTextureOffset(70, 83).addBox(0.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(104, 97).addBox(1.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2 = new ModelRenderer(this);
			lowerarm2.setRotationPoint(2.2F, 6.8F, 0.3F);
			left_arm.addChild(lowerarm2);
			setRotationAngle(lowerarm2, -1.5505F, -0.4359F, 1.5227F);
			lowerarm2.setTextureOffset(92, 76).addBox(-1.5F, 9.0F, -1.3F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm2.setTextureOffset(30, 0).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(20, 57).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(0, 94).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(0, 0).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(70, 101).addBox(1.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(84, 100).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-1.0F, 11.0F, -0.8F);
			lowerarm2.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -0.6981F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(5, 12).addBox(-0.5F, 1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(1.0F, 11.0F, -0.3F);
			lowerarm2.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, 0.6109F);
			right_arm_r2.setTextureOffset(24, 36).addBox(-0.5F, 1.0F, -1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			pumpkin = new ModelRenderer(this);
			pumpkin.setRotationPoint(-3.2F, -9.8F, -1.3F);
			lowerarm2.addChild(pumpkin);
			setRotationAngle(pumpkin, 0.0873F, 0.0F, 0.0F);
			pumpkin.setTextureOffset(58, 63).addBox(-8.3F, 16.0F, 4.5F, 10.0F, 10.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(72, 52).addBox(0.7F, 25.0F, -4.5F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			pumpkin.setTextureOffset(96, 99).addBox(-3.3F, 25.0F, 0.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			pumpkin.setTextureOffset(98, 3).addBox(-3.3F, 25.0F, -4.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			pumpkin.setTextureOffset(17, 78).addBox(-6.3F, 25.0F, 3.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(63, 60).addBox(-6.3F, 25.0F, -4.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(9, 84).addBox(-6.3F, 25.0F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			pumpkin.setTextureOffset(100, 97).addBox(-0.3F, 25.0F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(88, 100).addBox(-0.3F, 25.0F, 1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(81, 100).addBox(-5.3F, 25.0F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(90, 76).addBox(-0.3F, 25.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(17, 84).addBox(-2.3F, 25.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(51, 81).addBox(-5.3F, 25.0F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(81, 30).addBox(-0.3F, 25.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(81, 26).addBox(-1.3F, 25.0F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(73, 7).addBox(-1.3F, 25.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(51, 60).addBox(-1.3F, 25.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(51, 57).addBox(-1.3F, 25.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(30, 49).addBox(-0.3F, 25.0F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(58, 35).addBox(-8.3F, 25.0F, -4.5F, 2.0F, 1.0F, 9.0F, 0.0F, false);
			pumpkin.setTextureOffset(0, 12).addBox(-8.3F, 16.0F, -4.5F, 10.0F, 1.0F, 9.0F, 0.0F, false);
			pumpkin.setTextureOffset(0, 49).addBox(-8.3F, 17.0F, -4.5F, 1.0F, 8.0F, 9.0F, 0.0F, false);
			pumpkin.setTextureOffset(47, 27).addBox(0.7F, 17.0F, -4.5F, 1.0F, 8.0F, 9.0F, 0.0F, false);
			pumpkin.setTextureOffset(36, 63).addBox(-8.3F, 16.0F, -5.5F, 10.0F, 10.0F, 1.0F, 0.0F, false);
			pumpkin.setTextureOffset(0, 69).addBox(-12.3F, 20.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			cupcake = new ModelRenderer(this);
			cupcake.setRotationPoint(-5.7F, 11.5167F, 0.3333F);
			lowerarm2.addChild(cupcake);
			setRotationAngle(cupcake, 0.0F, 1.5708F, -1.5708F);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(0.0F, 11.0167F, 9.3667F);
			cupcake.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5708F, 0.0F, 0.0F);
			right_arm_r3.setTextureOffset(24, 26).addBox(-0.5F, 8.1667F, -16.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm_r3.setTextureOffset(107, 50).addBox(-2.15F, 10.2667F, -12.8F, 2.0F, 1.0F, 2.0F, -0.25F, true);
			right_arm_r3.setTextureOffset(56, 85).addBox(-2.0F, 6.6667F, -13.0F, 4.0F, 4.0F, 3.0F, 0.25F, false);
			right_arm_r3.setTextureOffset(107, 50).addBox(0.15F, 10.2667F, -12.8F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_arm_r3.setTextureOffset(92, 17).addBox(-2.0F, 6.6667F, -10.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			right_arm_r3.setTextureOffset(83, 52).addBox(-3.0F, 5.6667F, -8.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-4.1F, 3.0F, 0.0F);
			right_leg.setTextureOffset(0, 49).addBox(1.1F, 2.0F, -2.0F, 1.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(18, 94).addBox(-2.9F, 2.0F, -3.0F, 5.0F, 6.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(97, 53).addBox(-2.9F, 1.0F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(79, 93).addBox(-2.9F, 2.0F, 1.0F, 5.0F, 6.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 84).addBox(-1.9F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(46, 106).addBox(-1.4F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower = new ModelRenderer(this);
			lower.setRotationPoint(4.0F, 5.0F, 0.0F);
			right_leg.addChild(lower);
			lower.setTextureOffset(29, 12).addBox(-5.4F, 6.0F, -1.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(16, 108).addBox(-5.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(77, 0).addBox(-5.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			lower.setTextureOffset(102, 104).addBox(-3.4F, 6.0F, -1.5F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(96, 104).addBox(-6.4F, 6.0F, -1.5F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(0, 102).addBox(-6.4F, 6.0F, 0.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(38, 101).addBox(-6.4F, 6.0F, -2.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(78, 17).addBox(-6.4F, 13.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			lower.setTextureOffset(12, 63).addBox(-6.4F, 14.0F, -5.5F, 4.0F, 2.0F, 8.0F, 0.0F, false);
			lower.setTextureOffset(24, 82).addBox(-4.9F, 15.0F, -7.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			lower.setTextureOffset(94, 43).addBox(-6.4F, 15.0F, -7.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(38, 85).addBox(-3.4F, 15.0F, -7.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(4.1F, 3.0F, 0.0F);
			left_leg.setTextureOffset(0, 12).addBox(-2.1F, 2.0F, -2.0F, 1.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(92, 9).addBox(-2.1F, 2.0F, -3.0F, 5.0F, 6.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(97, 43).addBox(1.9F, 1.0F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(90, 0).addBox(-2.1F, 2.0F, 1.0F, 5.0F, 6.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(82, 83).addBox(-1.1F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(28, 105).addBox(-0.6F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2 = new ModelRenderer(this);
			lower2.setRotationPoint(-4.0F, 5.0F, 0.0F);
			left_leg.addChild(lower2);
			lower2.setTextureOffset(78, 10).addBox(2.4F, 13.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			lower2.setTextureOffset(19, 73).addBox(2.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			lower2.setTextureOffset(51, 83).addBox(5.4F, 15.0F, -7.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(62, 20).addBox(3.9F, 15.0F, -7.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			lower2.setTextureOffset(79, 83).addBox(2.4F, 15.0F, -7.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(62, 16).addBox(2.4F, 14.0F, -5.5F, 4.0F, 2.0F, 8.0F, 0.0F, false);
			lower2.setTextureOffset(0, 22).addBox(3.4F, 6.0F, -1.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(105, 21).addBox(3.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(104, 76).addBox(2.4F, 6.0F, -1.5F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(64, 45).addBox(5.4F, 6.0F, -1.5F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(18, 101).addBox(2.4F, 6.0F, 0.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(100, 90).addBox(2.4F, 6.0F, -2.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			NightmareBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			NightmareRightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			NightmareLeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
			this.NightmareRightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}

}
