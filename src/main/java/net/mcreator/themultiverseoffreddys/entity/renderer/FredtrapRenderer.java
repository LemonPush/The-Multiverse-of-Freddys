
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

import net.mcreator.themultiverseoffreddys.entity.FredtrapEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FredtrapRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FredtrapEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelFredtrap(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/fredtrap.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFredtrap extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer jaw;
		private final ModelRenderer ear_left;
		private final ModelRenderer head_r1;
		private final ModelRenderer ear_right;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer skull;
		private final ModelRenderer body;
		private final ModelRenderer flesh_body;
		private final ModelRenderer left_arm;
		private final ModelRenderer flesh_left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer flesh_right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer flesh_left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer flesh_right_leg;

		public ModelFredtrap() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.253F, 0.1333F);
			head.setTextureOffset(47, 26).addBox(-3.0F, -1.947F, -1.1333F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(42, 0).addBox(-3.5F, -7.947F, -1.1333F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(26, 51).addBox(2.5F, -6.947F, -1.1333F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(57, 11).addBox(2.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(56, 47).addBox(2.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(56, 43).addBox(-3.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(56, 19).addBox(-2.0F, -2.947F, 2.3667F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 59).addBox(-1.0F, -4.947F, 2.3667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(59, 22).addBox(-1.0F, -6.447F, 1.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(58, 37).addBox(-1.0F, -7.947F, 0.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(40, 56).addBox(-3.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(58, 0).addBox(-3.0F, -5.447F, -3.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 12).addBox(-3.5F, -5.447F, -2.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(17, 35).addBox(1.0F, -5.447F, -3.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(10, 27).addBox(1.5F, -5.447F, -2.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 27).addBox(-3.5F, -6.947F, -1.1333F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.447F, -4.1333F, 8.0F, 6.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(10, 29).addBox(-2.5F, -9.447F, -2.6333F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(34, 37).addBox(-2.0F, -12.447F, -2.1333F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(55, 7).addBox(-2.5F, -4.447F, -6.1333F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(42, 24).addBox(2.75F, -2.797F, -4.0833F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(21, 14).addBox(1.5F, -2.797F, -5.6833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(21, 14).addBox(0.25F, -2.797F, -6.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(21, 14).addBox(-2.5F, -2.797F, -5.6833F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(21, 14).addBox(-1.25F, -2.797F, -6.0833F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(42, 24).addBox(-3.75F, -2.797F, -4.0833F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			head.setTextureOffset(24, 0).addBox(-0.5F, -4.697F, -6.6333F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 6).addBox(0.55F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(0, 6).addBox(0.45F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 6).addBox(-2.55F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 6).addBox(-2.45F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			jaw = new ModelRenderer(this);
			jaw.setRotationPoint(0.0F, -1.1807F, -0.0361F);
			head.addChild(jaw);
			setRotationAngle(jaw, 0.1309F, 0.0F, 0.0F);
			jaw.setTextureOffset(53, 29).addBox(-2.5F, -0.2344F, -5.9962F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(42, 24).addBox(2.75F, -0.8344F, -3.9462F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(21, 16).addBox(2.95F, -0.8344F, -3.5462F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(21, 16).addBox(-3.95F, -0.8344F, -3.5462F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			jaw.setTextureOffset(21, 22).addBox(-4.0F, -2.1844F, -0.9962F, 8.0F, 2.0F, 5.0F, 0.0F, false);
			jaw.setTextureOffset(21, 14).addBox(1.5F, -0.8344F, -5.5462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(21, 14).addBox(0.25F, -0.8344F, -5.9462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(0, 27).addBox(3.0F, -0.2344F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			jaw.setTextureOffset(0, 27).addBox(-4.0F, -0.2344F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, true);
			jaw.setTextureOffset(54, 41).addBox(-3.0F, -0.2344F, 3.0038F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(54, 41).addBox(-3.0F, -0.2344F, -3.9962F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(21, 14).addBox(-1.25F, -0.8344F, -5.9462F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			jaw.setTextureOffset(21, 14).addBox(-2.5F, -0.8344F, -5.5462F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			jaw.setTextureOffset(42, 24).addBox(-3.75F, -0.8344F, -3.9462F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			ear_left = new ModelRenderer(this);
			ear_left.setRotationPoint(2.05F, -8.3759F, -0.0848F);
			head.addChild(ear_left);
			setRotationAngle(ear_left, 0.1745F, 0.0F, 0.2094F);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(2.1008F, -1.1901F, -0.0485F);
			ear_left.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.4538F);
			head_r1.setTextureOffset(0, 14).addBox(-0.5F, 0.25F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(55, 32).addBox(-1.5F, -2.75F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, true);
			ear_right = new ModelRenderer(this);
			ear_right.setRotationPoint(-2.05F, -8.3759F, -0.0848F);
			head.addChild(ear_right);
			setRotationAngle(ear_right, 0.1745F, 0.0F, -0.2094F);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-2.1008F, -1.1901F, -0.0485F);
			ear_right.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, -0.4538F);
			head_r2.setTextureOffset(0, 14).addBox(-0.5F, 0.25F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			head_r2.setTextureOffset(55, 32).addBox(-1.5F, -2.75F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-2.0F, -0.071F, -0.0485F);
			ear_right.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, -0.4538F);
			head_r3.setTextureOffset(0, 14).addBox(-0.1F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			head_r3.setTextureOffset(55, 32).addBox(-1.1F, -3.8F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			skull = new ModelRenderer(this);
			skull.setRotationPoint(0.0F, 22.053F, -0.1333F);
			head.addChild(skull);
			skull.setTextureOffset(0, 36).addBox(-2.0F, -25.0F, -3.0F, 4.0F, 2.0F, 5.0F, 0.25F, false);
			skull.setTextureOffset(25, 45).addBox(-1.15F, -25.0F, -3.05F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			skull.setTextureOffset(26, 8).addBox(-2.5F, -29.5F, -3.0F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			skull.setTextureOffset(54, 57).addBox(-2.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			skull.setTextureOffset(54, 57).addBox(0.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(48, 42).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 14).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 8.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(18, 37).addBox(-3.5F, 0.75F, -2.75F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 2).addBox(-0.5F, 2.25F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 17).addBox(-0.5F, 0.25F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(42, 34).addBox(-2.5F, -0.25F, -3.25F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(42, 34).addBox(0.5F, -0.25F, -3.25F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(24, 0).addBox(-3.5F, 8.5F, -2.0F, 7.0F, 3.0F, 4.0F, 0.25F, false);
			body.setTextureOffset(60, 17).addBox(-3.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 15).addBox(-3.0F, 4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 60).addBox(-3.0F, 5.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(59, 59).addBox(1.0F, 5.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 60).addBox(1.0F, 4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(6, 60).addBox(1.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(26, 18).addBox(-5.0F, 0.25F, -1.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(36, 29).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(46, 55).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			flesh_body = new ModelRenderer(this);
			flesh_body.setRotationPoint(0.0F, 22.0F, 0.0F);
			body.addChild(flesh_body);
			flesh_body.setTextureOffset(52, 3).addBox(-2.5F, -14.0F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_body.setTextureOffset(0, 56).addBox(-1.5F, -16.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_body.setTextureOffset(0, 56).addBox(-1.5F, -19.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_body.setTextureOffset(52, 3).addBox(-2.5F, -21.7F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.9F, 0.85F, 0.0F);
			left_arm.setTextureOffset(32, 44).addBox(1.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(48, 12).addBox(0.6F, -0.6F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(47, 19).addBox(0.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(47, 19).addBox(0.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(46, 34).addBox(0.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(53, 51).addBox(0.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(32, 56).addBox(1.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_left_arm = new ModelRenderer(this);
			flesh_left_arm.setRotationPoint(-0.5F, 21.15F, 0.0F);
			left_arm.addChild(flesh_left_arm);
			flesh_left_arm.setTextureOffset(40, 44).addBox(1.6F, -21.5F, -1.0F, 2.0F, 10.0F, 2.0F, 0.2F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.9F, 0.85F, 0.0F);
			right_arm.setTextureOffset(32, 44).addBox(-3.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(48, 12).addBox(-3.6F, -0.6F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(47, 19).addBox(-3.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(47, 19).addBox(-3.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(46, 34).addBox(-3.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(53, 51).addBox(-3.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(32, 56).addBox(-3.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, true);
			flesh_right_arm = new ModelRenderer(this);
			flesh_right_arm.setRotationPoint(0.5F, 21.15F, 0.0F);
			right_arm.addChild(flesh_right_arm);
			flesh_right_arm.setTextureOffset(40, 44).addBox(-3.6F, -21.5F, -1.0F, 2.0F, 10.0F, 2.0F, 0.2F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(0, 43).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(16, 45).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(43, 4).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.25F, false);
			left_leg.setTextureOffset(13, 53).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_leg.setTextureOffset(24, 29).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			flesh_left_leg = new ModelRenderer(this);
			flesh_left_leg.setRotationPoint(-2.0F, 10.7083F, 0.1667F);
			left_leg.addChild(flesh_left_leg);
			flesh_left_leg.setTextureOffset(8, 43).addBox(1.0F, -10.75F, -1.0F, 2.0F, 11.0F, 2.0F, 0.2F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(0, 43).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(16, 45).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 0).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, true);
			right_leg.setTextureOffset(43, 4).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.25F, true);
			right_leg.setTextureOffset(13, 53).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 3.0F, 0.25F, true);
			right_leg.setTextureOffset(24, 29).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, true);
			flesh_right_leg = new ModelRenderer(this);
			flesh_right_leg.setRotationPoint(2.0F, 10.7083F, 0.1667F);
			right_leg.addChild(flesh_right_leg);
			flesh_right_leg.setTextureOffset(8, 43).addBox(-3.0F, -10.75F, -1.0F, 2.0F, 11.0F, 2.0F, 0.2F, true);
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
