
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

import net.mcreator.themultiverseoffreddys.entity.PizzaMonsterEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PizzaMonsterRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PizzaMonsterEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPizzaMonster(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/pizzamonster.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelPizzaMonster extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;

		public ModelPizzaMonster() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 2.5F, -0.25F);
			head.setTextureOffset(55, 14).addBox(-5.0F, -0.5F, -4.75F, 10.0F, 4.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(0, 15).addBox(-5.0F, -10.5F, -4.75F, 10.0F, 10.0F, 10.0F, 0.0F, false);
			bone = new ModelRenderer(this);
			bone.setRotationPoint(-7.0F, 12.0F, 0.0F);
			bone.setTextureOffset(0, 0).addBox(0.0F, 11.0F, -7.0F, 14.0F, 1.0F, 14.0F, 0.0F, false);
			bone.setTextureOffset(42, 0).addBox(5.0F, 2.0F, -2.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(16, 51).addBox(5.0F, -12.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			bone.setTextureOffset(0, 35).addBox(2.0F, -8.0F, -2.0F, 10.0F, 10.0F, 4.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, -1.5708F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 49).addBox(-2.0F, -2.0F, -8.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
			cube_r1.setTextureOffset(28, 35).addBox(12.0F, -2.0F, -4.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
			cube_r1.setTextureOffset(40, 15).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
			cube_r1.setTextureOffset(44, 35).addBox(12.0F, -2.0F, -8.0F, 4.0F, 16.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
