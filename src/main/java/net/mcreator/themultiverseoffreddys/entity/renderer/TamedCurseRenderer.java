
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

import net.mcreator.themultiverseoffreddys.entity.TamedCurseEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedCurseRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedCurseEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelCurse(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/curse.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelCurse extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer jaw;
		private final ModelRenderer ear_left;
		private final ModelRenderer head_r1;
		private final ModelRenderer ear_right;
		private final ModelRenderer skull;
		private final ModelRenderer head2;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer body;
		private final ModelRenderer flesh_body;
		private final ModelRenderer body2;
		private final ModelRenderer left_arm;
		private final ModelRenderer flesh_left_arm;
		private final ModelRenderer left_arm2;
		private final ModelRenderer right_arm;
		private final ModelRenderer flesh_right_arm;
		private final ModelRenderer right_arm2;
		private final ModelRenderer left_leg;
		private final ModelRenderer flesh_left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer flesh_right_leg;

		public ModelCurse() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.253F, 0.1333F);
			head.setTextureOffset(64, 49).addBox(-3.0F, -1.947F, -1.1333F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(50, 28).addBox(-3.5F, -7.947F, -1.1333F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(46, 67).addBox(2.5F, -6.947F, -1.1333F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(14, 69).addBox(2.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(62, 13).addBox(2.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(58, 31).addBox(-3.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(23, 37).addBox(-2.0F, -2.947F, 2.3667F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(37, 72).addBox(-1.0F, -4.947F, 2.3667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(31, 72).addBox(-1.0F, -6.447F, 1.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 71).addBox(-1.0F, -7.947F, 0.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(53, 0).addBox(-3.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(70, 67).addBox(-3.0F, -5.447F, -3.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(12, 67).addBox(-3.5F, -5.447F, -2.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 52).addBox(1.0F, -5.447F, -3.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(13, 58).addBox(1.5F, -5.447F, -2.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(8, 67).addBox(-3.5F, -6.947F, -1.1333F, 1.0F, 6.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(26, 23).addBox(-4.0F, -8.447F, -4.1333F, 8.0F, 6.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(68, 19).addBox(-2.5F, -4.447F, -5.1333F, 5.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(18, 71).addBox(2.75F, -2.797F, -4.0833F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(28, 40).addBox(1.5F, -2.797F, -4.6833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(28, 40).addBox(0.25F, -2.797F, -5.0833F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(28, 40).addBox(-2.5F, -2.797F, -4.6833F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(28, 40).addBox(-1.25F, -2.797F, -5.0833F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(18, 71).addBox(-3.75F, -2.797F, -4.0833F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			head.setTextureOffset(41, 14).addBox(-0.5F, -4.697F, -5.6333F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(41, 19).addBox(0.55F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(41, 19).addBox(0.45F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(41, 19).addBox(-2.55F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(41, 19).addBox(-2.45F, -6.997F, -4.2333F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			jaw = new ModelRenderer(this);
			jaw.setRotationPoint(0.0F, -1.2807F, -0.0361F);
			head.addChild(jaw);
			setRotationAngle(jaw, 0.1309F, 0.0F, 0.0F);
			jaw.setTextureOffset(67, 64).addBox(-2.5F, -0.2344F, -4.9962F, 5.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(18, 71).addBox(2.75F, -0.8344F, -3.9462F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(71, 0).addBox(2.95F, -0.8344F, -3.5462F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(71, 0).addBox(-3.95F, -0.8344F, -3.5462F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			jaw.setTextureOffset(41, 12).addBox(-4.0F, -2.1844F, -0.9962F, 8.0F, 2.0F, 5.0F, 0.0F, false);
			jaw.setTextureOffset(28, 40).addBox(1.5F, -0.8344F, -4.5462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(28, 40).addBox(0.25F, -0.8344F, -4.9462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(46, 42).addBox(3.0F, -0.2344F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			jaw.setTextureOffset(46, 42).addBox(-4.0F, -0.2344F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, true);
			jaw.setTextureOffset(58, 35).addBox(-3.0F, -0.2344F, 3.0038F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(58, 35).addBox(-3.0F, -0.2344F, -3.9962F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			jaw.setTextureOffset(28, 40).addBox(-1.25F, -0.8344F, -4.9462F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			jaw.setTextureOffset(28, 40).addBox(-2.5F, -0.8344F, -4.5462F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			jaw.setTextureOffset(18, 71).addBox(-3.75F, -0.8344F, -3.9462F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			ear_left = new ModelRenderer(this);
			ear_left.setRotationPoint(2.05F, -8.3759F, -0.0848F);
			head.addChild(ear_left);
			setRotationAngle(ear_left, 0.1745F, 0.0F, 0.2094F);
			ear_left.setTextureOffset(28, 50).addBox(-1.5F, -4.571F, -1.0485F, 3.0F, 4.0F, 2.0F, 0.0F, true);
			ear_left.setTextureOffset(41, 12).addBox(-0.5F, -5.571F, -0.5485F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			ear_left.setTextureOffset(6, 0).addBox(-0.5F, -0.571F, -0.5485F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			ear_left.setTextureOffset(45, 0).addBox(-1.0F, -4.571F, -0.5485F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -4.0F, -1.0F);
			ear_left.addChild(head_r1);
			setRotationAngle(head_r1, 0.5672F, 0.0F, 0.0F);
			head_r1.setTextureOffset(0, 3).addBox(-0.5F, -3.4861F, 1.0556F, 1.0F, 0.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(25, 70).addBox(-1.0F, -3.4861F, 1.0556F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(14, 18).addBox(-1.0F, -4.3249F, 0.3086F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(8, 62).addBox(-1.5F, -3.3249F, 0.3086F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			ear_right = new ModelRenderer(this);
			ear_right.setRotationPoint(-2.05F, -8.3759F, -0.0848F);
			head.addChild(ear_right);
			setRotationAngle(ear_right, 0.1745F, 0.0F, -0.2094F);
			ear_right.setTextureOffset(28, 50).addBox(-1.5F, -4.571F, -1.0485F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			ear_right.setTextureOffset(41, 12).addBox(-0.5F, -5.571F, -0.5485F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			ear_right.setTextureOffset(6, 0).addBox(-0.5F, -0.571F, -0.5485F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			ear_right.setTextureOffset(45, 0).addBox(-1.0F, -4.571F, -0.5485F, 2.0F, 4.0F, 1.0F, 0.0F, true);
			skull = new ModelRenderer(this);
			skull.setRotationPoint(0.0F, 22.053F, -0.1333F);
			head.addChild(skull);
			skull.setTextureOffset(34, 51).addBox(-2.0F, -25.0F, -3.0F, 4.0F, 2.0F, 5.0F, 0.25F, false);
			skull.setTextureOffset(0, 38).addBox(-1.15F, -25.0F, -3.05F, 2.0F, 2.0F, 0.0F, 0.25F, false);
			skull.setTextureOffset(29, 0).addBox(-2.5F, -29.5F, -3.0F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			skull.setTextureOffset(71, 36).addBox(-2.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			skull.setTextureOffset(71, 36).addBox(0.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			head2 = new ModelRenderer(this);
			head2.setRotationPoint(0.0F, 3.2304F, -0.0968F);
			head.addChild(head2);
			head2.setTextureOffset(19, 12).addBox(0.5F, -11.4774F, -4.5366F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head2.setTextureOffset(19, 12).addBox(-1.5F, -11.4774F, -4.5366F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head2.setTextureOffset(14, 12).addBox(-4.5F, -13.4774F, -4.5366F, 9.0F, 2.0F, 9.0F, 0.0F, false);
			head2.setTextureOffset(68, 26).addBox(-4.3F, -12.4774F, -4.6366F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head2.setTextureOffset(68, 26).addBox(0.3F, -12.4774F, -4.6366F, 4.0F, 1.0F, 1.0F, 0.0F, true);
			head2.setTextureOffset(68, 26).addBox(0.6F, -12.4774F, -4.6366F, 4.0F, 1.0F, 1.0F, 0.0F, true);
			head2.setTextureOffset(68, 26).addBox(-4.6F, -12.4774F, -4.6366F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head2.setTextureOffset(68, 26).addBox(0.6F, -3.9774F, -6.6366F, 4.0F, 1.0F, 1.0F, 0.0F, true);
			head2.setTextureOffset(68, 26).addBox(-4.6F, -3.9774F, -6.6366F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head2.setTextureOffset(68, 26).addBox(-1.3F, -3.9774F, -6.6366F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head2.setTextureOffset(53, 8).addBox(-3.5F, -15.4774F, -3.5366F, 7.0F, 2.0F, 1.0F, 0.0F, false);
			head2.setTextureOffset(68, 23).addBox(-2.5F, -17.4774F, -3.5366F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			head2.setTextureOffset(0, 36).addBox(-4.5F, -11.4774F, -0.5366F, 9.0F, 8.0F, 5.0F, 0.0F, false);
			head2.setTextureOffset(29, 0).addBox(4.5F, -10.4774F, -0.5366F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			head2.setTextureOffset(29, 0).addBox(-5.5F, -10.4774F, -0.5366F, 1.0F, 3.0F, 2.0F, 0.0F, true);
			head2.setTextureOffset(0, 0).addBox(-4.5F, -3.9774F, -6.5366F, 9.0F, 1.0F, 11.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-2.3F, -11.9774F, -4.1366F);
			head2.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 1.5708F, 0.0F);
			head_r2.setTextureOffset(68, 26).addBox(-3.6F, -0.5F, -2.3F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-2.3F, -3.4774F, -6.1366F);
			head2.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 1.5708F, 0.0F);
			head_r3.setTextureOffset(68, 26).addBox(-3.6F, -0.5F, -2.3F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(2.3F, -3.4774F, -6.1366F);
			head2.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, -1.5708F, 0.0F);
			head_r4.setTextureOffset(68, 26).addBox(-0.4F, -0.5F, -2.3F, 4.0F, 1.0F, 1.0F, 0.0F, true);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(2.3F, -11.9774F, -4.1366F);
			head2.addChild(head_r5);
			setRotationAngle(head_r5, 0.0F, -1.5708F, 0.0F);
			head_r5.setTextureOffset(68, 26).addBox(-0.4F, -0.5F, -2.3F, 4.0F, 1.0F, 1.0F, 0.0F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 62).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(28, 37).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 8.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(56, 41).addBox(-3.5F, 0.75F, -2.75F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 49).addBox(-3.5F, 8.5F, -2.0F, 7.0F, 3.0F, 4.0F, 0.25F, false);
			body.setTextureOffset(65, 73).addBox(-3.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(73, 6).addBox(-3.0F, 4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(72, 46).addBox(-3.0F, 5.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(72, 40).addBox(1.0F, 5.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(72, 42).addBox(1.0F, 4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(72, 44).addBox(1.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(49, 37).addBox(-5.0F, 0.25F, -1.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(47, 51).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(52, 69).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			flesh_body = new ModelRenderer(this);
			flesh_body.setRotationPoint(0.0F, 22.0F, 0.0F);
			body.addChild(flesh_body);
			flesh_body.setTextureOffset(67, 15).addBox(-2.5F, -14.0F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_body.setTextureOffset(0, 7).addBox(-1.5F, -16.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_body.setTextureOffset(0, 7).addBox(-1.5F, -19.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_body.setTextureOffset(67, 15).addBox(-2.5F, -21.7F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
			body2 = new ModelRenderer(this);
			body2.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body2);
			body2.setTextureOffset(0, 56).addBox(-8.0F, -0.4F, -2.5F, 4.0F, 1.0F, 5.0F, 0.0F, false);
			body2.setTextureOffset(0, 56).addBox(4.0F, -0.4F, -2.5F, 4.0F, 1.0F, 5.0F, 0.0F, true);
			body2.setTextureOffset(34, 66).addBox(-2.5F, 2.0F, -3.25F, 5.0F, 5.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(0, 0).addBox(-2.5F, 0.0F, -3.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(0, 0).addBox(1.5F, 0.0F, -3.25F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			body2.setTextureOffset(26, 29).addBox(-1.5F, 0.0F, -3.25F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(8, 22).addBox(-0.5F, 1.0F, -3.45F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(8, 22).addBox(2.1F, 0.0F, -3.45F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(8, 22).addBox(-3.1F, 0.0F, -3.45F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			body2.setTextureOffset(0, 36).addBox(0.7F, 0.7F, -3.45F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body2.setTextureOffset(0, 36).addBox(-1.7F, 0.7F, -3.45F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			body2.setTextureOffset(50, 19).addBox(-4.0F, 8.4F, 2.0F, 8.0F, 8.0F, 1.0F, 0.25F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.9F, 0.85F, 0.0F);
			left_arm.setTextureOffset(0, 12).addBox(1.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(65, 28).addBox(0.6F, -0.6F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(58, 64).addBox(0.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(58, 64).addBox(0.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(62, 0).addBox(0.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(67, 52).addBox(0.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(68, 69).addBox(1.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			flesh_left_arm = new ModelRenderer(this);
			flesh_left_arm.setRotationPoint(-0.5F, 21.15F, 0.0F);
			left_arm.addChild(flesh_left_arm);
			flesh_left_arm.setTextureOffset(26, 58).addBox(1.6F, -21.5F, -1.0F, 2.0F, 10.0F, 2.0F, 0.2F, false);
			left_arm2 = new ModelRenderer(this);
			left_arm2.setRotationPoint(-0.4F, 0.0F, 0.0F);
			left_arm.addChild(left_arm2);
			left_arm2.setTextureOffset(0, 0).addBox(3.6F, 0.1F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			left_arm2.setTextureOffset(0, 12).addBox(3.6F, 4.6F, -6.0F, 1.0F, 12.0F, 12.0F, 0.0F, false);
			left_arm2.setTextureOffset(8, 12).addBox(3.7F, 6.15F, -5.5F, 1.0F, 9.0F, 1.0F, 0.0F, false);
			left_arm2.setTextureOffset(8, 12).addBox(3.7F, 6.15F, 4.5F, 1.0F, 9.0F, 1.0F, 0.0F, false);
			left_arm2.setTextureOffset(46, 58).addBox(3.7F, 7.15F, 2.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			left_arm2.setTextureOffset(46, 58).addBox(3.7F, 7.15F, -3.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			left_arm2.setTextureOffset(40, 0).addBox(3.7F, 5.15F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
			left_arm2.setTextureOffset(40, 0).addBox(3.7F, 15.15F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);
			left_arm2.setTextureOffset(53, 0).addBox(3.7F, 13.15F, -3.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			left_arm2.setTextureOffset(14, 12).addBox(3.7F, 9.15F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			left_arm2.setTextureOffset(53, 0).addBox(3.7F, 7.15F, -3.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			left_arm2.setTextureOffset(53, 4).addBox(3.6F, 16.6F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 58).addBox(3.6F, 18.6F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 58).addBox(3.6F, 21.6F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 61).addBox(3.6F, 20.6F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 61).addBox(3.6F, 19.6F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 58).addBox(3.6F, 17.6F, -5.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 58).addBox(3.6F, 21.6F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 61).addBox(3.6F, 20.6F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 61).addBox(3.6F, 19.6F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 58).addBox(3.6F, 18.6F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 58).addBox(3.6F, 17.6F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(53, 4).addBox(3.6F, 16.6F, 3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 58).addBox(3.6F, 21.6F, 0.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 61).addBox(3.6F, 20.6F, 0.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 61).addBox(3.6F, 19.6F, 0.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 58).addBox(3.6F, 18.6F, 0.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 58).addBox(3.6F, 17.6F, 0.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(53, 4).addBox(3.6F, 16.6F, 0.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 58).addBox(3.6F, 21.6F, -2.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 61).addBox(3.6F, 20.6F, -2.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 61).addBox(3.6F, 19.6F, -2.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 58).addBox(3.6F, 18.6F, -2.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(70, 58).addBox(3.6F, 17.6F, -2.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm2.setTextureOffset(53, 4).addBox(3.6F, 16.6F, -2.3F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.9F, 0.85F, 0.0F);
			right_arm.setTextureOffset(0, 12).addBox(-3.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(65, 28).addBox(-3.6F, -0.6F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(58, 64).addBox(-3.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(58, 64).addBox(-3.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(62, 0).addBox(-3.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(67, 52).addBox(-3.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, true);
			right_arm.setTextureOffset(68, 69).addBox(-3.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, true);
			flesh_right_arm = new ModelRenderer(this);
			flesh_right_arm.setRotationPoint(0.5F, 21.15F, 0.0F);
			right_arm.addChild(flesh_right_arm);
			flesh_right_arm.setTextureOffset(26, 58).addBox(-3.6F, -21.5F, -1.0F, 2.0F, 10.0F, 2.0F, 0.2F, true);
			right_arm2 = new ModelRenderer(this);
			right_arm2.setRotationPoint(0.4F, 0.0F, 0.0F);
			right_arm.addChild(right_arm2);
			right_arm2.setTextureOffset(0, 0).addBox(-4.6F, 0.1F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(50, 56).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(58, 56).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(26, 23).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(34, 58).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.25F, false);
			left_leg.setTextureOffset(66, 8).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_leg.setTextureOffset(16, 50).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			flesh_left_leg = new ModelRenderer(this);
			flesh_left_leg.setRotationPoint(-2.0F, 10.7083F, 0.1667F);
			left_leg.addChild(flesh_left_leg);
			flesh_left_leg.setTextureOffset(18, 58).addBox(1.0F, -10.75F, -1.0F, 2.0F, 11.0F, 2.0F, 0.2F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(50, 56).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(58, 56).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(26, 23).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, true);
			right_leg.setTextureOffset(34, 58).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.25F, true);
			right_leg.setTextureOffset(66, 8).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 3.0F, 0.25F, true);
			right_leg.setTextureOffset(16, 50).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, true);
			flesh_right_leg = new ModelRenderer(this);
			flesh_right_leg.setRotationPoint(2.0F, 10.7083F, 0.1667F);
			right_leg.addChild(flesh_right_leg);
			flesh_right_leg.setTextureOffset(18, 58).addBox(-3.0F, -10.75F, -1.0F, 2.0F, 11.0F, 2.0F, 0.2F, true);
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
