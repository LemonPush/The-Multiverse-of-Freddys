
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

import net.mcreator.themultiverseoffreddys.entity.BlacklightMangleEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BlacklightMangleRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BlacklightMangleEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMangle(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/blacklight_mangle.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMangle extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer body;
		private final ModelRenderer right_leg_r1;
		private final ModelRenderer right_leg_r2;
		private final ModelRenderer neck;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer right_arm_r5;
		private final ModelRenderer other_arm;
		private final ModelRenderer right_leg_r3;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r6;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r7;
		private final ModelRenderer right_arm_r8;
		private final ModelRenderer right_arm_r9;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_leg_r4;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg_r5;
		private final ModelRenderer middle_leg;
		private final ModelRenderer right_leg_r6;

		public ModelMangle() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(-7.0217F, -20.0227F, -4.9788F);
			head.setTextureOffset(0, 0).addBox(-2.9783F, -3.9773F, -9.0212F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(24, 0).addBox(-1.9783F, 4.0227F, -15.0212F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(42, 40).addBox(-1.9783F, 3.0227F, -15.0212F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(65, 17).addBox(-1.9783F, 3.0227F, -14.0212F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(64, 61).addBox(3.0217F, 3.0227F, -14.0212F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(61, 4).addBox(3.0217F, 1.5227F, -14.0212F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(19, 18).addBox(-1.9783F, 1.5227F, -15.0212F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(64, 10).addBox(-1.9783F, 1.5227F, -14.0212F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(28, 36).addBox(-0.9783F, 0.0227F, -14.8212F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(19, 20).addBox(-1.9783F, 0.5227F, -15.2212F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(16, 42).addBox(0.0217F, -0.4773F, -14.5212F, 2.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(72, 50).addBox(0.0217F, -1.0773F, -14.5212F, 2.0F, 1.0F, 2.0F, -0.1F, false);
			head.setTextureOffset(62, 37).addBox(-1.7783F, -2.4773F, -9.5212F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(33, 61).addBox(1.7217F, -2.4773F, -9.5212F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(14, 35).addBox(5.0217F, 1.5227F, -7.5212F, 2.0F, 2.0F, 1.0F, -0.25F, false);
			head.setTextureOffset(19, 20).addBox(-4.9783F, 1.5227F, -7.5212F, 2.0F, 2.0F, 1.0F, -0.25F, false);
			head.setTextureOffset(56, 67).addBox(-6.9783F, 1.0227F, -5.0212F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 34).addBox(-4.9783F, 1.0227F, -7.0212F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(69, 46).addBox(-5.9783F, 1.0227F, -6.0212F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(30, 28).addBox(5.0217F, 1.0227F, -7.0212F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(35, 69).addBox(5.0217F, 1.0227F, -6.0212F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(10, 66).addBox(5.0217F, 1.0227F, -5.0212F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(1.0217F, -5.4773F, -6.5212F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, -0.5236F, 1.5708F, 0.0F);
			head_r1.setTextureOffset(0, 27).addBox(-2.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 0).addBox(-2.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 16).addBox(-2.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(0, 6).addBox(-2.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(1.0217F, -5.4773F, -6.5212F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, -0.5236F, -1.5708F, 0.0F);
			head_r2.setTextureOffset(19, 68).addBox(1.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head_r2.setTextureOffset(4, 6).addBox(1.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(24, 0).addBox(1.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head_r2.setTextureOffset(18, 28).addBox(1.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(0, 27).addBox(-3.5F, 7.0F, -2.0F, 7.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(68, 42).addBox(-4.0F, 1.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(68, 67).addBox(-4.0F, -1.2F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(43, 0).addBox(1.0F, -1.2F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(68, 27).addBox(1.0F, -4.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(72, 16).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(68, 23).addBox(-5.0F, -4.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 36).addBox(-4.0F, 4.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 67).addBox(1.0F, 1.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 71).addBox(5.0F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(27, 69).addBox(-7.0F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(74, 37).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(48, 61).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(14, 74).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg_r1 = new ModelRenderer(this);
			right_leg_r1.setRotationPoint(-5.0F, 9.0F, 1.0F);
			body.addChild(right_leg_r1);
			setRotationAngle(right_leg_r1, -0.5236F, 0.0F, 0.0F);
			right_leg_r1.setTextureOffset(28, 36).addBox(5.0F, -1.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg_r1.setTextureOffset(60, 31).addBox(4.0F, -2.5F, 2.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			right_leg_r2 = new ModelRenderer(this);
			right_leg_r2.setRotationPoint(2.0F, -8.0F, 0.0F);
			body.addChild(right_leg_r2);
			setRotationAngle(right_leg_r2, 0.0F, 0.0F, 0.7418F);
			right_leg_r2.setTextureOffset(0, 41).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(2.0F, -6.0F, 0.0F);
			body.addChild(neck);
			setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);
			neck.setTextureOffset(65, 37).addBox(1.4926F, 4.9781F, -9.4785F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			neck.setTextureOffset(38, 18).addBox(-2.5074F, 4.9781F, -10.4785F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			neck.setTextureOffset(38, 18).addBox(4.4926F, 4.9781F, -10.4785F, 4.0F, 2.0F, 5.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(5.3F, 3.5499F, -10.6346F);
			neck.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.9635F, 0.0F, 0.5672F);
			right_arm_r1.setTextureOffset(43, 4).addBox(0.3F, -1.1499F, 3.0346F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(5.3F, 3.5499F, -10.6346F);
			neck.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -2.6023F, -0.05F, -0.0418F);
			right_arm_r2.setTextureOffset(12, 42).addBox(-2.0F, 2.3614F, 2.7233F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r2.setTextureOffset(12, 58).addBox(-2.5F, -2.6386F, 2.2233F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(3.1285F, 6.3503F, -3.3283F);
			neck.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.8159F, -0.0934F, 0.5603F);
			right_arm_r3.setTextureOffset(32, 43).addBox(-0.6359F, 1.6278F, 0.8498F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(3.1285F, 6.3503F, -3.3283F);
			neck.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, 0.1745F, 0.0F, 0.0F);
			right_arm_r4.setTextureOffset(44, 25).addBox(-1.6285F, -6.3503F, 1.8283F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_arm_r4.setTextureOffset(26, 43).addBox(-1.1285F, -0.3503F, 2.3283F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r5 = new ModelRenderer(this);
			right_arm_r5.setRotationPoint(3.1285F, 6.3503F, -3.3283F);
			neck.addChild(right_arm_r5);
			setRotationAngle(right_arm_r5, -1.0908F, 0.0F, 0.0F);
			right_arm_r5.setTextureOffset(57, 58).addBox(-1.6285F, -2.9326F, -0.5788F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_arm_r5.setTextureOffset(21, 49).addBox(-1.1285F, 2.0674F, -0.0788F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			other_arm = new ModelRenderer(this);
			other_arm.setRotationPoint(-1.9F, 9.0F, 2.0F);
			body.addChild(other_arm);
			setRotationAngle(other_arm, -3.1416F, 0.0F, -0.6545F);
			other_arm.setTextureOffset(66, 71).addBox(-1.1F, 7.0F, -5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			other_arm.setTextureOffset(71, 61).addBox(-1.1F, 14.0F, -5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			other_arm.setTextureOffset(48, 52).addBox(-1.6F, 8.0F, -5.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			other_arm.setTextureOffset(42, 8).addBox(-2.1F, 15.0F, -6.1F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_leg_r3 = new ModelRenderer(this);
			right_leg_r3.setRotationPoint(-0.1F, 8.25F, -4.0F);
			other_arm.addChild(right_leg_r3);
			setRotationAngle(right_leg_r3, -0.48F, 0.0F, 0.0F);
			right_leg_r3.setTextureOffset(36, 52).addBox(-1.5F, -7.25F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg_r3.setTextureOffset(49, 71).addBox(-1.0F, -8.25F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -4.0F, 0.0F);
			right_arm.setTextureOffset(72, 19).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(54, 0).addBox(-4.5F, -2.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_arm_r6 = new ModelRenderer(this);
			right_arm_r6.setRotationPoint(5.0F, 5.0F, 1.0F);
			right_arm.addChild(right_arm_r6);
			setRotationAngle(right_arm_r6, -1.2654F, 0.0F, 0.0F);
			right_arm_r6.setTextureOffset(36, 61).addBox(-9.5F, 1.0F, -2.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_arm_r6.setTextureOffset(66, 0).addBox(-10.5F, 11.0F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r6.setTextureOffset(66, 57).addBox(-10.5F, 11.0F, -1.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r6.setTextureOffset(68, 4).addBox(-10.5F, 11.0F, 0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			right_arm_r6.setTextureOffset(0, 16).addBox(-11.0F, 7.0F, -5.5F, 6.0F, 4.0F, 7.0F, 0.0F, false);
			right_arm_r6.setTextureOffset(72, 34).addBox(-9.0F, 6.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.15F, -3.6501F, -1.3346F);
			left_arm.setTextureOffset(69, 31).addBox(1.85F, 3.6501F, 0.3346F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 49).addBox(1.35F, -2.3499F, -0.1654F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_arm_r7 = new ModelRenderer(this);
			right_arm_r7.setRotationPoint(5.15F, 2.2F, -9.3F);
			left_arm.addChild(right_arm_r7);
			setRotationAngle(right_arm_r7, -1.9635F, 0.0F, 0.5672F);
			right_arm_r7.setTextureOffset(60, 10).addBox(-1.0F, -0.1499F, 1.0346F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r7.setTextureOffset(44, 43).addBox(-1.5F, -6.1499F, 0.5346F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_arm_r8 = new ModelRenderer(this);
			right_arm_r8.setRotationPoint(5.15F, 2.2F, -9.3F);
			left_arm.addChild(right_arm_r8);
			setRotationAngle(right_arm_r8, 3.0543F, 0.0F, 0.5672F);
			right_arm_r8.setTextureOffset(54, 9).addBox(-1.0F, 3.3614F, -0.2767F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r8.setTextureOffset(60, 49).addBox(-1.5F, -1.6386F, -0.7767F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_arm_r9 = new ModelRenderer(this);
			right_arm_r9.setRotationPoint(-5.15F, 4.6501F, 2.3346F);
			left_arm.addChild(right_arm_r9);
			setRotationAngle(right_arm_r9, -1.2654F, 0.0F, 0.0F);
			right_arm_r9.setTextureOffset(24, 61).addBox(6.5F, 1.0F, -2.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_arm_r9.setTextureOffset(8, 71).addBox(7.0F, 6.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, -1.0F);
			setRotationAngle(right_leg, 0.0F, 0.5236F, 0.0F);
			right_leg.setTextureOffset(72, 72).addBox(-0.6321F, 7.0F, -5.4641F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(55, 72).addBox(-0.6321F, 14.0F, -5.4641F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(56, 40).addBox(-1.1321F, 8.0F, -5.9641F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(25, 9).addBox(-2.1321F, 14.0F, -8.9641F, 5.0F, 2.0F, 7.0F, 0.1F, false);
			right_leg.setTextureOffset(45, 52).addBox(1.8679F, 15.0F, -10.6641F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			right_leg.setTextureOffset(51, 20).addBox(-2.1321F, 15.0F, -10.6641F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			right_leg.setTextureOffset(33, 52).addBox(-0.1321F, 15.0F, -10.6641F, 1.0F, 1.0F, 2.0F, 0.1F, false);
			right_leg_r4 = new ModelRenderer(this);
			right_leg_r4.setRotationPoint(0.3679F, 7.25F, -4.4641F);
			right_leg.addChild(right_leg_r4);
			setRotationAngle(right_leg_r4, -0.48F, 0.0F, 0.0F);
			right_leg_r4.setTextureOffset(56, 22).addBox(-1.5F, -6.25F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg_r4.setTextureOffset(72, 53).addBox(-1.0F, -7.25F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, -1.0F);
			setRotationAngle(left_leg, 0.0F, -0.5236F, 0.0F);
			left_leg.setTextureOffset(6, 74).addBox(-1.3679F, 7.0F, -5.4641F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(25, 73).addBox(-1.3679F, 14.0F, -5.4641F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 58).addBox(-1.8679F, 8.0F, -5.9641F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(14, 35).addBox(-2.3679F, 15.0F, -7.9641F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 34).addBox(-2.3679F, 14.6F, -7.9641F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(9, 58).addBox(-2.8679F, 15.0F, -9.6641F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(56, 49).addBox(-0.8679F, 15.0F, -9.6641F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(54, 32).addBox(1.1321F, 15.0F, -9.6641F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg_r5 = new ModelRenderer(this);
			right_leg_r5.setRotationPoint(-0.3679F, 8.25F, -4.4641F);
			left_leg.addChild(right_leg_r5);
			setRotationAngle(right_leg_r5, -0.48F, 0.0F, 0.0F);
			right_leg_r5.setTextureOffset(55, 13).addBox(-1.5F, -7.25F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg_r5.setTextureOffset(33, 73).addBox(-1.0F, -8.25F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			middle_leg = new ModelRenderer(this);
			middle_leg.setRotationPoint(3.1F, 8.0F, 1.0F);
			setRotationAngle(middle_leg, 0.0F, 0.0436F, 0.0F);
			middle_leg.setTextureOffset(41, 71).addBox(-0.8383F, 7.0F, 3.0057F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			middle_leg.setTextureOffset(71, 11).addBox(-0.8383F, 14.0F, 3.0057F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			middle_leg.setTextureOffset(24, 52).addBox(-1.3383F, 8.0F, 2.5057F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			middle_leg.setTextureOffset(30, 29).addBox(-1.8383F, 15.0F, 1.5057F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			middle_leg.setTextureOffset(16, 28).addBox(-1.8383F, 14.6F, 1.5057F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			middle_leg.setTextureOffset(9, 49).addBox(-2.3383F, 15.0F, 7.2057F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			middle_leg.setTextureOffset(16, 45).addBox(-0.3383F, 15.0F, 7.2057F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			middle_leg.setTextureOffset(41, 43).addBox(1.6617F, 15.0F, 7.2057F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg_r6 = new ModelRenderer(this);
			right_leg_r6.setRotationPoint(0.1617F, 8.25F, 4.0057F);
			middle_leg.addChild(right_leg_r6);
			setRotationAngle(right_leg_r6, 0.48F, 0.0F, 0.0F);
			right_leg_r6.setTextureOffset(12, 49).addBox(-1.5F, -7.25F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg_r6.setTextureOffset(71, 8).addBox(-1.0F, -8.25F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
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
			middle_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
			this.middle_leg.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
