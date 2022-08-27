
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

import net.mcreator.themultiverseoffreddys.entity.FriendlyFacesEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FriendlyFacesRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FriendlyFacesEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelFriendlyFaces(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/friendlyfaces.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelFriendlyFaces extends EntityModel<Entity> {
		private final ModelRenderer back_left_leg;
		private final ModelRenderer back_right_leg;
		private final ModelRenderer front_left_leg;
		private final ModelRenderer front_right_leg;
		private final ModelRenderer tail;
		private final ModelRenderer tail_r1;
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer rotation;

		public ModelFriendlyFaces() {
			textureWidth = 64;
			textureHeight = 64;
			back_left_leg = new ModelRenderer(this);
			back_left_leg.setRotationPoint(-1.1F, 18.0F, 5.0F);
			back_left_leg.setTextureOffset(26, 10).addBox(1.2F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			back_right_leg = new ModelRenderer(this);
			back_right_leg.setRotationPoint(1.1F, 18.0F, 5.0F);
			back_right_leg.setTextureOffset(8, 22).addBox(-3.2F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			front_left_leg = new ModelRenderer(this);
			front_left_leg.setRotationPoint(-1.1F, 14.0F, -5.0F);
			front_left_leg.setTextureOffset(0, 22).addBox(1.2F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			front_right_leg = new ModelRenderer(this);
			front_right_leg.setRotationPoint(1.1F, 14.0F, -5.0F);
			front_right_leg.setTextureOffset(20, 0).addBox(-3.2F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 14.5F, 9.0F);
			setRotationAngle(tail, 2.7053F, 0.0F, 0.0F);
			tail.setTextureOffset(24, 31).addBox(-0.5F, -0.4F, -0.2F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			tail_r1 = new ModelRenderer(this);
			tail_r1.setRotationPoint(0.0F, 7.6F, 0.3F);
			tail.addChild(tail_r1);
			setRotationAngle(tail_r1, 0.6353F, 0.4981F, -0.5749F);
			tail_r1.setTextureOffset(28, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 15.0F, -9.0F);
			head.setTextureOffset(17, 19).addBox(-4.5F, -6.0F, -1.0F, 9.0F, 9.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(16, 31).addBox(-4.0F, -9.0F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			head.setTextureOffset(8, 30).addBox(2.0F, -9.0F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 6.0F, 6.1F);
			rotation = new ModelRenderer(this);
			rotation.setRotationPoint(0.0F, 11.0F, -5.1F);
			body.addChild(rotation);
			setRotationAngle(rotation, 1.5708F, 0.0F, 0.0F);
			rotation.setTextureOffset(0, 0).addBox(-2.0F, -8.0F, -2.9F, 4.0F, 16.0F, 6.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			back_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			back_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			front_left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			front_right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			tail.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.front_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.back_right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.back_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.front_left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		}
	}

}
