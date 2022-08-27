
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

import net.mcreator.themultiverseoffreddys.entity.FriendlyGoldenHeadEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FriendlyGoldenHeadRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FriendlyGoldenHeadEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelWitheredGoldenFreddyHead(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/witheredgoldenfreddyhead.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.3
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelWitheredGoldenFreddyHead extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer bone;
		private final ModelRenderer right_arm_r2_r1;
		private final ModelRenderer right_arm_r6_r1;
		private final ModelRenderer right_arm_r6_r2;
		private final ModelRenderer bone_r1;
		private final ModelRenderer right_arm_r4;

		public ModelWitheredGoldenFreddyHead() {
			textureWidth = 256;
			textureHeight = 256;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 24.0F, 0.0F);
			setRotationAngle(head, 0.0F, 0.0F, 0.0F);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, -52.0F, 6.0F);
			head.addChild(bone);
			bone.setTextureOffset(128, 24).addBox(-14.8658F, 27.4718F, -29.5097F, 28.0F, 4.0F, 16.0F, 0.0F, false);
			bone.setTextureOffset(100, 0).addBox(-14.8658F, 19.4718F, -29.5097F, 28.0F, 8.0F, 16.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-18.8658F, -0.1282F, -17.9097F, 36.0F, 28.0F, 28.0F, 0.0F, false);
			bone.setTextureOffset(112, 100).addBox(-12.6158F, -3.8782F, -14.7597F, 23.0F, 7.0F, 23.0F, -0.25F, false);
			bone.setTextureOffset(0, 172).addBox(-8.6158F, -14.8782F, -10.7597F, 15.0F, 14.0F, 14.0F, -0.25F, false);
			bone.setTextureOffset(96, 56).addBox(-18.8658F, 27.8718F, -17.9097F, 36.0F, 4.0F, 28.0F, 0.0F, false);
			bone.setTextureOffset(96, 56).addBox(-18.8658F, 31.8718F, -17.9097F, 36.0F, 8.0F, 28.0F, 0.0F, false);
			bone.setTextureOffset(84, 130).addBox(17.1342F, 19.8718F, -17.9097F, 4.0F, 16.0F, 28.0F, 0.0F, false);
			bone.setTextureOffset(84, 130).addBox(-22.8658F, 19.8718F, -17.9097F, 4.0F, 16.0F, 28.0F, 0.0F, true);
			bone.setTextureOffset(132, 158).addBox(-10.8658F, 17.0718F, -28.7097F, 20.0F, 4.0F, 16.0F, 0.0F, false);
			bone.setTextureOffset(0, 10).addBox(-4.8658F, 13.0718F, -28.7097F, 8.0F, 4.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 100).addBox(-16.8658F, 0.1095F, -15.1282F, 32.0F, 16.0F, 24.0F, 0.0F, false);
			right_arm_r2_r1 = new ModelRenderer(this);
			right_arm_r2_r1.setRotationPoint(-22.9995F, 130.568F, -3.7903F);
			bone.addChild(right_arm_r2_r1);
			setRotationAngle(right_arm_r2_r1, 1.5708F, 0.0F, -0.7854F);
			right_arm_r2_r1.setTextureOffset(120, 130).addBox(86.5F, -5.0F, 88.0F, 17.0F, 10.0F, 18.0F, 0.25F, false);
			right_arm_r6_r1 = new ModelRenderer(this);
			right_arm_r6_r1.setRotationPoint(7.1342F, 9.3095F, -31.1282F);
			bone.addChild(right_arm_r6_r1);
			setRotationAngle(right_arm_r6_r1, -1.5708F, 0.0F, 0.0F);
			right_arm_r6_r1.setTextureOffset(0, 56).addBox(-21.25F, -18.45F, -2.35F, 10.0F, 6.0F, 10.0F, 0.25F, false);
			right_arm_r6_r1.setTextureOffset(0, 56).addBox(-5.25F, -18.45F, -2.35F, 10.0F, 6.0F, 10.0F, 0.25F, false);
			right_arm_r6_r2 = new ModelRenderer(this);
			right_arm_r6_r2.setRotationPoint(-8.8658F, 10.6611F, -36.4166F);
			bone.addChild(right_arm_r6_r2);
			setRotationAngle(right_arm_r6_r2, -1.5708F, 0.0F, 0.0F);
			right_arm_r6_r2.setTextureOffset(0, 0).addBox(-5.75F, -24.15F, -8.45F, 11.0F, 7.0F, 3.0F, -0.25F, false);
			right_arm_r6_r2.setTextureOffset(0, 0).addBox(10.25F, -24.15F, -8.45F, 11.0F, 7.0F, 3.0F, -0.25F, false);
			bone_r1 = new ModelRenderer(this);
			bone_r1.setRotationPoint(0.0F, 29.8F, -5.0F);
			bone.addChild(bone_r1);
			setRotationAngle(bone_r1, 0.1309F, 0.0F, 0.0F);
			bone_r1.setTextureOffset(128, 24).addBox(-14.8658F, 3.9721F, -25.0107F, 28.0F, 4.0F, 16.0F, 0.0F, false);
			bone_r1.setTextureOffset(0, 140).addBox(-18.8658F, 7.9721F, -13.0107F, 4.0F, 4.0F, 28.0F, 0.0F, true);
			bone_r1.setTextureOffset(0, 140).addBox(13.1342F, 7.9721F, -13.0107F, 4.0F, 4.0F, 28.0F, 0.0F, false);
			bone_r1.setTextureOffset(0, 56).addBox(-14.8658F, 7.9721F, -25.0107F, 28.0F, 4.0F, 40.0F, 0.0F, false);
			right_arm_r4 = new ModelRenderer(this);
			right_arm_r4.setRotationPoint(32.0F, -44.0F, 36.0F);
			bone.addChild(right_arm_r4);
			setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}

}
