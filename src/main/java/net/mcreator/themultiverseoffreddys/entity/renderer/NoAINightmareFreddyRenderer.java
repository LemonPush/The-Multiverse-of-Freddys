
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

import net.mcreator.themultiverseoffreddys.entity.NoAINightmareFreddyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class NoAINightmareFreddyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(NoAINightmareFreddyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelNightmareFreddy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/nightmarefreddy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.0.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelNightmareFreddy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer bone;
		private final ModelRenderer mouth;
		private final ModelRenderer FreddyBody;
		private final ModelRenderer body;
		private final ModelRenderer FreddyRightArm;
		private final ModelRenderer freddyarm;
		private final ModelRenderer right_arm;
		private final ModelRenderer lowerarm;
		private final ModelRenderer FreddyLeftArm;
		private final ModelRenderer freddyarm2;
		private final ModelRenderer left_arm;
		private final ModelRenderer lowerarm2;
		private final ModelRenderer right_leg;
		private final ModelRenderer lower;
		private final ModelRenderer left_leg;
		private final ModelRenderer lower2;

		public ModelNightmareFreddy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -19.0F, 4.0F);
			head.setTextureOffset(62, 68).addBox(-5.0F, -7.0F, -8.0F, 1.0F, 7.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(63, 58).addBox(-5.0F, -7.0F, -2.0F, 10.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(89, 2).addBox(-5.0F, -3.0F, -14.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(94, 52).addBox(-4.0F, -2.0F, -14.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(4.0F, -3.0F, -14.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(86, 15).addBox(3.0F, -2.0F, -14.0F, 1.0F, 2.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(95, 59).addBox(-1.0F, -4.0F, -15.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(89, 43).addBox(-5.0F, -3.0F, -11.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(16, 103).addBox(-5.0F, -7.0F, -11.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(52, 22).addBox(3.0F, -7.0F, -11.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(92, 12).addBox(2.0F, -2.0F, -13.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(20, 72).addBox(-3.0F, -2.0F, -13.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(94, 46).addBox(-4.0F, -1.0F, -13.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(68, 19).addBox(-4.0F, 0.0F, -13.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(68, 49).addBox(-5.0F, 0.0F, -12.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(10, 50).addBox(4.0F, 0.0F, -12.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(44, 74).addBox(-2.0F, -2.0F, -14.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(14, 61).addBox(-4.0F, -3.0F, -14.0F, 8.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(0, 104).addBox(2.0F, -7.0F, -11.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(103, 103).addBox(-3.0F, -7.0F, -11.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(83, 103).addBox(0.0F, -5.0F, -11.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(103, 94).addBox(0.0F, -7.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(103, 85).addBox(-4.0F, -7.0F, -11.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(103, 63).addBox(-5.0F, -7.0F, -9.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(103, 91).addBox(-4.0F, -5.0F, -11.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 65).addBox(-6.0F, -3.0F, -10.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(25, 66).addBox(-8.0F, -8.0F, -7.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(28, 70).addBox(-7.0F, -9.0F, -7.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(79, 66).addBox(4.0F, -10.0F, -7.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 50).addBox(4.0F, -7.0F, -10.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 65).addBox(5.0F, -3.0F, -10.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 25).addBox(-4.0F, -7.0F, -10.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 14).addBox(-5.0F, -8.0F, -11.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(52, 22).addBox(-3.0F, -9.0F, -9.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(40, 65).addBox(-1.5F, -13.0F, -7.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(101, 57).addBox(-3.0F, -5.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(100, 99).addBox(4.0F, -2.3F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(68, 13).addBox(-5.0F, -2.3F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(100, 96).addBox(1.0F, -5.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(-4.0F, -1.0F, -10.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(24, 30).addBox(-4.0F, -2.0F, -10.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 22.0F, -5.0F);
			head.addChild(bone);
			bone.setTextureOffset(100, 18).addBox(-1.0F, -29.0F, -6.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			mouth = new ModelRenderer(this);
			mouth.setRotationPoint(0.0F, 1.0F, -5.0F);
			head.addChild(mouth);
			setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
			mouth.setTextureOffset(0, 0).addBox(-5.0F, 0.7071F, -8.0247F, 10.0F, 2.0F, 12.0F, 0.0F, false);
			mouth.setTextureOffset(48, 49).addBox(-3.0F, -0.0575F, -6.0025F, 6.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(18, 46).addBox(-4.0F, -0.2929F, -8.0247F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(70, 66).addBox(-5.0F, -0.2929F, -7.0247F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			mouth.setTextureOffset(69, 22).addBox(4.0F, -0.2929F, -7.0247F, 1.0F, 1.0F, 7.0F, 0.0F, false);
			FreddyBody = new ModelRenderer(this);
			FreddyBody.setRotationPoint(0.0F, 24.0F, 0.0F);
			FreddyBody.setTextureOffset(48, 34).addBox(-7.0F, -32.0F, -4.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(92, 8).addBox(-1.0F, -31.0F, -4.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(97, 5).addBox(-6.0F, -31.0F, -4.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(70, 68).addBox(5.0F, -31.0F, -4.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(47, 104).addBox(3.0F, -30.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(104, 37).addBox(-1.0F, -29.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(43, 104).addBox(-4.0F, -26.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(93, 103).addBox(-6.0F, -29.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(101, 35).addBox(-1.0F, -26.0F, -4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(101, 55).addBox(-4.0F, -33.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(83, 13).addBox(2.0F, -33.0F, -5.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(66, 91).addBox(4.0F, -33.0F, 3.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(88, 80).addBox(-7.0F, -33.0F, 3.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(99, 33).addBox(-4.0F, -33.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(99, 16).addBox(-3.0F, -29.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(94, 56).addBox(1.0F, -29.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(45, 92).addBox(-1.0F, -33.0F, 3.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(33, 104).addBox(-3.0F, -32.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(104, 21).addBox(3.0F, -32.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(65, 97).addBox(-7.0F, -31.0F, -4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(10, 50).addBox(-3.0F, -31.0F, -4.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(82, 0).addBox(1.0F, -29.0F, -4.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(13, 72).addBox(-7.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			FreddyBody.setTextureOffset(0, 0).addBox(6.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			FreddyBody.setTextureOffset(100, 80).addBox(-7.0F, -33.0F, 2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(10, 65).addBox(6.0F, -33.0F, 2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(48, 30).addBox(-7.0F, -28.0F, 2.0F, 14.0F, 3.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(48, 36).addBox(-6.0F, -21.0F, -3.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(67, 45).addBox(-6.0F, -22.0F, -3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(61, 66).addBox(0.0F, -22.0F, -3.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(32, 9).addBox(-6.0F, -24.0F, -3.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(91, 67).addBox(2.0F, -24.0F, -3.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(34, 51).addBox(-3.0F, -20.0F, -3.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
			FreddyBody.setTextureOffset(37, 91).addBox(5.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			FreddyBody.setTextureOffset(89, 61).addBox(-6.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			FreddyBody.setTextureOffset(56, 0).addBox(-6.0F, -24.0F, 1.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(80, 38).addBox(-8.0F, -36.0F, -5.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(99, 46).addBox(-5.0F, -34.0F, -5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(26, 25).addBox(2.0F, -36.0F, -5.0F, 6.0F, 3.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(103, 23).addBox(7.0F, -36.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(104, 18).addBox(-8.0F, -36.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(20, 100).addBox(-3.0F, -37.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(99, 87).addBox(1.0F, -37.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(58, 86).addBox(-1.0F, -36.5F, -6.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(46, 39).addBox(2.0F, -37.0F, -5.0F, 6.0F, 1.0F, 9.0F, 0.0F, false);
			FreddyBody.setTextureOffset(31, 20).addBox(-8.0F, -37.0F, -5.0F, 6.0F, 1.0F, 9.0F, 0.0F, false);
			FreddyBody.setTextureOffset(44, 9).addBox(-8.0F, -36.0F, 3.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -24.0F, 0.0F);
			FreddyBody.addChild(body);
			body.setTextureOffset(18, 43).addBox(-4.5F, -8.0F, 1.5F, 9.0F, 3.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(102, 8).addBox(-4.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(18, 38).addBox(-1.5F, -6.0F, -2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(56, 1).addBox(4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(14, 39).addBox(-4.5F, -5.0F, -2.5F, 9.0F, 0.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(24, 14).addBox(-6.0F, -8.0F, -3.5F, 12.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(18, 25).addBox(2.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(2, 14).addBox(5.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 25).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 14).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 46).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(43, 13).addBox(-2.0F, -12.0F, 1.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(30, 16).addBox(-4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(79, 97).addBox(2.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(6, 88).addBox(5.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(46, 47).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(0, 47).addBox(-2.0F, -9.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(32, 48).addBox(3.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(78, 30).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(28, 48).addBox(-5.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(86, 72).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(64, 5).addBox(-6.0F, -12.0F, 2.5F, 12.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(52, 67).addBox(6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(30, 19).addBox(6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(24, 28).addBox(6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(36, 42).addBox(6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(38, 19).addBox(-6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 19).addBox(-6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(36, 38).addBox(-6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 27).addBox(-6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(39, 58).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(94, 70).addBox(-5.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(94, 39).addBox(3.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(45, 80).addBox(-1.0F, -9.0F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(97, 11).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(37, 78).addBox(-1.0F, -20.0F, 1.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(96, 25).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(78, 9).addBox(-3.0F, -11.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(80, 41).addBox(3.0F, -10.5F, -1.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(34, 76).addBox(-9.0F, -10.5F, -1.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(102, 2).addBox(1.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
			FreddyRightArm = new ModelRenderer(this);
			FreddyRightArm.setRotationPoint(-7.0F, -10.0F, 0.0F);
			freddyarm = new ModelRenderer(this);
			freddyarm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			FreddyRightArm.addChild(freddyarm);
			setRotationAngle(freddyarm, 0.0F, 0.0F, 0.3927F);
			freddyarm.setTextureOffset(25, 103).addBox(-4.5F, -1.2F, 0.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(12, 99).addBox(-4.5F, 4.8F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(32, 95).addBox(-4.5F, -1.2F, -2.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(12, 103).addBox(-4.5F, 2.8F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(68, 13).addBox(-4.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			freddyarm.setTextureOffset(83, 84).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm.setTextureOffset(40, 97).addBox(-4.5F, -1.2F, -3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(92, 29).addBox(-3.5F, 1.8F, -3.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(103, 60).addBox(-3.5F, -1.2F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(60, 103).addBox(-1.5F, -1.2F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(57, 95).addBox(-0.5F, -1.2F, -3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(80, 30).addBox(-4.5F, -1.2F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			FreddyRightArm.addChild(right_arm);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.3927F);
			right_arm.setTextureOffset(77, 45).addBox(-3.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(12, 94).addBox(-3.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm = new ModelRenderer(this);
			lowerarm.setRotationPoint(-2.0F, 6.8F, 0.3F);
			right_arm.addChild(lowerarm);
			setRotationAngle(lowerarm, -1.1345F, 0.0F, 0.0F);
			lowerarm.setTextureOffset(85, 55).addBox(-1.5F, 9.0F, -1.3F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm.setTextureOffset(91, 86).addBox(-1.5F, 12.0F, -1.3F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm.setTextureOffset(104, 27).addBox(0.5F, 12.0F, -1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(0, 65).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(4, 94).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(36, 97).addBox(-2.0F, 2.0F, -1.8F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(61, 95).addBox(1.0F, 2.0F, -1.8F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(70, 22).addBox(-1.0F, 2.0F, -1.8F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(83, 15).addBox(-1.0F, 7.0F, -1.8F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(102, 48).addBox(0.0F, 6.0F, -1.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(73, 84).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(100, 68).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(14, 84).addBox(-2.0F, 5.0F, -0.8F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(103, 11).addBox(-2.0F, 7.0F, 0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(102, 66).addBox(-2.0F, 4.0F, -0.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(85, 61).addBox(-2.0F, 8.0F, -0.8F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(31, 86).addBox(1.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			FreddyLeftArm = new ModelRenderer(this);
			FreddyLeftArm.setRotationPoint(7.0F, -10.0F, 0.0F);
			freddyarm2 = new ModelRenderer(this);
			freddyarm2.setRotationPoint(1.0F, 0.0F, 0.0F);
			FreddyLeftArm.addChild(freddyarm2);
			setRotationAngle(freddyarm2, 0.0F, 0.0F, -0.3927F);
			freddyarm2.setTextureOffset(9, 84).addBox(3.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm2.setTextureOffset(10, 66).addBox(-0.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			freddyarm2.setTextureOffset(65, 81).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			freddyarm2.setTextureOffset(96, 17).addBox(-0.5F, -1.2F, -3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(99, 50).addBox(0.5F, 2.8F, -3.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(18, 94).addBox(1.5F, 1.8F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(88, 72).addBox(2.5F, -1.2F, -3.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(90, 21).addBox(-0.5F, -1.2F, 1.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(61, 68).addBox(1.5F, 2.8F, 1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(22, 85).addBox(1.5F, 1.8F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(51, 80).addBox(1.5F, -1.2F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(53, 92).addBox(3.5F, -1.2F, 1.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(1.0F, 0.0F, 0.0F);
			FreddyLeftArm.addChild(left_arm);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.3927F);
			left_arm.setTextureOffset(0, 76).addBox(0.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(89, 92).addBox(1.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2 = new ModelRenderer(this);
			lowerarm2.setRotationPoint(2.0F, 6.8F, 0.3F);
			left_arm.addChild(lowerarm2);
			setRotationAngle(lowerarm2, -1.1345F, 0.0F, 0.0F);
			lowerarm2.setTextureOffset(53, 80).addBox(-1.5F, 9.0F, -1.3F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm2.setTextureOffset(89, 49).addBox(0.5F, 12.0F, -1.3F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			lowerarm2.setTextureOffset(20, 104).addBox(-1.5F, 12.0F, -1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(0, 50).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(74, 92).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(0, 96).addBox(-2.0F, 2.0F, -1.8F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(54, 13).addBox(0.0F, 2.0F, -1.8F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(0, 14).addBox(-1.0F, 4.0F, -1.8F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(0, 38).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(69, 97).addBox(1.0F, 2.0F, -0.8F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(94, 50).addBox(1.0F, 5.0F, 0.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(14, 99).addBox(1.0F, 7.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(25, 86).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-4.1F, 3.0F, 0.0F);
			right_leg.setTextureOffset(17, 84).addBox(1.1F, 2.0F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(96, 96).addBox(-2.9F, 2.0F, -3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(94, 44).addBox(-1.9F, 8.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(51, 51).addBox(-1.9F, 4.0F, -3.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(62, 81).addBox(-1.9F, 2.0F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(102, 76).addBox(0.1F, 5.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(28, 95).addBox(1.1F, 2.0F, -3.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(58, 89).addBox(-2.9F, 1.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(53, 86).addBox(-2.9F, 6.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(82, 55).addBox(-2.9F, 5.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(78, 21).addBox(-2.9F, 2.0F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(76, 74).addBox(-1.9F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(94, 75).addBox(-1.4F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower = new ModelRenderer(this);
			lower.setRotationPoint(4.0F, 5.0F, 0.0F);
			right_leg.addChild(lower);
			lower.setTextureOffset(46, 39).addBox(-5.4F, 6.0F, -1.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(20, 95).addBox(-5.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(67, 36).addBox(-5.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			lower.setTextureOffset(100, 14).addBox(-5.9F, 15.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(86, 43).addBox(-3.4F, 6.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(56, 74).addBox(-3.4F, 10.0F, -1.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(29, 86).addBox(-3.4F, 8.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(68, 49).addBox(-6.4F, 8.0F, -1.5F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(70, 81).addBox(-6.4F, 6.0F, -0.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(19, 50).addBox(-5.4F, 6.0F, 0.5F, 2.0F, 6.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(0, 0).addBox(-6.4F, 8.0F, 0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(79, 101).addBox(-3.4F, 9.0F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(85, 64).addBox(-3.4F, 6.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(4, 99).addBox(-6.4F, 6.0F, -2.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(48, 97).addBox(-3.4F, 6.0F, -2.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(92, 0).addBox(-4.4F, 6.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(56, 103).addBox(-5.4F, 8.0F, -2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(34, 51).addBox(-4.4F, 8.0F, -2.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(52, 13).addBox(-6.4F, 13.0F, -5.5F, 4.0F, 1.0F, 8.0F, 0.0F, false);
			lower.setTextureOffset(28, 39).addBox(-6.4F, 14.0F, -7.5F, 4.0F, 2.0F, 10.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(4.1F, 3.0F, 0.0F);
			left_leg.setTextureOffset(86, 96).addBox(-2.1F, 2.0F, 0.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(10, 94).addBox(-2.1F, 2.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(92, 17).addBox(-2.1F, 8.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(100, 37).addBox(-2.1F, 2.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(8, 99).addBox(-2.1F, 7.0F, -3.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 25).addBox(0.9F, 2.0F, -3.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(67, 38).addBox(-1.1F, 2.0F, -3.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(8, 103).addBox(-1.1F, 6.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 86).addBox(1.9F, 1.0F, -1.0F, 1.0F, 8.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(34, 60).addBox(1.9F, 5.0F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(96, 80).addBox(1.9F, 2.0F, 1.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(82, 94).addBox(-2.1F, 2.0F, 1.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(102, 72).addBox(-1.1F, 6.0F, 1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(26, 29).addBox(-0.1F, 8.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(34, 57).addBox(-1.1F, 5.0F, 1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(97, 92).addBox(-0.1F, 2.0F, 1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(25, 76).addBox(-1.1F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(94, 0).addBox(-0.6F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2 = new ModelRenderer(this);
			lower2.setRotationPoint(-4.0F, 5.0F, 0.0F);
			left_leg.addChild(lower2);
			lower2.setTextureOffset(32, 0).addBox(3.4F, 6.0F, -1.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(93, 34).addBox(3.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(48, 65).addBox(2.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			lower2.setTextureOffset(100, 0).addBox(2.9F, 15.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(100, 29).addBox(2.4F, 6.0F, -1.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(42, 91).addBox(2.4F, 8.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(49, 65).addBox(2.4F, 11.0F, -1.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(52, 100).addBox(5.4F, 6.0F, -1.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(7, 0).addBox(5.4F, 8.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(90, 97).addBox(5.4F, 6.0F, 0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(44, 97).addBox(3.4F, 6.0F, 0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(29, 103).addBox(2.4F, 6.0F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(9, 76).addBox(2.4F, 10.0F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(25, 72).addBox(4.4F, 9.0F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(4, 86).addBox(4.4F, 6.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(75, 97).addBox(2.4F, 6.0F, -2.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(97, 63).addBox(4.4F, 9.0F, -2.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(91, 70).addBox(4.4F, 6.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(69, 102).addBox(5.4F, 6.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(102, 41).addBox(3.4F, 6.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(18, 51).addBox(2.4F, 13.0F, -5.5F, 4.0F, 1.0F, 8.0F, 0.0F, false);
			lower2.setTextureOffset(0, 38).addBox(2.4F, 14.0F, -7.5F, 4.0F, 2.0F, 10.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			FreddyBody.render(matrixStack, buffer, packedLight, packedOverlay);
			FreddyRightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			FreddyLeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.FreddyRightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.FreddyLeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
