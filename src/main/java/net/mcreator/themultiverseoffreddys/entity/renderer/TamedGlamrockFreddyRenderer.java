
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

import net.mcreator.themultiverseoffreddys.entity.TamedGlamrockFreddyEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TamedGlamrockFreddyRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TamedGlamrockFreddyEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelGlamrockFreddy(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/glamrockfreddy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelGlamrockFreddy extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer jaw;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer bracelet;
		private final ModelRenderer right_arm_r1;
		private final ModelRenderer right_arm;
		private final ModelRenderer bracelet2;
		private final ModelRenderer right_arm_r2;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public ModelGlamrockFreddy() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(1.196F, -8.7608F, 0.2F);
			head.setTextureOffset(42, 38).addBox(-1.696F, -4.2392F, -7.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(52, 28).addBox(-3.196F, -8.7392F, -2.2F, 4.0F, 1.0F, 4.0F, 0.0F, false);
			head.setTextureOffset(12, 57).addBox(-2.696F, -11.2392F, -1.7F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(24, 18).addBox(-5.696F, -3.7392F, -4.2F, 9.0F, 2.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(50, 38).addBox(-4.196F, -3.7392F, -6.7F, 6.0F, 2.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 14).addBox(-5.196F, -7.7392F, -4.2F, 8.0F, 4.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 26).addBox(-3.946F, -2.2392F, -6.6F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			head.setTextureOffset(0, 26).addBox(0.554F, -2.2392F, -6.6F, 1.0F, 1.0F, 3.0F, 0.0F, true);
			head.setTextureOffset(24, 19).addBox(-0.696F, -5.7392F, -4.4F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(24, 19).addBox(-3.696F, -5.7392F, -4.4F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(122, 0).addBox(-4.446F, -6.4892F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			head.setTextureOffset(122, 0).addBox(0.054F, -6.4892F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(16, 39).addBox(-3.696F, -6.7392F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head.setTextureOffset(38, 28).addBox(-0.696F, -6.7392F, -4.4F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-4.7061F, -7.2392F, -0.2F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, -1.0472F);
			head_r1.setTextureOffset(41, 7).addBox(-0.5071F, -0.9071F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			head_r1.setTextureOffset(0, 30).addBox(-1.4929F, -3.9213F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, true);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(2.314F, -7.2392F, -0.2F);
			head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, 1.0472F);
			head_r2.setTextureOffset(41, 7).addBox(-0.4929F, -0.9071F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(36, 6).addBox(-0.2071F, -2.75F, -0.49F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 4).addBox(-0.2071F, -2.75F, -0.51F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(16, 37).addBox(0.2929F, -2.75F, -0.49F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 38).addBox(0.2929F, -2.75F, -0.51F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(0, 30).addBox(-1.5071F, -3.9213F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			jaw = new ModelRenderer(this);
			jaw.setRotationPoint(-1.196F, -1.2749F, -0.0571F);
			head.addChild(jaw);
			setRotationAngle(jaw, 0.1745F, 0.0F, 0.0F);
			jaw.setTextureOffset(50, 43).addBox(-3.0F, 0.0357F, -6.1429F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			jaw.setTextureOffset(0, 26).addBox(-4.0F, 0.0357F, -4.1429F, 8.0F, 1.0F, 8.0F, 0.0F, false);
			jaw.setTextureOffset(45, 59).addBox(-1.25F, -0.7143F, -6.0429F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			jaw.setTextureOffset(0, 26).addBox(-2.75F, -0.4643F, -6.0429F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			jaw.setTextureOffset(24, 15).addBox(-2.9F, -0.7143F, -6.0429F, 1.0F, 1.0F, 3.0F, 0.0F, false);
			jaw.setTextureOffset(24, 15).addBox(1.9F, -0.7143F, -6.0429F, 1.0F, 1.0F, 3.0F, 0.0F, true);
			jaw.setTextureOffset(0, 26).addBox(1.75F, -0.4643F, -6.0429F, 1.0F, 1.0F, 3.0F, 0.0F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -2.0F, 0.0F);
			body.setTextureOffset(27, 30).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 0).addBox(-6.1F, -6.0F, -3.0F, 12.0F, 8.0F, 6.0F, 0.0F, false);
			body.setTextureOffset(30, 0).addBox(5.5F, -7.0F, -2.5F, 6.0F, 1.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 20).addBox(5.5F, -6.0F, -3.1F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 28).addBox(5.5F, -7.0F, -3.1F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 28).addBox(5.5F, -7.0F, 2.1F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 20).addBox(5.5F, -6.0F, 2.1F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 28).addBox(-11.5F, -7.0F, 2.1F, 6.0F, 1.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(0, 20).addBox(-8.5F, -6.0F, 2.1F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(30, 0).addBox(-11.5F, -7.0F, -2.5F, 6.0F, 1.0F, 5.0F, 0.0F, true);
			body.setTextureOffset(24, 28).addBox(-11.5F, -7.0F, -3.1F, 6.0F, 1.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(0, 20).addBox(-8.5F, -6.0F, -3.1F, 3.0F, 1.0F, 1.0F, 0.0F, true);
			body.setTextureOffset(31, 9).addBox(-4.5F, 2.0F, -2.5F, 9.0F, 4.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(42, 40).addBox(-0.5F, -5.3F, -4.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 35).addBox(0.5F, -5.8F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 30).addBox(-2.5F, -5.8F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(22, 38).addBox(-4.5F, -5.0F, -3.5F, 9.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(32, 53).addBox(-3.5F, 2.0F, -3.0F, 7.0F, 4.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(0, 14).addBox(-6.0F, -5.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(54, 7).addBox(6.0F, -6.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
			body.setTextureOffset(54, 7).addBox(-9.0F, -6.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
			body.setTextureOffset(0, 54).addBox(-1.5F, -10.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.5F, 0.0F);
			left_arm.setTextureOffset(50, 49).addBox(1.0F, 6.45F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(38, 42).addBox(1.0F, -1.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(24, 58).addBox(1.5F, 5.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(57, 33).addBox(1.5F, 12.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_arm.setTextureOffset(50, 18).addBox(1.0F, 12.9F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			bracelet = new ModelRenderer(this);
			bracelet.setRotationPoint(3.0F, 10.0F, 0.0F);
			left_arm.addChild(bracelet);
			bracelet.setTextureOffset(30, 0).addBox(1.0F, -0.5F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bracelet.setTextureOffset(30, 0).addBox(-2.0F, -0.5F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bracelet.setTextureOffset(30, 0).addBox(-0.5F, -0.5F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bracelet.setTextureOffset(47, 1).addBox(-2.5F, -1.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			bracelet.setTextureOffset(47, 1).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
			bracelet.setTextureOffset(30, 0).addBox(1.0F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bracelet.setTextureOffset(30, 0).addBox(-0.5F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bracelet.setTextureOffset(30, 0).addBox(-2.0F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r1 = new ModelRenderer(this);
			right_arm_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bracelet.addChild(right_arm_r1);
			setRotationAngle(right_arm_r1, 0.0F, 1.5708F, 0.0F);
			right_arm_r1.setTextureOffset(30, 0).addBox(1.0F, -0.5F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(30, 0).addBox(-0.5F, -0.5F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(30, 0).addBox(-2.0F, -0.5F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(30, 0).addBox(-0.5F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(30, 0).addBox(-2.0F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm_r1.setTextureOffset(30, 0).addBox(1.0F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.5F, 0.0F);
			right_arm.setTextureOffset(50, 49).addBox(-5.0F, 6.45F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(38, 42).addBox(-5.0F, -1.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, true);
			right_arm.setTextureOffset(24, 58).addBox(-4.5F, 5.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(57, 33).addBox(-4.5F, 12.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);
			right_arm.setTextureOffset(50, 18).addBox(-5.0F, 12.9F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
			bracelet2 = new ModelRenderer(this);
			bracelet2.setRotationPoint(-3.0F, 10.0F, 0.0F);
			right_arm.addChild(bracelet2);
			bracelet2.setTextureOffset(30, 0).addBox(-2.0F, -0.5F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			bracelet2.setTextureOffset(30, 0).addBox(1.0F, -0.5F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			bracelet2.setTextureOffset(30, 0).addBox(-0.5F, -0.5F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			bracelet2.setTextureOffset(47, 1).addBox(-2.5F, -1.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, true);
			bracelet2.setTextureOffset(47, 1).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, true);
			bracelet2.setTextureOffset(30, 0).addBox(-2.0F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			bracelet2.setTextureOffset(30, 0).addBox(-0.5F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			bracelet2.setTextureOffset(30, 0).addBox(1.0F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm_r2 = new ModelRenderer(this);
			right_arm_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bracelet2.addChild(right_arm_r2);
			setRotationAngle(right_arm_r2, 0.0F, -1.5708F, 0.0F);
			right_arm_r2.setTextureOffset(30, 0).addBox(-2.0F, -0.5F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm_r2.setTextureOffset(30, 0).addBox(-0.5F, -0.5F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm_r2.setTextureOffset(30, 0).addBox(1.0F, -0.5F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm_r2.setTextureOffset(30, 0).addBox(-0.5F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm_r2.setTextureOffset(30, 0).addBox(1.0F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_arm_r2.setTextureOffset(30, 0).addBox(-2.0F, -0.5F, 1.7F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 7.0F, 0.0F);
			left_leg.setTextureOffset(16, 46).addBox(-2.1F, 8.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(38, 42).addBox(-2.1F, 0.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(16, 35).addBox(-2.1F, 7.5F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(59, 13).addBox(-1.6F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(36, 58).addBox(-1.6F, 7.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 35).addBox(-2.6F, 15.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, false);
			left_leg.setTextureOffset(30, 2).addBox(-0.6F, 16.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(30, 2).addBox(-2.4F, 16.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(30, 2).addBox(1.2F, 16.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(-2.75F, 15.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(-2.05F, 15.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(-0.95F, 15.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(-0.25F, 15.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(1.55F, 15.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(0, 0).addBox(0.85F, 15.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 7.0F, 0.0F);
			right_leg.setTextureOffset(16, 46).addBox(-1.9F, 8.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, true);
			right_leg.setTextureOffset(38, 42).addBox(-1.9F, 0.5F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, true);
			right_leg.setTextureOffset(16, 35).addBox(-1.9F, 7.5F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, true);
			right_leg.setTextureOffset(59, 13).addBox(-1.4F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(36, 58).addBox(-1.4F, 7.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 35).addBox(-2.4F, 15.0F, -3.0F, 5.0F, 2.0F, 6.0F, 0.0F, true);
			right_leg.setTextureOffset(30, 2).addBox(-0.4F, 16.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_leg.setTextureOffset(30, 2).addBox(1.4F, 16.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_leg.setTextureOffset(30, 2).addBox(-2.2F, 16.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 0).addBox(1.75F, 15.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 0).addBox(1.05F, 15.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 0).addBox(-0.05F, 15.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 0).addBox(-0.75F, 15.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 0).addBox(-2.55F, 15.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
			right_leg.setTextureOffset(0, 0).addBox(-1.85F, 15.0F, -5.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
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
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
