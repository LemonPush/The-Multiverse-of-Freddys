
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

import net.mcreator.themultiverseoffreddys.entity.SecurityOwlEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SecurityOwlRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SecurityOwlEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelSecurityOwl(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/securityowl.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSecurityOwl extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer body;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;

		public ModelSecurityOwl() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(-0.6F, -4.9F, 0.6F);
			head.setTextureOffset(0, 44).addBox(-9.4F, -17.1F, -2.6F, 20.0F, 16.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(68, 20).addBox(-2.4F, -17.1F, -7.6F, 6.0F, 16.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(93, 60).addBox(-8.4F, -17.1F, -7.6F, 6.0F, 2.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(93, 90).addBox(-9.4F, -17.1F, -7.6F, 1.0F, 16.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(91, 35).addBox(-8.4F, -8.1F, -7.6F, 6.0F, 7.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(13, 69).addBox(-1.4F, -6.1F, -12.6F, 4.0F, 4.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 44).addBox(1.6F, -18.1F, -8.6F, 2.0F, 8.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(0, 44).addBox(-2.4F, -18.1F, -8.6F, 2.0F, 8.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(66, 64).addBox(5.1F, -13.1F, -3.6F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(66, 60).addBox(-6.9F, -13.1F, -3.6F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(44, 93).addBox(3.6F, -8.1F, -7.6F, 6.0F, 7.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(0, 99).addBox(9.6F, -17.1F, -7.6F, 1.0F, 16.0F, 5.0F, 0.0F, false);
			head.setTextureOffset(93, 75).addBox(3.6F, -17.1F, -7.6F, 6.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-1.4F, -17.6F, -4.1F);
			head.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, -0.5672F, 0.0F);
			cube_r1.setTextureOffset(66, 60).addBox(-3.2F, -0.5F, -3.2F, 2.0F, 1.0F, 8.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(2.6F, -17.6F, -4.1F);
			head.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.5672F, 0.0F);
			cube_r2.setTextureOffset(66, 60).addBox(1.2F, -0.5F, -3.2F, 2.0F, 1.0F, 8.0F, 0.0F, true);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-11.4F, -17.1F, -0.6F);
			head.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
			cube_r3.setTextureOffset(102, 67).addBox(-0.5F, -3.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(12.6F, -17.1F, -0.6F);
			head.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
			cube_r4.setTextureOffset(103, 16).addBox(-3.5F, -3.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.1818F, 11.6785F, -2.6142F);
			body.setTextureOffset(0, 0).addBox(-10.1818F, -17.6785F, -4.3858F, 20.0F, 30.0F, 14.0F, 0.0F, false);
			body.setTextureOffset(49, 44).addBox(-9.1818F, 10.3215F, 15.6142F, 18.0F, 2.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(66, 52).addBox(-6.1818F, 10.3215F, 9.6142F, 12.0F, 2.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(68, 0).addBox(-8.1818F, -12.6785F, -5.3858F, 16.0F, 19.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(12, 99).addBox(17.8182F, -19.6785F, 0.6142F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(84, 90).addBox(18.8182F, -18.6785F, 1.6142F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(102, 8).addBox(18.3182F, -23.6785F, 1.1142F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(102, 0).addBox(-22.6818F, -23.6785F, 1.1142F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			body.setTextureOffset(96, 47).addBox(-23.1818F, -19.6785F, 0.6142F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(85, 20).addBox(-22.1818F, -18.6785F, 1.6142F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(13.5749F, -15.6785F, 2.6142F);
			body.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, -0.3927F, -0.0873F);
			cube_r5.setTextureOffset(71, 90).addBox(0.4122F, 16.0F, -1.0906F, 2.0F, 6.0F, 9.0F, 0.0F, true);
			cube_r5.setTextureOffset(90, 20).addBox(0.4122F, 10.0F, -1.0906F, 2.0F, 6.0F, 9.0F, 0.0F, true);
			cube_r5.setTextureOffset(22, 84).addBox(0.4122F, 4.0F, -1.0906F, 2.0F, 6.0F, 9.0F, 0.0F, true);
			cube_r5.setTextureOffset(0, 84).addBox(0.4122F, -2.0F, -1.0906F, 2.0F, 6.0F, 9.0F, 0.0F, true);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(13.5749F, -15.6785F, 2.6142F);
			body.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.3927F, -0.0873F);
			cube_r6.setTextureOffset(80, 75).addBox(0.4122F, -2.0F, -7.9094F, 2.0F, 6.0F, 9.0F, 0.0F, true);
			cube_r6.setTextureOffset(80, 60).addBox(0.4122F, 10.0F, -7.9094F, 2.0F, 6.0F, 9.0F, 0.0F, true);
			cube_r6.setTextureOffset(22, 69).addBox(0.4122F, 4.0F, -7.9094F, 2.0F, 6.0F, 9.0F, 0.0F, true);
			cube_r6.setTextureOffset(0, 69).addBox(0.4122F, 16.0F, -7.9094F, 2.0F, 6.0F, 9.0F, 0.0F, true);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(10.6182F, -5.6785F, 2.6142F);
			body.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -0.0873F);
			cube_r7.setTextureOffset(44, 55).addBox(-2.0F, -11.4F, -7.0F, 4.0F, 24.0F, 14.0F, 0.0F, true);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-13.9385F, -15.6785F, 2.6142F);
			body.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, -0.3927F, 0.0873F);
			cube_r8.setTextureOffset(0, 69).addBox(-2.4122F, 16.0F, -7.9094F, 2.0F, 6.0F, 9.0F, 0.0F, false);
			cube_r8.setTextureOffset(80, 60).addBox(-2.4122F, 10.0F, -7.9094F, 2.0F, 6.0F, 9.0F, 0.0F, false);
			cube_r8.setTextureOffset(22, 69).addBox(-2.4122F, 4.0F, -7.9094F, 2.0F, 6.0F, 9.0F, 0.0F, false);
			cube_r8.setTextureOffset(80, 75).addBox(-2.4122F, -2.0F, -7.9094F, 2.0F, 6.0F, 9.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-10.9818F, -5.6785F, 2.6142F);
			body.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, 0.0873F);
			cube_r9.setTextureOffset(44, 55).addBox(-2.0F, -11.4F, -7.0F, 4.0F, 24.0F, 14.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(-13.9385F, -15.6785F, 2.6142F);
			body.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.0F, 0.3927F, 0.0873F);
			cube_r10.setTextureOffset(71, 90).addBox(-2.4122F, 16.0F, -1.0906F, 2.0F, 6.0F, 9.0F, 0.0F, false);
			cube_r10.setTextureOffset(90, 20).addBox(-2.4122F, 10.0F, -1.0906F, 2.0F, 6.0F, 9.0F, 0.0F, false);
			cube_r10.setTextureOffset(22, 84).addBox(-2.4122F, 4.0F, -1.0906F, 2.0F, 6.0F, 9.0F, 0.0F, false);
			cube_r10.setTextureOffset(0, 84).addBox(-2.4122F, -2.0F, -1.0906F, 2.0F, 6.0F, 9.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(9.3449F, 11.3215F, -3.4805F);
			body.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.0F, -0.7854F, 0.0F);
			cube_r11.setTextureOffset(0, 0).addBox(2.2F, -1.0F, -2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r11.setTextureOffset(13, 84).addBox(1.7F, 0.0F, -3.5F, 2.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r11.setTextureOffset(0, 7).addBox(-0.8F, -1.0F, -2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r11.setTextureOffset(102, 53).addBox(-1.3F, 0.0F, -3.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r11.setTextureOffset(54, 0).addBox(-3.8F, -1.0F, -2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r11.setTextureOffset(59, 98).addBox(-4.3F, 0.0F, -3.5F, 2.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(-9.7085F, 11.3215F, -3.4805F);
			body.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.0F, 0.7854F, 0.0F);
			cube_r12.setTextureOffset(36, 99).addBox(-0.2F, -1.0F, -2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r12.setTextureOffset(44, 105).addBox(-3.2F, -1.0F, -2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r12.setTextureOffset(25, 99).addBox(2.3F, 0.0F, -3.5F, 2.0F, 1.0F, 7.0F, 0.0F, false);
			cube_r12.setTextureOffset(54, 7).addBox(2.8F, -1.0F, -2.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r12.setTextureOffset(12, 105).addBox(-0.7F, 0.0F, -3.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r12.setTextureOffset(100, 83).addBox(-3.7F, 0.0F, -3.5F, 2.0F, 1.0F, 7.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
