
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

import net.mcreator.themultiverseoffreddys.entity.CatrinaToyChicaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CatrinaToyChicaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CatrinaToyChicaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelCatrina_Toy_Chica(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/catrina_toy_chica.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelCatrina_Toy_Chica extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer head_r6;
		private final ModelRenderer head_r7;
		private final ModelRenderer head_r8;
		private final ModelRenderer head_r9;
		private final ModelRenderer head_r10;
		private final ModelRenderer head_r11;
		private final ModelRenderer head_r12;
		private final ModelRenderer head_r13;
		private final ModelRenderer body;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer left_arm;

		public ModelCatrina_Toy_Chica() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F, false);
			head.setTextureOffset(24, 20).addBox(-4.0F, -16.6F, -4.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(72, 30).addBox(0.0F, -16.5F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 30).addBox(-1.7F, -16.5F, -4.6F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 4).addBox(1.0F, -17.0F, -4.7F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 44).addBox(-4.0F, -17.0F, -4.7F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 4).addBox(1.0F, -17.0F, 3.7F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 30).addBox(0.0F, -16.5F, 4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 30).addBox(-1.7F, -16.5F, 3.6F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 44).addBox(-4.0F, -17.0F, 3.7F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -18.5F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-2.0F, -18.5F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(1.0F, -18.5F, -4.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(-5.7F, -16.5F, 0.7F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(4.7F, -16.5F, 0.7F, 1.0F, 5.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(43, 9).addBox(-2.3F, -17.5F, 0.7F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(43, 9).addBox(-4.3F, -17.5F, -1.3F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(4.0F, -16.2F, -5.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(-5.0F, -16.5F, -5.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(48, 20).addBox(-5.0F, -13.5F, 4.0F, 10.0F, 5.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 31).addBox(-6.0F, -8.5F, 4.0F, 12.0F, 14.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 0).addBox(-3.0F, -7.0F, -7.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(26, 18).addBox(-3.0F, -8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(72, 36).addBox(-3.0F, -8.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(72, 33).addBox(2.0F, -8.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(68, 23).addBox(-2.0F, -10.0F, -6.8F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(12, 46).addBox(-2.0F, -9.5F, -7.8F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(56, 36).addBox(-3.0F, -9.5F, -7.2F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(52, 64).addBox(-1.0F, -10.5F, -6.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(63, 73).addBox(-2.8F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(57, 73).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 41).addBox(-4.5F, -13.5F, -4.0F, 1.0F, 7.0F, 8.0F, 0.25F, false);
			head.setTextureOffset(18, 41).addBox(3.5F, -13.5F, -4.0F, 1.0F, 7.0F, 8.0F, 0.25F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(6.0F, -15.5F, -4.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, -1.0908F, 0.0F);
			head_r1.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-3.0F, -15.5F, 10.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, -3.1416F, 0.1745F, 3.1416F);
			head_r2.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(5.5F, -15.5F, -4.2F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, -1.5708F, 0.0F);
			head_r3.setTextureOffset(46, 44).addBox(5.2F, -1.5F, 0.5F, 3.0F, 3.0F, 1.0F, 0.0F, true);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-5.5F, -15.5F, -4.2F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 1.5708F, 0.0F);
			head_r4.setTextureOffset(46, 44).addBox(-8.2F, -1.5F, 0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(-5.5F, -15.5F, -4.2F);
			head.addChild(head_r5);
			setRotationAngle(head_r5, 0.0F, 1.309F, 0.0F);
			head_r5.setTextureOffset(46, 44).addBox(-2.7F, -1.5F, 0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(0.075F, -15.5F, 4.25F);
			head.addChild(head_r6);
			setRotationAngle(head_r6, -1.5708F, 0.0F, 0.0F);
			head_r6.setTextureOffset(72, 30).addBox(1.925F, 2.5F, -1.65F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r6.setTextureOffset(72, 30).addBox(-0.675F, -0.3F, -1.15F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r6.setTextureOffset(72, 30).addBox(-2.075F, 0.5F, -1.15F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r6.setTextureOffset(72, 30).addBox(1.925F, 0.5F, -1.65F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r6.setTextureOffset(72, 30).addBox(-4.375F, 2.3F, -1.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r6.setTextureOffset(72, 30).addBox(-1.475F, 3.0F, -1.65F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r6.setTextureOffset(72, 30).addBox(-4.075F, 3.0F, -1.65F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r6.setTextureOffset(72, 30).addBox(-4.075F, 0.5F, -1.65F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r6.setTextureOffset(72, 30).addBox(-1.775F, 5.0F, -1.65F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r6.setTextureOffset(72, 30).addBox(-0.075F, 5.0F, -1.25F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r6.setTextureOffset(0, 4).addBox(-0.275F, 2.3F, -2.35F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r6.setTextureOffset(0, 4).addBox(-1.075F, 0.5F, -1.55F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r6.setTextureOffset(0, 4).addBox(-4.775F, 4.8F, -1.55F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r6.setTextureOffset(0, 4).addBox(0.925F, 4.5F, -1.55F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r7 = new ModelRenderer(this);
			head_r7.setRotationPoint(-6.5F, -15.0F, 0.5F);
			head.addChild(head_r7);
			setRotationAngle(head_r7, 0.0F, 1.5708F, 0.0F);
			head_r7.setTextureOffset(0, 4).addBox(-0.5F, -1.5F, 1.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r8 = new ModelRenderer(this);
			head_r8.setRotationPoint(3.0944F, -19.0873F, -2.5851F);
			head.addChild(head_r8);
			setRotationAngle(head_r8, -1.1606F, -0.5672F, 0.0F);
			head_r8.setTextureOffset(0, 4).addBox(-0.5F, -1.5F, 0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r9 = new ModelRenderer(this);
			head_r9.setRotationPoint(7.5041F, -16.7892F, -2.0623F);
			head.addChild(head_r9);
			setRotationAngle(head_r9, -1.6984F, -0.9925F, 1.2993F);
			head_r9.setTextureOffset(0, 4).addBox(-0.3F, -3.5F, 2.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r10 = new ModelRenderer(this);
			head_r10.setRotationPoint(5.5F, -15.0F, -4.5F);
			head.addChild(head_r10);
			setRotationAngle(head_r10, -0.6981F, -0.5672F, 0.0F);
			head_r10.setTextureOffset(0, 4).addBox(-1.5F, -3.5F, -0.9F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r11 = new ModelRenderer(this);
			head_r11.setRotationPoint(0.3F, -17.3126F, -3.2548F);
			head.addChild(head_r11);
			setRotationAngle(head_r11, -0.9163F, 0.0F, 0.0F);
			head_r11.setTextureOffset(72, 30).addBox(-1.0F, -0.7F, 0.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r12 = new ModelRenderer(this);
			head_r12.setRotationPoint(7.0F, -15.5F, -4.5F);
			head.addChild(head_r12);
			setRotationAngle(head_r12, 0.0F, -1.5708F, 0.0F);
			head_r12.setTextureOffset(72, 30).addBox(4.0F, 0.0F, 2.1F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r12.setTextureOffset(72, 30).addBox(2.0F, 0.0F, 2.1F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r13 = new ModelRenderer(this);
			head_r13.setRotationPoint(4.0F, -15.5F, -4.5F);
			head.addChild(head_r13);
			setRotationAngle(head_r13, 0.0F, -0.7854F, 0.0F);
			head_r13.setTextureOffset(72, 30).addBox(-0.7F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.25F, false);
			body.setTextureOffset(45, 64).addBox(4.5F, 9.0F, -2.5F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(54, 44).addBox(-4.5F, 9.0F, 2.5F, 9.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(45, 64).addBox(-5.5F, 9.0F, -2.5F, 1.0F, 7.0F, 5.0F, 0.0F, true);
			body.setTextureOffset(0, 16).addBox(-5.0F, -6.0F, -3.5F, 10.0F, 6.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(26, 31).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 5.0F, 5.0F, 0.25F, false);
			body.setTextureOffset(64, 41).addBox(-3.5F, -2.0F, -4.3F, 7.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 15).addBox(-4.5F, -4.0F, -4.3F, 9.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 28).addBox(-5.5F, -6.0F, -4.3F, 11.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(46, 33).addBox(4.5F, -7.0F, -4.3F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(46, 0).addBox(5.5F, -7.0F, -4.3F, 3.0F, 1.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(46, 0).addBox(-8.5F, -7.0F, -4.3F, 3.0F, 1.0F, 8.0F, 0.0F, true);
			body.setTextureOffset(46, 33).addBox(-5.5F, -7.0F, -4.3F, 1.0F, 3.0F, 8.0F, 0.0F, true);
			body.setTextureOffset(47, 31).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(43, 11).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(30, 72).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(8, 72).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(64, 5).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.1F, false);
			right_leg.setTextureOffset(62, 60).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			right_leg.setTextureOffset(0, 72).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(71, 71).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(20, 46).addBox(-0.4F, 15.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			right_leg.setTextureOffset(14, 73).addBox(-2.4F, 15.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			right_leg.setTextureOffset(38, 72).addBox(1.6F, 15.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			right_leg.setTextureOffset(43, 11).addBox(-2.4F, 14.0F, -4.0F, 5.0F, 2.0F, 7.0F, 0.1F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(0, 62).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.1F, false);
			left_leg.setTextureOffset(34, 56).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
			left_leg.setTextureOffset(65, 70).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(57, 70).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(26, 9).addBox(-2.6F, 14.0F, -4.0F, 5.0F, 2.0F, 7.0F, 0.1F, false);
			left_leg.setTextureOffset(26, 73).addBox(-2.6F, 15.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			left_leg.setTextureOffset(20, 73).addBox(1.4F, 15.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			left_leg.setTextureOffset(12, 63).addBox(-0.6F, 15.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(56, 26).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(29, 56).addBox(2.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(3.0F, 10.3333F, 0.0F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(39, 66).addBox(-2.15F, 10.2667F, -12.9F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_arm_r1.setTextureOffset(39, 66).addBox(0.15F, 10.2667F, -12.9F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_arm_r1.setTextureOffset(32, 66).addBox(-0.5F, 8.1667F, -16.1F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(16, 56).addBox(-2.0F, 6.6667F, -13.0F, 4.0F, 4.0F, 5.0F, 0.25F, false);
			right_arm_r1.setTextureOffset(66, 52).addBox(-3.0F, 5.6667F, -8.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(16, 65).addBox(-2.0F, 6.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(69, 18).addBox(-1.0F, 5.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(50, 52).addBox(-2.0F, -2.3333F, -7.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(0, 46).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(28, 65).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(60, 5).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(28, 41).addBox(-5.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
