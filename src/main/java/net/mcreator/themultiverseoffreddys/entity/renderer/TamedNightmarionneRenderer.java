
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

import net.mcreator.themultiverseoffreddys.entity.TamedNightmarionneEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedNightmarionneRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedNightmarionneEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelNightmarionne(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/nightmarionne.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelNightmarionne extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer bone3;
		private final ModelRenderer body;
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
		private final ModelRenderer left_arm;
		private final ModelRenderer left_lower_arm;
		private final ModelRenderer left_1_tentacle;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer left_2_tentacle;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer left_3_tentacle;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_lower_arm;
		private final ModelRenderer right_1_tentacle;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer right__tentacle2;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer right_3_tentacle;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg_r1;
		private final ModelRenderer lower_leg2;
		private final ModelRenderer right_leg_r2;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg_r3;
		private final ModelRenderer lower_leg3;
		private final ModelRenderer right_leg_r4;

		public ModelNightmarionne() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -23.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-5.0F, -13.0F, -3.0F, 10.0F, 12.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(0, 19).addBox(-5.5F, -1.0F, -3.0F, 11.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(16, 33).addBox(-6.0F, -7.0F, -3.0F, 1.0F, 6.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(0, 33).addBox(5.0F, -7.0F, -3.0F, 1.0F, 6.0F, 7.0F, 0.0F, false);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-12.0F, 18.0F, 1.0F);
			head.addChild(bone3);
			bone3.setTextureOffset(32, 35).addBox(7.0F, -23.5F, -5.0F, 10.0F, 5.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(40, 41).addBox(7.5F, -30.5F, -5.0F, 9.0F, 5.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(40, 30).addBox(7.5F, -25.5F, -5.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(22, 46).addBox(10.125F, -20.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(49, 33).addBox(7.125F, -23.5F, -5.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(3, 5).addBox(16.0F, -24.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone3.setTextureOffset(0, 4).addBox(7.0F, -24.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(0, 46).addBox(-3.5F, -29.0F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(8, 54).addBox(-2.5F, -31.0F, -1.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(40, 55).addBox(-1.5F, -39.0F, -1.0F, 3.0F, 8.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(34, 12).addBox(-2.5F, -36.5F, 0.7F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(9, 33).addBox(-3.0F, -38.5F, 1.7F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(29, 21).addBox(-4.0F, -40.5F, 1.7F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(9, 35).addBox(-1.0F, -47.3F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(27, 0).addBox(-5.5F, -43.5F, -2.0F, 11.0F, 2.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(30, 15).addBox(-4.5F, -41.5F, -2.0F, 9.0F, 2.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(34, 6).addBox(-3.5F, -39.5F, -2.0F, 7.0F, 2.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(50, 22).addBox(-2.5F, -37.5F, -2.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 27).addBox(-6.5F, -45.5F, -2.0F, 13.0F, 2.0F, 4.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(-4.0F, -40.0F, 2.2F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, -1.4835F, 0.0F);
			body_r1.setTextureOffset(22, 48).addBox(-6.0F, -0.5F, 0.6F, 4.0F, 1.0F, 1.0F, 0.0F, true);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(-4.0F, -40.0F, 2.2F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, -0.9163F, 0.0F);
			body_r2.setTextureOffset(40, 25).addBox(-2.6F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(-3.0F, -38.0F, 2.2F);
			body.addChild(body_r3);
			setRotationAngle(body_r3, 0.0F, -1.4835F, 0.0F);
			body_r3.setTextureOffset(40, 23).addBox(-5.0F, -0.5F, 0.6F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			body_r4 = new ModelRenderer(this);
			body_r4.setRotationPoint(-3.0F, -38.0F, 2.2F);
			body.addChild(body_r4);
			setRotationAngle(body_r4, 0.0F, -0.9163F, 0.0F);
			body_r4.setTextureOffset(15, 35).addBox(-2.6F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			body_r5 = new ModelRenderer(this);
			body_r5.setRotationPoint(-2.0F, -36.0F, 2.0F);
			body.addChild(body_r5);
			setRotationAngle(body_r5, 0.0F, -1.4835F, 0.0F);
			body_r5.setTextureOffset(0, 2).addBox(-4.0F, -0.5F, 0.6F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			body_r6 = new ModelRenderer(this);
			body_r6.setRotationPoint(-2.0F, -36.0F, 2.0F);
			body.addChild(body_r6);
			setRotationAngle(body_r6, 0.0F, -0.9163F, 0.0F);
			body_r6.setTextureOffset(0, 0).addBox(-2.6F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			body_r7 = new ModelRenderer(this);
			body_r7.setRotationPoint(2.0F, -36.0F, 2.0F);
			body.addChild(body_r7);
			setRotationAngle(body_r7, 0.0F, 0.9163F, 0.0F);
			body_r7.setTextureOffset(0, 0).addBox(0.6F, -0.5F, -0.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body_r8 = new ModelRenderer(this);
			body_r8.setRotationPoint(2.0F, -36.0F, 2.0F);
			body.addChild(body_r8);
			setRotationAngle(body_r8, 0.0F, 1.4835F, 0.0F);
			body_r8.setTextureOffset(0, 2).addBox(2.0F, -0.5F, 0.6F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body_r9 = new ModelRenderer(this);
			body_r9.setRotationPoint(3.0F, -38.0F, 2.2F);
			body.addChild(body_r9);
			setRotationAngle(body_r9, 0.0F, 0.9163F, 0.0F);
			body_r9.setTextureOffset(15, 35).addBox(-0.4F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body_r10 = new ModelRenderer(this);
			body_r10.setRotationPoint(3.0F, -38.0F, 2.2F);
			body.addChild(body_r10);
			setRotationAngle(body_r10, 0.0F, 1.4835F, 0.0F);
			body_r10.setTextureOffset(40, 23).addBox(2.0F, -0.5F, 0.6F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body_r11 = new ModelRenderer(this);
			body_r11.setRotationPoint(4.0F, -40.0F, 2.2F);
			body.addChild(body_r11);
			setRotationAngle(body_r11, 0.0F, 0.9163F, 0.0F);
			body_r11.setTextureOffset(40, 25).addBox(-0.4F, -0.5F, -0.7F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body_r12 = new ModelRenderer(this);
			body_r12.setRotationPoint(4.0F, -40.0F, 2.2F);
			body.addChild(body_r12);
			setRotationAngle(body_r12, 0.0F, 1.4835F, 0.0F);
			body_r12.setTextureOffset(22, 48).addBox(2.0F, -0.5F, 0.6F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.5621F, -20.0348F, 0.1084F);
			setRotationAngle(left_arm, -0.1309F, 0.0F, -0.3927F);
			left_arm.setTextureOffset(24, 54).addBox(-0.4916F, -0.97F, -0.9738F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_lower_arm = new ModelRenderer(this);
			left_lower_arm.setRotationPoint(-4.4665F, 20.7377F, 1.1939F);
			left_arm.addChild(left_lower_arm);
			setRotationAngle(left_lower_arm, 0.6109F, 0.0F, 0.0F);
			left_lower_arm.setTextureOffset(27, 24).addBox(3.9749F, -11.6534F, -2.4542F, 2.0F, 2.0F, 9.0F, 0.0F, false);
			left_1_tentacle = new ModelRenderer(this);
			left_1_tentacle.setRotationPoint(4.9161F, -10.6753F, -2.6973F);
			left_lower_arm.addChild(left_1_tentacle);
			setRotationAngle(left_1_tentacle, 1.2101F, -0.0467F, 2.2183F);
			left_1_tentacle.setTextureOffset(40, 21).addBox(-0.6164F, 0.4728F, -7.3421F, 1.0F, 1.0F, 8.0F, 0.0F, true);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(11.1102F, -11.4131F, -11.9461F);
			left_1_tentacle.addChild(cube_r1);
			setRotationAngle(cube_r1, 1.6144F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(49, 48).addBox(-11.7266F, 0.4846F, -6.9803F, 1.0F, 1.0F, 7.0F, 0.0F, true);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(11.1102F, -11.4131F, -11.9461F);
			left_1_tentacle.addChild(cube_r2);
			setRotationAngle(cube_r2, 2.138F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(50, 14).addBox(-11.7266F, -3.0874F, -13.3044F, 1.0F, 1.0F, 7.0F, 0.0F, true);
			left_2_tentacle = new ModelRenderer(this);
			left_2_tentacle.setRotationPoint(4.9326F, -11.1566F, -2.3411F);
			left_lower_arm.addChild(left_2_tentacle);
			setRotationAngle(left_2_tentacle, 1.2538F, 0.0467F, -2.2183F);
			left_2_tentacle.setTextureOffset(40, 21).addBox(-0.8113F, 0.0626F, -7.4114F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-5.5428F, -15.9303F, -5.2191F);
			left_2_tentacle.addChild(cube_r3);
			setRotationAngle(cube_r3, 1.6144F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(49, 48).addBox(4.7315F, -6.4843F, -10.7869F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-5.5428F, -15.9303F, -5.2191F);
			left_2_tentacle.addChild(cube_r4);
			setRotationAngle(cube_r4, 2.138F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(50, 14).addBox(4.7315F, -11.026F, -13.1165F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			left_3_tentacle = new ModelRenderer(this);
			left_3_tentacle.setRotationPoint(4.9749F, -10.8557F, -1.5908F);
			left_lower_arm.addChild(left_3_tentacle);
			setRotationAngle(left_3_tentacle, 0.7854F, 0.0F, 0.0F);
			left_3_tentacle.setTextureOffset(13, 46).addBox(-0.5F, -0.2603F, -7.2536F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, -5.8677F, -9.0567F);
			left_3_tentacle.addChild(cube_r5);
			setRotationAngle(cube_r5, -1.2217F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(40, 47).addBox(-0.5F, -0.441F, -0.1463F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, -5.8677F, -9.0567F);
			left_3_tentacle.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.7418F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(49, 6).addBox(-0.5F, -0.454F, -6.9288F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.5621F, -20.0348F, 0.1084F);
			setRotationAngle(right_arm, -0.1309F, 0.0F, 0.3927F);
			right_arm.setTextureOffset(24, 54).addBox(-1.5084F, -0.97F, -0.9738F, 2.0F, 10.0F, 2.0F, 0.0F, true);
			right_lower_arm = new ModelRenderer(this);
			right_lower_arm.setRotationPoint(4.4665F, 20.7377F, 1.1939F);
			right_arm.addChild(right_lower_arm);
			setRotationAngle(right_lower_arm, 0.6109F, 0.0F, 0.0F);
			right_lower_arm.setTextureOffset(27, 24).addBox(-5.9749F, -11.6534F, -2.4542F, 2.0F, 2.0F, 9.0F, 0.0F, true);
			right_1_tentacle = new ModelRenderer(this);
			right_1_tentacle.setRotationPoint(-4.9161F, -10.6753F, -2.6973F);
			right_lower_arm.addChild(right_1_tentacle);
			setRotationAngle(right_1_tentacle, 1.2101F, 0.0467F, -2.2183F);
			right_1_tentacle.setTextureOffset(40, 21).addBox(-0.3836F, 0.4728F, -7.3421F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-11.1102F, -11.4131F, -11.9461F);
			right_1_tentacle.addChild(cube_r7);
			setRotationAngle(cube_r7, 1.6144F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(49, 48).addBox(10.7266F, 0.4846F, -6.9803F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-11.1102F, -11.4131F, -11.9461F);
			right_1_tentacle.addChild(cube_r8);
			setRotationAngle(cube_r8, 2.138F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(50, 14).addBox(10.7266F, -3.0874F, -13.3044F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			right__tentacle2 = new ModelRenderer(this);
			right__tentacle2.setRotationPoint(-4.9326F, -11.1566F, -2.3411F);
			right_lower_arm.addChild(right__tentacle2);
			setRotationAngle(right__tentacle2, 1.2538F, -0.0467F, 2.2183F);
			right__tentacle2.setTextureOffset(40, 21).addBox(-0.1887F, 0.0626F, -7.4114F, 1.0F, 1.0F, 8.0F, 0.0F, true);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(5.5428F, -15.9303F, -5.2191F);
			right__tentacle2.addChild(cube_r9);
			setRotationAngle(cube_r9, 1.6144F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(49, 48).addBox(-5.7315F, -6.4843F, -10.7869F, 1.0F, 1.0F, 7.0F, 0.0F, true);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(5.5428F, -15.9303F, -5.2191F);
			right__tentacle2.addChild(cube_r10);
			setRotationAngle(cube_r10, 2.138F, 0.0F, 0.0F);
			cube_r10.setTextureOffset(50, 14).addBox(-5.7315F, -11.026F, -13.1165F, 1.0F, 1.0F, 7.0F, 0.0F, true);
			right_3_tentacle = new ModelRenderer(this);
			right_3_tentacle.setRotationPoint(-4.9749F, -10.8557F, -1.5908F);
			right_lower_arm.addChild(right_3_tentacle);
			setRotationAngle(right_3_tentacle, 0.7854F, 0.0F, 0.0F);
			right_3_tentacle.setTextureOffset(13, 46).addBox(-0.5F, -0.2603F, -7.2536F, 1.0F, 1.0F, 7.0F, 0.0F, true);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(0.0F, -5.8677F, -9.0567F);
			right_3_tentacle.addChild(cube_r11);
			setRotationAngle(cube_r11, -1.2217F, 0.0F, 0.0F);
			cube_r11.setTextureOffset(40, 47).addBox(-0.5F, -0.441F, -0.1463F, 1.0F, 1.0F, 7.0F, 0.0F, true);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(0.0F, -5.8677F, -9.0567F);
			right_3_tentacle.addChild(cube_r12);
			setRotationAngle(cube_r12, -0.7418F, 0.0F, 0.0F);
			cube_r12.setTextureOffset(49, 6).addBox(-0.5F, -0.454F, -6.9288F, 1.0F, 1.0F, 7.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, -3.0F, 0.1F);
			right_leg_r1 = new ModelRenderer(this);
			right_leg_r1.setRotationPoint(0.0F, 4.5F, -0.6F);
			left_leg.addChild(right_leg_r1);
			setRotationAngle(right_leg_r1, -0.4363F, 0.0F, 0.0F);
			right_leg_r1.setTextureOffset(0, 51).addBox(-1.0F, -5.1F, -2.4F, 2.0F, 14.0F, 2.0F, 0.0F, false);
			lower_leg2 = new ModelRenderer(this);
			lower_leg2.setRotationPoint(-4.0F, 15.0F, 0.8F);
			left_leg.addChild(lower_leg2);
			right_leg_r2 = new ModelRenderer(this);
			right_leg_r2.setRotationPoint(4.0F, -0.5F, -5.6F);
			lower_leg2.addChild(right_leg_r2);
			setRotationAngle(right_leg_r2, 0.3054F, 0.0F, 0.0F);
			right_leg_r2.setTextureOffset(32, 41).addBox(-1.0F, -3.3F, -0.7F, 2.0F, 17.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, -3.0F, 0.1F);
			right_leg_r3 = new ModelRenderer(this);
			right_leg_r3.setRotationPoint(0.0F, 4.5F, -0.6F);
			right_leg.addChild(right_leg_r3);
			setRotationAngle(right_leg_r3, -0.4363F, 0.0F, 0.0F);
			right_leg_r3.setTextureOffset(0, 51).addBox(-1.0F, -5.1F, -2.4F, 2.0F, 14.0F, 2.0F, 0.0F, true);
			lower_leg3 = new ModelRenderer(this);
			lower_leg3.setRotationPoint(4.0F, 15.0F, 0.8F);
			right_leg.addChild(lower_leg3);
			right_leg_r4 = new ModelRenderer(this);
			right_leg_r4.setRotationPoint(-4.0F, -0.5F, -5.6F);
			lower_leg3.addChild(right_leg_r4);
			setRotationAngle(right_leg_r4, 0.3054F, 0.0F, 0.0F);
			right_leg_r4.setTextureOffset(32, 41).addBox(-1.0F, -3.3F, -0.7F, 2.0F, 17.0F, 2.0F, 0.0F, true);
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
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_3_tentacle.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_3_tentacle.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.left_1_tentacle.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.right__tentacle2.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_2_tentacle.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
			this.right_1_tentacle.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		}
	}

}
