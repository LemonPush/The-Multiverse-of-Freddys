
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

import net.mcreator.themultiverseoffreddys.entity.ChopNRollEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ChopNRollRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ChopNRollEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelChopNRoll(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/chopnroll.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelChopNRoll extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer right_arm;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;

		public ModelChopNRoll() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 4.25F, 0.625F);
			head.setTextureOffset(0, 12).addBox(-3.5F, -9.25F, -3.625F, 7.0F, 1.0F, 7.0F, 0.0F, false);
			head.setTextureOffset(0, 30).addBox(-2.0F, -11.25F, -2.125F, 4.0F, 2.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(24, 15).addBox(-2.5F, -8.25F, -2.625F, 5.0F, 7.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-0.5F, -5.0F, -4.625F, 1.0F, 1.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 22.0F, 0.0F);
			body.setTextureOffset(0, 20).addBox(-3.0F, -18.0F, -2.5F, 6.0F, 4.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(39, 14).addBox(-1.0F, -17.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(25, 7).addBox(-2.5F, -13.0F, -2.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(24, 27).addBox(-1.0F, -19.0F, -0.5F, 2.0F, 12.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-4.5F, -4.0F, -2.5F, 9.0F, 6.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(32, 27).addBox(4.5F, -7.0F, -0.5F, 1.0F, 7.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(32, 27).addBox(-5.5F, -7.0F, -0.5F, 1.0F, 7.0F, 2.0F, 0.0F, true);
			body.setTextureOffset(24, 0).addBox(-4.5F, -7.0F, -0.5F, 9.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(3.5F, 5.1429F, 0.7143F);
			setRotationAngle(left_arm, 0.0F, 0.0F, -0.3927F);
			left_arm.setTextureOffset(0, 12).addBox(0.5F, 1.3571F, -0.7143F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm.setTextureOffset(38, 27).addBox(0.0F, 3.3571F, -1.2143F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(8, 36).addBox(0.5F, 3.8571F, -4.2143F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(21, 14).addBox(0.0F, -0.6429F, -1.2143F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(1.0F, 4.1071F, -4.2143F);
			left_arm.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3927F);
			cube_r1.setTextureOffset(0, 36).addBox(-1.0F, -0.75F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(35, 33).addBox(-0.5F, -7.75F, -4.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			cube_r1.setTextureOffset(16, 30).addBox(-0.5F, -8.25F, -1.5F, 1.0F, 10.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 2.3571F, -0.2143F);
			left_arm.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3927F);
			cube_r2.setTextureOffset(0, 3).addBox(-1.9F, -2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-3.5F, 5.1429F, 0.7143F);
			setRotationAngle(right_arm, 0.0F, 0.0F, 0.3927F);
			right_arm.setTextureOffset(0, 12).addBox(-1.5F, 1.3571F, -0.7143F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			right_arm.setTextureOffset(38, 27).addBox(-2.0F, 3.3571F, -1.2143F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			right_arm.setTextureOffset(8, 36).addBox(-1.5F, 3.8571F, -4.2143F, 1.0F, 1.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(21, 14).addBox(-2.0F, -0.6429F, -1.2143F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-1.0F, 4.1071F, -4.2143F);
			right_arm.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3927F);
			cube_r3.setTextureOffset(0, 36).addBox(-1.0F, -0.75F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
			cube_r3.setTextureOffset(35, 33).addBox(-0.5F, -7.75F, -4.5F, 1.0F, 3.0F, 3.0F, 0.0F, true);
			cube_r3.setTextureOffset(16, 30).addBox(-0.5F, -8.25F, -1.5F, 1.0F, 10.0F, 1.0F, 0.0F, true);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, 2.3571F, -0.2143F);
			right_arm.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3927F);
			cube_r4.setTextureOffset(0, 3).addBox(-0.1F, -2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
