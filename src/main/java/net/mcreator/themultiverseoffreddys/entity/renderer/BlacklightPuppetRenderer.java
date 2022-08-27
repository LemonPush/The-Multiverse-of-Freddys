
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

import net.mcreator.themultiverseoffreddys.entity.BlacklightPuppetEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BlacklightPuppetRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BlacklightPuppetEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPuppet(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/blacklight_puppet.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelPuppet extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer right_arm;
		private final ModelRenderer bone4;
		private final ModelRenderer left_leg_r1;
		private final ModelRenderer left_arm;
		private final ModelRenderer bone3;
		private final ModelRenderer left_leg_r2;
		private final ModelRenderer right_leg;
		private final ModelRenderer bone2;
		private final ModelRenderer left_leg;
		private final ModelRenderer bone;

		public ModelPuppet() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -13.0F, -0.5F);
			head.setTextureOffset(0, 0).addBox(-3.0F, -11.5F, -1.5F, 6.0F, 7.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(17, 0).addBox(0.25F, -10.4F, -1.6F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(17, 0).addBox(-2.25F, -10.4F, -1.6F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(18, 12).addBox(-3.5F, -12.0F, -2.0F, 7.0F, 8.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(0, 12).addBox(-3.0F, -14.0F, -1.0F, 6.0F, 8.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(22, 6).addBox(-1.5F, -14.0F, -2.05F, 3.0F, 3.0F, 3.0F, -1.0F, false);
			body.setTextureOffset(22, 6).addBox(-1.5F, -11.0F, -2.05F, 3.0F, 3.0F, 3.0F, -1.0F, false);
			body.setTextureOffset(22, 6).addBox(-1.5F, -12.5F, -2.05F, 3.0F, 3.0F, 3.0F, -1.0F, false);
			body.setTextureOffset(22, 0).addBox(-2.5F, -3.0F, -1.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(32, 25).addBox(-1.0F, -18.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(32, 19).addBox(-1.0F, -6.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-2.5F, -12.5F, 0.09F);
			setRotationAngle(right_arm, 3.1416F, 0.0F, -2.7489F);
			right_arm.setTextureOffset(8, 23).addBox(0.4239F, -1.1173F, -1.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			bone4 = new ModelRenderer(this);
			bone4.setRotationPoint(3.0412F, 23.2605F, 3.5503F);
			right_arm.addChild(bone4);
			setRotationAngle(bone4, 0.2618F, 0.0F, 0.0F);
			left_leg_r1 = new ModelRenderer(this);
			left_leg_r1.setRotationPoint(-2.0F, -13.0F, 0.0F);
			bone4.addChild(left_leg_r1);
			setRotationAngle(left_leg_r1, 0.6981F, 0.0F, 0.0F);
			left_leg_r1.setTextureOffset(0, 23).addBox(-0.6173F, -1.8838F, -0.2935F, 2.0F, 13.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(2.5F, -12.5F, 0.09F);
			setRotationAngle(left_arm, 3.1416F, 0.0F, 2.7489F);
			left_arm.setTextureOffset(8, 23).addBox(-2.4239F, -1.1173F, -1.5F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			bone3 = new ModelRenderer(this);
			bone3.setRotationPoint(-3.0412F, 23.2605F, 3.5503F);
			left_arm.addChild(bone3);
			setRotationAngle(bone3, 0.2618F, 0.0F, 0.0F);
			left_leg_r2 = new ModelRenderer(this);
			left_leg_r2.setRotationPoint(2.0F, -13.0F, 0.0F);
			bone3.addChild(left_leg_r2);
			setRotationAngle(left_leg_r2, 0.6981F, 0.0F, 0.0F);
			left_leg_r2.setTextureOffset(0, 23).addBox(-1.3827F, -1.8838F, -0.2935F, 2.0F, 13.0F, 2.0F, 0.0F, true);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-0.9F, -0.3377F, 0.795F);
			setRotationAngle(right_leg, -0.0418F, 0.0283F, 0.1278F);
			right_leg.setTextureOffset(24, 21).addBox(-1.5F, -0.425F, -1.2227F, 2.0F, 11.0F, 2.0F, 0.0F, true);
			bone2 = new ModelRenderer(this);
			bone2.setRotationPoint(1.6274F, 24.0575F, 2.5776F);
			right_leg.addChild(bone2);
			setRotationAngle(bone2, 0.2618F, 0.0F, 0.0F);
			bone2.setTextureOffset(16, 21).addBox(-3.1274F, -14.0197F, -0.1683F, 2.0F, 14.0F, 2.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(0.9F, -0.3377F, 0.795F);
			setRotationAngle(left_leg, -0.0418F, -0.0283F, -0.1278F);
			left_leg.setTextureOffset(24, 21).addBox(-0.5F, -0.425F, -1.2227F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(-1.6274F, 24.0575F, 2.5776F);
			left_leg.addChild(bone);
			setRotationAngle(bone, 0.2618F, 0.0F, 0.0F);
			bone.setTextureOffset(16, 21).addBox(1.1274F, -14.0197F, -0.1683F, 2.0F, 14.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
