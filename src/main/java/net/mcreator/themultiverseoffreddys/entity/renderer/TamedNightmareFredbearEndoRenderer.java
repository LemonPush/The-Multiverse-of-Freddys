
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

import net.mcreator.themultiverseoffreddys.entity.TamedNightmareFredbearEndoEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedNightmareFredbearEndoRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedNightmareFredbearEndoEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelNightmareFredbearEndo(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/nightmarefredbearendo.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelNightmareFredbearEndo extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer endo_head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer mouth;
		private final ModelRenderer body;
		private final ModelRenderer endo_body;
		private final ModelRenderer right_arm;
		private final ModelRenderer endo_arm3;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer left_arm;
		private final ModelRenderer endo_arm2;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer right_leg;
		private final ModelRenderer endo_leg;
		private final ModelRenderer left_leg;
		private final ModelRenderer endo_leg2;

		public ModelNightmareFredbearEndo() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -16.0F, 4.0F);
			endo_head = new ModelRenderer(this);
			endo_head.setRotationPoint(0.0F, -5.0F, -1.0F);
			head.addChild(endo_head);
			endo_head.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, -9.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
			endo_head.setTextureOffset(33, 51).addBox(-3.0F, -5.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			endo_head.setTextureOffset(28, 20).addBox(4.0F, -2.3F, -3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			endo_head.setTextureOffset(0, 13).addBox(-5.0F, -2.3F, -3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			endo_head.setTextureOffset(12, 49).addBox(1.0F, -5.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			endo_head.setTextureOffset(0, 28).addBox(-4.0F, 0.5F, -10.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			endo_head.setTextureOffset(24, 20).addBox(-4.0F, -0.5F, -10.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			endo_head.setTextureOffset(0, 19).addBox(-4.0F, -2.0F, -9.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-7.5F, -8.5F, -5.0F);
			endo_head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, -0.7418F);
			head_r1.setTextureOffset(0, 28).addBox(0.75F, -0.5F, -1.0F, 2.0F, 6.0F, 2.0F, -0.1F, true);
			head_r1.setTextureOffset(56, 4).addBox(-0.25F, -4.0F, -1.0F, 4.0F, 4.0F, 2.0F, -0.1F, true);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(7.5F, -8.5F, -5.0F);
			endo_head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.7418F);
			head_r2.setTextureOffset(56, 4).addBox(-3.75F, -4.0F, -1.0F, 4.0F, 4.0F, 2.0F, -0.1F, false);
			head_r2.setTextureOffset(0, 28).addBox(-2.75F, -0.5F, -1.0F, 2.0F, 6.0F, 2.0F, -0.1F, false);
			mouth = new ModelRenderer(this);
			mouth.setRotationPoint(0.0F, 3.0F, -4.0F);
			endo_head.addChild(mouth);
			setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
			mouth.setTextureOffset(24, 11).addBox(-4.0F, -1.0F, -6.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(24, 20).addBox(-4.0F, 0.0F, -6.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			endo_body = new ModelRenderer(this);
			endo_body.setRotationPoint(0.0F, -24.0F, 0.0F);
			body.addChild(endo_body);
			endo_body.setTextureOffset(42, 33).addBox(-4.5F, -8.0F, 1.5F, 9.0F, 3.0F, 0.0F, 0.0F, false);
			endo_body.setTextureOffset(60, 1).addBox(-4.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
			endo_body.setTextureOffset(0, 23).addBox(-1.5F, -6.0F, -2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			endo_body.setTextureOffset(59, 40).addBox(1.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
			endo_body.setTextureOffset(24, 25).addBox(4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			endo_body.setTextureOffset(38, 29).addBox(-4.5F, -5.0F, -2.5F, 9.0F, 0.0F, 4.0F, 0.0F, false);
			endo_body.setTextureOffset(0, 13).addBox(-6.0F, -8.0F, -3.5F, 12.0F, 0.0F, 6.0F, 0.0F, false);
			endo_body.setTextureOffset(20, 20).addBox(2.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			endo_body.setTextureOffset(0, 19).addBox(5.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			endo_body.setTextureOffset(18, 20).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			endo_body.setTextureOffset(0, 0).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			endo_body.setTextureOffset(41, 36).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
			endo_body.setTextureOffset(31, 29).addBox(-2.0F, -12.0F, 1.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
			endo_body.setTextureOffset(24, 0).addBox(-4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			endo_body.setTextureOffset(2, 49).addBox(2.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			endo_body.setTextureOffset(0, 49).addBox(5.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			endo_body.setTextureOffset(58, 0).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			endo_body.setTextureOffset(35, 43).addBox(-2.0F, -9.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			endo_body.setTextureOffset(24, 26).addBox(3.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			endo_body.setTextureOffset(48, 11).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			endo_body.setTextureOffset(0, 24).addBox(-5.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			endo_body.setTextureOffset(48, 20).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			endo_body.setTextureOffset(35, 39).addBox(-6.0F, -12.0F, 2.5F, 12.0F, 4.0F, 0.0F, 0.0F, false);
			endo_body.setTextureOffset(23, 36).addBox(6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			endo_body.setTextureOffset(24, 3).addBox(6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			endo_body.setTextureOffset(0, 22).addBox(6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			endo_body.setTextureOffset(30, 12).addBox(6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			endo_body.setTextureOffset(4, 12).addBox(-6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			endo_body.setTextureOffset(0, 3).addBox(-6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			endo_body.setTextureOffset(4, 16).addBox(-6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			endo_body.setTextureOffset(0, 21).addBox(-6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			endo_body.setTextureOffset(32, 4).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
			endo_body.setTextureOffset(60, 10).addBox(-5.5F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			endo_body.setTextureOffset(8, 60).addBox(3.5F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			endo_body.setTextureOffset(36, 54).addBox(-1.0F, -9.0F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			endo_body.setTextureOffset(49, 36).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			endo_body.setTextureOffset(16, 51).addBox(-1.0F, -22.0F, 2.5F, 2.0F, 13.0F, 2.0F, 0.0F, false);
			endo_body.setTextureOffset(24, 32).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			endo_body.setTextureOffset(24, 0).addBox(-8.0F, -11.0F, -1.5F, 16.0F, 2.0F, 2.0F, 0.0F, false);
			endo_body.setTextureOffset(56, 47).addBox(9.0F, -11.0F, -1.5F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			endo_body.setTextureOffset(56, 47).addBox(-13.0F, -11.0F, -1.5F, 4.0F, 2.0F, 2.0F, 0.0F, true);
			endo_body.setTextureOffset(55, 19).addBox(-11.0F, -11.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			endo_body.setTextureOffset(55, 19).addBox(8.0F, -11.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, true);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-10.0F, -10.0F, 0.0F);
			endo_arm3 = new ModelRenderer(this);
			endo_arm3.setRotationPoint(-1.0F, 0.0F, 0.0F);
			right_arm.addChild(endo_arm3);
			setRotationAngle(endo_arm3, 0.0F, 0.0F, 0.3927F);
			endo_arm3.setTextureOffset(24, 51).addBox(-3.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			endo_arm3.setTextureOffset(0, 20).addBox(-2.5F, -0.85F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			endo_arm3.setTextureOffset(0, 20).addBox(-2.5F, 0.95F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			endo_arm3.setTextureOffset(0, 20).addBox(-2.5F, 2.65F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			endo_arm3.setTextureOffset(0, 20).addBox(-2.5F, 4.45F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			endo_arm3.setTextureOffset(0, 20).addBox(-2.5F, 4.45F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			endo_arm3.setTextureOffset(0, 20).addBox(-2.5F, 2.65F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			endo_arm3.setTextureOffset(0, 20).addBox(-2.5F, 0.95F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			endo_arm3.setTextureOffset(0, 20).addBox(-2.5F, -0.85F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
			endo_arm3.setTextureOffset(0, 0).addBox(-3.5F, -1.2F, -2.9F, 3.0F, 7.0F, 0.0F, 0.0F, false);
			endo_arm3.setTextureOffset(0, 0).addBox(-3.5F, -1.2F, 1.9F, 3.0F, 7.0F, 0.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(7.0F, 14.8F, 1.0F);
			endo_arm3.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.1345F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(48, 20).addBox(-11.5F, 9.35F, -9.85F, 1.0F, 3.0F, 5.0F, -0.1F, false);
			right_arm_r1.setTextureOffset(44, 54).addBox(-11.5F, 12.25F, -9.85F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 40).addBox(-7.5F, 11.25F, -9.85F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 37).addBox(-7.5F, 9.35F, -9.85F, 1.0F, 2.0F, 1.0F, -0.1F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-2.0F, 8.3F, 0.5F);
			endo_arm3.addChild(cube_r1);
			setRotationAngle(cube_r1, -1.1345F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(15, 37).addBox(-1.0F, 6.55F, -2.2F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(48, 11).addBox(-2.0F, 8.45F, -3.2F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			cube_r1.setTextureOffset(53, 51).addBox(-1.5F, 1.55F, -2.75F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-2.0F, 6.3F, -0.5F);
			endo_arm3.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.48F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(59, 34).addBox(-1.0F, -1.2F, -1.1F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(10.0F, -10.0F, 0.0F);
			endo_arm2 = new ModelRenderer(this);
			endo_arm2.setRotationPoint(1.0F, 0.0F, 0.0F);
			left_arm.addChild(endo_arm2);
			setRotationAngle(endo_arm2, 0.0F, 0.0F, -0.3927F);
			endo_arm2.setTextureOffset(24, 51).addBox(0.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
			endo_arm2.setTextureOffset(0, 20).addBox(1.5F, -0.85F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			endo_arm2.setTextureOffset(0, 20).addBox(1.5F, 0.95F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			endo_arm2.setTextureOffset(0, 20).addBox(1.5F, 2.65F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			endo_arm2.setTextureOffset(0, 20).addBox(1.5F, 4.45F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			endo_arm2.setTextureOffset(0, 20).addBox(1.5F, 4.45F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			endo_arm2.setTextureOffset(0, 20).addBox(1.5F, 2.65F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			endo_arm2.setTextureOffset(0, 20).addBox(1.5F, 0.95F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			endo_arm2.setTextureOffset(0, 20).addBox(1.5F, -0.85F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			endo_arm2.setTextureOffset(0, 0).addBox(0.5F, -1.2F, -2.9F, 3.0F, 7.0F, 0.0F, 0.0F, true);
			endo_arm2.setTextureOffset(0, 0).addBox(0.5F, -1.2F, 1.9F, 3.0F, 7.0F, 0.0F, 0.0F, true);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-7.0F, 14.8F, 1.0F);
			endo_arm2.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.1345F, 0.0F, 0.0F);
			right_arm_r2.setTextureOffset(48, 20).addBox(10.5F, 9.35F, -9.85F, 1.0F, 3.0F, 5.0F, -0.1F, true);
			right_arm_r2.setTextureOffset(44, 54).addBox(10.5F, 12.25F, -9.85F, 1.0F, 1.0F, 5.0F, 0.0F, true);
			right_arm_r2.setTextureOffset(0, 40).addBox(6.5F, 11.25F, -9.85F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm_r2.setTextureOffset(0, 37).addBox(6.5F, 9.35F, -9.85F, 1.0F, 2.0F, 1.0F, -0.1F, true);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(2.0F, 8.3F, 0.5F);
			endo_arm2.addChild(cube_r3);
			setRotationAngle(cube_r3, -1.1345F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(15, 37).addBox(-1.0F, 6.55F, -2.2F, 2.0F, 3.0F, 2.0F, 0.0F, true);
			cube_r3.setTextureOffset(48, 11).addBox(-2.0F, 8.45F, -3.2F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			cube_r3.setTextureOffset(53, 51).addBox(-1.5F, 1.55F, -2.75F, 3.0F, 5.0F, 3.0F, 0.0F, true);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(2.0F, 6.3F, -0.5F);
			endo_arm2.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.48F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(59, 34).addBox(-1.0F, -1.2F, -1.1F, 2.0F, 4.0F, 2.0F, 0.0F, true);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-4.1F, 3.0F, 0.0F);
			endo_leg = new ModelRenderer(this);
			endo_leg.setRotationPoint(4.0F, 5.0F, 0.0F);
			right_leg.addChild(endo_leg);
			endo_leg.setTextureOffset(0, 49).addBox(-6.4F, 5.0F, -2.5F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			endo_leg.setTextureOffset(60, 25).addBox(-5.4F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			endo_leg.setTextureOffset(20, 39).addBox(-6.9F, -3.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			endo_leg.setTextureOffset(44, 60).addBox(-5.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			endo_leg.setTextureOffset(25, 30).addBox(-6.9F, 13.75F, -5.0F, 5.0F, 2.0F, 7.0F, 0.25F, false);
			endo_leg.setTextureOffset(52, 43).addBox(-6.9F, 15.0F, -8.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(4.1F, 3.0F, 0.0F);
			endo_leg2 = new ModelRenderer(this);
			endo_leg2.setRotationPoint(-2.1F, 17.0F, 0.0F);
			left_leg.addChild(endo_leg2);
			endo_leg2.setTextureOffset(40, 43).addBox(0.5F, -7.0F, -2.5F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			endo_leg2.setTextureOffset(0, 60).addBox(1.5F, -10.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			endo_leg2.setTextureOffset(54, 59).addBox(1.5F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			endo_leg2.setTextureOffset(0, 37).addBox(0.0F, -15.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			endo_leg2.setTextureOffset(25, 30).addBox(0.0F, 1.75F, -5.0F, 5.0F, 2.0F, 7.0F, 0.25F, true);
			endo_leg2.setTextureOffset(52, 43).addBox(0.0F, 3.0F, -8.0F, 5.0F, 1.0F, 3.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
