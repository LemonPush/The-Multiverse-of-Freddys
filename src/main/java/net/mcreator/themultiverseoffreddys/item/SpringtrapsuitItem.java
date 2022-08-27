
package net.mcreator.themultiverseoffreddys.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import net.mcreator.themultiverseoffreddys.itemgroup.FNaFExtrasItemGroup;
import net.mcreator.themultiverseoffreddys.UltimateFnafModModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@UltimateFnafModModElements.ModElement.Tag
public class SpringtrapsuitItem extends UltimateFnafModModElements.ModElement {
	@ObjectHolder("ultimate_fnaf_mod:springtrapsuit_helmet")
	public static final Item helmet = null;
	@ObjectHolder("ultimate_fnaf_mod:springtrapsuit_chestplate")
	public static final Item body = null;
	@ObjectHolder("ultimate_fnaf_mod:springtrapsuit_leggings")
	public static final Item legs = null;
	@ObjectHolder("ultimate_fnaf_mod:springtrapsuit_boots")
	public static final Item boots = null;

	public SpringtrapsuitItem(UltimateFnafModModElements instance) {
		super(instance, 90);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{3, 6, 8, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 20;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AgonyItem.block));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "springtrapsuit";
			}

			@Override
			public float getToughness() {
				return 1.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(FNaFExtrasItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedHead = new ModelSpringtrapsuit().Head;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "ultimate_fnaf_mod:textures/entities/springtrapsuit.png";
			}
		}.setRegistryName("springtrapsuit_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(FNaFExtrasItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new ModelSpringtrapsuit().Body;
				armorModel.bipedLeftArm = new ModelSpringtrapsuit().LeftArm;
				armorModel.bipedRightArm = new ModelSpringtrapsuit().RightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "ultimate_fnaf_mod:textures/entities/springtrapsuit.png";
			}
		}.setRegistryName("springtrapsuit_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(FNaFExtrasItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new ModelSpringtrapsuit().LeftLeg;
				armorModel.bipedRightLeg = new ModelSpringtrapsuit().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "ultimate_fnaf_mod:textures/entities/springtrapsuit.png";
			}
		}.setRegistryName("springtrapsuit_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(FNaFExtrasItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new ModelSpringtrapsuit().LeftBoot;
				armorModel.bipedRightLeg = new ModelSpringtrapsuit().RightBoot;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "ultimate_fnaf_mod:textures/entities/springtrapsuit.png";
			}
		}.setRegistryName("springtrapsuit_boots"));
	}

	// Made with Blockbench 4.2.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelSpringtrapsuit extends EntityModel<Entity> {
		private final ModelRenderer Head;
		private final ModelRenderer Head_r1;
		private final ModelRenderer Body;
		private final ModelRenderer Waist;
		private final ModelRenderer LeftArm;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftLeg;
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftBoot;
		private final ModelRenderer RightBoot;

		public ModelSpringtrapsuit() {
			textureWidth = 128;
			textureHeight = 128;
			Head = new ModelRenderer(this);
			Head.setRotationPoint(0.0F, 0.0F, 0.0F);
			Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			Head.setTextureOffset(40, 23).addBox(-3.0F, -3.0F, -6.0F, 6.0F, 3.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(0, 18).addBox(-0.5F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(26, 44).addBox(-3.5F, -12.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(16, 44).addBox(0.5F, -12.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
			Head.setTextureOffset(29, 33).addBox(1.0F, -6.0F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			Head.setTextureOffset(29, 33).addBox(-3.0F, -6.0F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);
			Head_r1 = new ModelRenderer(this);
			Head_r1.setRotationPoint(2.0F, -11.5F, 0.0F);
			Head.addChild(Head_r1);
			setRotationAngle(Head_r1, 0.6545F, 0.0F, 0.0F);
			Head_r1.setTextureOffset(44, 28).addBox(-1.5F, -2.8F, -0.9F, 3.0F, 3.0F, 2.0F, 0.0F, false);
			Head_r1.setTextureOffset(0, 0).addBox(-1.0F, -3.8F, -0.9F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			Head_r1.setTextureOffset(0, 49).addBox(-3.8F, -2.8F, -0.2F, 1.0F, 3.0F, 1.0F, 0.0F, true);
			Head_r1.setTextureOffset(0, 49).addBox(-5.2F, -2.8F, -0.2F, 1.0F, 3.0F, 1.0F, 0.0F, false);
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			Body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 9.0F, 4.0F, 0.0F, false);
			Body.setTextureOffset(4, 6).addBox(-0.5F, 3.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
			Waist = new ModelRenderer(this);
			Waist.setRotationPoint(0.0F, 10.5F, -1.0F);
			Body.addChild(Waist);
			Waist.setTextureOffset(24, 0).addBox(-4.0F, -1.5F, -1.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
			LeftArm.setTextureOffset(24, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			RightArm.setTextureOffset(0, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(16, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(32, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			LeftBoot = new ModelRenderer(this);
			LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
			LeftBoot.setTextureOffset(40, 15).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
			RightBoot = new ModelRenderer(this);
			RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
			RightBoot.setTextureOffset(32, 7).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Head.render(matrixStack, buffer, packedLight, packedOverlay);
			Body.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
			LeftBoot.render(matrixStack, buffer, packedLight, packedOverlay);
			RightBoot.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}
