
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

import net.mcreator.themultiverseoffreddys.entity.RaceCarEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RaceCarRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RaceCarEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelRaceCar(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/racecar.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelRaceCar extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;

		public ModelRaceCar() {
			textureWidth = 128;
			textureHeight = 128;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(-0.0468F, 19.7766F, 1.0F);
			setRotationAngle(bone, 0.0F, 1.5708F, 0.0F);
			bone.setTextureOffset(0, 32).addBox(8.3468F, 0.2234F, 8.0F, 7.0F, 4.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(-22.6532F, 3.2234F, -8.0F, 38.0F, 1.0F, 16.0F, 0.0F, false);
			bone.setTextureOffset(0, 44).addBox(-29.6532F, 3.2234F, -8.0F, 7.0F, 1.0F, 16.0F, 0.0F, false);
			bone.setTextureOffset(54, 46).addBox(-20.6532F, 0.2234F, 9.01F, 24.0F, 4.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 38).addBox(9.3468F, 2.2234F, 9.01F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(46, 22).addBox(8.7968F, 1.4734F, 9.01F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(46, 22).addBox(7.9968F, 0.5734F, 9.01F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(46, 22).addBox(7.6968F, 0.2234F, 9.01F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 38).addBox(9.4468F, 2.2234F, 9.01F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(58, 22).addBox(-27.6532F, -2.7766F, 0.0F, 8.0F, 1.0F, 10.0F, 0.0F, false);
			bone.setTextureOffset(32, 22).addBox(-26.6532F, -1.7766F, 9.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 27).addBox(-27.6532F, -1.7766F, 8.0F, 8.0F, 3.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(32, 22).addBox(3.3468F, -1.7766F, 9.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 22).addBox(2.3468F, -1.7766F, 8.0F, 8.0F, 3.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(32, 30).addBox(2.3468F, -2.7766F, 8.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(8, 55).addBox(-24.6532F, -4.7766F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(30, 46).addBox(-25.6532F, -6.7766F, -8.0F, 4.0F, 2.0F, 16.0F, 0.0F, false);
			bone.setTextureOffset(38, 53).addBox(-24.6532F, -4.7766F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(32, 37).addBox(-27.1532F, -6.7766F, -10.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(32, 33).addBox(-27.1532F, -6.7766F, 8.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(8, 48).addBox(-27.1532F, -8.7766F, -10.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(8, 0).addBox(-27.1532F, -8.7766F, 8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(20, 76).addBox(-30.4532F, 2.5234F, 0.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			bone.setTextureOffset(20, 76).addBox(-30.4532F, 3.2234F, 0.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			bone.setTextureOffset(0, 17).addBox(-29.6532F, 1.2234F, 8.0F, 39.0F, 3.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(82, 101).addBox(11.3968F, -2.2766F, -10.0F, 3.0F, 7.0F, 20.0F, -1.0F, false);
			bone.setTextureOffset(32, 24).addBox(14.4468F, 2.2234F, -10.0F, 3.0F, 2.0F, 20.0F, 0.0F, false);
			bone.setTextureOffset(0, 0).addBox(6.7679F, -11.1897F, -3.0F, 1.0F, 6.0F, 6.0F, 0.0F, false);
			bone.setTextureOffset(58, 33).addBox(-3.6532F, -0.7766F, -4.5F, 9.0F, 1.0F, 9.0F, 0.0F, false);
			bone.setTextureOffset(54, 51).addBox(-19.6532F, 0.2234F, 8.0F, 23.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 32).addBox(8.3468F, 0.2234F, -10.0F, 7.0F, 4.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 44).addBox(-29.6532F, 3.2234F, -8.0F, 7.0F, 1.0F, 16.0F, 0.0F, false);
			bone.setTextureOffset(54, 46).addBox(-20.6532F, 0.2234F, -10.01F, 24.0F, 4.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 38).addBox(9.3468F, 2.2234F, -10.01F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(46, 22).addBox(8.7968F, 1.4734F, -10.01F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(46, 22).addBox(7.9968F, 0.5734F, -10.01F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(46, 22).addBox(7.6968F, 0.2234F, -10.01F, 8.0F, 1.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(0, 38).addBox(9.4468F, 2.2234F, -10.01F, 8.0F, 2.0F, 1.0F, 0.0F, false);
			bone.setTextureOffset(58, 22).addBox(-27.6532F, -2.7766F, -10.0F, 8.0F, 1.0F, 10.0F, 0.0F, false);
			bone.setTextureOffset(32, 22).addBox(-26.6532F, -1.7766F, -11.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 27).addBox(-27.6532F, -1.7766F, -10.0F, 8.0F, 3.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(32, 22).addBox(3.3468F, -1.7766F, -11.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(0, 22).addBox(2.3468F, -1.7766F, -10.0F, 8.0F, 3.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(32, 30).addBox(2.3468F, -2.7766F, -10.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(20, 76).addBox(-30.4532F, 2.5234F, -10.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			bone.setTextureOffset(20, 76).addBox(-30.4532F, 3.2234F, -10.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
			bone.setTextureOffset(0, 17).addBox(-29.6532F, 1.2234F, -10.0F, 39.0F, 3.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(54, 51).addBox(-19.6532F, 0.2234F, -10.0F, 23.0F, 1.0F, 2.0F, 0.0F, false);
			bone.setTextureOffset(72, 68).addBox(-1.6532F, 0.2234F, 0.0F, 5.0F, 1.0F, 8.0F, 0.0F, false);
			bone.setTextureOffset(72, 68).addBox(-1.6532F, 0.2234F, -8.0F, 5.0F, 1.0F, 8.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(2.5741F, -1.5998F, -9.0F);
			bone.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -1.0908F);
			cube_r1.setTextureOffset(30, 55).addBox(-6.5774F, -2.8518F, 1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(30, 55).addBox(-6.5774F, -2.8518F, 15.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 44).addBox(-5.0774F, -0.7518F, -1.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 44).addBox(-5.0774F, -0.7518F, 17.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(2.5741F, -2.0998F, -9.0F);
			bone.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -1.0908F);
			cube_r2.setTextureOffset(30, 51).addBox(-7.5774F, -2.6268F, 1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r2.setTextureOffset(30, 51).addBox(-7.5774F, -2.6268F, 15.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-15.8806F, -1.5998F, -9.0F);
			bone.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, 1.0908F);
			cube_r3.setTextureOffset(54, 54).addBox(10.4774F, -16.1518F, 1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r3.setTextureOffset(54, 54).addBox(10.4774F, -16.1518F, 15.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-15.8806F, -2.0998F, -9.0F);
			bone.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 1.0908F);
			cube_r4.setTextureOffset(0, 53).addBox(11.4774F, -15.9268F, 1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r4.setTextureOffset(0, 53).addBox(11.4774F, -15.9268F, 15.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(16.4577F, 5.7463F, 0.0F);
			bone.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, 0.8727F);
			cube_r5.setTextureOffset(0, 0).addBox(-5.2109F, -3.0228F, -10.001F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r5.setTextureOffset(0, 48).addBox(-17.0183F, -2.9947F, -2.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r5.setTextureOffset(30, 46).addBox(-16.0183F, -3.0947F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			cube_r5.setTextureOffset(32, 76).addBox(-16.0183F, -2.9947F, -2.0F, 8.0F, 2.0F, 4.0F, 0.0F, false);
			cube_r5.setTextureOffset(0, 0).addBox(-5.2109F, -3.0228F, 9.001F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r5.setTextureOffset(0, 22).addBox(-8.0609F, -3.0228F, -10.0F, 6.0F, 2.0F, 20.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(10.1194F, -1.5998F, -9.0F);
			bone.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, 1.0908F);
			cube_r6.setTextureOffset(0, 12).addBox(-0.9226F, -0.7518F, -1.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r6.setTextureOffset(0, 12).addBox(1.2774F, -1.8518F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r6.setTextureOffset(0, 12).addBox(1.2774F, -1.8518F, 17.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r6.setTextureOffset(0, 12).addBox(-0.9226F, -0.7518F, 17.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-27.4259F, -1.5998F, 9.0F);
			bone.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -1.0908F);
			cube_r7.setTextureOffset(20, 64).addBox(-5.0774F, -0.7518F, -19.0F, 6.0F, 2.0F, 10.0F, 0.0F, false);
			cube_r7.setTextureOffset(20, 64).addBox(-5.0774F, -0.7518F, -9.0F, 6.0F, 2.0F, 10.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-19.8806F, -1.5998F, 9.0F);
			bone.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.0F, 0.0F, 1.0908F);
			cube_r8.setTextureOffset(88, 110).addBox(4.7774F, -0.7518F, -17.0F, 1.0F, 2.0F, 16.0F, 0.0F, false);
			cube_r8.setTextureOffset(60, 54).addBox(-0.9226F, -0.7518F, -19.0F, 6.0F, 2.0F, 10.0F, 0.0F, false);
			cube_r8.setTextureOffset(60, 54).addBox(-0.9226F, -0.7518F, -9.0F, 6.0F, 2.0F, 10.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-3.1532F, 0.2234F, 0.0F);
			bone.addChild(cube_r9);
			setRotationAngle(cube_r9, 0.0F, 0.0F, -0.1309F);
			cube_r9.setTextureOffset(29, 109).addBox(-0.5F, -20.0F, -5.5F, 1.0F, 8.0F, 11.0F, 0.0F, false);
			cube_r9.setTextureOffset(0, 61).addBox(-0.5F, -12.0F, -4.5F, 1.0F, 12.0F, 9.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
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
	}

}
