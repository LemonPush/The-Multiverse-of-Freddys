
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

import net.mcreator.themultiverseoffreddys.entity.TamedLittleMusicManEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedLittleMusicManRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedLittleMusicManEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelLittleMusicMan(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/littlemusicman.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelLittleMusicMan extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer right_arm_r5;
		private final ModelRenderer right_arm_r6;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg_r1;
		private final ModelRenderer right_leg_r2;
		private final ModelRenderer right_leg_r3;
		private final ModelRenderer left_leg2;
		private final ModelRenderer right_leg_r4;
		private final ModelRenderer right_leg_r5;
		private final ModelRenderer right_leg_r6;
		private final ModelRenderer left_leg3;
		private final ModelRenderer right_leg_r7;
		private final ModelRenderer right_leg_r8;
		private final ModelRenderer right_leg_r9;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg_r10;
		private final ModelRenderer right_leg_r11;
		private final ModelRenderer right_leg_r12;
		private final ModelRenderer right_leg2;
		private final ModelRenderer right_leg_r13;
		private final ModelRenderer right_leg_r14;
		private final ModelRenderer right_leg_r15;
		private final ModelRenderer right_leg3;
		private final ModelRenderer right_leg_r16;
		private final ModelRenderer right_leg_r17;
		private final ModelRenderer right_leg_r18;

		public ModelLittleMusicMan() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.07F, 16.02F, -0.41F);
			head.setTextureOffset(0, 0).addBox(-2.57F, -2.22F, -1.69F, 5.0F, 2.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(12, 9).addBox(-2.07F, -4.22F, -1.69F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-1.17F, -3.37F, -1.84F, 1.0F, 0.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(0.63F, -3.37F, -1.84F, 1.0F, 0.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(34, 23).addBox(-0.57F, -2.77F, -2.44F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(22, 34).addBox(-0.57F, -3.07F, -2.14F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-0.57F, -2.17F, -2.74F, 1.0F, 0.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(19, 20).addBox(-1.07F, -2.47F, -2.74F, 2.0F, 1.0F, 3.0F, -0.25F, false);
			head.setTextureOffset(14, 0).addBox(-1.57F, -5.02F, -1.09F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(24, 2).addBox(-0.97F, -6.32F, -0.79F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(18, 15).addBox(-1.5F, 20.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(15, 4).addBox(-1.5F, 17.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 6).addBox(-2.0F, 17.7F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(41, 6).addBox(-0.5F, 18.7F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(41, 6).addBox(-0.5F, 17.7F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(33, 34).addBox(-0.5F, 16.4F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(1.2989F, 17.8741F, 0.2271F);
			setRotationAngle(left_arm, -1.8146F, -0.579F, 0.056F);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(2.6167F, 5.8888F, -20.5481F);
			left_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -0.2381F, 0.0132F, 0.0173F);
			right_arm_r1.setTextureOffset(12, 7).addBox(-1.8659F, -7.442F, 21.1103F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(7, 13).addBox(-1.8659F, -3.442F, 17.1103F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(12, 15).addBox(-1.8659F, -7.442F, 17.1103F, 1.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(8, 23).addBox(-1.6659F, -6.022F, 18.6603F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(2.7029F, 2.1032F, -19.6146F);
			left_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -0.2753F, 0.5205F, -0.119F);
			right_arm_r2.setTextureOffset(8, 27).addBox(-10.6354F, -5.3221F, 16.3603F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(1.659F, 1.1586F, 0.2739F);
			left_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, 0.4902F, 0.7577F, -0.5211F);
			right_arm_r3.setTextureOffset(30, 22).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-1.2989F, 17.8741F, 0.2271F);
			setRotationAngle(right_arm, -1.8146F, 0.579F, -0.056F);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(-2.6167F, 5.8888F, -20.5481F);
			right_arm.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -0.2381F, -0.0132F, -0.0173F);
			right_arm_r4.setTextureOffset(6, 22).addBox(0.8659F, -3.442F, 17.1103F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r4.setTextureOffset(0, 13).addBox(0.8659F, -7.442F, 17.1103F, 1.0F, 4.0F, 5.0F, 0.0F, false);
			right_arm_r4.setTextureOffset(0, 22).addBox(-0.3341F, -6.022F, 18.6603F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(-2.7029F, 2.1032F, -19.6146F);
			right_arm.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, -0.2753F, -0.5205F, 0.119F);
			right_arm_r5.setTextureOffset(0, 13).addBox(9.6354F, -5.3221F, 16.3603F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_arm_r6 = new ModelRenderer(this);
			right_arm_r6.setRotationPoint(-1.659F, 1.1586F, 0.2739F);
			right_arm.addChild(right_arm_r6);
			setRotationAngle(right_arm_r6, 0.4618F, 0.6956F, 1.1814F);
			right_arm_r6.setTextureOffset(0, 0).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(1.5381F, 20.2172F, -1.4856F);
			setRotationAngle(left_leg, 0.0F, 0.7854F, 0.0F);
			left_leg.setTextureOffset(7, 32).addBox(4.3091F, 1.0866F, -0.525F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 24).addBox(3.811F, 2.7828F, -0.825F, 2.0F, 1.0F, 2.0F, 0.1F, false);
			left_leg.setTextureOffset(34, 11).addBox(4.261F, 0.2828F, -0.525F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			left_leg.setTextureOffset(10, 34).addBox(2.111F, -0.9472F, -0.525F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			left_leg.setTextureOffset(34, 6).addBox(0.101F, 0.7128F, -0.525F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			right_leg_r1 = new ModelRenderer(this);
			right_leg_r1.setRotationPoint(1.251F, -0.0672F, 0.175F);
			left_leg.addChild(right_leg_r1);
			setRotationAngle(right_leg_r1, 0.0F, 0.0F, 0.8727F);
			right_leg_r1.setTextureOffset(28, 27).addBox(-0.03F, -1.31F, -0.7F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg_r2 = new ModelRenderer(this);
			right_leg_r2.setRotationPoint(0.8242F, 1.563F, 0.175F);
			left_leg.addChild(right_leg_r2);
			setRotationAngle(right_leg_r2, 0.0F, 0.0F, -0.4625F);
			right_leg_r2.setTextureOffset(31, 30).addBox(-0.6643F, -2.2517F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg_r3 = new ModelRenderer(this);
			right_leg_r3.setRotationPoint(2.751F, -0.3672F, 0.175F);
			left_leg.addChild(right_leg_r3);
			setRotationAngle(right_leg_r3, 0.0F, 0.0F, -1.0472F);
			right_leg_r3.setTextureOffset(0, 29).addBox(-0.6F, -0.6F, -0.7F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg2 = new ModelRenderer(this);
			left_leg2.setRotationPoint(3.6F, 7.0F, 0.0F);
			left_leg2.setTextureOffset(33, 3).addBox(2.5581F, 14.3038F, -0.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_leg2.setTextureOffset(26, 19).addBox(2.06F, 16.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.1F, false);
			left_leg2.setTextureOffset(34, 32).addBox(2.51F, 13.5F, -0.3F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			left_leg2.setTextureOffset(34, 29).addBox(0.36F, 12.27F, -0.3F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			left_leg2.setTextureOffset(26, 34).addBox(-1.65F, 13.93F, -0.3F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			right_leg_r4 = new ModelRenderer(this);
			right_leg_r4.setRotationPoint(-0.5F, 13.15F, 0.0F);
			left_leg2.addChild(right_leg_r4);
			setRotationAngle(right_leg_r4, 0.0F, 0.0F, 0.8727F);
			right_leg_r4.setTextureOffset(30, 6).addBox(-0.03F, -1.31F, -0.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg_r5 = new ModelRenderer(this);
			right_leg_r5.setRotationPoint(-0.9268F, 14.7803F, 0.0F);
			left_leg2.addChild(right_leg_r5);
			setRotationAngle(right_leg_r5, 0.0F, 0.0F, -0.4363F);
			right_leg_r5.setTextureOffset(0, 33).addBox(-0.6643F, -2.2517F, -0.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg_r6 = new ModelRenderer(this);
			right_leg_r6.setRotationPoint(1.0F, 12.85F, 0.0F);
			left_leg2.addChild(right_leg_r6);
			setRotationAngle(right_leg_r6, 0.0F, 0.0F, -1.0472F);
			right_leg_r6.setTextureOffset(30, 11).addBox(-0.6F, -0.6F, -0.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg3 = new ModelRenderer(this);
			left_leg3.setRotationPoint(1.5381F, 20.2172F, 1.4856F);
			setRotationAngle(left_leg3, 0.0F, -0.7854F, 0.0F);
			left_leg3.setTextureOffset(32, 26).addBox(4.3091F, 1.0866F, -0.475F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_leg3.setTextureOffset(0, 26).addBox(3.811F, 2.7828F, -1.175F, 2.0F, 1.0F, 2.0F, 0.1F, false);
			left_leg3.setTextureOffset(18, 34).addBox(4.261F, 0.2828F, -0.475F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			left_leg3.setTextureOffset(14, 34).addBox(2.111F, -0.9472F, -0.475F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			left_leg3.setTextureOffset(34, 13).addBox(0.101F, 0.7128F, -0.475F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			right_leg_r7 = new ModelRenderer(this);
			right_leg_r7.setRotationPoint(1.251F, -0.0672F, -0.175F);
			left_leg3.addChild(right_leg_r7);
			setRotationAngle(right_leg_r7, 0.0F, 0.0F, 0.8727F);
			right_leg_r7.setTextureOffset(4, 29).addBox(-0.03F, -1.31F, -0.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg_r8 = new ModelRenderer(this);
			right_leg_r8.setRotationPoint(0.8242F, 1.563F, -0.175F);
			left_leg3.addChild(right_leg_r8);
			setRotationAngle(right_leg_r8, 0.0F, 0.0F, -0.4625F);
			right_leg_r8.setTextureOffset(32, 18).addBox(-0.6643F, -2.2517F, -0.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg_r9 = new ModelRenderer(this);
			right_leg_r9.setRotationPoint(2.751F, -0.3672F, -0.175F);
			left_leg3.addChild(right_leg_r9);
			setRotationAngle(right_leg_r9, 0.0F, 0.0F, -1.0472F);
			right_leg_r9.setTextureOffset(30, 0).addBox(-0.6F, -0.6F, -0.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-1.5381F, 20.2172F, -1.4856F);
			setRotationAngle(right_leg, 0.0F, -0.7854F, 0.0F);
			right_leg.setTextureOffset(27, 31).addBox(-5.3091F, 1.0866F, -0.525F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(16, 24).addBox(-5.811F, 2.7828F, -0.825F, 2.0F, 1.0F, 2.0F, 0.1F, false);
			right_leg.setTextureOffset(4, 34).addBox(-5.261F, 0.2828F, -0.525F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			right_leg.setTextureOffset(34, 0).addBox(-3.111F, -0.9472F, -0.525F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			right_leg.setTextureOffset(30, 33).addBox(-1.101F, 0.7128F, -0.525F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			right_leg_r10 = new ModelRenderer(this);
			right_leg_r10.setRotationPoint(-1.251F, -0.0672F, 0.175F);
			right_leg.addChild(right_leg_r10);
			setRotationAngle(right_leg_r10, 0.0F, 0.0F, -0.8727F);
			right_leg_r10.setTextureOffset(20, 27).addBox(-0.97F, -1.31F, -0.7F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg_r11 = new ModelRenderer(this);
			right_leg_r11.setRotationPoint(-0.8242F, 1.563F, 0.175F);
			right_leg.addChild(right_leg_r11);
			setRotationAngle(right_leg_r11, 0.0F, 0.0F, 0.4625F);
			right_leg_r11.setTextureOffset(23, 31).addBox(-0.3357F, -2.2517F, -0.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg_r12 = new ModelRenderer(this);
			right_leg_r12.setRotationPoint(-2.751F, -0.3672F, 0.175F);
			right_leg.addChild(right_leg_r12);
			setRotationAngle(right_leg_r12, 0.0F, 0.0F, 1.0472F);
			right_leg_r12.setTextureOffset(24, 27).addBox(-0.4F, -0.6F, -0.7F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg2 = new ModelRenderer(this);
			right_leg2.setRotationPoint(-3.6F, 7.0F, 0.0F);
			right_leg2.setTextureOffset(19, 31).addBox(-3.5581F, 14.3038F, -0.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg2.setTextureOffset(24, 8).addBox(-4.06F, 16.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.1F, false);
			right_leg2.setTextureOffset(33, 21).addBox(-3.51F, 13.5F, -0.3F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			right_leg2.setTextureOffset(33, 9).addBox(-1.36F, 12.27F, -0.3F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			right_leg2.setTextureOffset(22, 24).addBox(0.65F, 13.93F, -0.3F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			right_leg_r13 = new ModelRenderer(this);
			right_leg_r13.setRotationPoint(0.5F, 13.15F, 0.0F);
			right_leg2.addChild(right_leg_r13);
			setRotationAngle(right_leg_r13, 0.0F, 0.0F, -0.8727F);
			right_leg_r13.setTextureOffset(27, 14).addBox(-0.97F, -1.31F, -0.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg_r14 = new ModelRenderer(this);
			right_leg_r14.setRotationPoint(0.9268F, 14.7803F, 0.0F);
			right_leg2.addChild(right_leg_r14);
			setRotationAngle(right_leg_r14, 0.0F, 0.0F, 0.4363F);
			right_leg_r14.setTextureOffset(31, 15).addBox(-0.3357F, -2.2517F, -0.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg_r15 = new ModelRenderer(this);
			right_leg_r15.setRotationPoint(-1.0F, 12.85F, 0.0F);
			right_leg2.addChild(right_leg_r15);
			setRotationAngle(right_leg_r15, 0.0F, 0.0F, 1.0472F);
			right_leg_r15.setTextureOffset(16, 27).addBox(-0.4F, -0.6F, -0.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg3 = new ModelRenderer(this);
			right_leg3.setRotationPoint(-1.5381F, 20.2172F, 1.4856F);
			setRotationAngle(right_leg3, 0.0F, 0.7854F, 0.0F);
			right_leg3.setTextureOffset(15, 31).addBox(-5.3091F, 1.0866F, -0.475F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg3.setTextureOffset(7, 15).addBox(-5.811F, 2.7828F, -1.175F, 2.0F, 1.0F, 2.0F, 0.1F, false);
			right_leg3.setTextureOffset(24, 11).addBox(-5.261F, 0.2828F, -0.475F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			right_leg3.setTextureOffset(14, 23).addBox(-3.111F, -0.9472F, -0.475F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			right_leg3.setTextureOffset(23, 0).addBox(-1.101F, 0.7128F, -0.475F, 1.0F, 1.0F, 1.0F, 0.1F, false);
			right_leg_r16 = new ModelRenderer(this);
			right_leg_r16.setRotationPoint(-1.251F, -0.0672F, -0.175F);
			right_leg3.addChild(right_leg_r16);
			setRotationAngle(right_leg_r16, 0.0F, 0.0F, -0.8727F);
			right_leg_r16.setTextureOffset(0, 6).addBox(-0.97F, -1.31F, -0.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg_r17 = new ModelRenderer(this);
			right_leg_r17.setRotationPoint(-0.8242F, 1.563F, -0.175F);
			right_leg3.addChild(right_leg_r17);
			setRotationAngle(right_leg_r17, 0.0F, 0.0F, 0.4625F);
			right_leg_r17.setTextureOffset(11, 31).addBox(-0.3357F, -2.2517F, -0.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_leg_r18 = new ModelRenderer(this);
			right_leg_r18.setRotationPoint(-2.751F, -0.3672F, -0.175F);
			right_leg3.addChild(right_leg_r18);
			setRotationAngle(right_leg_r18, 0.0F, 0.0F, 1.0472F);
			right_leg_r18.setTextureOffset(12, 27).addBox(-0.4F, -0.6F, -0.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg3.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.left_leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.right_leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
