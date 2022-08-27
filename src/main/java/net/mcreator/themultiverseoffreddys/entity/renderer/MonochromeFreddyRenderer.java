
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

import net.mcreator.themultiverseoffreddys.entity.MonochromeFreddyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MonochromeFreddyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MonochromeFreddyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMonochromeFreddy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/monochromefreddy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMonochromeFreddy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer right_arm_r5_r1;
		private final ModelRenderer right_arm_r4_r1;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer right_arm_r3;
		private final ModelRenderer bone;
		private final ModelRenderer bone_r1;
		private final ModelRenderer bone_r2;
		private final ModelRenderer right_arm_r4;
		private final ModelRenderer body;
		private final ModelRenderer neck;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm_r1;
		private final ModelRenderer left_arm_r2;
		private final ModelRenderer left_arm_r3;
		private final ModelRenderer left_arm_r4;
		private final ModelRenderer left_arm_r5;
		private final ModelRenderer left_arm_r6;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelMonochromeFreddy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -7.8294F, 0.05F);
			right_arm_r5_r1 = new ModelRenderer(this);
			right_arm_r5_r1.setRotationPoint(-4.9548F, -8.6705F, -1.2167F);
			head.addChild(right_arm_r5_r1);
			setRotationAngle(right_arm_r5_r1, -1.5708F, 0.0F, 0.5672F);
			right_arm_r5_r1.setTextureOffset(0, 42).addBox(-0.05F, -2.1F, -1.5F, 1.0F, 2.0F, 1.0F, 0.25F, true);
			right_arm_r5_r1.setTextureOffset(88, 12).addBox(-3.55F, -2.1F, -2.5F, 3.0F, 2.0F, 3.0F, 0.25F, true);
			right_arm_r4_r1 = new ModelRenderer(this);
			right_arm_r4_r1.setRotationPoint(4.9548F, -8.6705F, -1.2167F);
			head.addChild(right_arm_r4_r1);
			setRotationAngle(right_arm_r4_r1, -1.5708F, 0.0F, -0.5672F);
			right_arm_r4_r1.setTextureOffset(0, 42).addBox(-0.95F, -2.1F, -1.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);
			right_arm_r4_r1.setTextureOffset(88, 12).addBox(0.55F, -2.1F, -2.5F, 3.0F, 2.0F, 3.0F, 0.25F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(8.0F, 3.8294F, 8.45F);
			head.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(72, 13).addBox(-11.0F, 7.0F, -7.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(0, 47).addBox(-12.0F, 7.0F, -12.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.5622F, -12.9931F, -0.55F);
			head.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(3.5622F, -12.9931F, -0.55F);
			head.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 14.8294F, -1.55F);
			head.addChild(bone);
			bone.setTextureOffset(76, 0).addBox(-3.5F, -17.5F, -5.0F, 7.0F, 1.0F, 3.0F, 0.0F, false);
			bone.setTextureOffset(71, 24).addBox(-3.5F, -19.5F, -5.0F, 7.0F, 2.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 13).addBox(-4.5F, -24.5F, -2.1F, 9.0F, 8.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(0, 57).addBox(-3.0F, -25.5F, -1.5F, 6.0F, 2.0F, 6.0F, -0.25F, false);
			bone.setTextureOffset(45, 72).addBox(-2.0F, -28.5F, -0.5F, 4.0F, 5.0F, 4.0F, -0.25F, false);
			bone.setTextureOffset(29, 72).addBox(4.5F, -19.5F, -2.1F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(13, 72).addBox(-5.5F, -19.5F, -2.1F, 1.0F, 3.0F, 7.0F, 0.0F, false);
			bone.setTextureOffset(0, 42).addBox(-2.5F, -20.1F, -4.8F, 5.0F, 1.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 4).addBox(-1.0F, -21.1F, -4.8F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r1 = new ModelRenderer(this);
			bone_r1.setRotationPoint(0.0F, -14.4F, 0.9F);
			bone.addChild(bone_r1);
			setRotationAngle(bone_r1, 0.1309F, 0.0F, 0.0F);
			bone_r1.setTextureOffset(76, 36).addBox(-3.5F, -1.9F, -5.7F, 7.0F, 1.0F, 3.0F, 0.0F, false);
			bone_r2 = new ModelRenderer(this);
			bone_r2.setRotationPoint(0.0F, -14.4F, 0.9F);
			bone.addChild(bone_r2);
			setRotationAngle(bone_r2, 0.1309F, 0.0F, 0.0F);
			bone_r2.setTextureOffset(44, 37).addBox(3.5F, -0.9F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r2.setTextureOffset(44, 39).addBox(-4.5F, -0.9F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r2.setTextureOffset(73, 65).addBox(-5.5F, -0.9F, -2.7F, 1.0F, 2.0F, 7.0F, 0.0F, false);
			bone_r2.setTextureOffset(70, 74).addBox(4.5F, -0.9F, -2.7F, 1.0F, 2.0F, 7.0F, 0.0F, false);
			bone_r2.setTextureOffset(76, 40).addBox(-4.5F, -0.9F, 3.3F, 9.0F, 1.0F, 1.0F, 0.0F, false);
			bone_r2.setTextureOffset(25, 16).addBox(-3.5F, 0.1F, -5.7F, 7.0F, 1.0F, 3.0F, 0.0F, false);
			bone_r2.setTextureOffset(25, 16).addBox(-3.5F, -0.9F, -5.7F, 7.0F, 1.0F, 3.0F, 0.0F, false);
			bone_r2.setTextureOffset(46, 29).addBox(-4.5F, 0.1F, -2.7F, 9.0F, 1.0F, 7.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
			bone.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
			right_arm_r4.setTextureOffset(78, 21).addBox(-11.5F, 9.7F, -13.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);
			right_arm_r4.setTextureOffset(63, 49).addBox(-7.0F, 10.2F, -11.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r4.setTextureOffset(62, 13).addBox(-11.0F, 10.2F, -11.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
			right_arm_r4.setTextureOffset(42, 16).addBox(-7.5F, 9.7F, -13.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(-0.5F, -9.0F, 0.0F);
			body.setTextureOffset(21, 93).addBox(-4.0F, 9.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(38, 72).addBox(-4.0F, 6.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(68, 57).addBox(1.0F, 6.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(92, 90).addBox(1.0F, 4.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(46, 24).addBox(-4.0F, 12.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(18, 57).addBox(1.0F, 9.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(22, 72).addBox(5.25F, 4.0F, -2.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(79, 74).addBox(-8.25F, 4.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(61, 72).addBox(-1.5F, 11.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(34, 0).addBox(-4.5F, 6.1F, -3.0F, 10.0F, 1.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(0, 0).addBox(-5.0F, 7.6F, -3.0F, 11.0F, 7.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(46, 16).addBox(-4.5F, 3.6F, -3.0F, 10.0F, 2.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(21, 28).addBox(3.5F, 7.3F, -3.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 28).addBox(-3.5F, 7.3F, -3.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(49, 87).addBox(2.5F, 6.3F, -3.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(40, 36).addBox(-2.5F, 6.3F, -3.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(82, 86).addBox(-1.5F, 5.3F, -3.5F, 4.0F, 9.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 47).addBox(-0.5F, 3.6F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(53, 81).addBox(-1.0F, 7.25F, -4.0F, 3.0F, 3.0F, 1.0F, 0.5F, false);
			body.setTextureOffset(44, 43).addBox(0.0F, 11.3F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(44, 41).addBox(0.0F, 12.8F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 13).addBox(-2.5F, 3.3F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(1.5F, 3.3F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(28, 7).addBox(-5.0F, 15.5F, -3.0F, 11.0F, 3.0F, 6.0F, 0.25F, false);
			body.setTextureOffset(66, 92).addBox(-1.0F, 4.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(41, 81).addBox(-1.5F, 2.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			neck = new ModelRenderer(this);
			neck.setRotationPoint(2.0F, 1.0F, 0.0F);
			body.addChild(neck);
			setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.5F, -9.0F, 0.0F);
			left_arm.setTextureOffset(82, 81).addBox(1.0F, 16.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(83, 47).addBox(1.0F, 9.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(70, 83).addBox(1.5F, 11.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(91, 70).addBox(1.5F, 18.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 85).addBox(1.5F, 4.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(59, 61).addBox(0.5F, 3.3F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			left_arm.setTextureOffset(39, 61).addBox(0.5F, 10.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			left_arm.setTextureOffset(68, 47).addBox(0.5F, 16.7F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			left_arm.setTextureOffset(74, 57).addBox(1.5F, 17.7F, -4.5F, 3.0F, 3.0F, 5.0F, 0.0F, false);
			left_arm.setTextureOffset(9, 91).addBox(1.5F, 17.7F, -7.5F, 3.0F, 3.0F, 3.0F, 0.25F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-6.5F, -8.5F, -3.2F);
			setRotationAngle(right_arm, -1.5708F, 0.6545F, 0.0F);
			right_arm.setTextureOffset(0, 78).addBox(-4.0F, 4.2F, 3.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(61, 2).addBox(-4.5F, -1.7F, 2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			left_arm_r1 = new ModelRenderer(this);
			left_arm_r1.setRotationPoint(-2.0F, 8.4933F, -9.0648F);
			right_arm.addChild(left_arm_r1);
			setRotationAngle(left_arm_r1, -1.3514F, 0.2143F, -0.7617F);
			left_arm_r1.setTextureOffset(20, 42).addBox(-1.5632F, -2.7686F, 4.2632F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(0, 17).addBox(-0.5632F, -3.2686F, 4.2632F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(0, 17).addBox(-3.5632F, -3.2686F, 4.2632F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(66, 24).addBox(-0.3632F, 2.2314F, 3.1632F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(57, 72).addBox(-3.6632F, 2.2314F, 3.1632F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(44, 19).addBox(-1.5632F, 1.6314F, 5.7632F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(46, 19).addBox(-1.5632F, -4.6686F, 3.0632F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(81, 4).addBox(-3.5632F, -8.2686F, 2.7632F, 5.0F, 6.0F, 2.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(71, 30).addBox(-3.9632F, -1.0686F, 4.0632F, 6.0F, 3.0F, 3.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(37, 87).addBox(-4.5632F, 5.4314F, -0.4368F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(14, 42).addBox(-4.0632F, 4.4314F, 0.0632F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(14, 42).addBox(-0.0632F, 4.4314F, -0.0368F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(14, 42).addBox(-4.0632F, 8.4314F, 0.0632F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(14, 42).addBox(-0.0632F, 8.4314F, -0.0368F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(25, 87).addBox(-0.5632F, 5.4314F, -0.4368F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(0, 29).addBox(-4.5632F, -1.0686F, -2.4368F, 7.0F, 6.0F, 7.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(25, 21).addBox(-4.5632F, -9.2686F, -2.4368F, 7.0F, 8.0F, 7.0F, 0.0F, false);
			left_arm_r2 = new ModelRenderer(this);
			left_arm_r2.setRotationPoint(-3.4142F, 14.7135F, -22.0898F);
			right_arm.addChild(left_arm_r2);
			setRotationAngle(left_arm_r2, -1.0024F, 0.2143F, -0.7617F);
			left_arm_r2.setTextureOffset(89, 18).addBox(-2.1379F, -4.2099F, 0.7047F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_arm_r3 = new ModelRenderer(this);
			left_arm_r3.setRotationPoint(-0.5858F, 11.016F, -22.9403F);
			right_arm.addChild(left_arm_r3);
			setRotationAngle(left_arm_r3, -1.0896F, 0.2143F, -0.7617F);
			left_arm_r3.setTextureOffset(28, 0).addBox(-2.8123F, -4.1228F, 1.0102F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_arm_r4 = new ModelRenderer(this);
			left_arm_r4.setRotationPoint(4.5459F, 4.0974F, -11.0759F);
			right_arm.addChild(left_arm_r4);
			setRotationAngle(left_arm_r4, -2.0988F, -1.1123F, 2.8928F);
			left_arm_r4.setTextureOffset(22, 42).addBox(4.2036F, -1.2516F, -1.115F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm_r4.setTextureOffset(89, 30).addBox(3.1036F, -3.4516F, -1.615F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_arm_r4.setTextureOffset(43, 49).addBox(3.7036F, -0.2516F, -1.615F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm_r4.setTextureOffset(22, 42).addBox(4.2036F, 0.9484F, -1.115F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm_r4.setTextureOffset(22, 47).addBox(3.7036F, 1.9484F, -1.615F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm_r5 = new ModelRenderer(this);
			left_arm_r5.setRotationPoint(-3.8284F, 11.3412F, -11.6911F);
			right_arm.addChild(left_arm_r5);
			setRotationAngle(left_arm_r5, -1.2943F, -0.6779F, -0.9852F);
			left_arm_r5.setTextureOffset(22, 42).addBox(2.491F, -9.0075F, -0.0061F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm_r5.setTextureOffset(90, 58).addBox(1.591F, -11.2075F, -0.5061F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			left_arm_r5.setTextureOffset(22, 42).addBox(2.491F, -6.8075F, -0.0061F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm_r5.setTextureOffset(34, 61).addBox(1.991F, -8.0075F, -0.5061F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm_r5.setTextureOffset(54, 61).addBox(1.991F, -5.8075F, -0.5061F, 2.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm_r6 = new ModelRenderer(this);
			left_arm_r6.setRotationPoint(-2.0F, 4.7333F, 0.2F);
			right_arm.addChild(left_arm_r6);
			setRotationAngle(left_arm_r6, -1.2654F, 0.0F, 0.0F);
			left_arm_r6.setTextureOffset(61, 37).addBox(-2.5F, -4.0019F, -0.1965F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			left_arm_r6.setTextureOffset(57, 81).addBox(-2.0F, 0.9981F, 0.3035F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.2F, 7.0F, -0.5F);
			left_leg.setTextureOffset(85, 53).addBox(-2.0F, 9.0F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(92, 86).addBox(-2.5F, 7.75F, -2.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(81, 42).addBox(-2.0F, 2.7F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(54, 86).addBox(-1.5F, 10.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 67).addBox(-2.5F, 3.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(48, 49).addBox(-2.5F, 9.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(40, 38).addBox(-3.0F, 15.0F, -6.0F, 6.0F, 2.0F, 9.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.2F, 7.0F, -0.5F);
			right_leg.setTextureOffset(82, 65).addBox(-2.0F, 9.0F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(25, 82).addBox(-2.0F, 2.7F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(13, 82).addBox(-1.5F, 10.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(19, 61).addBox(-2.5F, 3.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(28, 49).addBox(-2.5F, 9.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(19, 36).addBox(-3.0F, 15.0F, -6.0F, 6.0F, 2.0F, 9.0F, 0.0F, false);
			right_leg.setTextureOffset(89, 24).addBox(-2.5F, 7.75F, -2.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
