
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

import net.mcreator.themultiverseoffreddys.entity.NightmareSpringBonnieEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NightmareSpringBonnieRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NightmareSpringBonnieEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelNightmareSpringBonnie(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/nightmarespringbonnie.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelNightmareSpringBonnie extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer head_r6;
		private final ModelRenderer head_r7;
		private final ModelRenderer head_r8;
		private final ModelRenderer mouth;
		private final ModelRenderer FredbearBody;
		private final ModelRenderer body;
		private final ModelRenderer FrebearRightArm;
		private final ModelRenderer freddyarm;
		private final ModelRenderer right_arm;
		private final ModelRenderer cube_r1;
		private final ModelRenderer lowerarm;
		private final ModelRenderer FrebearLeftArm;
		private final ModelRenderer freddyarm2;
		private final ModelRenderer left_arm;
		private final ModelRenderer cube_r2;
		private final ModelRenderer lowerarm2;
		private final ModelRenderer right_leg;
		private final ModelRenderer lower;
		private final ModelRenderer left_leg;
		private final ModelRenderer lower2;

		public ModelNightmareSpringBonnie() {
			textureWidth = 256;
			textureHeight = 256;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -21.0F, 4.0F);
			head.setTextureOffset(44, 64).addBox(-6.0F, -7.0F, -11.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(78, 36).addBox(-6.0F, -7.0F, -1.0F, 12.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(92, 80).addBox(-4.0F, -3.0F, -15.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(62, 123).addBox(-1.0F, -4.0F, -14.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(58, 27).addBox(-6.0F, -7.0F, -12.0F, 3.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 57).addBox(3.0F, -7.0F, -12.0F, 3.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(85, 0).addBox(1.0F, -3.0F, -12.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(78, 44).addBox(-3.0F, -3.0F, -12.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(38, 92).addBox(1.0F, -7.0F, -12.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 92).addBox(-3.0F, -7.0F, -12.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(56, 64).addBox(-1.0F, -7.0F, -12.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(91, 87).addBox(-7.0F, -3.0F, -10.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(22, 62).addBox(5.0F, -7.0F, -11.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(21, 91).addBox(6.0F, -3.0F, -10.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(30, 40).addBox(-4.0F, -7.0F, -10.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(163, 0).addBox(-5.0F, -9.0F, -12.0F, 10.0F, 2.0F, 12.0F, 0.0F, false);
			head.setTextureOffset(98, 0).addBox(-3.0F, -5.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(66, 73).addBox(4.0F, -2.3F, -4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 17).addBox(-5.0F, -2.3F, -4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(67, 97).addBox(1.0F, -5.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 57).addBox(-4.0F, 0.0F, -11.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(121, 16).addBox(-6.0F, 0.0F, -11.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(121, 2).addBox(5.0F, 0.0F, -11.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(114, 122).addBox(3.0F, 0.0F, -15.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(86, 95).addBox(-4.0F, 0.0F, -15.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(43, 12).addBox(-3.0F, 0.0F, -15.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(84, 81).addBox(-6.0F, 0.0F, -12.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(21, 80).addBox(4.0F, 0.0F, -12.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(54, 55).addBox(-4.0F, -2.0F, -10.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-2.8F, -8.216F, -5.9466F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.2608F, 0.0094F, -0.218F);
			head_r1.setTextureOffset(228, 41).addBox(-1.0F, -9.784F, -1.0534F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			head_r1.setTextureOffset(242, 0).addBox(-2.5F, -8.784F, -1.0534F, 5.0F, 7.0F, 2.0F, 0.0F, true);
			head_r1.setTextureOffset(228, 41).addBox(-1.0F, -1.784F, -1.0534F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-2.5F, -6.916F, -4.4466F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.7844F, 0.0094F, -0.218F);
			head_r2.setTextureOffset(228, 41).addBox(-1.0F, -16.2562F, 3.4624F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-2.5F, -6.916F, -4.4466F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 1.657F, 0.0094F, -0.218F);
			head_r3.setTextureOffset(220, 20).addBox(-2.5F, -10.2184F, 13.9727F, 5.0F, 3.0F, 2.0F, 0.0F, true);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-2.8F, -8.216F, -5.9466F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.7844F, 0.0094F, -0.218F);
			head_r4.setTextureOffset(220, 0).addBox(-2.5F, -13.2562F, 3.5624F, 5.0F, 5.0F, 2.0F, 0.0F, true);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(2.5F, -6.916F, -4.4466F);
			head.addChild(head_r5);
			setRotationAngle(head_r5, 1.657F, -0.0094F, 0.218F);
			head_r5.setTextureOffset(220, 20).addBox(-2.5F, -10.2184F, 13.9727F, 5.0F, 3.0F, 2.0F, 0.0F, false);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(2.5F, -6.916F, -4.4466F);
			head.addChild(head_r6);
			setRotationAngle(head_r6, 0.7844F, -0.0094F, 0.218F);
			head_r6.setTextureOffset(228, 41).addBox(-1.0F, -16.2562F, 3.4624F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head_r7 = new ModelRenderer(this);
			head_r7.setRotationPoint(2.8F, -8.216F, -5.9466F);
			head.addChild(head_r7);
			setRotationAngle(head_r7, 0.2608F, -0.0094F, 0.218F);
			head_r7.setTextureOffset(228, 41).addBox(-1.0F, -9.784F, -1.0534F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head_r7.setTextureOffset(242, 0).addBox(-2.5F, -8.784F, -1.0534F, 5.0F, 7.0F, 2.0F, 0.0F, false);
			head_r7.setTextureOffset(228, 41).addBox(-1.0F, -1.784F, -1.0534F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head_r8 = new ModelRenderer(this);
			head_r8.setRotationPoint(2.8F, -8.216F, -5.9466F);
			head.addChild(head_r8);
			setRotationAngle(head_r8, 0.7844F, -0.0094F, 0.218F);
			head_r8.setTextureOffset(220, 0).addBox(-2.5F, -13.2562F, 3.5624F, 5.0F, 5.0F, 2.0F, 0.0F, false);
			mouth = new ModelRenderer(this);
			mouth.setRotationPoint(0.0F, 3.0F, -5.0F);
			head.addChild(mouth);
			setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
			mouth.setTextureOffset(0, 25).addBox(-6.0F, 0.7071F, -7.0247F, 12.0F, 2.0F, 11.0F, 0.0F, false);
			mouth.setTextureOffset(94, 9).addBox(-4.0F, 0.7071F, -10.0247F, 8.0F, 2.0F, 3.0F, 0.0F, false);
			mouth.setTextureOffset(54, 46).addBox(-4.0F, 0.7071F, -5.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(58, 27).addBox(-4.0F, -0.2929F, -6.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(58, 36).addBox(-4.0F, -0.2929F, -10.0247F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(91, 9).addBox(-6.0F, -0.2929F, -7.0247F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(85, 9).addBox(4.0F, -0.2929F, -7.0247F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(84, 84).addBox(-4.0F, -0.2929F, -9.0247F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			mouth.setTextureOffset(78, 48).addBox(3.0F, -0.2929F, -9.0247F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			mouth.setTextureOffset(122, 64).addBox(5.0F, -0.2929F, -6.0247F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			mouth.setTextureOffset(121, 58).addBox(-6.0F, -0.2929F, -6.0247F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			FredbearBody = new ModelRenderer(this);
			FredbearBody.setRotationPoint(0.0F, 24.0F, 0.0F);
			FredbearBody.setTextureOffset(0, 38).addBox(-8.0F, -32.0F, -5.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(71, 25).addBox(-8.0F, -33.0F, -6.0F, 16.0F, 1.0F, 0.0F, 0.0F, false);
			FredbearBody.setTextureOffset(76, 64).addBox(-7.0F, -33.0F, 4.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(47, 0).addBox(-9.0F, -31.0F, -5.0F, 18.0F, 6.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(78, 55).addBox(-7.0F, -26.0F, -6.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(60, 11).addBox(-8.0F, -31.0F, -6.0F, 16.0F, 5.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(214, 120).addBox(4.4F, -37.5F, -7.5F, 5.0F, 11.0F, 13.0F, 0.0F, false);
			FredbearBody.setTextureOffset(214, 120).addBox(-9.4F, -37.5F, -7.5F, 5.0F, 11.0F, 13.0F, 0.0F, true);
			FredbearBody.setTextureOffset(187, 129).addBox(-4.4F, -37.5F, 3.5F, 9.0F, 11.0F, 2.0F, 0.0F, true);
			FredbearBody.setTextureOffset(78, 52).addBox(-7.0F, -32.0F, -6.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(82, 30).addBox(-6.0F, -35.0F, -7.0F, 12.0F, 2.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(94, 14).addBox(-5.0F, -36.0F, -7.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(82, 33).addBox(-5.0F, -37.0F, -7.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(76, 70).addBox(-7.0F, -33.0F, -7.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(13, 85).addBox(-9.0F, -32.0F, -4.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
			FredbearBody.setTextureOffset(83, 81).addBox(8.0F, -32.0F, -4.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 40).addBox(-9.0F, -32.0F, 3.0F, 18.0F, 7.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 66).addBox(-7.0F, -24.0F, -4.0F, 14.0F, 4.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(78, 57).addBox(-6.0F, -24.0F, -5.0F, 12.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(78, 61).addBox(-6.0F, -25.0F, -6.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(78, 44).addBox(-3.0F, -20.0F, -4.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			FredbearBody.setTextureOffset(118, 103).addBox(6.0F, -24.0F, -3.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			FredbearBody.setTextureOffset(50, 118).addBox(-7.0F, -24.0F, -3.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			FredbearBody.setTextureOffset(5, 120).addBox(-8.0F, -24.0F, -3.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			FredbearBody.setTextureOffset(107, 122).addBox(-9.0F, -24.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			FredbearBody.setTextureOffset(31, 91).addBox(7.0F, -24.0F, -3.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			FredbearBody.setTextureOffset(119, 122).addBox(8.0F, -24.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 48).addBox(-7.0F, -24.0F, 2.0F, 14.0F, 4.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(47, 7).addBox(-9.0F, -36.0F, -6.0F, 18.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(7, 12).addBox(8.0F, -36.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(6, 0).addBox(8.0F, -36.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 12).addBox(-9.0F, -36.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 0).addBox(-9.0F, -36.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(82, 123).addBox(-4.0F, -36.5F, -8.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(123, 81).addBox(1.0F, -36.5F, -8.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 95).addBox(-1.0F, -36.0F, -8.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(47, 101).addBox(-1.5F, -32.0F, -7.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 0).addBox(-9.0F, -37.0F, -6.0F, 18.0F, 1.0F, 11.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 53).addBox(-9.0F, -36.0F, 4.0F, 18.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -24.0F, 0.0F);
			FredbearBody.addChild(body);
			body.setTextureOffset(116, 46).addBox(-4.5F, -8.0F, 1.5F, 9.0F, 3.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(16, 110).addBox(-4.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(71, 26).addBox(-1.5F, -6.0F, -2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(98, 3).addBox(1.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(24, 53).addBox(4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(78, 26).addBox(-4.5F, -5.0F, -2.5F, 9.0F, 0.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(48, 40).addBox(-6.0F, -8.0F, -3.5F, 12.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(35, 27).addBox(2.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(31, 27).addBox(5.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(33, 27).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(29, 25).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(68, 38).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(48, 62).addBox(-2.0F, -12.0F, 1.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(35, 29).addBox(-4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(36, 62).addBox(2.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(34, 62).addBox(5.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(20, 71).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(69, 39).addBox(-2.0F, -9.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(7, 16).addBox(3.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(43, 27).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(43, 31).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(54, 93).addBox(-6.0F, -12.0F, 2.5F, 12.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(8, 24).addBox(6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(30, 56).addBox(6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(54, 49).addBox(6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(6, 24).addBox(6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 24).addBox(-6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(54, 42).addBox(-6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(2, 24).addBox(-6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(54, 43).addBox(-6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(81, 17).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(101, 24).addBox(-5.5F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(78, 81).addBox(3.5F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(27, 120).addBox(-1.0F, -9.0F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(28, 102).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(78, 106).addBox(-1.0F, -22.0F, 2.5F, 2.0F, 13.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(90, 123).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(84, 119).addBox(-3.0F, -11.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(121, 0).addBox(3.0F, -10.5F, -1.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(118, 111).addBox(-11.0F, -10.5F, -1.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			FrebearRightArm = new ModelRenderer(this);
			FrebearRightArm.setRotationPoint(-10.0F, -10.0F, 0.0F);
			freddyarm = new ModelRenderer(this);
			freddyarm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			FrebearRightArm.addChild(freddyarm);
			setRotationAngle(freddyarm, 0.0F, 0.0F, 0.3927F);
			freddyarm.setTextureOffset(46, 105).addBox(-5.5F, -1.2F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			freddyarm.setTextureOffset(66, 73).addBox(-5.5F, -2.2F, -4.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
			freddyarm.setTextureOffset(23, 105).addBox(0.5F, -1.2F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			freddyarm.setTextureOffset(102, 106).addBox(-5.5F, -1.2F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(106, 65).addBox(-5.5F, -1.2F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			FrebearRightArm.addChild(right_arm);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.3927F);
			right_arm.setTextureOffset(63, 81).addBox(-4.5F, -1.2F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-2.0F, 6.3F, -0.5F);
			right_arm.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 71).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			lowerarm = new ModelRenderer(this);
			lowerarm.setRotationPoint(-2.0F, 6.8F, 0.3F);
			right_arm.addChild(lowerarm);
			setRotationAngle(lowerarm, -1.1345F, 0.0F, 0.0F);
			lowerarm.setTextureOffset(39, 93).addBox(-2.5F, 9.0F, -2.3F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			lowerarm.setTextureOffset(30, 112).addBox(-2.5F, 12.0F, -2.3F, 2.0F, 3.0F, 5.0F, 0.0F, false);
			lowerarm.setTextureOffset(95, 122).addBox(-2.5F, 15.0F, -2.3F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			lowerarm.setTextureOffset(36, 14).addBox(1.5F, 14.0F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(85, 4).addBox(0.5F, 12.0F, -2.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(35, 101).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			lowerarm.setTextureOffset(58, 81).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(116, 8).addBox(-3.0F, 2.0F, -2.8F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(58, 115).addBox(-3.0F, 2.0F, 2.2F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(118, 92).addBox(-3.0F, 2.0F, -1.8F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			lowerarm.setTextureOffset(117, 81).addBox(2.0F, 2.0F, -1.8F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			FrebearLeftArm = new ModelRenderer(this);
			FrebearLeftArm.setRotationPoint(10.0F, -10.0F, 0.0F);
			freddyarm2 = new ModelRenderer(this);
			freddyarm2.setRotationPoint(1.0F, 0.0F, 0.0F);
			FrebearLeftArm.addChild(freddyarm2);
			setRotationAngle(freddyarm2, 0.0F, 0.0F, -0.3927F);
			freddyarm2.setTextureOffset(66, 103).addBox(4.5F, -1.2F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			freddyarm2.setTextureOffset(60, 17).addBox(-1.5F, -2.2F, -4.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
			freddyarm2.setTextureOffset(36, 12).addBox(-1.5F, -1.2F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			freddyarm2.setTextureOffset(105, 0).addBox(-1.5F, -1.2F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(102, 98).addBox(-1.5F, -1.2F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(1.0F, 0.0F, 0.0F);
			FrebearLeftArm.addChild(left_arm);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.3927F);
			left_arm.setTextureOffset(0, 80).addBox(-0.5F, -1.2F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(2.0F, 6.3F, -0.5F);
			left_arm.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(54, 55).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			lowerarm2 = new ModelRenderer(this);
			lowerarm2.setRotationPoint(2.0F, 6.8F, 0.3F);
			left_arm.addChild(lowerarm2);
			setRotationAngle(lowerarm2, -1.1345F, 0.0F, 0.0F);
			lowerarm2.setTextureOffset(87, 72).addBox(-2.5F, 9.0F, -2.3F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			lowerarm2.setTextureOffset(7, 110).addBox(0.5F, 12.0F, -2.3F, 2.0F, 3.0F, 5.0F, 0.0F, false);
			lowerarm2.setTextureOffset(120, 52).addBox(1.5F, 15.0F, -2.3F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			lowerarm2.setTextureOffset(36, 12).addBox(-2.5F, 14.0F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(32, 57).addBox(-2.5F, 12.0F, -2.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(100, 40).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			lowerarm2.setTextureOffset(15, 80).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(86, 111).addBox(-3.0F, 2.0F, -2.8F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(111, 73).addBox(-3.0F, 2.0F, 2.2F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(17, 114).addBox(2.0F, 2.0F, -1.8F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			lowerarm2.setTextureOffset(0, 114).addBox(-3.0F, 2.0F, -1.8F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-4.1F, 3.0F, 0.0F);
			right_leg.setTextureOffset(104, 28).addBox(2.1F, 2.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(105, 57).addBox(-3.9F, 2.0F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 101).addBox(-3.9F, 1.0F, -3.0F, 1.0F, 8.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(105, 16).addBox(-3.9F, 2.0F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(43, 81).addBox(-2.9F, 2.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(58, 108).addBox(-1.4F, 7.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower = new ModelRenderer(this);
			lower.setRotationPoint(4.0F, 5.0F, 0.0F);
			right_leg.addChild(lower);
			lower.setTextureOffset(55, 97).addBox(-6.4F, 5.0F, -2.5F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			lower.setTextureOffset(102, 122).addBox(-5.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(0, 92).addBox(-5.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			lower.setTextureOffset(0, 77).addBox(-5.9F, 15.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(72, 117).addBox(-2.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			lower.setTextureOffset(40, 116).addBox(-7.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			lower.setTextureOffset(114, 114).addBox(-7.4F, 5.0F, 1.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(100, 114).addBox(-7.4F, 5.0F, -3.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(0, 71).addBox(-7.4F, 13.0F, -5.5F, 6.0F, 1.0F, 8.0F, 0.0F, false);
			lower.setTextureOffset(37, 14).addBox(-7.4F, 14.0F, -8.5F, 6.0F, 2.0F, 11.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(4.1F, 3.0F, 0.0F);
			left_leg.setTextureOffset(0, 12).addBox(-3.1F, 2.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(12, 102).addBox(-3.1F, 2.0F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(90, 98).addBox(2.9F, 1.0F, -3.0F, 1.0F, 8.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(101, 86).addBox(-3.1F, 2.0F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(23, 79).addBox(-2.1F, 2.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(38, 79).addBox(-0.6F, 7.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2 = new ModelRenderer(this);
			lower2.setRotationPoint(-4.0F, 5.0F, 0.0F);
			left_leg.addChild(lower2);
			lower2.setTextureOffset(74, 95).addBox(2.4F, 5.0F, -2.5F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			lower2.setTextureOffset(24, 60).addBox(3.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(85, 0).addBox(2.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			lower2.setTextureOffset(44, 72).addBox(2.9F, 15.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(0, 25).addBox(1.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			lower2.setTextureOffset(0, 0).addBox(6.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			lower2.setTextureOffset(111, 24).addBox(1.4F, 5.0F, 1.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(108, 49).addBox(1.4F, 5.0F, -3.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(56, 64).addBox(1.4F, 13.0F, -5.5F, 6.0F, 1.0F, 8.0F, 0.0F, false);
			lower2.setTextureOffset(35, 27).addBox(1.4F, 14.0F, -8.5F, 6.0F, 2.0F, 11.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			FredbearBody.render(matrixStack, buffer, packedLight, packedOverlay);
			FrebearRightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			FrebearLeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.FrebearRightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.FrebearLeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
