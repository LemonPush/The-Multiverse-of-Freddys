
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

import net.mcreator.themultiverseoffreddys.entity.DisembodiedEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DisembodiedRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DisembodiedEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelDisembodied(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/disembodied.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelDisembodied extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer front_right;
		private final ModelRenderer head_r2;
		private final ModelRenderer middle_right;
		private final ModelRenderer head_r3;
		private final ModelRenderer back_right;
		private final ModelRenderer head_r4;
		private final ModelRenderer front_left;
		private final ModelRenderer head_r5;
		private final ModelRenderer middle_left;
		private final ModelRenderer head_r6;
		private final ModelRenderer back_left;
		private final ModelRenderer head_r7;

		public ModelDisembodied() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 17.9F, 1.0F);
			head.setTextureOffset(0, 12).addBox(-3.5F, -9.0F, -5.0F, 7.0F, 6.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -12.0F, -5.5F, 8.0F, 3.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(0, 26).addBox(-3.5F, -7.0F, -3.0F, 7.0F, 6.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(26, 27).addBox(-2.5F, -1.9F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(28, 33).addBox(-3.5F, -2.0F, -4.4F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(22, 18).addBox(-4.0F, -4.0F, -9.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(30, 36).addBox(-1.0F, -4.5F, -9.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(34, 5).addBox(-4.0F, -3.0F, -9.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			head.setTextureOffset(20, 33).addBox(3.0F, -3.0F, -9.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -3.5F, -1.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.5672F, 0.0F, 0.0F);
			head_r1.setTextureOffset(25, 0).addBox(-3.5F, -0.7F, -8.3F, 7.0F, 1.0F, 4.0F, 0.0F, false);
			head_r1.setTextureOffset(22, 12).addBox(-4.0F, -0.7F, -4.3F, 8.0F, 1.0F, 4.0F, 0.0F, false);
			front_right = new ModelRenderer(this);
			front_right.setRotationPoint(-2.2118F, 17.0268F, -1.5F);
			setRotationAngle(front_right, 0.0F, -0.829F, 0.0F);
			front_right.setTextureOffset(4, 17).addBox(-0.3766F, -0.1743F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			front_right.setTextureOffset(8, 38).addBox(-2.8766F, 2.9732F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-3.8766F, 1.8257F, 0.0F);
			front_right.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 0.7854F);
			head_r2.setTextureOffset(12, 38).addBox(1.5F, -3.9F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			middle_right = new ModelRenderer(this);
			middle_right.setRotationPoint(-2.2118F, 17.0268F, 0.5F);
			middle_right.setTextureOffset(4, 5).addBox(-0.3766F, -0.1743F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			middle_right.setTextureOffset(0, 12).addBox(-2.8766F, 2.9732F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-3.8766F, 1.8257F, 0.0F);
			middle_right.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, 0.7854F);
			head_r3.setTextureOffset(4, 12).addBox(1.5F, -3.9F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			back_right = new ModelRenderer(this);
			back_right.setRotationPoint(-2.2118F, 17.0268F, 2.5F);
			setRotationAngle(back_right, 0.0F, 0.829F, 0.0F);
			back_right.setTextureOffset(0, 7).addBox(-0.3766F, -0.1743F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			back_right.setTextureOffset(0, 26).addBox(-2.8766F, 2.9732F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-3.1393F, 1.8257F, -0.6756F);
			back_right.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, 0.7854F);
			head_r4.setTextureOffset(20, 27).addBox(0.9787F, -3.3787F, 0.1756F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			front_left = new ModelRenderer(this);
			front_left.setRotationPoint(2.2118F, 17.0268F, -1.5F);
			setRotationAngle(front_left, 0.0F, 0.829F, 0.0F);
			front_left.setTextureOffset(0, 17).addBox(-0.6234F, -0.1743F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			front_left.setTextureOffset(0, 38).addBox(1.8766F, 2.9732F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(3.8766F, 1.8257F, 0.0F);
			front_left.addChild(head_r5);
			setRotationAngle(head_r5, 0.0F, 0.0F, -0.7854F);
			head_r5.setTextureOffset(4, 38).addBox(-2.5F, -3.9F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			middle_left = new ModelRenderer(this);
			middle_left.setRotationPoint(2.2118F, 17.0268F, 0.5F);
			middle_left.setTextureOffset(0, 5).addBox(-0.6234F, -0.1743F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			middle_left.setTextureOffset(0, 0).addBox(1.8766F, 2.9732F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(3.8766F, 1.8257F, 0.0F);
			middle_left.addChild(head_r6);
			setRotationAngle(head_r6, 0.0F, 0.0F, -0.7854F);
			head_r6.setTextureOffset(4, 0).addBox(-2.5F, -3.9F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			back_left = new ModelRenderer(this);
			back_left.setRotationPoint(2.2118F, 17.0268F, 2.5F);
			setRotationAngle(back_left, 0.0F, -0.829F, 0.0F);
			back_left.setTextureOffset(4, 7).addBox(-0.6234F, -0.1743F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			back_left.setTextureOffset(24, 27).addBox(1.8766F, 2.9732F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r7 = new ModelRenderer(this);
			head_r7.setRotationPoint(3.1393F, 1.8257F, -0.6756F);
			back_left.addChild(head_r7);
			setRotationAngle(head_r7, 0.0F, 0.0F, -0.7854F);
			head_r7.setTextureOffset(34, 5).addBox(-1.9787F, -3.3787F, 0.1756F, 1.0F, 4.0F, 1.0F, 0.0F, false);
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
