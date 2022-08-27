
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

import net.mcreator.themultiverseoffreddys.entity.TamedClownSpringtrapEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedClownSpringtrapRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedClownSpringtrapEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelClown_Springtrap(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/clown_springtrap.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelClown_Springtrap extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer jaw;
		private final ModelRenderer ear_left;
		private final ModelRenderer head_r3;
		private final ModelRenderer ear_right;
		private final ModelRenderer skull;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelClown_Springtrap() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.253F, 0.1333F);
			head.setTextureOffset(50, 21).addBox(-3.0F, -1.947F, -1.1333F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(50, 18).addBox(-3.5F, -7.947F, -1.1333F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(24, 19).addBox(2.5F, -6.947F, -1.1333F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(14, 52).addBox(2.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(37, 0).addBox(2.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(34, 18).addBox(-3.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(44, 50).addBox(-2.0F, -2.947F, 2.3667F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 61).addBox(-1.0F, -4.947F, 2.3667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 58).addBox(-1.0F, -6.447F, 1.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 55).addBox(-1.0F, -7.947F, 0.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 33).addBox(-3.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(59, 44).addBox(-3.0F, -5.447F, -3.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(35, 41).addBox(-3.5F, -5.447F, -2.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 37).addBox(1.0F, -5.447F, -3.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(34, 22).addBox(1.5F, -5.447F, -2.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 19).addBox(-3.5F, -6.947F, -1.1333F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 19).addBox(-4.0F, -8.447F, -4.1333F, 8.0F, 6.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(18, 34).addBox(-2.5F, -4.447F, -5.1333F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(62, 50).addBox(2.75F, -2.797F, -4.0833F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(4, 19).addBox(1.5F, -2.797F, -4.6833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(4, 19).addBox(0.25F, -2.797F, -5.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(4, 19).addBox(-1.25F, -2.797F, -5.0833F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(4, 19).addBox(-2.5F, -2.797F, -4.6833F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(62, 50).addBox(-3.75F, -2.797F, -4.0833F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			head.setTextureOffset(34, 14).addBox(-0.5F, -4.697F, -5.6333F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(34, 7).addBox(0.55F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(34, 7).addBox(0.45F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 5).addBox(-2.55F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 5).addBox(-2.45F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(62, 30).addBox(-0.75F, -9.447F, -3.1333F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-4.25F, -9.147F, -2.1333F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, -0.6109F);
			head_r1.setTextureOffset(62, 30).addBox(-1.0F, 0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(4.25F, -9.147F, -2.1333F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.6109F);
			head_r2.setTextureOffset(62, 30).addBox(-1.0F, 0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			jaw = new ModelRenderer(this);
			jaw.setRotationPoint(0.0F, -1.2807F, -0.0361F);
			head.addChild(jaw);
			setRotationAngle(jaw, 0.1309F, 0.0F, 0.0F);
			jaw.setTextureOffset(30, 46).addBox(-2.5F, -0.2344F, -4.9962F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(62, 50).addBox(2.75F, -0.8344F, -3.9462F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(40, 59).addBox(2.95F, -0.8344F, -3.5462F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			jaw.setTextureOffset(34, 11).addBox(-4.0F, -2.1844F, -0.9962F, 8.0F, 2.0F, 5.0F, 0.0F, false);
			jaw.setTextureOffset(4, 19).addBox(1.5F, -0.8344F, -4.5462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(4, 19).addBox(0.25F, -0.8344F, -4.9462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(4, 19).addBox(-1.25F, -0.8344F, -4.9462F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			jaw.setTextureOffset(4, 19).addBox(-2.5F, -0.8344F, -4.5462F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			jaw.setTextureOffset(62, 50).addBox(-3.75F, -0.8344F, -3.9462F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			jaw.setTextureOffset(40, 59).addBox(-3.95F, -0.8344F, -3.5462F, 1.0F, 1.0F, 3.0F, 0.0F, true);
			jaw.setTextureOffset(36, 41).addBox(3.0F, -0.2344F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			jaw.setTextureOffset(36, 41).addBox(-4.0F, -0.2344F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, true);
			jaw.setTextureOffset(10, 48).addBox(-3.0F, -0.2344F, 3.0038F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(10, 48).addBox(-3.0F, -0.2344F, -3.9962F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			ear_left = new ModelRenderer(this);
			ear_left.setRotationPoint(2.05F, -8.3759F, -0.0848F);
			head.addChild(ear_left);
			setRotationAngle(ear_left, 0.1745F, 0.0F, 0.2094F);
			ear_left.setTextureOffset(22, 59).addBox(-1.5F, -4.571F, -1.0485F, 3.0F, 4.0F, 2.0F, 0.0F, true);
			ear_left.setTextureOffset(28, 19).addBox(-0.5F, -5.571F, -0.5485F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			ear_left.setTextureOffset(27, 0).addBox(-0.5F, -0.571F, -0.5485F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			ear_left.setTextureOffset(0, 0).addBox(-1.0F, -4.571F, -0.5485F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(0.0F, -4.0F, -1.0F);
			ear_left.addChild(head_r3);
			setRotationAngle(head_r3, 0.5672F, 0.0F, 0.0F);
			head_r3.setTextureOffset(4, 0).addBox(-0.5F, -3.4861F, 1.0556F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			head_r3.setTextureOffset(40, 63).addBox(-1.0F, -3.4861F, 1.0556F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r3.setTextureOffset(62, 8).addBox(-1.0F, -4.3249F, 0.3086F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head_r3.setTextureOffset(55, 11).addBox(-1.5F, -3.3249F, 0.3086F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			ear_right = new ModelRenderer(this);
			ear_right.setRotationPoint(-2.05F, -8.3759F, -0.0848F);
			head.addChild(ear_right);
			setRotationAngle(ear_right, 0.1745F, 0.0F, -0.2094F);
			ear_right.setTextureOffset(22, 59).addBox(-1.5F, -4.571F, -1.0485F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			ear_right.setTextureOffset(28, 19).addBox(-0.5F, -5.571F, -0.5485F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			ear_right.setTextureOffset(27, 0).addBox(-0.5F, -0.571F, -0.5485F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			ear_right.setTextureOffset(0, 0).addBox(-1.0F, -4.571F, -0.5485F, 2.0F, 4.0F, 1.0F, 0.0F, true);
			skull = new ModelRenderer(this);
			skull.setRotationPoint(0.0F, 22.053F, -0.1333F);
			head.addChild(skull);
			skull.setTextureOffset(46, 41).addBox(-2.0F, -25.0F, -3.0F, 4.0F, 2.0F, 5.0F, 0.25F, false);
			skull.setTextureOffset(34, 18).addBox(-2.5F, -29.5F, -3.0F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			skull.setTextureOffset(64, 15).addBox(-2.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			skull.setTextureOffset(64, 15).addBox(0.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(14, 57).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(54, 26).addBox(-2.5F, 0.3F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(0, 61).addBox(-1.5F, 6.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(54, 26).addBox(-2.5F, 8.0F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(0, 61).addBox(-1.5F, 3.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			body.setTextureOffset(0, 0).addBox(-5.0F, 0.0F, -3.5F, 10.0F, 12.0F, 7.0F, 0.0F, false);
			body.setTextureOffset(34, 11).addBox(-1.5F, 0.0F, -4.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(34, 11).addBox(0.5F, 0.0F, -4.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(35, 34).addBox(-0.5F, 0.5F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(53, 0).addBox(-3.5F, 0.75F, -2.75F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(35, 36).addBox(-0.5F, 2.0F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(35, 34).addBox(-3.5F, 8.5F, -2.0F, 7.0F, 3.0F, 4.0F, 0.25F, false);
			body.setTextureOffset(6, 65).addBox(-3.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 65).addBox(-3.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(64, 64).addBox(-3.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(8, 61).addBox(1.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(63, 11).addBox(1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(64, 21).addBox(1.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(56, 24).addBox(1.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(10, 50).addBox(-5.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(34, 28).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(-4.5F, -1.5F, 0.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 0.0F, -1.1345F);
			body_r1.setTextureOffset(24, 34).addBox(-1.3F, -0.2F, -4.5F, 1.0F, 3.0F, 9.0F, 0.0F, true);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(4.5F, -1.5F, 0.0F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, 0.0F, 1.1345F);
			body_r2.setTextureOffset(24, 34).addBox(0.3F, -0.2F, -4.5F, 1.0F, 3.0F, 9.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.5F, 0.85F, 0.0F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.3491F);
			left_arm.setTextureOffset(56, 55).addBox(1.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(59, 38).addBox(1.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(49, 48).addBox(0.1F, 6.1F, -2.5F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			left_arm.setTextureOffset(18, 19).addBox(1.6F, 9.6F, -9.0F, 1.0F, 1.0F, 14.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 33).addBox(-0.9F, 5.6F, -15.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);
			left_arm.setTextureOffset(24, 38).addBox(1.0F, 4.65F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(62, 46).addBox(1.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(59, 38).addBox(1.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(24, 38).addBox(1.0F, 4.65F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(62, 46).addBox(1.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			left_arm.setTextureOffset(56, 55).addBox(1.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 48).addBox(0.6F, -0.9F, -2.0F, 3.0F, 9.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(27, 0).addBox(0.6F, 8.6F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.5F, 0.85F, 0.0F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.3491F);
			right_arm.setTextureOffset(56, 55).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(59, 38).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, true);
			right_arm.setTextureOffset(49, 48).addBox(-4.1F, 6.1F, -2.5F, 4.0F, 2.0F, 5.0F, 0.0F, true);
			right_arm.setTextureOffset(27, 0).addBox(-3.6F, 8.6F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(24, 38).addBox(-3.0F, 4.65F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, true);
			right_arm.setTextureOffset(62, 46).addBox(-3.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, true);
			right_arm.setTextureOffset(59, 38).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, true);
			right_arm.setTextureOffset(24, 38).addBox(-3.0F, 4.65F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, true);
			right_arm.setTextureOffset(62, 46).addBox(-3.0F, 8.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, true);
			right_arm.setTextureOffset(56, 55).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(0, 48).addBox(-3.6F, -0.9F, -2.0F, 3.0F, 9.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(27, 0).addBox(-3.6F, 8.6F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(48, 55).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(53, 30).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(32, 59).addBox(-1.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(34, 50).addBox(-1.5F, 6.3583F, -1.8333F, 3.0F, 5.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(20, 46).addBox(-1.5F, 0.9583F, -1.8333F, 3.0F, 9.0F, 4.0F, 0.25F, false);
			left_leg.setTextureOffset(34, 0).addBox(-2.5F, 10.7083F, -5.8333F, 5.0F, 2.0F, 9.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(48, 55).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(53, 30).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(32, 59).addBox(-1.0F, 6.7083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, true);
			right_leg.setTextureOffset(34, 50).addBox(-1.5F, 6.3583F, -1.8333F, 3.0F, 5.0F, 4.0F, 0.0F, true);
			right_leg.setTextureOffset(20, 46).addBox(-1.5F, 0.9583F, -1.8333F, 3.0F, 9.0F, 4.0F, 0.25F, true);
			right_leg.setTextureOffset(34, 0).addBox(-2.5F, 10.7083F, -5.8333F, 5.0F, 2.0F, 9.0F, 0.0F, true);
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
