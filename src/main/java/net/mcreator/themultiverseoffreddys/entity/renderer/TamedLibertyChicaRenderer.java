
package net.mcreator.themultiverseoffreddys.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.mcreator.themultiverseoffreddys.entity.TamedLibertyChicaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedLibertyChicaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedLibertyChicaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelLiberty_Chica(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/liberty_chica.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelLiberty_Chica extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer head_r6;
		private final ModelRenderer head_r7;
		private final ModelRenderer head_r8;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm_r3;

		public ModelLiberty_Chica() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(38, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(48, 31).addBox(-4.0F, -17.0F, -4.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(62, 51).addBox(-3.0F, -7.0F, -7.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(10, 56).addBox(-3.0F, -8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 3).addBox(-3.0F, -8.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(2.0F, -8.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(30, 68).addBox(-2.0F, -10.0F, -6.8F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(62, 0).addBox(-3.0F, -9.5F, -7.2F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(70, 5).addBox(-1.0F, -10.5F, -6.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(10, 61).addBox(-2.8F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(59, 42).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 56).addBox(0.7F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(37, 31).addBox(-2.8F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 56).addBox(-4.5F, -13.5F, -4.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(52, 50).addBox(3.5F, -13.5F, -4.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(3.0359F, -18.2385F, 3.0005F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, -0.6863F, -0.4176F, 1.1111F);
			head_r1.setTextureOffset(0, 24).addBox(0.2F, -4.5F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(3.0359F, -18.2385F, -3.0005F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.6863F, 0.4176F, 1.1111F);
			head_r2.setTextureOffset(0, 24).addBox(0.2F, -4.5F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-3.0359F, -18.2385F, 3.0005F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, -0.6863F, 0.4176F, -1.1111F);
			head_r3.setTextureOffset(0, 24).addBox(-1.2F, -4.5F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, true);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-3.0359F, -18.2385F, -3.0005F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.6863F, -0.4176F, -1.1111F);
			head_r4.setTextureOffset(0, 24).addBox(-1.2F, -4.5F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, true);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(-3.9402F, -18.2627F, 0.0F);
			head.addChild(head_r5);
			setRotationAngle(head_r5, 0.0F, 0.0F, -0.8639F);
			head_r5.setTextureOffset(0, 24).addBox(-1.0F, -4.5F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, true);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(3.9402F, -18.2627F, 0.0F);
			head.addChild(head_r6);
			setRotationAngle(head_r6, 0.0F, 0.0F, 0.8639F);
			head_r6.setTextureOffset(0, 24).addBox(0.0F, -4.5F, -1.0F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			head_r7 = new ModelRenderer(this);
			head_r7.setRotationPoint(0.0F, -18.2627F, 3.9402F);
			head.addChild(head_r7);
			setRotationAngle(head_r7, -0.8639F, 0.0F, 0.0F);
			head_r7.setTextureOffset(38, 16).addBox(-1.0F, -4.5F, 0.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			head_r8 = new ModelRenderer(this);
			head_r8.setRotationPoint(0.0F, -18.2627F, -3.9402F);
			head.addChild(head_r8);
			setRotationAngle(head_r8, 0.8639F, 0.0F, 0.0F);
			head_r8.setTextureOffset(38, 16).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(30, 50).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 40).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(37, 16).addBox(-6.5F, 11.0F, -4.0F, 13.0F, 7.0F, 8.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-6.0F, -6.0F, -3.5F, 12.0F, 17.0F, 7.0F, 0.0F, false);
			body.setTextureOffset(0, 24).addBox(-7.0F, 18.0F, -4.5F, 14.0F, 7.0F, 9.0F, 0.0F, false);
			body.setTextureOffset(18, 58).addBox(-4.0F, -5.9F, -2.7F, 8.0F, 8.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(25, 40).addBox(-3.5F, 2.1F, -2.7F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 59).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(10, 58).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(36, 58).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(48, 31).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(-3.0F, 10.3333F, 0.0F);
			right_arm.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r1.setTextureOffset(0, 56).addBox(0.2F, 10.2667F, -12.9F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			right_arm_r1.setTextureOffset(31, 0).addBox(-2.0F, 6.6667F, -13.0F, 4.0F, 4.0F, 3.0F, 0.25F, false);
			right_arm_r1.setTextureOffset(48, 35).addBox(-0.5F, 8.1667F, -16.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(18, 67).addBox(-2.0F, 6.6667F, -10.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(64, 65).addBox(-3.0F, 5.6667F, -8.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(48, 65).addBox(-2.0F, 6.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(25, 42).addBox(-1.0F, 5.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(62, 42).addBox(-2.0F, 0.6667F, -7.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(-3.0F, 10.3333F, -11.0F);
			right_arm.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.0F);
			right_arm_r2.setTextureOffset(0, 56).addBox(-2.2F, -0.7333F, -12.9F, 2.0F, 1.0F, 2.0F, -0.25F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(36, 58).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
			left_arm.setTextureOffset(48, 31).addBox(2.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			right_arm_r3 = new ModelRenderer(this);
			right_arm_r3.setRotationPoint(3.0F, 10.3333F, 0.0F);
			left_arm.addChild(right_arm_r3);
			setRotationAngle(right_arm_r3, -1.5708F, 0.0F, 0.0F);
			right_arm_r3.setTextureOffset(35, 31).addBox(-3.0F, 4.6667F, -11.0F, 1.0F, 8.0F, 11.0F, 0.0F, false);
			right_arm_r3.setTextureOffset(48, 65).addBox(-2.0F, 6.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			right_arm_r3.setTextureOffset(25, 42).addBox(-1.0F, 5.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
			right_arm_r3.setTextureOffset(62, 42).addBox(-2.0F, 0.6667F, -7.0F, 4.0F, 5.0F, 4.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
