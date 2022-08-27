
package net.mcreator.themultiverseoffreddys.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.themultiverseoffreddys.entity.BitBabyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BitBabyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BitBabyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbitbaby(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/bitbaby.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelbitbaby extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public Modelbitbaby() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.1429F, 0.5F);
			head.setTextureOffset(0, 10).addBox(-6.0F, -8.3571F, -1.5F, 12.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 21).addBox(-5.5F, -2.3571F, -1.5F, 11.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 5).addBox(2.0F, -12.3571F, -1.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 40).addBox(-2.0F, -10.3571F, -1.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(26, 10).addBox(-4.0F, -13.3571F, -1.5F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(28, 16).addBox(-7.0F, -12.3571F, -1.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(-10.0F, -13.3571F, -1.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 3).addBox(-9.0F, -14.3571F, -1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 40).addBox(-11.0F, -11.3571F, -1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(40, 19).addBox(-12.0F, -9.3571F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 35).addBox(5.0F, -13.3571F, -1.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 38).addBox(6.0F, -14.3571F, -1.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 43).addBox(9.0F, -11.3571F, -1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(43, 12).addBox(11.0F, -9.3571F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 10).addBox(-6.0F, -8.3571F, -0.5F, 12.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 21).addBox(-5.5F, -2.3571F, -0.5F, 11.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 5).addBox(2.0F, -12.3571F, -0.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 40).addBox(-2.0F, -10.3571F, -0.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(26, 10).addBox(-4.0F, -13.3571F, -0.5F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(28, 16).addBox(-7.0F, -12.3571F, -0.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(-10.0F, -13.3571F, -0.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 3).addBox(-9.0F, -14.3571F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 40).addBox(-11.0F, -11.3571F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(40, 19).addBox(-12.0F, -9.3571F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 35).addBox(5.0F, -13.3571F, -0.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 38).addBox(6.0F, -14.3571F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 43).addBox(9.0F, -11.3571F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(43, 12).addBox(11.0F, -9.3571F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 10).addBox(-6.0F, -8.3571F, 0.5F, 12.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 21).addBox(-5.5F, -2.3571F, 0.5F, 11.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 5).addBox(2.0F, -12.3571F, 0.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 40).addBox(-2.0F, -10.3571F, 0.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(26, 10).addBox(-4.0F, -13.3571F, 0.5F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(28, 16).addBox(-7.0F, -12.3571F, 0.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(-10.0F, -13.3571F, 0.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 3).addBox(-9.0F, -14.3571F, 0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 40).addBox(-11.0F, -11.3571F, 0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(40, 19).addBox(-12.0F, -9.3571F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 35).addBox(5.0F, -13.3571F, 0.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 38).addBox(6.0F, -14.3571F, 0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 43).addBox(9.0F, -11.3571F, 0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(43, 12).addBox(11.0F, -9.3571F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 28).addBox(-2.0F, -11.3571F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 28).addBox(-2.0F, -11.3571F, 0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 28).addBox(-2.0F, -11.3571F, -1.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(0, 17).addBox(-6.5F, -13.0F, -1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(26, 13).addBox(-4.0F, -15.5F, -1.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(21, 43).addBox(-4.5F, -15.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(21, 43).addBox(3.5F, -15.5F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 21).addBox(-5.0F, -13.5F, -1.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 35).addBox(-10.5F, -27.5F, -1.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-7.5F, -25.5F, -1.0F, 15.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(23, 23).addBox(-5.5F, -26.5F, -1.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 5).addBox(-7.0F, -21.5F, -1.0F, 14.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 25).addBox(-5.5F, -17.5F, -1.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(34, 35).addBox(6.5F, -27.5F, -1.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 17).addBox(-6.5F, -13.0F, 0.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(26, 13).addBox(-4.0F, -15.5F, 0.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(21, 43).addBox(-4.5F, -15.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(21, 43).addBox(3.5F, -15.5F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 21).addBox(-5.0F, -13.5F, 0.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 35).addBox(-10.5F, -27.5F, 0.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-7.5F, -25.5F, 0.0F, 15.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(23, 23).addBox(-5.5F, -26.5F, 0.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 5).addBox(-7.0F, -21.5F, 0.0F, 14.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 25).addBox(-5.5F, -17.5F, 0.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(34, 35).addBox(6.5F, -27.5F, 0.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 17).addBox(-6.5F, -13.0F, 1.0F, 13.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(26, 13).addBox(-4.0F, -15.5F, 1.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(21, 43).addBox(-4.5F, -15.5F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(21, 43).addBox(3.5F, -15.5F, 1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 21).addBox(-5.0F, -13.5F, 1.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 35).addBox(-10.5F, -27.5F, 1.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-7.5F, -25.5F, 1.0F, 15.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(23, 23).addBox(-5.5F, -26.5F, 1.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 5).addBox(-7.0F, -21.5F, 1.0F, 14.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 25).addBox(-5.5F, -17.5F, 1.0F, 11.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(34, 35).addBox(6.5F, -27.5F, 1.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(8.4F, 0.0F, 0.5F);
			left_arm.setTextureOffset(14, 30).addBox(-1.9F, 7.5F, -1.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(8, 38).addBox(-1.4F, 2.5F, -1.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(26, 40).addBox(4.1F, 8.0F, -1.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(33, 43).addBox(3.1F, 9.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(15, 43).addBox(-0.9F, 0.5F, -1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(14, 30).addBox(-1.9F, 7.5F, -0.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(8, 38).addBox(-1.4F, 2.5F, -0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(26, 40).addBox(4.1F, 8.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(33, 43).addBox(3.1F, 9.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(15, 43).addBox(-0.9F, 0.5F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(14, 30).addBox(-1.9F, 7.5F, 0.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(8, 38).addBox(-1.4F, 2.5F, 0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(26, 40).addBox(4.1F, 8.0F, 0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(33, 43).addBox(3.1F, 9.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(15, 43).addBox(-0.9F, 0.5F, 0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-8.5F, 0.0F, 0.5F);
			right_arm.setTextureOffset(42, 3).addBox(-0.5F, 7.5F, -1.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(34, 40).addBox(-3.5F, 7.5F, -1.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(40, 16).addBox(-5.5F, 9.5F, -1.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 37).addBox(-1.5F, 2.5F, -1.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(43, 8).addBox(-1.0F, 0.5F, -1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(42, 3).addBox(-0.5F, 7.5F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(34, 40).addBox(-3.5F, 7.5F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(40, 16).addBox(-5.5F, 9.5F, -0.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 37).addBox(-1.5F, 2.5F, -0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(43, 8).addBox(-1.0F, 0.5F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(42, 3).addBox(-0.5F, 7.5F, 0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(34, 40).addBox(-3.5F, 7.5F, 0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(40, 16).addBox(-5.5F, 9.5F, 0.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 37).addBox(-1.5F, 2.5F, 0.5F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			right_arm.setTextureOffset(43, 8).addBox(-1.0F, 0.5F, 0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1667F, 13.3333F, 0.5F);
			left_leg.setTextureOffset(0, 28).addBox(-2.6667F, 7.6667F, -1.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(38, 30).addBox(-2.1667F, 4.6667F, -1.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 32).addBox(-2.6667F, 0.6667F, -1.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 28).addBox(-2.6667F, 7.6667F, -0.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(38, 30).addBox(-2.1667F, 4.6667F, -0.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 32).addBox(-2.6667F, 0.6667F, -0.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 28).addBox(-2.6667F, 7.6667F, 0.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(38, 30).addBox(-2.1667F, 4.6667F, 0.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 32).addBox(-2.6667F, 0.6667F, 0.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1667F, 13.3333F, 0.5F);
			right_leg.setTextureOffset(24, 26).addBox(-3.3333F, 7.6667F, -1.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(38, 26).addBox(-1.8333F, 4.6667F, -1.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(26, 30).addBox(-2.3333F, 0.6667F, -1.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(24, 26).addBox(-3.3333F, 7.6667F, -0.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(38, 26).addBox(-1.8333F, 4.6667F, -0.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(26, 30).addBox(-2.3333F, 0.6667F, -0.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(24, 26).addBox(-3.3333F, 7.6667F, 0.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(38, 26).addBox(-1.8333F, 4.6667F, 0.5F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(26, 30).addBox(-2.3333F, 0.6667F, 0.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
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
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
