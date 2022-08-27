
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

import net.mcreator.themultiverseoffreddys.entity.LapineManEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class LapineManRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(LapineManEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelLapine_Man(), 0.4f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/lapine_man.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelLapine_Man extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer jaw;
		private final ModelRenderer ear_left;
		private final ModelRenderer head_r1;
		private final ModelRenderer ear_right;
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

		public ModelLapine_Man() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.253F, 0.1333F);
			head.setTextureOffset(55, 19).addBox(-3.0F, -1.947F, -1.1333F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(28, 40).addBox(-3.5F, -7.947F, -1.1333F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(60, 60).addBox(2.5F, -6.947F, -1.1333F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(30, 61).addBox(2.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(24, 61).addBox(2.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(18, 61).addBox(-3.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(59, 11).addBox(-2.0F, -2.947F, 2.3667F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(62, 14).addBox(-1.0F, -4.947F, 2.3667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(42, 61).addBox(-1.0F, -6.447F, 1.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(51, 44).addBox(-1.0F, -7.947F, 0.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 51).addBox(-3.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(63, 0).addBox(-3.0F, -5.447F, -3.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(62, 17).addBox(-3.5F, -5.447F, -2.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(61, 31).addBox(1.0F, -5.447F, -3.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 38).addBox(1.5F, -5.447F, -2.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 13).addBox(-3.5F, -6.947F, -1.1333F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 13).addBox(-4.0F, -8.447F, -4.1333F, 8.0F, 6.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(58, 7).addBox(-2.5F, -4.447F, -5.1333F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(45, 12).addBox(2.75F, -2.797F, -4.0833F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(4, 13).addBox(1.5F, -2.797F, -4.6833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(4, 13).addBox(0.25F, -2.797F, -5.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(4, 13).addBox(-2.5F, -2.797F, -4.6833F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(4, 13).addBox(-1.25F, -2.797F, -5.0833F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(45, 12).addBox(-3.75F, -2.797F, -4.0833F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			head.setTextureOffset(0, 27).addBox(-0.5F, -4.697F, -5.6333F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(21, 28).addBox(-0.5F, -1.697F, -7.6333F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(54, 7).addBox(0.55F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(54, 7).addBox(0.45F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(54, 7).addBox(-2.55F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(54, 7).addBox(-2.45F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(0, 0).addBox(-4.5F, -12.0F, -4.6F, 9.0F, 4.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(27, 0).addBox(-4.5F, -9.0F, -8.6F, 9.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 40).addBox(-4.0F, -6.447F, -4.6F, 8.0F, 2.0F, 3.0F, 0.0F, false);
			jaw = new ModelRenderer(this);
			jaw.setRotationPoint(0.0F, -1.1807F, -0.0361F);
			head.addChild(jaw);
			setRotationAngle(jaw, 0.1309F, 0.0F, 0.0F);
			jaw.setTextureOffset(57, 35).addBox(-2.5F, -0.2344F, -4.9962F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(45, 12).addBox(2.75F, -0.8344F, -3.9462F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(39, 35).addBox(2.95F, -0.8344F, -3.5462F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(39, 35).addBox(-3.95F, -0.8344F, -3.5462F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			jaw.setTextureOffset(24, 13).addBox(-4.0F, -2.1844F, -0.9962F, 8.0F, 2.0F, 5.0F, 0.0F, false);
			jaw.setTextureOffset(4, 13).addBox(1.5F, -0.8344F, -4.5462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(4, 13).addBox(0.25F, -0.8344F, -4.9462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(38, 35).addBox(3.0F, -0.2344F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			jaw.setTextureOffset(38, 35).addBox(-4.0F, -0.2344F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, true);
			jaw.setTextureOffset(55, 22).addBox(-3.0F, -0.2344F, 3.0038F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(55, 22).addBox(-3.0F, -0.2344F, -3.9962F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(4, 13).addBox(-1.25F, -0.8344F, -4.9462F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			jaw.setTextureOffset(4, 13).addBox(-2.5F, -0.8344F, -4.5462F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			jaw.setTextureOffset(45, 12).addBox(-3.75F, -0.8344F, -3.9462F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			ear_left = new ModelRenderer(this);
			ear_left.setRotationPoint(2.05F, -8.3759F, -0.0848F);
			head.addChild(ear_left);
			setRotationAngle(ear_left, 0.1745F, 0.0F, 0.2094F);
			ear_left.setTextureOffset(8, 59).addBox(-1.5F, -4.571F, -1.0485F, 3.0F, 4.0F, 2.0F, 0.0F, true);
			ear_left.setTextureOffset(24, 16).addBox(-0.5F, -5.571F, -0.5485F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			ear_left.setTextureOffset(24, 13).addBox(-0.5F, -0.571F, -0.5485F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			ear_left.setTextureOffset(26, 32).addBox(-1.0F, -4.571F, -0.5485F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -4.0F, -1.0F);
			ear_left.addChild(head_r1);
			setRotationAngle(head_r1, 0.5672F, 0.0F, 0.0F);
			head_r1.setTextureOffset(5, 0).addBox(-0.5F, -3.4861F, 1.0556F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(36, 61).addBox(-1.0F, -3.4861F, 1.0556F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 6).addBox(-1.0F, -4.3249F, 0.3086F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(58, 55).addBox(-1.5F, -3.3249F, 0.3086F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			ear_right = new ModelRenderer(this);
			ear_right.setRotationPoint(-2.05F, -8.3759F, -0.0848F);
			head.addChild(ear_right);
			setRotationAngle(ear_right, 0.1745F, 0.0F, -0.2094F);
			ear_right.setTextureOffset(8, 59).addBox(-1.5F, -4.571F, -1.0485F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			ear_right.setTextureOffset(24, 16).addBox(-0.5F, -5.571F, -0.5485F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			ear_right.setTextureOffset(24, 13).addBox(-0.5F, -0.571F, -0.5485F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			ear_right.setTextureOffset(26, 32).addBox(-1.0F, -4.571F, -0.5485F, 2.0F, 4.0F, 1.0F, 0.0F, true);
			skull = new ModelRenderer(this);
			skull.setRotationPoint(0.0F, 22.053F, -0.1333F);
			head.addChild(skull);
			skull.setTextureOffset(42, 20).addBox(-2.0F, -25.0F, -3.0F, 4.0F, 2.0F, 5.0F, 0.25F, false);
			skull.setTextureOffset(28, 43).addBox(-1.15F, -25.0F, -3.05F, 2.0F, 2.0F, 1.0F, 0.25F, false);
			skull.setTextureOffset(26, 21).addBox(-2.5F, -29.5F, -3.0F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			skull.setTextureOffset(49, 0).addBox(-2.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			skull.setTextureOffset(49, 0).addBox(0.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 53).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 27).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 8.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 45).addBox(-3.5F, 0.75F, -2.75F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(27, 0).addBox(-0.5F, 1.75F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 5).addBox(-3.5F, 8.5F, -2.0F, 7.0F, 3.0F, 4.0F, 0.25F, false);
			body.setTextureOffset(64, 60).addBox(-3.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(64, 51).addBox(-3.0F, 4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(41, 64).addBox(-3.0F, 5.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(63, 33).addBox(1.0F, 5.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(47, 63).addBox(1.0F, 4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(53, 63).addBox(1.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(39, 31).addBox(-5.0F, 0.25F, -1.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(34, 44).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(8, 53).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			flesh_body = new ModelRenderer(this);
			flesh_body.setRotationPoint(0.0F, 22.0F, 0.0F);
			body.addChild(flesh_body);
			flesh_body.setTextureOffset(57, 47).addBox(-2.5F, -14.0F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_body.setTextureOffset(27, 5).addBox(-1.5F, -16.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_body.setTextureOffset(27, 5).addBox(-1.5F, -19.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_body.setTextureOffset(57, 47).addBox(-2.5F, -21.7F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.9F, 0.85F, 0.0F);
			left_arm.setTextureOffset(32, 49).addBox(1.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(57, 24).addBox(0.6F, -0.6F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(54, 0).addBox(0.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(54, 0).addBox(0.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(50, 12).addBox(0.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(48, 57).addBox(0.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(48, 27).addBox(1.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_left_arm = new ModelRenderer(this);
			flesh_left_arm.setRotationPoint(-0.5F, 21.15F, 0.0F);
			left_arm.addChild(flesh_left_arm);
			flesh_left_arm.setTextureOffset(40, 49).addBox(1.6F, -21.5F, -1.0F, 2.0F, 10.0F, 2.0F, 0.2F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.9F, 0.85F, 0.0F);
			right_arm.setTextureOffset(32, 49).addBox(-3.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(57, 24).addBox(-3.6F, -0.6F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(54, 0).addBox(-3.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(54, 0).addBox(-3.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(50, 12).addBox(-3.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(48, 57).addBox(-3.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(48, 27).addBox(-3.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, true);
			flesh_right_arm = new ModelRenderer(this);
			flesh_right_arm.setRotationPoint(0.5F, 21.15F, 0.0F);
			right_arm.addChild(flesh_right_arm);
			flesh_right_arm.setTextureOffset(40, 49).addBox(-3.6F, -21.5F, -1.0F, 2.0F, 10.0F, 2.0F, 0.2F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(16, 48).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(48, 49).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(48, 35).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.25F, false);
			left_leg.setTextureOffset(57, 40).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_leg.setTextureOffset(26, 31).addBox(-1.5F, 10.7083F, -4.3333F, 3.0F, 2.0F, 7.0F, 0.25F, false);
			left_leg.setTextureOffset(16, 40).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			flesh_left_leg = new ModelRenderer(this);
			flesh_left_leg.setRotationPoint(-2.0F, 10.7083F, 0.1667F);
			left_leg.addChild(flesh_left_leg);
			flesh_left_leg.setTextureOffset(24, 48).addBox(1.0F, -10.75F, -1.0F, 2.0F, 11.0F, 2.0F, 0.2F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(16, 48).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(48, 49).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 0).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, true);
			right_leg.setTextureOffset(48, 35).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.25F, true);
			right_leg.setTextureOffset(57, 40).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 3.0F, 0.25F, true);
			right_leg.setTextureOffset(16, 40).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, true);
			right_leg.setTextureOffset(26, 31).addBox(-1.5F, 10.7083F, -4.3333F, 3.0F, 2.0F, 7.0F, 0.25F, true);
			flesh_right_leg = new ModelRenderer(this);
			flesh_right_leg.setRotationPoint(2.0F, 10.7083F, 0.1667F);
			right_leg.addChild(flesh_right_leg);
			flesh_right_leg.setTextureOffset(24, 48).addBox(-3.0F, -10.75F, -1.0F, 2.0F, 11.0F, 2.0F, 0.2F, true);
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
