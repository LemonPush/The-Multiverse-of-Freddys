
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

import net.mcreator.themultiverseoffreddys.entity.TamedWitheredGlamrockChicaEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedWitheredGlamrockChicaRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedWitheredGlamrockChicaEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelBrokenGlamrockChica(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/brokenglamrockchica.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelBrokenGlamrockChica extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer head_r3;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer head_r6;
		private final ModelRenderer head_r7;
		private final ModelRenderer head_r8;
		private final ModelRenderer head_r9;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelBrokenGlamrockChica() {
			textureWidth = 64;
			textureHeight = 64;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -2.0F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 27).addBox(4.0F, -11.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(40, 0).addBox(4.5F, -10.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(40, 0).addBox(-5.5F, -10.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 27).addBox(-5.0F, -11.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 19).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(24, 4).addBox(-2.5F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 6).addBox(0.5F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(26, 18).addBox(0.5F, -12.5F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-1.3893F, -14.5706F, -1.2242F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.209F, 0.2413F, -1.5172F);
			head_r1.setTextureOffset(12, 38).addBox(1.4108F, -3.8161F, -0.2699F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(-1.3893F, -14.5706F, -1.2242F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.3168F, 0.0265F, -0.753F);
			head_r2.setTextureOffset(0, 15).addBox(-0.151F, -3.0107F, -0.2699F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-1.3893F, -14.5706F, -0.0242F);
			head.addChild(head_r3);
			setRotationAngle(head_r3, -0.1956F, 0.2431F, -1.8774F);
			head_r3.setTextureOffset(12, 38).addBox(1.4108F, -3.8161F, -0.2699F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-1.3893F, -14.5706F, -0.0242F);
			head.addChild(head_r4);
			setRotationAngle(head_r4, 0.0386F, 0.3085F, -1.062F);
			head_r4.setTextureOffset(0, 15).addBox(-0.151F, -3.0107F, -0.2699F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(-1.6741F, -13.3024F, -0.3169F);
			head.addChild(head_r5);
			setRotationAngle(head_r5, -0.3075F, 0.1713F, -2.1622F);
			head_r5.setTextureOffset(12, 38).addBox(1.6067F, -2.8662F, 1.8508F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(-1.6741F, -13.3024F, -0.3169F);
			head.addChild(head_r6);
			setRotationAngle(head_r6, -0.096F, 0.3378F, -1.3666F);
			head_r6.setTextureOffset(0, 15).addBox(0.6592F, -2.4776F, 1.8508F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			head_r7 = new ModelRenderer(this);
			head_r7.setRotationPoint(1.7811F, -15.7214F, -1.2883F);
			head.addChild(head_r7);
			setRotationAngle(head_r7, -0.3414F, 1.1007F, -0.1713F);
			head_r7.setTextureOffset(0, 38).addBox(-0.5F, -0.5333F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r7.setTextureOffset(0, 38).addBox(-0.5F, -0.5333F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r7.setTextureOffset(40, 3).addBox(-0.5F, 0.0667F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r8 = new ModelRenderer(this);
			head_r8.setRotationPoint(-1.6741F, -13.3024F, -1.3169F);
			head.addChild(head_r8);
			setRotationAngle(head_r8, -1.2725F, 0.9386F, -1.3277F);
			head_r8.setTextureOffset(42, 28).addBox(-1.644F, -3.0869F, 0.3076F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			head_r9 = new ModelRenderer(this);
			head_r9.setRotationPoint(-1.5F, -11.5F, -3.7F);
			head.addChild(head_r9);
			setRotationAngle(head_r9, 0.2292F, 0.2958F, 0.0082F);
			head_r9.setTextureOffset(38, 28).addBox(-1.0F, -1.0F, -0.9F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(26, 9).addBox(-5.0F, 6.0F, -3.0F, 10.0F, 3.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(0, 15).addBox(-5.0F, -6.0F, -3.0F, 10.0F, 6.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(40, 0).addBox(4.5F, -7.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(40, 0).addBox(-9.5F, -7.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, true);
			body.setTextureOffset(0, 27).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 6.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-6.0F, -5.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(52, 6).addBox(5.0F, -5.5F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(21, 28).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(48, 18).addBox(-1.5F, -8.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(4.5F, -5.0F, 0.0F);
			left_arm.setTextureOffset(17, 51).addBox(1.5F, 3.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(0, 49).addBox(2.0F, -1.5F, -1.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(50, 34).addBox(1.5F, 9.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(44, 45).addBox(1.0F, 10.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-4.5F, -5.0F, 0.0F);
			right_arm.setTextureOffset(28, 45).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(16, 39).addBox(-5.0F, 3.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(17, 51).addBox(-4.5F, 3.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(50, 34).addBox(-4.5F, 9.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(44, 45).addBox(-5.0F, 10.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(0, 38).addBox(-2.1F, 7.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(38, 35).addBox(-2.1F, 0.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(28, 39).addBox(-2.1F, 6.5F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(8, 49).addBox(-1.6F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(48, 23).addBox(-1.6F, 6.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 0).addBox(-2.6F, 14.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 0).addBox(1.4F, 14.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 0).addBox(-2.6F, 14.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(24, 0).addBox(-0.6F, 14.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(26, 28).addBox(-1.9F, 7.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(38, 35).addBox(-1.9F, 0.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
			right_leg.setTextureOffset(28, 39).addBox(-1.9F, 6.5F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, true);
			right_leg.setTextureOffset(8, 49).addBox(-1.4F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(48, 23).addBox(-1.4F, 6.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(24, 0).addBox(-2.4F, 14.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, true);
			right_leg.setTextureOffset(24, 0).addBox(-2.4F, 14.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(24, 0).addBox(-0.4F, 14.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(24, 0).addBox(1.6F, 14.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
