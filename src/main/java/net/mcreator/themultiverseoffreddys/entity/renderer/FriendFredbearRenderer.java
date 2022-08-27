
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

import net.mcreator.themultiverseoffreddys.entity.FriendFredbearEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FriendFredbearRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FriendFredbearEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelfriend_fredbear(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/friend_fredbear.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelfriend_fredbear extends EntityModel<Entity> {
		private final ModelRenderer bone;

		public Modelfriend_fredbear() {
			textureWidth = 64;
			textureHeight = 64;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 6.0F);
			bone.setTextureOffset(32, 20).addBox(3.0F, -6.0F, -8.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(32, 20).addBox(-3.0F, -6.0F, -8.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-7.0F, -18.0F, -8.0F, 14.0F, 12.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(32, 20).addBox(-9.0F, -6.0F, -8.0F, 6.0F, 6.0F, 4.0F, 0.0F, true);
			bone.setTextureOffset(32, 20).addBox(5.0F, -17.0F, -8.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 16).addBox(-6.0F, -26.0F, -8.0F, 12.0F, 8.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(32, 12).addBox(-5.0F, -32.0F, -8.0F, 10.0F, 4.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 28).addBox(-7.0F, -28.0F, -8.0F, 14.0F, 2.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(32, 20).addBox(-11.0F, -17.0F, -8.0F, 6.0F, 6.0F, 4.0F, 0.0F, true);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.bone.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.bone.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
