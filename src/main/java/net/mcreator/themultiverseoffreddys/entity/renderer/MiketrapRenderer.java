
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

import net.mcreator.themultiverseoffreddys.entity.MiketrapEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MiketrapRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MiketrapEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMiketrap(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/miketrap.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMiketrap extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer jaw;
		private final ModelRenderer ear_left;
		private final ModelRenderer head_r1;
		private final ModelRenderer ear_right;
		private final ModelRenderer skull;
		private final ModelRenderer body;
		private final ModelRenderer flesh_body;
		private final ModelRenderer body2;
		private final ModelRenderer left_arm;
		private final ModelRenderer flesh_left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer flesh_right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer flesh_left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer flesh_right_leg;

		public ModelMiketrap() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.253F, 0.1333F);
			head.setTextureOffset(46, 3).addBox(-3.0F, -1.947F, -1.1333F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(42, 0).addBox(-3.5F, -7.947F, -1.1333F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 60).addBox(2.5F, -6.947F, -1.1333F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(40, 60).addBox(2.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(60, 13).addBox(2.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(12, 60).addBox(-3.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(42, 34).addBox(-2.0F, -2.947F, 2.3667F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(46, 62).addBox(-1.0F, -4.947F, 2.3667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(56, 61).addBox(-1.0F, -6.447F, 1.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(61, 36).addBox(-1.0F, -7.947F, 0.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(6, 60).addBox(-3.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(61, 63).addBox(-3.0F, -5.447F, -3.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(35, 63).addBox(-3.5F, -5.447F, -2.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(29, 63).addBox(1.0F, -5.447F, -3.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(62, 61).addBox(1.5F, -5.447F, -2.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 27).addBox(-3.5F, -6.947F, -1.1333F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.447F, -4.1333F, 8.0F, 6.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(16, 57).addBox(-2.5F, -4.447F, -5.1333F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(18, 61).addBox(2.75F, -2.797F, -4.0833F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 17).addBox(1.5F, -2.797F, -4.6833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 17).addBox(0.25F, -2.797F, -5.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 17).addBox(-2.5F, -2.797F, -4.6833F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(0, 17).addBox(-1.25F, -2.797F, -5.0833F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(18, 61).addBox(-3.75F, -2.797F, -4.0833F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			head.setTextureOffset(24, 0).addBox(-0.5F, -4.697F, -5.6333F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(61, 39).addBox(0.55F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(61, 39).addBox(0.45F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(61, 39).addBox(-2.55F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(61, 39).addBox(-2.45F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			jaw = new ModelRenderer(this);
			jaw.setRotationPoint(0.0F, -1.1807F, -0.0361F);
			head.addChild(jaw);
			setRotationAngle(jaw, 0.1309F, 0.0F, 0.0F);
			jaw.setTextureOffset(56, 6).addBox(-2.5F, -0.2344F, -4.9962F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(18, 61).addBox(2.75F, -0.8344F, -3.9462F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(21, 16).addBox(2.95F, -0.8344F, -3.5462F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(21, 16).addBox(-3.95F, -0.8344F, -3.5462F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			jaw.setTextureOffset(21, 22).addBox(-4.0F, -2.1844F, -0.9962F, 8.0F, 2.0F, 5.0F, 0.0F, false);
			jaw.setTextureOffset(0, 17).addBox(1.5F, -0.8344F, -4.5462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(0, 17).addBox(0.25F, -0.8344F, -4.9462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(0, 27).addBox(3.0F, -0.2344F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			jaw.setTextureOffset(0, 27).addBox(-4.0F, -0.2344F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, true);
			jaw.setTextureOffset(56, 19).addBox(-3.0F, -0.2344F, 3.0038F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(56, 19).addBox(-3.0F, -0.2344F, -3.9962F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(0, 17).addBox(-1.25F, -0.8344F, -4.9462F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			jaw.setTextureOffset(0, 17).addBox(-2.5F, -0.8344F, -4.5462F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			jaw.setTextureOffset(18, 61).addBox(-3.75F, -0.8344F, -3.9462F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			ear_left = new ModelRenderer(this);
			ear_left.setRotationPoint(2.05F, -8.3759F, -0.0848F);
			head.addChild(ear_left);
			setRotationAngle(ear_left, 0.1745F, 0.0F, 0.2094F);
			ear_left.setTextureOffset(30, 57).addBox(-1.5F, -4.571F, -1.0485F, 3.0F, 4.0F, 2.0F, 0.0F, true);
			ear_left.setTextureOffset(21, 14).addBox(-0.5F, -5.571F, -0.5485F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			ear_left.setTextureOffset(0, 14).addBox(-0.5F, -0.571F, -0.5485F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			ear_left.setTextureOffset(60, 0).addBox(-1.0F, -4.571F, -0.5485F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -4.0F, -1.0F);
			ear_left.addChild(head_r1);
			setRotationAngle(head_r1, 0.5672F, 0.0F, 0.0F);
			head_r1.setTextureOffset(5, 0).addBox(-0.5F, -3.4861F, 1.0556F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(60, 51).addBox(-1.0F, -3.4861F, 1.0556F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(42, 11).addBox(-1.0F, -4.3249F, 0.3086F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(57, 56).addBox(-1.5F, -3.3249F, 0.3086F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			ear_right = new ModelRenderer(this);
			ear_right.setRotationPoint(-2.05F, -8.3759F, -0.0848F);
			head.addChild(ear_right);
			setRotationAngle(ear_right, 0.1745F, 0.0F, -0.2094F);
			ear_right.setTextureOffset(30, 57).addBox(-1.5F, -4.571F, -1.0485F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			ear_right.setTextureOffset(21, 14).addBox(-0.5F, -5.571F, -0.5485F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			ear_right.setTextureOffset(0, 14).addBox(-0.5F, -0.571F, -0.5485F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			ear_right.setTextureOffset(60, 0).addBox(-1.0F, -4.571F, -0.5485F, 2.0F, 4.0F, 1.0F, 0.0F, true);
			skull = new ModelRenderer(this);
			skull.setRotationPoint(0.0F, 22.053F, -0.1333F);
			head.addChild(skull);
			skull.setTextureOffset(15, 37).addBox(-2.0F, -25.0F, -3.0F, 4.0F, 2.0F, 5.0F, 0.25F, false);
			skull.setTextureOffset(59, 21).addBox(-1.15F, -25.0F, -3.05F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			skull.setTextureOffset(26, 8).addBox(-2.5F, -29.5F, -3.0F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			skull.setTextureOffset(24, 61).addBox(-2.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			skull.setTextureOffset(24, 61).addBox(0.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(8, 48).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 14).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 8.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(33, 37).addBox(-3.5F, 0.75F, -2.75F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 2).addBox(-0.5F, 1.75F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 0).addBox(-3.5F, 8.5F, -2.0F, 7.0F, 3.0F, 4.0F, 0.25F, false);
			body.setTextureOffset(64, 31).addBox(-3.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 64).addBox(-3.0F, 4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(18, 64).addBox(-3.0F, 5.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(6, 64).addBox(1.0F, 5.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 64).addBox(1.0F, 4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(64, 13).addBox(1.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(26, 18).addBox(-5.0F, 0.25F, -1.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(36, 29).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(58, 31).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			flesh_body = new ModelRenderer(this);
			flesh_body.setRotationPoint(0.0F, 22.0F, 0.0F);
			body.addChild(flesh_body);
			flesh_body.setTextureOffset(57, 9).addBox(-2.5F, -14.0F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_body.setTextureOffset(57, 41).addBox(-1.5F, -16.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_body.setTextureOffset(57, 41).addBox(-1.5F, -19.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_body.setTextureOffset(57, 9).addBox(-2.5F, -21.7F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			body2 = new ModelRenderer(this);
			body2.setRotationPoint(-18.0F, 0.0F, 0.0F);
			body.addChild(body2);
			body2.setTextureOffset(32, 45).addBox(17.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body2.setTextureOffset(10, 29).addBox(14.5F, 0.4F, -1.5F, 7.0F, 3.0F, 3.0F, 0.25F, false);
			body2.setTextureOffset(0, 42).addBox(15.0F, 3.5F, -1.0F, 6.0F, 4.0F, 2.0F, 0.25F, false);
			body2.setTextureOffset(42, 7).addBox(15.0F, 8.0F, -1.0F, 6.0F, 2.0F, 2.0F, 0.25F, false);
			body2.setTextureOffset(60, 45).addBox(15.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(60, 17).addBox(15.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(38, 57).addBox(15.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(0, 6).addBox(19.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(17, 35).addBox(19.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(47, 27).addBox(19.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(10, 27).addBox(19.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(10, 27).addBox(13.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(0, 36).addBox(14.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.9F, 0.85F, 0.0F);
			left_arm.setTextureOffset(40, 45).addBox(1.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(48, 49).addBox(0.6F, -0.6F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(49, 34).addBox(0.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(49, 34).addBox(0.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(48, 42).addBox(0.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(45, 56).addBox(0.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(58, 47).addBox(1.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_left_arm = new ModelRenderer(this);
			flesh_left_arm.setRotationPoint(-0.5F, 21.15F, 0.0F);
			left_arm.addChild(flesh_left_arm);
			flesh_left_arm.setTextureOffset(0, 48).addBox(1.6F, -21.5F, -1.0F, 2.0F, 10.0F, 2.0F, 0.2F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.9F, 0.85F, 0.0F);
			right_arm.setTextureOffset(40, 45).addBox(-3.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(48, 49).addBox(-3.6F, -0.6F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(49, 34).addBox(-3.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(49, 34).addBox(-3.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(48, 42).addBox(-3.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(45, 56).addBox(-3.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(58, 47).addBox(-3.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, true);
			flesh_right_arm = new ModelRenderer(this);
			flesh_right_arm.setRotationPoint(0.5F, 21.15F, 0.0F);
			right_arm.addChild(flesh_right_arm);
			flesh_right_arm.setTextureOffset(0, 48).addBox(-3.6F, -21.5F, -1.0F, 2.0F, 10.0F, 2.0F, 0.2F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(16, 44).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(48, 11).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(47, 19).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.25F, false);
			left_leg.setTextureOffset(56, 24).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_leg.setTextureOffset(24, 29).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			flesh_left_leg = new ModelRenderer(this);
			flesh_left_leg.setRotationPoint(-2.0F, 10.7083F, 0.1667F);
			left_leg.addChild(flesh_left_leg);
			flesh_left_leg.setTextureOffset(24, 44).addBox(1.0F, -10.75F, -1.0F, 2.0F, 11.0F, 2.0F, 0.2F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(16, 44).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(48, 11).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 0).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, true);
			right_leg.setTextureOffset(47, 19).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.25F, true);
			right_leg.setTextureOffset(56, 24).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 3.0F, 0.25F, true);
			right_leg.setTextureOffset(24, 29).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, true);
			flesh_right_leg = new ModelRenderer(this);
			flesh_right_leg.setRotationPoint(2.0F, 10.7083F, 0.1667F);
			right_leg.addChild(flesh_right_leg);
			flesh_right_leg.setTextureOffset(24, 44).addBox(-3.0F, -10.75F, -1.0F, 2.0F, 11.0F, 2.0F, 0.2F, true);
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
