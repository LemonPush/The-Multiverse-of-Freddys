
package net.mcreator.themultiverseoffreddys.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.themultiverseoffreddys.entity.NoAiGrimFoxyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NoAiGrimFoxyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NoAiGrimFoxyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelGrimFoxy(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/grimfoxy.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn
					.getBuffer(RenderType.getEyes(new ResourceLocation("ultimate_fnaf_mod:textures/entities/grimfoxy_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.0.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelGrimFoxy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer RightEar;
		private final ModelRenderer LeftEar;
		private final ModelRenderer mouth;
		private final ModelRenderer bone;
		private final ModelRenderer NightmareBody;
		private final ModelRenderer body;
		private final ModelRenderer NightmareRightArm;
		private final ModelRenderer freddyarm;
		private final ModelRenderer right_arm;
		private final ModelRenderer lowerarm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_leg;
		private final ModelRenderer lower;
		private final ModelRenderer left_leg;
		private final ModelRenderer lower2;
		private final ModelRenderer NightmareLeftArm;
		private final ModelRenderer freddyarm2;
		private final ModelRenderer left_arm;
		private final ModelRenderer lowerarm2;

		public ModelGrimFoxy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -19.0F, 4.0F);
			head.setTextureOffset(0, 46).addBox(-5.0F, -7.0F, -10.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(57, 0).addBox(-5.0F, -7.0F, -2.0F, 10.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(13, 62).addBox(-3.0F, -2.0F, -14.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(22, 44).addBox(-2.0F, -3.0F, -19.0F, 4.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(54, 9).addBox(-3.0F, -2.0F, -20.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(24, 36).addBox(-1.0F, -3.5F, -20.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(30, 95).addBox(-5.0F, -7.0F, -11.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 52).addBox(4.0F, -7.0F, -11.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 61).addBox(1.0F, -3.0F, -11.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(54, 9).addBox(-3.0F, -3.0F, -11.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(48, 51).addBox(1.0F, -7.0F, -11.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 18).addBox(-4.0F, -7.0F, -11.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(8, 95).addBox(-1.0F, -7.0F, -11.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(37, 71).addBox(-9.0F, -3.0F, -5.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(25, 88).addBox(-8.0F, -3.0F, -6.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(77, 51).addBox(-7.0F, -3.0F, -7.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(73, 2).addBox(-6.0F, -3.0F, -8.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(29, 71).addBox(5.0F, -3.0F, -8.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(62, 37).addBox(7.0F, -3.0F, -6.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(76, 37).addBox(6.0F, -3.0F, -7.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 70).addBox(8.0F, -3.0F, -5.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(38, 45).addBox(4.0F, -7.0F, -10.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(30, 60).addBox(5.0F, -3.0F, -10.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 22).addBox(-4.0F, -8.0F, -10.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(95, 37).addBox(-4.0F, -6.0F, -12.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 63).addBox(4.0F, -2.3F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(25, 46).addBox(-5.0F, -2.3F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(54, 114).addBox(-3.0F, -1.0F, -20.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(78, 119).addBox(-3.0F, -1.0F, -19.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(81, 109).addBox(2.0F, -1.0F, -19.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			RightEar = new ModelRenderer(this);
			RightEar.setRotationPoint(-4.5F, -8.5F, -5.0F);
			head.addChild(RightEar);
			setRotationAngle(RightEar, 0.0F, 0.0F, -0.7854F);
			RightEar.setTextureOffset(62, 37).addBox(-1.2F, -0.5F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			RightEar.setTextureOffset(13, 66).addBox(-1.7F, -1.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightEar.setTextureOffset(31, 58).addBox(-1.7F, -8.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			RightEar.setTextureOffset(90, 24).addBox(-2.8F, -7.5F, -1.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			LeftEar = new ModelRenderer(this);
			LeftEar.setRotationPoint(4.5F, -8.5F, -5.0F);
			head.addChild(LeftEar);
			setRotationAngle(LeftEar, 0.0F, 0.0F, 0.7854F);
			LeftEar.setTextureOffset(49, 60).addBox(0.2F, -0.5F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			LeftEar.setTextureOffset(54, 13).addBox(-0.3F, -1.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftEar.setTextureOffset(10, 52).addBox(-0.3F, -8.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			LeftEar.setTextureOffset(89, 41).addBox(-1.2F, -7.5F, -1.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);
			mouth = new ModelRenderer(this);
			mouth.setRotationPoint(0.0F, 1.0F, -5.0F);
			head.addChild(mouth);
			setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
			mouth.setTextureOffset(0, 10).addBox(-5.0F, 0.7071F, -6.0247F, 10.0F, 2.0F, 10.0F, 0.0F, false);
			mouth.setTextureOffset(41, 0).addBox(-2.0F, 1.7071F, -14.0247F, 4.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(48, 19).addBox(-3.0F, 0.7071F, -15.0247F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			mouth.setTextureOffset(24, 23).addBox(-4.0F, 0.7071F, -5.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(0, 119).addBox(-4.0F, -0.2929F, -6.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(37, 119).addBox(-3.0F, -0.2929F, -14.0247F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(32, 108).addBox(2.0F, -0.2929F, -14.0247F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(59, 126).addBox(-3.0F, -0.2929F, -15.0247F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 20.0F, 1.0F);
			mouth.addChild(bone);
			bone.setTextureOffset(48, 44).addBox(-3.0F, -19.2929F, -13.0247F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			NightmareBody = new ModelRenderer(this);
			NightmareBody.setRotationPoint(0.0F, -7.0F, 0.0F);
			NightmareBody.setTextureOffset(68, 16).addBox(-6.0F, -2.0F, -4.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(10, 46).addBox(3.0F, -2.0F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(44, 66).addBox(4.0F, -1.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(40, 66).addBox(5.0F, 2.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(48, 23).addBox(4.0F, 1.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(30, 65).addBox(-4.0F, 0.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(28, 62).addBox(0.0F, 2.0F, -4.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(0, 65).addBox(-2.0F, 1.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(93, 0).addBox(-7.0F, -5.0F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(92, 48).addBox(3.0F, -5.0F, -5.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(0, 40).addBox(-7.0F, -2.0F, 3.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(62, 63).addBox(-7.0F, -2.0F, -4.0F, 1.0F, 8.0F, 6.0F, 0.0F, false);
			NightmareBody.setTextureOffset(48, 60).addBox(6.0F, -2.0F, -4.0F, 1.0F, 8.0F, 6.0F, 0.0F, false);
			NightmareBody.setTextureOffset(32, 36).addBox(-7.0F, -1.0F, 2.0F, 14.0F, 7.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(56, 51).addBox(-6.0F, 7.0F, -3.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(61, 31).addBox(-3.0F, 11.0F, -3.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
			NightmareBody.setTextureOffset(95, 31).addBox(5.0F, 7.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			NightmareBody.setTextureOffset(22, 95).addBox(-6.0F, 7.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			NightmareBody.setTextureOffset(48, 26).addBox(-6.0F, 7.0F, 1.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
			NightmareBody.setTextureOffset(31, 53).addBox(7.0F, -5.0F, -5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			NightmareBody.setTextureOffset(48, 44).addBox(-8.0F, -5.0F, -5.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			NightmareBody.setTextureOffset(0, 0).addBox(-8.0F, -6.0F, -5.0F, 16.0F, 1.0F, 9.0F, 0.0F, false);
			NightmareBody.setTextureOffset(24, 32).addBox(-8.0F, -5.0F, 3.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 7.0F, 0.0F);
			NightmareBody.addChild(body);
			body.setTextureOffset(56, 56).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(39, 97).addBox(-5.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(97, 9).addBox(3.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(85, 84).addBox(-1.0F, -9.0F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(56, 63).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(67, 78).addBox(-1.0F, -20.0F, 1.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(95, 52).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(66, 46).addBox(-3.0F, -11.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(72, 11).addBox(3.0F, -10.5F, -1.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(54, 16).addBox(-9.0F, -10.5F, -1.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			NightmareRightArm = new ModelRenderer(this);
			NightmareRightArm.setRotationPoint(-7.0F, -10.0F, 0.0F);
			freddyarm = new ModelRenderer(this);
			freddyarm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			NightmareRightArm.addChild(freddyarm);
			setRotationAngle(freddyarm, 0.0F, 0.0F, 0.3927F);
			freddyarm.setTextureOffset(87, 74).addBox(-4.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm.setTextureOffset(70, 63).addBox(-4.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			freddyarm.setTextureOffset(59, 87).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm.setTextureOffset(39, 84).addBox(-4.5F, -1.2F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(83, 33).addBox(-4.5F, -1.2F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			NightmareRightArm.addChild(right_arm);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.3927F);
			right_arm.setTextureOffset(55, 77).addBox(-3.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 97).addBox(-3.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm = new ModelRenderer(this);
			lowerarm.setRotationPoint(-2.0F, 6.8F, 0.3F);
			right_arm.addChild(lowerarm);
			setRotationAngle(lowerarm, -1.1345F, 0.0F, 0.0F);
			lowerarm.setTextureOffset(15, 66).addBox(-2.5F, 9.0F, -2.3F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			lowerarm.setTextureOffset(14, 96).addBox(-1.0F, 12.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(30, 10).addBox(-5.6F, 18.3F, -0.8F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(0, 46).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(73, 96).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(88, 16).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(87, 8).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(91, 94).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(93, 85).addBox(1.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(0.0F, 14.5F, 0.2F);
			lowerarm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 0.0F, 0.829F);
			right_arm_r1.setTextureOffset(0, 0).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-1.045F, 27.5157F, 0.2F);
			lowerarm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, 0.0F, -1.5708F);
			right_arm_r2.setTextureOffset(0, 22).addBox(-0.8234F, -0.1743F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(-3.1F, 25.8F, 0.2F);
			lowerarm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, 0.0F, 0.0F, -0.829F);
			right_arm_r3.setTextureOffset(24, 22).addBox(-0.6F, -2.9F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-4.1F, 3.0F, 0.0F);
			right_leg.setTextureOffset(51, 87).addBox(1.1F, 2.0F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(81, 0).addBox(-2.9F, 2.0F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(84, 45).addBox(-2.9F, 1.0F, -2.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(27, 80).addBox(-2.9F, 2.0F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(15, 76).addBox(-1.9F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(47, 97).addBox(-1.4F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower = new ModelRenderer(this);
			lower.setRotationPoint(4.0F, 5.0F, 0.0F);
			right_leg.addChild(lower);
			lower.setTextureOffset(41, 0).addBox(-5.4F, 6.0F, -1.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(55, 97).addBox(-5.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(0, 61).addBox(-5.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			lower.setTextureOffset(79, 92).addBox(-4.9F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			lower.setTextureOffset(92, 72).addBox(-6.4F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			lower.setTextureOffset(41, 92).addBox(-3.4F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(4.1F, 3.0F, 0.0F);
			left_leg.setTextureOffset(0, 87).addBox(-2.1F, 2.0F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 79).addBox(-2.1F, 2.0F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(9, 84).addBox(1.9F, 1.0F, -2.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(75, 78).addBox(-2.1F, 2.0F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(76, 13).addBox(-1.1F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(96, 4).addBox(-0.6F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2 = new ModelRenderer(this);
			lower2.setRotationPoint(-4.0F, 5.0F, 0.0F);
			left_leg.addChild(lower2);
			lower2.setTextureOffset(18, 53).addBox(2.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			lower2.setTextureOffset(89, 52).addBox(5.4F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			lower2.setTextureOffset(90, 67).addBox(3.9F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			lower2.setTextureOffset(91, 80).addBox(2.4F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			lower2.setTextureOffset(0, 31).addBox(3.4F, 6.0F, -1.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(95, 62).addBox(3.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			NightmareLeftArm = new ModelRenderer(this);
			NightmareLeftArm.setRotationPoint(7.0F, -10.0F, 0.0F);
			freddyarm2 = new ModelRenderer(this);
			freddyarm2.setRotationPoint(1.0F, 0.0F, 0.0F);
			NightmareLeftArm.addChild(freddyarm2);
			setRotationAngle(freddyarm2, 0.0F, 0.0F, -0.3927F);
			freddyarm2.setTextureOffset(75, 86).addBox(3.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm2.setTextureOffset(10, 46).addBox(-0.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			freddyarm2.setTextureOffset(17, 86).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm2.setTextureOffset(78, 69).addBox(-0.5F, -1.2F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(78, 25).addBox(-0.5F, -1.2F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(1.0F, 0.0F, 0.0F);
			NightmareLeftArm.addChild(left_arm);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.3927F);
			left_arm.setTextureOffset(43, 74).addBox(0.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(95, 57).addBox(1.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2 = new ModelRenderer(this);
			lowerarm2.setRotationPoint(2.0F, 6.8F, 0.3F);
			left_arm.addChild(lowerarm2);
			setRotationAngle(lowerarm2, -1.1345F, 0.0F, 0.0F);
			lowerarm2.setTextureOffset(40, 60).addBox(-1.5F, 9.0F, -1.3F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm2.setTextureOffset(10, 71).addBox(0.5F, 12.0F, -1.3F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm2.setTextureOffset(68, 37).addBox(-1.5F, 12.0F, -1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(38, 44).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(58, 31).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(85, 59).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(0, 10).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(67, 91).addBox(1.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(35, 90).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			NightmareBody.render(matrixStack, buffer, packedLight, packedOverlay);
			NightmareRightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			NightmareLeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
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
