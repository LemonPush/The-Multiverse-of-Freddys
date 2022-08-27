
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

import net.mcreator.themultiverseoffreddys.entity.IgnitedPuppetEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class IgnitedPuppetRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(IgnitedPuppetEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelIgnitedPuppet(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/ignitedpuppet.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelIgnitedPuppet extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer right_leg;
		private final ModelRenderer bone2;
		private final ModelRenderer left_arm;
		private final ModelRenderer bone3;
		private final ModelRenderer right_arm;
		private final ModelRenderer bone4;
		private final ModelRenderer left_leg_r1;
		private final ModelRenderer left_leg;
		private final ModelRenderer bone;

		public ModelIgnitedPuppet() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.3F, -16.46F, 0.16F);
			setRotationAngle(head, 0.4363F, 0.0F, -0.2182F);
			head.setTextureOffset(0, 0).addBox(-3.3F, -8.04F, -2.16F, 6.0F, 4.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(16, 12).addBox(-0.3F, -4.04F, -2.16F, 3.0F, 3.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(28, 0).addBox(-0.05F, -6.94F, -2.26F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(28, 0).addBox(-2.55F, -6.94F, -2.26F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 17).addBox(-3.8F, -8.54F, -2.66F, 7.0F, 8.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(17, 0).addBox(-3.0F, -9.0F, -1.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(32, 21).addBox(-3.0F, -7.0F, -1.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(35, 6).addBox(1.0F, -9.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(0, 9).addBox(-3.0F, -14.0F, -1.0F, 6.0F, 5.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(31, 0).addBox(-1.5F, -14.0F, -2.05F, 3.0F, 3.0F, 3.0F, -1.0F, false);
			body.setTextureOffset(31, 0).addBox(-1.5F, -11.0F, -2.05F, 3.0F, 3.0F, 3.0F, -1.0F, false);
			body.setTextureOffset(31, 0).addBox(-1.5F, -12.5F, -2.05F, 3.0F, 3.0F, 3.0F, -1.0F, false);
			body.setTextureOffset(19, 6).addBox(-2.5F, -3.0F, -1.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(32, 31).addBox(-1.0F, -18.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(22, 35).addBox(-1.0F, -6.0F, -0.5F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(16, 36).addBox(0.0F, -4.0F, -0.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-0.9F, -0.3377F, 0.795F);
			body.addChild(right_leg);
			setRotationAngle(right_leg, -0.0418F, 0.0283F, 0.1278F);
			right_leg.setTextureOffset(32, 12).addBox(-1.5F, -0.425F, -1.2227F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(28, 35).addBox(-1.5F, 5.575F, -1.2227F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(1.6274F, 24.0575F, 2.5776F);
			right_leg.addChild(bone2);
			setRotationAngle(bone2, 0.2618F, 0.0F, 0.0F);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(2.5F, -12.5F, 0.09F);
			body.addChild(left_arm);
			setRotationAngle(left_arm, 3.1416F, 0.0F, 2.7489F);
			left_arm.setTextureOffset(0, 26).addBox(-2.4239F, -1.1173F, -1.5F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(0.2761F, 14.5827F, -0.5F);
			left_arm.addChild(bone3);
			setRotationAngle(bone3, 0.0F, 0.0F, -0.3491F);
			bone3.setTextureOffset(32, 25).addBox(-1.0F, -5.4F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-2.5F, -12.5F, 0.09F);
			setRotationAngle(right_arm, 3.1416F, 0.0F, -2.7489F);
			right_arm.setTextureOffset(0, 26).addBox(0.4239F, -1.1173F, -1.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(3.0412F, 23.2605F, 3.5503F);
			right_arm.addChild(bone4);
			setRotationAngle(bone4, 0.2618F, 0.0F, 0.0F);
			left_leg_r1 = new ModelRenderer(this);
			left_leg_r1.setRotationPoint(-2.0F, -13.0F, 0.0F);
			bone4.addChild(left_leg_r1);
			setRotationAngle(left_leg_r1, 0.6981F, 0.0F, 0.0F);
			left_leg_r1.setTextureOffset(24, 20).addBox(-0.6173F, -1.8838F, -0.2935F, 2.0F, 13.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(0.9F, -0.3377F, 0.795F);
			setRotationAngle(left_leg, -0.0418F, -0.0283F, -0.1278F);
			left_leg.setTextureOffset(8, 26).addBox(-0.5F, -0.425F, -1.2227F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(-1.6274F, 24.0575F, 2.5776F);
			left_leg.addChild(bone);
			setRotationAngle(bone, 0.2618F, 0.0F, 0.0F);
			bone.setTextureOffset(16, 20).addBox(1.1274F, -14.0197F, -0.1683F, 2.0F, 14.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
