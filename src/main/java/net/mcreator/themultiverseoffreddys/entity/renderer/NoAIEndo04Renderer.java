
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

import net.mcreator.themultiverseoffreddys.entity.NoAIEndo04Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NoAIEndo04Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NoAIEndo04Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelNightmareEndo(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/nightmareendo.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.3.0
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelNightmareEndo extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer mouth;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer left_leg2;
		private final ModelRenderer left_upper_leg2;
		private final ModelRenderer left_lower_leg2;
		private final ModelRenderer left_foot2;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_upper_arm;
		private final ModelRenderer left_lower_arm;
		private final ModelRenderer left_hand;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_upper_arm;
		private final ModelRenderer right_lower_arm;
		private final ModelRenderer right_hand;
		private final ModelRenderer left_leg;
		private final ModelRenderer left_upper_leg;
		private final ModelRenderer left_lower_leg;
		private final ModelRenderer lower5_r1;
		private final ModelRenderer left_foot;
		private final ModelRenderer lower4_r1;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_upper_leg;
		private final ModelRenderer right_lower_leg;
		private final ModelRenderer lower6_r1;
		private final ModelRenderer right_foot;
		private final ModelRenderer lower5_r2;

		public ModelNightmareEndo() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -17.375F, 1.625F);
			head.setTextureOffset(0, 0).addBox(-3.5F, -6.625F, -7.125F, 7.0F, 5.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(37, 30).addBox(-2.75F, -4.625F, -8.125F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(6, 37).addBox(4.0F, -1.625F, -1.625F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(6, 37).addBox(4.0F, 1.375F, -1.625F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(38, 46).addBox(4.0F, -1.625F, -1.625F, 1.0F, 4.0F, 1.0F, -0.8F, false);
			head.setTextureOffset(6, 37).addBox(-5.0F, 1.375F, -1.625F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(38, 46).addBox(-5.0F, -1.625F, -1.625F, 1.0F, 4.0F, 1.0F, -0.8F, true);
			head.setTextureOffset(6, 37).addBox(-5.0F, -1.625F, -1.625F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(25, 31).addBox(0.75F, -4.625F, -8.125F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 19).addBox(-4.0F, -0.625F, -7.625F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(16, 12).addBox(3.0F, -0.625F, -7.625F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(45, 31).addBox(-3.0F, -0.625F, -7.625F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(10, 30).addBox(-4.0F, -1.625F, -7.625F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(26, 4).addBox(3.0F, -1.625F, -7.625F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(50, 18).addBox(-3.0F, -1.625F, -7.625F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(49, 39).addBox(-3.0F, -1.625F, -0.625F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			mouth = new ModelRenderer(this);
			mouth.setRotationPoint(0.0F, 2.0564F, -3.9601F);
			head.addChild(mouth);
			setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
			mouth.setTextureOffset(0, 28).addBox(-4.0F, -0.0714F, -3.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(26, 13).addBox(3.0F, -0.0714F, -3.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(54, 26).addBox(-3.0F, -0.0714F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(53, 13).addBox(-3.0F, -0.0714F, 3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(20, 22).addBox(-4.0F, -1.0714F, -3.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(48, 6).addBox(-3.0F, -1.0714F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(10, 21).addBox(3.0F, -1.0714F, -3.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(28, 42).addBox(-1.5F, -6.0F, -2.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 58).addBox(-4.5F, -8.0F, -2.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(34, 60).addBox(1.5F, -8.0F, -2.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 56).addBox(1.5F, -11.5F, -2.6F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 56).addBox(1.5F, -11.5F, -0.4F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 56).addBox(-4.5F, -11.5F, -0.4F, 3.0F, 3.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(36, 56).addBox(-4.5F, -11.5F, -2.6F, 3.0F, 3.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(36, 56).addBox(-1.5F, -8.0F, -1.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 56).addBox(-1.5F, -8.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(52, 58).addBox(-4.5F, -8.0F, 0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(40, 34).addBox(-1.5F, -6.0F, 0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 59).addBox(1.5F, -8.0F, 0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(38, 47).addBox(1.5F, -5.0F, -2.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(12, 47).addBox(-3.5F, -5.0F, -2.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(37, 27).addBox(-6.0F, -8.0F, -3.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(48, 1).addBox(-6.0F, -12.0F, -2.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(26, 54).addBox(-3.0F, -12.0F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(20, 47).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(8, 61).addBox(-6.0F, -12.0F, -3.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 13).addBox(-6.0F, -12.0F, 1.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 13).addBox(5.0F, -8.0F, -3.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(4.0F, -12.0F, -3.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(45, 42).addBox(4.0F, -12.0F, -2.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(28, 7).addBox(4.0F, -12.0F, 1.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(48, 0).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(16, 40).addBox(-4.0F, -9.0F, -3.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(8, 56).addBox(2.0F, -12.0F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(14, 56).addBox(2.0F, -12.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 10).addBox(-4.0F, -9.0F, 1.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(30, 22).addBox(2.0F, -12.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 5).addBox(-3.0F, -12.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(58, 49).addBox(-2.0F, -12.0F, 1.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 12).addBox(-4.5F, 0.5F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(16, 42).addBox(-2.5F, 0.5F, -1.5F, 5.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(30, 27).addBox(-1.5F, 3.5F, -1.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(8, 39).addBox(-1.0F, -9.5F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(20, 35).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 37).addBox(-1.0F, -19.25F, 1.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(26, 59).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(21, 0).addBox(-3.0F, -11.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(51, 20).addBox(3.0F, -10.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(51, 20).addBox(-9.0F, -10.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, true);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(-2.182F, 2.6464F, -0.5F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 0.0F, -0.6109F);
			body_r1.setTextureOffset(49, 51).addBox(1.5858F, -8.1464F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, true);
			body_r1.setTextureOffset(58, 37).addBox(-2.4142F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(2.182F, 2.6464F, -0.5F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, 0.0F, 0.6109F);
			body_r2.setTextureOffset(49, 51).addBox(-7.5858F, -8.1464F, -0.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body_r2.setTextureOffset(58, 37).addBox(-0.5858F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg2 = new ModelRenderer(this);
			left_leg2.setRotationPoint(3.7F, 4.0F, -0.5F);
			body.addChild(left_leg2);
			left_upper_leg2 = new ModelRenderer(this);
			left_upper_leg2.setRotationPoint(-4.5F, 20.0F, 0.5F);
			left_leg2.addChild(left_upper_leg2);
			left_lower_leg2 = new ModelRenderer(this);
			left_lower_leg2.setRotationPoint(-4.5F, 20.0F, 0.5F);
			left_leg2.addChild(left_lower_leg2);
			left_foot2 = new ModelRenderer(this);
			left_foot2.setRotationPoint(0.0F, 0.0F, 0.0F);
			left_lower_leg2.addChild(left_foot2);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(8.0F, -10.0F, -0.5F);
			left_upper_arm = new ModelRenderer(this);
			left_upper_arm.setRotationPoint(0.5F, 1.175F, 0.0F);
			left_arm.addChild(left_upper_arm);
			left_upper_arm.setTextureOffset(29, 4).addBox(0.5F, 1.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(35, 0).addBox(0.5F, 0.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(29, 4).addBox(0.5F, 4.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(35, 0).addBox(0.5F, 3.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(35, 0).addBox(0.5F, 2.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(29, 4).addBox(0.5F, 3.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(35, 0).addBox(0.5F, 1.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(29, 4).addBox(0.5F, 2.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(29, 4).addBox(0.5F, 1.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(35, 0).addBox(0.5F, 0.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(29, 4).addBox(0.5F, 4.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(35, 0).addBox(0.5F, 3.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(35, 0).addBox(0.5F, 2.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(29, 4).addBox(0.5F, 3.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(35, 0).addBox(0.5F, 1.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(29, 4).addBox(0.5F, 2.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(10, 19).addBox(0.0F, 0.325F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(26, 13).addBox(-0.5F, -0.175F, -3.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(20, 22).addBox(-0.5F, -0.175F, 2.0F, 3.0F, 6.0F, 1.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(10, 30).addBox(0.0F, 4.825F, -1.0F, 2.0F, 3.0F, 2.0F, -0.1F, false);
			left_upper_arm.setTextureOffset(44, 12).addBox(-0.5F, -2.675F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_upper_arm.setTextureOffset(46, 47).addBox(-0.5F, -2.925F, -1.5F, 3.0F, 1.0F, 3.0F, 0.25F, false);
			left_upper_arm.setTextureOffset(20, 31).addBox(1.5F, -1.925F, -1.5F, 1.0F, 1.0F, 3.0F, 0.25F, false);
			left_lower_arm = new ModelRenderer(this);
			left_lower_arm.setRotationPoint(1.5F, 8.0F, 0.0F);
			left_arm.addChild(left_lower_arm);
			left_lower_arm.setTextureOffset(0, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			left_lower_arm.setTextureOffset(28, 31).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_lower_arm.setTextureOffset(10, 30).addBox(-1.0F, 5.5F, -1.0F, 2.0F, 3.0F, 2.0F, -0.1F, false);
			left_hand = new ModelRenderer(this);
			left_hand.setRotationPoint(0.0F, 7.4333F, 0.1667F);
			left_lower_arm.addChild(left_hand);
			left_hand.setTextureOffset(42, 20).addBox(-1.5F, 0.0667F, -1.6667F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_hand.setTextureOffset(0, 28).addBox(0.5F, 3.0667F, -1.6667F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			left_hand.setTextureOffset(32, 55).addBox(-1.5F, 3.0667F, -1.6667F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-8.0F, -10.0F, -0.5F);
			right_upper_arm = new ModelRenderer(this);
			right_upper_arm.setRotationPoint(-0.5F, 1.175F, 0.0F);
			right_arm.addChild(right_upper_arm);
			right_upper_arm.setTextureOffset(29, 4).addBox(-1.5F, 1.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(35, 0).addBox(-1.5F, 0.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(29, 4).addBox(-1.5F, 4.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(35, 0).addBox(-1.5F, 3.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(35, 0).addBox(-1.5F, 2.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(29, 4).addBox(-1.5F, 3.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(35, 0).addBox(-1.5F, 1.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(29, 4).addBox(-1.5F, 2.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(29, 4).addBox(-1.5F, 1.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(35, 0).addBox(-1.5F, 0.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(29, 4).addBox(-1.5F, 4.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(35, 0).addBox(-1.5F, 3.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(35, 0).addBox(-1.5F, 2.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(29, 4).addBox(-1.5F, 3.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(35, 0).addBox(-1.5F, 1.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(29, 4).addBox(-1.5F, 2.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(10, 19).addBox(-2.0F, 0.325F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(26, 13).addBox(-2.5F, -0.175F, -3.0F, 3.0F, 6.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(20, 22).addBox(-2.5F, -0.175F, 2.0F, 3.0F, 6.0F, 1.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(10, 30).addBox(-2.0F, 4.825F, -1.0F, 2.0F, 3.0F, 2.0F, -0.1F, true);
			right_upper_arm.setTextureOffset(44, 12).addBox(-2.5F, -2.675F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
			right_upper_arm.setTextureOffset(46, 47).addBox(-2.5F, -2.925F, -1.5F, 3.0F, 1.0F, 3.0F, 0.25F, true);
			right_upper_arm.setTextureOffset(20, 31).addBox(-2.5F, -1.925F, -1.5F, 1.0F, 1.0F, 3.0F, 0.25F, true);
			right_lower_arm = new ModelRenderer(this);
			right_lower_arm.setRotationPoint(-1.5F, 8.0F, 0.0F);
			right_arm.addChild(right_lower_arm);
			right_lower_arm.setTextureOffset(0, 19).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);
			right_lower_arm.setTextureOffset(28, 31).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
			right_lower_arm.setTextureOffset(10, 30).addBox(-1.0F, 5.5F, -1.0F, 2.0F, 3.0F, 2.0F, -0.1F, true);
			right_hand = new ModelRenderer(this);
			right_hand.setRotationPoint(0.0F, 7.4333F, 0.1667F);
			right_lower_arm.addChild(right_hand);
			right_hand.setTextureOffset(42, 20).addBox(-1.5F, 0.0667F, -1.6667F, 3.0F, 3.0F, 3.0F, 0.0F, true);
			right_hand.setTextureOffset(0, 28).addBox(-1.5F, 3.0667F, -1.6667F, 1.0F, 3.0F, 3.0F, 0.0F, true);
			right_hand.setTextureOffset(32, 55).addBox(0.5F, 3.0667F, -1.6667F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.9F, 4.0F, -0.5F);
			left_leg.setTextureOffset(58, 28).addBox(-1.0F, 8.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(18, 58).addBox(-1.0F, 17.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(44, 57).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_upper_leg = new ModelRenderer(this);
			left_upper_leg.setRotationPoint(-4.5F, 20.0F, 0.5F);
			left_leg.addChild(left_upper_leg);
			left_upper_leg.setTextureOffset(56, 0).addBox(3.0F, -12.75F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
			left_upper_leg.setTextureOffset(37, 37).addBox(3.0F, -18.5F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_upper_leg.setTextureOffset(55, 45).addBox(3.0F, -14.25F, -2.0F, 3.0F, 1.0F, 3.0F, 0.25F, false);
			left_upper_leg.setTextureOffset(36, 5).addBox(2.5F, -14.5F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_upper_leg.setTextureOffset(36, 0).addBox(2.5F, -16.25F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_upper_leg.setTextureOffset(30, 22).addBox(2.5F, -18.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_upper_leg.setTextureOffset(55, 33).addBox(3.0F, -18.25F, -2.0F, 3.0F, 1.0F, 3.0F, 0.25F, false);
			left_upper_leg.setTextureOffset(46, 34).addBox(3.0F, -19.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			left_lower_leg = new ModelRenderer(this);
			left_lower_leg.setRotationPoint(-4.5F, 20.0F, 0.5F);
			left_leg.addChild(left_lower_leg);
			left_lower_leg.setTextureOffset(53, 54).addBox(3.0F, -10.75F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
			left_lower_leg.setTextureOffset(30, 44).addBox(3.5F, -10.0F, -1.5F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			left_lower_leg.setTextureOffset(54, 22).addBox(3.0F, -4.25F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
			left_lower_leg.setTextureOffset(18, 54).addBox(3.0F, -7.9F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
			left_lower_leg.setTextureOffset(44, 53).addBox(3.0F, -8.8F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
			left_lower_leg.setTextureOffset(53, 41).addBox(3.0F, -9.6F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
			left_lower_leg.setTextureOffset(53, 9).addBox(3.0F, -6.3F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
			left_lower_leg.setTextureOffset(35, 52).addBox(3.0F, -5.5F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
			left_lower_leg.setTextureOffset(9, 52).addBox(3.0F, -7.1F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
			left_lower_leg.setTextureOffset(0, 51).addBox(3.0F, -10.25F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
			left_lower_leg.setTextureOffset(21, 50).addBox(3.0F, -4.75F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
			left_lower_leg.setTextureOffset(21, 4).addBox(3.0F, -1.0F, -4.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			lower5_r1 = new ModelRenderer(this);
			lower5_r1.setRotationPoint(4.5F, -1.4062F, -3.3304F);
			left_lower_leg.addChild(lower5_r1);
			setRotationAngle(lower5_r1, 0.3054F, 0.0F, 0.0F);
			lower5_r1.setTextureOffset(0, 34).addBox(-1.5F, -0.1188F, 0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			left_foot = new ModelRenderer(this);
			left_foot.setRotationPoint(0.0F, 0.0F, 0.0F);
			left_lower_leg.addChild(left_foot);
			left_foot.setTextureOffset(45, 26).addBox(3.0F, -2.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			left_foot.setTextureOffset(56, 15).addBox(2.5F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			left_foot.setTextureOffset(32, 53).addBox(4.25F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			left_foot.setTextureOffset(0, 5).addBox(2.75F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			lower4_r1 = new ModelRenderer(this);
			lower4_r1.setRotationPoint(4.5F, -1.4062F, -3.3304F);
			left_foot.addChild(lower4_r1);
			setRotationAngle(lower4_r1, 0.3054F, 0.0F, 0.0F);
			lower4_r1.setTextureOffset(0, 55).addBox(-1.5F, -0.1188F, -1.7F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.9F, 4.0F, -0.5F);
			right_leg.setTextureOffset(58, 28).addBox(-1.0F, 8.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(18, 58).addBox(-1.0F, 17.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(44, 57).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			right_upper_leg = new ModelRenderer(this);
			right_upper_leg.setRotationPoint(4.5F, 20.0F, 0.5F);
			right_leg.addChild(right_upper_leg);
			right_upper_leg.setTextureOffset(56, 0).addBox(-6.0F, -12.75F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
			right_upper_leg.setTextureOffset(37, 37).addBox(-6.0F, -18.5F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, true);
			right_upper_leg.setTextureOffset(55, 45).addBox(-6.0F, -14.25F, -2.0F, 3.0F, 1.0F, 3.0F, 0.25F, true);
			right_upper_leg.setTextureOffset(36, 5).addBox(-6.5F, -14.5F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, true);
			right_upper_leg.setTextureOffset(36, 0).addBox(-6.5F, -16.25F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, true);
			right_upper_leg.setTextureOffset(30, 22).addBox(-6.5F, -18.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, true);
			right_upper_leg.setTextureOffset(55, 33).addBox(-6.0F, -18.25F, -2.0F, 3.0F, 1.0F, 3.0F, 0.25F, true);
			right_upper_leg.setTextureOffset(46, 34).addBox(-6.0F, -19.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);
			right_lower_leg = new ModelRenderer(this);
			right_lower_leg.setRotationPoint(4.5F, 20.0F, 0.5F);
			right_leg.addChild(right_lower_leg);
			right_lower_leg.setTextureOffset(53, 54).addBox(-6.0F, -10.75F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
			right_lower_leg.setTextureOffset(30, 44).addBox(-5.5F, -10.0F, -1.5F, 2.0F, 7.0F, 2.0F, 0.0F, true);
			right_lower_leg.setTextureOffset(54, 22).addBox(-6.0F, -4.25F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
			right_lower_leg.setTextureOffset(18, 54).addBox(-6.0F, -7.9F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
			right_lower_leg.setTextureOffset(44, 53).addBox(-6.0F, -8.8F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
			right_lower_leg.setTextureOffset(53, 41).addBox(-6.0F, -9.6F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
			right_lower_leg.setTextureOffset(53, 9).addBox(-6.0F, -6.3F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
			right_lower_leg.setTextureOffset(35, 52).addBox(-6.0F, -5.5F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
			right_lower_leg.setTextureOffset(9, 52).addBox(-6.0F, -7.1F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
			right_lower_leg.setTextureOffset(0, 51).addBox(-6.0F, -10.25F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
			right_lower_leg.setTextureOffset(21, 50).addBox(-6.0F, -4.75F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
			right_lower_leg.setTextureOffset(21, 4).addBox(-6.0F, -1.0F, -4.0F, 3.0F, 1.0F, 2.0F, 0.0F, true);
			lower6_r1 = new ModelRenderer(this);
			lower6_r1.setRotationPoint(-4.5F, -1.4062F, -3.3304F);
			right_lower_leg.addChild(lower6_r1);
			setRotationAngle(lower6_r1, 0.3054F, 0.0F, 0.0F);
			lower6_r1.setTextureOffset(0, 34).addBox(-1.5F, -0.1188F, 0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			right_foot = new ModelRenderer(this);
			right_foot.setRotationPoint(0.0F, 0.0F, 0.0F);
			right_lower_leg.addChild(right_foot);
			right_foot.setTextureOffset(45, 26).addBox(-6.0F, -2.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);
			right_foot.setTextureOffset(56, 15).addBox(-6.5F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, true);
			right_foot.setTextureOffset(32, 53).addBox(-6.25F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			right_foot.setTextureOffset(0, 5).addBox(-4.75F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
			lower5_r2 = new ModelRenderer(this);
			lower5_r2.setRotationPoint(-4.5F, -1.4062F, -3.3304F);
			right_foot.addChild(lower5_r2);
			setRotationAngle(lower5_r2, 0.3054F, 0.0F, 0.0F);
			lower5_r2.setTextureOffset(0, 55).addBox(-1.5F, -0.1188F, -1.7F, 3.0F, 1.0F, 3.0F, 0.0F, true);
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
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
