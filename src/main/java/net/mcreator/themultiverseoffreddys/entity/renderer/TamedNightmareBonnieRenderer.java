
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

import net.mcreator.themultiverseoffreddys.entity.TamedNightmareBonnieEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedNightmareBonnieRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedNightmareBonnieEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelNightmareBonnie(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/nightmarebonnie.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelNightmareBonnie extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer earright;
		private final ModelRenderer lowerright;
		private final ModelRenderer tipright;
		private final ModelRenderer head_r1;
		private final ModelRenderer earleft;
		private final ModelRenderer lowerleft;
		private final ModelRenderer tipleft;
		private final ModelRenderer head_r2;
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
		private final ModelRenderer right_leg;
		private final ModelRenderer lower;
		private final ModelRenderer left_leg;
		private final ModelRenderer lower2;

		public ModelNightmareBonnie() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -19.0F, 4.0F);
			head.setTextureOffset(24, 66).addBox(-5.0F, -4.0F, -10.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(74, 5).addBox(-3.0F, -7.0F, -2.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 27).addBox(-5.0F, -3.0F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(54, 26).addBox(-5.0F, -3.0F, -15.0F, 10.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(60, 64).addBox(-1.0F, -3.5F, -13.9F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(61, 103).addBox(-5.0F, -3.0F, -11.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 99).addBox(3.0F, -7.0F, -11.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(70, 16).addBox(1.0F, -3.0F, -11.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(41, 34).addBox(-3.0F, -3.0F, -11.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(70, 20).addBox(1.0F, -7.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 69).addBox(-2.0F, -7.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 48).addBox(-1.0F, -7.0F, -11.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(52, 69).addBox(-6.0F, -3.0F, -10.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(42, 59).addBox(4.0F, -7.0F, -10.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(64, 5).addBox(5.0F, -3.0F, -10.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 27).addBox(-4.0F, -7.0F, -10.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(-5.0F, -8.0F, -11.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(5, 89).addBox(-3.0F, -5.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(34, 34).addBox(4.0F, -2.3F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-5.0F, -2.3F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(88, 0).addBox(1.0F, -5.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(38, 0).addBox(-4.0F, -1.0F, -10.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 57).addBox(-5.0F, 0.0F, -14.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(56, 49).addBox(4.0F, 0.0F, -14.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(0, 46).addBox(-4.0F, 0.0F, -15.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(68, 53).addBox(4.0F, 0.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(68, 51).addBox(-5.0F, 0.0F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			earright = new ModelRenderer(this);
			earright.setRotationPoint(0.0F, 22.0F, -4.0F);
			head.addChild(earright);
			earright.setTextureOffset(51, 80).addBox(-5.0F, -37.0F, -3.0F, 4.0F, 7.0F, 2.0F, 0.0F, false);
			earright.setTextureOffset(103, 41).addBox(-4.5F, -39.0F, -2.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			lowerright = new ModelRenderer(this);
			lowerright.setRotationPoint(-3.0F, -38.5F, -1.0F);
			earright.addChild(lowerright);
			setRotationAngle(lowerright, 0.7854F, 0.0F, 0.0F);
			lowerright.setTextureOffset(82, 88).addBox(-2.0F, -5.5F, -1.8142F, 4.0F, 5.0F, 2.0F, 0.0F, false);
			lowerright.setTextureOffset(6, 103).addBox(-1.5F, -7.5F, -1.4142F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			tipright = new ModelRenderer(this);
			tipright.setRotationPoint(0.0F, 0.0F, 0.0F);
			earright.addChild(tipright);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-3.0F, -42.1235F, -6.6468F);
			tipright.addChild(head_r1);
			setRotationAngle(head_r1, 1.4835F, 0.0F, 0.0F);
			head_r1.setTextureOffset(94, 22).addBox(-2.0F, -3.0142F, -0.2F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			earleft = new ModelRenderer(this);
			earleft.setRotationPoint(0.0F, 22.0F, -4.0F);
			head.addChild(earleft);
			earleft.setTextureOffset(76, 59).addBox(1.0F, -37.0F, -3.0F, 4.0F, 7.0F, 2.0F, 0.0F, false);
			earleft.setTextureOffset(54, 89).addBox(1.5F, -39.0F, -2.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			lowerleft = new ModelRenderer(this);
			lowerleft.setRotationPoint(3.0F, -38.5F, -1.0F);
			earleft.addChild(lowerleft);
			setRotationAngle(lowerleft, 0.7854F, 0.0F, 0.0F);
			lowerleft.setTextureOffset(62, 69).addBox(-2.0F, -5.5F, -1.8142F, 4.0F, 5.0F, 2.0F, 0.0F, false);
			lowerleft.setTextureOffset(15, 75).addBox(-1.5F, -7.5F, -1.4142F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			tipleft = new ModelRenderer(this);
			tipleft.setRotationPoint(0.0F, 0.0F, 0.0F);
			earleft.addChild(tipleft);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(3.0F, -42.1235F, -6.6468F);
			tipleft.addChild(head_r2);
			setRotationAngle(head_r2, 1.4835F, 0.0F, 0.0F);
			head_r2.setTextureOffset(92, 84).addBox(-2.0F, -3.0142F, -0.2F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			mouth = new ModelRenderer(this);
			mouth.setRotationPoint(0.0F, 1.0F, -5.0F);
			head.addChild(mouth);
			setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
			mouth.setTextureOffset(0, 0).addBox(-6.0F, 0.7071F, -10.0247F, 12.0F, 2.0F, 14.0F, 0.0F, false);
			mouth.setTextureOffset(0, 48).addBox(-4.0F, -0.5517F, -5.9907F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(68, 57).addBox(-5.0F, -0.2929F, -10.0247F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(44, 49).addBox(-6.0F, -0.2929F, -10.0247F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(24, 31).addBox(5.0F, -0.2929F, -10.0247F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(34, 35).addBox(5.0F, -0.2929F, -9.0247F, 1.0F, 1.0F, 13.0F, 0.0F, false);
			mouth.setTextureOffset(19, 34).addBox(-6.0F, -0.2929F, -9.0247F, 1.0F, 1.0F, 13.0F, 0.0F, false);
			NightmareBody = new ModelRenderer(this);
			NightmareBody.setRotationPoint(0.0F, 24.0F, 0.0F);
			NightmareBody.setTextureOffset(22, 57).addBox(-7.0F, -32.0F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(0, 24).addBox(3.0F, -32.0F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(0, 65).addBox(-7.0F, -33.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(52, 64).addBox(3.0F, -33.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(0, 40).addBox(-7.0F, -33.0F, 3.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(18, 99).addBox(-7.0F, -31.0F, -4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(39, 93).addBox(3.0F, -31.0F, -4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(34, 34).addBox(-7.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			NightmareBody.setTextureOffset(0, 0).addBox(6.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			NightmareBody.setTextureOffset(49, 34).addBox(-7.0F, -32.0F, 2.0F, 14.0F, 7.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(62, 0).addBox(-6.0F, -24.0F, -3.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(68, 51).addBox(-3.0F, -20.0F, -3.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
			NightmareBody.setTextureOffset(100, 35).addBox(5.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			NightmareBody.setTextureOffset(100, 0).addBox(-6.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			NightmareBody.setTextureOffset(12, 61).addBox(-6.0F, -24.0F, 1.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(79, 33).addBox(-8.0F, -36.0F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(12, 57).addBox(4.0F, -36.0F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(27, 66).addBox(7.0F, -36.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(62, 47).addBox(-8.0F, -36.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(104, 84).addBox(-3.0F, -37.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(80, 104).addBox(1.0F, -37.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(76, 78).addBox(-1.0F, -36.5F, -6.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(53, 16).addBox(4.0F, -37.0F, -5.0F, 4.0F, 1.0F, 9.0F, 0.0F, false);
			NightmareBody.setTextureOffset(40, 49).addBox(-8.0F, -37.0F, -5.0F, 4.0F, 1.0F, 9.0F, 0.0F, false);
			NightmareBody.setTextureOffset(38, 9).addBox(-8.0F, -36.0F, 3.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -24.0F, 0.0F);
			NightmareBody.addChild(body);
			body.setTextureOffset(49, 42).addBox(-4.5F, -6.0F, -2.5F, 9.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(71, 43).addBox(-4.5F, -8.0F, 0.5F, 9.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 71).addBox(1.5F, -8.0F, -2.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 71).addBox(-4.5F, -8.0F, -2.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(7, 0).addBox(-4.5F, -8.0F, -1.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(7, 0).addBox(3.5F, -8.0F, -1.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(24, 27).addBox(-6.0F, -9.0F, -3.5F, 12.0F, 1.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(90, 16).addBox(2.0F, -12.0F, -3.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(90, 16).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(21, 67).addBox(2.0F, -11.0F, -3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(54, 26).addBox(5.0F, -12.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(48, 74).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(49, 42).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(21, 67).addBox(-3.0F, -11.0F, -3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(94, 46).addBox(5.0F, -12.0F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(21, 66).addBox(-6.0F, -12.0F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(68, 47).addBox(-6.0F, -12.0F, 1.5F, 12.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 68).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(101, 79).addBox(-5.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(101, 74).addBox(3.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(74, 88).addBox(-1.0F, -9.0F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(53, 103).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(29, 78).addBox(-1.0F, -20.0F, 1.6F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(100, 6).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(52, 60).addBox(-3.0F, -11.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(40, 25).addBox(3.0F, -10.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 12).addBox(-9.0F, -10.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareRightArm = new ModelRenderer(this);
			NightmareRightArm.setRotationPoint(-7.0F, -10.0F, 0.0F);
			freddyarm = new ModelRenderer(this);
			freddyarm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			NightmareRightArm.addChild(freddyarm);
			setRotationAngle(freddyarm, 0.0F, 0.0F, 0.3927F);
			freddyarm.setTextureOffset(91, 92).addBox(-4.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm.setTextureOffset(0, 75).addBox(-4.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			freddyarm.setTextureOffset(92, 0).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm.setTextureOffset(62, 88).addBox(-4.5F, -1.2F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(88, 59).addBox(-4.5F, -1.2F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			NightmareRightArm.addChild(right_arm);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.3927F);
			right_arm.setTextureOffset(79, 78).addBox(-3.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(101, 44).addBox(-3.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm = new ModelRenderer(this);
			lowerarm.setRotationPoint(-2.0F, 6.8F, 0.3F);
			right_arm.addChild(lowerarm);
			setRotationAngle(lowerarm, -1.1345F, 0.0F, 0.0F);
			lowerarm.setTextureOffset(91, 40).addBox(-1.5F, 9.0F, -1.3F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm.setTextureOffset(36, 100).addBox(-1.5F, 12.0F, -1.3F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm.setTextureOffset(59, 13).addBox(0.5F, 12.0F, -1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(0, 48).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(28, 101).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(91, 76).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(90, 51).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(67, 96).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(82, 95).addBox(1.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			NightmareLeftArm = new ModelRenderer(this);
			NightmareLeftArm.setRotationPoint(7.0F, -10.0F, 0.0F);
			freddyarm2 = new ModelRenderer(this);
			freddyarm2.setRotationPoint(1.0F, 0.0F, 0.0F);
			NightmareLeftArm.addChild(freddyarm2);
			setRotationAngle(freddyarm2, 0.0F, 0.0F, -0.3927F);
			freddyarm2.setTextureOffset(49, 89).addBox(3.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm2.setTextureOffset(74, 37).addBox(-0.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			freddyarm2.setTextureOffset(0, 89).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm2.setTextureOffset(82, 25).addBox(-0.5F, -1.2F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(0, 81).addBox(-0.5F, -1.2F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(1.0F, 0.0F, 0.0F);
			NightmareLeftArm.addChild(left_arm);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.3927F);
			left_arm.setTextureOffset(39, 75).addBox(0.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(100, 56).addBox(1.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2 = new ModelRenderer(this);
			lowerarm2.setRotationPoint(2.0F, 6.8F, 0.3F);
			left_arm.addChild(lowerarm2);
			setRotationAngle(lowerarm2, -1.1345F, 0.0F, 0.0F);
			lowerarm2.setTextureOffset(38, 61).addBox(-1.5F, 9.0F, -1.3F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm2.setTextureOffset(34, 67).addBox(0.5F, 12.0F, -1.3F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm2.setTextureOffset(52, 13).addBox(-1.5F, 12.0F, -1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(38, 0).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(100, 51).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(0, 57).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(0, 16).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(57, 49).addBox(1.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(40, 49).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-4.1F, 3.0F, 0.0F);
			right_leg.setTextureOffset(31, 91).addBox(1.1F, 2.0F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(11, 88).addBox(-2.9F, 2.0F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(23, 88).addBox(-2.9F, 1.0F, -2.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(37, 85).addBox(-2.9F, 2.0F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(67, 78).addBox(-1.9F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(102, 17).addBox(-1.4F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower = new ModelRenderer(this);
			lower.setRotationPoint(4.0F, 5.0F, 0.0F);
			right_leg.addChild(lower);
			lower.setTextureOffset(30, 16).addBox(-5.4F, 6.0F, -1.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(86, 102).addBox(-5.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(70, 69).addBox(-5.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			lower.setTextureOffset(83, 21).addBox(-5.9F, 15.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(99, 97).addBox(-3.4F, 6.0F, -1.5F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(99, 89).addBox(-6.4F, 6.0F, -1.5F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(97, 10).addBox(-6.4F, 6.0F, 0.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(57, 96).addBox(-6.4F, 6.0F, -2.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(60, 60).addBox(-6.4F, 13.0F, -5.5F, 4.0F, 1.0F, 8.0F, 0.0F, false);
			lower.setTextureOffset(22, 49).addBox(-6.4F, 14.0F, -7.5F, 4.0F, 2.0F, 10.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(4.1F, 3.0F, 0.0F);
			left_leg.setTextureOffset(91, 30).addBox(-2.1F, 2.0F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(83, 68).addBox(-2.1F, 2.0F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(54, 13).addBox(1.9F, 1.0F, -2.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(83, 13).addBox(-2.1F, 2.0F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(17, 78).addBox(-1.1F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(73, 100).addBox(-0.6F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2 = new ModelRenderer(this);
			lower2.setRotationPoint(-4.0F, 5.0F, 0.0F);
			left_leg.addChild(lower2);
			lower2.setTextureOffset(0, 27).addBox(3.4F, 6.0F, -1.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(100, 61).addBox(3.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(70, 16).addBox(2.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			lower2.setTextureOffset(62, 5).addBox(2.9F, 15.0F, -7.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(47, 99).addBox(2.4F, 6.0F, -1.5F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(99, 27).addBox(5.4F, 6.0F, -1.5F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(8, 96).addBox(2.4F, 6.0F, 0.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(95, 67).addBox(2.4F, 6.0F, -2.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
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
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.NightmareLeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.NightmareRightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
