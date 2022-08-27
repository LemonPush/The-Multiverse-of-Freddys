
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

import net.mcreator.themultiverseoffreddys.entity.TamedMapBotEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedMapBotRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedMapBotEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelMapBot(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/mapbot.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelMapBot extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer left_arm_r1;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm_r2;

		public ModelMapBot() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.5F, 0.0F);
			head.setTextureOffset(0, 18).addBox(-2.5F, -8.5F, -3.0F, 5.0F, 7.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(40, 34).addBox(-3.0F, -7.25F, -3.2F, 6.0F, 3.0F, 0.0F, 0.0F, false);
			head.setTextureOffset(0, 18).addBox(1.51F, -7.25F, -3.2F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(22, 23).addBox(-2.5F, -10.0F, -3.0F, 5.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(0, 18).addBox(-2.51F, -7.25F, -3.2F, 1.0F, 3.0F, 2.0F, 0.0F, true);
			head.setTextureOffset(0, 0).addBox(-5.5F, -9.0F, -5.0F, 11.0F, 1.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(0, 5).addBox(0.25F, -6.75F, -3.35F, 2.0F, 2.0F, 2.0F, -0.3F, false);
			head.setTextureOffset(0, 5).addBox(-2.25F, -6.75F, -3.35F, 2.0F, 2.0F, 2.0F, -0.3F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(38, 23).addBox(-2.0F, 6.0F, -1.5F, 4.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(18, 30).addBox(-3.0F, 1.0F, -2.0F, 6.0F, 5.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(34, 30).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(40, 15).addBox(3.0F, 1.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(15, 39).addBox(-6.0F, 1.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 11).addBox(-6.0F, 19.0F, -2.0F, 12.0F, 3.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-6.0F, 22.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(5.0F, 22.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, true);
			body.setTextureOffset(16, 18).addBox(-5.0F, 18.0F, -2.0F, 10.0F, 1.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(28, 11).addBox(-4.0F, 17.0F, -1.5F, 8.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(33, 34).addBox(6.0F, 19.0F, -2.5F, 1.0F, 5.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(32, 0).addBox(-7.0F, 19.0F, -2.5F, 1.0F, 5.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 31).addBox(-3.0F, 9.0F, -1.5F, 6.0F, 8.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(39, 0).addBox(-3.0F, 11.0F, -2.5F, 6.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(53, 53).addBox(-2.4F, 10.0F, -2.4F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(53, 53).addBox(0.4F, 10.0F, -2.4F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(53, 53).addBox(-2.4F, 10.0F, 1.4F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(39, 0).addBox(-3.0F, 11.0F, 1.5F, 6.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(53, 53).addBox(0.4F, 10.0F, 1.4F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(8, 43).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.5F, 2.8333F, 0.0F);
			left_arm.setTextureOffset(27, 42).addBox(-1.0F, 1.1667F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 0).addBox(-0.5F, 5.1667F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_arm_r1 = new ModelRenderer(this);
			left_arm_r1.setRotationPoint(0.0F, 4.9167F, 0.0F);
			left_arm.addChild(left_arm_r1);
			setRotationAngle(left_arm_r1, -1.5708F, 0.0F, 0.0F);
			left_arm_r1.setTextureOffset(22, 23).addBox(-0.5F, 5.0F, -0.25F, 1.0F, 3.0F, 2.0F, 0.0F, false);
			left_arm_r1.setTextureOffset(0, 42).addBox(-1.0F, 1.0F, -0.25F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.5F, 2.8333F, 0.0F);
			right_arm.setTextureOffset(27, 42).addBox(-1.0F, 1.1667F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(0, 0).addBox(-0.5F, 5.1667F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			left_arm_r2 = new ModelRenderer(this);
			left_arm_r2.setRotationPoint(0.0F, 4.9167F, 0.0F);
			right_arm.addChild(left_arm_r2);
			setRotationAngle(left_arm_r2, -1.5708F, 0.0F, 0.0F);
			left_arm_r2.setTextureOffset(22, 23).addBox(-0.5F, 5.0F, -0.25F, 1.0F, 3.0F, 2.0F, 0.0F, true);
			left_arm_r2.setTextureOffset(0, 42).addBox(-1.0F, 1.0F, -0.25F, 2.0F, 4.0F, 2.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
