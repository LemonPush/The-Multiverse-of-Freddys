
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

import net.mcreator.themultiverseoffreddys.entity.TamedGreatEscapeGoldenFreddyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedGreatEscapeGoldenFreddyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedGreatEscapeGoldenFreddyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelGreat_Escape_Golden_Freddy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/great_escape_golden_freddy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelGreat_Escape_Golden_Freddy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer body_r3;
		private final ModelRenderer body_r4;
		private final ModelRenderer body_r5;
		private final ModelRenderer body_r6;
		private final ModelRenderer body_r7;
		private final ModelRenderer body_r8;
		private final ModelRenderer body_r9;
		private final ModelRenderer body_r10;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_arm_r5;

		public ModelGreat_Escape_Golden_Freddy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(28, 27).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(71, 50).addBox(-2.0F, -18.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 54).addBox(-3.0F, -15.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(28, 23).addBox(-4.0F, -6.0F, -6.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 35).addBox(-4.0F, -7.0F, -6.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(61, 0).addBox(-4.0F, -9.5F, -6.8F, 8.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(48, 44).addBox(-3.0F, -10.0F, -6.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(58, 31).addBox(-1.0F, -11.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(40, 53).addBox(-2.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(52, 26).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 49).addBox(0.7F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 49).addBox(-2.7F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 61).addBox(-5.0F, -9.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(37, 56).addBox(4.0F, -9.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(-5.2343F, -3.5F, -4.856F);
			head.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 1.5708F, 0.0F);
			body_r1.setTextureOffset(28, 27).addBox(-1.5F, -3.5F, 0.7F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(5.2343F, -3.5F, -4.856F);
			head.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, -1.5708F, 0.0F);
			body_r2.setTextureOffset(28, 27).addBox(-0.5F, -3.5F, 0.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(51, 34).addBox(-1.5F, -3.5F, 0.731F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-4.5F, -13.5F, 0.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.6109F);
			head_r1.setTextureOffset(0, 4).addBox(-3.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(36, 0).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(4.5F, -13.5F, 0.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, -0.6109F);
			head_r2.setTextureOffset(0, 21).addBox(0.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(36, 2).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(36, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 38).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-7.0F, -7.0F, -3.5F, 14.0F, 13.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 21).addBox(-5.0F, -2.0F, -11.5F, 10.0F, 6.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(47, 53).addBox(-5.0F, 4.0F, -8.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(47, 53).addBox(-8.0F, 4.0F, -4.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(47, 53).addBox(7.0F, 4.0F, -4.5F, 1.0F, 8.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(47, 53).addBox(7.9F, -5.0F, -5.5F, 1.0F, 8.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(47, 53).addBox(6.9F, -5.0F, 3.6F, 1.0F, 8.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(47, 53).addBox(-7.9F, -5.0F, 3.6F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(47, 53).addBox(-8.9F, -5.0F, -5.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(47, 53).addBox(4.0F, 4.0F, -8.5F, 1.0F, 8.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(69, 5).addBox(-4.0F, -3.0F, -3.5F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(70, 23).addBox(-3.5F, -4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(54, 18).addBox(-3.5F, 4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(44, 10).addBox(-3.0F, -5.0F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 61).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 54).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(18, 54).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(52, 30).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(-7.4F, 2.0F, -6.0F);
			body.addChild(body_r3);
			setRotationAngle(body_r3, 0.0F, -0.8901F, 0.0F);
			body_r3.setTextureOffset(66, 71).addBox(-0.5F, 0.0F, -4.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			body_r3.setTextureOffset(0, 72).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 4.0F, 0.0F, true);
			body_r3.setTextureOffset(44, 8).addBox(0.5F, 0.0F, 4.5F, 6.0F, 1.0F, 1.0F, 0.0F, true);
			body_r3.setTextureOffset(0, 72).addBox(-0.5F, -7.0F, 1.5F, 1.0F, 1.0F, 4.0F, 0.0F, true);
			body_r3.setTextureOffset(44, 8).addBox(0.5F, -7.0F, 4.5F, 6.0F, 1.0F, 1.0F, 0.0F, true);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(-5.2343F, 2.5F, 5.944F);
			body.addChild(body_r4);
			setRotationAngle(body_r4, 0.0F, 1.5708F, 0.0F);
			body_r4.setTextureOffset(28, 21).addBox(1.3F, -0.5F, -2.7F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			body_r4.setTextureOffset(47, 61).addBox(0.5F, -0.5F, -2.7F, 1.0F, 1.0F, 8.0F, 0.0F, true);
			body_r4.setTextureOffset(28, 21).addBox(1.3F, -7.5F, -2.7F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			body_r5 = new ModelRenderer(this);
			body_r5.setRotationPoint(-5.2343F, -5.5F, 5.144F);
			body.addChild(body_r5);
			setRotationAngle(body_r5, 0.0F, 1.5708F, 0.0F);
			body_r5.setTextureOffset(47, 61).addBox(0.5F, -0.5F, -2.7F, 1.0F, 1.0F, 8.0F, 0.0F, true);
			body_r6 = new ModelRenderer(this);
			body_r6.setRotationPoint(5.2343F, -5.5F, 5.144F);
			body.addChild(body_r6);
			setRotationAngle(body_r6, 0.0F, -1.5708F, 0.0F);
			body_r6.setTextureOffset(47, 61).addBox(-1.5F, -0.5F, -2.7F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			body_r7 = new ModelRenderer(this);
			body_r7.setRotationPoint(-5.2343F, -4.5F, -4.856F);
			body.addChild(body_r7);
			setRotationAngle(body_r7, 0.0F, 1.5708F, 0.0F);
			body_r7.setTextureOffset(51, 34).addBox(0.5F, -0.5F, -3.7F, 1.0F, 1.0F, 9.0F, 0.0F, true);
			body_r8 = new ModelRenderer(this);
			body_r8.setRotationPoint(5.2343F, -4.5F, -4.856F);
			body.addChild(body_r8);
			setRotationAngle(body_r8, 0.0F, -1.5708F, 0.0F);
			body_r8.setTextureOffset(51, 34).addBox(-1.5F, -0.5F, -3.7F, 1.0F, 1.0F, 9.0F, 0.0F, false);
			body_r9 = new ModelRenderer(this);
			body_r9.setRotationPoint(7.4F, -5.0F, -6.0F);
			body.addChild(body_r9);
			setRotationAngle(body_r9, 0.0F, 0.8901F, 0.0F);
			body_r9.setTextureOffset(0, 72).addBox(-0.5F, 0.0F, 1.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body_r9.setTextureOffset(44, 8).addBox(-6.5F, 0.0F, 4.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body_r9.setTextureOffset(44, 8).addBox(-6.5F, 7.0F, 4.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body_r9.setTextureOffset(0, 72).addBox(-0.5F, 7.0F, 1.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body_r9.setTextureOffset(66, 71).addBox(-0.5F, 7.0F, -4.5F, 1.0F, 1.0F, 6.0F, 0.0F, true);
			body_r10 = new ModelRenderer(this);
			body_r10.setRotationPoint(5.2343F, -4.5F, 5.944F);
			body.addChild(body_r10);
			setRotationAngle(body_r10, 0.0F, -1.5708F, 0.0F);
			body_r10.setTextureOffset(28, 21).addBox(-4.3F, -0.5F, -2.7F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body_r10.setTextureOffset(28, 21).addBox(-4.3F, 6.5F, -2.7F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body_r10.setTextureOffset(47, 61).addBox(-1.5F, 6.5F, -2.7F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -4.0F, 0.0F);
			body.addChild(left_arm);
			setRotationAngle(left_arm, 0.0F, 0.829F, 0.0F);
			left_arm.setTextureOffset(62, 30).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
			left_arm.setTextureOffset(25, 53).addBox(1.0F, -2.0F, -2.7F, 5.0F, 6.0F, 5.0F, 0.0F, true);
			left_arm.setTextureOffset(0, 0).addBox(2.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(3.0F, 10.3333F, 1.0F);
			left_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(50, 70).addBox(-2.0F, 7.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			right_arm_r1.setTextureOffset(0, 25).addBox(-1.0F, 6.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_arm_r1.setTextureOffset(51, 48).addBox(-2.0F, -1.3333F, -7.4F, 5.0F, 8.0F, 5.0F, 0.0F, true);
			right_arm_r1.setTextureOffset(70, 14).addBox(-2.0F, 1.6667F, -7.0F, 4.0F, 5.0F, 4.0F, 0.0F, true);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -4.0F, 0.0F);
			body.addChild(right_arm);
			setRotationAngle(right_arm, 0.0F, -0.829F, 0.0F);
			right_arm.setTextureOffset(62, 30).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 0).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(25, 53).addBox(-6.0F, -2.0F, -2.7F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.0F, 10.3333F, 1.0F);
			right_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.0F);
			right_arm_r2.setTextureOffset(50, 70).addBox(-2.0F, 7.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(0, 25).addBox(-1.0F, 6.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(70, 14).addBox(-2.0F, 1.6667F, -7.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(-3.5F, 3.2167F, -0.9333F);
			right_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5708F, 0.0F, 0.0F);
			right_arm_r3.setTextureOffset(51, 48).addBox(-2.5F, -3.2667F, -0.2833F, 5.0F, 8.0F, 5.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(54, 8).addBox(-7.9F, 11.0F, 1.3F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(18, 35).addBox(-2.9F, 15.0F, 3.3F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(67, 40).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(52, 23).addBox(-2.9F, 11.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			right_leg.setTextureOffset(34, 67).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(48, 48).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(47, 23).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(30, 43).addBox(-2.4F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(0.6F, 13.6874F, 2.1452F);
			right_leg.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -0.8727F, 0.0F, 0.0F);
			right_arm_r4.setTextureOffset(10, 61).addBox(-0.5F, -0.7F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(65, 61).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(18, 64).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(30, 46).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(30, 43).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(36, 13).addBox(-2.6F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			left_leg.setTextureOffset(52, 23).addBox(-3.1F, 11.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, true);
			left_leg.setTextureOffset(18, 35).addBox(-1.1F, 15.0F, 3.3F, 4.0F, 1.0F, 1.0F, 0.0F, true);
			left_leg.setTextureOffset(54, 8).addBox(2.9F, 11.0F, 1.3F, 5.0F, 5.0F, 5.0F, 0.0F, true);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(-0.6F, 13.6874F, 2.1452F);
			left_leg.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, -0.8727F, 0.0F, 0.0F);
			right_arm_r5.setTextureOffset(10, 61).addBox(-0.5F, -0.7F, -2.5F, 1.0F, 1.0F, 5.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
