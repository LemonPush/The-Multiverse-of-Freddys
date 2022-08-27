
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

import net.mcreator.themultiverseoffreddys.entity.SpringChicaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SpringChicaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SpringChicaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelSpringChica(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/springchica.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSpringChica extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer jaw;
		private final ModelRenderer skull;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelSpringChica() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -0.253F, 0.1333F);
			head.setTextureOffset(26, 20).addBox(-2.0F, -2.947F, 2.3667F, 4.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(9, 55).addBox(-1.0F, -4.947F, 2.3667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(17, 52).addBox(-1.0F, -6.447F, 1.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(36, 50).addBox(-1.0F, -7.947F, 0.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-4.0F, -8.447F, -4.1333F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -8.947F, -0.1333F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 1.5708F, -1.1345F, -1.5708F);
			head_r1.setTextureOffset(0, 29).addBox(-1.4516F, -2.4437F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(0.0F, -8.947F, -0.1333F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, -1.5708F, -1.1345F, 1.5708F);
			head_r2.setTextureOffset(0, 16).addBox(0.4516F, -2.4437F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(1.05F, -8.947F, -0.1333F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, 0.0F, 0.0F, 0.4363F);
			head_r3.setTextureOffset(32, 7).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-1.05F, -8.947F, -0.1333F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0F, 0.0F, -0.4363F);
			head_r4.setTextureOffset(48, 22).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
			jaw = new ModelRenderer(this);
			jaw.setRotationPoint(0.0F, -1.1807F, -0.0361F);
			head.addChild(jaw);
			setRotationAngle(jaw, 0.1309F, 0.0F, 0.0F);
			skull = new ModelRenderer(this);
			skull.setRotationPoint(0.0F, 22.053F, -0.1333F);
			head.addChild(skull);
			skull.setTextureOffset(13, 33).addBox(-2.0F, -25.0F, -3.0F, 4.0F, 2.0F, 5.0F, 0.25F, false);
			skull.setTextureOffset(20, 23).addBox(-2.5F, -29.5F, -3.0F, 5.0F, 4.0F, 6.0F, 0.25F, false);
			skull.setTextureOffset(50, 0).addBox(-2.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			skull.setTextureOffset(14, 48).addBox(0.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(45, 36).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 8.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(24, 0).addBox(-3.5F, 8.5F, -2.0F, 7.0F, 3.0F, 4.0F, 0.25F, false);
			body.setTextureOffset(55, 31).addBox(-3.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(54, 16).addBox(-3.0F, 4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(52, 29).addBox(-3.0F, 5.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 6).addBox(1.0F, 5.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 33).addBox(1.0F, 4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(6, 37).addBox(1.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(21, 16).addBox(-5.0F, 0.25F, -1.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(26, 33).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(54, 47).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.9F, 0.85F, 0.0F);
			left_arm.setTextureOffset(20, 40).addBox(1.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(54, 9).addBox(0.6F, -0.6F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(51, 52).addBox(0.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(53, 0).addBox(0.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(53, 40).addBox(0.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(12, 55).addBox(0.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, false);
			left_arm.setTextureOffset(42, 0).addBox(1.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.9F, 0.85F, 0.0F);
			right_arm.setTextureOffset(37, 38).addBox(-3.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(25, 51).addBox(-3.6F, -0.6F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			right_arm.setTextureOffset(42, 48).addBox(-3.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(5, 48).addBox(-3.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
			right_arm.setTextureOffset(45, 15).addBox(-3.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			right_arm.setTextureOffset(0, 55).addBox(-3.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, false);
			right_arm.setTextureOffset(12, 29).addBox(-3.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
			left_leg.setTextureOffset(29, 38).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(44, 4).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(37, 55).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			left_leg.setTextureOffset(43, 28).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.25F, false);
			left_leg.setTextureOffset(53, 33).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			left_leg.setTextureOffset(32, 7).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
			right_leg.setTextureOffset(0, 37).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(8, 40).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			right_leg.setTextureOffset(0, 0).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
			right_leg.setTextureOffset(36, 20).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.25F, false);
			right_leg.setTextureOffset(52, 22).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 3.0F, 0.25F, false);
			right_leg.setTextureOffset(0, 29).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.25F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
