
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

import net.mcreator.themultiverseoffreddys.entity.BreadbearEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BreadbearRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BreadbearEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBreadbear(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/breadbear.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBreadbear extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
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

		public ModelBreadbear() {
			textureWidth = 256;
			textureHeight = 256;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -14.4065F, 3.3486F);
			head.setTextureOffset(44, 64).addBox(-6.0F, -11.5935F, -10.3486F, 1.0F, 7.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(0, 80).addBox(-6.0F, -11.5935F, -0.3486F, 12.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(94, 10).addBox(-4.0F, -7.5935F, -14.3486F, 8.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(7, 124).addBox(-1.0F, -8.5935F, -14.1486F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(58, 27).addBox(-6.0F, -11.5935F, -11.3486F, 3.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 57).addBox(3.0F, -11.5935F, -11.3486F, 3.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(66, 73).addBox(-3.0F, -7.5935F, -11.3486F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(78, 38).addBox(1.0F, -7.5935F, -11.3486F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 91).addBox(1.0F, -11.5935F, -11.3486F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 88).addBox(-3.0F, -11.5935F, -11.3486F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(56, 64).addBox(-1.0F, -11.5935F, -11.3486F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(78, 95).addBox(-7.0F, -7.5935F, -9.3486F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(22, 62).addBox(5.0F, -11.5935F, -10.3486F, 1.0F, 7.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(44, 93).addBox(6.0F, -7.5935F, -9.3486F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(30, 40).addBox(-4.0F, -11.5935F, -9.3486F, 8.0F, 5.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 12).addBox(-6.0F, -12.5935F, -11.3486F, 12.0F, 1.0F, 12.0F, 0.0F, false);
			head.setTextureOffset(30, 53).addBox(-4.0F, -13.5935F, -9.3486F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(85, 0).addBox(-2.5F, -18.5935F, -7.8486F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(32, 94).addBox(-3.0F, -9.5935F, -10.3486F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(81, 17).addBox(4.0F, -6.8935F, -3.3486F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(60, 17).addBox(-5.0F, -6.8935F, -3.3486F, 1.0F, 6.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(45, 93).addBox(1.0F, -9.5935F, -10.3486F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 57).addBox(-4.0F, -4.5935F, -10.3486F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(120, 121).addBox(-6.0F, -4.5935F, -10.3486F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(73, 97).addBox(5.0F, -4.5935F, -10.3486F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(122, 88).addBox(3.0F, -4.5935F, -14.3486F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(61, 82).addBox(-4.0F, -4.5935F, -14.3486F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(43, 12).addBox(-3.0F, -4.5935F, -14.3486F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(45, 81).addBox(-6.0F, -4.5935F, -11.3486F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(66, 77).addBox(4.0F, -4.5935F, -11.3486F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(54, 55).addBox(-4.0F, -9.5935F, -9.3486F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(7.5F, -13.0935F, -5.3486F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.7418F);
			head_r1.setTextureOffset(9, 88).addBox(-3.2F, -4.5F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
			head_r1.setTextureOffset(54, 93).addBox(-1.7F, 0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-7.5F, -13.0935F, -5.3486F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, -0.7418F);
			head_r2.setTextureOffset(122, 24).addBox(-0.3F, 0.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			head_r2.setTextureOffset(88, 95).addBox(-1.8F, -4.5F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
			mouth = new ModelRenderer(this);
			mouth.setRotationPoint(0.0F, -2.5935F, -4.3486F);
			head.addChild(mouth);
			mouth.setTextureOffset(0, 25).addBox(-6.0F, 0.7071F, -7.0247F, 12.0F, 2.0F, 11.0F, 0.0F, false);
			mouth.setTextureOffset(99, 34).addBox(-4.0F, 0.7071F, -10.0247F, 8.0F, 2.0F, 3.0F, 0.0F, false);
			mouth.setTextureOffset(54, 46).addBox(-4.0F, 0.7071F, -5.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(58, 27).addBox(-4.0F, -0.2929F, -6.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			mouth.setTextureOffset(78, 52).addBox(-4.0F, -0.2929F, -10.0247F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(92, 62).addBox(-6.0F, -0.2929F, -7.0247F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(90, 34).addBox(4.0F, -0.2929F, -7.0247F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			mouth.setTextureOffset(41, 81).addBox(-4.0F, -0.2929F, -9.0247F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			mouth.setTextureOffset(32, 57).addBox(3.0F, -0.2929F, -9.0247F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			mouth.setTextureOffset(122, 62).addBox(5.0F, -0.2929F, -6.0247F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			mouth.setTextureOffset(49, 122).addBox(-6.0F, -0.2929F, -6.0247F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			FredbearBody = new ModelRenderer(this);
			FredbearBody.setRotationPoint(0.0F, 24.0F, 0.0F);
			FredbearBody.setTextureOffset(0, 38).addBox(-8.0F, -32.0F, -5.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(71, 26).addBox(-8.0F, -33.0F, -6.0F, 16.0F, 1.0F, 0.0F, 0.0F, false);
			FredbearBody.setTextureOffset(78, 44).addBox(-7.0F, -33.0F, 4.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(47, 0).addBox(-9.0F, -31.0F, -5.0F, 18.0F, 6.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(78, 50).addBox(-7.0F, -26.0F, -6.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(60, 11).addBox(-8.0F, -31.0F, -6.0F, 16.0F, 5.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(76, 69).addBox(-7.0F, -32.0F, -6.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(86, 92).addBox(-6.0F, -35.0F, -7.0F, 12.0F, 2.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(99, 41).addBox(-5.0F, -36.0F, -7.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(99, 39).addBox(-5.0F, -37.0F, -7.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(76, 67).addBox(-7.0F, -33.0F, -7.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(16, 88).addBox(-9.0F, -32.0F, -4.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 88).addBox(8.0F, -32.0F, -4.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 40).addBox(-9.0F, -32.0F, 3.0F, 18.0F, 7.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 66).addBox(-7.0F, -24.0F, -4.0F, 14.0F, 4.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(84, 71).addBox(-6.0F, -24.0F, -5.0F, 12.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(58, 36).addBox(-6.0F, -25.0F, -6.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(81, 18).addBox(-3.0F, -20.0F, -4.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			FredbearBody.setTextureOffset(121, 0).addBox(6.0F, -24.0F, -3.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			FredbearBody.setTextureOffset(118, 28).addBox(-7.0F, -24.0F, -3.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
			FredbearBody.setTextureOffset(121, 112).addBox(-8.0F, -24.0F, -3.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			FredbearBody.setTextureOffset(122, 82).addBox(-9.0F, -24.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			FredbearBody.setTextureOffset(121, 36).addBox(7.0F, -24.0F, -3.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 123).addBox(8.0F, -24.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 48).addBox(-7.0F, -24.0F, 2.0F, 14.0F, 4.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(47, 7).addBox(-9.0F, -36.0F, -6.0F, 18.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(7, 12).addBox(8.0F, -36.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(6, 0).addBox(8.0F, -36.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 12).addBox(-9.0F, -36.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 0).addBox(-9.0F, -36.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(125, 48).addBox(-4.0F, -36.5F, -8.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(125, 28).addBox(1.0F, -36.5F, -8.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(33, 91).addBox(-1.0F, -36.0F, -8.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(25, 91).addBox(-1.5F, -32.0F, -7.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(25, 91).addBox(-1.5F, -28.5F, -7.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 0).addBox(-9.0F, -37.0F, -6.0F, 18.0F, 1.0F, 11.0F, 0.0F, false);
			FredbearBody.setTextureOffset(0, 53).addBox(-9.0F, -36.0F, 4.0F, 18.0F, 3.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -24.0F, 0.0F);
			FredbearBody.addChild(body);
			body.setTextureOffset(112, 59).addBox(-4.5F, -8.0F, 1.5F, 9.0F, 3.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(51, 104).addBox(-4.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(71, 25).addBox(-1.5F, -6.0F, -2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(80, 97).addBox(1.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(24, 53).addBox(4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(80, 75).addBox(-4.5F, -5.0F, -2.5F, 9.0F, 0.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(48, 40).addBox(-6.0F, -8.0F, -3.5F, 12.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(35, 27).addBox(2.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(31, 27).addBox(5.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(33, 27).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(29, 25).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(68, 38).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(48, 62).addBox(-2.0F, -12.0F, 1.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(35, 29).addBox(-4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(43, 31).addBox(2.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(43, 27).addBox(5.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(20, 71).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(69, 39).addBox(-2.0F, -9.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(7, 16).addBox(3.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(36, 12).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-5.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(38, 12).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(54, 97).addBox(-6.0F, -12.0F, 2.5F, 12.0F, 4.0F, 0.0F, 0.0F, false);
			body.setTextureOffset(8, 24).addBox(6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(30, 56).addBox(6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(54, 49).addBox(6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(6, 24).addBox(6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 24).addBox(-6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(54, 42).addBox(-6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(2, 24).addBox(-6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(54, 43).addBox(-6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(82, 27).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(64, 112).addBox(-5.5F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(81, 106).addBox(3.5F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(34, 122).addBox(-1.0F, -9.0F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(78, 60).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(56, 112).addBox(-1.0F, -22.0F, 2.5F, 2.0F, 13.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(13, 126).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(117, 78).addBox(-3.0F, -11.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(116, 102).addBox(3.0F, -10.5F, -1.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(112, 92).addBox(-11.0F, -10.5F, -1.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			FrebearRightArm = new ModelRenderer(this);
			FrebearRightArm.setRotationPoint(-10.0F, -10.0F, 0.0F);
			freddyarm = new ModelRenderer(this);
			freddyarm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			FrebearRightArm.addChild(freddyarm);
			setRotationAngle(freddyarm, 0.0F, 0.0F, 0.3927F);
			freddyarm.setTextureOffset(107, 107).addBox(-5.5F, -1.2F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			freddyarm.setTextureOffset(78, 36).addBox(-5.5F, -2.2F, -4.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
			freddyarm.setTextureOffset(86, 107).addBox(0.5F, -1.2F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			freddyarm.setTextureOffset(111, 94).addBox(-5.5F, -1.2F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm.setTextureOffset(24, 111).addBox(-5.5F, -1.2F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-1.0F, 0.0F, 0.0F);
			FrebearRightArm.addChild(right_arm);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.3927F);
			right_arm.setTextureOffset(86, 80).addBox(-4.5F, -1.2F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-2.0F, 6.3F, -0.5F);
			right_arm.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 71).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			lowerarm = new ModelRenderer(this);
			lowerarm.setRotationPoint(-2.0F, 6.8F, 0.3F);
			right_arm.addChild(lowerarm);
			setRotationAngle(lowerarm, -1.1345F, 0.0F, 0.0F);
			lowerarm.setTextureOffset(92, 52).addBox(-2.5F, 9.0F, -2.3F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			lowerarm.setTextureOffset(77, 55).addBox(-1.5F, 10.0F, -5.3F, 3.0F, 3.0F, 9.0F, 0.0F, false);
			lowerarm.setTextureOffset(66, 73).addBox(-3.0F, 8.5F, -11.3F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			lowerarm.setTextureOffset(101, 75).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			lowerarm.setTextureOffset(19, 102).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm.setTextureOffset(64, 118).addBox(-3.0F, 2.0F, -2.8F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(40, 116).addBox(-3.0F, 2.0F, 2.2F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm.setTextureOffset(104, 119).addBox(-3.0F, 2.0F, -1.8F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			lowerarm.setTextureOffset(24, 119).addBox(2.0F, 2.0F, -1.8F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			FrebearLeftArm = new ModelRenderer(this);
			FrebearLeftArm.setRotationPoint(10.0F, -10.0F, 0.0F);
			freddyarm2 = new ModelRenderer(this);
			freddyarm2.setRotationPoint(1.0F, 0.0F, 0.0F);
			FrebearLeftArm.addChild(freddyarm2);
			setRotationAngle(freddyarm2, 0.0F, 0.0F, -0.3927F);
			freddyarm2.setTextureOffset(44, 104).addBox(4.5F, -1.2F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			freddyarm2.setTextureOffset(60, 17).addBox(-1.5F, -2.2F, -4.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
			freddyarm2.setTextureOffset(36, 12).addBox(-1.5F, -1.2F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			freddyarm2.setTextureOffset(106, 62).addBox(-1.5F, -1.2F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			freddyarm2.setTextureOffset(106, 25).addBox(-1.5F, -1.2F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(1.0F, 0.0F, 0.0F);
			FrebearLeftArm.addChild(left_arm);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.3927F);
			left_arm.setTextureOffset(46, 81).addBox(-0.5F, -1.2F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(2.0F, 6.3F, -0.5F);
			left_arm.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(54, 55).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			lowerarm2 = new ModelRenderer(this);
			lowerarm2.setRotationPoint(2.0F, 6.8F, 0.3F);
			left_arm.addChild(lowerarm2);
			setRotationAngle(lowerarm2, -1.1345F, 0.0F, 0.0F);
			lowerarm2.setTextureOffset(34, 62).addBox(-2.5F, 9.0F, -2.3F, 5.0F, 5.0F, 5.0F, 0.0F, false);
			lowerarm2.setTextureOffset(100, 16).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			lowerarm2.setTextureOffset(7, 102).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lowerarm2.setTextureOffset(0, 115).addBox(-3.0F, 2.0F, -2.8F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(114, 104).addBox(-3.0F, 2.0F, 2.2F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lowerarm2.setTextureOffset(94, 115).addBox(2.0F, 2.0F, -1.8F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			lowerarm2.setTextureOffset(14, 115).addBox(-3.0F, 2.0F, -1.8F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-4.1F, 3.0F, 0.0F);
			right_leg.setTextureOffset(74, 106).addBox(2.1F, 2.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(108, 43).addBox(-3.9F, 2.0F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(12, 102).addBox(-3.9F, 1.0F, -3.0F, 1.0F, 8.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(106, 84).addBox(-3.9F, 2.0F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			right_leg.setTextureOffset(66, 85).addBox(-2.9F, 2.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			right_leg.setTextureOffset(124, 43).addBox(-1.4F, 7.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower = new ModelRenderer(this);
			lower.setRotationPoint(4.0F, 5.0F, 0.0F);
			right_leg.addChild(lower);
			lower.setTextureOffset(58, 101).addBox(-6.4F, 5.0F, -2.5F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			lower.setTextureOffset(88, 124).addBox(-5.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower.setTextureOffset(96, 95).addBox(-5.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			lower.setTextureOffset(0, 77).addBox(-5.9F, 15.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(78, 118).addBox(-2.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			lower.setTextureOffset(115, 115).addBox(-7.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			lower.setTextureOffset(116, 16).addBox(-7.4F, 5.0F, 1.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(116, 8).addBox(-7.4F, 5.0F, -3.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lower.setTextureOffset(0, 71).addBox(-7.4F, 13.0F, -5.5F, 6.0F, 1.0F, 8.0F, 0.0F, false);
			lower.setTextureOffset(37, 14).addBox(-7.4F, 14.0F, -8.5F, 6.0F, 2.0F, 11.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(4.1F, 3.0F, 0.0F);
			left_leg.setTextureOffset(0, 12).addBox(-3.1F, 2.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(105, 0).addBox(-3.1F, 2.0F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 102).addBox(2.9F, 1.0F, -3.0F, 1.0F, 8.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(96, 104).addBox(-3.1F, 2.0F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(26, 79).addBox(-2.1F, 2.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			left_leg.setTextureOffset(78, 55).addBox(-0.6F, 7.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2 = new ModelRenderer(this);
			lower2.setRotationPoint(-4.0F, 5.0F, 0.0F);
			left_leg.addChild(lower2);
			lower2.setTextureOffset(28, 100).addBox(2.4F, 5.0F, -2.5F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			lower2.setTextureOffset(24, 60).addBox(3.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			lower2.setTextureOffset(32, 91).addBox(2.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
			lower2.setTextureOffset(44, 72).addBox(2.9F, 15.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(0, 25).addBox(1.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			lower2.setTextureOffset(0, 0).addBox(6.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
			lower2.setTextureOffset(113, 70).addBox(1.4F, 5.0F, 1.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
			lower2.setTextureOffset(112, 51).addBox(1.4F, 5.0F, -3.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
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
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.FrebearRightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.FrebearLeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
