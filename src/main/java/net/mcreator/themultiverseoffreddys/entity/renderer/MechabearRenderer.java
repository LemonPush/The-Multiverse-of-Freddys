
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

import net.mcreator.themultiverseoffreddys.entity.MechabearEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MechabearRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MechabearEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMechabear(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/mechabear.png");
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
					.getBuffer(RenderType.getEyes(new ResourceLocation("ultimate_fnaf_mod:textures/entities/mechabear_glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMechabear extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer jaw;
		private final ModelRenderer ear_left;
		private final ModelRenderer head_r2;
		private final ModelRenderer ear_right;
		private final ModelRenderer head_r3;
		private final ModelRenderer skull;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelMechabear() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.253F, 0.1333F);
			head.setTextureOffset(24, 47).addBox(2.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 43).addBox(2.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(36, 4).addBox(-3.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 32).addBox(-3.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 14).addBox(-4.05F, -8.447F, -4.1333F, 4.0F, 6.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(0.05F, -8.447F, -4.1333F, 4.0F, 6.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(34, 0).addBox(3.55F, -4.447F, -4.1333F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(30, 30).addBox(-4.55F, -4.447F, -4.1333F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(44, 0).addBox(-2.5F, -9.447F, -2.6333F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 51).addBox(-2.0F, -12.447F, -2.1333F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(28, 77).addBox(-2.05F, -4.447F, -6.1333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(76, 23).addBox(-2.75F, -4.447F, -6.1333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(34, 10).addBox(0.75F, -4.447F, -6.1333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(53, 29).addBox(0.05F, -4.447F, -6.1333F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(20, 30).addBox(1.5F, -2.797F, -5.6833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 35).addBox(0.25F, -2.797F, -6.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 33).addBox(-2.5F, -2.797F, -5.6833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(22, 40).addBox(-1.25F, -2.797F, -6.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(40, 30).addBox(-0.5F, -4.697F, -6.6333F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 17).addBox(0.55F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(40, 36).addBox(0.45F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(22, 18).addBox(-2.55F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 36).addBox(-2.45F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-4.05F, -1.947F, -0.1333F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.829F, 0.0F, 0.0F);
			head_r1.setTextureOffset(14, 28).addBox(-0.45F, -2.125F, -3.45F, 1.0F, 1.0F, 4.0F, 0.0F, true);
			head_r1.setTextureOffset(14, 28).addBox(7.55F, -2.125F, -3.45F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			jaw = new ModelRenderer(this);
			jaw.setRotationPoint(0.0F, -1.1807F, -0.0361F);
			head.addChild(jaw);
			setRotationAngle(jaw, 0.1309F, 0.0F, 0.0F);
			jaw.setTextureOffset(58, 78).addBox(-2.05F, -0.1843F, -5.9962F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(76, 52).addBox(-2.75F, -0.1843F, -5.9962F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(32, 27).addBox(0.75F, -0.1843F, -5.9962F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(65, 17).addBox(0.05F, -0.1843F, -5.9962F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(40, 28).addBox(0.05F, -2.1843F, -0.9962F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			jaw.setTextureOffset(43, 36).addBox(-4.05F, -2.1843F, -0.9962F, 4.0F, 3.0F, 5.0F, 0.0F, false);
			jaw.setTextureOffset(20, 28).addBox(1.5F, -0.7843F, -5.5462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(22, 38).addBox(0.25F, -0.7843F, -5.9462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(32, 2).addBox(-4.05F, -0.1843F, -3.9962F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(32, 0).addBox(0.05F, -0.1843F, -3.9962F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(38, 19).addBox(3.55F, -0.1843F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			jaw.setTextureOffset(56, 31).addBox(3.55F, -2.1843F, -0.9962F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			jaw.setTextureOffset(12, 38).addBox(-4.55F, -0.1843F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			jaw.setTextureOffset(22, 38).addBox(-4.55F, -2.1843F, -0.9962F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			jaw.setTextureOffset(40, 28).addBox(-1.25F, -0.7843F, -5.9462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(24, 20).addBox(-2.5F, -0.7843F, -5.5462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			ear_left = new ModelRenderer(this);
			ear_left.setRotationPoint(2.05F, -8.1759F, -0.0848F);
			head.addChild(ear_left);
			setRotationAngle(ear_left, 0.0F, 0.0F, 0.2094F);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(2.1008F, -1.1901F, -0.0485F);
			ear_left.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.4538F);
			head_r2.setTextureOffset(16, 0).addBox(-0.5F, 0.25F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(48, 22).addBox(-1.5F, -2.75F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			ear_right = new ModelRenderer(this);
			ear_right.setRotationPoint(-2.05F, -8.1759F, -0.0848F);
			head.addChild(ear_right);
			setRotationAngle(ear_right, 0.0F, 0.0F, -0.2094F);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-2.1008F, -1.1901F, -0.0485F);
			ear_right.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, -0.4538F);
			head_r3.setTextureOffset(16, 0).addBox(-0.5F, 0.25F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			head_r3.setTextureOffset(48, 22).addBox(-1.5F, -2.75F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, true);
			skull = new ModelRenderer(this);
			skull.setRotationPoint(0.0F, 22.053F, -0.1333F);
			head.addChild(skull);
			skull.setTextureOffset(40, 10).addBox(-2.5F, -25.0F, -3.0F, 5.0F, 2.0F, 5.0F, 0.25F, false);
			skull.setTextureOffset(18, 8).addBox(-2.5F, -29.5F, -3.0F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			skull.setTextureOffset(29, 40).addBox(-2.5F, -28.55F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			skull.setTextureOffset(32, 30).addBox(0.5F, -28.55F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(16, 0).addBox(-3.0F, 0.5F, -2.0F, 6.0F, 4.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(16, 0).addBox(-2.0F, -0.4F, -2.0F, 6.0F, 4.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 32).addBox(0.05F, -0.5F, -3.0F, 4.0F, 5.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(18, 27).addBox(-4.05F, -0.5F, -3.0F, 4.0F, 5.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(12, 47).addBox(-4.05F, 4.5F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(42, 44).addBox(1.05F, 4.5F, -3.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(24, 18).addBox(-3.5F, 4.5F, -2.0F, 7.0F, 5.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(41, 13).addBox(-0.5F, 2.25F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(40, 10).addBox(-0.5F, 0.25F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(9, 62).addBox(-2.5F, -0.25F, -3.25F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(52, 6).addBox(0.5F, -0.25F, -3.25F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(59, 0).addBox(-3.5F, 8.5F, 1.0F, 7.0F, 3.0F, 1.0F, 0.25F, false);
			body.setTextureOffset(54, 44).addBox(-3.5F, 8.5F, 0.3F, 7.0F, 3.0F, 1.0F, 0.25F, false);
			body.setTextureOffset(0, 28).addBox(-3.5F, 8.5F, -1.3F, 7.0F, 3.0F, 1.0F, 0.25F, false);
			body.setTextureOffset(0, 58).addBox(-3.5F, 8.5F, -2.0F, 7.0F, 3.0F, 1.0F, 0.25F, false);
			body.setTextureOffset(42, 44).addBox(-3.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(44, 6).addBox(1.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(48, 17).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.9F, 0.85F, 0.0F);
			left_arm.setTextureOffset(52, 58).addBox(1.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(34, 72).addBox(0.6F, -0.6F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(71, 52).addBox(2.6F, -0.6F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(22, 71).addBox(2.4F, -0.6F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(53, 70).addBox(0.8F, -0.6F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(45, 67).addBox(0.8F, 4.15F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(68, 65).addBox(0.6F, 4.15F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(0, 69).addBox(2.6F, 4.15F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(70, 40).addBox(2.4F, 4.15F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(62, 48).addBox(0.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(63, 29).addBox(0.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(64, 22).addBox(0.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(78, 40).addBox(1.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(38, 51).addBox(0.1F, -1.35F, -2.5F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			left_arm.setTextureOffset(53, 23).addBox(1.1F, -0.35F, -2.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.9F, 0.85F, 0.0F);
			right_arm.setTextureOffset(32, 55).addBox(-3.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(29, 67).addBox(-1.6F, -0.6F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			right_arm.setTextureOffset(17, 67).addBox(-3.6F, -0.6F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			right_arm.setTextureOffset(67, 4).addBox(-3.4F, -0.6F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			right_arm.setTextureOffset(9, 66).addBox(-1.8F, -0.6F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			right_arm.setTextureOffset(60, 65).addBox(-1.8F, 4.15F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			right_arm.setTextureOffset(37, 65).addBox(-1.6F, 4.15F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			right_arm.setTextureOffset(65, 36).addBox(-3.6F, 4.15F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			right_arm.setTextureOffset(0, 14).addBox(-3.4F, 4.15F, -1.5F, 1.0F, 4.0F, 3.0F, 0.25F, false);
			right_arm.setTextureOffset(0, 62).addBox(-3.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(60, 58).addBox(-3.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(64, 11).addBox(-3.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, false);
			right_arm.setTextureOffset(16, 18).addBox(-3.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			right_arm.setTextureOffset(25, 49).addBox(-4.1F, -1.35F, -2.5F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			right_arm.setTextureOffset(51, 52).addBox(-4.1F, -0.35F, -2.5F, 3.0F, 1.0F, 5.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(24, 55).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(40, 57).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(73, 34).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(75, 27).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(42, 74).addBox(-1.5F, 0.9583F, -1.1333F, 3.0F, 5.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(75, 6).addBox(-1.5F, 0.9583F, 0.6667F, 3.0F, 5.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(75, 0).addBox(-1.5F, 0.9583F, 0.4667F, 3.0F, 5.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(50, 77).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(77, 70).addBox(-1.5F, 6.7083F, -1.1333F, 3.0F, 4.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(77, 75).addBox(-1.5F, 6.7083F, 0.6667F, 3.0F, 4.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(15, 78).addBox(-1.5F, 6.7083F, 0.4667F, 3.0F, 4.0F, 1.0F, 0.25F, false);
			left_leg.setTextureOffset(78, 44).addBox(-1.5F, 5.2083F, -2.0833F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 43).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(16, 54).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(55, 6).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(73, 17).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_leg.setTextureOffset(8, 73).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(69, 72).addBox(-1.5F, 0.9583F, -1.1333F, 3.0F, 5.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(61, 72).addBox(-1.5F, 0.9583F, 0.6667F, 3.0F, 5.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(72, 59).addBox(-1.5F, 0.9583F, 0.4667F, 3.0F, 5.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(76, 65).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(76, 12).addBox(-1.5F, 6.7083F, -1.1333F, 3.0F, 4.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(0, 76).addBox(-1.5F, 6.7083F, 0.6667F, 3.0F, 4.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(74, 47).addBox(-1.5F, 6.7083F, 0.4667F, 3.0F, 4.0F, 1.0F, 0.25F, false);
			right_leg.setTextureOffset(12, 43).addBox(-1.5F, 5.2083F, -2.0833F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(30, 40).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, false);
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
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
