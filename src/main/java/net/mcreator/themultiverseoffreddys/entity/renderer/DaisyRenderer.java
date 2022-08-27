
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

import net.mcreator.themultiverseoffreddys.entity.DaisyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DaisyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DaisyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelDaisy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/daisy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelDaisy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer front_right;
		private final ModelRenderer head_r3;
		private final ModelRenderer middle_right;
		private final ModelRenderer head_r4;
		private final ModelRenderer back_right;
		private final ModelRenderer head_r5;
		private final ModelRenderer front_left;
		private final ModelRenderer head_r6;
		private final ModelRenderer middle_left;
		private final ModelRenderer head_r7;
		private final ModelRenderer back_left;
		private final ModelRenderer head_r8;

		public ModelDaisy() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 17.9F, 1.0F);
			head.setTextureOffset(0, 0).addBox(-3.5F, -9.0F, -5.0F, 7.0F, 6.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 23).addBox(-3.5F, -7.0F, -3.0F, 7.0F, 6.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(24, 14).addBox(-2.5F, -1.9F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(32, 20).addBox(-3.5F, -2.0F, -4.4F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(0, 14).addBox(-4.0F, -4.0F, -9.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(34, 28).addBox(-1.0F, -4.5F, -9.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(30, 5).addBox(-4.0F, -3.0F, -9.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(26, 28).addBox(3.0F, -3.0F, -9.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -3.5F, -1.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.5672F, 0.0F, 0.0F);
			head_r1.setTextureOffset(20, 23).addBox(-3.5F, -0.7F, -8.3F, 7.0F, 1.0F, 4.0F, 0.0F, false);
			head_r1.setTextureOffset(22, 0).addBox(-4.0F, -0.7F, -4.3F, 8.0F, 1.0F, 4.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(0.0F, -9.8667F, -5.0F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, -0.4363F, 0.0F, 0.0F);
			head_r2.setTextureOffset(0, 4).addBox(-1.0F, -0.9333F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 0).addBox(1.0F, -1.5333F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 0).addBox(-4.0F, -1.5333F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			front_right = new ModelRenderer(this);
			front_right.setRotationPoint(-2.2118F, 17.0268F, -1.5F);
			setRotationAngle(front_right, 0.0F, -0.829F, 0.0F);
			front_right.setTextureOffset(20, 23).addBox(-0.3766F, -0.1743F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			front_right.setTextureOffset(16, 35).addBox(-2.8766F, 2.9732F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-3.8766F, 1.8257F, 0.0F);
			front_right.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, 0.7854F);
			head_r3.setTextureOffset(20, 35).addBox(1.5F, -3.9F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			middle_right = new ModelRenderer(this);
			middle_right.setRotationPoint(-2.2118F, 17.0268F, 0.5F);
			middle_right.setTextureOffset(4, 19).addBox(-0.3766F, -0.1743F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			middle_right.setTextureOffset(0, 23).addBox(-2.8766F, 2.9732F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-3.8766F, 1.8257F, 0.0F);
			middle_right.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, 0.7854F);
			head_r4.setTextureOffset(24, 14).addBox(1.5F, -3.9F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			back_right = new ModelRenderer(this);
			back_right.setRotationPoint(-2.2118F, 17.0268F, 2.5F);
			setRotationAngle(back_right, 0.0F, 0.829F, 0.0F);
			back_right.setTextureOffset(22, 0).addBox(-0.3766F, -0.1743F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			back_right.setTextureOffset(26, 28).addBox(-2.8766F, 2.9732F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(-3.1393F, 1.8257F, -0.6756F);
			back_right.addChild(head_r5);
			setRotationAngle(head_r5, 0.0F, 0.0F, 0.7854F);
			head_r5.setTextureOffset(30, 5).addBox(0.9787F, -3.3787F, 0.1756F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			front_left = new ModelRenderer(this);
			front_left.setRotationPoint(2.2118F, 17.0268F, -1.5F);
			setRotationAngle(front_left, 0.0F, 0.829F, 0.0F);
			front_left.setTextureOffset(22, 5).addBox(-0.6234F, -0.1743F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			front_left.setTextureOffset(8, 35).addBox(1.8766F, 2.9732F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(3.8766F, 1.8257F, 0.0F);
			front_left.addChild(head_r6);
			setRotationAngle(head_r6, 0.0F, 0.0F, -0.7854F);
			head_r6.setTextureOffset(12, 35).addBox(-2.5F, -3.9F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			middle_left = new ModelRenderer(this);
			middle_left.setRotationPoint(2.2118F, 17.0268F, 0.5F);
			middle_left.setTextureOffset(0, 19).addBox(-0.6234F, -0.1743F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			middle_left.setTextureOffset(0, 14).addBox(1.8766F, 2.9732F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r7 = new ModelRenderer(this);
			head_r7.setRotationPoint(3.8766F, 1.8257F, 0.0F);
			middle_left.addChild(head_r7);
			setRotationAngle(head_r7, 0.0F, 0.0F, -0.7854F);
			head_r7.setTextureOffset(4, 14).addBox(-2.5F, -3.9F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			back_left = new ModelRenderer(this);
			back_left.setRotationPoint(2.2118F, 17.0268F, 2.5F);
			setRotationAngle(back_left, 0.0F, -0.829F, 0.0F);
			back_left.setTextureOffset(22, 2).addBox(-0.6234F, -0.1743F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			back_left.setTextureOffset(0, 35).addBox(1.8766F, 2.9732F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r8 = new ModelRenderer(this);
			head_r8.setRotationPoint(3.1393F, 1.8257F, -0.6756F);
			back_left.addChild(head_r8);
			setRotationAngle(head_r8, 0.0F, 0.0F, -0.7854F);
			head_r8.setTextureOffset(4, 35).addBox(-1.9787F, -3.3787F, 0.1756F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			front_right.render(matrixStack, buffer, packedLight, packedOverlay);
			middle_right.render(matrixStack, buffer, packedLight, packedOverlay);
			back_right.render(matrixStack, buffer, packedLight, packedOverlay);
			front_left.render(matrixStack, buffer, packedLight, packedOverlay);
			middle_left.render(matrixStack, buffer, packedLight, packedOverlay);
			back_left.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.middle_left.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.back_right.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.front_right.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.back_left.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.middle_right.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.front_left.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
