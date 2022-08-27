
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

import net.mcreator.themultiverseoffreddys.entity.TamedDreadbearEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedDreadbearRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedDreadbearEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelDreadbear(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/dreadbear.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelDreadbear extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
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

		public ModelDreadbear() {
			textureWidth = 256;
			textureHeight = 256;
			head = new ModelRenderer(this);
			head.setRotationPoint(-0.8498F, -20.2081F, 0.125F);
			head.setTextureOffset(55, 32).addBox(-5.1502F, -14.7919F, -7.125F, 1.0F, 8.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(0, 61).addBox(-5.1502F, -13.7919F, 1.875F, 12.0F, 11.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(67, 32).addBox(-5.1502F, -6.7919F, -0.125F, 12.0F, 5.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(60, 0).addBox(-5.1502F, -9.7919F, -11.125F, 12.0F, 3.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(50, 27).addBox(-0.1502F, -10.7919F, -10.625F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 39).addBox(-4.1502F, -9.7919F, -7.125F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(77, 16).addBox(-4.1502F, -13.7919F, -7.125F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 28).addBox(4.8498F, -13.7919F, -7.125F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(79, 93).addBox(1.8498F, -9.7919F, -7.125F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(28, 90).addBox(-2.1502F, -9.7919F, -7.125F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(77, 44).addBox(-5.1502F, -14.7919F, -8.125F, 12.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 39).addBox(-4.1502F, -13.7919F, -5.125F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 28).addBox(-0.1502F, -13.7919F, -7.125F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(83, 94).addBox(-6.1502F, -9.7919F, -5.125F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(54, 51).addBox(5.8498F, -14.7919F, -7.125F, 1.0F, 8.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(35, 71).addBox(4.8498F, -6.7919F, -9.125F, 1.0F, 2.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(69, 67).addBox(-4.1502F, -6.7919F, -9.125F, 1.0F, 2.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(35, 22).addBox(-4.1502F, -6.7919F, -10.125F, 10.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(96, 59).addBox(6.8498F, -9.7919F, -5.125F, 1.0F, 3.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(60, 0).addBox(7.8498F, -7.7919F, -4.125F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(55, 25).addBox(9.8498F, -7.7919F, -4.125F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(41, 82).addBox(8.8498F, -8.2919F, -4.625F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(45, 0).addBox(-7.1502F, -7.7919F, -4.125F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(26, 80).addBox(-8.1502F, -8.2919F, -4.625F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(45, 2).addBox(-9.1502F, -7.7919F, -4.125F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 39).addBox(-3.1502F, -13.7919F, -6.125F, 8.0F, 5.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 28).addBox(-4.1502F, -14.7919F, -7.125F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(-5.1502F, -15.7919F, -8.125F, 12.0F, 1.0F, 11.0F, 0.0F, false);
			head.setTextureOffset(73, 24).addBox(-2.1502F, -16.7919F, -5.125F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(113, 101).addBox(-0.6502F, -19.7919F, -3.625F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(54, 83).addBox(-3.1502F, -12.7919F, -7.125F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 78).addBox(1.8498F, -12.7919F, -7.125F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(32, 52).addBox(-3.1502F, -7.7919F, -6.125F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 52).addBox(-3.1502F, -8.7919F, -6.125F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-8.1502F, -16.7919F, -2.125F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.6109F);
			head_r1.setTextureOffset(59, 32).addBox(-0.6F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(46, 71).addBox(1.4F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(73, 24).addBox(-1.6F, -2.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(11, 73).addBox(-1.6F, -0.5F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-5.6502F, -15.2919F, -2.125F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.6109F);
			head_r2.setTextureOffset(8, 12).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(7.3498F, -15.2919F, -2.125F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, -0.6109F);
			head_r3.setTextureOffset(6, 16).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(9.8498F, -16.7919F, -2.125F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, -0.6109F);
			head_r4.setTextureOffset(117, 20).addBox(-2.4F, -2.5F, -1.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			mouth = new ModelRenderer(this);
			mouth.setRotationPoint(0.8498F, -2.7919F, -1.125F);
			head.addChild(mouth);
			setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
			mouth.setTextureOffset(0, 0).addBox(-6.0F, 0.7071F, -10.0247F, 12.0F, 2.0F, 14.0F, 0.0F, false);
			mouth.setTextureOffset(84, 55).addBox(-5.0F, -1.2929F, -9.0247F, 10.0F, 2.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(73, 13).addBox(4.0F, -1.2929F, -8.0247F, 1.0F, 2.0F, 9.0F, 0.0F, false);
			mouth.setTextureOffset(0, 73).addBox(-5.0F, -1.2929F, -8.0247F, 1.0F, 2.0F, 9.0F, 0.0F, false);
			FreddyBody = new ModelRenderer(this);
			FreddyBody.setRotationPoint(0.0F, 20.0F, 0.0F);
			FreddyBody.setTextureOffset(52, 14).addBox(-7.0F, -32.0F, -4.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(67, 39).addBox(1.0F, -31.0F, -4.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(54, 87).addBox(-5.0F, -31.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(38, 71).addBox(5.0F, -31.0F, -4.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(89, 75).addBox(1.0F, -29.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(66, 56).addBox(1.0F, -27.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(60, 2).addBox(0.0F, -31.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(44, 67).addBox(3.0F, -29.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(38, 0).addBox(-1.0F, -31.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(41, 86).addBox(-6.0F, -29.0F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(9, 0).addBox(-6.0F, -27.0F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(44, 61).addBox(4.0F, -33.0F, 3.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(0, 28).addBox(-7.0F, -33.0F, 3.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(0, 58).addBox(-4.0F, -33.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(0, 45).addBox(-3.0F, -29.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(30, 36).addBox(1.0F, -29.0F, 3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(102, 68).addBox(-1.0F, -33.0F, 3.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(30, 67).addBox(-3.0F, -32.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(26, 67).addBox(3.0F, -32.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(80, 65).addBox(-7.0F, -31.0F, -4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(36, 52).addBox(-2.0F, -31.0F, -4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(92, 88).addBox(-7.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			FreddyBody.setTextureOffset(38, 0).addBox(6.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			FreddyBody.setTextureOffset(85, 93).addBox(-7.0F, -33.0F, 2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(16, 88).addBox(6.0F, -33.0F, 2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(60, 7).addBox(-7.0F, -28.0F, 2.0F, 14.0F, 3.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(77, 39).addBox(-6.0F, -24.0F, -3.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(84, 49).addBox(-3.0F, -20.0F, -3.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
			FreddyBody.setTextureOffset(26, 61).addBox(5.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			FreddyBody.setTextureOffset(56, 52).addBox(-6.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			FreddyBody.setTextureOffset(76, 60).addBox(-6.0F, -24.0F, 1.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(92, 0).addBox(-10.0F, -38.0F, -5.0F, 8.0F, 6.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(52, 69).addBox(-2.0F, -38.0F, -5.0F, 12.0F, 6.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(0, 52).addBox(7.0F, -38.0F, -4.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(87, 103).addBox(-10.0F, -38.0F, -4.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(0, 34).addBox(-5.0F, -38.5F, -6.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(0, 22).addBox(1.0F, -38.5F, -6.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(72, 11).addBox(-1.5F, -38.0F, -6.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			FreddyBody.setTextureOffset(50, 22).addBox(3.0F, -39.0F, -5.0F, 7.0F, 1.0F, 9.0F, 0.0F, false);
			FreddyBody.setTextureOffset(32, 42).addBox(-10.0F, -39.0F, -5.0F, 7.0F, 1.0F, 9.0F, 0.0F, false);
			FreddyBody.setTextureOffset(26, 82).addBox(-10.0F, -33.0F, -4.0F, 4.0F, 1.0F, 7.0F, 0.0F, false);
			FreddyBody.setTextureOffset(80, 65).addBox(6.0F, -33.0F, -4.0F, 4.0F, 1.0F, 7.0F, 0.0F, false);
			FreddyBody.setTextureOffset(35, 16).addBox(-10.0F, -38.0F, 3.0F, 20.0F, 5.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -24.0F, 0.0F);
			FreddyBody.addChild(body);
			body.setTextureOffset(73, 78).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(117, 44).addBox(-5.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(117, 39).addBox(3.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(76, 112).addBox(-1.0F, -11.0F, -1.5F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(67, 78).addBox(-1.0F, -14.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(66, 50).addBox(0.5F, -18.0F, -1.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-2.5F, -18.0F, -1.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(90, 7).addBox(-1.0F, -13.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(24, 42).addBox(-3.0F, -13.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(35, 25).addBox(3.0F, -12.5F, -1.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(26, 78).addBox(-11.0F, -12.5F, -1.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(84, 19).addBox(-6.0F, -3.5F, -1.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(80, 73).addBox(-6.0F, -6.0F, -1.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(77, 47).addBox(-6.0F, -8.5F, -1.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			FreddyRightArm = new ModelRenderer(this);
			FreddyRightArm.setRotationPoint(-10.0F, -15.0F, 0.0F);
			freddyarm = new ModelRenderer(this);
			freddyarm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			FreddyRightArm.addChild(freddyarm);
			setRotationAngle(freddyarm, 0.0F, 0.0F, 0.3927F);
			freddyarm.setTextureOffset(111, 68).addBox(-5.5F, -2.2F, -3.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
			freddyarm.setTextureOffset(49, 76).addBox(-5.5F, -3.2F, -4.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			freddyarm.setTextureOffset(110, 89).addBox(-0.5F, -2.2F, -3.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
			freddyarm.setTextureOffset(103, 39).addBox(-5.5F, -2.2F, -4.0F, 6.0F, 8.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(14, 102).addBox(-5.5F, -2.2F, 1.0F, 6.0F, 8.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			FreddyRightArm.addChild(right_arm);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.3927F);
			right_arm.setTextureOffset(32, 93).addBox(-4.5F, -2.2F, -3.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(116, 88).addBox(-3.5F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm = new ModelRenderer(this);
			lowerarm.setRotationPoint(-2.0F, 6.8F, 0.3F);
			right_arm.addChild(lowerarm);
			setRotationAngle(lowerarm, -1.1345F, 0.0F, 0.0F);
			lowerarm.setTextureOffset(77, 85).addBox(-3.0F, 12.0F, -1.8F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			lowerarm.setTextureOffset(78, 103).addBox(-3.0F, 15.0F, -1.8F, 2.0F, 4.0F, 5.0F, 0.0F, false);
			lowerarm.setTextureOffset(67, 116).addBox(0.0F, 15.0F, -1.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(113, 12).addBox(-2.0F, 2.0F, -0.8F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			lowerarm.setTextureOffset(113, 80).addBox(-2.0F, 7.0F, -0.8F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			lowerarm.setTextureOffset(12, 111).addBox(-3.0F, 2.0F, -1.8F, 5.0F, 9.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(110, 58).addBox(-3.0F, 2.0F, 2.2F, 5.0F, 9.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(40, 115).addBox(-3.0F, 2.0F, -0.8F, 1.0F, 9.0F, 3.0F, 0.0F, false);
			lowerarm.setTextureOffset(32, 115).addBox(1.0F, 2.0F, -0.8F, 1.0F, 9.0F, 3.0F, 0.0F, false);
			FreddyLeftArm = new ModelRenderer(this);
			FreddyLeftArm.setRotationPoint(10.0F, -15.0F, 0.0F);
			freddyarm2 = new ModelRenderer(this);
			freddyarm2.setRotationPoint(1.0F, 0.0F, 0.0F);
			FreddyLeftArm.addChild(freddyarm2);
			setRotationAngle(freddyarm2, 0.0F, 0.0F, -0.3927F);
			freddyarm2.setTextureOffset(107, 17).addBox(4.5F, -2.2F, -3.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
			freddyarm2.setTextureOffset(20, 71).addBox(-0.5F, -3.2F, -4.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			freddyarm2.setTextureOffset(52, 105).addBox(-0.5F, -2.2F, -3.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
			freddyarm2.setTextureOffset(99, 7).addBox(-0.5F, -2.2F, -4.0F, 6.0F, 8.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(97, 75).addBox(-0.5F, -2.2F, 1.0F, 6.0F, 8.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(1.0F, 0.0F, 0.0F);
			FreddyLeftArm.addChild(left_arm);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.3927F);
			left_arm.setTextureOffset(0, 84).addBox(0.5F, -2.2F, -3.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(11, 77).addBox(1.5F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2 = new ModelRenderer(this);
			lowerarm2.setRotationPoint(2.0F, 6.8F, 0.3F);
			left_arm.addChild(lowerarm2);
			setRotationAngle(lowerarm2, -1.1345F, 0.0F, 0.0F);
			lowerarm2.setTextureOffset(84, 11).addBox(-2.0F, 12.0F, -1.8F, 5.0F, 3.0F, 5.0F, 0.0F, false);
			lowerarm2.setTextureOffset(95, 30).addBox(1.0F, 15.0F, -1.8F, 2.0F, 4.0F, 5.0F, 0.0F, false);
			lowerarm2.setTextureOffset(46, 74).addBox(-2.0F, 15.0F, -1.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(24, 52).addBox(-1.0F, 2.0F, -0.8F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			lowerarm2.setTextureOffset(50, 32).addBox(-1.0F, 7.0F, -0.8F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			lowerarm2.setTextureOffset(106, 48).addBox(-2.0F, 2.0F, -1.8F, 5.0F, 9.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(40, 105).addBox(-2.0F, 2.0F, 2.2F, 5.0F, 9.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(114, 114).addBox(2.0F, 2.0F, -0.8F, 1.0F, 9.0F, 3.0F, 0.0F, false);
			lowerarm2.setTextureOffset(59, 114).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 9.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-4.1F, 2.0F, 0.0F);
			right_leg.setTextureOffset(107, 105).addBox(1.6F, -1.0F, -2.5F, 1.0F, 8.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(97, 100).addBox(-3.4F, -1.0F, -3.5F, 6.0F, 8.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(60, 95).addBox(-3.4F, -2.0F, -2.5F, 1.0F, 9.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(99, 84).addBox(-3.4F, -1.0F, 1.5F, 6.0F, 8.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(16, 90).addBox(-2.4F, -1.0F, -2.5F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(48, 117).addBox(-1.4F, 7.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower = new ModelRenderer(this);
			lower.setRotationPoint(4.0F, 5.0F, 0.0F);
			right_leg.addChild(lower);
			lower.setTextureOffset(48, 93).addBox(-5.9F, 3.0F, -2.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
			lower.setTextureOffset(102, 117).addBox(-5.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(41, 83).addBox(-5.9F, 14.0F, -5.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);
			lower.setTextureOffset(56, 58).addBox(-5.9F, 15.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(24, 115).addBox(-2.9F, 3.0F, -2.0F, 1.0F, 9.0F, 3.0F, 0.0F, false);
			lower.setTextureOffset(0, 115).addBox(-6.9F, 3.0F, -2.0F, 1.0F, 9.0F, 3.0F, 0.0F, false);
			lower.setTextureOffset(92, 109).addBox(-6.9F, 3.0F, 1.0F, 5.0F, 9.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(109, 29).addBox(-6.9F, 3.0F, -3.0F, 5.0F, 9.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(66, 50).addBox(-6.9F, 13.0F, -5.5F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			lower.setTextureOffset(38, 0).addBox(-6.9F, 15.0F, -9.5F, 5.0F, 2.0F, 12.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(4.1F, 2.0F, 0.0F);
			left_leg.setTextureOffset(66, 104).addBox(-2.6F, -1.0F, -2.5F, 1.0F, 8.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 96).addBox(-2.6F, -1.0F, -3.5F, 6.0F, 8.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(73, 93).addBox(2.4F, -2.0F, -2.5F, 1.0F, 9.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(93, 21).addBox(-2.6F, -1.0F, 1.5F, 6.0F, 8.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(61, 83).addBox(-1.6F, -1.0F, -2.5F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 73).addBox(-0.6F, 7.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2 = new ModelRenderer(this);
			lower2.setRotationPoint(-4.0F, 5.0F, 0.0F);
			left_leg.addChild(lower2);
			lower2.setTextureOffset(0, 0).addBox(2.9F, 3.0F, -2.0F, 3.0F, 9.0F, 3.0F, 0.0F, false);
			lower2.setTextureOffset(32, 46).addBox(3.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(13, 78).addBox(2.9F, 14.0F, -5.0F, 3.0F, 3.0F, 7.0F, 0.0F, false);
			lower2.setTextureOffset(0, 12).addBox(2.9F, 15.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(113, 0).addBox(1.9F, 3.0F, -2.0F, 1.0F, 9.0F, 3.0F, 0.0F, false);
			lower2.setTextureOffset(84, 112).addBox(5.9F, 3.0F, -2.0F, 1.0F, 9.0F, 3.0F, 0.0F, false);
			lower2.setTextureOffset(28, 105).addBox(1.9F, 3.0F, 1.0F, 5.0F, 9.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(0, 105).addBox(1.9F, 3.0F, -3.0F, 5.0F, 9.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(26, 61).addBox(1.9F, 13.0F, -5.5F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			lower2.setTextureOffset(28, 28).addBox(1.9F, 15.0F, -9.5F, 5.0F, 2.0F, 12.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			FreddyBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			FreddyRightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			FreddyLeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
