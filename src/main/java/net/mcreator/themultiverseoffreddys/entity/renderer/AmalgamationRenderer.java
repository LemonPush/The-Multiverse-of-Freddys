
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

import net.mcreator.themultiverseoffreddys.entity.AmalgamationEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AmalgamationRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AmalgamationEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelAmalgamation(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("ultimate_fnaf_mod:textures/entities/amalgamation.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.1.5
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelAmalgamation extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer freddy_head;
		private final ModelRenderer head_r1;
		private final ModelRenderer head_r2;
		private final ModelRenderer bonnie_head;
		private final ModelRenderer head_r3;
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer body_r2;
		private final ModelRenderer foxy_head;
		private final ModelRenderer head_r4;
		private final ModelRenderer head_r5;
		private final ModelRenderer head_r6;
		private final ModelRenderer head_r7;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer body_r3;
		private final ModelRenderer chica_head;
		private final ModelRenderer head_r8;
		private final ModelRenderer head_r9;
		private final ModelRenderer head_r10;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public ModelAmalgamation() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -6.0F, 0.0F);
			freddy_head = new ModelRenderer(this);
			freddy_head.setRotationPoint(0.0F, 17.0F, 0.0F);
			head.addChild(freddy_head);
			freddy_head.setTextureOffset(24, 24).addBox(-4.0F, -27.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			freddy_head.setTextureOffset(0, 80).addBox(-2.0F, -31.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
			freddy_head.setTextureOffset(56, 10).addBox(-3.0F, -28.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			freddy_head.setTextureOffset(67, 24).addBox(-4.0F, -19.0F, -6.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
			freddy_head.setTextureOffset(74, 64).addBox(-4.0F, -20.0F, -6.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
			freddy_head.setTextureOffset(32, 50).addBox(-4.0F, -22.5F, -6.8F, 8.0F, 2.0F, 3.0F, 0.0F, false);
			freddy_head.setTextureOffset(80, 47).addBox(-3.0F, -23.0F, -6.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			freddy_head.setTextureOffset(84, 57).addBox(-1.0F, -24.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			freddy_head.setTextureOffset(86, 71).addBox(-2.8F, -25.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			freddy_head.setTextureOffset(66, 86).addBox(0.7F, -25.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			freddy_head.setTextureOffset(26, 65).addBox(0.7F, -26.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			freddy_head.setTextureOffset(20, 65).addBox(-2.8F, -26.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			freddy_head.setTextureOffset(10, 59).addBox(-5.0F, -22.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			freddy_head.setTextureOffset(58, 55).addBox(4.0F, -22.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(-4.5F, -26.5F, 0.0F);
			freddy_head.addChild(head_r1);
			setRotationAngle(head_r1, 0.0F, 0.0F, 0.6109F);
			head_r1.setTextureOffset(62, 76).addBox(-3.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r1.setTextureOffset(6, 67).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r2 = new ModelRenderer(this);
			head_r2.setRotationPoint(4.5F, -26.5F, 0.0F);
			freddy_head.addChild(head_r2);
			setRotationAngle(head_r2, 0.0F, 0.0F, -0.6109F);
			head_r2.setTextureOffset(83, 36).addBox(0.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			head_r2.setTextureOffset(67, 42).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bonnie_head = new ModelRenderer(this);
			bonnie_head.setRotationPoint(-10.995F, -15.7867F, -0.8274F);
			setRotationAngle(bonnie_head, 0.0F, 0.0F, -0.4363F);
			bonnie_head.setTextureOffset(24, 8).addBox(-3.1598F, -2.0259F, -2.1726F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			bonnie_head.setTextureOffset(74, 28).addBox(-2.5598F, 5.9741F, -4.1726F, 7.0F, 1.0F, 3.0F, 0.0F, false);
			bonnie_head.setTextureOffset(50, 81).addBox(-2.5598F, 4.9741F, -4.1726F, 7.0F, 1.0F, 2.0F, 0.0F, false);
			bonnie_head.setTextureOffset(70, 17).addBox(-2.6598F, 2.4741F, -4.9726F, 7.0F, 2.0F, 3.0F, 0.0F, false);
			bonnie_head.setTextureOffset(79, 32).addBox(-2.1598F, 1.9741F, -4.6726F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			bonnie_head.setTextureOffset(83, 40).addBox(-0.1598F, 0.9741F, -4.6726F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			bonnie_head.setTextureOffset(30, 86).addBox(-1.9598F, -0.5259F, -2.6726F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bonnie_head.setTextureOffset(86, 22).addBox(1.5402F, -0.5259F, -2.6726F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			bonnie_head.setTextureOffset(32, 57).addBox(-4.1598F, 2.4741F, -2.1726F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			bonnie_head.setTextureOffset(0, 56).addBox(4.8402F, 2.4741F, -2.1726F, 1.0F, 3.0F, 8.0F, 0.0F, false);
			bonnie_head.setTextureOffset(62, 66).addBox(2.3402F, -2.5259F, 1.3274F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bonnie_head.setTextureOffset(58, 48).addBox(1.3402F, -6.5259F, 0.9274F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			bonnie_head.setTextureOffset(58, 66).addBox(2.3402F, -7.5259F, 1.3274F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bonnie_head.setTextureOffset(56, 32).addBox(-2.6598F, -6.5259F, 0.9274F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			bonnie_head.setTextureOffset(66, 34).addBox(-1.6598F, -7.5259F, 1.3274F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			bonnie_head.setTextureOffset(66, 48).addBox(-1.6598F, -2.5259F, 1.3274F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r3 = new ModelRenderer(this);
			head_r3.setRotationPoint(-2.005F, -8.2133F, 1.4274F);
			bonnie_head.addChild(head_r3);
			setRotationAngle(head_r3, 0.3927F, 0.0F, 0.0F);
			head_r3.setTextureOffset(28, 78).addBox(-0.1548F, -3.1746F, -0.8063F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head_r3.setTextureOffset(28, 81).addBox(-0.6548F, -2.1746F, -0.8063F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			head_r3.setTextureOffset(38, 83).addBox(3.8452F, -3.1746F, -0.8063F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			head_r3.setTextureOffset(80, 81).addBox(3.3452F, -2.1746F, -0.8063F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -1.0F, 0.0F);
			body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(0, 40).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
			body.setTextureOffset(66, 0).addBox(-4.0F, -3.0F, -3.5F, 8.0F, 7.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(10, 56).addBox(-3.5F, -4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(32, 55).addBox(-3.5F, 4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(48, 14).addBox(-3.0F, -5.0F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(36, 86).addBox(-1.0F, -5.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(86, 6).addBox(1.0F, -6.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(60, 84).addBox(-3.0F, -6.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			body.setTextureOffset(24, 84).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(42, 57).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(84, 54).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body.setTextureOffset(52, 84).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(-5.0F, -7.5F, 0.2F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, 0.0F, 0.0F, -0.5672F);
			body_r1.setTextureOffset(0, 16).addBox(-3.0F, -3.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			body_r2 = new ModelRenderer(this);
			body_r2.setRotationPoint(5.0F, -7.5F, 0.2F);
			body.addChild(body_r2);
			setRotationAngle(body_r2, 0.0F, 0.0F, 0.5672F);
			body_r2.setTextureOffset(0, 56).addBox(1.0F, -3.5F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			foxy_head = new ModelRenderer(this);
			foxy_head.setRotationPoint(10.5261F, -11.375F, -1.2433F);
			body.addChild(foxy_head);
			setRotationAngle(foxy_head, 0.0F, 0.0F, 0.48F);
			foxy_head.setTextureOffset(0, 0).addBox(-5.4496F, -4.399F, -0.7567F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			foxy_head.setTextureOffset(34, 40).addBox(-2.1496F, -5.899F, 2.6433F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			foxy_head.setTextureOffset(48, 40).addBox(-4.4496F, 3.601F, -6.7567F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			foxy_head.setTextureOffset(0, 32).addBox(-4.4496F, 2.601F, -6.7567F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			foxy_head.setTextureOffset(0, 32).addBox(-4.4496F, 1.101F, -6.7567F, 6.0F, 1.0F, 6.0F, 0.0F, false);
			foxy_head.setTextureOffset(56, 17).addBox(-3.4496F, -0.399F, -6.5567F, 4.0F, 1.0F, 6.0F, 0.0F, false);
			foxy_head.setTextureOffset(48, 24).addBox(-4.4496F, 0.101F, -6.9567F, 6.0F, 1.0F, 7.0F, 0.0F, false);
			foxy_head.setTextureOffset(52, 74).addBox(-2.4496F, -0.899F, -6.2567F, 2.0F, 1.0F, 6.0F, 0.0F, false);
			foxy_head.setTextureOffset(67, 28).addBox(-2.4496F, -1.499F, -6.2567F, 2.0F, 1.0F, 2.0F, -0.1F, false);
			foxy_head.setTextureOffset(48, 44).addBox(-4.2496F, -2.899F, -1.2567F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			foxy_head.setTextureOffset(48, 28).addBox(-0.7496F, -2.899F, -1.2567F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			foxy_head.setTextureOffset(56, 38).addBox(-0.7496F, -3.899F, -1.2567F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			foxy_head.setTextureOffset(56, 21).addBox(-4.2496F, -3.899F, -1.2567F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			foxy_head.setTextureOffset(48, 24).addBox(2.5504F, 0.601F, 1.2433F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			foxy_head.setTextureOffset(48, 74).addBox(2.5504F, 0.601F, 2.2433F, 3.0F, 3.0F, 1.0F, 0.0F, false);
			foxy_head.setTextureOffset(68, 81).addBox(2.5504F, 0.601F, 3.2433F, 4.0F, 3.0F, 2.0F, 0.0F, false);
			head_r4 = new ModelRenderer(this);
			head_r4.setRotationPoint(-0.5261F, -4.125F, 1.7433F);
			foxy_head.addChild(head_r4);
			setRotationAngle(head_r4, -0.5236F, 1.5708F, 0.0F);
			head_r4.setTextureOffset(24, 0).addBox(-2.0F, -2.3746F, 2.0132F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r4.setTextureOffset(10, 58).addBox(-2.0F, -5.8746F, 1.0132F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head_r4.setTextureOffset(0, 32).addBox(-2.0F, -6.3746F, 1.5132F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head_r4.setTextureOffset(26, 56).addBox(-2.0F, -6.8746F, 2.0132F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r5 = new ModelRenderer(this);
			head_r5.setRotationPoint(-0.5261F, -4.125F, 1.7433F);
			foxy_head.addChild(head_r5);
			setRotationAngle(head_r5, -0.5236F, -1.5708F, 0.0F);
			head_r5.setTextureOffset(16, 70).addBox(1.0F, -6.7981F, 2.6128F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			head_r5.setTextureOffset(62, 38).addBox(1.0F, -7.7981F, 3.6128F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			head_r5.setTextureOffset(18, 32).addBox(1.0F, -7.2981F, 3.1128F, 1.0F, 4.0F, 2.0F, 0.0F, false);
			head_r5.setTextureOffset(0, 42).addBox(1.0F, -3.2981F, 3.6128F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r6 = new ModelRenderer(this);
			head_r6.setRotationPoint(-0.0261F, -3.225F, 3.1433F);
			foxy_head.addChild(head_r6);
			setRotationAngle(head_r6, 0.0F, 0.0F, 0.2618F);
			head_r6.setTextureOffset(0, 39).addBox(-1.4512F, -2.3746F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			head_r7 = new ModelRenderer(this);
			head_r7.setRotationPoint(-1.0261F, -3.225F, 3.1433F);
			foxy_head.addChild(head_r7);
			setRotationAngle(head_r7, 0.0F, 0.0F, -0.2618F);
			head_r7.setTextureOffset(51, 50).addBox(-1.6329F, -2.9526F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
			left_arm.setTextureOffset(0, 70).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(74, 72).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			left_arm.setTextureOffset(84, 51).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(44, 84).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_arm.setTextureOffset(12, 76).addBox(1.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
			right_arm.setTextureOffset(46, 64).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(36, 74).addBox(-5.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
			right_arm.setTextureOffset(0, 67).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(42, 61).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_arm.setTextureOffset(74, 8).addBox(-5.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			body_r3 = new ModelRenderer(this);
			body_r3.setRotationPoint(-5.9412F, 2.0635F, 0.2F);
			right_arm.addChild(body_r3);
			setRotationAngle(body_r3, 0.0F, 0.0F, -1.1345F);
			body_r3.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			chica_head = new ModelRenderer(this);
			chica_head.setRotationPoint(-9.0111F, -1.9532F, -2.9355F);
			right_arm.addChild(chica_head);
			setRotationAngle(chica_head, 0.0F, 0.0F, -0.8727F);
			chica_head.setTextureOffset(0, 16).addBox(-3.9889F, -3.0468F, -1.0645F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			chica_head.setTextureOffset(25, 40).addBox(1.5111F, -6.0468F, 1.4355F, 3.0F, 2.0F, 3.0F, 0.0F, false);
			chica_head.setTextureOffset(30, 45).addBox(2.0111F, -4.0468F, 1.9355F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			chica_head.setTextureOffset(24, 3).addBox(2.5111F, -7.0468F, 2.4355F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			chica_head.setTextureOffset(68, 58).addBox(-2.9889F, 3.9532F, -4.0645F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			chica_head.setTextureOffset(78, 67).addBox(-2.9889F, 2.9532F, -4.0645F, 6.0F, 1.0F, 3.0F, 0.0F, false);
			chica_head.setTextureOffset(48, 10).addBox(-1.9889F, 0.9532F, -3.8645F, 4.0F, 1.0F, 3.0F, 0.0F, false);
			chica_head.setTextureOffset(67, 42).addBox(-2.9889F, 1.4532F, -4.2645F, 6.0F, 1.0F, 4.0F, 0.0F, false);
			chica_head.setTextureOffset(36, 68).addBox(-0.9889F, 0.4532F, -3.5645F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			chica_head.setTextureOffset(74, 67).addBox(-2.7889F, -1.5468F, -1.5645F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			chica_head.setTextureOffset(12, 70).addBox(0.7111F, -1.5468F, -1.5645F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			chica_head.setTextureOffset(64, 32).addBox(0.7111F, -2.5468F, -1.5645F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			chica_head.setTextureOffset(58, 54).addBox(-2.7889F, -2.5468F, -1.5645F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			chica_head.setTextureOffset(22, 50).addBox(-4.4889F, -2.5468F, -1.0645F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			chica_head.setTextureOffset(48, 48).addBox(3.5111F, -2.5468F, -1.0645F, 1.0F, 7.0F, 8.0F, 0.0F, false);
			head_r8 = new ModelRenderer(this);
			head_r8.setRotationPoint(0.0111F, -4.5468F, 1.4355F);
			chica_head.addChild(head_r8);
			setRotationAngle(head_r8, 0.3054F, 0.0F, 0.0F);
			head_r8.setTextureOffset(49, 0).addBox(-1.0F, -1.1F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r9 = new ModelRenderer(this);
			head_r9.setRotationPoint(0.0111F, -4.5468F, 1.4355F);
			chica_head.addChild(head_r9);
			setRotationAngle(head_r9, -0.3054F, -1.5708F, 0.0F);
			head_r9.setTextureOffset(48, 40).addBox(0.5F, -1.8F, 1.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			head_r10 = new ModelRenderer(this);
			head_r10.setRotationPoint(0.0111F, -4.5468F, 1.4355F);
			chica_head.addChild(head_r10);
			setRotationAngle(head_r10, -0.3054F, 0.0F, 0.0F);
			head_r10.setTextureOffset(56, 17).addBox(-1.0F, -2.1F, 2.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
			right_leg.setTextureOffset(68, 48).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(24, 68).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			right_leg.setTextureOffset(16, 84).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(84, 3).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			right_leg.setTextureOffset(48, 0).addBox(-2.4F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
			left_leg.setTextureOffset(67, 32).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(62, 66).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
			left_leg.setTextureOffset(84, 0).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(83, 43).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			left_leg.setTextureOffset(30, 40).addBox(-2.6F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			bonnie_head.render(matrixStack, buffer, packedLight, packedOverlay);
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
