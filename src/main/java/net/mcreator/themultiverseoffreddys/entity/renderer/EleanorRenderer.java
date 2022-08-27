
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

import net.mcreator.themultiverseoffreddys.entity.EleanorEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class EleanorRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(EleanorEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelEleanor(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/eleanor.png");
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
					.getBuffer(RenderType.getEyes(new ResourceLocation("ultimate_fnaf_mod:textures/entities/eleanor_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelEleanor extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer tentacle_left;
		private final ModelRenderer left_arm_r1;
		private final ModelRenderer left_arm_r2;
		private final ModelRenderer tentacle_right;
		private final ModelRenderer left_arm_r3;
		private final ModelRenderer left_arm_r4;
		private final ModelRenderer tentacle_right2;
		private final ModelRenderer left_arm_r5;
		private final ModelRenderer left_arm_r6;
		private final ModelRenderer tentacle_left2;
		private final ModelRenderer left_arm_r7;
		private final ModelRenderer left_arm_r8;
		private final ModelRenderer agony;
		private final ModelRenderer left_arm_r9;
		private final ModelRenderer left_arm_r10;
		private final ModelRenderer left_arm_r11;
		private final ModelRenderer left_arm_r12;
		private final ModelRenderer left_arm_r13;
		private final ModelRenderer left_arm_r14;
		private final ModelRenderer left_arm_r15;
		private final ModelRenderer left_arm_r16;
		private final ModelRenderer left_arm_r17;
		private final ModelRenderer left_arm_r18;
		private final ModelRenderer left_arm_r19;
		private final ModelRenderer left_arm_r20;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_arm_r21;
		private final ModelRenderer left_arm_r22;
		private final ModelRenderer left_arm_r23;
		private final ModelRenderer bone;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm_r24;
		private final ModelRenderer left_arm_r25;
		private final ModelRenderer left_arm_r26;
		private final ModelRenderer bone2;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelEleanor() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 1.9111F, -0.2444F);
			head.setTextureOffset(0, 28).addBox(-3.5F, -11.9111F, -2.7556F, 7.0F, 8.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 28).addBox(-2.5F, -9.6111F, -3.0556F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 28).addBox(0.5F, -9.6111F, -3.0556F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(0, 31).addBox(-2.5F, -10.6111F, -3.0556F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 31).addBox(0.5F, -10.6111F, -3.0556F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(10, 42).addBox(4.2F, -9.9111F, -0.7556F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 42).addBox(2.2F, -11.9111F, -0.7556F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(8, 7).addBox(-6.2F, -9.9111F, -0.7556F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(20, 28).addBox(-5.2F, -11.9111F, -0.7556F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-2.5F, -5.9111F, -2.2556F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, -0.3927F, 0.0F);
			head_r1.setTextureOffset(43, 25).addBox(-5.1F, -2.0F, -0.4F, 4.0F, 4.0F, 1.0F, 0.0F, true);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(2.5F, -5.9111F, -2.2556F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.3927F, 0.0F);
			head_r2.setTextureOffset(43, 25).addBox(1.1F, -2.0F, -0.4F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(34, 16).addBox(-3.0F, 0.0F, -2.0F, 6.0F, 5.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 21).addBox(-2.5F, 1.0F, -2.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(32, 40).addBox(-1.0F, -5.4F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(26, 28).addBox(-3.0F, 8.0F, -2.5F, 6.0F, 7.0F, 5.0F, 0.0F, false);
			tentacle_left = new ModelRenderer(this);
			tentacle_left.setRotationPoint(14.8751F, 23.9502F, 0.0F);
			body.addChild(tentacle_left);
			tentacle_left.setTextureOffset(0, 7).addBox(-1.3751F, -11.2502F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_arm_r1 = new ModelRenderer(this);
			left_arm_r1.setRotationPoint(6.0064F, -26.4405F, 0.0F);
			tentacle_left.addChild(left_arm_r1);
			setRotationAngle(left_arm_r1, 0.0F, 0.0F, -0.4363F);
			left_arm_r1.setTextureOffset(0, 7).addBox(-5.0F, -7.9F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_arm_r2 = new ModelRenderer(this);
			left_arm_r2.setRotationPoint(-0.3751F, -10.2502F, 0.0F);
			tentacle_left.addChild(left_arm_r2);
			setRotationAngle(left_arm_r2, 0.0F, 0.0F, 0.3927F);
			left_arm_r2.setTextureOffset(0, 7).addBox(-1.3F, -12.4F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			tentacle_right = new ModelRenderer(this);
			tentacle_right.setRotationPoint(-14.8751F, 23.9502F, 0.0F);
			body.addChild(tentacle_right);
			tentacle_right.setTextureOffset(0, 7).addBox(-0.6249F, -11.2502F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			left_arm_r3 = new ModelRenderer(this);
			left_arm_r3.setRotationPoint(-6.0064F, -26.4405F, 0.0F);
			tentacle_right.addChild(left_arm_r3);
			setRotationAngle(left_arm_r3, 0.0F, 0.0F, 0.4363F);
			left_arm_r3.setTextureOffset(0, 7).addBox(3.0F, -7.9F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			left_arm_r4 = new ModelRenderer(this);
			left_arm_r4.setRotationPoint(0.3751F, -10.2502F, 0.0F);
			tentacle_right.addChild(left_arm_r4);
			setRotationAngle(left_arm_r4, 0.0F, 0.0F, -0.3927F);
			left_arm_r4.setTextureOffset(0, 7).addBox(-0.7F, -12.4F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			tentacle_right2 = new ModelRenderer(this);
			tentacle_right2.setRotationPoint(-8.8751F, 23.9502F, 11.0F);
			body.addChild(tentacle_right2);
			tentacle_right2.setTextureOffset(0, 7).addBox(-0.6249F, -11.2502F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			left_arm_r5 = new ModelRenderer(this);
			left_arm_r5.setRotationPoint(-6.0064F, -26.4405F, 0.0F);
			tentacle_right2.addChild(left_arm_r5);
			setRotationAngle(left_arm_r5, 0.0F, 0.0F, 0.4363F);
			left_arm_r5.setTextureOffset(0, 7).addBox(3.0F, -7.9F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			left_arm_r6 = new ModelRenderer(this);
			left_arm_r6.setRotationPoint(0.3751F, -10.2502F, 0.0F);
			tentacle_right2.addChild(left_arm_r6);
			setRotationAngle(left_arm_r6, 0.0F, 0.0F, -0.3927F);
			left_arm_r6.setTextureOffset(0, 7).addBox(-0.7F, -12.4F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			tentacle_left2 = new ModelRenderer(this);
			tentacle_left2.setRotationPoint(8.8751F, 23.9502F, 11.0F);
			body.addChild(tentacle_left2);
			tentacle_left2.setTextureOffset(0, 7).addBox(-1.3751F, -11.2502F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_arm_r7 = new ModelRenderer(this);
			left_arm_r7.setRotationPoint(6.0064F, -26.4405F, 0.0F);
			tentacle_left2.addChild(left_arm_r7);
			setRotationAngle(left_arm_r7, 0.0F, 0.0F, -0.4363F);
			left_arm_r7.setTextureOffset(0, 7).addBox(-5.0F, -7.9F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_arm_r8 = new ModelRenderer(this);
			left_arm_r8.setRotationPoint(-0.3751F, -10.2502F, 0.0F);
			tentacle_left2.addChild(left_arm_r8);
			setRotationAngle(left_arm_r8, 0.0F, 0.0F, 0.3927F);
			left_arm_r8.setTextureOffset(0, 7).addBox(-1.3F, -12.4F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			agony = new ModelRenderer(this);
			agony.setRotationPoint(-20.8815F, -2.4903F, 0.0F);
			body.addChild(agony);
			left_arm_r9 = new ModelRenderer(this);
			left_arm_r9.setRotationPoint(10.0896F, -10.6362F, 2.028F);
			agony.addChild(left_arm_r9);
			setRotationAngle(left_arm_r9, 1.6144F, 0.0F, -0.5672F);
			left_arm_r9.setTextureOffset(0, 7).addBox(-0.8437F, -10.928F, -0.0492F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			left_arm_r10 = new ModelRenderer(this);
			left_arm_r10.setRotationPoint(10.0896F, 22.6168F, 2.028F);
			agony.addChild(left_arm_r10);
			setRotationAngle(left_arm_r10, -1.6144F, 0.0F, 0.5672F);
			left_arm_r10.setTextureOffset(0, 7).addBox(-0.8437F, -1.072F, -0.0492F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			left_arm_r11 = new ModelRenderer(this);
			left_arm_r11.setRotationPoint(15.1815F, 14.915F, 4.5627F);
			agony.addChild(left_arm_r11);
			setRotationAngle(left_arm_r11, -0.4363F, 0.0F, 0.5672F);
			left_arm_r11.setTextureOffset(0, 7).addBox(-1.0F, -1.4343F, 1.255F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			left_arm_r12 = new ModelRenderer(this);
			left_arm_r12.setRotationPoint(17.9202F, 14.6162F, 6.672F);
			agony.addChild(left_arm_r12);
			setRotationAngle(left_arm_r12, 0.5236F, 0.0F, 0.5672F);
			left_arm_r12.setTextureOffset(0, 7).addBox(-3.1492F, -9.8821F, -1.5568F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			left_arm_r13 = new ModelRenderer(this);
			left_arm_r13.setRotationPoint(31.6735F, 22.6168F, 2.028F);
			agony.addChild(left_arm_r13);
			setRotationAngle(left_arm_r13, -1.6144F, 0.0F, -0.5672F);
			left_arm_r13.setTextureOffset(0, 7).addBox(-1.1563F, -1.072F, -0.0492F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_arm_r14 = new ModelRenderer(this);
			left_arm_r14.setRotationPoint(26.5815F, 14.915F, 4.5627F);
			agony.addChild(left_arm_r14);
			setRotationAngle(left_arm_r14, -0.4363F, 0.0F, -0.5672F);
			left_arm_r14.setTextureOffset(0, 7).addBox(-1.0F, -1.4343F, 1.255F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_arm_r15 = new ModelRenderer(this);
			left_arm_r15.setRotationPoint(23.8429F, 14.6162F, 6.672F);
			agony.addChild(left_arm_r15);
			setRotationAngle(left_arm_r15, 0.5236F, 0.0F, -0.5672F);
			left_arm_r15.setTextureOffset(0, 7).addBox(1.1492F, -9.8821F, -1.5568F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_arm_r16 = new ModelRenderer(this);
			left_arm_r16.setRotationPoint(31.6735F, -10.6362F, 2.028F);
			agony.addChild(left_arm_r16);
			setRotationAngle(left_arm_r16, 1.6144F, 0.0F, 0.5672F);
			left_arm_r16.setTextureOffset(0, 7).addBox(-1.1563F, -10.928F, -0.0492F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_arm_r17 = new ModelRenderer(this);
			left_arm_r17.setRotationPoint(26.5815F, -2.9344F, 4.5627F);
			agony.addChild(left_arm_r17);
			setRotationAngle(left_arm_r17, 0.4363F, 0.0F, 0.5672F);
			left_arm_r17.setTextureOffset(0, 7).addBox(-1.0F, -10.5657F, 1.255F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_arm_r18 = new ModelRenderer(this);
			left_arm_r18.setRotationPoint(23.8429F, -2.6356F, 6.672F);
			agony.addChild(left_arm_r18);
			setRotationAngle(left_arm_r18, -0.5236F, 0.0F, 0.5672F);
			left_arm_r18.setTextureOffset(0, 7).addBox(1.1492F, -2.1179F, -1.5568F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			left_arm_r19 = new ModelRenderer(this);
			left_arm_r19.setRotationPoint(15.1815F, -2.9344F, 4.5627F);
			agony.addChild(left_arm_r19);
			setRotationAngle(left_arm_r19, 0.4363F, 0.0F, -0.5672F);
			left_arm_r19.setTextureOffset(0, 7).addBox(-1.0F, -10.5657F, 1.255F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			left_arm_r20 = new ModelRenderer(this);
			left_arm_r20.setRotationPoint(17.9202F, -2.6356F, 6.672F);
			agony.addChild(left_arm_r20);
			setRotationAngle(left_arm_r20, -0.5236F, 0.0F, -0.5672F);
			left_arm_r20.setTextureOffset(0, 7).addBox(-3.1492F, -2.1179F, -1.5568F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.0F, 2.0F, 0.0F);
			left_arm.setTextureOffset(8, 14).addBox(3.0692F, 9.8639F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			left_arm_r21 = new ModelRenderer(this);
			left_arm_r21.setRotationPoint(3.4263F, 9.0132F, -0.7F);
			left_arm.addChild(left_arm_r21);
			setRotationAngle(left_arm_r21, -0.3491F, 0.0F, -0.3142F);
			left_arm_r21.setTextureOffset(8, 14).addBox(-0.076F, 0.1622F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			left_arm_r22 = new ModelRenderer(this);
			left_arm_r22.setRotationPoint(4.5692F, 9.8639F, 0.5F);
			left_arm.addChild(left_arm_r22);
			setRotationAngle(left_arm_r22, 0.0F, 0.0F, -0.3142F);
			left_arm_r22.setTextureOffset(8, 14).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			left_arm_r23 = new ModelRenderer(this);
			left_arm_r23.setRotationPoint(-0.5F, 0.0F, 0.0F);
			left_arm.addChild(left_arm_r23);
			setRotationAngle(left_arm_r23, 0.0F, 0.0F, -0.3491F);
			left_arm_r23.setTextureOffset(24, 40).addBox(0.0F, -1.3F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 0.0F, 0.0F);
			left_arm.addChild(bone);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.0F, 2.0F, 0.0F);
			right_arm.setTextureOffset(8, 14).addBox(-4.0692F, 9.8639F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, true);
			left_arm_r24 = new ModelRenderer(this);
			left_arm_r24.setRotationPoint(-3.4263F, 9.0132F, -0.7F);
			right_arm.addChild(left_arm_r24);
			setRotationAngle(left_arm_r24, -0.3491F, 0.0F, 0.3142F);
			left_arm_r24.setTextureOffset(8, 14).addBox(-0.924F, 0.1622F, 0.0F, 1.0F, 6.0F, 1.0F, 0.0F, true);
			left_arm_r25 = new ModelRenderer(this);
			left_arm_r25.setRotationPoint(-4.5692F, 9.8639F, 0.5F);
			right_arm.addChild(left_arm_r25);
			setRotationAngle(left_arm_r25, 0.0F, 0.0F, 0.3142F);
			left_arm_r25.setTextureOffset(8, 14).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, true);
			left_arm_r26 = new ModelRenderer(this);
			left_arm_r26.setRotationPoint(0.5F, 0.0F, 0.0F);
			right_arm.addChild(left_arm_r26);
			setRotationAngle(left_arm_r26, 0.0F, 0.0F, 0.3491F);
			left_arm_r26.setTextureOffset(24, 40).addBox(-2.0F, -1.3F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
			right_arm.addChild(bone2);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(1.8F, 14.875F, -0.5F);
			left_leg.setTextureOffset(0, 24).addBox(-1.0F, 7.125F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(34, 25).addBox(-1.0F, 8.125F, -2.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(-0.5F, 8.125F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(40, 40).addBox(-1.0F, -2.875F, -0.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-1.8F, 14.875F, -0.5F);
			right_leg.setTextureOffset(0, 24).addBox(-1.0F, 7.125F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(34, 25).addBox(-1.0F, 8.125F, -2.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 0).addBox(-0.5F, 8.125F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_leg.setTextureOffset(40, 40).addBox(-1.0F, -2.875F, -0.5F, 2.0F, 10.0F, 2.0F, 0.0F, true);
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
			this.tentacle_right2.rotateAngleY = f2 / 20.f;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.tentacle_left2.rotateAngleY = f2 / 20.f;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.tentacle_right.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.tentacle_left.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
